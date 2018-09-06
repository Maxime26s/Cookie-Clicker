package upgrade;

import javafx.scene.control.Button;
import player.Player;

public class Party extends Upgrade{

    public Party(Player player) {
        textButton="PARTY: ";
        cout=5000;
        button=new Button(textButton+(int)(cout*player.getReduction()));
        button.setOnAction(event -> {
            achat(player);
            cout=0;
            button.setText(textButton+cout);
        });
    }

    public void effet(Player player) {
        player.setParty(true);
    }
}
