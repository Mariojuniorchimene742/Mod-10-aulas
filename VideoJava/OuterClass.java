public class OuterClass {
    public void inner() {
        class InnerClass {
            public void display() {
                System.out.println("inner class");
            }
        }

        InnerClass in = new InnerClass();
        in.display();
    }

    public static void main(String[] args) {
        OuterClass outer = new OuterClass();
        outer.inner();
    }
}