package es.eoi.ejerciciojpa.UI;

public enum ViewCRUD {


		QUIT("Quit"),
		MOSTRAR("Show"),
		BUSCAR("Find"),
		CREAR("Create"),
		MODIFICAR("Modify"),
		ELIMINAR("Eliminate");
		
	    // field
	    private String meaning;

	    // constructor
	    ViewCRUD(String meaning)
	    {
	        this.meaning = meaning;
	    }
		
}
