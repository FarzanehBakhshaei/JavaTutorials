// We want to make a row of bricks that is goal inches long. We have a number of small bricks(1 inch each) and big bricks(5 inches each).
// Return true if it is possible to make the goal by choosing from the given bricks. 
public boolean makeBricks(int small, int big, int goal) {
  /*
  // first solution
  if(small < 0 || big < 0) return false;
  
  if(goal == 0) return true;
  if(goal < 0) return false;
   

  return makeBricks(small-1, big, goal-1) || makeBricks(small, big-1, goal-5);
  */
  
  // another solution
  if (small+big*5<goal) return false;
  if (goal%5 > small) return false;
  
  return true; 
}
