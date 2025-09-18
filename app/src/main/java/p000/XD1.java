package p000;

import com.google.android.gms.common.api.internal.ListenerHolder;

/* loaded from: classes.dex */
public final class XD1 implements ListenerHolder.Notifier {

    /* renamed from: a */
    public final /* synthetic */ BinderC8699aE1 f13623a;

    public XD1(BinderC8699aE1 binderC8699aE1) {
        this.f13623a = binderC8699aE1;
    }

    @Override // com.google.android.gms.common.api.internal.ListenerHolder.Notifier
    public final /* bridge */ /* synthetic */ void notifyListener(Object obj) {
        this.f13623a.f15400a.zzb();
    }

    @Override // com.google.android.gms.common.api.internal.ListenerHolder.Notifier
    public final void onNotifyListenerFailed() {
    }
}
