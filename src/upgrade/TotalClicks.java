package upgrade;

import javafx.scene.control.Button;
import player.Player;

public class TotalClicks extends Upgrade{

    public TotalClicks(Player player) {
        textButton="Multiplicateur de click total: ";
        cout=25;
        button=new Button(textButton+(int)(cout*player.getReduction()));
        button.setOnAction(event -> {
            achat(player);
            button.setText(textButton+(int)(cout*player.getReduction()));
        });
    }

    public void effet(Player player) {
        player.setTotalMultiplier(player.getTotalMultiplier()+0.0001f);
    }
}
