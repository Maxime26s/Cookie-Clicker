package upgrade;

import javafx.scene.control.Button;
import player.Player;

public class Reduction extends Upgrade{
    public Reduction() {
        cout=50;
        button=new Button("Réduction des couts: "+cout);
    }

    public void effet(Player player) {
        player.setReduction(player.getReduction()-0.05f);
    }
}
