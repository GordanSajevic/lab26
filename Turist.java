package lab26;

public class Turist {
	
	private String pitanje;
	private String pitanje2;
	private String objasnjenje;
	private int broj;
	
	//Zadatak sa predavanja
	
	/**
	 * Konstruktor nez parametara
	 */
	
	public Turist()
	{
		
		pitanje = "'Da li je ovo autobus za grad?'";
		broj++;
		objasnjenje = "'Kako mi je jedan prolaznik rekao 'aha', drugi 'da', a treći 'jeste'? '";
		pitanje2 = "'Da li to znači da ste vi završili fakultet?";
		
	}
	
	/**
	 * Getter za pitanje
	 * @return
	 */
	
	public String getPitanje()
	{
		return pitanje;
	}
	
	/**
	 * Getter za pitanje2
	 * @return
	 */
	
	public String getPitanje2()
	{
		return pitanje2;
	}
	
	/**
	 * Getter za objašnjenje
	 * @return
	 */
	
	public String getObjasnjenje()
	{
		return objasnjenje;
	}
	

}
