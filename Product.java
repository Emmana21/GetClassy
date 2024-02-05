import java.util.Calendar;

public class Product {
    private String Name;
    private String Description;
    private String ID;
    private double Cost;

    public Product(String name, String description, String ID, double cost) {
        this.Name = name;
        this.Description = description;
        this.ID = ID;
        this.Cost = cost;
    }

    public String getName() {
        return Name;
    }

    public void setName(String Name) {
        this.Name = Name;
    }

    public String getDescription() {
        return Description;
    }

    public void setDescription (String Description) {
        this.Description = Description;
    }

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public double getCost() {
        return Cost;
    }

    public void setCost(double Cost) {
        this.Cost = Cost;
    }


    public String toCSVDataRecord()
    {
        return this.Name + ", " + this.Description + ", " + this.ID + ", " + this.Cost;
    }

}



