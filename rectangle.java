public class rectangle{
  public static void main(String[] args){
   int height=5,width=4;
   myrectangle s=new myrectangle();
   myrectangle c=new myrectangle();
   s.height=height;
   s.width=width;
   c.height=height;
   c.width=width;
   System.out.println(s.getarea());
   System.out.print(c.getPermeter());
  } 
}

class myrectangle{
	public int height,width;
	
	public int getarea(){
		return height*width;
		
		}
	public int getPermeter(){
		return (2*(height+width));}
		
}