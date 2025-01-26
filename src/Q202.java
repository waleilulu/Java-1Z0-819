import java.util.Collection;
import java.util.List;
import java.util.ArrayList;
import java.util.stream.Stream;

public class Q202 {

    // 父類 Foo
    public static class Foo {
        public <T> Collection<T> foo(Collection<T> arg) {
            System.out.println("Foo: Original method");
            return arg;
        }
    }

    // 子類 Bar
    public static class Bar extends Foo {
        // 測試選項 A
        // public Collection foo(Collection arg) { ... }
        // public Collection foo(Collection arg) {
        //     System.out.println("Bar: Non-generic method with Collection parameter");
        //     return arg;
        // }

        // 測試選項 B
        // public Collection foo(Stream arg) { ... }
        public Collection foo(Stream arg) {
            System.out.println("Bar: Overloaded method with Stream parameter");
            return null;
        }

        // 測試選項 C
        // public Iterable foo(Collection arg) { ... }
        // public Iterable foo(Collection arg) {
        //     System.out.println("Bar: Method with Iterable return type");
        //     return arg;
        // }

        // 測試選項 D
        // public Collection bar(Collection arg) { ... }
        // public Collection bar(Collection arg) {
        //     System.out.println("Bar: Method named bar with Collection parameter");
        //     return arg;
        // }

        // 測試選項 E
        // public List foo(Collection arg) { ... }
        @Override
        public <T> List<T> foo(Collection<T> arg) {
            System.out.println("Bar: Overridden method with List return type");
            return new ArrayList<>(arg);
        }

        // 測試選項 F
        // public Collection foo(Collection arg) { ... }
        // public Collection foo(Collection arg) {
        //     System.out.println("Bar: Another method with Collection parameter (non-generic)");
        //     return arg;
        // }
    }

    // 測試類
    public static void main(String[] args) {
        Bar bar = new Bar();

        // 測試 A
        // Collection<String> collection = new ArrayList<>();
        // bar.foo(collection); // 測試選項 A 是否覆蓋 Foo 的 foo 方法

        // 測試 B
        Stream<String> stream = Stream.of("a", "b", "c");
        bar.foo(stream); // 測試選項 B 是否重載 Foo 的 foo 方法

        // 測試 C
        // bar.foo((Iterable) collection); // 測試選項 C 的覆蓋或重載行為

        // 測試 D
        // bar.bar(collection); // 測試選項 D 是否作為新方法存在

        // 測試 E
        List<String> list = new ArrayList<>();
        bar.foo(list); // 測試選項 E 是否覆蓋 Foo 的 foo 方法

        // 測試 F
        // bar.foo((Object) collection); // 測試選項 F 的行為
    }
}



// B、E
/*
Which two statements are true if the method is added to Bar? (Choose two.)
A. public Collection foo (Collection arg) { ... } overrides Foo.foo.
B. public Collection foo(Stream arg) { ... } overloads Foo.foo.
C. public Iterable foo{Collection arg) { ... } overrides Foo.foo.
D. public Collection bar(Collection arg) { ... } overloads Foo.foo.
E. public List foo (Collection arg) { ... } overrides Foo.foo.
F. public Collection foo(Collection arg) { ... } overloads Foo.foo.
*/