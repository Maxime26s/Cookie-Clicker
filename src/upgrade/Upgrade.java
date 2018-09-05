package upgrade;

import javafx.scene.control.Button;
import player.Player;

public abstract class Upgrade {
    protected Button button;
    protected int cout;

    public void achat(Player player){
        if (player.getClick()>=(int)(cout*player.getReduction())){
            player.setClick((int)(player.getClick()-cout*player.getReduction()));
            cout=cout*2;
            effet(player);
        }
    }

    public abstract void effet(Player player);

    public Button getButton() {
        return button;
    }

    public void setButton(Button button) {
        this.button = button;
    }

    public int getCout() {
        return cout;
    }

    public void setCout(int cout) {
        this.cout = cout;
    }
}
