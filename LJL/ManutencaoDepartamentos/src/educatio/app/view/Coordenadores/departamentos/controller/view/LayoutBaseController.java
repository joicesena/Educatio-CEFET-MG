package educatio.app.view.Coordenadores.departamentos.controller.view;

import educatio.app.view.Coordenadores.departamentos.controller.ManutencaoDepartamento;
import educatio.app.view.Coordenadores.departamentos.controller.ManutencaoDepto;

import java.io.IOException;
import java.net.URL;
import java.sql.SQLException;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TextField;
import javafx.stage.Stage;


public class LayoutBaseController implements Initializable {
    
    private ManutencaoDepto manutencaoDepto;
    ManutencaoDepartamento manDep = new ManutencaoDepartamento();
    
    private TextField info;
    private Stage thisStage;
    
    
    public void setManutencaoDepto(ManutencaoDepto manutencaoDepto){
        this.manutencaoDepto=manutencaoDepto;
    }
    
    @FXML
    private void handleCriarAction(ActionEvent event) throws SQLException, IOException {
        manutencaoDepto.invocaLayoutCriar();
        
    }
    
    @FXML
    private void handleAlterarAction(ActionEvent event) throws IOException, SQLException {
        manutencaoDepto.invocaVerificaCampi(1);
        
    }
    
    @FXML
    private void handleExcluirAction(ActionEvent event) throws IOException, SQLException {
        manutencaoDepto.invocaVerificaCampi(2);
        
    }
    
    @FXML
    private void handleTransferirAlction(ActionEvent event) throws IOException, SQLException {
        manutencaoDepto.invocaVerificaCampi(3);
        
    }
    
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }
    
    void setInfo (String info){
        this.info.setText(info);
    }

    /**
     * @param thisStage the thisStage to set
     */
    public void setThisStage(Stage thisStage) {
        this.thisStage = thisStage;
    }
    
}
