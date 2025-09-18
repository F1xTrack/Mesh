package p000;

import android.app.PendingIntent;
import android.location.Location;
import android.os.Looper;
import android.os.RemoteException;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.PendingResult;
import com.google.android.gms.common.api.internal.ListenerHolders;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.location.FusedLocationProviderApi;
import com.google.android.gms.location.LastLocationRequest;
import com.google.android.gms.location.LocationAvailability;
import com.google.android.gms.location.LocationCallback;
import com.google.android.gms.location.LocationListener;
import com.google.android.gms.location.LocationRequest;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: kA1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C9976kA1 implements FusedLocationProviderApi {
    /* renamed from: a */
    public static S81 m22159a(AbstractC9336fA1 abstractC9336fA1) {
        S81 s81 = new S81();
        s81.f10598a.mo11135b(new A61(8, abstractC9336fA1));
        return s81;
    }

    @Override // com.google.android.gms.location.FusedLocationProviderApi
    public final PendingResult flushLocations(GoogleApiClient googleApiClient) {
        return googleApiClient.execute(new C8247Ry1(googleApiClient));
    }

    @Override // com.google.android.gms.location.FusedLocationProviderApi
    public final Location getLastLocation(GoogleApiClient googleApiClient) throws Throwable {
        boolean zAwait;
        boolean z = false;
        Preconditions.checkArgument(googleApiClient != null, "GoogleApiClient parameter is required.");
        C11900zE1 c11900zE1 = (C11900zE1) googleApiClient.getClient(RB1.f10059a);
        AtomicReference atomicReference = new AtomicReference();
        CountDownLatch countDownLatch = new CountDownLatch(1);
        S81 s81 = new S81();
        try {
            c11900zE1.m26343j(new LastLocationRequest.Builder().build(), s81);
            s81.f10598a.mo11135b(new C7967Mo1(atomicReference, countDownLatch));
            try {
                long nanos = TimeUnit.SECONDS.toNanos(30L);
                long jNanoTime = System.nanoTime() + nanos;
                while (true) {
                    try {
                        try {
                            zAwait = countDownLatch.await(nanos, TimeUnit.NANOSECONDS);
                            break;
                        } catch (Throwable th) {
                            th = th;
                            z = true;
                            if (z) {
                                Thread.currentThread().interrupt();
                            }
                            throw th;
                        }
                    } catch (InterruptedException unused) {
                        nanos = jNanoTime - System.nanoTime();
                        z = true;
                    }
                }
                if (z) {
                    Thread.currentThread().interrupt();
                }
                if (zAwait) {
                    return (Location) atomicReference.get();
                }
                return null;
            } catch (Throwable th2) {
                th = th2;
            }
        } catch (Exception unused2) {
            return null;
        }
    }

    @Override // com.google.android.gms.location.FusedLocationProviderApi
    public final LocationAvailability getLocationAvailability(GoogleApiClient googleApiClient) {
        Preconditions.checkArgument(googleApiClient != null, "GoogleApiClient parameter is required.");
        try {
            return ((C11900zE1) googleApiClient.getClient(RB1.f10059a)).m26341h();
        } catch (RemoteException unused) {
            return null;
        }
    }

    @Override // com.google.android.gms.location.FusedLocationProviderApi
    public final PendingResult removeLocationUpdates(GoogleApiClient googleApiClient, PendingIntent pendingIntent) {
        return googleApiClient.execute(new C7469Cz1(googleApiClient, pendingIntent));
    }

    @Override // com.google.android.gms.location.FusedLocationProviderApi
    public final PendingResult requestLocationUpdates(GoogleApiClient googleApiClient, LocationRequest locationRequest, PendingIntent pendingIntent) {
        return googleApiClient.execute(new C10334mz1(googleApiClient, locationRequest, pendingIntent));
    }

    @Override // com.google.android.gms.location.FusedLocationProviderApi
    public final PendingResult setMockLocation(GoogleApiClient googleApiClient, Location location) {
        return googleApiClient.execute(new C8457Vz1(googleApiClient, location));
    }

    @Override // com.google.android.gms.location.FusedLocationProviderApi
    public final PendingResult setMockMode(GoogleApiClient googleApiClient, boolean z) {
        return googleApiClient.execute(new C8145Pz1(googleApiClient, z));
    }

    @Override // com.google.android.gms.location.FusedLocationProviderApi
    public final PendingResult removeLocationUpdates(GoogleApiClient googleApiClient, LocationCallback locationCallback) {
        return googleApiClient.execute(new C7833Jz1(googleApiClient, locationCallback));
    }

    @Override // com.google.android.gms.location.FusedLocationProviderApi
    public final PendingResult requestLocationUpdates(GoogleApiClient googleApiClient, LocationRequest locationRequest, LocationCallback locationCallback, Looper looper) {
        if (looper == null) {
            looper = Looper.myLooper();
            Preconditions.checkNotNull(looper, "invalid null looper");
        }
        return googleApiClient.execute(new C9566gz1(googleApiClient, ListenerHolders.createListenerHolder(locationCallback, looper, "LocationCallback"), locationRequest));
    }

    @Override // com.google.android.gms.location.FusedLocationProviderApi
    public final PendingResult removeLocationUpdates(GoogleApiClient googleApiClient, LocationListener locationListener) {
        return googleApiClient.execute(new C11358uz1(googleApiClient, locationListener));
    }

    @Override // com.google.android.gms.location.FusedLocationProviderApi
    public final PendingResult requestLocationUpdates(GoogleApiClient googleApiClient, LocationRequest locationRequest, LocationListener locationListener) {
        Looper looperMyLooper = Looper.myLooper();
        Preconditions.checkNotNull(looperMyLooper, "invalid null looper");
        return googleApiClient.execute(new C8611Yy1(googleApiClient, ListenerHolders.createListenerHolder(locationListener, looperMyLooper, "LocationListener"), locationRequest));
    }

    @Override // com.google.android.gms.location.FusedLocationProviderApi
    public final PendingResult requestLocationUpdates(GoogleApiClient googleApiClient, LocationRequest locationRequest, LocationListener locationListener, Looper looper) {
        if (looper == null) {
            looper = Looper.myLooper();
            Preconditions.checkNotNull(looper, "invalid null looper");
        }
        return googleApiClient.execute(new C8611Yy1(googleApiClient, ListenerHolders.createListenerHolder(locationListener, looper, "LocationListener"), locationRequest));
    }
}
