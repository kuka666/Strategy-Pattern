
public class StrategyStarter {

	public static void main(String[] args) {
		IFlyingBehaviour nofly = new NoFlying();
		IQuackingBehavior loadquack = new LoadQuack();

		IFlyingBehaviour fly = new SimpleFlying();
		IQuackingBehavior squeek = new Squeek();

		Duck duck1 = new Duck(nofly, loadquack);
		duck1.performfly();
		duck1.quack();

		Duck duck2 = new Duck(fly, squeek);
		duck2.performfly();
		duck2.quack();
	}

}