package main;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.paint.Color;
import javafx.stage.Stage;
import player.Player;
import upgrade.*;

import java.util.ArrayList;

public class Main extends Application {
    public static void main(String[] args) {
        launch(args);
    }

    public void start(Stage primaryStage) throws Exception {
        Group root = new Group();
        Scene scene = new Scene(root);

        Player player = new Player();


        primaryStage.setWidth(800);
        primaryStage.setHeight(800);
        primaryStage.setTitle("Cookie Clicker");
        primaryStage.setResizable(false);

        Label texte = new Label("Nombre de clics: ");
        texte.setTranslateX(350);
        texte.setTranslateY(650);
        root.getChildren().add(texte);

        player.getTextClicks().setTranslateX(450);
        player.getTextClicks().setTranslateY(650);
        root.getChildren().add(player.getTextClicks());

        Button clicker = new Button();
        clicker.setScaleX(30);
        clicker.setScaleY(15);
        clicker.setTranslateX(400);
        clicker.setTranslateY(400);
        clicker.setOnAction(event -> {
            player.setTotalClicks(player.getTotalClicks() + 1);
            player.setClicks(player.getClicks() + (int) (player.getClickValue() * (player.getTotalClicks() * player.getTotalMultiplier() + 1)));
            if (Math.random() < player.getDoubleClick())
                player.setClicks(player.getClicks() + (int) (player.getClickValue() * (player.getTotalClicks() * player.getTotalMultiplier() + 1)));
            if (player.isParty())
                scene.setFill(Color.rgb((int) (Math.random() * 256), (int) (Math.random() * 256), (int) (Math.random() * 256)));
            player.getTextClicks().setText(Integer.toString(player.getClicks()));
        });
        root.getChildren().add(clicker);

        ArrayList<Upgrade> upgradeList = new ArrayList<>();
        upgradeList.add(new Click(player));
        upgradeList.add(new DoubleClick(player));
        upgradeList.add(new TotalClicks(player));
        upgradeList.add(new Party(player));
        Upgrade tempReduction = new Reduction(player, upgradeList);
        upgradeList.add(tempReduction);

        for (int i = 0; i < upgradeList.size(); i++) {
            root.getChildren().add(upgradeList.get(i).getButton());
            if (i >= 3) {
                upgradeList.get(i).getButton().setTranslateX(500);
                upgradeList.get(i).getButton().setTranslateY(50 * (i - 3) + 50);
            } else {
                upgradeList.get(i).getButton().setTranslateX(150);
                upgradeList.get(i).getButton().setTranslateY(50 * i + 50);
            }
        }
        primaryStage.setScene(scene);
        primaryStage.show();
    }
}
