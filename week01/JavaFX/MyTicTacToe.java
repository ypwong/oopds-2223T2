import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.scene.control.Button;
import javafx.scene.layout.GridPane;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class MyTicTacToe extends Application {   // inheritance
  private boolean player1Turn = true;

  private Button[][] buttons = new Button[3][3]; // composition

  // start mwthod is incovked by launch method
  public void start(Stage primaryStage) {
    GridPane pane = new GridPane();
    for (int i = 0; i < 3; i++)
      for (int j = 0; j < 3; j++) {
        buttons[i][j] = new Button("");
        buttons[i][j].setStyle("-fx-font: 44 arial;");
        buttons[i][j].setPrefSize(100, 100);
        // invokes handleMouseClick method when the button is clicked.
        buttons[i][j].setOnAction(e -> handleMouseClick(e));
        pane.add(buttons[i][j], j, i);        // upcasting
      }

    Scene scene = new Scene(pane);
    primaryStage.setTitle("TicTacToe");       // set window/primaryStage's title 
    primaryStage.setScene(scene);
    primaryStage.setResizable(false);
    primaryStage.show();                      // show the primaryStage
  }

  private void handleMouseClick(ActionEvent e) {
    Button btn = (Button) e.getSource();      // downcasting
    if (btn.getText() == "") {
      if (player1Turn)
        btn.setText("O");
      else
        btn.setText("X");
      player1Turn = !player1Turn;
    }
  }

  public static void main(String[] args) {
    launch(args); // luanch method invokes start method.
  }
}
