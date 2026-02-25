package IntroductionToJava.FunctionalProgramming;

// A Functional Interface is an interface that contains exactly one abstract method.

//Functional Interface
@FunctionalInterface
interface BookAction{
    void perform();
}

// Functional Interface with Parameters
@FunctionalInterface
interface Operation {
    int add (int a, int b);
};

public class FunctionalInterfaceDemo {
    public static void main(String[] args) {
        //(Without lambda fcn) : For using functional interface without lambda function, we need to override the abstract function in declaration
          BookAction action = new BookAction (){
              @Override
              public void perform() {
                  System.out.println("Action 1 performed");
              }
          };

          //(With lambda fcn)
          // parameter -> expression body
          // () -> {}
          BookAction action2 = () -> {
              System.out.println("Action 2 Performed");
          };

          //More compact version
          BookAction action3 = () -> System.out.println("Action 3 Performed");
          action.perform();
          action2.perform();
          action3.perform();

          Operation operation1 = (a,b)-> {
              return a+b;
          };
          System.out.println(operation1.add(10, 20));

          // THREAD INTERFACE
          new Thread (new Runnable(){
              @Override
              public void run(){
                  System.out.println("Thread 1 is created");
              }
          }).start();

          new Thread (()-> System.out.println("Thread 2 is created")).start();

    }

}
