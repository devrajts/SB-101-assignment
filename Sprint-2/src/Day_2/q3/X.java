package Day_2.q3;

@FunctionalInterface
public interface X {
    public int convertStringToNumber(String s);
}

class Main implements X{

    @Override
    public int convertStringToNumber(String s) {
        int num = Integer.parseInt(s);
        return num;
    }

    public static void main(String[] args) {
        Main m1 = new Main();
        System.out.println(m1.convertStringToNumber("450"));
    }
}
