public class Main {
    public static void main(String[] args) {
        Dados1 dadosInt = new Dados1(5, 10); 
        Dados1 dadosFloat = new Dados1(2.5f, 3.5f);

        System.out.println("Dados Inteiros: " + dadosInt.getA() + ", " + dadosInt.getB());
        System.out.println("Dados Float: " + dadosFloat.getC() + ", " + dadosFloat.getD());

        Adicao1 adicao = new Adicao1();
        
        int somaInt = adicao.addInt(dadosInt.getA(), dadosInt.getB());
        System.out.println("Soma de inteiros: " + somaInt);

        float somaFloat = adicao.addFloat(dadosFloat.getC(), dadosFloat.getD());
        System.out.println("Soma de floats: " + somaFloat);

        System.out.println(adicao.exibeInt(1, 2, 3)); 
        System.out.println(adicao.exibeFloat(1.1f, 2.2f, 3.3f)); 
    }
}
