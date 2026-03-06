public class InterfaceSegeragation {
}

// Clients should not be forced to use the methods they dont need
// segregate capabilities

// interface Worker{
// public void eat();
// public void work();
// }

// class Robot implements Worker{

// @Override
// public void eat() {
// throw new UnsupportedOperationException("Robots dont eat");
// }

// @Override
// public void work(){
// System.out.println("Robot is working");
// }
// }

// as we can see on the top Robot class dont need the eat and its a capability
// so we can segegrate

interface Workable {
    public void work();
}

interface Eatable {
    public void eat();
}

class Robot implements Workable {

    @Override
    public void work() {
        System.out.println("Robot is working...");
    }

}

class HumanWorker implements Workable, Eatable {
    @Override
    public void eat() {
       System.out.println("eating");
    }

    @Override
    public void work() {
        System.out.println("working");
    }
}
