package lab26;

public class Drot extends Prolaznik{

	private int pitanje;
	private String odgovor;
	private String odgovor2;
	private String objasnjenje;
	
	public Drot()
	{
		odgovor = "Jeste";
		odgovor2 = "Aha";
		objasnjenje = "'Ovaj što je rekao 'aha' ima samo osnovnu školu, ovaj što je rekao 'da' "
				+ "\nima srednju, a ovaj što je rekao 'jeste' ima fakultet.'";
	}
	
	public String getOdgovor()
	{
		return odgovor;
	}
	
	public String getOdgovor2()
	{
		return odgovor2;
	}
	
	public String getObjasnjenje()
	{
		return objasnjenje;
	}
}
