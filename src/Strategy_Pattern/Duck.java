
public class Duck {
    IFlyingBehaviour fly;
    IQuackingBehavior quack;

    public Duck(IFlyingBehaviour fly, IQuackingBehavior quack) {
        this.fly = fly;
        this.quack = quack;

    }

    public void performfly() {
        fly.fly();
    }

    public void quack() {
        quack.quack();
    }

    public void display() {
    };

}