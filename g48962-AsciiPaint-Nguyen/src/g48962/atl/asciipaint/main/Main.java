package g48962.atl.asciipaint.main;

import g48962.atl.asciipaint.controller.Application;
import g48962.atl.asciipaint.model.AsciiPaint;
import g48962.atl.asciipaint.view.View;

/**
 * This is the main class.
 * 
 * @author Michel
 */
public class Main {

    /**
     * This is the main method.
     * 
     * @param args a String.
     */
    public static void main(String[] args) {
        AsciiPaint paint = new AsciiPaint();
        View view = new View(paint);
        Application controller = new Application(paint, view);
        controller.start();
    }
}
