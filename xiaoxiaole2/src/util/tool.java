package util;

import model.Rect;

import java.awt.*;

import java.util.Random;


public class tool {
    public static void ranMap(Rect[][] map){
        Image[]images={data.img1,data.img2,data.img3,data.img4};
        Random ran =new Random();
        for(int i = 0; i< map.length; i++){
            for(int j = 0; j< map[i].length; j++){
                map[i][j]=new Rect();
                int index=ran.nextInt(images.length);
                map[i][j].setImage(images[index]);
                map[i][j].setValue(index+1);

            }
        }
    }

    public static void updateMap(Rect[][] rects){
        for(int i=0;i<rects.length;i++){
            for(int j=0;j<rects[i].length;j++){
                rects[i][j].setX(data.START_X+data.s*j);
                rects[i][j].setY(data.START_Y+data.s*i);
            }
        }
    }

    public static void handMap(){

    }
}
