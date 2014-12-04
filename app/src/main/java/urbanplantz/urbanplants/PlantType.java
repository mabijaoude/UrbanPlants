package urbanplantz.urbanplants;

/**
 * Created by Ed on 04/12/2014.
 */
public class PlantType {
    public String name;
    public String scientificName;
    public String whenToPick;
    //public (image?) icon;
    public String category;	//ie: fruit, berry, vegetable, herb, etc; should maybe be PlantCategory object?
    public String wikipediaLink;
    public String recipesLink;

    public PlantType(String name, String scientificName) {  //cheapo test constructor
        this.name = name;
        this.scientificName = scientificName;
    }
}
