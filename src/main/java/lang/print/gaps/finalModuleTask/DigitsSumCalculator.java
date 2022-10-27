package lang.print.gaps.finalModuleTask;

public class DigitsSumCalculator {
    public void calculateSum(int number) {
        int num3, num2, num1,num0, temp,temp2,result; //1234
        num3 = number % 10;  //4
        temp = (number-num3)/10; //123
        num2=temp%10; //3
        temp2= (temp-num2)/10; //12
        num1=temp2%10; //2
        num0=(temp2-num1)/10;
        result=+num3+num2+num1+num0;
        System.out.println(result);
    }
}
