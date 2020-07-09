
void setup() {
 
  // set the size of your sketch

size(300, 300);
}

void draw() {
  
   for(int i = 5; i > 0; i--)  {
    if(i%2== 0) {
     fill(#FC1205);
   ellipse(150, 150,i*20,i*20);
    }
    else{
    fill(#050505);
   ellipse(150, 150,i*20,i*20);
   }
   }
  //Starting with the largest ellipse, use a for loop to draw a bullseye with ellipses.
  
  //Use an if statement and modulo to alternate the color of your rings.
 
  
}
