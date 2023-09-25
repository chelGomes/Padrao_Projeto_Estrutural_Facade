public class ClienteFacade {
    public static boolean verificarPendenciasConta(Cliente cliente) {
        if (ContaBncaria.getInstancia().verificarClienteComPendencia(cliente)) {
            return false;
        }
        if (ServicoTransferencia.getInstancia().verificarClienteComPendencia(cliente)) {
            return false;
        }
        return true;
    }
}
