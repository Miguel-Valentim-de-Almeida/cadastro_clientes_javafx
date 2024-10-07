package com.cadastro_cliente;
 
import javafx.fxml.FXML;
import javafx.scene.control.TextField;

public class TelaController {
    @FXML
    private TextField campoNome;
    @FXML
    private TextField campoCEP;
    @FXML
    private TextField campoRua;
    @FXML
    private TextField campoCidade;
    @FXML
    private TextField campoTelefone;
    @FXML
    private TextField campoNumero;
    @FXML
    private TextField campoEstado;
    
    private Cliente cliente;
    
    private Endereco endereco;
    
    private Buscador buscador;
    
    @FXML
    private void initialize () {
       cliente = new Cliente();
       endereco = new Endereco();
       buscador = new Buscador();
    }
    
    @FXML
    private void limpar () {
        campoNome.setText("");
        campoCEP.setText("");
        campoRua.setText("");
        campoCidade.setText("");
        campoTelefone.setText("");
        campoNumero.setText("");
        campoEstado.setText("");
    }
    @FXML
    private void gravar () {
        cliente.setNome(campoNome.getText());
        cliente.setTelefone(campoTelefone.getText());
        cliente.setEndereco(new Endereco(campoCEP.getText()));
    }
    @FXML
    private void venderUm () {
        maquinaCoxinha.venderCoxinha();
        campoEstoque.setText(String.valueOf(maquinaCoxinha.getEstoque()));
    }
    @FXML
    private void venderQtd () {
        maquinaCoxinha.venderCoxinha(Integer.parseInt(campoVenderQtd.getText()));
        campoEstoque.setText(String.valueOf(maquinaCoxinha.getEstoque()));
    }
}
