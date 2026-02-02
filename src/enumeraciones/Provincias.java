package enumeraciones;

public enum Provincias {
	
	A_CORUNA(981),
	ALAVA(945);
	//TODO: resto de prefijos por meter.
	
	public int prefijo;
	
	Provincias(int prefijo) {
		this.prefijo=prefijo;
	}

}
