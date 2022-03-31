package JFSbookshop.BookApp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;


public class Mybook  {
	@Autowired
	Altitutde skyAltitutde;
	public Altitutde getSkyAltitutde() {
		return skyAltitutde;
	}





	public void setSkyAltitutde(Altitutde skyAltitutde) {
		this.skyAltitutde = skyAltitutde;
	}
	public void Display() {
		System.out.println("welocome to seventh chapter");
		skyAltitutde.height();
		skyAltitutde.dive();
		
		

		
		
		
	}






	
	

}
