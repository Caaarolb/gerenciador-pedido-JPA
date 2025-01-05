package com.gerenciador.gerenciadorpedidos;

import com.gerenciador.gerenciadorpedidos.model.Pedido;
import com.gerenciador.gerenciadorpedidos.model.Produto;
import com.gerenciador.gerenciadorpedidos.repository.PedidoRepository;
import com.gerenciador.gerenciadorpedidos.repository.ProdutoRepository;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.List;

@SpringBootApplication
public class GerenciadorPedidosApplication {

    public static void main(String[] args) {
        SpringApplication.run(GerenciadorPedidosApplication.class, args);
    }

    @Bean
    ApplicationRunner init(ProdutoRepository produtoRepository, PedidoRepository pedidoRepository) {
        return args -> {
            Produto carne = new Produto();
            carne.setNome("Carne");
            carne.setPreco(BigDecimal.valueOf(50.00));
            produtoRepository.save(carne);

            Produto panelaDePressao = new Produto();
            panelaDePressao.setNome("Panela de Pressão");
            panelaDePressao.setPreco(BigDecimal.valueOf(100.00));
            produtoRepository.save(panelaDePressao);

            Pedido pedido = new Pedido();
            pedido.setData(LocalDate.now());
            pedido.setProdutos(List.of(carne, panelaDePressao));
            pedidoRepository.save(pedido);

            System.out.println("Dados iniciais inseridos!");

            BigDecimal precoMinimo = BigDecimal.valueOf(40.00);
            List<Produto> produtosCaros = produtoRepository.findByPrecoMaiorQue(precoMinimo);

            System.out.println("Produtos com preço maior que " + precoMinimo + ":");
            produtosCaros.forEach(produto ->
                    System.out.println(produto.getNome() + " - " + produto.getPreco())
            );
        };
    }
}
