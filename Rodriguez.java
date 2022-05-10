public class Rodriguez implements FinalProject
{
    private int aNumber;
    private String aName;
    private String aCharacter;
    
    public Rodriguez()
    {

    }
    
    public String getFavoriteCharacter() {
        return aCharacter;
    }

    public int getAge() {
        return aNumber;
    }

    public String getName() {
        return aName;
    }

    public void setAge(int aNumber) {
        this.aNumber = aNumber;
    }

    public void setFavoriteCharacter(String aCharacter) {
        this.aCharacter = aCharacter;
    }

    public void setName(String aName) {
        this.aName = aName;
    }

    @Override
    public String toString() {
        return "Person{" + "Age=" + aNumber + ", Name=" + aName + ", Favorite Character=" + aCharacter + '}';
    }
    
    public void begin()
    {
        Rodriguez Person = new Rodriguez();
        Person.setAge(22);
        Person.setFavoriteCharacter("Raiden Shogun");
        Person.setName("Ruben");
        System.out.println(Person.toString());
        try
        {
            java.util.concurrent.TimeUnit.SECONDS.sleep(2);  
        }
        catch(InterruptedException e)
        {}
    }
    public static void main(String[] args) {
        Rodriguez Person = new Rodriguez();
        Person.setAge(22);
        Person.setFavoriteCharacter("Raiden Shogun");
        Person.setName("Ruben");
        System.out.println(Person.toString());
    }
}
