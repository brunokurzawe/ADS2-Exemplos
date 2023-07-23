public class Main {

    public static void main(String[] args) {

        Secretaria secretaria = new Secretaria();
        secretaria.setBonus(500.00);
        secretaria.setHorasExtras(150.00);
        secretaria.setSalarioFamilia(200.00);
        secretaria.setSalarioContratual(3000.00);

        System.out.println(secretaria.getSalario());

    }

}












