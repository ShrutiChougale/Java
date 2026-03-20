class Outer {

    int outerData = 50;

        class Inner {
        void showInner() {
            System.out.println("Inner class accessing outer data: " + outerData);
        }
    }

    void showOuter() {
        System.out.println("Outer class method");
    }

    public static void main(String[] args) {

       
        Outer outerObj = new Outer();
        outerObj.showOuter();

        Outer.Inner innerObj = outerObj.new Inner();
        innerObj.showInner();
    }
}
