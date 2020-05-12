
public class Wilder {
	
	/*
	 *  attributes
	 */
	String firstName ="";
	boolean aware = false;
	
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
	
	public boolean getAware() {
		return this.aware;
	}
	
	/*
	 * setters
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
    	
    	if (getAware()) {
    		maPresentation += "je suis aware";
    	} else {
    		maPresentation += "je ne suis pas aware";
    	}
    	
        return maPresentation;
    }
	
}
