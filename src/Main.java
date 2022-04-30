public class Main {
    public static void main(String[] args) {
        System.out.println(walk(16,28));
        System.out.println(walk(35,20));
        System.out.println(walk(11,7));
        System.out.println(walk(70,20));
        System.out.println(walk(31,55));
    }
    public static String walk (int ageOfMan, int temperature){

        if (ageOfMan > 20 && ageOfMan <45 && temperature > -20 && temperature <30){
            return "Можно идти гулять";
        } else if (ageOfMan <20 && temperature > 0 && temperature < 28) {
            return "Можно идти гулять";
        } else if (ageOfMan >45 && temperature > -10 && temperature < 25) {
            return "Можно идти гулять";
        } else {
            return "Оставайтесь дома";
        }
    }

}