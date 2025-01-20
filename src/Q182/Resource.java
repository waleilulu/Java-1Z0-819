package Q182;

public class Resource implements AutoCloseable {
    public Resource() {
        System.out.print("A");
    }

    @Override
    public void close() {
        System.out.print("B");
    }

    public void printResource() {
        System.out.print("C");
    }
}