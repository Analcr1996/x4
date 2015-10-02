//// Exercise 4:  click button to change background.

int r,g,b;
float button1X=100, button1Y=100, button1W=80, button1H=40;
int counter=0;

//// SETUP:  size only.  Also set colors.
void setup() {
  size( 540, 480 );
  reset();
}
void reset() {
  r=  100;
  g=  200;
  b=  250;
}


//// NEXT:  button only.
void draw() {
  background( r,g,b );
  showButton( button1X, button1Y, button1W, button1H );
  fill(100,0,0);
  text( "Click me!", button1X+button1W/4, button1Y+button1H*2/3 );
}
// Draw the button.
void showButton( float x, float y, float w, float h ) {
  fill( 255, 183, 183 );
  ellipse(275, 228, 75, 75);
  
  //eye white
  fill(255);
  ellipse( 260, 220, 13, 13);
  //eye black
  fill(0);
  ellipse( 260, 220, 6, 6);
  //eye white
  fill(255);
  ellipse( 288, 220, 13, 13);
  //eye black
  fill(0);
  ellipse( 288, 220, 6, 6);
  //mouth
  fill(255);
  rect( 264, 237, 20, 10);
  //hat
  fill(0);
  ellipse(275,203,86,11);
  fill(0);
  rect(252, 162, 45,42);
  
}

//// HANDLERS:  keys & click
void keyPressed() {
  if (key == 'q') exit();
  if (key == 'r') reset();
}
void mousePressed() {
  if ( hit( mouseX,mouseY, 275, 228, 75, 75 ) ) {
    counter=  counter+1;
    int k = counter % 5;
    if(k == 1) {
      r=  255;
      g=  46;
      b=  46;
    } else if (k == 2) {
      r= 251;
      g= 46;
      b= 255;
    } else if (k == 2) {
      r= 251;
      g= 46;
      b= 255;
    } else if ( k == 3) {
      r= 81;
      g= 44;
      b= 255;
    } else if ( k == 4) {
      r= 44;
      g= 255;
      b= 236;
      reset();
    }
  }
}

//// OTHER METHODS:  detect "hit"
// Return true if "near"
boolean hit( float x1, float y1, float x2, float y2, float w, float h ) {
  boolean result;

  // +++++ STUB ALWAYS RETURNS TRUE!
  if ( abs(x1-x2) < w && abs(y1-y2)<h ) {
    result=  true;
  } else {
    result=false;
  }

  return result;
}
