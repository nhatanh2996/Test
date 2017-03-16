/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nhatanh;

/**
 *
 * @author sang
 */
public class NhatAnh
{
public static boolean checkPrime(int n){
    if(n<=0 || n==1 )return false;
    for (int i = 2; i < Math.sqrt(n); i++)
    {
        if(n%i==0)return false;
    }
    return true;
}
    
}
