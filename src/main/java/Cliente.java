public class Cliente {
 public boolean encerrar(){
     return ClienteFacade.verificarPendenciasConta(this);
 }
}
