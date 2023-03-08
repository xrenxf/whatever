package TBO;

import java.util.ArrayList;
import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class TypeData {
    private static enum Token {
        KONTINU("-?[0-9]+\\.[0-9]+"),
        NUMBER("-?[0-9]+"),
        PENJUMLAHAN("[+]"),
        PENGURANGAN("[-]"),
        PERKALIAN("[*]"),
        PEMBAGIAN("[/]"),
        MODULUS("[%]"),
        SAMADENGAN("[=]"),
        SKIP("[\n]"),
        STRING ("\"[a-zA-Z]*\""),
        VARIABLE("[a-z|a-z0-9|a-z[0-9]+\\.[0-9]|[,]|0-9a-z]+"),
        BOOLEAN(("TRUE|FALSE|true|false")),
        TIPEDATA("INTEGER|STRING|BOOLEAN|CHARACTER"),
        OPRASI("^|&|~|>>"),
        RELASI("!=|==|>|<");

        private final String pattern;

        private Token(String pattern) {
            this.pattern = pattern;
        }
    }


    private static class Word {
        private final Token token;
        private final String lexeme;

        private Word(Token token, String lexeme) {
            this.token = token;
            this.lexeme = lexeme;
        }

        @Override
        public String toString() {
            if(lexeme.equals("\n")){

            }else{
                return String.format("%-10s => [%s]", token.name(), lexeme);
            }

            return  String.format("%-10s => [%s]", token.name()," ");
        }
    }

    private static ArrayList<Word> lex(String input) {
        // The tokens to return
        ArrayList<Word> words = new ArrayList<>();

        // Lexer logic begins here
        StringBuilder tokenPatternsBuffer = new StringBuilder();
        for (Token token : Token.values()) {
            StringBuilder append = tokenPatternsBuffer.append(String.format("|(?<%s>%s)", token.name(), token.pattern));
        }
        Pattern tokenPatterns = Pattern.compile(tokenPatternsBuffer.substring(1));

        // Begin matching tokens
        Matcher matcher = tokenPatterns.matcher(input);
        while (matcher.find()) {
            for (Token token : Token.values()) {
                if (matcher.group(token.name()) != null) {
                    words.add(new Word(token, matcher.group(token.name())));
                }
            }
        }
        return words;
    }

    public static void main(String[] args) {
        String input = "INTEGER a = 8 \n BOOLEAN m = true";



        ArrayList<Word> words = lex(input);
        words.forEach(word -> {
            System.out.println(word);
        });
    }
}