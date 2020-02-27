package es.eoi.ejerciciojpa.UI;

public enum ViewEnum {


		QUIT("Quit"),
		CLIENTE("Find all students"),
		BANCO("Find alumn by DNI"),
		CUENTA("Create an alumn");
		
	    // field
	    private String meaning;

	    // constructor
	    ViewEnum(String meaning)
	    {
	        this.meaning = meaning;
	    }
		
}
