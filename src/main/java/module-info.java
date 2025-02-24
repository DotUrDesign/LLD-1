module org.example.concurrency {
    requires javafx.controls;
    requires javafx.fxml;


    opens org.example.concurrency to javafx.fxml;
    exports org.example.concurrency;
    exports org.example.concurrency.Multithreading;
    opens org.example.concurrency.Multithreading to javafx.fxml;
}