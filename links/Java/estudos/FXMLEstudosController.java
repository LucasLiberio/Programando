/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXML2.java to edit this template
 */
package estudos;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
//import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.web.WebEngine;
import javafx.scene.web.WebView;


/**
 *
 * @author Lucas
 */
public class FXMLEstudosController {
    
    //___________________________________________WebView____________________________________________________________
    @FXML
    private WebView webView;
    
    public void initialize(URL url, ResourceBundle rb) {
        // Obtém o WebEngine associado ao WebView
        WebEngine webEngine = webView.getEngine();

        // Carrega uma URL
        webEngine.load("https://www.google.com/");
    }    
    
    //___________________________________________Trocar a menssagem____________________________________________________________
    @FXML
    private Label lblMensagem /*id colocado no controle*/; //Controles do FXML
    //private Button btnClick;
    
    @FXML
    private void clicouBotao(ActionEvent event)/*clicouBotao é o nome do evento o resto é o comando de ação*/ {
        lblMensagem.setText("Olá, Mundo!");/*comando para a ação tem que ser colocados aqui dentro*/
    }
    
    //___________________________________________Somar dois valores____________________________________________________________
    @FXML
    private TextField txtN1;//pega o texto do primeiro elemento
    //private TextField txtOperador; //Pega o simbolo colocade (ainda não sei fazer com ele)
    private TextField txtN2;//pega o texto do segundo elemento
    //private Button btnSoma;// Botão para aparecer o resultado da operação, com evento chamado clicouResultou
    private Label lblResultado;// Mostrara ao apertar o botão o resultado da operação
    
    @FXML
    private void clicouResultou(ActionEvent event) /*Evento*/{
        int n1 = Integer.parseInt(txtN1.getText()); //n1 que é inteiro recebe o texto pego (.getText) que vem convertido para int usando integer.parseInt da string da caixa de texto com id txtN1
        //String simb = txtOperador.getText(); // Pega o operador escrito na caixa de texto com id txtOperador (não está sendo usado)
        int n2 = Integer.parseInt(txtN2.getText());//n2 que é inteiro recebe o texto pego (.getText) que vem convertido para int usando integer.parseInt da string da caixa de texto com id txtN2
        int s = n1 + n2; // s recebe a soma o int do n1 com o int do n2
        lblResultado.setText(Integer.toString(s)); // O texto que esta escrito na id lblResultado é trocado pelo valor de s convertido em string po Integer.toString
    }
    
    //___________________________________________Operadores Aritméticos e Classe Math____________________________________________________________
    @FXML
    private TextField txtNu;
    private TextField txtDen;
    private TextField lblDiv;
    private TextField lblResto;
    
    
    @FXML
    private void botaoDividir(ActionEvent event) {
        int n = Integer.parseInt(txtNu.getText());
        int d = Integer.parseInt(txtDen.getText());
        float div = n / d;
        float res = n % d;//Resto da divisão
        lblDiv.setText(Float.toString(div));
        lblResto.setText(Float.toString(res));
    }
    
    //___________________________________________Operadores Lógicos e Relacionais____________________________________________________________
    @FXML
    private TextField txtAno1;
    //private Button btnCalc1;
    private Label lblIdade1;
    private Label lblSituacao1;
    
    @FXML
    private void calculoIdade(ActionEvent event){
        int ano = Integer.parseInt(txtAno1.getText());
        int idade = 2025 - ano;
        lblIdade1.setText(Integer.toString(idade));
        String sit = ((idade>=16 && idade<18)||(idade>70))?"Opcional":"Obrigatório";
        lblSituacao1.setText(sit);
    }
    
    //___________________________________________Estruturas Condicionais (Parte 1)____________________________________________________________
    @FXML
    private TextField txtValor1;
    //private Button btnVerificar1;
    private Label lblResultado1;
    
    @FXML
    private void vVerificou1(ActionEvent event){
        int v = Integer.parseInt(txtValor1.getText());
        if (v%2==0) {
            lblResultado1.setText("PAR");
        } else {
            lblResultado1.setText("IMPAR");
        }
    }
    
    //___________________________________________Estruturas Condicionais (Parte 2)____________________________________________________________
    @FXML
    private TextField txtAno;
    private Label lblR;
    
    @FXML
    private void vVoto (ActionEvent event) {
        int a = Integer.parseInt(txtAno.getText());
        int i = 2025 - a;
        if (i < 16){
            lblR.setText("Não Vota");
        } else {
            if ((i>=16 && i<18) || (i>70)) {
                lblR.setText("Voto Opcional");
            } else {
                lblR.setText("Voto Obrigatório");
            }
        }
    }
    
    //___________________________________________Estruturas Repetição (Parte 1)____________________________________________________________
    @FXML
    private Label lblContagem;
    
    @FXML
    private void clicouContagem (ActionEvent event) {
        int cc = 0;
        String contagem = "";
        while (cc<5) {
            contagem += cc + " ";
            cc++;
        }
        lblContagem.setText(contagem);
    }
    
}
