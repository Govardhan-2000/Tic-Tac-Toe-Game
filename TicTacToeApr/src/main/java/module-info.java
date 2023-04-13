module com.example.tictactoeapr {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.tictactoeapr to javafx.fxml;
    exports com.example.tictactoeapr;
}