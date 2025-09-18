package p000;

import com.google.android.gms.common.api.internal.ListenerHolder;

/* renamed from: jE1 */
/* loaded from: classes.dex */
public final class C9856jE1 implements ListenerHolder.Notifier {

    /* renamed from: a */
    public final /* synthetic */ BinderC10368nE1 f35003a;

    public C9856jE1(BinderC10368nE1 binderC10368nE1) {
        this.f35003a = binderC10368nE1;
    }

    @Override // com.google.android.gms.common.api.internal.ListenerHolder.Notifier
    public final /* bridge */ /* synthetic */ void notifyListener(Object obj) {
        this.f35003a.f38191a.zzb();
    }

    @Override // com.google.android.gms.common.api.internal.ListenerHolder.Notifier
    public final void onNotifyListenerFailed() {
    }
}
