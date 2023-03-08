package com.example.modul6easy;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.control.*;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.Scene;
import javafx.scene.control.Alert.AlertType;
import javafx.stage.Stage;


public class HelloApplication extends Application {
    public static void main(String[] args) {
        launch();
    }

    @Override
    public void start(Stage primaryStage) throws Exception {


        GridPane g = new GridPane();
        g.setGridLinesVisible(false);
        g.setAlignment(Pos.CENTER);
        g.setVgap(5);
        g.setHgap(5);

        //Judul
        Label judul = new Label("BIODATA MAHASISWA");
        g.add(judul, 0, 0);
        judul.setStyle("<font-family>: 17 bold");

        //Nama
        Label nama = new Label("Nama :");
        g.add(nama, 0, 1);
        TextField Inama = new TextField();
        g.add(Inama, 1, 1);

        //NIM
        Label nim = new Label("NIM :");
        g.add(nim, 0, 2);
        TextField Inim = new TextField();
        g.add(Inim, 1, 2);

        //Email
        Label email = new Label("Email :");
        g.add(email, 0, 3);
        TextField Iemail = new TextField();
        g.add(Iemail, 1, 3);

        //Alamat
        Label alamat = new Label("Alamat :");
        g.add(alamat, 0, 4);
        TextField Ialamat = new TextField();
        g.add(Ialamat, 1, 4);

        //Kota
        Label kota = new Label("Kota :");
        g.add(kota, 0, 5);
        TextField Ikota = new TextField();
        g.add(Ikota, 1, 5);

        //Fakultas
        Label fakultas = new Label("Fakultas :");
        g.add(fakultas, 0, 6);
        TextField Ifakultas = new TextField();
        g.add(Ifakultas, 1, 6);

        //Jurusan
        Label jurusan = new Label("Jurusan :");
        g.add(jurusan, 0, 7);
        TextField Ijurusan = new TextField();
        g.add(Ijurusan, 1, 7);


        HBox h1 = new HBox(7);
        h1.setAlignment(Pos.BASELINE_CENTER);

        Button lanjut = new Button("Lanjut");
        lanjut.setStyle("-fx-background-color: green; -fx-text-fill: white; font-family: normal bold 'Raleway Thin';");

        Button keluar = new Button("Keluar");
        keluar.setStyle("-fx-background-color: red; -fx-text-fill: white; font-family: normal bold 'Raleway Thin';");

        h1.getChildren().addAll(lanjut, keluar);
        g.add(h1, 2, 9);

        Scene s1 = new Scene(g, 550, 500);

        VBox v2 = new VBox(15);
        v2.setPadding(new Insets(35, 100, 20, 100));

        Label hasil = new Label("DATA MAHASISWA");
        Label hnama = new Label("Nama           : ");
        Label hnim = new Label("NIM             : ");
        Label hemail = new Label("Email         : ");
        Label halamat = new Label("Alamat       : ");
        Label hkota = new Label("Kota           : ");
        Label hfakultas = new Label("Fakultas   : ");
        Label hjurusan = new Label("Jurusan     : ");

        HBox h2 = new HBox(9);
        h2.setAlignment(Pos.BOTTOM_CENTER);

        Button balik = new Button("Kembali");
        balik.setStyle("-fx-background-color: red; -fx-text-fill: white;");

        Button selesai = new Button("Selesai");
        selesai.setStyle("-fx-background-color: green; -fx-text-fill: white;");

        h2.getChildren().addAll(balik, selesai);

        v2.getChildren().addAll(hasil, hnama, hnim, hemail, halamat, hkota, hfakultas, hjurusan, h2);
        v2.setStyle("-fx-gont: normal, bold 16px 'Raleway Thin'");
        Scene s2 = new Scene(v2, 550, 450);

        keluar.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                System.exit(0);
            }
        });

        lanjut.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                if (Inama.getText().isEmpty() || Inim.getText().isEmpty() || Iemail.getText().isEmpty() || Ijurusan.getText().isEmpty() || Ialamat.getText().isEmpty() || Ikota.getText().isEmpty()) {
                    Alert alert = new Alert(Alert.AlertType.NONE);
                    alert.setContentText("ANDA BELUM MEMASUKKAN BIODATA!!");
                    ButtonType cancelButtonType = new ButtonType("Cancel", ButtonBar.ButtonData.CANCEL_CLOSE);
                    alert.getDialogPane().getButtonTypes().add(cancelButtonType);
                    alert.showAndWait();
                }
                int x = 0;
                int y = 0;
                if (Inim.getText().trim().matches("[0-9]*")) {
                    y++;
                }
                if (y == 0) {
                    Alert alert = new Alert(AlertType.INFORMATION);
                    alert.setHeaderText("FAILURE!!!");
                    alert.setContentText("NIM HARUS BERUPA ANGKA!!!");
                    alert.showAndWait();
                }
                primaryStage.setScene(s2);

                hnama.setText("Nama        : " + Inama.getText());
                hnim.setText("NIM          : " + Inim.getText());
                hemail.setText("Email         : " + Iemail.getText() + "@webmail.umm.ac.id");
                halamat.setText("Alamat       : " + Ialamat.getText());
                hkota.setText("Kota           : " + Ikota.getText());
                hjurusan.setText("Fakultas    : " + Ijurusan.getText());
                hfakultas.setText("Jurusan     : " + Ifakultas.getText());

            }
        });

        balik.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                primaryStage.setScene(s1);
            }
        });

        selesai.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                System.exit(0);
            }
        });

        primaryStage.setScene(s1);
        primaryStage.show();

    }
}