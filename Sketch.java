import processing.core.PApplet;

public class Sketch extends PApplet {
	
	
  /**
   * Called once at the beginning of execution, put your size all in this method
   */
  public void settings() {
	// put your size call here
    size(400, 400);
  }

  /** 
   * Called once at the beginning of execution.  Add initial set up
   * values here i.e background, stroke, fill etc.
   */
  public void setup() {
    background(0);
  }

  /**
   * Called repeatedly, anything drawn to the screen goes here
   */
  public void draw() {

    /*fill(255);
    rect(width/4, height/4, width/2, height/2);

    fill(255, 0, 0);
    rect(width/4, height/4, width/4, height/4);

    fill(0, 255, 0);
    rect(width/2, height/4, width/4, height/4);

    fill(0, 175, 255);
    rect(width/4, height/2, width/4, height/4);

    fill(255, 255, 0);
    rect(width/2, height/2, width/4, height/4);

    triangle(width/2, height/2, width/4, height/2, width/2, height/4);*/

    fill(255);
    rect(width/4, height/4, width/4, height/2);

    fill (255, 0, 0);
    triangle(width/4, height/4, width/2, height/4, width/2, height/8);

    fill(0, 255, 255);
    ellipse(width/2, height/3, width/5, height/5);
    
    
   
	//
    

  }
  
  // define other methods down here.
}