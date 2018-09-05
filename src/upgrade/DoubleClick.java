package upgrade;

import javafx.scene.control.Button;
import player.Player;

public class DoubleClick extends Upgrade{
    public DoubleClick() {
        cout=50;
        button=new Button("Chance de double click: "+cout);
    }

    public void effet(Player player) {
        player.setDoubleClick(player.getDoubleClick()+0.05f);
    }
}
