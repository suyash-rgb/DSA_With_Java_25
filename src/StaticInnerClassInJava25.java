
static class Inner {
    public static void main(String[] args) {
        System.out.println("Static Inner Class");
    }
}

void main(String[] args) {
    Inner.main(args);
}
