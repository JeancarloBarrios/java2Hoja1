

public class radio implements Radio{
	
	private boolean state;
	private int frequencyModulation;
	private double[] memory = new double[12];
	private double[] memoryAm = new double[12];
	private double freaquency;
	private double freaquencyAm;
	// Class constructor it sets all the parameters in default 
	public radio(){
		this.state = true;
		this.frequencyModulation = 1;
		this.memory = new double[]{0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0};
		this.freaquency = 88.0;
		this.freaquencyAm = 500;
		this.memoryAm = new double[]{0,0,0,0,0,0,0,0,0,0,0,0};		
	}
	@Override
	// it changes the state of on an of
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
	// it returns the state of the radio on and off
	public boolean getEstado() {
		// TODO Auto-generated method stub
		return this.state;
	}

	@Override
	// it return the state of the frequency modulation
	public int getAMFM() {
		// TODO Auto-generated method stub
		
		return this.frequencyModulation;
	}

	@Override
	// it changes the frequency modulation
	public void setAMFM(int Band) {
		this.frequencyModulation = Band;
		// TODO Auto-generated method stub
		
	}
	// it changes the frequency true for up and false for down
	@Override
	public void Sintonizar(boolean ud) {
		// TODO Auto-generated method stub
		if (frequencyModulation==1){
			if (ud == true){
				this.freaquency += 0.1;
			}
			else {
				this.freaquency += -0.1;
			}

			if (this.freaquency>150){ this.freaquency = 80;}
			if (this.freaquency<80){ this.freaquency = 150;}
		}
		else {
			if (ud == true){
				this.freaquencyAm += 20;
			}
			else {
				this.freaquencyAm += -20;
			}

			if (this.freaquencyAm>500){ this.freaquency = 1160;}
			if (this.freaquency<1160){ this.freaquency = 500;}
	
		}
			

		
	}
	// It save the current frequency in a array
	@Override
	public void Guardar(int Pos) {
		// TODO Auto-generated method stub
		if (frequencyModulation==1){
			if (Pos-1>=0 && Pos-1<=10){
			memory[Pos-1] = this.freaquency;
		}
		}
		else{
			if (Pos-1>=0 && Pos-1<=10){
			memoryAm[Pos-1] = this.freaquencyAm;
		}
		
		}
	}

	// in prints the current frequency in a array
	@Override
	public void Memoria(int Pos) {
		// TODO Auto-generated method stub
		if (frequencyModulation==1){

			if (Pos-1>=0 && Pos-1<=10){

				this.freaquency = memory[Pos-1];
		}
		}
		else {
			if (Pos-1>=0 && Pos-1<=10){

				this.freaquencyAm = memoryAm[Pos-1];
			}
			
		}
	}
	}
	// it returns the state of the frequency
	@Override
	public double getEmisora() {
		// TODO Auto-generated method stub
		//
		if (frequencyModulation==1){
			return this.freaquency;
		}
		else {
			return this.freaquencyAm;

		}
	}

}
