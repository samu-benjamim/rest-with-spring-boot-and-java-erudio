package br.com.erudio.controllers;

import br.com.erudio.exception.UnsupportedMathOperationException;
import br.com.erudio.math.SimplesMath;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import static br.com.erudio.math.SimplesMath.*;
import static br.com.erudio.request.converters.NumberConverter.convertToDouble;
import static br.com.erudio.request.converters.NumberConverter.isNumeric;

@RestController
@RequestMapping ("/math")
public class MathController {

    SimplesMath math = new SimplesMath();

    //http://localhost:8080/math/sum/1/1
    @RequestMapping("/sum/{num1}/{num2}")
    public Double sum(@PathVariable("num1") String num1,@PathVariable("num2") String num2 ){
        if(isNumeric(num1) || isNumeric(num2)) throw  new UnsupportedMathOperationException("Please set a numeric value");
        return math.mathSum(convertToDouble(num1), convertToDouble(num2));
    }

    //http://localhost:8080/math/subtraction/1/1/
    @RequestMapping("/subtraction/{num1}/{num2}")
    public Double subtraction(@PathVariable("num1") String num1,@PathVariable("num2") String num2 ){
        if(isNumeric(num1) || isNumeric(num2)) throw  new UnsupportedMathOperationException("Please set a numeric value");
        return math.mathSubtraction(convertToDouble(num1), convertToDouble(num2));
    }

    //http://localhost:8080/math/multiplication/1/1/
    @RequestMapping("/multiplication/{num1}/{num2}")
    public Double multiplication(@PathVariable("num1") String num1,@PathVariable("num2") String num2 ){
        if(isNumeric(num1) || isNumeric(num2)) throw  new UnsupportedMathOperationException("Please set a numeric value");
        return math.mathMultiplication(convertToDouble(num1), convertToDouble(num2));
    }

    //http://localhost:8080/math/division/1/1/
    @RequestMapping("/division/{num1}/{num2}")
    public Double division(@PathVariable("num1") String num1,@PathVariable("num2") String num2 ){
        if(isNumeric(num1) || isNumeric(num2)) throw  new UnsupportedMathOperationException("Please set a numeric value");
        return math.mathDivision(convertToDouble(num1), convertToDouble(num2));
    }

    //http://localhost:8080/math/squad-root/144/
    @RequestMapping("/squad-root/{num1}")
    public Double squadRoot(@PathVariable("num1") String num1){
        if(isNumeric(num1)) throw  new UnsupportedMathOperationException("Please set a numeric value");
        return math.mathSquadRoot(convertToDouble(num1)) ;
    }

}
