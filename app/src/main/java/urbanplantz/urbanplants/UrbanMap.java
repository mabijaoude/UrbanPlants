package urbanplantz.urbanplants;

import android.support.v4.app.FragmentActivity;
import android.os.Bundle;

import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;

import android.util.Log;
import android.view.MenuInflater;
import android.view.Menu;
import android.R.menu;
import android.view.MenuItem;

import java.sql.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.ArrayList;


public class UrbanMap extends FragmentActivity {

    private GoogleMap mMap; // Might be null if Google Play services APK is not available.

    String host = "urbanplants.db.8384869.hostedresource.com";
    String uName = "urbanplants";
    String uPass= "TTSJ4Lyfe!";


    //test PlantType objects
    PlantType testRaspberry = new PlantType ("Raspberry", "rubus strigosus");
    PlantType testApple = new PlantType ("Apple", "malus domestica");
    PlantType testGinseng = new PlantType("American Ginseng", "panax quinquefolius");

    PlantNode plant1 = new PlantNode(new LatLng(54, -48), testRaspberry, "Ed");
    PlantNode plant2 = new PlantNode(new LatLng(53, -48), testApple, "Ed");
    PlantNode plant3 = new PlantNode(new LatLng(54, -47), testGinseng, "Ed");
    PlantNode plant4 = new PlantNode(new LatLng(55, -47), testRaspberry, "Marc");
    PlantNode plant5 = new PlantNode(new LatLng(52, -49), testGinseng, "Marc");

    //test PlantNode ArrayList (use ArrayList because it's better & more dynamic than Java's native arrays
    ArrayList<PlantNode> plantNodes = new ArrayList<PlantNode>();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        //initialize test plants
        plantNodes.add(plant1);
        plantNodes.add(plant2);
        plantNodes.add(plant3);
        plantNodes.add(plant4);
        plantNodes.add(plant5);



        setContentView(R.layout.activity_urban_map);
        setUpMapIfNeeded();
    }

    @Override
    protected void onResume() {
        super.onResume();
        setUpMapIfNeeded();
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu items for use in the action bar
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.main_menu, menu);
        return super.onCreateOptionsMenu(menu);
       }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {

        switch (item.getItemId())
        {
            case R.id.newUser:
                Log.e("newUser" ,"new User Clicked" );
                return true;
            case R.id.login:
                Log.e("newUser" ,"login Clicked" );
                return true;
            case R.id.about:
                Log.e("newUser" ,"about Clicked" );
                return true;
            default:
                return super.onOptionsItemSelected(item);
        }

        //return true;
    }


    /**
     * Sets up the map if it is possible to do so (i.e., the Google Play services APK is correctly
     * installed) and the map has not already been instantiated.. This will ensure that we only ever
     * call {@link #setUpMap()} once when {@link #mMap} is not null.
     * <p>
     * If it isn't installed {@link SupportMapFragment} (and
     * {@link com.google.android.gms.maps.MapView MapView}) will show a prompt for the user to
     * install/update the Google Play services APK on their device.
     * <p>
     * A user can return to this FragmentActivity after following the prompt and correctly
     * installing/updating/enabling the Google Play services. Since the FragmentActivity may not
     * have been completely destroyed during this process (it is likely that it would only be
     * stopped or paused), {@link #onCreate(Bundle)} may not be called again so we should call this
     * method in {@link #onResume()} to guarantee that it will be called.
     */
    private void setUpMapIfNeeded() {
        // Do a null check to confirm that we have not already instantiated the map.
        if (mMap == null) {
            // Try to obtain the map from the SupportMapFragment.
            mMap = ((SupportMapFragment) getSupportFragmentManager().findFragmentById(R.id.map))
                    .getMap();
            // Check if we were successful in obtaining the map.
            if (mMap != null) {
                setUpMap();
            }
        }
    }



    private void setUpMap() {
        for (PlantNode node : plantNodes) {
            mMap.addMarker(new MarkerOptions().position(node.coordinates).title(node.plant.name + " (" + node.plant.scientificName + ")"));
        }
    }

    public void getFromDatabase()
    {
        Statement sqlString = null;
        try {
            Connection getCon = DriverManager.getConnection(host, uName, uPass);
            //sqlString;
        }
        catch ( SQLException err ) {
            Log.e("SQL" ,err.getMessage( ) );
        }



    }

    public void putToDatabase()
    {
        try {
            Connection putCon = DriverManager.getConnection(host, uName, uPass);
        }
        catch ( SQLException err ) {
            Log.e("SQL" ,err.getMessage( ) );
        }

    }

}
