
public class SchereSteinPapierException extends RuntimeException {
	
	// --------------------- Constructor
	
    public SchereSteinPapierException(String message) {
        super(message); 
        //stands for superclass from the extended class - RuntimeException (not checked one) 
        // she is the mother of all unchecked exceptions (for example IllegalStateException). 
        // Exception is the mother of all checked exceptions (for example, IOException)
    }
}

