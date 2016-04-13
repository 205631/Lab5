package it.polito.tdp.model;

import java.util.ArrayList;
import java.util.List;

public class Ricerca {
	
	private List<Posizione> posPrec= new ArrayList<Posizione>();

	private Scacchiera sc;
	
	public void CreaScacchiera(){
	  sc=new Scacchiera();
	}
	
	public Scacchiera getScacchiera(){
		return sc;
	}
	
	public List<String> CercaParole(){
		
		
		List<String> listaParole= new ArrayList<String>();
		
		parola(sc,posPrec,"",listaParole);
		
		return listaParole;
	}
	
	
	public void parola(Scacchiera sc, List<Posizione> posPrec,String parola,List<String> listaParole){
		
		if(){
		//condizione di uscita ricorsione: parola non esiste nessuna parola che inizia con la stringa risultato
		//es: par ---- parola OK continua ricorsione
		//oppure quando le lettere usate sono uguali a 16
		
			
		}else{
		
			for(int i=0;i<sc.getN();i++){
				for(int j=0;j<sc.getN();j++){
				
					Posizione p= new Posizione(i,j);
				
					if(posPrec.contains(p)==false){
				
						parola+=sc.getValue(p);
						posPrec.add(p);
					
						this.parola(sc, posPrec, parola, listaParole);
					
						parola= parola.substring(0, parola.length()-1);
					}
				
				}
			}
		}
	}
	
	
	
}
