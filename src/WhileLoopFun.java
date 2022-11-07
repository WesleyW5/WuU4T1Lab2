public class WhileLoopFun {

    public WhileLoopFun() {
    }
    public void printDigits(int number) {
    int num2 = number;
    int digits = 0;
    int divide = 10;

    while(num2 > 0){
        num2 = num2 / 10;
        digits ++;
    }
    while(digits != 0){
        double temp = (double) number / divide;
        int temp2 = ((int) temp) * divide;
        if(temp2 == 0){
            System.out.println(number);
        }else {
            System.out.println(number % temp2);
        }
        digits --;
        number = number / 10;
    }

    }

    public int countLetter(String word, String letter) {
        int length = word.length();
        int subString = 0;
        int num = 0;
        int subString2 = 1;
        while(length > 0){
            if(word.substring(subString, subString2).equals(letter)){
                num ++;
            }
            subString ++;
            subString2 ++;
            length --;
        }
        return num;
    }

    public int maxDoubles(int number, int threshold) {
        int total = 0;
        while(threshold >= number){
            number = number * 2;
            total ++;
        }
        if(total - 1 < 0){
            return 0;
        }else {
            return total - 1;
        }
    }


    public boolean isPrime(int number) {
        int num = 2;
    if(number == 1){
        return false;
    }else if(number == 2){
        return true;
    }
    while(num < number){
       if(number % num == 0){
           num = number + 1;
       }
       num ++;
    }
    if(num == number){
        return true;
    }
    return false;
    }
}

