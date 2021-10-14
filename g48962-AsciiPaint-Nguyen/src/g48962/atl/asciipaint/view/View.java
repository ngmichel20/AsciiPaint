package g48962.atl.asciipaint.view;

import g48962.atl.asciipaint.model.AsciiPaint;
import java.util.Scanner;


/**
 * This is the view class of AsciiPaint.
 * 
 * @author Michel
 */
public class View {

    private AsciiPaint model;
    private Scanner scanner = new Scanner(System.in);

    /**
     * This is the view's constructor.
     * 
     * @param asciiPaint is the asciiPaint.
     */
    public View(AsciiPaint asciiPaint) {
        this.model = asciiPaint;
        this.scanner = new Scanner(System.in);
    }

    /**
     * This method ask to the user to enter a command.
     */
    public void askCommand(){
        System.out.println("Please enter a command : ");
    }
    
    /**
     * This method method shows the display of AsciiPaint.
     * 
     * @param tmp is the string.
     */
    public void commandEqualsShow(String tmp){
        if(tmp.equalsIgnoreCase("show")) {
                System.out.println(asAscii());
            }
    }
    
    /**
     * This method check if the user's string is same as "exit".
     * 
     * @param tmp is the user'string.
     * @return true if the string is "exit".
     */
    public boolean commandEqualsExit(String tmp){
        return (tmp.equalsIgnoreCase("exit"));
    }

    /**
     * This allows to display "Circle".
     */
    public void displayCircle(){
        System.out.println("Circle");
    }
    
    /**
     * This method allows to display "Rectangle".
     */
    public void displayRectangle(){
        System.out.println("Rectangle");
    }
    
    /**
     * This method allows to display "Square".
     */
    public void displaySquare(){
        System.out.println("Square");
    }
    
    /**
     * This method allows to display "Nothing to add"
     */
    public void defaultCommand(){
        System.out.println("Nothing to add");
    }
    
    /**
     * This method allows to display the drawing sheet.
     *
     * @return a string of the drawing sheet.
     */
    public String asAscii() {
        StringBuilder string = new StringBuilder();
        for (int i = 0; i < model.getHeight(); i++) {
            for (int j = 0; j < model.getWidth(); j++) {
                string.append(model.getColor(i, j)).append(" ");
            }
            string.append("\n");
        }
        return string.toString();
    }
}
