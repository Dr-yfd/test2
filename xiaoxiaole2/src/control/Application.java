package control;

import view.gamewindow;

public class Application {
    public static void run(){

        gamewindow win = new gamewindow();

        GameBarAction action=new GameBarAction(win);

        win.getItemStart().addActionListener(action);
        win.getItemAbout().addActionListener(action);
        win.getItemExit().addActionListener(action);
        win.getItemRe().addActionListener(action);

        win.setVisible(true);
    }
}
