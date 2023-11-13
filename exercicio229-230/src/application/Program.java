/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package application;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.util.Scanner;
import model.entities.Contract;
import model.entities.Installment;
import services.ContractService;
import services.PaypalService;

/**
 *
 * @author Ilha Edição
 */
public class Program {
    
    public static void main(String[] args){
        Locale.setDefault(Locale.US);
                
        Scanner sc = new Scanner(System.in);
        
        // criar mascara data para o formato iso 8601
        DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        
        System.out.println("Entre os dados do contrato");
        
        System.out.print("Numero: ");
        Integer number = sc.nextInt();
        
        System.out.print("Data: ");
        LocalDate date = LocalDate.parse(sc.next(),fmt);   // date é um tipo texto pego q for digitado dou parse para virar local date
        
        
        System.out.print("Valor do Contrato: ");
        Double totalValue = sc.nextDouble();
        
        
        // depois pegados dados entrada vou criar na memoria o contrato
        
        Contract obj = new Contract(number, date, totalValue);  // criamos na memoria com os argumentos
        
        // foi criado na memoria um obj com esses campos
        // exemplo
        // number = 8028
        // date = 25/06/2018
        // totalValue = 600.00
        
        
        // agora vamos entrar com quantidade de parcelas
        
        
        System.out.print("Entre com o numero de parcelas: ");
        int n = sc.nextInt();
        
        
        
        // pra fazer isso tem o projeto da camada de serviços
        // ContractService
        // interface -> OnlinePaymentService
        // PaypalService
        
        
        // vou criar meu contracService
        
        ContractService contractService = new ContractService(new PaypalService());        
        
        // vou chamar contractService
        // processa o contrato e gera as parcelas
        contractService.processContract(obj, n);
        
        System.out.println("PARCELAS");  ///
        // vou fazer um for para percorrer as parcelas - usar for each
        // estou fazendo um for para cada obj tiver instalments  *** apelido dele installent  vou imprimir na tela
        for(Installment installment : obj.getInstalments()){
            System.out.println(installment);
        }
        
        sc.close();
        
        
        
        
    }
    
}
