package by.bsuir.gradle.lab.service.exception;

public class ServiceException extends RuntimeException {

	/**
	 * 
	 */
	private static final long serialVersionUID = 5210741961778920046L;
	
	public ServiceException(String reason) {
		super(reason);
	}

}
