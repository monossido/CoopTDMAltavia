package com.lorenzobraghetto.cooptdmaltavia;

import java.util.ArrayList;
import java.util.List;

public class MyGeoPoints {

	private List<GeoPoints> listGeoPoints = new ArrayList<GeoPoints>();

	public MyGeoPoints() {
		generatePoints();
	}

	private void generatePoints() {
		//listEasyGeoPoints.add(new GeoPoints(45.408999, 11.867802, "Punto casa1", "ABCDEF", "Hint prova casa"));

		listGeoPoints.add(new GeoPoints(45.276892, 11.678752, "Punto 1", "GUR4V", "Non può mancare in un pic-nic"));
		listGeoPoints.add(new GeoPoints(45.276544, 11.677841, "Punto 2", "HO07E", "Il cinghiale è ghiotto del frutto di questa pianta che si chiama faggiola"));
		listGeoPoints.add(new GeoPoints(45.276158, 11.677881, "Punto 3", "NNV4Q", "Il legno di questo albero è pregiato, con i noccioli del frutto si possono fare dei cuscinetti da scaldare in microonde"));
		listGeoPoints.add(new GeoPoints(45.274488, 11.676528, "Punto 4", "N07E9", "Forse ci sei proprio vicino, il punto si trova sotto a un..."));
		listGeoPoints.add(new GeoPoints(45.275006, 11.677593, "Punto 5", "QYQGG", "Grazie al suo frutto si fa un ottimo prodotto per condire la verdura"));
		listGeoPoints.add(new GeoPoints(45.276198, 11.679078, "Punto 6", "T3QDW", "Il frutto di quest’albero è la ghianda"));
		listGeoPoints.add(new GeoPoints(45.276891, 11.680513, "Punto 7", "YHO7S", "Se la strada seguirai, il cartello troverai e sotto una quercia sostare dovrai"));
		listGeoPoints.add(new GeoPoints(45.278083, 11.680331, "Punto 8", "YTOPL", "Lo so che non ha un bell’aspetto, ma si tratta di un pozzetto"));
		listGeoPoints.add(new GeoPoints(45.277826, 11.679177, "Punto 9", "02NY7", "Attenzione alla strada accidentata, il punto si trova su una staccionata"));
		listGeoPoints.add(new GeoPoints(45.277508, 11.679298, "Punto 10", "3TCT4", "Dai che alla fine sei arrivato ormai, su una porta cercare dovrai"));
		//listGeoPoints.add(new GeoPoints(45.276956, 11.679168, "INFO", "ABCDEF", "Hint prova"));
	}

	public List<GeoPoints> getGeoPoints() {
		return listGeoPoints;
	}

}
