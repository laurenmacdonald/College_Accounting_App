public abstract class Person { //Abstract class to be inherited from in subclasses
    private String name;
    private String address;

    //Default constructor (no parameters used)
    public Person() {}

    //region Getters and Setters
    public void setName(String name){
        this.name = name;
    }

    public String getName(){
        return name;
    }

    public void setAddress(String address){
        this.address = address;
    }

    public String getAddress(){
        return address;
    }
    //endregion

    //Abstract toString method that must be used be subclasses.
    @Override
    public abstract String toString();
}
