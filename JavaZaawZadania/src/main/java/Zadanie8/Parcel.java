package Zadanie8;

public class Parcel {
    private int xLength, yLength, zLength;
    private float weight;
    boolean isExpress;

    public Parcel(int xLength, int yLength, int zLength, float weight, boolean isExpress) {
        this.xLength = xLength;
        this.yLength = yLength;
        this.zLength = zLength;
        this.weight = weight;
        this.isExpress = isExpress;
    }


    public int getxLength() {
        return xLength;
    }

    public int getyLength() {
        return yLength;
    }


    public int getzLength() {
        return zLength;
    }


    public float getWeight() {
        return weight;
    }

    public boolean isExpress() {
        return isExpress;
    }

    public void setExpress(boolean express) {
        isExpress = express;
    }

}
