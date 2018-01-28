package semana2.curso4.mapas;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import com.google.android.gms.maps.model.LatLng;

public class MainActivity extends AppCompatActivity {

    private ImageView iv_park, iv_restaurant, iv_food, iv_mall;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        iv_park = (ImageView) findViewById(R.id.iv_park);
        iv_park.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                goToMapsActivity(-2.104146, -79.899766);
            }
        });
        iv_restaurant = (ImageView) findViewById(R.id.iv_restaurant);
        iv_restaurant.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                goToMapsActivity(-2.172957, -79.914395);
            }
        });
        iv_food = (ImageView) findViewById(R.id.iv_food);
        iv_food.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                goToMapsActivity(-2.161540, -79.916478);
            }
        });
        iv_mall = (ImageView) findViewById(R.id.iv_mall);
        iv_mall.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                goToMapsActivity(-2.155286, -79.892789);
            }
        });
    }

    private void goToMapsActivity(double latitude, double longitude) {
        Intent mapsActivity = new Intent(MainActivity.this, MapsActivity.class);
        mapsActivity.putExtra("latitude", latitude);
        mapsActivity.putExtra("longitude", longitude);
        startActivity(mapsActivity);
    }

}
