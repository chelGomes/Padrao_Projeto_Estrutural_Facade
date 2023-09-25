public class ServicoTransferencia extends Banco {

    private static ServicoTransferencia servicoTransferencia = new ServicoTransferencia();

    private ServicoTransferencia(){};

    public static ServicoTransferencia getInstancia(){
        return servicoTransferencia;
    }
}
