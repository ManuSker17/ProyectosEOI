package es.eoi.jdbc.app;

public enum ViewEnum {


		QUIT("Quit"),
		FINDALL_VIEW("Find all students"),
		FINDDNI_VIEW("Find alumn by DNI"),
		CREATE_VIEW("Create an alumn"),
		UPDATE_VIEW("Update values of an alumn"),
		DELETE_VIEW("Delete an alumn");
		
	    // field
	    private String meaning;

	    // constructor
	    ViewEnum(String meaning)
	    {
	        this.meaning = meaning;
	    }
		
}
