/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package services;

import java.time.LocalDate;
import model.entities.Contract;
import model.entities.Installment;

/**
 *
 * @author Ilha Edição
 */

// essa classe vai ser responsavel por gerar as duplicatas ou prestacao 
// vai ser responsabel por gerar as parcelas

// ContractService --> depende do OnlinePaymentService
// ja declaro ele aqui dentro 

public class ContractService {
    
    private OnlinePaymentService onlinePaymentService;   // declarado minha dependencia
    
    
    // ja vou criar construtor para assegurar que ContractService ja informando o OnlinePaymentService

    public ContractService(OnlinePaymentService onlinePaymentService) {
        this.onlinePaymentService = onlinePaymentService;
    }
    
    // metodo para processar o contrato e parcelas 
    public void processContract(Contract contract, int months){
        
      // tenho q fazer parcelas no caso ja tenho month mes
      
      // vou fazer for para gerar as parcelas
      
      for (int i = 1; i <= months; i++){
          // agora qual vai ser data vencimento de cada parcela
          // vai ser data original do contratato contract
          double basicQuota = contract.getTotalValue() / months;           // parcela base  valor total / qtdade mes 
          LocalDate dueDate = contract.getDate().plusMonths(i);  // i = mes  porque primeira x vai valer 1
          
          // calcular juros = interest
          // fee seria taxa
          double interest = onlinePaymentService.interest(basicQuota, i);  // i = qtade mes  //chamada consigo calcular juros
          double fee = onlinePaymentService.paymentFree(basicQuota +interest);  // basicQuota - valor / 3 mais juros
          
          double quota =  basicQuota + interest + fee;    // valor total da parcela com juros e multas
          
          
          // tenho q instanciar instalment seria parcelas ou seja fazer um ojeto de cada uma
          contract.getInstalments().add(new Installment(dueDate, quota));  // aqui criei objeto de cada parcela com data e valor
          
          
      }
        
       
       
       
    }
    
    
    
    
}
