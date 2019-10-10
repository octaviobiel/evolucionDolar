
public class CotizarDolar {
	private double dolar=0;
	private double euro=0;
	double mat[][]= new double [4][5];
	
	public double getDolar() {
		return dolar;
	}

	public void setDolar(double dolar) {
		this.dolar = dolar;
	}

	public double getEuro() {
		return euro;
	}

	public void setEuro(double euro) {
		this.euro = euro;
	}

	public double[][] getMat() {
		return mat;
	}

	public void setMat(double[][] mat) {
		this.mat = mat;
	}

	public CotizarDolar(double dolar, double euro) {
		this.dolar=dolar;
		this.euro=euro;
	}
	
	public double calcularAumento() {
		this.dolar+=this.euro/4;
		return this.dolar; 
	}
	public void registrarAumento()
	{
		int contadorDia = 1; 
		
		for (int i= 0; i<4 ; i++)
		{
			for(int j=0; j<5 ; j++)
			{
				
				if(contadorDia != 4)
				{
					this.mat[i][j] = this.dolar;
					contadorDia += 1;
				}
				else
				{
					this.mat[i][j] = calcularAumento();
					contadorDia = 1;
				}
			}
		}
	}
}
