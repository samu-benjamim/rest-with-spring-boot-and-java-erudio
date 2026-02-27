package br.com.erudio.math;

public class SimplesMath {


    public Double mathSum(Double num1, Double num2 ){
        return num1 + num2;
    }

    public Double mathSubtraction( Double num1, Double num2 ){
        return num1 - num2;
    }

    public Double mathMultiplication( Double num1, Double num2 ){
            return num1 * num2;
    }

    public Double mathDivision( Double num1, Double num2 ){
        return num1 / num2;
    }

    public Double mathMean(Double num1, Double num2 ){
        return (num1 + num2) / 2 ;
    }

    public Double mathSquadRoot(Double num1){
        return Math.sqrt(num1) ;
    }
}
