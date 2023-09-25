public class ContaBncaria extends Banco{

    private static ContaBncaria contaBncaria = new ContaBncaria();

    private ContaBncaria(){};

    public static ContaBncaria getInstancia(){
        return contaBncaria;
    }
}
