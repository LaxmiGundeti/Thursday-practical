//create an interface called "Playable" with a method called "Play".create two classes called "song" and "video" that implement
// the "Play" method. create objects of  both the song and video classes and call their respective "Play" methods.
interface Playable
 {
     public void play();
 }
 class Song implements Playable
 {
    public void play()
	{
	     System.out.println("This is song play method");
	}
 }
class Video implements Playable
{
     public void play()
	 {
	      System.out.println("This is video play method");
	 }
}
class UsePlayable
{
    public static void main(String args[])
	{
	     Song s1=new Song();
		 s1.play();
		 Video v1=new Video();
		 v1.play();
	}
}
    