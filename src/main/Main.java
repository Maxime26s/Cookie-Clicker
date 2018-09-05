package main;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.stage.Stage;
import player.Player;
import upgrade.*;

public class Main extends Application {
    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        Player player=new Player();

        primaryStage.setWidth(800);
        primaryStage.setHeight(800);
        primaryStage.setTitle("Cookie Clicker");
        primaryStage.setResizable(false);

        Label texte = new Label("Nombre de clics: ");
        texte.setTranslateX(350);
        texte.setTranslateY(650);

        Label clics = new Label("0");
        clics.setTranslateX(450);
        clics.setTranslateY(650);

        Button clicker = new Button();
        clicker.setScaleX(30);
        clicker.setScaleY(15);
        clicker.setTranslateX(400);
        clicker.setTranslateY(400);
        Upgrade[] upgradeList = {new Click(),new DoubleClick(), new Reduction()};
        for (int i = 0; i < upgradeList.length; i++) {
            if (i>=3){
                upgradeList[i].getButton().setTranslateX(650);
                upgradeList[i].getButton().setTranslateY(50*i-3+50);
            } else{
                upgradeList[i].getButton().setTranslateX(150);
                upgradeList[i].getButton().setTranslateY(50*i+50);
            }
        }
        Group root = new Group(texte, clics, clicker, upgradeList[0].getButton(), upgradeList[1].getButton(), upgradeList[2].getButton());

        primaryStage.setScene(new Scene(root));
        primaryStage.show();
    }
}
