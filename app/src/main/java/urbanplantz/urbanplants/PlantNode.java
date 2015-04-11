package urbanplantz.urbanplants;

import com.google.android.gms.maps.model.LatLng;

/**
 * Created by Ed on 04/12/2014.
 */
public class PlantNode {
    public LatLng coordinates; //There is a specific way of using spatial coordinates and storing them in mySQL. For now we can store it as String, and build a converter when loading it in to Andriod Geometry table http://maisonbisson.com/post/12147/working-with-spatial-data-in-mysql/
    public PlantType plant;
    public String discoverer; //This could be the User.displayName of the discoverer, however we need to ensure that displayName is unique.
    public String confirmer; // same comment above (MA) // this could be the user_id unique key from database consider changing.

    public PlantNode(LatLng coordinates, PlantType plant, String discoverer/*, String confirmer*/) {
        this.coordinates = coordinates;
        this.plant = plant;
        this.discoverer = discoverer;
       // this.confirmer = confirmer;
    }
}
