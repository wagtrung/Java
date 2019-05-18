public class Box
    {
      private int height = 6;

      public void se(int height){
      this.height=height;
     } 
      public int getHeight(){
         return height;
     } 
    private int width = 8;
    public void setWidth(int width){
      this.width=width;
    } 
      public int getWidth(){
         return width;
    } 
    private int length= 10;
    public void setLength(int length){
      this.length=length;
    } 
      public int getLength(){
         return length;
    }
     private String color="Black";
     public void setColor(String color){
      this.color=color;
    } 
     public String getColor(){
      return color;
    }
    private int vol=length*width*height;
      public void setVol(int vol){
      this.vol=vol;

    }
    public int getVol(){
       return vol;
      }
  }