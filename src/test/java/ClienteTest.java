import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ClienteTest {
    @Test
    void deveRetornarPendenciaContaBancaria() {
        Cliente cliente = new Cliente();
        ContaBncaria.getInstancia().addClientePendente(cliente);

        assertEquals(false, cliente.encerrar());
    }

    @Test
    void deveRetornarPendenciaServicoTransferencia() {
        Cliente cliente = new Cliente();
        ServicoTransferencia.getInstancia().addClientePendente(cliente);

        assertEquals(false, cliente.encerrar());
    }

    @Test
    void deveRetornarClienteSemPendenciaBancaria() {
        Cliente cliente = new Cliente();

        assertEquals(true, cliente.encerrar());
    }
}
