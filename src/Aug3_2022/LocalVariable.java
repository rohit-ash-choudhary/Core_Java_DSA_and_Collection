package Aug3_2022;

public class LocalVariable {
    int a=34;
    static int b=50;

    public static void main(String[] args) {
        LocalVariable obj=new LocalVariable();
        obj.add(obj.a, obj.b);


    }
    public void  add(int a, int b)
    {
        int c=34;
        System.out.println(a+b+c);

    }

}
