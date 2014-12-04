package urbanplantz.urbanplants;

import com.google.android.gms.maps.model.LatLng;

/**
 * Created by Ed on 04/12/2014.
 */
public class PlantNode {
    public LatLng coordinates;
    public PlantType plant;
    public String discoverer;

    public PlantNode(LatLng coordinates, PlantType plant, String discoverer) {
        this.coordinates = coordinates;
        this.plant = plant;
        this.discoverer = discoverer;
    }
}
