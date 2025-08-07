public class OperadoresRelacionais {
    public static void main(String[] args) {
        Boolean tresMaiorQueDois = 3 > 2;
        System.out.println("3 > 2 ? " + tresMaiorQueDois);

        Boolean tresMenorQueDois = 3 > 2;
        System.out.println("3 < 2 ? " + tresMenorQueDois);

        Boolean tresMaiorQueTres = 3 > 3;
        System.out.println("3 > 3 ? " + tresMaiorQueTres);

        Boolean tresMaiorOuIgualATres = 3 >= 3;
        System.out.println("3 >= 3 ? " + tresMaiorOuIgualATres);

        Boolean tresMenorOuIgualATres = 3 <= 3;
        System.out.println("3 <= 3 ? " + tresMenorOuIgualATres);

        Boolean doisIgualADois = 2 == 2;
        System.out.println("2 == 2 ? " + doisIgualADois);

        Boolean doisDiferenteDeDois = 2 != 2;
        System.out.println("2 != 2 ? " + doisDiferenteDeDois);
    }
}
