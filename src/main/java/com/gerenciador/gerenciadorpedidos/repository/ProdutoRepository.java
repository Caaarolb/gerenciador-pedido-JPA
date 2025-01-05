package com.gerenciador.gerenciadorpedidos.repository;

import com.gerenciador.gerenciadorpedidos.model.Produto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.math.BigDecimal;
import java.util.List;

public interface ProdutoRepository extends JpaRepository<Produto, Long> {
    @Query("SELECT p FROM Produto p WHERE p.preco > :preco")
    List<Produto> findByPrecoMaiorQue(@Param("preco") BigDecimal preco);
}
