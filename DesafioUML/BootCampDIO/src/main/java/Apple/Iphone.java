

package Apple;

/**
 *
 * @author Rodrigo
 */
public class Iphone implements Navegador.Internet, Reprodutor.Reprodutor, Telefone.Telefone{
    
    
        
        
    @Override
    public void pesquisar() {
        throw new UnsupportedOperationException("Pesquisar alguma coisa"); 
    }

    @Override
    public void exibirPagina(String url) {
        throw new UnsupportedOperationException("Exibindo pagina selecionada"); 
    }

    @Override
    public void addNovaABA() {
        throw new UnsupportedOperationException("Adicionando nova pagina"); 
    }

    @Override
    public void refresh() {
        throw new UnsupportedOperationException("Atualizando pagina"); 
    }

    @Override
    public void reproduzir() {
        throw new UnsupportedOperationException("Reproduzindo a música selecionada"); 
    }

    @Override
    public void selecionarMusica() {
        throw new UnsupportedOperationException("Selecionando música"); 
    }

    @Override
    public void pausar() {
        throw new UnsupportedOperationException("Música pausada"); 
    }

    @Override
    public void passarMusica() {
        throw new UnsupportedOperationException("Passando para a próxima música"); 
    }

    @Override
    public void voltarMusica() {
        throw new UnsupportedOperationException("Voltando música"); 
    }

    @Override
    public void realizarChamada() {
        throw new UnsupportedOperationException("Chamando"); 
    }

    @Override
    public void atender() {
        throw new UnsupportedOperationException("Atender chamada"); 
    }

    @Override
    public void iniciarCorreioVoz() {
        throw new UnsupportedOperationException("Iniciando correio de voz"); 
    }

    @Override
    public void finalizarChamada() {
        throw new UnsupportedOperationException("Finalizando chamada"); 
    }
}
