package _02_introduction_to_polymorphism;

// Read through the program below including the comments.



public class Runner {
	public static void main(String[] args){

        class Parent{
                public Parent(){

                            System.out.println("Parent"); 

                }

                public void speak(){ 

                            System.out.println("Old");

                }

     }

    class Child extends Parent{ 

             public Child(){

                      super();

                      System.out.println("Child"); 

             }

             public void speak(){ 

                       super.speak();

                       System.out.println("New"); 

             }

    } 

   Parent par = new Parent(); 

   par.speak();
   Child child = new Child(); 

   child.speak(); 

}
}
