/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
 
import java.util.HashMap;

public class EstoqueVender {
    
    
    private HashMap<String, ImovelVenda> itensAVenda;
    
    public ImovelVenda pesquisaImovelVenda(String tipo) {
		return itensAVenda.get(tipo);
    }
    
    public ImovelVenda pesquisaImovelVenda(double faixapreco) {
		return itensAVenda.get(faixapreco);
    }
     
    public ImovelVenda pesquisaImovelVenda(int numcomodos) {
		return itensAVenda.get(numcomodos);
    }
     
    public ImovelVenda pesquisaImovelVenda(float area) {
		return itensAVenda.get(area);
    }
    
    public ImovelVenda pesquisaImovelVenda(boolean garagem) {
		return itensAVenda.get(garagem);
    }
     
    public void adcionarImovelVenda(ImovelVenda p){
        itensAVenda.put(p.getTipo(), p);
        itensAVenda.put(p.getFaixaPreco(), p);
        itensAVenda.put(p.getNumComodos(), p);
        itensAVenda.put(p.getArea(), p);
        itensAVenda.put(p.getGaragem(), p);
    }
    
    
    public void removerImovelVenda(){
        itensAVenda.remove(p.getTipo());
        itensAVenda.remove(p.getFaixaPreco());
        itensAVenda.remove(p.getNumComodos());
        itensAVenda.remove(p.getArea());
        itensAVenda.remove(p.getGaragem());
    }

    
}
