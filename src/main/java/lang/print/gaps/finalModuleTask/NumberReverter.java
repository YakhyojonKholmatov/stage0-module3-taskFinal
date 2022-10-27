package lang.print.gaps.finalModuleTask;

public class NumberReverter {
    public void revert(int number) {
        int num3, num2, num1, temp,result; //123
        num3 = number % 10;  //3
        temp = (number-num3)/10; //12
        num2=temp%10; //2
        num1=(temp-num2)/10; //1
        result=num3*100+num2*10+num1;
        System.out.println(result);



    }
}
