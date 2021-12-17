package com.example.finddoccusco;

import androidx.core.app.ActivityCompat;
import androidx.core.content.ContextCompat;
import androidx.fragment.app.FragmentActivity;

import android.Manifest;
import android.content.Context;
import android.content.pm.PackageManager;
import android.location.Location;
import android.location.LocationListener;
import android.location.LocationManager;
import android.os.Bundle;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.google.android.gms.maps.model.CameraPosition;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;
import com.example.finddoccusco.databinding.ActivityEspecialistasCercanosBinding;

public class especialistas_cercanos extends FragmentActivity implements OnMapReadyCallback {

    private GoogleMap mMap;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_especialistas_cercanos);
        // Obtain the SupportMapFragment and get notified when the map is ready to be used.
        SupportMapFragment mapFragment = (SupportMapFragment) getSupportFragmentManager()
                .findFragmentById(R.id.map);
        mapFragment.getMapAsync(this);
        getLocalizacion();

    }

    private void getLocalizacion() {
        int permiso = ContextCompat.checkSelfPermission(this, Manifest.permission.ACCESS_COARSE_LOCATION);
        if(permiso == PackageManager.PERMISSION_DENIED){
            if(ActivityCompat.shouldShowRequestPermissionRationale(this, Manifest.permission.ACCESS_FINE_LOCATION)){
            }else{
                ActivityCompat.requestPermissions(this, new String[]{Manifest.permission.ACCESS_FINE_LOCATION}, 1);
            }
        }
    }

    @Override
    public void onMapReady(GoogleMap googleMap) {
        mMap = googleMap;
        if (ActivityCompat.checkSelfPermission(this, Manifest.permission.ACCESS_FINE_LOCATION) != PackageManager.PERMISSION_GRANTED && ActivityCompat.checkSelfPermission(this, Manifest.permission.ACCESS_COARSE_LOCATION) != PackageManager.PERMISSION_GRANTED) {
            // TODO: Consider calling
            //    ActivityCompat#requestPermissions
            // here to request the missing permissions, and then overriding
            //   public void onRequestPermissionsResult(int requestCode, String[] permissions,
            //                                          int[] grantResults)
            // to handle the case where the user grants the permission. See the documentation
            // for ActivityCompat#requestPermissions for more details.
            return;
        }
        mMap.setMyLocationEnabled(true);

        mMap.getUiSettings().setMyLocationButtonEnabled(false);

        LocationManager locationManager = (LocationManager) especialistas_cercanos.this.getSystemService(Context.LOCATION_SERVICE);
        LocationListener locationListener = new LocationListener() {
            @Override
            public void onLocationChanged(Location location) {
                LatLng miUbicacion = new LatLng(location.getLatitude(), location.getLongitude());
                mMap.addMarker(new MarkerOptions().position(miUbicacion).title("Estas aqui")
                        .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_ROSE)));
                mMap.moveCamera(CameraUpdateFactory.newLatLng(miUbicacion));
                CameraPosition cameraPosition = new CameraPosition.Builder()
                        .target(miUbicacion)
                        .zoom(16)
                        .bearing(90)
                        .tilt(45)
                        .build();
                mMap.animateCamera(CameraUpdateFactory.newCameraPosition(cameraPosition));
            }
            @Override
            public void onStatusChanged(String provider, int status, Bundle extras) {
            }
            @Override
            public void onProviderEnabled(String provider) {
            }
            @Override
            public void onProviderDisabled(String provider) {
            }
        };
        locationManager.requestLocationUpdates(LocationManager.NETWORK_PROVIDER, 0, 0, locationListener);



        // Ubicaciones de doctores wilson
        LatLng doc1 = new LatLng(-11.912826, -77.057584);
        mMap.addMarker(new MarkerOptions().position(doc1).title("Dr. Wilson Holguin Herrera").snippet("Medico General ⭐⭐⭐⭐")
                .icon(BitmapDescriptorFactory.fromResource(R.drawable.infodocicono)));
        LatLng doc2 = new LatLng(-11.913310, -77.056700);
        mMap.addMarker(new MarkerOptions().position(doc2).title("Lic. Diana Ocampo Nuñez").snippet("Enfermera ⭐⭐")
                .icon(BitmapDescriptorFactory.fromResource(R.drawable.infodocicono)));
        LatLng doc3 = new LatLng(-11.911465, -77.054390);
        mMap.addMarker(new MarkerOptions().position(doc3).title("Dra. Milagros Ali Benavente").snippet("Cardiologa ⭐⭐⭐")
                .icon(BitmapDescriptorFactory.fromResource(R.drawable.infodocicono)));
        LatLng doc4 = new LatLng(-11.913200, -77.054243);
        mMap.addMarker(new MarkerOptions().position(doc4).title("Dra. Yulieth Ccala Ccopa").snippet("Dermatologa ⭐⭐⭐")
                .icon(BitmapDescriptorFactory.fromResource(R.drawable.infodocicono)));
        LatLng doc5 = new LatLng(-11.915352, -77.057729);
        mMap.addMarker(new MarkerOptions().position(doc5).title("Dra. Monica Duelas Huaquisto").snippet("Endocrinologa ⭐⭐⭐⭐")
                .icon(BitmapDescriptorFactory.fromResource(R.drawable.infodocicono)));
        LatLng doc6 = new LatLng(-11.911220, -77.058631);
        mMap.addMarker(new MarkerOptions().position(doc6).title("Dra. Yaracely Ayquipa Chacon").snippet("Medico General ⭐⭐⭐⭐⭐")
                .icon(BitmapDescriptorFactory.fromResource(R.drawable.infodocicono)));
        LatLng doc7 = new LatLng(-11.912637, -77.055096);
        mMap.addMarker(new MarkerOptions().position(doc7).title("Lic. Mariana Paz Rivas").snippet("Enfermera ⭐⭐")
                .icon(BitmapDescriptorFactory.fromResource(R.drawable.infodocicono)));
        LatLng doc8 = new LatLng(-11.915520, -77.054165);
        mMap.addMarker(new MarkerOptions().position(doc8).title("Dra. Lizeth Rodriguez Aparicio").snippet("Cardiologa ⭐")
                .icon(BitmapDescriptorFactory.fromResource(R.drawable.infodocicono)));
        LatLng doc9 = new LatLng(-11.910942, -77.057243);
        mMap.addMarker(new MarkerOptions().position(doc9).title("Dra. Blanca Ccama Huaranca").snippet("Dermatologa ⭐⭐⭐")
                .icon(BitmapDescriptorFactory.fromResource(R.drawable.infodocicono)));
        LatLng doc10 = new LatLng(-11.911815, -77.056446);
        mMap.addMarker(new MarkerOptions().position(doc10).title("Dra. Indira Gomez Huanca").snippet("Endocrinologa ⭐⭐")
                .icon(BitmapDescriptorFactory.fromResource(R.drawable.infodocicono)));

        //********************************************************
        // Ubicaciones de doctores Romulo
        LatLng doc11 = new LatLng(-13.523916,-71.988656);
        mMap.addMarker(new MarkerOptions().position(doc11).title("Dr. Donny Holguin Herrera").snippet("Medico General ⭐⭐⭐⭐")
                .icon(BitmapDescriptorFactory.fromResource(R.drawable.infodocicono)));

        LatLng doc12 = new LatLng(-13.524941,-71.990518);
        mMap.addMarker(new MarkerOptions().position(doc12).title("Lic. Sharely Mujica Hurtado").snippet("Enfermera ⭐⭐")
                .icon(BitmapDescriptorFactory.fromResource(R.drawable.infodocicono)));

        LatLng doc13 = new LatLng(-13.526299,-71.988839);
        mMap.addMarker(new MarkerOptions().position(doc13).title("Dra. Nathaly Arias Quispe").snippet("Endocrinologa ⭐⭐⭐")
                .icon(BitmapDescriptorFactory.fromResource(R.drawable.infodocicono)));

        LatLng doc14 = new LatLng(-13.526387,-71.989575);
        mMap.addMarker(new MarkerOptions().position(doc14).title("Dra. Alexandra Mercedes Concha").snippet("Dermatologa ⭐⭐⭐⭐")
                .icon(BitmapDescriptorFactory.fromResource(R.drawable.infodocicono)));

        LatLng doc15 = new LatLng(-13.526205,-71.991102);
        mMap.addMarker(new MarkerOptions().position(doc15).title("Dra. Indira Gomez Huanca").snippet("Endocrinologa ⭐⭐")
                .icon(BitmapDescriptorFactory.fromResource(R.drawable.infodocicono)));

        LatLng doc16 = new LatLng(-13.523641,-71.989487);
        mMap.addMarker(new MarkerOptions().position(doc16).title("Dra. Fiorella Moscoso Cuyo").snippet("Endocrinologa  ⭐")
                .icon(BitmapDescriptorFactory.fromResource(R.drawable.infodocicono)));

        LatLng doc17 = new LatLng(-13.525534,-71.988825);
        mMap.addMarker(new MarkerOptions().position(doc17).title("Dr. Paolo Guerrero Suarez").snippet("Medico General ⭐⭐⭐")
                .icon(BitmapDescriptorFactory.fromResource(R.drawable.infodocicono)));

        LatLng doc18 = new LatLng(-13.525531,-71.990369);
        mMap.addMarker(new MarkerOptions().position(doc18).title("Lic. Daniela Mendoza Gil").snippet("Enfermera ⭐⭐⭐⭐")
                .icon(BitmapDescriptorFactory.fromResource(R.drawable.infodocicono)));



        // Ubicaciones de doctores Pool
        LatLng doc19 = new LatLng(-12.998009828468907, -70.53439290743745);
        mMap.addMarker(new MarkerOptions().position(doc19).title("Dra. Eva Luna Bautizta").snippet("Medico General ⭐⭐⭐")
                .icon(BitmapDescriptorFactory.fromResource(R.drawable.infodocicono)));

        LatLng doc20 = new LatLng(-12.998024629275433, -70.53529924463629);
        mMap.addMarker(new MarkerOptions().position(doc20).title("Lic. Mauro Tapia Baca").snippet("Enfermero  ⭐")
                .icon(BitmapDescriptorFactory.fromResource(R.drawable.infodocicono)));

        LatLng doc21 = new LatLng(-12.997701478092456, -70.53472961931746);
        mMap.addMarker(new MarkerOptions().position(doc21).title("Dra. Kassandra Baca Zanabria").snippet("Cardiologa ⭐⭐")
                .icon(BitmapDescriptorFactory.fromResource(R.drawable.infodocicono)));

        LatLng doc22 = new LatLng(-13.00150593795787, -70.53012291933734);
        mMap.addMarker(new MarkerOptions().position(doc22).title("Dra. Flor Condo peralta").snippet("Dermatologa ⭐⭐⭐⭐")
                .icon(BitmapDescriptorFactory.fromResource(R.drawable.infodocicono)));

        LatLng doc23 = new LatLng(-13.000818595375952, -70.5307784034816);
        mMap.addMarker(new MarkerOptions().position(doc23).title("Dra. Liz Quispe Farfan").snippet("Endocrinologa ⭐⭐⭐⭐⭐")
                .icon(BitmapDescriptorFactory.fromResource(R.drawable.infodocicono)));

        LatLng doc24 = new LatLng(-12.993735335546702, -70.52656110831532);
        mMap.addMarker(new MarkerOptions().position(doc24).title("Dr. Bryan Ccopa Queso").snippet("Cardiologo ⭐⭐⭐")
                .icon(BitmapDescriptorFactory.fromResource(R.drawable.infodocicono)));

        LatLng doc25 = new LatLng(-12.993622635700966, -70.52468482402752);
        mMap.addMarker(new MarkerOptions().position(doc25).title("Dr. Max Cuadros Gutierrez").snippet("Dermatologo ⭐⭐⭐")
                .icon(BitmapDescriptorFactory.fromResource(R.drawable.infodocicono)));
    }
}