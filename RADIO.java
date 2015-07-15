

public interface RADIO {
	
	public void setESTADO(boolean ESTADO);
	
	public boolean getEstado();
	
	public int getAMFM();
	
	public void setAMFM(int Band);
	
	public void Sintonizar(boolean ud);
	
	public void Guardar(int Pos);
	
	public void Memoria(int Pos);
	
	public double getEmisora();
	
}
