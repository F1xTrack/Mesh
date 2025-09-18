package p000;

import android.location.Location;
import com.google.android.gms.common.api.internal.ListenerHolder;
import com.google.android.gms.location.LocationListener;

/* renamed from: eE1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C9216eE1 implements ListenerHolder.Notifier {

    /* renamed from: a */
    public final /* synthetic */ Location f26610a;

    public C9216eE1(Location location) {
        this.f26610a = location;
    }

    @Override // com.google.android.gms.common.api.internal.ListenerHolder.Notifier
    public final /* bridge */ /* synthetic */ void notifyListener(Object obj) {
        ((LocationListener) obj).onLocationChanged(this.f26610a);
    }

    @Override // com.google.android.gms.common.api.internal.ListenerHolder.Notifier
    public final void onNotifyListenerFailed() {
    }
}
