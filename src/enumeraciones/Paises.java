package enumeraciones;

public enum Paises {
	
	EEUU(001),
	CANADA(001),
	ESPANA(0034),
	MEXICO(0052);
	//TODO: resto de prefijos por meter.
	
	public int prefijo;
	
	Paises(int prefijo) {
		this.prefijo=prefijo;
	}
}
