package g48962.atl.asciipaint.controller;

import g48962.atl.asciipaint.model.AsciiPaint;
import g48962.atl.asciipaint.view.View;
import java.util.Scanner;

/**
 * This is the class Application.
 *
 * @author Michel
 */
public class Application {

    private AsciiPaint paint;
    private View view;

    /**
     * This is the constructor of Application
     * 
     * @param paint is the AsciiPaint
     * @param view is the view of AsciiPaint
     */
    public Application(AsciiPaint paint, View view) {
        this.paint = paint;
        this.view = view;
    }

    /**
     * This method allows to start the Application.
     */
    public void start() {
        Scanner clavier = new Scanner(System.in);
        String tmp;
        do {
            view.askCommand();
            tmp = clavier.nextLine();
            String[] stringTab = tmp.split(" ");
            view.commandEqualsShow(tmp);
            addShape(stringTab);
            moveShape(stringTab);
            removeShape(stringTab);
            setColor(stringTab);
        } while (!view.commandEqualsExit(tmp));
    }

    /**
     * This method allows to add a shape.
     * 
     * @param stringTab the string that the user enter.
     */
    public void addShape(String[] stringTab) {
        if (stringTab[0].equalsIgnoreCase("add")) {
            switch (stringTab[1]) {
                case "rectangle":
                    view.displayRectangle();
                    paint.newRectangle(Integer.parseInt(stringTab[2]), 
                            Integer.parseInt(stringTab[3]), 
                            Double.parseDouble(stringTab[4]), 
                            Double.parseDouble(stringTab[5]), 
                            stringTab[6].charAt(0));
                    break;
                case "circle":
                    view.displayCircle();
                    paint.newCircle(Integer.parseInt(stringTab[2]), 
                            Integer.parseInt(stringTab[3]), 
                            Double.parseDouble(stringTab[4]), 
                            stringTab[5].charAt(0));
                    break;
                case "square":
                    view.displaySquare();
                    paint.newSquare(Integer.parseInt(stringTab[2]), 
                            Integer.parseInt(stringTab[3]), 
                            Double.parseDouble(stringTab[4]), 
                            stringTab[5].charAt(0));
                    break;
                default:
                    view.defaultCommand();
            }
        }
    }

    /**
     * This method allows to move a shape.
     * 
     * @param stringTab the string that the user enter.
     */
    public void moveShape(String[] stringTab) {
        if (stringTab[0].equalsIgnoreCase("move")) {
            paint.moveShapeAt(Integer.parseInt(stringTab[1]), 
                    Integer.parseInt(stringTab[2]), 
                    Integer.parseInt(stringTab[3]));
        }
    }

    /**
     * This method allows to remove a shape.
     * 
     * @param stringTab the string that the user enter.
     */
    public void removeShape(String[] stringTab) {
        if (stringTab[0].equalsIgnoreCase("remove")) {
            paint.removeShapeAt(Integer.parseInt(stringTab[1]));
        }
    }

    /**
     * This method allows to change a color.
     * 
     * @param stringTab the string that the user enter.
     */
    public void setColor(String[] stringTab) {
        if (stringTab[0].equalsIgnoreCase("chcolor")) {
            paint.setColor(Integer.parseInt(stringTab[1]), stringTab[2].charAt(0));
        }
    }
}
