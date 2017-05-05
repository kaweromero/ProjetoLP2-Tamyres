
import java.util.HashMap;
import java.util.Map;


public class VendaDeImovelControle {
    //private HashMap <String, Produto> itensAVenda;
    HashMap <String, Conta> Dados;
    
    public VendaDeImovelControle() {
		Dados = new HashMap<String, Conta>();
	}
    
    public Conta pesquisaConta (String nome){
    return Dados.get(nome);
    
    }
    
    public void adicionarConta(Conta u,Conta u1){
       Dados.put(u.getLogin(),u);
       Dados.put(u1.getSenha(),u1);
    
    }
    

/*     public void descricaoConta(){
    for(String nomeConta : Dados.keySet()){ //keySet() - Retorna um Set com as chaves do mapa especificado.
        Conta u2 = Dados.get(nomeConta);
        System.out.println(u2.getDesc()); 
    }*/
    
    
    
    
    //MAPA IMOVEIS
        private HashMap<String, Imovel> DadosImoveis  ;
        
        /*public VendaDeImovelControle(){
            DadosImoveis = new HashMap<String, Imovel>();
        }*/
        
        public Imovel pesquisaImovel(String nome){
            return DadosImoveis.get(nome); // 1.faixa de preço ; 2. Numero de comodos ; 3. Área Interna   
         }        
        public Imovel pesquisaImovel(double faixapreco) {
		return DadosImoveis.get(faixapreco);
    }
        
    public Imovel pesquisaImovel(int numcomodos) {
		return DadosImoveis.get(numcomodos);
    }
     
    public Imovel pesquisaImovel(float area) {
		return DadosImoveis.get(area);
    }
    
       
        public void adicionarImovel (Imovel i){
        //        DadosImoveis.put(i.getNome(),i);
        }
        
          void removeImovel(Imovel i){
              //  DadosImoveis.remove(i.getNome());
                
                }
}
