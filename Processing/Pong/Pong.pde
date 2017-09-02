int ballX= 200;
int ballY=200;
int ballSpeedX=2;
int ballSpeedY=3;

void setup(){
  
size(500,500);
      
}

void draw(){
  background(106,50,90);
  ellipse(ballX,ballY, 20,20);
  fill(255,0,0);    
  stroke(255,0,0);  
  ballX=ballX+ballSpeedX;
  ballY=ballY+ballSpeedY;
  println(width);
  println(height);
  println(ballX);
  println(ballY);
  if(ballX>=500){
      ballSpeedX=-2;
     
  }
  if(ballY>=500){
     ballSpeedY=-3;
   
  }
  if(ballY<=0){
   ballSpeedY=2; 
  }
  if(ballX<=0){
   ballSpeedX=3; 
  } 
  
  rect(250, 450, 50, 20);
  
}
/*
3. Make the ball move across the screen (left to right).
  //make a variable for the ball's X position and change it in the draw method.

4. Change the speed of the ball.
  //make a variable for the speed of the ball in the X direction (from left to right).
  //changing this variable should change the speed of your ball

5. Bounce the ball off the walls.
  width
  println(output)
  
6. Do the same in the Y (up and down) direction.
  height

7. Make a sound when the ball falls on the ground.
  //drop the sound file onto your sketch

  import ddf.minim.*;       //at the very top of your sketch
  Minim minim;        //at the top of your sketch
  AudioSample sound;      //at the top of your sketch
  minim = new Minim (this);    //in the setup method
  sound = minim.loadSample("BD.mp3", 128);//in the setup method
  sound.trigger();        //in draw method (when the ball hits the bottom)

8. Add a background image for your game.
PImage backgroundImage;         //at the top of your sketch
backgroundImage = loadImage("image.jpg");  //in the setup method
image(backgroundImage, 0, 0);      //in draw method image(backgroundImage, 0, 0, width, height);    //if you want to resize

9. Draw a paddle at the bottom of the screen
  rect(x, y, width, height);

10. Make the paddle move over and back with the mouse.
  mouseX

11. Make the ball change Y direction when it hits the paddle. Figure it out by yourself, or use this method:
boolean intersects(int ballX, int ballY, int paddleX, int paddleY, int paddleLength) {
if (ballY > paddleY && ballX > paddleX && ballX < paddleX + paddleLength)
return true;
else 
return false;
}
*/

