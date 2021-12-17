package com.example.finddoccusco;

import androidx.fragment.app.FragmentActivity;

import android.os.Bundle;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;
import com.example.finddoccusco.databinding.ActivityUbicacionDocWisonBinding;

public class ubicacion_docWison extends FragmentActivity implements OnMapReadyCallback {

    private GoogleMap mMap;
    private ActivityUbicacionDocWisonBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        binding = ActivityUbicacionDocWisonBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        // Obtain the SupportMapFragment and get notified when the map is ready to be used.
        SupportMapFragment mapFragment = (SupportMapFragment) getSupportFragmentManager()
                .findFragmentById(R.id.map);
        mapFragment.getMapAsync(this);
    }

    @Override
    public void onMapReady(GoogleMap googleMap) {
        mMap = googleMap;

        // Add a marker in Sydney and move the camera
        LatLng uwilson = new LatLng(-11.910868, -77.057197);
        mMap.addMarker(new MarkerOptions().position(uwilson).title("Dr. Wilson Holguin" ).snippet("Medico General")
                .icon(BitmapDescriptorFactory.fromResource(R.drawable.logofinddocpequeno)));
        mMap.animateCamera(CameraUpdateFactory.newLatLngZoom(uwilson, 15), 5000, null);
    }
}