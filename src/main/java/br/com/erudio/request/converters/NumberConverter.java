package br.com.erudio.request.converters;

//import br.com.erudio.exception.UnsupportedMathOperationException;

public class NumberConverter {

    public static Double convertToDouble(String num) {
        String number = num.replace(",",".");
        if (number.matches("[-+]?[0-9]*\\.?[0-9]+")){
            return Double.parseDouble(number);
        }else{
            throw  new RuntimeException();
        }
    }


    public static boolean isNumeric(String num){
        if(num == null || num.isEmpty()){
            throw  new RuntimeException();
        }else {
            return false;
        }
    }
}
