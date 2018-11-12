package br.ucsal.classe;

import java.util.ArrayList;
import java.util.List;

import javax.jws.WebService;

import br.ucsal.classe.model.Animal;
import br.ucsal.classe.model.Classe;

@WebService(endpointInterface = "br.ucsal.classe.ClasseService")
public class ClasseServiceImpl implements ClasseService {

	private static List<Animal> animais = new ArrayList<Animal>();

	@Override
	public String buscarClasse(String nomeCientifico) {
		implementacaoLista();
		String result = null;

		for (Animal animal : animais) {
			if (animal.getNomeCientifico().equals(nomeCientifico)) {
				result = animal.getClasse().getNome();
				break;
			}
		}

		return result;
	}

	private void implementacaoLista() {
		for (int i = 0; i < 5; i++) {
			Animal animal = new Animal();
			animal.setId(1);
			animal.setImagemUrl("url imagem");
			animal.setNomeCientifico("nome" + i);
			animal.setNomeVulgar("nome vulgar");

			Classe c = new Classe();
			c.setId(1);
			c.setNome("Classe" + i);
			animal.setClasse(c);
			animais.add(animal);
		}
	}

}
