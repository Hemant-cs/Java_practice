

interface demoapp{
    void love();
//    void st(int a);
}

public class lamba {
    public static void main(String[] args) {

//        annonamus class

        demoapp da =  new demoapp() {
            @Override
            public void love() {
                System.out.println("Hemant");
            }

//            @Override
//            public void st(int a) {
//                System.out.println("Chaurasia "+a);
//            }
        };
        da.love();
//        da.st(5);


//        lambda Expression

        demoapp da1 = ()->{
            System.out.println("Hemant");
        };
        da1.love();
    }
}
