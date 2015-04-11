package urbanplantz.urbanplants;

/**
 * Created by Ed on 04/12/2014.
 */
public class PlantType {
    public String name;
    public String scientificName;
    public byte pickFrom; // Season is June to July, pickFrom = 6 | PickTo = 7.
    public byte pickTo;  // This will allow us to use the current month to recommend to user what is currently in season.
    public String category;	//ie: fruit, berry, vegetable, herb, etc; should maybe be PlantCategory object?
    public String wikipediaLink;
    public String recipesLink;
    public String imageLink; //public (image?) icon; Lets try to store these online until we can store locally/in database.

    public PlantType(String name, String scientificName) {  //cheapo test constructor
        this.name = name;
        this.scientificName = scientificName;

    }

    public PlantType(String name, String scientificName, byte pickFrom, byte pickTo, String category, String wikipediaLink, String recipesLink, String imageLink) {  //cheapo full object constructor
        this.name = name;
        this.scientificName = scientificName;
        this.pickFrom = pickFrom;
        this.pickTo = pickTo;
        this.category = category;
        this.wikipediaLink = wikipediaLink;
        this.recipesLink = recipesLink;
        this.imageLink = imageLink;
    }
}
