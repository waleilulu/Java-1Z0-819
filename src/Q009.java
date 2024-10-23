public class Q009 {
    public static class Person {
        private String name;

        public Person(String name) {
            this.name = name;
        }

        public String toString() {
            return name;
        }
    }

    public static class Tester {
        public static void main(String[] args) {
            Person p = new Person("Joe");
            checkPerson(p);
            System.out.println("a: " + p); // 可以加入println 測試一下順序

            p = null;
            checkPerson(p);
            System.out.println("b: " + p); // 可以加入println 測試一下順序

        }

        public static Person checkPerson(Person p) {
            if (p == null) {
                p = new Person("Mary");
                System.out.println("c: " + p); // 可以加入println 測試一下順序，說明Mary不會被帶到main裡面
            } else {
                p = null; // 這裡的 p 不會影響到 main 中的 p
            }
            return p;

        }

    }
}
