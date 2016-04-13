package it.polito.tdp.model;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;

import javafx.scene.control.Label;

public class Scacchiera {

	private Map<Posizione,String> caselle=new HashMap<Posizione,String>();
	
	private List<Posizione> posizioni=new ArrayList<Posizione>();
	
	private int N;
	
	public Scacchiera(){
		N=4;
		
		for(int i=0;i<N;i++){
			for(int j=0;j<N;j++){
				posizioni.add(new Posizione(i,j));
			}
		}
		
		for(int i=0;i<N;i++){
			for(int j=0;j<N;j++){
				
				Random r = new Random();
		    	
		    	char c = (char)(r.nextInt(26) + 'a');
		    	
		        String s=""+c;
		        
				caselle.put(new Posizione(i,j), s);
			}
		}
		
	}
	
	public String getValue(Posizione p){
		return caselle.get(p);
	}
	
	public List<Posizione> getPosizioni(){
		return posizioni;
	}
	
	public boolean valid(Posizione p) {
		return posizioni.contains(p) ;
	}
	
	public int size() {
		return posizioni.size() ;
	}
	
	public int getN(){
		return N;
	}
	
	
}
