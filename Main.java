public class Main {
    public static void main(String[] args) {
        Person sally = new Person("00000001", "Sally", "Williams", 2005);
        System.out.println(sally);

        sally.setLastName("Smith");
        System.out.println(sally);

    }
}