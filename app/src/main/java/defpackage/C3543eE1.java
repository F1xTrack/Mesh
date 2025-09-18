package defpackage;

import android.location.Location;
import com.google.android.gms.common.api.internal.ListenerHolder;
import com.google.android.gms.location.LocationListener;

/* renamed from: eE1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C3543eE1 implements ListenerHolder.Notifier {
    public final /* synthetic */ Location a;

    public C3543eE1(Location location) {
        this.a = location;
    }

    @Override // com.google.android.gms.common.api.internal.ListenerHolder.Notifier
    public final /* bridge */ /* synthetic */ void notifyListener(Object obj) {
        ((LocationListener) obj).onLocationChanged(this.a);
    }

    @Override // com.google.android.gms.common.api.internal.ListenerHolder.Notifier
    public final void onNotifyListenerFailed() {
    }
}
