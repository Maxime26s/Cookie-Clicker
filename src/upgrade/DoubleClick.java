package upgrade;

import javafx.scene.control.Button;
import player.Player;

public class DoubleClick extends Upgrade{
    public DoubleClick(Player player) {
        textButton="Chance de double click: ";
        cout=50;
        button=new Button(textButton+(int)(cout*player.getReduction()));
        button.setOnAction(event -> {
            achat(player);
            button.setText(textButton+(int)(cout*player.getReduction()));
        });
    }

    public void effet(Player player) {
        player.setDoubleClick(player.getDoubleClick()+0.05f);
    }
}
