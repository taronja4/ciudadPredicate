import java.util.ArrayList;
import java.util.function.BiPredicate;
import java.util.function.Predicate;

public class maineo {
    public static void main(String[] args) {
        ArrayList<ciudad> xd=new ArrayList<>();
        ciudad ci=new ciudad("Matola",30000);
        ciudad ci2=new ciudad("Elche",300000);
        ciudad ci3=new ciudad("Rimbombante",3000);
        ciudad ci4=new ciudad("Embelesao",300000);

        xd.add(ci);
        xd.add(ci2);
        xd.add(ci3);
        xd.add(ci4);

        Predicate<ciudad> cokbo= c->c.getNombre().startsWith("E")&&c.getNumHabiitantes()>100000;
        xd.stream().filter(cokbo).forEach((n)-> System.out.println(n));

    }
}
