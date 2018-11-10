package br.ucsal.ordem;

import java.util.ArrayList;
import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.WebApplicationException;
import javax.ws.rs.core.MediaType;

import br.ucsal.heptofauna_api.Animal;
import br.ucsal.heptofauna_api.Ordem;

@Path("/")
public class OrdemService {

	private static List<Animal> animais = new ArrayList<Animal>();

	@GET
	@Produces(MediaType.APPLICATION_JSON)
	@Path("/{nomeCientifico}")
	public Ordem getContact(@PathParam("nomeCientifico") String nome) {

		Ordem result = null;

		for (Animal animal : animais) {
			if (animal.getNomeCientifico().equals(nome)) {
				result = animal.getOrdem();
				break;
			}
		}

		if (result == null) {
			throw new WebApplicationException(404);
		}

		return result;
	}
}