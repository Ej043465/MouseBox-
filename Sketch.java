import processing.core.PApplet;

public class Sketch extends PApplet {

// Declaration of RGB Float Variables
float r;
float g;
float b;

  public void settings() {
    size(400, 400);
  }

  public void setup() {
   background( random(0 ,255) ,
	              random(0 ,255),
								 random(0 ,255));

		// RGB background Floats Or Red Green Blue				 
	 r = random(0, 255);
   g = random(0, 255);
   b = random(0, 255);

println(r);
println(g);
println(b);
  }

  public void draw() {
    fill(random(0 ,255) ,
	              random(0 ,255),
								 random(0 ,255));

    rect(mouseX, mouseY, 25, 25);
  }
}