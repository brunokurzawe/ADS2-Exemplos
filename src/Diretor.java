public class Diretor  extends Funcionario implements Autenticavel {

    @Override
    public boolean autentica() {
        ///Regras especificas do diretor
        return true;
    }

}


