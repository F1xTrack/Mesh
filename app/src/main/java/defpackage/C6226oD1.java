package defpackage;

import android.os.RemoteException;
import com.google.android.gms.common.api.internal.ListenerHolders;
import com.google.android.gms.location.LocationCallback;
import com.google.android.gms.location.LocationResult;

/* renamed from: oD1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C6226oD1 extends LocationCallback {
    public final /* synthetic */ S81 b;
    public final /* synthetic */ C8325zE1 g;

    public C6226oD1(C8325zE1 c8325zE1, S81 s81) {
        this.g = c8325zE1;
        this.b = s81;
    }

    @Override // com.google.android.gms.location.LocationCallback
    public final void onLocationResult(LocationResult locationResult) {
        this.b.d(locationResult.getLastLocation());
        try {
            this.g.d(ListenerHolders.createListenerKey(this, "GetCurrentLocation"), false, new S81());
        } catch (RemoteException unused) {
        }
    }
}
