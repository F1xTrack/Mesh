package defpackage;

import com.google.android.gms.common.api.internal.ListenerHolder;

/* loaded from: classes.dex */
public final class XD1 implements ListenerHolder.Notifier {
    public final /* synthetic */ BinderC2096aE1 a;

    public XD1(BinderC2096aE1 binderC2096aE1) {
        this.a = binderC2096aE1;
    }

    @Override // com.google.android.gms.common.api.internal.ListenerHolder.Notifier
    public final /* bridge */ /* synthetic */ void notifyListener(Object obj) {
        this.a.a.zzb();
    }

    @Override // com.google.android.gms.common.api.internal.ListenerHolder.Notifier
    public final void onNotifyListenerFailed() {
    }
}
