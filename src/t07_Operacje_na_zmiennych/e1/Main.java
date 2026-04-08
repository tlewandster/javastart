package t07_Operacje_na_zmiennych.e1;

public class Main {
    static void main(String[] args) {
        int x  = (int) (Math.random() * 100);
        int y  = (int) (Math.random() * 100);
        boolean result;
        System.out.println("x= "+x+" y= "+y);
        result = x > y;
        System.out.println("Czy x jest większe od y? " + result);
        result = (x * 2) > y;
        System.out.println("Czy x pomnożone przez 2 jest większe od y? " + result);
        result = (y < (x + 3)) && (y > (x - 2));
        System.out.println("Czy y jest mniejsze od sumy x+3 i jednocześnie większe od x pomniejszonego o 2? " + result);
        result = (x * y) % 2 == 0;
        System.out.println("Czy iloczyn liczb x i y jest parzysty? " + result);

    }
}
