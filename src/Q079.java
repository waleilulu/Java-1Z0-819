public class Q079 {
    Integer i = 11;
    
    //A
    //Double c = (Double) i;

    //B
    Double b = Double.valueOf(i);
    Double b2 = Double.valueOf(i.doubleValue());

    //C
    //Double a = i;

    //D
    //double e = Double.parseDouble(i);
    double e2 = Double.parseDouble(i.toString());

    //E
    double d = i;
    double d2 = i.doubleValue();
}

//B、E
/*
Which two statements compile? (Choose two.)
A. Double c = (Double) i;
B. Double b = Double.valueOf(i);
C. Double a = i;
D. double e = Double.parseDouble(i);
E. double d = i;
*/