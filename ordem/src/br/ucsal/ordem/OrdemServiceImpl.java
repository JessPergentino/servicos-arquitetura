package br.ucsal.ordem;

import java.util.ArrayList;
import java.util.List;

import javax.jws.WebService;

import br.ucsal.ordem.model.Animal;
import br.ucsal.ordem.model.Ordem;

@WebService(endpointInterface = "br.ucsal.ordem.OrdemService")
public class OrdemServiceImpl implements OrdemService{

	private static List<Animal> animais = new ArrayList<Animal>();
	
	@Override
	public String buscarOrdem(String nomeCientifico) {
		implementacaoLista();
		String result = null;

		for (Animal animal : animais) {
			if (animal.getNomeCientifico().equals(nomeCientifico)) {
				result = animal.getOrdem().getNome();
				break;
			}
		}
		
		return result;
	}
	
	private void implementacaoLista(){
		for (int i = 0; i < 5; i++) {
			Animal animal = new Animal();
			animal.setId(1);
			animal.setImagemUrl("url imagem");
			animal.setNomeCientifico("nome" + i);
			animal.setNomeVulgar("nome vulgar");
			
			Ordem o = new Ordem();
			o.setId(1);
			o.setNome("Ordem" + i);
			animal.setOrdem(o);
			animais.add(animal);
		}	
	}
}
