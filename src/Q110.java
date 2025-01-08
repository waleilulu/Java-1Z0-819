class MyType<T>{
    private T value;
    public T getValue(){
        return value;
    }
    public void setValue(T value){
        this.value = value;
    }
}
public class Q110 {
    public static void main(String[] args) {
        MyType<String> strType = new MyType<>();
        MyType<Integer> intType = new MyType<>();
        MyType<?> type = intType;
        strType.setValue("test");
        type.setValue(1234);
        System.out.println(strType.getValue() + ":" + type.getValue());
    }
}

//E，type.setValue(1234); 這行代碼會導致編譯錯誤，因為 type 被定義為 MyType<?>，這樣它無法確定應該接受哪種類型的值，從而無法編譯通過。
/*
What is the result?
A. test:null
B. test:1
C. A ClassCastException is thrown at runtime.
D. null:null
E. The compilation fails.
*/