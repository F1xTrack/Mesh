package p000;

import com.google.android.gms.common.api.internal.ListenerHolder;
import com.google.android.gms.location.LocationCallback;
import com.google.android.gms.location.LocationResult;

/* loaded from: classes.dex */
public final class RD1 implements ListenerHolder.Notifier {

    /* renamed from: a */
    public final /* synthetic */ LocationResult f10064a;

    public RD1(LocationResult locationResult) {
        this.f10064a = locationResult;
    }

    @Override // com.google.android.gms.common.api.internal.ListenerHolder.Notifier
    public final /* synthetic */ void notifyListener(Object obj) {
        ((LocationCallback) obj).onLocationResult(this.f10064a);
    }

    @Override // com.google.android.gms.common.api.internal.ListenerHolder.Notifier
    public final void onNotifyListenerFailed() {
    }
}
