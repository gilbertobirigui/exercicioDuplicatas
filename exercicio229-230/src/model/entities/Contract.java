/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model.entities;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;



/**
 *
 * @author Ilha Edição
 */
// Contract = contrato

public class Contract {
    private Integer number;   // numero
    private LocalDate date;    // data
    private Double totalValue;   // valor total

    
    // um contrato tem varias parcelas entao vou usar listas
    // vamos ja instanciar ela com arrylist 
    private List<Installment> instalments = new ArrayList<>(); 
    
    
    // construtor padrao
    public Contract(){
        
    }
    
    
    // criar um contrato menos parcelas porque um contrato nao tem qdade parcelas

    public Contract(Integer number, LocalDate date, Double totalValue) {
        this.number = number;
        this.date = date;
        this.totalValue = totalValue;
    }
    
    
    // criar gets e sets

    public Integer getNumber() {
        return number;
    }

    public void setNumber(Integer number) {
        this.number = number;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public Double getTotalValue() {
        return totalValue;
    }

    public void setTotalValue(Double totalValue) {
        this.totalValue = totalValue;
    }

    public List<Installment> getInstalments() {
        return instalments;
    }

    // somente o getInstalments - seria somente leitura
    // ref a lista nao tem set porque vc nao vai remover ou iserir 
    // entao tiramos os set da lista

    
    
    

   
   
    
    
    
    

   
    
    
    
    
    
}
