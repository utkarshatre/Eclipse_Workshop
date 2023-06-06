package customException;

public class MemberNotFoundException extends RuntimeException {
	private String message;
	public MemberNotFoundException(String message){
		this.message = message;
	}
	@Override
	public String getMessage() {
		return message;
	}
}
