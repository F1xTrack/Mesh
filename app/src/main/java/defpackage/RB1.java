package defpackage;

import android.app.PendingIntent;
import android.location.Location;
import android.os.Looper;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.GoogleApi;
import com.google.android.gms.common.api.internal.ListenerHolder;
import com.google.android.gms.common.api.internal.ListenerHolders;
import com.google.android.gms.common.api.internal.RegistrationMethods;
import com.google.android.gms.common.api.internal.TaskApiCall;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.location.CurrentLocationRequest;
import com.google.android.gms.location.FusedLocationProviderClient;
import com.google.android.gms.location.LastLocationRequest;
import com.google.android.gms.location.LocationCallback;
import com.google.android.gms.location.LocationListener;
import com.google.android.gms.location.LocationRequest;
import com.google.android.gms.location.zzm;
import com.google.android.gms.tasks.Task;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public final class RB1 extends GoogleApi implements FusedLocationProviderClient {
    public static final Api.ClientKey a;
    public static final Api b;

    static {
        Api.ClientKey clientKey = new Api.ClientKey();
        a = clientKey;
        b = new Api("LocationServices.API", new EB1(), clientKey);
    }

    public final Task a(LocationRequest locationRequest, ListenerHolder listenerHolder) {
        NB1 nb1 = new NB1(this, listenerHolder, C0240Cv0.h);
        return doRegisterEventListener(RegistrationMethods.builder().register(new C1296Qj1(nb1, locationRequest)).unregister(nb1).withHolder(listenerHolder).setMethodKey(2436).build());
    }

    public final Task b(LocationRequest locationRequest, ListenerHolder listenerHolder) {
        NB1 nb1 = new NB1(this, listenerHolder, C0474Fv0.i);
        return doRegisterEventListener(RegistrationMethods.builder().register(new N8(nb1, 28, locationRequest)).unregister(nb1).withHolder(listenerHolder).setMethodKey(2435).build());
    }

    @Override // com.google.android.gms.location.FusedLocationProviderClient
    public final Task flushLocations() {
        return doWrite(TaskApiCall.builder().run(C0162Bv0.h).setMethodKey(2422).build());
    }

    @Override // com.google.android.gms.location.FusedLocationProviderClient
    public final Task getCurrentLocation(int i, AbstractC1156Op abstractC1156Op) {
        CurrentLocationRequest.Builder builder = new CurrentLocationRequest.Builder();
        builder.setPriority(i);
        CurrentLocationRequest currentLocationRequestBuild = builder.build();
        if (abstractC1156Op != null) {
            Preconditions.checkArgument(!((FA1) abstractC1156Op).a.j(), "cancellationToken may not be already canceled");
        }
        Task taskDoRead = doRead(TaskApiCall.builder().run(new C1632Ur1(currentLocationRequestBuild, 4, abstractC1156Op)).setMethodKey(2415).build());
        if (abstractC1156Op == null) {
            return taskDoRead;
        }
        S81 s81 = new S81(abstractC1156Op);
        C6845rT0 c6845rT0 = new C6845rT0(s81);
        C3892g32 c3892g32 = (C3892g32) taskDoRead;
        c3892g32.getClass();
        c3892g32.f(Y81.a, c6845rT0);
        return s81.a;
    }

    @Override // com.google.android.gms.location.FusedLocationProviderClient
    public final Task getLastLocation() {
        return doRead(TaskApiCall.builder().run(OL0.g).setMethodKey(2414).build());
    }

    @Override // com.google.android.gms.location.FusedLocationProviderClient
    public final Task getLocationAvailability() {
        return doRead(TaskApiCall.builder().run(C0318Dv0.g).setMethodKey(2416).build());
    }

    @Override // com.google.android.gms.location.FusedLocationProviderClient
    public final Task removeLocationUpdates(PendingIntent pendingIntent) {
        return doWrite(TaskApiCall.builder().run(new C6273oT0(pendingIntent)).setMethodKey(2418).build());
    }

    @Override // com.google.android.gms.location.FusedLocationProviderClient
    public final Task requestLocationUpdates(LocationRequest locationRequest, PendingIntent pendingIntent) {
        return doWrite(TaskApiCall.builder().run(new ES1(pendingIntent, locationRequest, false, 27)).setMethodKey(2417).build());
    }

    @Override // com.google.android.gms.location.FusedLocationProviderClient
    public final Task setMockLocation(Location location) {
        Preconditions.checkArgument(location != null);
        return doWrite(TaskApiCall.builder().run(new C7409uQ0(location)).setMethodKey(2421).build());
    }

    @Override // com.google.android.gms.location.FusedLocationProviderClient
    public final Task setMockMode(boolean z) {
        return doWrite(TaskApiCall.builder().run(new FC(z, false)).setMethodKey(2420).build());
    }

    @Override // com.google.android.gms.location.FusedLocationProviderClient
    public final Task getLastLocation(LastLocationRequest lastLocationRequest) {
        return doRead(TaskApiCall.builder().run(new L21(7, lastLocationRequest)).setMethodKey(2414).setFeatures(zzm.zzf).build());
    }

    @Override // com.google.android.gms.location.FusedLocationProviderClient
    public final Task removeLocationUpdates(LocationCallback locationCallback) {
        return doUnregisterEventListener(ListenerHolders.createListenerKey(locationCallback, "LocationCallback"), 2418).f(TJ.d, C0396Ev0.i);
    }

    @Override // com.google.android.gms.location.FusedLocationProviderClient
    public final Task requestLocationUpdates(LocationRequest locationRequest, LocationCallback locationCallback, Looper looper) {
        if (looper == null) {
            looper = Looper.myLooper();
            Preconditions.checkNotNull(looper, "invalid null looper");
        }
        return a(locationRequest, ListenerHolders.createListenerHolder(locationCallback, looper, "LocationCallback"));
    }

    @Override // com.google.android.gms.location.FusedLocationProviderClient
    public final Task removeLocationUpdates(LocationListener locationListener) {
        return doUnregisterEventListener(ListenerHolders.createListenerKey(locationListener, "LocationListener"), 2418).f(TJ.d, OJ1.f);
    }

    @Override // com.google.android.gms.location.FusedLocationProviderClient
    public final Task requestLocationUpdates(LocationRequest locationRequest, LocationListener locationListener, Looper looper) {
        if (looper == null) {
            looper = Looper.myLooper();
            Preconditions.checkNotNull(looper, "invalid null looper");
        }
        return b(locationRequest, ListenerHolders.createListenerHolder(locationListener, looper, "LocationListener"));
    }

    @Override // com.google.android.gms.location.FusedLocationProviderClient
    public final Task getCurrentLocation(CurrentLocationRequest currentLocationRequest, AbstractC1156Op abstractC1156Op) {
        if (abstractC1156Op != null) {
            Preconditions.checkArgument(!((FA1) abstractC1156Op).a.j(), "cancellationToken may not be already canceled");
        }
        Task taskDoRead = doRead(TaskApiCall.builder().run(new C1632Ur1(currentLocationRequest, 4, abstractC1156Op)).setMethodKey(2415).build());
        if (abstractC1156Op == null) {
            return taskDoRead;
        }
        S81 s81 = new S81(abstractC1156Op);
        C6845rT0 c6845rT0 = new C6845rT0(s81);
        C3892g32 c3892g32 = (C3892g32) taskDoRead;
        c3892g32.getClass();
        c3892g32.f(Y81.a, c6845rT0);
        return s81.a;
    }

    @Override // com.google.android.gms.location.FusedLocationProviderClient
    public final Task requestLocationUpdates(LocationRequest locationRequest, Executor executor, LocationCallback locationCallback) {
        return a(locationRequest, ListenerHolders.createListenerHolder(locationCallback, executor, "LocationCallback"));
    }

    @Override // com.google.android.gms.location.FusedLocationProviderClient
    public final Task requestLocationUpdates(LocationRequest locationRequest, Executor executor, LocationListener locationListener) {
        return b(locationRequest, ListenerHolders.createListenerHolder(locationListener, executor, "LocationListener"));
    }
}
