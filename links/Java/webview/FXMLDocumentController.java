package webview;

import java.awt.Desktop;
import javafx.fxml.FXML;
import javafx.scene.layout.AnchorPane;
import javafx.scene.web.WebEngine;
import javafx.scene.web.WebView;
import java.net.URI;


public class FXMLDocumentController {

    @FXML
    private WebView webView;

    public void initialize() {
        
        // Vincula o WebView às bordas do AnchorPane
        AnchorPane.setTopAnchor(webView, 0.0);
        AnchorPane.setBottomAnchor(webView, 0.0);
        AnchorPane.setLeftAnchor(webView, 0.0);
        AnchorPane.setRightAnchor(webView, 0.0);
        
        // Obtém o WebEngine associado ao WebView
        WebEngine webEngine = webView.getEngine();

        // Carrega uma URL
        webEngine.load("https://seven7707.github.io/DGames/");      

        // Alternativamente, você pode carregar conteúdo HTML diretamente:
        // webEngine.loadContent("<html><body><h1>Bem-vindo ao JavaFX WebView</h1></body></html>");
        
        // Observa mudanças no URL do WebEngine
        webEngine.locationProperty().addListener((observable, oldValue, newValue) -> {
            if (newValue.endsWith(".zip") || newValue.endsWith(".rar") || newValue.endsWith(".pdf")) {
                // Abre o link em um navegador ou aplicativo externo
                openDownloadInExternalApp(newValue);

                // Cancela o carregamento no WebView
                webEngine.getLoadWorker().cancel();
            }
        });
    }

    private void openDownloadInExternalApp(String fileUrl) {
        try {
            // Verifica se o ambiente suporta o Desktop (abre navegador ou app externo)
            if (Desktop.isDesktopSupported()) {
                Desktop desktop = Desktop.getDesktop();

                // Abre o link no navegador padrão ou no app associado
                desktop.browse(new URI(fileUrl));
 
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
