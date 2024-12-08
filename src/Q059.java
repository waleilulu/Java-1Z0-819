import java.util.Collection;

public interface Q059 {
    public Iterable a();
}
public interface B extends Q059 {  
    public Collection a();    
}
public interface C extends Q059 {
    public Path a();
}
public interface D extends B,C{
    
}

//C，D 繼承了兩個介面：B 和 C，而這兩個介面都聲明了一個名為 a() 的方法，但它們的返回類型不同。
/*
Why does D cause a compilation error?
A. D does not define any method.
B. D inherits a() only from C.
C. D inherits a() from B and C but the return types are incompatible.
D. D extends more than one interface.
*/