public class Main {
    public static void main(String[] args) {
        CoffeLover coffeLover = new CoffeLover();

        coffeLover.addMachine(new SimpleCoffeMachine());
        coffeLover.addMachine(new ComplexCoffeMachine());
        coffeLover.addMachine(new ComplexCoffeMachine());
        coffeLover.addMachine(new SimpleCoffeMachine());

        coffeLover.makeCoffe();
    }
}
