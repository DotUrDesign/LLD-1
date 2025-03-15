package org.example.java.Java.Prats_1_Lambdas_and_Streams.AnonymousClass;

public class Client {
    public static void main(String[] args) {
        // Anonymous class...

        // 1st case -
        SampleInterface si = new SampleInterface() {
            @Override
            public void fun() {
                System.out.println("Hello Fun");
            }
            @Override
            public void bun() {
                System.out.println("Hello Bun");
            }
        };

        si.bun();

        // 2nd case -
        Student st = new Student(){
            @Override
            public void fun() {
                System.out.println("Anonymous's Fun Method");
            }

            // Another method, if we include...
            public void bun() {
                System.out.println("Anonymous's Bun Method");
            }
        };

        st.fun();
//        st.bun();  ---> Even if "bun()" method is present, we can't invoke that method as this method is not present in the original Student class(it's not an overridden method).


    }
}
