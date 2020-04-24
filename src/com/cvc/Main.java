package com.cvc;

public class Main {

    public static void main(String[] args) {
        int[] numbers = {11, 10, 1,2,0,2,0,2,0,2,1,10, 11};
        cvcChallenge(numbers);

        int[] numbersNotPalindrome = {2, 10, 1,2,0,2,0,2,0,2,1,10, 11};
        cvcChallenge(numbersNotPalindrome);

    }

    public static void cvcChallenge(int[] numbers){
        int count = 0;
        int minValue = 99999;
        int j = numbers.length - 1; //Contador contrário
        boolean isPalindrome = true;

        for(int i = 0; i < numbers.length; i++){
            if(numbers[i] < minValue){
                count = 1;
                minValue = numbers[i];
            }
            else if(numbers[i] == minValue){
                count++;
            }
            if(i < j && isPalindrome && numbers[i] != numbers[j - i])
                isPalindrome = false;

        }

        System.out.println("O menor valor é: " + minValue );
        System.out.println("Aparece: " + count );
        System.out.println((isPalindrome) ? "É Palindromo" : "Não é Palindromo");
    }
}
