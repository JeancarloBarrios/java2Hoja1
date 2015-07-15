

public class radio implements RADIO{
	
	private boolean state;
	private int frequencyModulation;
	private double[] memory = new double[12];
	private double freaquency;
	
	public radio(){
		this.state = false;
		this.frequencyModulation = 1;
		this.memory = new double[]{0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0};
		this.freaquency = 88.0;
				
	}
	@Override
	public void setESTADO(boolean ESTADO) {
		// TODO Auto-generated method stub
		if (ESTADO==true){
			this.state = false;
		}
		else{
			this.state = true;
		}
	}

	@Override
	public boolean getEstado() {
		// TODO Auto-generated method stub
		return this.state;
	}

	@Override
	public int getAMFM() {
		// TODO Auto-generated method stub
		return this.frequencyModulation;
	}

	@Override
	public void setAMFM(int Band) {
		this.frequencyModulation = Band;
		// TODO Auto-generated method stub
		
	}

	@Override
	public void Sintonizar(boolean ud) {
		// TODO Auto-generated method stub
		if (ud == true){
			this.freaquency += 0.1;
		}
		else {
			this.freaquency += -0.1;
		}

		if (this.freaquency>150){ this.freaquency = 80;}
		if (this.freaquency<80){ this.freaquency = 150;}

			

		
	}

	@Override
	public void Guardar(int Pos) {
		// TODO Auto-generated method stub
		if (Pos-1>=0 && Pos-1<=10){
		memory[Pos-1] = this.freaquency;
		}
	}

	@Override
	public void Memoria(int Pos) {
		// TODO Auto-generated method stub
		if (Pos-1>=0 && Pos-1<=10){
			this.freaquency = memory[Pos-1];
		}
	}

	@Override
	public double getEmisora() {
		// TODO Auto-generated method stub
		return this.freaquency;
	}

}
