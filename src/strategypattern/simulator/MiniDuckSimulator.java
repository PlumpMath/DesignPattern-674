package strategypattern.simulator;

import strategypattern.duck.*;

public class MiniDuckSimulator {

    public static void main(String[] args) {

        MallardDuck mallard = new MallardDuck();
        RubberDuck rubberDuckie = new RubberDuck();
        DecoyDuck decoy = new DecoyDuck();
        ModelDuck model = new ModelDuck();

        mallard.toString();
        rubberDuckie.toString();
        decoy.toString();
        model.toString();

        mallard.performQuack();
        rubberDuckie.performQuack();
        decoy.performQuack();

        model.performFly();
        model.setFlyBehavior(new FlyRocketPowered());
        model.performFly();
    }
}
