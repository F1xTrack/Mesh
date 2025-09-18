package p000;

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

    /* renamed from: a */
    public static final Api.ClientKey f10059a;

    /* renamed from: b */
    public static final Api f10060b;

    static {
        Api.ClientKey clientKey = new Api.ClientKey();
        f10059a = clientKey;
        f10060b = new Api("LocationServices.API", new EB1(), clientKey);
    }

    /* renamed from: a */
    public final Task m6921a(LocationRequest locationRequest, ListenerHolder listenerHolder) {
        NB1 nb1 = new NB1(this, listenerHolder, C7460Cv0.f1758h);
        return doRegisterEventListener(RegistrationMethods.builder().register(new C8165Qj1(nb1, locationRequest)).unregister(nb1).withHolder(listenerHolder).setMethodKey(2436).build());
    }

    /* renamed from: b */
    public final Task m6922b(LocationRequest locationRequest, ListenerHolder listenerHolder) {
        NB1 nb1 = new NB1(this, listenerHolder, C7616Fv0.f3481i);
        return doRegisterEventListener(RegistrationMethods.builder().register(new C0827N8(nb1, 28, locationRequest)).unregister(nb1).withHolder(listenerHolder).setMethodKey(2435).build());
    }

    @Override // com.google.android.gms.location.FusedLocationProviderClient
    public final Task flushLocations() {
        return doWrite(TaskApiCall.builder().run(C7408Bv0.f1083h).setMethodKey(2422).build());
    }

    @Override // com.google.android.gms.location.FusedLocationProviderClient
    public final Task getCurrentLocation(int i, AbstractC0933Op abstractC0933Op) {
        CurrentLocationRequest.Builder builder = new CurrentLocationRequest.Builder();
        builder.setPriority(i);
        CurrentLocationRequest currentLocationRequestBuild = builder.build();
        if (abstractC0933Op != null) {
            Preconditions.checkArgument(!((FA1) abstractC0933Op).f3084a.mo11143j(), "cancellationToken may not be already canceled");
        }
        Task taskDoRead = doRead(TaskApiCall.builder().run(new C8389Ur1(currentLocationRequestBuild, 4, abstractC0933Op)).setMethodKey(2415).build());
        if (abstractC0933Op == null) {
            return taskDoRead;
        }
        S81 s81 = new S81(abstractC0933Op);
        C10909rT0 c10909rT0 = new C10909rT0(s81);
        C9450g32 c9450g32 = (C9450g32) taskDoRead;
        c9450g32.getClass();
        c9450g32.mo11139f(Y81.f14171a, c10909rT0);
        return s81.f10598a;
    }

    @Override // com.google.android.gms.location.FusedLocationProviderClient
    public final Task getLastLocation() {
        return doRead(TaskApiCall.builder().run(OL0.f8372g).setMethodKey(2414).build());
    }

    @Override // com.google.android.gms.location.FusedLocationProviderClient
    public final Task getLocationAvailability() {
        return doRead(TaskApiCall.builder().run(C7512Dv0.f2304g).setMethodKey(2416).build());
    }

    @Override // com.google.android.gms.location.FusedLocationProviderClient
    public final Task removeLocationUpdates(PendingIntent pendingIntent) {
        return doWrite(TaskApiCall.builder().run(new C10525oT0(pendingIntent)).setMethodKey(2418).build());
    }

    @Override // com.google.android.gms.location.FusedLocationProviderClient
    public final Task requestLocationUpdates(LocationRequest locationRequest, PendingIntent pendingIntent) {
        return doWrite(TaskApiCall.builder().run(new ES1(pendingIntent, locationRequest, false, 27)).setMethodKey(2417).build());
    }

    @Override // com.google.android.gms.location.FusedLocationProviderClient
    public final Task setMockLocation(Location location) {
        Preconditions.checkArgument(location != null);
        return doWrite(TaskApiCall.builder().run(new C11287uQ0(location)).setMethodKey(2421).build());
    }

    @Override // com.google.android.gms.location.FusedLocationProviderClient
    public final Task setMockMode(boolean z) {
        return doWrite(TaskApiCall.builder().run(new C0328FC(z, false)).setMethodKey(2420).build());
    }

    @Override // com.google.android.gms.location.FusedLocationProviderClient
    public final Task getLastLocation(LastLocationRequest lastLocationRequest) {
        return doRead(TaskApiCall.builder().run(new L21(7, lastLocationRequest)).setMethodKey(2414).setFeatures(zzm.zzf).build());
    }

    @Override // com.google.android.gms.location.FusedLocationProviderClient
    public final Task removeLocationUpdates(LocationCallback locationCallback) {
        return doUnregisterEventListener(ListenerHolders.createListenerKey(locationCallback, "LocationCallback"), 2418).mo11139f(ExecutorC1215TJ.f11318d, C7564Ev0.f2966i);
    }

    @Override // com.google.android.gms.location.FusedLocationProviderClient
    public final Task requestLocationUpdates(LocationRequest locationRequest, LocationCallback locationCallback, Looper looper) {
        if (looper == null) {
            looper = Looper.myLooper();
            Preconditions.checkNotNull(looper, "invalid null looper");
        }
        return m6921a(locationRequest, ListenerHolders.createListenerHolder(locationCallback, looper, "LocationCallback"));
    }

    @Override // com.google.android.gms.location.FusedLocationProviderClient
    public final Task removeLocationUpdates(LocationListener locationListener) {
        return doUnregisterEventListener(ListenerHolders.createListenerKey(locationListener, "LocationListener"), 2418).mo11139f(ExecutorC1215TJ.f11318d, OJ1.f8360f);
    }

    @Override // com.google.android.gms.location.FusedLocationProviderClient
    public final Task requestLocationUpdates(LocationRequest locationRequest, LocationListener locationListener, Looper looper) {
        if (looper == null) {
            looper = Looper.myLooper();
            Preconditions.checkNotNull(looper, "invalid null looper");
        }
        return m6922b(locationRequest, ListenerHolders.createListenerHolder(locationListener, looper, "LocationListener"));
    }

    @Override // com.google.android.gms.location.FusedLocationProviderClient
    public final Task getCurrentLocation(CurrentLocationRequest currentLocationRequest, AbstractC0933Op abstractC0933Op) {
        if (abstractC0933Op != null) {
            Preconditions.checkArgument(!((FA1) abstractC0933Op).f3084a.mo11143j(), "cancellationToken may not be already canceled");
        }
        Task taskDoRead = doRead(TaskApiCall.builder().run(new C8389Ur1(currentLocationRequest, 4, abstractC0933Op)).setMethodKey(2415).build());
        if (abstractC0933Op == null) {
            return taskDoRead;
        }
        S81 s81 = new S81(abstractC0933Op);
        C10909rT0 c10909rT0 = new C10909rT0(s81);
        C9450g32 c9450g32 = (C9450g32) taskDoRead;
        c9450g32.getClass();
        c9450g32.mo11139f(Y81.f14171a, c10909rT0);
        return s81.f10598a;
    }

    @Override // com.google.android.gms.location.FusedLocationProviderClient
    public final Task requestLocationUpdates(LocationRequest locationRequest, Executor executor, LocationCallback locationCallback) {
        return m6921a(locationRequest, ListenerHolders.createListenerHolder(locationCallback, executor, "LocationCallback"));
    }

    @Override // com.google.android.gms.location.FusedLocationProviderClient
    public final Task requestLocationUpdates(LocationRequest locationRequest, Executor executor, LocationListener locationListener) {
        return m6922b(locationRequest, ListenerHolders.createListenerHolder(locationListener, executor, "LocationListener"));
    }
}
