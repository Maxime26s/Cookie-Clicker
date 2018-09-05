package upgrade;

import javafx.scene.control.Button;
import player.Player;

public class Click extends Upgrade{
    public Click() {
        cout=10;
        button=new Button("Amélioration de click: "+cout);
    }

    public void effet(Player player) {
        player.setClick(player.getClick()+1);
    }
}
