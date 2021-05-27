package fixtures;

public abstract class Fixture {
	protected String name;

    public abstract String getName();

    public abstract void setName(String name);
    
    protected String shortDescription;

    public abstract String getShortDescription();

    public abstract void setShortDescription(String shortDescription);
    
    protected String longDescription;

    public abstract String getLongDescription();

    public abstract void setLongDescription(String longDescription);
}
