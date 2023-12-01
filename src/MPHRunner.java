class MPHRunner{
    private int distance; 
    private double minutes; 
    private double hours; 
    private double mph;
    double time;
  
    public MPHRunner(){
      setNums(0,0,0); // Sets the ints at the beginnig to 0,0,0
      mph=0.0; // sets mph to 0. 
    }
  
  
    public void setNums(int d, int h, int m){
      minutes = (double) m / 60; // Takes the int from Main and casts it to a double.
      distance = d;
      hours = h; 
  
    }
  
    public void calcMPH(){
      time = hours + minutes; // time is just adding hours + minutes should output as ex 1.23 
      mph = distance / time; // MPH = distance / time THANKS SCIENCE 10 
    }
  
  
    public void print(){
      System.out.println("You are going " + Math.round(mph) + "MPH"); // Outputs the MPH.
    }
  }