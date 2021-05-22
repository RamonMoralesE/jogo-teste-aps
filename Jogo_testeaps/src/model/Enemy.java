package model;

import java.awt.Image;
import java.awt.Rectangle;

import javax.swing.ImageIcon;

public class Enemy extends GameObject {

    private int x;
    private int y;

    private static final int LARGURA_TELA = 1024;
    private static final int VELOCIDADE = 1;

    public Enemy() {
    }

    public static int GerarPosX() {

        int aax = 456 + (int) (Math.random() * 1024);
        return aax;
    }

    public static int GerarPosY() {
        int aay = 10 + (int) (Math.random() * 768);

        return aay;
    }

    public void mexer() {
        if (this.x < 0) {
            this.x = GerarPosX();
            this.y = GerarPosY();
        } else {
            this.x -= VELOCIDADE;
        }
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }

    public Rectangle getBounds() {
        return new Rectangle(x, y, getLargura(), getAltura());
    }

}
