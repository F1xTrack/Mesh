package defpackage;

import android.app.PendingIntent;
import android.content.Context;
import android.location.Location;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.common.Feature;
import com.google.android.gms.common.api.internal.ConnectionCallbacks;
import com.google.android.gms.common.api.internal.ListenerHolder;
import com.google.android.gms.common.api.internal.OnConnectionFailedListener;
import com.google.android.gms.common.internal.ClientSettings;
import com.google.android.gms.common.internal.GmsClient;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.location.GeofencingRequest;
import com.google.android.gms.location.LastLocationRequest;
import com.google.android.gms.location.LocationAvailability;
import com.google.android.gms.location.LocationRequest;
import com.google.android.gms.location.zzm;
import java.util.List;

/* renamed from: zE1 */
/* loaded from: classes.dex */
public final class C8325zE1 extends GmsClient {
    public final L01 a;
    public final L01 b;
    public final L01 c;

    public C8325zE1(Context context, Looper looper, ClientSettings clientSettings, ConnectionCallbacks connectionCallbacks, OnConnectionFailedListener onConnectionFailedListener) {
        super(context, looper, 23, clientSettings, connectionCallbacks, onConnectionFailedListener);
        this.a = new L01();
        this.b = new L01();
        this.c = new L01();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void c(S81 s81, boolean z) {
        if (!g(zzm.zzg)) {
            C2341bW1 c2341bW1 = (C2341bW1) ((InterfaceC3600eX1) getService());
            Parcel parcelZza = c2341bW1.zza();
            int i = LC1.a;
            parcelZza.writeInt(z ? 1 : 0);
            c2341bW1.zzc(12, parcelZza);
            s81.b(null);
            return;
        }
        InterfaceC3600eX1 interfaceC3600eX1 = (InterfaceC3600eX1) getService();
        BinderC6989sD1 binderC6989sD1 = new BinderC6989sD1(null, s81);
        C2341bW1 c2341bW12 = (C2341bW1) interfaceC3600eX1;
        Parcel parcelZza2 = c2341bW12.zza();
        int i2 = LC1.a;
        parcelZza2.writeInt(z ? 1 : 0);
        LC1.d(parcelZza2, binderC6989sD1);
        c2341bW12.zzc(84, parcelZza2);
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient
    public final /* synthetic */ IInterface createServiceInterface(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.location.internal.IGoogleLocationManagerService");
        return iInterfaceQueryLocalInterface instanceof InterfaceC3600eX1 ? (InterfaceC3600eX1) iInterfaceQueryLocalInterface : new C2341bW1(iBinder);
    }

    public final void d(ListenerHolder.ListenerKey listenerKey, boolean z, S81 s81) {
        synchronized (this.b) {
            try {
                BinderC2096aE1 binderC2096aE1 = (BinderC2096aE1) this.b.remove(listenerKey);
                if (binderC2096aE1 == null) {
                    s81.b(Boolean.FALSE);
                    return;
                }
                binderC2096aE1.a.zza().clear();
                if (!z) {
                    s81.b(Boolean.TRUE);
                } else if (g(zzm.zzj)) {
                    InterfaceC3600eX1 interfaceC3600eX1 = (InterfaceC3600eX1) getService();
                    BE1 be1 = new BE1(2, null, binderC2096aE1, null, null, null);
                    BinderC6989sD1 binderC6989sD1 = new BinderC6989sD1(Boolean.TRUE, s81);
                    C2341bW1 c2341bW1 = (C2341bW1) interfaceC3600eX1;
                    Parcel parcelZza = c2341bW1.zza();
                    LC1.c(parcelZza, be1);
                    LC1.d(parcelZza, binderC6989sD1);
                    c2341bW1.zzc(89, parcelZza);
                } else {
                    ((C2341bW1) ((InterfaceC3600eX1) getService())).H(new LE1(2, null, null, binderC2096aE1, null, new BinderC7752wD1(Boolean.TRUE, s81), null));
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void e(ListenerHolder.ListenerKey listenerKey, boolean z, S81 s81) {
        synchronized (this.a) {
            try {
                BinderC6038nE1 binderC6038nE1 = (BinderC6038nE1) this.a.remove(listenerKey);
                if (binderC6038nE1 == null) {
                    s81.b(Boolean.FALSE);
                    return;
                }
                binderC6038nE1.a.zza().clear();
                if (!z) {
                    s81.b(Boolean.TRUE);
                } else if (g(zzm.zzj)) {
                    InterfaceC3600eX1 interfaceC3600eX1 = (InterfaceC3600eX1) getService();
                    BE1 be1 = new BE1(1, null, binderC6038nE1, null, null, null);
                    BinderC6989sD1 binderC6989sD1 = new BinderC6989sD1(Boolean.TRUE, s81);
                    C2341bW1 c2341bW1 = (C2341bW1) interfaceC3600eX1;
                    Parcel parcelZza = c2341bW1.zza();
                    LC1.c(parcelZza, be1);
                    LC1.d(parcelZza, binderC6989sD1);
                    c2341bW1.zzc(89, parcelZza);
                } else {
                    ((C2341bW1) ((InterfaceC3600eX1) getService())).H(new LE1(2, null, binderC6038nE1, null, null, new BinderC7752wD1(Boolean.TRUE, s81), null));
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void f(PendingIntent pendingIntent, S81 s81) {
        if (!g(zzm.zzj)) {
            ((C2341bW1) ((InterfaceC3600eX1) getService())).H(new LE1(2, null, null, null, pendingIntent, new BinderC7752wD1(null, s81), null));
            return;
        }
        InterfaceC3600eX1 interfaceC3600eX1 = (InterfaceC3600eX1) getService();
        BE1 be1 = new BE1(3, null, null, pendingIntent, null, null);
        BinderC6989sD1 binderC6989sD1 = new BinderC6989sD1(null, s81);
        C2341bW1 c2341bW1 = (C2341bW1) interfaceC3600eX1;
        Parcel parcelZza = c2341bW1.zza();
        LC1.c(parcelZza, be1);
        LC1.d(parcelZza, binderC6989sD1);
        c2341bW1.zzc(89, parcelZza);
    }

    public final boolean g(Feature feature) {
        Feature feature2;
        Feature[] availableFeatures = getAvailableFeatures();
        if (availableFeatures == null) {
            return false;
        }
        int length = availableFeatures.length;
        int i = 0;
        while (true) {
            if (i >= length) {
                feature2 = null;
                break;
            }
            feature2 = availableFeatures[i];
            if (feature.getName().equals(feature2.getName())) {
                break;
            }
            i++;
        }
        return feature2 != null && feature2.getVersion() >= feature.getVersion();
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient
    public final Feature[] getApiFeatures() {
        return zzm.zzl;
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient, com.google.android.gms.common.api.Api.Client
    public final int getMinApkVersion() {
        return 11717000;
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient
    public final String getServiceDescriptor() {
        return "com.google.android.gms.location.internal.IGoogleLocationManagerService";
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient
    public final String getStartServiceAction() {
        return "com.google.android.location.internal.GoogleLocationManagerService.START";
    }

    public final LocationAvailability h() throws RemoteException {
        InterfaceC3600eX1 interfaceC3600eX1 = (InterfaceC3600eX1) getService();
        String packageName = getContext().getPackageName();
        C2341bW1 c2341bW1 = (C2341bW1) interfaceC3600eX1;
        Parcel parcelZza = c2341bW1.zza();
        parcelZza.writeString(packageName);
        Parcel parcelZzb = c2341bW1.zzb(34, parcelZza);
        LocationAvailability locationAvailability = (LocationAvailability) LC1.a(parcelZzb, LocationAvailability.CREATOR);
        parcelZzb.recycle();
        return locationAvailability;
    }

    public final void i(GeofencingRequest geofencingRequest, PendingIntent pendingIntent, S81 s81) {
        Preconditions.checkNotNull(geofencingRequest, "geofencingRequest can't be null.");
        Preconditions.checkNotNull(pendingIntent, "PendingIntent must be specified.");
        InterfaceC3600eX1 interfaceC3600eX1 = (InterfaceC3600eX1) getService();
        BinderC5844mD1 binderC5844mD1 = new BinderC5844mD1(0, s81);
        C2341bW1 c2341bW1 = (C2341bW1) interfaceC3600eX1;
        Parcel parcelZza = c2341bW1.zza();
        LC1.c(parcelZza, geofencingRequest);
        LC1.c(parcelZza, pendingIntent);
        LC1.d(parcelZza, binderC5844mD1);
        c2341bW1.zzc(57, parcelZza);
    }

    public final void j(LastLocationRequest lastLocationRequest, S81 s81) {
        getContext();
        if (!g(zzm.zzf)) {
            C2341bW1 c2341bW1 = (C2341bW1) ((InterfaceC3600eX1) getService());
            Parcel parcelZzb = c2341bW1.zzb(7, c2341bW1.zza());
            Location location = (Location) LC1.a(parcelZzb, Location.CREATOR);
            parcelZzb.recycle();
            s81.b(location);
            return;
        }
        InterfaceC3600eX1 interfaceC3600eX1 = (InterfaceC3600eX1) getService();
        BinderC5844mD1 binderC5844mD1 = new BinderC5844mD1(1, s81);
        C2341bW1 c2341bW12 = (C2341bW1) interfaceC3600eX1;
        Parcel parcelZza = c2341bW12.zza();
        LC1.c(parcelZza, lastLocationRequest);
        LC1.d(parcelZza, binderC5844mD1);
        c2341bW12.zzc(82, parcelZza);
    }

    public final void k(OD1 od1, LocationRequest locationRequest, S81 s81) {
        BinderC2096aE1 binderC2096aE1;
        ListenerHolder listenerHolderZza = od1.zza();
        ListenerHolder.ListenerKey listenerKey = listenerHolderZza.getListenerKey();
        listenerKey.getClass();
        boolean zG = g(zzm.zzj);
        synchronized (this.b) {
            try {
                BinderC2096aE1 binderC2096aE12 = (BinderC2096aE1) this.b.getOrDefault(listenerKey, null);
                if (binderC2096aE12 == null || zG) {
                    BinderC2096aE1 binderC2096aE13 = new BinderC2096aE1(od1);
                    this.b.put(listenerKey, binderC2096aE13);
                    binderC2096aE1 = binderC2096aE13;
                } else {
                    binderC2096aE12.a.c(listenerHolderZza);
                    binderC2096aE1 = binderC2096aE12;
                    binderC2096aE12 = null;
                }
                getContext();
                String idString = listenerKey.toIdString();
                if (zG) {
                    ((C2341bW1) ((InterfaceC3600eX1) getService())).G(new BE1(2, binderC2096aE12 == null ? null : binderC2096aE12, binderC2096aE1, null, null, idString), locationRequest, new BinderC6989sD1(null, s81));
                } else {
                    InterfaceC3600eX1 interfaceC3600eX1 = (InterfaceC3600eX1) getService();
                    LocationRequest.Builder builder = new LocationRequest.Builder(locationRequest);
                    builder.zzb(null);
                    ((C2341bW1) interfaceC3600eX1).H(new LE1(1, new FE1(builder.build(), null, false, false, null, false, false, null, Long.MAX_VALUE), null, binderC2096aE1, null, new BinderC7752wD1(s81, binderC2096aE1, 2), idString));
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void l(OD1 od1, LocationRequest locationRequest, S81 s81) {
        BinderC6038nE1 binderC6038nE1;
        ListenerHolder listenerHolderZza = od1.zza();
        ListenerHolder.ListenerKey listenerKey = listenerHolderZza.getListenerKey();
        listenerKey.getClass();
        boolean zG = g(zzm.zzj);
        synchronized (this.a) {
            try {
                BinderC6038nE1 binderC6038nE12 = (BinderC6038nE1) this.a.getOrDefault(listenerKey, null);
                if (binderC6038nE12 == null || zG) {
                    BinderC6038nE1 binderC6038nE13 = new BinderC6038nE1(od1);
                    this.a.put(listenerKey, binderC6038nE13);
                    binderC6038nE1 = binderC6038nE13;
                } else {
                    binderC6038nE12.a.c(listenerHolderZza);
                    binderC6038nE1 = binderC6038nE12;
                    binderC6038nE12 = null;
                }
                getContext();
                String idString = listenerKey.toIdString();
                if (zG) {
                    ((C2341bW1) ((InterfaceC3600eX1) getService())).G(new BE1(1, binderC6038nE12 == null ? null : binderC6038nE12, binderC6038nE1, null, null, idString), locationRequest, new BinderC6989sD1(null, s81));
                } else {
                    InterfaceC3600eX1 interfaceC3600eX1 = (InterfaceC3600eX1) getService();
                    LocationRequest.Builder builder = new LocationRequest.Builder(locationRequest);
                    builder.zzb(null);
                    ((C2341bW1) interfaceC3600eX1).H(new LE1(1, new FE1(builder.build(), null, false, false, null, false, false, null, Long.MAX_VALUE), binderC6038nE1, null, null, new BinderC7752wD1(s81, binderC6038nE1, 1), idString));
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void m(PendingIntent pendingIntent, LocationRequest locationRequest, S81 s81) {
        getContext();
        if (g(zzm.zzj)) {
            ((C2341bW1) ((InterfaceC3600eX1) getService())).G(new BE1(3, null, null, pendingIntent, null, null), locationRequest, new BinderC6989sD1(null, s81));
        } else {
            InterfaceC3600eX1 interfaceC3600eX1 = (InterfaceC3600eX1) getService();
            LocationRequest.Builder builder = new LocationRequest.Builder(locationRequest);
            builder.zzb(null);
            ((C2341bW1) interfaceC3600eX1).H(new LE1(1, new FE1(builder.build(), null, false, false, null, false, false, null, Long.MAX_VALUE), null, null, pendingIntent, new BinderC7752wD1(null, s81), AbstractC7209tN0.u(pendingIntent.hashCode(), "PendingIntent@")));
        }
    }

    public final void n(PendingIntent pendingIntent, S81 s81) {
        Preconditions.checkNotNull(pendingIntent, "PendingIntent must be specified.");
        InterfaceC3600eX1 interfaceC3600eX1 = (InterfaceC3600eX1) getService();
        BinderC5844mD1 binderC5844mD1 = new BinderC5844mD1(0, s81);
        String packageName = getContext().getPackageName();
        C2341bW1 c2341bW1 = (C2341bW1) interfaceC3600eX1;
        Parcel parcelZza = c2341bW1.zza();
        LC1.c(parcelZza, pendingIntent);
        LC1.d(parcelZza, binderC5844mD1);
        parcelZza.writeString(packageName);
        c2341bW1.zzc(2, parcelZza);
    }

    public final void o(List list, S81 s81) throws RemoteException {
        Preconditions.checkArgument((list == null || list.isEmpty()) ? false : true, "geofenceRequestIds can't be null nor empty.");
        String[] strArr = (String[]) list.toArray(new String[0]);
        InterfaceC3600eX1 interfaceC3600eX1 = (InterfaceC3600eX1) getService();
        BinderC5844mD1 binderC5844mD1 = new BinderC5844mD1(0, s81);
        String packageName = getContext().getPackageName();
        C2341bW1 c2341bW1 = (C2341bW1) interfaceC3600eX1;
        Parcel parcelZza = c2341bW1.zza();
        parcelZza.writeStringArray(strArr);
        LC1.d(parcelZza, binderC5844mD1);
        parcelZza.writeString(packageName);
        c2341bW1.zzc(3, parcelZza);
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient
    public final void onConnectionSuspended(int i) {
        super.onConnectionSuspended(i);
        synchronized (this.a) {
            this.a.clear();
        }
        synchronized (this.b) {
            this.b.clear();
        }
        synchronized (this.c) {
            this.c.clear();
        }
    }

    public final void p(Location location, S81 s81) {
        if (!g(zzm.zzh)) {
            C2341bW1 c2341bW1 = (C2341bW1) ((InterfaceC3600eX1) getService());
            Parcel parcelZza = c2341bW1.zza();
            LC1.c(parcelZza, location);
            c2341bW1.zzc(13, parcelZza);
            s81.b(null);
            return;
        }
        InterfaceC3600eX1 interfaceC3600eX1 = (InterfaceC3600eX1) getService();
        BinderC6989sD1 binderC6989sD1 = new BinderC6989sD1(null, s81);
        C2341bW1 c2341bW12 = (C2341bW1) interfaceC3600eX1;
        Parcel parcelZza2 = c2341bW12.zza();
        LC1.c(parcelZza2, location);
        LC1.d(parcelZza2, binderC6989sD1);
        c2341bW12.zzc(85, parcelZza2);
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient
    public final boolean usesClientTelemetry() {
        return true;
    }
}
