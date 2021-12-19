package MainApp;

import UI.LoginPanel;
import models.Pokemon;
import Listas.*;

public class mainapp {

	public static void main(String[] args) {
		Pokemon Treecko=new Pokemon("Treecko", 0.5, 5, tipos.tipospokemon.Planta, tipos.tipospokemon.None, tipos.sexopokemon.Macho, false, "Hace su nido en un árbol gigante y defiende ferozmente su territorio de cualquier peligro. Dicen que es el protector de los árboles del bosque.","imagenes/Treecko.png");
		Pokemon Grovyle=new Pokemon("???",0,0,tipos.tipospokemon.None,tipos.tipospokemon.None,tipos.sexopokemon.None,false,"???","imagenes/unknown.jpg");
		Pokemon Sceptile=new Pokemon("???",0,0,tipos.tipospokemon.None,tipos.tipospokemon.None,tipos.sexopokemon.None,false,"???","imagenes/unknown.jpg");
		Pokemon Torchic=new Pokemon("Torchic",0.4,2.5,tipos.tipospokemon.Fuego,tipos.tipospokemon.None,tipos.sexopokemon.Macho,true,"Si le atacan, se defiende escupiendo bolas de fuego que forma en el estómago. Los Torchic tienen aversión a la oscuridad porque les impide ver lo que los rodea.","imagenes/Torchic.png");
		Pokemon Combusken=new Pokemon("Combusken",0.9,19.5,tipos.tipospokemon.Fuego,tipos.tipospokemon.Lucha,tipos.sexopokemon.Macho,true,"Propina hasta diez patadas por segundo. Tiene un instinto de lucha tan fuerte que no deja de pelear hasta que el rival se rinde.","imagenes/Combusken.png");
		Pokemon Blaziken=new Pokemon("???",0,0,tipos.tipospokemon.None,tipos.tipospokemon.None,tipos.sexopokemon.None,false,"???","imagenes/unknown.jpg");
		Pokemon Mudkip=new Pokemon("Mudkip", 0.4, 7.6, tipos.tipospokemon.Agua, tipos.tipospokemon.None, tipos.sexopokemon.Macho, false, "En tierra firme, puede levantar grandes cantos rodados haciendo palanca con sus cuatro patas. Duerme enterrado en el suelo, cerca del agua.","imagenes/Mudkip.png");
		Pokemon Marshtomp=new Pokemon("???",0,0,tipos.tipospokemon.None,tipos.tipospokemon.None,tipos.sexopokemon.None,false,"???","imagenes/unknown.jpg");
		Pokemon Swampert=new Pokemon("???",0,0,tipos.tipospokemon.None,tipos.tipospokemon.None,tipos.sexopokemon.None,false,"???","imagenes/unknown.jpg");
		Listas.Pokedex.add(Treecko);
		Listas.Pokedex.add(Grovyle);
		Listas.Pokedex.add(Sceptile);
		Listas.Pokedex.add(Torchic);
		Listas.Pokedex.add(Combusken);
		Listas.Pokedex.add(Blaziken);
		Listas.Pokedex.add(Mudkip);
		Listas.Pokedex.add(Marshtomp);
		Listas.Pokedex.add(Swampert);
		LoginPanel window = new LoginPanel();
		
	}

}
