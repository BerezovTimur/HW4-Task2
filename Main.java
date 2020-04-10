public class Main {
    public static void main(String[] args) {
       BmiService bmiService =new BmiService();
       float indexForEasy = bmiService.calculate(50,180);
       System.out.println("ИМТ: " + indexForEasy);
       float indexForMiddle = bmiService.calculate(80,180);
       System.out.println("ИМТ: " + indexForMiddle);
        float indexForHeavyWeight = bmiService.calculate(110,180);
        System.out.println("ИМТ: " + indexForHeavyWeight);
       float indexForVeryHeavyWeight = bmiService.calculate(150,180);
        System.out.println("ИМТ: " + indexForVeryHeavyWeight);
    }
}

