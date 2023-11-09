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
    public void processContract(Contract contract, int month){
        
        // testar
        // vou pegar contract ponto getInstalments q é lista de parcelas
        contract.getInstalments().add(new Installment(LocalDate.of(2018,7,25),206.04));      // ponto add adicionar uma parcela
        contract.getInstalments().add(new Installment(LocalDate.of(2018,8,25),208.08));
        
    }
    
    
    
    
}
