package practice10;

public class EnumRunner {
    public static void main(String[] args) {
        Level oyun = Level.HIGH;

        switch (oyun){
            case LOW :
                System.out.println("Kolay bir oyun");
                break;
            case MEDIUM:
                System.out.println("Orta Seviye Oyun");
                break;
            case HIGH:
                System.out.println("Zor oyun");
                break;


        }
    }
}
