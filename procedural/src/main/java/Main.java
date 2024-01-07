import processing.core.PApplet;
import java.util.List;

public class Main extends PApplet{
    public static final int  WIDTH= 640;
    public static final int HEIGHT = 480;
    public static final int RADIUS = 25;

    float x_axis = 0;

    public static void main(String[] args) {
        PApplet.main("Main",args);
    }
    @Override
    public void settings(){
        super.settings();
        size(WIDTH,HEIGHT);
    }

    @Override
    public void draw(){
        ellipse(x_axis, (float) HEIGHT /5, RADIUS, RADIUS);
        ellipse(x_axis*2, (float) 2*HEIGHT /5, RADIUS, RADIUS);
        ellipse(x_axis*3, (float) 3*HEIGHT /5, RADIUS, RADIUS);
        ellipse(x_axis*4, (float) 4*HEIGHT /5, RADIUS, RADIUS);
        x_axis+=2;
    }
}