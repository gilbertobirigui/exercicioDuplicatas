/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model.entities;

import java.time.LocalDate;


/**
 *
 * @author Ilha Edição
 */

// Installment = parcelas


public class Installment {
    private LocalDate date;    // data
    private Double amont;      // quantia da parcela
    
    
    
    // criar construtor basicao 
    public Installment(){
        
    }
    
    
    // criar construtor com argumentos

    public Installment(LocalDate date, Double amont) {
        this.date = date;
        this.amont = amont;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public Double getAmont() {
        return amont;
    }

    public void setAmont(Double amont) {
        this.amont = amont;
    }

    @Override
    public String toString() {
        return date + " - " + String amont;
    }
    
    
    
    
    
}
