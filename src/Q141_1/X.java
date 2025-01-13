package Q141_1;

import java.util.List;

abstract class X {
    protected final List items;
    protected X (List items){
        this.items = items;
    }
    protected abstract void doprocess();
    public void removeItem(String item){
        items.remove(item);
    }
}