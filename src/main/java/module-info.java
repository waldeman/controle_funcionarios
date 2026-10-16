module org.example.controle_funcionarios {
    requires javafx.controls;
    requires javafx.fxml;


    opens org.example.controle_funcionarios to javafx.fxml;
    exports org.example.controle_funcionarios;
}