enum Status{
    BRONZE(5), SILVER(10), GOLD(15);
    private int rate;
    private Status(int rate){
        this.rate = rate;
    }
    public int getRate(){
        return rate;
    }

    //public static Status addStatus(int rate){
    public Status addStatus(int rate){    
        return new Status(20);
    }

    // public static Status addStatus(int rate){
    //     for (Status status : Status.values()) {
    //         if (status.getRate() == rate) {
    //             return status;
    //         }
    //     }
    //     throw new IllegalArgumentException("No status with rate " + rate);
    // }
}

public class Q180 {
    public static void main(String[] args) {
        Status silver = Status.SILVER;
        System.out.println(silver + silver.getRate());
        //System.out.println(silver.toString() + silver.getRate());


        Status platinum = Status.addStatus(20);
        System.out.println(platinum + platinum.getRate());
        //System.out.println(platinum.toString() + platinum.getRate());
    }
}

//B，取消註解可以編譯過
/*
What is the result?
A. An exception is thrown at runtime.
B. The compilation fails.
C. SILVER10 -
20
D. SILVER10 -
platinum20
E. SILVER10 -
PLATINUM20
*/