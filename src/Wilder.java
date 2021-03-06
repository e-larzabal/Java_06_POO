
public class Wilder {
	
	/*
	 *  attributes
	 */
	private String firstName ="";
	private boolean aware = false;
	
	/*
	 * constructors
	 */
	public Wilder(String firstName,boolean aware) {
		this.firstName = firstName;
		this.aware = aware;
	}
	
	/*
	 * getters
	 */
	public String getFirstName() {
		return this.firstName;
	}
	
	public boolean isAware() {
		return this.aware;
	}
	
	/*
	 * setters
	 *
	 */
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	
	public void setAware(boolean aware) {
		this.aware = aware;
	}
	
	/*
	 *  instance method
	 */
	
    public String whoAmI() {
    	String maPresentation = "Je m'appelle " + this.getFirstName() +" et ";
    	
    	if (isAware()) {
    		maPresentation += "je suis aware";
    	} else {
    		maPresentation += "je ne suis pas aware";
    	}
    	
        return maPresentation;
    }
	
}
