/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package services;

/**
 *
 * @author Ilha Edição
 */
public class PaypalService implements OnlinePaymentService {

    @Override
    public double paymentFree(double amount) {
        return amount * 0.02; //   taxa 
    }

    @Override
    public double interest(double amount, int months) {
        return amount * 0.01 * months;
    }
    
    
}
