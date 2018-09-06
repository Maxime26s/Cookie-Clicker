package upgrade;

import javafx.scene.control.Button;
import player.Player;

public abstract class Upgrade {
    protected Button button;
    protected int cout;
    protected String textButton;

    public void achat(Player player){
        if (player.getClicks()>=(int)(cout*player.getReduction())){
            player.setClicks((int)(player.getClicks()-cout*player.getReduction()));
            player.getTextClicks().setText(Integer.toString(player.getClicks()));
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

    public String getTextButton() {
        return textButton;
    }

    public void setTextButton(String textButton) {
        this.textButton = textButton;
    }
}
