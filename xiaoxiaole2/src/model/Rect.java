package model;

import util.data;

import java.awt.*;

public class Rect {
    private int x;
    private int y;
    private int value;
    private Image image;
    public Rect(){

    }
    public void draw(Graphics g){
        g.drawImage(image,x,y, data.s,data.s,null);
    }

    public Image getImage() {
        return image;
    }

    public void setImage(Image image) {
        this.image = image;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }
}
