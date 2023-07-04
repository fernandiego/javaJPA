package br.com.alura.loja.testes;

import br.com.alura.loja.dao.CategoriaDao;
import br.com.alura.loja.dao.ProdutoDao;
import br.com.alura.loja.modelo.Categoria;
import br.com.alura.loja.modelo.Produto;
import br.com.alura.loja.util.JPAUtil;

import javax.persistence.*;
import java.math.BigDecimal;

public class CadastroDeProduto {

    public static void main(String[] args) {

        Categoria celulares = new Categoria("CELULARES");

        EntityManager em = JPAUtil.getEntityManager();
        em.getTransaction().begin();

        em.persist(celulares);
        celulares.setNome("XPTO");

        em.flush();
        em.clear();

        celulares = em.merge(celulares);
        celulares.setNome("1234");
        em.flush();
        em.clear();
        em.remove(celulares);
        em.flush();
    }
}
