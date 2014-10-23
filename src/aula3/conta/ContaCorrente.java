package aula3.conta;

import java.math.BigDecimal;

public class ContaCorrente {

    private Integer numero;
    private String senha;
    private Agencia agencia;
    private Cliente correntista;
    private BigDecimal saldo = new BigDecimal("0");

    public ContaCorrente() {

    }

    public ContaCorrente(Integer numero, String senha, Agencia agencia, Cliente correntista, BigDecimal saldo) {
        this.numero = numero;
        this.senha = senha;
        this.agencia = agencia;
        this.correntista = correntista;
        this.saldo = saldo;
    }

    public Integer getNumero() {
        return numero;
    }

    public void setNumero(Integer numero) {
        this.numero = numero;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public Agencia getAgencia() {
        return agencia;
    }

    public void setAgencia(Agencia agencia) {
        this.agencia = agencia;
    }

    public Cliente getCorrentista() {
        return correntista;
    }

    public void setCorrentista(Cliente correntista) {
        this.correntista = correntista;
    }

    public Boolean sacar(BigDecimal valor) {
        if (valor.compareTo(saldo) == -1) {
            return false;
        } else {
            saldo = saldo.subtract(valor);
            return true;
        }
    }

    public Boolean depositar(BigDecimal valor) {
        if (valor.compareTo(BigDecimal.ZERO) == -1) {
            return false;
        } else {
            saldo = saldo.add(valor);
            return true;
        }
    }
    public Double getSaldo(){
        return saldo.doubleValue();
    }
}

