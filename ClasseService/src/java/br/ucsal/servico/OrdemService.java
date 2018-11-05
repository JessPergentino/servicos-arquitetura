package br.ucsal.servico;

import java.util.ArrayList;
import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.WebApplicationException;
import javax.ws.rs.core.MediaType;

import br.ucsal.model.Animal;
import br.ucsal.model.Classe;

@Path("/origem")
public class OrdemService {

	private static List<Animal> animais = new ArrayList<Animal>();

	@GET
	@Produces(MediaType.APPLICATION_JSON)
	@Path("/origem/{animalId}")
	public Classe getOrdem(@PathParam("animalId") int id) {

		Classe result = null;

		for (Animal animal : animais) {
			if (animal.getId() == id) {
				result = animal.getclasse();
				break;
			}
		}

		if (result == null) {
			throw new WebApplicationException(404);
		}

		return result;
	}
}
