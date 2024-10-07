module com.cadastro_cliente {
    requires javafx.controls;
    requires javafx.fxml;

    opens com.cadastro_cliente to javafx.fxml;
    exports com.cadastro_cliente;
}
