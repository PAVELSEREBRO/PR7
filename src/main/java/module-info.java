module com.example.pr7 {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.datatransfer;
    requires java.desktop;


    opens ru.mirea.gibo01.gui to javafx.fxml;
    exports gui;
}