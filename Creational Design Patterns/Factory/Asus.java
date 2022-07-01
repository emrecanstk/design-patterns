public class Asus implements Computer {

    @Override
    public void name() {
        System.out.println("Bilgisayarın Markası Asus");
    }

    @Override
    public void since(int year) {
        System.out.println(year + " senesinde alınmış.");
    }

}
