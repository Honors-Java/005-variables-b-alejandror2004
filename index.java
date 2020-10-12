void setup() {
	size(500, 500);
}

void draw() {
// Step 1: Write code that draws the following screenshots 
// with hard-coded values. (Feel free to use colors 
// instead of grayscale.)

// Step 2: Replace all of the hard-coded numbers with 
// variables.

// Step 3: Write assignment operations in draw() that 
// change the value of the variables.
// For example, “variable1 = variable1 + 2;”. 

// Step 4: Make it so when the program runs the ball slides off the screen exiting at the point (500, 500)

int rectX = 30;
int rectY = 30;

int circleX = 130;
int circleY = 130;

  background(255);
  stroke(0);
  fill(0);
  
  rect(rectX, rectY, 200, 200);

fill(255, 255, 0);

  ellipse(circleX, circleY, 80, 80);
  

}