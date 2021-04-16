package hunt.tst.prj.exception;

public class OuterApiException extends Exception{
	
	private String message;
	
	public OuterApiException(String message) {
	 
		this.message=message;
	};
  
	@Override 
	public String getMessage() {
		
		return this.message;
	}

}
