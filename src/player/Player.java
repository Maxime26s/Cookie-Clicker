package player;

import javafx.scene.control.Label;

public class Player {

    boolean party;
    int clicks;
    int clickValue;
    int totalClicks;
    float totalMultiplier;
    float reduction;
    float doubleClick;
    Label textClicks;

    public Player() {
        party=false;
        clicks=0;
        clickValue = 1;
        totalClicks = 0;
        totalMultiplier=0.0001f;
        reduction = 1;
        doubleClick = 0;
        textClicks = new Label("0");
    }

    public int getClicks() {
        return clicks;
    }

    public void setClicks(int clicks) {
        this.clicks = clicks;
    }

    public int getClickValue() {
        return clickValue;
    }

    public void setClickValue(int clickValue) {
        this.clickValue = clickValue;
    }

    public float getReduction() {
        return reduction;
    }

    public void setReduction(float reduction) {
        this.reduction = reduction;
    }

    public float getDoubleClick() {
        return doubleClick;
    }

    public void setDoubleClick(float doubleClick) {
        this.doubleClick = doubleClick;
    }

    public Label getTextClicks() {
        return textClicks;
    }

    public void setTextClicks(Label textClicks) {
        this.textClicks = textClicks;
    }

    public boolean isParty() {
        return party;
    }

    public void setParty(boolean party) {
        this.party = party;
    }

    public int getTotalClicks() {
        return totalClicks;
    }

    public void setTotalClicks(int totalClicks) {
        this.totalClicks = totalClicks;
    }

    public float getTotalMultiplier() {
        return totalMultiplier;
    }

    public void setTotalMultiplier(float totalMultiplier) {
        this.totalMultiplier = totalMultiplier;
    }
}
