public class Main {
    public static void main(String[] args) {
        int bonusRubles;
        int balance  = 100;
        int payment = 1500;
        if (payment >= 1000){
            bonusRubles = payment / 100;
        }else {
            bonusRubles = 0;
        }
        int totalAccount = payment + balance + bonusRubles ;
        System.out.println(totalAccount);
    }

}
