package br.com.alura.loja.testes;

import br.com.alura.loja.modelo.Produto;

import javax.persistence.*;
import java.math.BigDecimal;

public class CadastroDeProduto {

    public static void main(String[] args) {

        Produto celular = new Produto();

        celular.setNome("Redmi");
        celular.setDescricao("custo benefício");
        celular.setPreco(new BigDecimal("800"));

        EntityManagerFactory factory = Persistence.createEntityManagerFactory("loja");
        EntityManager em = factory.createEntityManager();
        em.getTransaction().begin();
        em.persist(celular);
        em.getTransaction().commit();
        em.close();
    }
}
