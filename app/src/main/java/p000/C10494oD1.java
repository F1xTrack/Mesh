package p000;

import android.os.RemoteException;
import com.google.android.gms.common.api.internal.ListenerHolders;
import com.google.android.gms.location.LocationCallback;
import com.google.android.gms.location.LocationResult;

/* renamed from: oD1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C10494oD1 extends LocationCallback {

    /* renamed from: b */
    public final /* synthetic */ S81 f38894b;

    /* renamed from: g */
    public final /* synthetic */ C11900zE1 f38895g;

    public C10494oD1(C11900zE1 c11900zE1, S81 s81) {
        this.f38895g = c11900zE1;
        this.f38894b = s81;
    }

    @Override // com.google.android.gms.location.LocationCallback
    public final void onLocationResult(LocationResult locationResult) {
        this.f38894b.m7186d(locationResult.getLastLocation());
        try {
            this.f38895g.m26337d(ListenerHolders.createListenerKey(this, "GetCurrentLocation"), false, new S81());
        } catch (RemoteException unused) {
        }
    }
}
