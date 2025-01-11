public class Q123 {
    public static void main(String[] args) {
        try {
            if("oracle".equals("ORACLE".toLowerCase())){
                throw new NoMatchException();
            }
        } catch (NoMatchException | NullPointerException npe) {
            System.out.println("Exception 1");
        } catch (RuntimeException e) {
            System.out.println("Exception 2");
        } catch (Exception e) {
            System.out.println("Exception 3");
        }finally {
            System.out.println("Finally Block");
        }
    }
    static class NoMatchException extends Exception {
        public NoMatchException() {
            super("No Match Exception");
        }
    }
}
//D，Exception 1 Finally Block

/*
How many lines of text does this program print?
A. four
B. one
C. three
D. two
*/