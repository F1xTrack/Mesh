package p000;

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
public final class C11900zE1 extends GmsClient {

    /* renamed from: a */
    public final L01 f46740a;

    /* renamed from: b */
    public final L01 f46741b;

    /* renamed from: c */
    public final L01 f46742c;

    public C11900zE1(Context context, Looper looper, ClientSettings clientSettings, ConnectionCallbacks connectionCallbacks, OnConnectionFailedListener onConnectionFailedListener) {
        super(context, looper, 23, clientSettings, connectionCallbacks, onConnectionFailedListener);
        this.f46740a = new L01();
        this.f46741b = new L01();
        this.f46742c = new L01();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: c */
    public final void m26336c(S81 s81, boolean z) {
        if (!m26340g(zzm.zzg)) {
            C8863bW1 c8863bW1 = (C8863bW1) ((InterfaceC9254eX1) getService());
            Parcel parcelZza = c8863bW1.zza();
            int i = LC1.f6548a;
            parcelZza.writeInt(z ? 1 : 0);
            c8863bW1.zzc(12, parcelZza);
            s81.m7184b(null);
            return;
        }
        InterfaceC9254eX1 interfaceC9254eX1 = (InterfaceC9254eX1) getService();
        BinderC11006sD1 binderC11006sD1 = new BinderC11006sD1(null, s81);
        C8863bW1 c8863bW12 = (C8863bW1) interfaceC9254eX1;
        Parcel parcelZza2 = c8863bW12.zza();
        int i2 = LC1.f6548a;
        parcelZza2.writeInt(z ? 1 : 0);
        LC1.m4926d(parcelZza2, binderC11006sD1);
        c8863bW12.zzc(84, parcelZza2);
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient
    public final /* synthetic */ IInterface createServiceInterface(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.location.internal.IGoogleLocationManagerService");
        return iInterfaceQueryLocalInterface instanceof InterfaceC9254eX1 ? (InterfaceC9254eX1) iInterfaceQueryLocalInterface : new C8863bW1(iBinder);
    }

    /* renamed from: d */
    public final void m26337d(ListenerHolder.ListenerKey listenerKey, boolean z, S81 s81) {
        synchronized (this.f46741b) {
            try {
                BinderC8699aE1 binderC8699aE1 = (BinderC8699aE1) this.f46741b.remove(listenerKey);
                if (binderC8699aE1 == null) {
                    s81.m7184b(Boolean.FALSE);
                    return;
                }
                binderC8699aE1.f15400a.zza().clear();
                if (!z) {
                    s81.m7184b(Boolean.TRUE);
                } else if (m26340g(zzm.zzj)) {
                    InterfaceC9254eX1 interfaceC9254eX1 = (InterfaceC9254eX1) getService();
                    BE1 be1 = new BE1(2, null, binderC8699aE1, null, null, null);
                    BinderC11006sD1 binderC11006sD1 = new BinderC11006sD1(Boolean.TRUE, s81);
                    C8863bW1 c8863bW1 = (C8863bW1) interfaceC9254eX1;
                    Parcel parcelZza = c8863bW1.zza();
                    LC1.m4925c(parcelZza, be1);
                    LC1.m4926d(parcelZza, binderC11006sD1);
                    c8863bW1.zzc(89, parcelZza);
                } else {
                    ((C8863bW1) ((InterfaceC9254eX1) getService())).m10458H(new LE1(2, null, null, binderC8699aE1, null, new BinderC11517wD1(Boolean.TRUE, s81), null));
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* renamed from: e */
    public final void m26338e(ListenerHolder.ListenerKey listenerKey, boolean z, S81 s81) {
        synchronized (this.f46740a) {
            try {
                BinderC10368nE1 binderC10368nE1 = (BinderC10368nE1) this.f46740a.remove(listenerKey);
                if (binderC10368nE1 == null) {
                    s81.m7184b(Boolean.FALSE);
                    return;
                }
                binderC10368nE1.f38191a.zza().clear();
                if (!z) {
                    s81.m7184b(Boolean.TRUE);
                } else if (m26340g(zzm.zzj)) {
                    InterfaceC9254eX1 interfaceC9254eX1 = (InterfaceC9254eX1) getService();
                    BE1 be1 = new BE1(1, null, binderC10368nE1, null, null, null);
                    BinderC11006sD1 binderC11006sD1 = new BinderC11006sD1(Boolean.TRUE, s81);
                    C8863bW1 c8863bW1 = (C8863bW1) interfaceC9254eX1;
                    Parcel parcelZza = c8863bW1.zza();
                    LC1.m4925c(parcelZza, be1);
                    LC1.m4926d(parcelZza, binderC11006sD1);
                    c8863bW1.zzc(89, parcelZza);
                } else {
                    ((C8863bW1) ((InterfaceC9254eX1) getService())).m10458H(new LE1(2, null, binderC10368nE1, null, null, new BinderC11517wD1(Boolean.TRUE, s81), null));
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* renamed from: f */
    public final void m26339f(PendingIntent pendingIntent, S81 s81) {
        if (!m26340g(zzm.zzj)) {
            ((C8863bW1) ((InterfaceC9254eX1) getService())).m10458H(new LE1(2, null, null, null, pendingIntent, new BinderC11517wD1(null, s81), null));
            return;
        }
        InterfaceC9254eX1 interfaceC9254eX1 = (InterfaceC9254eX1) getService();
        BE1 be1 = new BE1(3, null, null, pendingIntent, null, null);
        BinderC11006sD1 binderC11006sD1 = new BinderC11006sD1(null, s81);
        C8863bW1 c8863bW1 = (C8863bW1) interfaceC9254eX1;
        Parcel parcelZza = c8863bW1.zza();
        LC1.m4925c(parcelZza, be1);
        LC1.m4926d(parcelZza, binderC11006sD1);
        c8863bW1.zzc(89, parcelZza);
    }

    /* renamed from: g */
    public final boolean m26340g(Feature feature) {
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

    /* renamed from: h */
    public final LocationAvailability m26341h() throws RemoteException {
        InterfaceC9254eX1 interfaceC9254eX1 = (InterfaceC9254eX1) getService();
        String packageName = getContext().getPackageName();
        C8863bW1 c8863bW1 = (C8863bW1) interfaceC9254eX1;
        Parcel parcelZza = c8863bW1.zza();
        parcelZza.writeString(packageName);
        Parcel parcelZzb = c8863bW1.zzb(34, parcelZza);
        LocationAvailability locationAvailability = (LocationAvailability) LC1.m4923a(parcelZzb, LocationAvailability.CREATOR);
        parcelZzb.recycle();
        return locationAvailability;
    }

    /* renamed from: i */
    public final void m26342i(GeofencingRequest geofencingRequest, PendingIntent pendingIntent, S81 s81) {
        Preconditions.checkNotNull(geofencingRequest, "geofencingRequest can't be null.");
        Preconditions.checkNotNull(pendingIntent, "PendingIntent must be specified.");
        InterfaceC9254eX1 interfaceC9254eX1 = (InterfaceC9254eX1) getService();
        BinderC10238mD1 binderC10238mD1 = new BinderC10238mD1(0, s81);
        C8863bW1 c8863bW1 = (C8863bW1) interfaceC9254eX1;
        Parcel parcelZza = c8863bW1.zza();
        LC1.m4925c(parcelZza, geofencingRequest);
        LC1.m4925c(parcelZza, pendingIntent);
        LC1.m4926d(parcelZza, binderC10238mD1);
        c8863bW1.zzc(57, parcelZza);
    }

    /* renamed from: j */
    public final void m26343j(LastLocationRequest lastLocationRequest, S81 s81) {
        getContext();
        if (!m26340g(zzm.zzf)) {
            C8863bW1 c8863bW1 = (C8863bW1) ((InterfaceC9254eX1) getService());
            Parcel parcelZzb = c8863bW1.zzb(7, c8863bW1.zza());
            Location location = (Location) LC1.m4923a(parcelZzb, Location.CREATOR);
            parcelZzb.recycle();
            s81.m7184b(location);
            return;
        }
        InterfaceC9254eX1 interfaceC9254eX1 = (InterfaceC9254eX1) getService();
        BinderC10238mD1 binderC10238mD1 = new BinderC10238mD1(1, s81);
        C8863bW1 c8863bW12 = (C8863bW1) interfaceC9254eX1;
        Parcel parcelZza = c8863bW12.zza();
        LC1.m4925c(parcelZza, lastLocationRequest);
        LC1.m4926d(parcelZza, binderC10238mD1);
        c8863bW12.zzc(82, parcelZza);
    }

    /* renamed from: k */
    public final void m26344k(OD1 od1, LocationRequest locationRequest, S81 s81) {
        BinderC8699aE1 binderC8699aE1;
        ListenerHolder listenerHolderZza = od1.zza();
        ListenerHolder.ListenerKey listenerKey = listenerHolderZza.getListenerKey();
        listenerKey.getClass();
        boolean zM26340g = m26340g(zzm.zzj);
        synchronized (this.f46741b) {
            try {
                BinderC8699aE1 binderC8699aE12 = (BinderC8699aE1) this.f46741b.getOrDefault(listenerKey, null);
                if (binderC8699aE12 == null || zM26340g) {
                    BinderC8699aE1 binderC8699aE13 = new BinderC8699aE1(od1);
                    this.f46741b.put(listenerKey, binderC8699aE13);
                    binderC8699aE1 = binderC8699aE13;
                } else {
                    binderC8699aE12.f15400a.mo5581c(listenerHolderZza);
                    binderC8699aE1 = binderC8699aE12;
                    binderC8699aE12 = null;
                }
                getContext();
                String idString = listenerKey.toIdString();
                if (zM26340g) {
                    ((C8863bW1) ((InterfaceC9254eX1) getService())).m10457G(new BE1(2, binderC8699aE12 == null ? null : binderC8699aE12, binderC8699aE1, null, null, idString), locationRequest, new BinderC11006sD1(null, s81));
                } else {
                    InterfaceC9254eX1 interfaceC9254eX1 = (InterfaceC9254eX1) getService();
                    LocationRequest.Builder builder = new LocationRequest.Builder(locationRequest);
                    builder.zzb(null);
                    ((C8863bW1) interfaceC9254eX1).m10458H(new LE1(1, new FE1(builder.build(), null, false, false, null, false, false, null, Long.MAX_VALUE), null, binderC8699aE1, null, new BinderC11517wD1(s81, binderC8699aE1, 2), idString));
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* renamed from: l */
    public final void m26345l(OD1 od1, LocationRequest locationRequest, S81 s81) {
        BinderC10368nE1 binderC10368nE1;
        ListenerHolder listenerHolderZza = od1.zza();
        ListenerHolder.ListenerKey listenerKey = listenerHolderZza.getListenerKey();
        listenerKey.getClass();
        boolean zM26340g = m26340g(zzm.zzj);
        synchronized (this.f46740a) {
            try {
                BinderC10368nE1 binderC10368nE12 = (BinderC10368nE1) this.f46740a.getOrDefault(listenerKey, null);
                if (binderC10368nE12 == null || zM26340g) {
                    BinderC10368nE1 binderC10368nE13 = new BinderC10368nE1(od1);
                    this.f46740a.put(listenerKey, binderC10368nE13);
                    binderC10368nE1 = binderC10368nE13;
                } else {
                    binderC10368nE12.f38191a.mo5581c(listenerHolderZza);
                    binderC10368nE1 = binderC10368nE12;
                    binderC10368nE12 = null;
                }
                getContext();
                String idString = listenerKey.toIdString();
                if (zM26340g) {
                    ((C8863bW1) ((InterfaceC9254eX1) getService())).m10457G(new BE1(1, binderC10368nE12 == null ? null : binderC10368nE12, binderC10368nE1, null, null, idString), locationRequest, new BinderC11006sD1(null, s81));
                } else {
                    InterfaceC9254eX1 interfaceC9254eX1 = (InterfaceC9254eX1) getService();
                    LocationRequest.Builder builder = new LocationRequest.Builder(locationRequest);
                    builder.zzb(null);
                    ((C8863bW1) interfaceC9254eX1).m10458H(new LE1(1, new FE1(builder.build(), null, false, false, null, false, false, null, Long.MAX_VALUE), binderC10368nE1, null, null, new BinderC11517wD1(s81, binderC10368nE1, 1), idString));
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* renamed from: m */
    public final void m26346m(PendingIntent pendingIntent, LocationRequest locationRequest, S81 s81) {
        getContext();
        if (m26340g(zzm.zzj)) {
            ((C8863bW1) ((InterfaceC9254eX1) getService())).m10457G(new BE1(3, null, null, pendingIntent, null, null), locationRequest, new BinderC11006sD1(null, s81));
        } else {
            InterfaceC9254eX1 interfaceC9254eX1 = (InterfaceC9254eX1) getService();
            LocationRequest.Builder builder = new LocationRequest.Builder(locationRequest);
            builder.zzb(null);
            ((C8863bW1) interfaceC9254eX1).m10458H(new LE1(1, new FE1(builder.build(), null, false, false, null, false, false, null, Long.MAX_VALUE), null, null, pendingIntent, new BinderC11517wD1(null, s81), AbstractC11153tN0.m24909u(pendingIntent.hashCode(), "PendingIntent@")));
        }
    }

    /* renamed from: n */
    public final void m26347n(PendingIntent pendingIntent, S81 s81) {
        Preconditions.checkNotNull(pendingIntent, "PendingIntent must be specified.");
        InterfaceC9254eX1 interfaceC9254eX1 = (InterfaceC9254eX1) getService();
        BinderC10238mD1 binderC10238mD1 = new BinderC10238mD1(0, s81);
        String packageName = getContext().getPackageName();
        C8863bW1 c8863bW1 = (C8863bW1) interfaceC9254eX1;
        Parcel parcelZza = c8863bW1.zza();
        LC1.m4925c(parcelZza, pendingIntent);
        LC1.m4926d(parcelZza, binderC10238mD1);
        parcelZza.writeString(packageName);
        c8863bW1.zzc(2, parcelZza);
    }

    /* renamed from: o */
    public final void m26348o(List list, S81 s81) throws RemoteException {
        Preconditions.checkArgument((list == null || list.isEmpty()) ? false : true, "geofenceRequestIds can't be null nor empty.");
        String[] strArr = (String[]) list.toArray(new String[0]);
        InterfaceC9254eX1 interfaceC9254eX1 = (InterfaceC9254eX1) getService();
        BinderC10238mD1 binderC10238mD1 = new BinderC10238mD1(0, s81);
        String packageName = getContext().getPackageName();
        C8863bW1 c8863bW1 = (C8863bW1) interfaceC9254eX1;
        Parcel parcelZza = c8863bW1.zza();
        parcelZza.writeStringArray(strArr);
        LC1.m4926d(parcelZza, binderC10238mD1);
        parcelZza.writeString(packageName);
        c8863bW1.zzc(3, parcelZza);
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient
    public final void onConnectionSuspended(int i) {
        super.onConnectionSuspended(i);
        synchronized (this.f46740a) {
            this.f46740a.clear();
        }
        synchronized (this.f46741b) {
            this.f46741b.clear();
        }
        synchronized (this.f46742c) {
            this.f46742c.clear();
        }
    }

    /* renamed from: p */
    public final void m26349p(Location location, S81 s81) {
        if (!m26340g(zzm.zzh)) {
            C8863bW1 c8863bW1 = (C8863bW1) ((InterfaceC9254eX1) getService());
            Parcel parcelZza = c8863bW1.zza();
            LC1.m4925c(parcelZza, location);
            c8863bW1.zzc(13, parcelZza);
            s81.m7184b(null);
            return;
        }
        InterfaceC9254eX1 interfaceC9254eX1 = (InterfaceC9254eX1) getService();
        BinderC11006sD1 binderC11006sD1 = new BinderC11006sD1(null, s81);
        C8863bW1 c8863bW12 = (C8863bW1) interfaceC9254eX1;
        Parcel parcelZza2 = c8863bW12.zza();
        LC1.m4925c(parcelZza2, location);
        LC1.m4926d(parcelZza2, binderC11006sD1);
        c8863bW12.zzc(85, parcelZza2);
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient
    public final boolean usesClientTelemetry() {
        return true;
    }
}
