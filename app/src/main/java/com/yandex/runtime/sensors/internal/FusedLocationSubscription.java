package com.yandex.runtime.sensors.internal;

import android.content.pm.PackageManager;
import android.location.Location;
import android.os.Bundle;
import android.os.Looper;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.GoogleApiAvailability;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.location.FusedLocationProviderClient;
import com.google.android.gms.location.LocationCallback;
import com.google.android.gms.location.LocationRequest;
import com.google.android.gms.location.LocationResult;
import com.google.android.gms.location.LocationServices;
import com.yandex.runtime.NativeObject;
import com.yandex.runtime.Runtime;
import p000.AbstractC3982eJ;

/* loaded from: classes2.dex */
public class FusedLocationSubscription extends LocationCallback implements GoogleApiClient.ConnectionCallbacks, GoogleApiClient.OnConnectionFailedListener {
    private static final String LOG_TAG = "com.yandex.runtime.sensors.internal.FusedLocationSubscription";
    private FusedLocationProviderClient fusedLocationProviderClient = null;
    private GoogleApiClient googleApiClient = new GoogleApiClient.Builder(Runtime.getApplicationContext()).addApi(LocationServices.API).addConnectionCallbacks(this).addOnConnectionFailedListener(this).build();
    private LocationRequest locationRequest;
    NativeObject nativeObject;

    public FusedLocationSubscription(float f, int i, NativeObject nativeObject) {
        this.nativeObject = nativeObject;
        this.locationRequest = LocationRequest.create().setSmallestDisplacement(f).setInterval(i).setPriority(100);
        this.googleApiClient.connect();
    }

    public static final boolean fusedLocationProviderAvailable() {
        return GoogleApiAvailability.getInstance().isGooglePlayServicesAvailable(Runtime.getApplicationContext()) == 0 && getPlayServicesVersion() >= 11600000;
    }

    private static long getPlayServicesVersion() {
        try {
            return Runtime.getApplicationContext().getPackageManager().getPackageInfo("com.google.android.gms", 0).versionCode;
        } catch (PackageManager.NameNotFoundException unused) {
            return 0L;
        }
    }

    public static native void locationChanged(NativeObject nativeObject, Location location);

    public static native void statusChanged(NativeObject nativeObject, boolean z);

    @Override // com.google.android.gms.common.api.internal.ConnectionCallbacks
    public void onConnected(Bundle bundle) {
        if (AbstractC3982eJ.m17899a(Runtime.getApplicationContext(), "android.permission.ACCESS_FINE_LOCATION") != 0) {
            return;
        }
        FusedLocationProviderClient fusedLocationProviderClient = LocationServices.getFusedLocationProviderClient(Runtime.getApplicationContext());
        this.fusedLocationProviderClient = fusedLocationProviderClient;
        fusedLocationProviderClient.requestLocationUpdates(this.locationRequest, this, Looper.getMainLooper());
    }

    @Override // com.google.android.gms.common.api.internal.OnConnectionFailedListener
    public void onConnectionFailed(ConnectionResult connectionResult) {
        statusChanged(this.nativeObject, false);
    }

    @Override // com.google.android.gms.common.api.internal.ConnectionCallbacks
    public void onConnectionSuspended(int i) {
        statusChanged(this.nativeObject, false);
    }

    @Override // com.google.android.gms.location.LocationCallback
    public void onLocationResult(LocationResult locationResult) {
        locationChanged(this.nativeObject, locationResult.getLastLocation());
    }

    public void stop() {
        statusChanged(this.nativeObject, false);
        FusedLocationProviderClient fusedLocationProviderClient = this.fusedLocationProviderClient;
        if (fusedLocationProviderClient != null) {
            fusedLocationProviderClient.removeLocationUpdates(this);
        }
        this.googleApiClient.disconnect();
    }
}
