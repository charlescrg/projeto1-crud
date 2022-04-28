package gui;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import java.util.function.Consumer;

import application.Main;
import gui.util.Alerts;
import gui.util.Constraints;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.MenuItem;
import javafx.scene.control.ScrollPane;
import javafx.scene.control.TextField;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import model.services.DepartmentService;

public class DepartmentFormController  implements Initializable{
		
		@FXML
		private TextField txtId;
		
		@FXML
		private TextField txtName;
		
		@FXML
		private Label labelErrorName;
		
		@FXML
		private Button btSave;
		
		@FXML
		private Button btCancel;
		
		@FXML
		public void onBtSaveAction() {
			System.out.println("save");
		};
		
			
		@FXML
		public void onBtCancelAction() {
			System.out.println("cancel");
		};

		@Override
		public void initialize(URL url, ResourceBundle rb) {
			initializeNodes();
			
		}

		private void initializeNodes() {
			Constraints.setTextFieldInteger(txtId);
			Constraints.setTextFieldMaxLength(txtName, 30);
				
		}}
		
		/*private synchronized <T> void loadView(String absoluteName, Consumer<T> initializingAction) {
			try {
				FXMLLoader loader = new FXMLLoader(getClass().getResource(absoluteName));
				VBox newVBox = loader.load();
				
				Scene mainScene = Main.getMainScene();
				VBox mainVBox = (VBox) ((ScrollPane) mainScene.getRoot()).getContent();
				
				Node mainMenu = mainVBox.getChildren().get(0);
				mainVBox.getChildren().clear();
				mainVBox.getChildren().add(mainMenu);
				mainVBox.getChildren().addAll(newVBox.getChildren());
				
				T controller = loader.getController();
				initializingAction.accept(controller);
				
			}
			catch(IOException e) {
				//e.printStackTrace();
				Alerts.showAlert("IOException", "ERRO", e.getMessage(), AlertType.ERROR);
			}
		}*/
		

	