package view;

import model.Rect;
import util.data;

import javax.swing.*;

import java.awt.*;

public class gamepanel extends JPanel {

    public Rect[][] getRectmap;
    private  Rect[][] rectMap= new Rect[data.l][data.l];



    public gamepanel(){


    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);



        g.drawImage(data.imgbg,0,0,data.w,data.h,this);

        for(int i=0;i<rectMap.length;i++){
            for(int j=0;j<rectMap[i].length;j++){
                if(rectMap[i][j]!=null){
                    rectMap[i][j].draw(g);
                }
            }
        }




        g.setColor(Color.WHITE);
        for(int i=0;i<= data.l;i++){
            g.drawLine(data.START_X,data.START_Y+data.s*i,data.START_X+data.l*data.s,data.START_Y+data.s*i);
            g.drawLine(data.START_X+data.s*i,data.START_Y,data.START_X+data.s*i,data.START_Y+data.l*data.s);

        }


        try {
            Thread.sleep(1);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        repaint();
    }
}
