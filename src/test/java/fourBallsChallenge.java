import processing.core.PApplet;

public class fourBallsChallenge extends PApplet {

    drawCircle drawCircleOne = new drawCircle (this,0, 50, 1);
    drawCircle drawCircleTwo = new drawCircle(this,0,150, 2);
    drawCircle drawCircleThree = new drawCircle(this,0,250, 3);
    drawCircle drawCircleFour = new drawCircle(this,0,350, 4);

    public static void main(String[] args) {
        PApplet.main("fourBallsChallenge",args);
    }

    @Override
    public void settings() {
        super.settings();
        size(800,420);
    }

    @Override
    public void draw() {
        drawCircleOne.draw();
        drawCircleTwo.draw();
        drawCircleThree.draw();
        drawCircleFour.draw();
    }
}
