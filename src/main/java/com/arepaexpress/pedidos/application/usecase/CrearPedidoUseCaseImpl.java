package com.arepaexpress.pedidos.application.usecase;

import com.arepaexpress.pedidos.domain.model.CrearPedidoRequest;
import com.arepaexpress.pedidos.domain.port.in.CrearPedidoUseCase;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
public class CrearPedidoUseCaseImpl implements CrearPedidoUseCase {
    @Override
    public String crear(CrearPedidoRequest pedido) {
        return UUID.randomUUID().toString().substring(0, 8);
    }
}
