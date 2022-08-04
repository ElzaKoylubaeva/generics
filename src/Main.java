
public class Main {

    public static void main(String[] args) {
        MagicBox<String> magicBoxStr = new MagicBox<>(5);
        MagicBox<Integer> magicBoxInt = new MagicBox<>(10);

        magicBoxStr.add("Wand");
        magicBoxStr.add("Cauldron");
        magicBoxStr.add("Invisibility Cloak");
        magicBoxStr.add("Potion");
        magicBoxStr.print();
        try {
            magicBoxStr.pick();
        } catch (RuntimeException e) {
            System.err.println(e);
        }
        magicBoxStr.add("Goblet of Fire");
        magicBoxStr.print();
        System.out.println("Return: " + magicBoxStr.pick());

        magicBoxInt.add(9);
        magicBoxInt.add(8);
        magicBoxInt.add(7);
        magicBoxInt.add(6);
        try {
            magicBoxInt.pick();
        } catch (RuntimeException e) {
            System.err.println(e);
        }
        magicBoxInt.add(5);
        magicBoxInt.add(4);
        magicBoxInt.add(3);
        magicBoxInt.add(2);
        magicBoxInt.add(1);
        magicBoxInt.print();
        magicBoxInt.add(0);
        magicBoxInt.print();
        System.out.println("Return: " + magicBoxInt.pick());
    }
}
