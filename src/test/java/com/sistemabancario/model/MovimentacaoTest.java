package com.sistemabancario.model;

import org.junit.Test;

import static org.junit.Assert.*;
import org.junit.Before;

/**
 * @author Manoel Campos da Silva Filho
 */
public class MovimentacaoTest {
     private Movimentacao instancia = new Movimentacao();
   
     @Before
       public void setUp(){
          instancia = new Movimentacao();
          instancia.setValor(10);
          System.out.println("INSTANCIANDO MOVIMENTACAO");
        }
       @Test
       public void instanciarComoNaoConfirmada(){
           assertFalse(instancia.isConfirmada());
       }
    
    @Test
    public void setTipo() {
        final char esperado = 'C';
        instancia.setTipo(esperado);
        final char obtido = instancia.getTipo();
        assertEquals(esperado, obtido);
        instancia.setConfirmada(true);
    }
    
    @Test
    public void setTipoInvalido() {
        final char invalido = 'X';
        try {
            instancia.setTipo(invalido);
        } catch (IllegalArgumentException e) {
        } 
        final char obtido = instancia.getTipo();
        assertNotEquals(invalido, obtido);
    }
    
    @Test(expected = IllegalArgumentException.class)
    public void setTipoInvalidoExcecao() {
        final char invalido = 'X';
        instancia.setTipo(invalido);
    }
    @Test
    public void getTipoPadrao() {
        final char esperado = 'C';
        final char obtido = instancia.getTipo();
        assertEquals(esperado, obtido);
    }
}

