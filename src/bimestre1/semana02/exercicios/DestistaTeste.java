package bimestre1.semana02.exercicios;

public class DestistaTeste {

    public static void main(String[] args) {

        Dentista d1 = new Dentista();
        Dentista d2 = new Dentista("Luiz Quirino Postingel", 38);
        Dentista d3 = new Dentista("Luiz Quirino Postingel", 38);

        System.out.println(d1.equals(d2));
        System.out.println(d2.equals(d3));
        System.out.println(d3.equals(d1));

        System.out.println(d1.hashCode());
        System.out.println(d2.hashCode());
        System.out.println(d3.hashCode());

        System.out.println(d1.toString());
        System.out.println(d2.toString());
        System.out.println(d3.toString());
    }
}
