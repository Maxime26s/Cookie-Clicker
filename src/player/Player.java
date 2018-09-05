package player;

public class Player {
    int click;
    float reduction;
    float doubleClick;

    public Player() {
        click = 1;
        reduction = 1;
        doubleClick = 0;
    }

    public int getClick() {
        return click;
    }

    public void setClick(int click) {
        this.click = click;
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


}
