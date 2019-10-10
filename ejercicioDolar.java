
public class ejercicioDolar {

	public static void main(String[] args) {
	
	CotizarDolar mes = new CotizarDolar (61,68.50);
	
	mes.registrarAumento();
	
	for (int i=0; i<4 ;i++)
	{
		for (int j=0; j<5; j++)
		{
			System.out.print(String.format("%.2f",mes.getMat()[i][j])+"\t"); 
		}
		System.out.println("");}
	}

}
