package nestedClasses;

public class StaticInnerClass {

    private static String name;

    static class Inner {
        public void show() {
            System.out.println("Show method");
        }

        public static void main(String[] args) {
            System.out.println("Static Inner Class");
        }
    }

    public static void main(String[] args) {
        StaticInnerClass.Inner inner = new StaticInnerClass.Inner();
        inner.show(); // calling non-static metho of inner class

        Inner.main(args); // calling the static method of inner class
    }
}