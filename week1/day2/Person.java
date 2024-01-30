package week1.day2;

public class Person {

	public String listenMusic() {
		System.out.println("Listening Music");
		return "80's song";
	}
	
	public boolean watchMovie() {
		System.out.println("Watching movie");
		return true;
	}
	
	public static void main(String[] args) {
		
     Person vidya =new Person();
     vidya.listenMusic();
     vidya.watchMovie();
     
    LearnMethods fn=new LearnMethods();
	/*
	 * System.out.println(fn.add()); int result=fn.add();
	 */
    //ctrl 2 l -->helps to get the return type of the function.
     fn.greet();
   
	}

}
