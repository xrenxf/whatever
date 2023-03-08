package com.example.modul6;

import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.*;
import javafx.stage.Stage;

public class HelloApplication extends Application {
    public static void main(String[] args) { launch(args);}

    @Override
    public void start(Stage primaryStage) {
        GridPane grid = new GridPane();
        grid.setGridLinesVisible(false);
        grid.setAlignment(Pos.CENTER);
        grid.setVgap(20);
        grid.setHgap(20);

        Label judul = new Label("FORM BIODATA MAHASISWA");
        grid.add(judul, 0, 0, 2, 1);
        judul.setStyle("-fx-font: normal bold 17px 'Raleway Thin'");

        Label nama = new Label("Nama");
        grid.add(nama, 0, 1);
        TextField isiNama = new TextField();
        grid.add(isiNama, 1, 1);

        Label nim = new Label("NIM");
        grid.add(nim, 0, 2);
        TextField isiNim = new TextField();
        grid.add(isiNim, 1, 2);

        Label email = new Label("E-mail");
        grid.add(email, 0, 3);
        TextField isiEmail = new TextField();
        grid.add(isiEmail, 1, 3);
        Label at = new Label("@webmail.umm.ac.id");
        grid.add(at, 2, 3);

        Label fakultas = new Label("Fakultas");
        grid.add(fakultas, 0, 4);
        String[] listFakultas = {"Teknik", "Ilmu Sosial & Ilmu Politik", "Keguruan & Ilmu Pendidikan", "Ekonomi & Bisnis", "Pertanian-Peternakan"};
        ComboBox cbFakultas = new ComboBox(FXCollections.observableArrayList(listFakultas));
        cbFakultas.setValue("Fakultas");
        grid.add(cbFakultas, 1, 4);

        Label jurusan = new Label("Jurusan");
        grid.add(jurusan, 0, 5);
        ComboBox cbJur = new ComboBox();
        cbJur.setValue("Jurusan");
        cbJur.setMaxWidth(200);
        grid.add(cbJur, 1, 5);

        ComboBox<String> pilihjur = new ComboBox<>();
        cbFakultas.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                if (cbFakultas.getValue() == "Teknik") {
                    String[] listJurusan = {"Informatika", "Elektro", "Industri", "Sipil", "Mesin"};
                    pilihjur.setItems(FXCollections.observableArrayList(listJurusan));
                    pilihjur.setPromptText("FT");
                    pilihjur.setMaxWidth(200);
                    grid.add(pilihjur, 1, 5);
                } else if (cbFakultas.getValue() == "Ilmu Sosial & Ilmu Politik") {
                    String[] listJurusan = {"Kesejahteraan Sosial", "Ilmu Komunikasi", "Ilmu Pemerintahan", "Sosiologi", "Hubungan InternasionaL"};
                    pilihjur.setItems(FXCollections.observableArrayList(listJurusan));
                    pilihjur.setPromptText("FISIP");
                    pilihjur.setMaxWidth(200);
                    grid.add(pilihjur, 1, 5);
                } else if (cbFakultas.getValue() == "Keguruan & Ilmu Pendidikan") {
                    String[] listJurusan = {"Pend. Matematika", "Pend. Biologi", "Pend. Bahasa Indonesia", "Pend. Pancasila & Kewarganegaraan", "Pend Bahasa Inggris"};
                    pilihjur.setItems(FXCollections.observableArrayList(listJurusan));
                    pilihjur.setPromptText("FKIP");
                    pilihjur.setMaxWidth(200);
                    grid.add(pilihjur, 1, 5);
                } else if (cbFakultas.getValue() == "Ekonomi & Bisnis") {
                    String[] listJurusan = {"Manajemen", "Akuntansi", "Ekonomi Pembangunan", "Perbankan & Keuangan"};
                    pilihjur.setItems(FXCollections.observableArrayList(listJurusan));
                    pilihjur.setPromptText("FEB");
                    pilihjur.setMaxWidth(200);
                    grid.add(pilihjur, 1, 5);
                } else if (cbFakultas.getValue() == "Pertanian-Peternakan") {
                    String[] listJurusan = {"Agroteknologi", "Pertanian", "Teknologi Pangan", "Kehutanan", "Peternakan", "Perikanan"};
                    pilihjur.setItems(FXCollections.observableArrayList(listJurusan));
                    pilihjur.setPromptText("FPP");
                    pilihjur.setMaxWidth(200);
                    grid.add(pilihjur, 1, 5);
                }
            }
        });

        Label alamat = new Label("Alamat");
        grid.add(alamat, 0, 6);
        TextArea isiAlamat = new TextArea();
        isiAlamat.setMaxSize(200, 100);
        grid.add(isiAlamat, 1, 6);

        Label kota = new Label("Kota");
        grid.add(kota, 0, 7);
        TextField isiKota = new TextField();
        grid.add(isiKota, 1, 7);

        HBox hb1 = new HBox(10);
        hb1.setAlignment(Pos.BOTTOM_RIGHT);

        Button create = new Button("Create");
        create.setStyle("-fx-background-color: #28B463; -fx-text-fill: white; -fx-font: normal bold 'Raleway Thin';");

        Button close = new Button("Cancel");
        close.setStyle("-fx-background-color: #CB4335; -fx-text-fill: white; -fx-font: normal bold 'Raleway Thin';");

        hb1.getChildren().addAll(create, close);
        grid.add(hb1, 2, 10);

        Scene scene1 = new Scene(grid, 550, 500);

        //scene2
        VBox vb2 = new VBox(11);
        vb2.setPadding(new Insets(30, 100, 20, 100));

        Label data = new Label("Biodata Mahasiswa");
        Label hNama = new Label("Nama : ");
        Label hNim = new Label("NIM : ");
        Label hEmail= new Label("E-mail : ");
        Label hFak = new Label("Fakultas : ");
        Label hJur = new Label("Jurusan : ");
        Label hAlamat = new Label("Alamat : ");
        Label hKota= new Label("Kota : ");

        HBox hb2 = new HBox(11);
        hb2.setAlignment(Pos.BOTTOM_RIGHT);

        Button edit = new Button("Edit");
        edit.setStyle("-fx-background-color: #28B463; -fx-text-fill: white;");

        Button keluar = new Button("Close");
        keluar.setStyle("-fx-background-color: #CB4335 ; -fx-text-fill: white;");

        hb2.getChildren().addAll(edit, keluar);

        vb2.getChildren().addAll(data, hNama, hNim, hEmail, hFak, hJur, hAlamat, hKota, hb2);
        vb2.setStyle("-fx-font: normal bold 16px 'Raleway Thin'");
        Scene scene2 = new Scene(vb2, 500, 400);

        close.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                System.exit(0);
            }
        });

        create.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                if (isiNama.getText().isEmpty() || isiNim.getText().isEmpty() || isiEmail.getText().isEmpty() || isiAlamat.getText().isEmpty() || isiKota.getText().isEmpty()) {
                    Alert alert = new Alert(Alert.AlertType.NONE);
                    alert.setContentText("ANDA BELUM MEMASUKKAN BIODATA!!");
                    ButtonType cancelButtonType = new ButtonType("Cancel", ButtonBar.ButtonData.CANCEL_CLOSE);
                    alert.getDialogPane().getButtonTypes().add(cancelButtonType);
                    alert.showAndWait();
                }
                int x = 0;
                int y = 0;
                if (isiNim.getText().trim().matches("[0-9]*")) {
                    y++;
                }
                if (y == 0) {
                    Alert alert = new Alert(Alert.AlertType.INFORMATION);
                    alert.setHeaderText("FAILURE!!!");
                    alert.setContentText("NIM HARUS BERUPA ANGKA!!!");
                    alert.showAndWait();
                }
                primaryStage.setScene(scene2);

                hNama.setText("Nama : " +isiNama.getText());
                hNim.setText("NIM : " +isiNim.getText());
                hEmail.setText("Email : " +isiEmail.getText() + "@webmail.umm.ac.id");
                hFak.setText("Fakultas : " +cbFakultas.getSelectionModel().getSelectedItem());
                hJur.setText("Jurusan : " +pilihjur.getSelectionModel().getSelectedItem());
                hAlamat.setText("Alamat : " +isiAlamat.getText());
                hKota.setText("Kota : " +isiKota.getText());
            }
        });

        edit.setOnAction(new EventHandler<ActionEvent>(){
            @Override
            public void handle(ActionEvent event){
                primaryStage.setScene(scene1);
            }
        });

        keluar.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                System.exit(0);
            }
        });

        primaryStage.setScene(scene1);
        primaryStage.show();

    }
}
/*fxml = bahasa pada javafx
grid = kerangka untuk menyusun objek
gridpane = mengatur grid dan ukuran dari grid
label = teks
textfield = tempat buat input data
combobox = memilih opsu dari daftar drop-down
FXCollections.observableArrayList() = observer sebagai array list
PromptText = menginformasikan apa yang telah dipilih dari combo box
MaxWidth = maximal lebar
HBox = meletakkan objek pada baris horizontal
VBox = meletakkan objek pada baris vertikal
Alert = dialog peringatan/informasi yang ditampilkan sebelum eksekusi
Alignment = posisi objek
*/