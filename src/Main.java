public class Main {
    public static void main(String[] args) {
        MagicBox<Integer> boxInteger = new MagicBox<>(4);
        MagicBox<String> boxString = new MagicBox<>(5);
        MagicBox<Integer> boxError = new MagicBox<>(9);

        boxInteger.add(4);
        boxInteger.add(7);
        boxInteger.add(29);
        boxInteger.add(42);
        int b = boxInteger.pick();
        System.out.println("Рандомная циферка: " + b);

        boxString.add("Арбузиком");
        boxString.add("Дынькой");
        boxString.add("Черешенкой");
        boxString.add("Клубничкой");
        boxString.add("Малинкой");
        String a = boxString.pick();
        System.out.println("Летом ты обожрешься: " + a);

        boxError.add(1);
        boxError.add(2);
        boxError.add(3);
        int c = boxError.pick();
        System.out.println("Рандомная циферка: " + c);

    }
}
