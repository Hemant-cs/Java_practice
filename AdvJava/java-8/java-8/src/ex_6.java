import com.InvalidInputException;

import java.util.Scanner;


/**
 * @author Hemant
 * @see java Docs
 */

class InvalidInputExcption extends Exception{
    public String toString(){
        return "can't add 8 and 9";
    }
    public String getMessage(){
        return "I am get Message";
    }
}
class CannotDivideByZero extends Exception {
    public String toString() {
        return "can't Divide by 0";
    }
}

class MaxInputException extends Exception {
    public String toString() {
        return "Input Number can't be Greater than 100K";
    }
}

class MaxMalutiplierReachedException extends Exception {
    public String toString() {
        return "can't Multiply greater than 7K";
    }
}

class customCalculator{
    double add(int a , int b) throws InvalidInputExcption, MaxInputException{
        if(a > 100000 || b > 100000){
            throw new MaxInputException();
        }
        if (a == 8 || b == 9){
            throw new InvalidInputExcption();
        }
        return a+b;
    }
    double sub(int a , int b) throws MaxInputException {
        if(a > 100000 || b > 100000){
            throw new MaxInputException();
        }
        return a-b;
    }
    double mul(int a , int b) throws MaxMalutiplierReachedException {
        if(a > 7000 || b > 7000) {
            throw new MaxMalutiplierReachedException();
        }
        return a*b;
    }
    double div(float a , float b) throws CannotDivideByZero, MaxInputException  {
        if(a > 100000 || b > 100000){
            throw new MaxInputException();
        }
        if(b == 0){
            throw new CannotDivideByZero();
        }
        return a/b;
    }
}
public class ex_6 {
    public static void main(String[] args) throws CannotDivideByZero, InvalidInputExcption, MaxInputException,MaxMalutiplierReachedException{
//        custom calculator
        /*
        Exercise 6: You have to create a custom calculator with following operation :
        1. + -> Addition
        2. - -> Subtraction
        3. * -> Multiplication
        4. / -> Division
        which throws the following exceptions:
        1. Invalid input exception ex 8 and 9
        2. can not divide by 0 exception
        3. max input exception if any of the input is greater than 100000
        4. Max Multiplier reached exception - do not allow any multiplication input to be greater than 7000
         */

        customCalculator s = new customCalculator();
//        s.add(8,9);
//        s.div(3,0);
//        s.sub(5497757,4509430);
//        s.mul(45888,34985);



    }
}
