/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package businessLogic;

/**
 *
 * @author Anabel
 */
public class Calculadora {
    
    public static float add(float a, float b)
    {
        return a+b;
    }
    
    public static float substract(float a, float b)
    {
        return a-b;
    }
    
    public static float multiply(float a, float b)
    {
        return a*b;
    }
    
    public static float div(float a, float b)
    {
        return a/b;
    }
    
    public static String back()
    {
        return "";
    }
    
    public static float module (float a, float b)
    {
        return a%b;
    }
    
    public static float signo(float a)
    {
        return a*-1;
    }
    
    public static char coma()
    {
        return ',';
    }
    
    public static float tenPow(float a, float b)
    {
        return a*((float)Math.pow(10, b));
    }
    
    public static float sqrt(float a, float b)
    {
        if(a==0){
            return 1;
        }else{
            return (float)Math.pow(b,1/a);
        }
        
    }
    
    public static float nFact(float a)
    {
        if (a == 0){
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
        
        return n;
    }
    
    public static float log(float a, float b)
    {
        return (float)Math.log10(a) /(float)Math.log10(b);
    }
}
