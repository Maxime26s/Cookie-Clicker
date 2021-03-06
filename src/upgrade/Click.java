package upgrade;

import javafx.scene.control.Button;
import player.Player;

public class Click extends Upgrade{
    public Click(Player player) {
        textButton="Amélioration de click: ";
        cout=10;
        button=new Button(textButton+(int)(cout*player.getReduction()));
        button.setOnAction(event -> {
            achat(player);
            button.setText(textButton+(int)(cout*player.getReduction()));
        });
    }

    public void effet(Player player) {
        player.setClickValue(player.getClickValue()+1);
    }
}
