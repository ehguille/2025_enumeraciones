package enumeraciones;

public enum Pais {
	
	EEUU(001),
	CANADA(002),
	ESPANA(0034),
	MEXICO(0052);
	//TODO: resto de prefijos por meter.
	
	public int prefijo;
	
	Pais(int prefijo) {
		this.prefijo=prefijo;
	}
	
	public static Pais lookUp(int prefijo) throws Exception {
		for(Pais p:Pais.values()) {
			if(prefijo==p.prefijo)
				return p;
		}
		throw new Exception("Valor no encontrado");
	}
	
	public static String posiblesValores() {
		String toString="";
		for(Pais p:Pais.values()){
			toString+="("+p+","+p.prefijo+")\n";
		}
		return toString;
	}
}
