package com.gerenciador.gerenciadorpedidos.repository;

import com.gerenciador.gerenciadorpedidos.model.Pedido;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PedidoRepository extends JpaRepository<Pedido, Long> {
}
