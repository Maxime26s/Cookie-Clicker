package upgrade;

import javafx.scene.control.Button;
import player.Player;

import java.util.ArrayList;

public class Reduction extends Upgrade{
    public Reduction(Player player, ArrayList<Upgrade> upgradeList) {
        textButton="Réduction des couts: ";
        cout=100;
        button=new Button(textButton+cout);
        button.setOnAction(event -> {
            achat(player);
            button.setText(textButton+cout);
            for (int i=0;i<upgradeList.size();i++)
                upgradeList.get(i).button.setText(upgradeList.get(i).getTextButton()+(int)(upgradeList.get(i).getCout()*player.getReduction()));
        });
    }

    public void effet(Player player) {
        player.setReduction(player.getReduction()-0.05f);
    }
}
