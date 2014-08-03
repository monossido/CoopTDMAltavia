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

		listGeoPoints.add(new GeoPoints(45.358166, 11.662756, "Punto 1", "GUR4V", "Serve per la raccolta del rifiuto secco"));
		listGeoPoints.add(new GeoPoints(45.353011, 11.658238, "Punto 2", "HO07E", "Il cinghiale è ghiotto della faggiola, il frutto dell’albero che state cercando, che si trova anche in montagna"));
		listGeoPoints.add(new GeoPoints(45.351570, 11.660774, "Punto 3", "NNV4Q", "Il legno di questo albero è pregiato, con i noccioli del frutto si possono fare dei cuscinetti da scaldare in microonde"));
		listGeoPoints.add(new GeoPoints(45.348770, 11.668101, "Punto 4", "N07E9", "Forse ci sei proprio vicino, il punto si trova sotto a un albero chiamato..."));
		listGeoPoints.add(new GeoPoints(45.347951, 11.672042, "Punto 5", "QYQGG", "Grazie al suo frutto si fa un ottimo prodotto per condire la verdura"));
		listGeoPoints.add(new GeoPoints(45.343395, 11.675806, "Punto 6", "T3QDW", "Il frutto dell’albero che state cercando è la ghianda"));
		listGeoPoints.add(new GeoPoints(45.340423, 11.678183, "Punto 7", "YHO7S", "Se la strada seguirai, il cartello troverai e sotto una quercia sostare dovrai"));
		listGeoPoints.add(new GeoPoints(45.337296, 11.686501, "Punto 8", "YTOPL", "Lo so che non ha un bell’aspetto, ma si tratta di un pozzetto"));
		listGeoPoints.add(new GeoPoints(45.336030, 11.686551, "Punto 9", "02NY7", "Attenzione alla strada accidentata, il punto si trova vicino una staccionata"));
		listGeoPoints.add(new GeoPoints(45.348756, 11.668096, "Punto 10", "3TCT4", "Dai che alla fine sei arrivato ormai, su una porta in legno cercare dovrai"));
		//listGeoPoints.add(new GeoPoints(45.276956, 11.679168, "INFO", "ABCDEF", "Hint prova"));
	}

	public List<GeoPoints> getGeoPoints() {
		return listGeoPoints;
	}

}
