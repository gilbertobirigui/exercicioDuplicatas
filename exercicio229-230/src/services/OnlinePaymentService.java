/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package services;

/**
 *
 * @author Ilha Edição
 */
public interface OnlinePaymentService {
    
    // metodo paymentFree (amount:Double) : Double
    // metodo interest(amount: Double, months: integer): Double
    
    double paymentFree(double amount);  // taxa de pagamento 
    
    double interest(double amount, int months);   // interes = juros em ingles 
    
    
    
}
