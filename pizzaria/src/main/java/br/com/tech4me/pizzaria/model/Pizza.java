package br.com.tech4me.pizzaria.model;

import java.util.List;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import br.com.tech4me.pizzaria.shared.PizzaCompletoDTO;

@Document("pizzas")
public class Pizza {
    @Id
    private String id;
    private String sabor;
    private List<String> ingredientes;
    private Tamanho tamanho;
    private double valor;
    private Integer qtdEmEstoque;
    
    public Integer getQtdEmEstoque() {
        return qtdEmEstoque;
    }
    public void setQtdEmEstoque(Integer qtdEmEstoque) {
        this.qtdEmEstoque = qtdEmEstoque;
    }

    public Pizza(){
        
    }

    public Pizza(PizzaCompletoDTO dto){
        setId(dto.id());
        setSabor(dto.sabor());
        setIngredientes(dto.ingredientes());
        setTamanho(dto.tamanho());
        setValor(dto.valor());
    }

    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }
    public String getSabor() {
        return sabor;
    }
    public void setSabor(String sabor) {
        this.sabor = sabor;
    }
    public List<String> getIngredientes() {
        return ingredientes;
    }
    public void setIngredientes(List<String> ingredientes) {
        this.ingredientes = ingredientes;
    }
    public Tamanho getTamanho() {
        return tamanho;
    }
    public void setTamanho(Tamanho tamanho) {
        this.tamanho = tamanho;
    }
    public double getValor() {
        return valor;
    }
    public void setValor(double valor) {
        this.valor = valor;
    }
}
