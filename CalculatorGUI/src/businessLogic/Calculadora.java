/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package businessLogic;

import java.util.Stack;

/**
 *
 * @author Anabel
 */
public class Calculadora {
    
    private static Stack<Float> resultStack = new Stack<Float>();
    
    private static void storeResult(Float a){
        resultStack.push(a);
    }
    
    public static float add(float a, float b)
    {
        storeResult(a+b);
        return a+b;
    }
    
    public static float substract(float a, float b)
    {
        storeResult(a-b);
        return a-b;        
    }
    
    public static float multiply(float a, float b)
    {
        storeResult(a*b);
        return a*b;        
    }
    
    public static float div(float a, float b)
    {
        if ( b == 0 ){
            storeResult(Float.NaN);
            return Float.NaN;
        }
        storeResult(a/b);
        return a/b;
    }
    
    public static void clearStoredResults(){
        resultStack.clear();
    }
    
    public static float back() throws NoMoreResultsException
    {
        
        if ( !resultStack.empty() ){
            float res = resultStack.pop();
            return res;
        }
        else{
            throw new NoMoreResultsException();
        }
        
    }
    
    private static boolean isInteger(float x){
        if ( x < 0 ){
            x *= -1;
        }
        return ( x == Math.ceil(x) );
    }
    
    public static float module (float a, float b)
    {
        if ( !isInteger(a) || !isInteger(b) ){
            storeResult(Float.NaN);
            return Float.NaN;
        }
        if ( b == 0 ){
            return Float.NaN;
        }
        return a%b;
    }
    
    public static float signo(float a)
    {
        storeResult(a*-1);
        return a*-1;
    }
    
    public static String coma(String texto) throws ComaException
    {
        if ( !texto.contains(".") ){
            return texto + '.';    
        }
        else{
            throw new ComaException();
        }
        
    }
    
    public static float tenPow(float a, float b)
    {
        storeResult(a*((float)Math.pow(10, b)));
        return a*((float)Math.pow(10, b));
    }
    
    public static float sqrt(float a)
    {
        if ( a<0 ){
            storeResult(Float.NaN);
            return Float.NaN;
        }
        storeResult((float)Math.sqrt(a));
        return (float)Math.sqrt(a);
        
    }
    
    public static float nFact(float a)
    {
        if ( !isInteger(a) ){
            storeResult(Float.NaN);
            return Float.NaN;
        }
        if (a == 0){
            storeResult(new Float(1));
            return 1;
        }
        float n = 1;
        if (a < 0){
            a = a*-1;
            n = -1;
        }
        for (int i=1;i<=a;i++){
            n=n*i;
        }
        storeResult(n);
        return n;
    }
    
    public static float log(float a)
    {
        if ( a <= 0 ){
            storeResult(Float.NaN);
            return Float.NaN;
        }
        storeResult((float)Math.log10(a));
        return (float)Math.log10(a);
    }
    
    public static float getLastResult() throws NoMoreResultsException{
        if ( !resultStack.empty() ){
            return resultStack.peek();
        }
        else{
            throw new NoMoreResultsException();
        }
    }
}
