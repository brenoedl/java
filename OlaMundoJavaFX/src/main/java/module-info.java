module olamundojavafx.olamundojavafx {
    requires javafx.controls;
    requires javafx.fxml;

    opens olamundojavafx.olamundojavafx to javafx.fxml;
    exports olamundojavafx.olamundojavafx;
}
