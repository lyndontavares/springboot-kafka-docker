package dio.expertostech.tutorial.rest.kafka.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import dio.expertostech.tutorial.rest.kafka.data.PedidoData;
import dio.expertostech.tutorial.rest.kafka.services.RegistraEventoService;
import lombok.RequiredArgsConstructor;

@RestController
@RequiredArgsConstructor
public class PedidosConroller {

    private final RegistraEventoService eventoService;

    @PostMapping(path = "/api/salva-pedido")
    public ResponseEntity<String>  SalvarPedido(@RequestBody PedidoData pedido) {
        eventoService.adicionarEvento("SalvarPedido", pedido);
        return ResponseEntity.ok("Sucesso");
    }

}
