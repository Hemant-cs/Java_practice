class MyGeneric<T1> {
    int val;

    public MyGeneric(int val, T1 t1) {
        this.val = val;
        this.t1 = t1;
    }

    public int getVal() {
        return val;
    }

    public void setVal(int val) {
        this.val = val;
    }

    private T1 t1;

    public T1 getT1() {
        return t1;
    }

    public void setT1(T1 t1) {
        this.t1 = t1;
    }
}

public class generic {
    public static void main(String[] args) {
        MyGeneric<String> g = new MyGeneric(4,"Hemant");
        String str = g.getT1();
        System.out.println(str);
        int int1 = g.getVal();
        System.out.println(int1);

    }
}
