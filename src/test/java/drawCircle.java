import processing.core.PApplet;

public class drawCircle {

    public static final int DIAMETER = 15;
    int xAxis;
    int yAxis;
    int speed;
    PApplet canvas;

    public drawCircle(PApplet pCanvas, int x, int y, int pSpeed) {
        xAxis = x;
        yAxis = y;
        canvas = pCanvas;
        speed = pSpeed;
    }

    public void draw() {
        canvas.ellipse(xAxis,yAxis, DIAMETER, DIAMETER);
        xAxis+=speed;
    }
}
