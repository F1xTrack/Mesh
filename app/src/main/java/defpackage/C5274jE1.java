package defpackage;

import com.google.android.gms.common.api.internal.ListenerHolder;

/* renamed from: jE1 */
/* loaded from: classes.dex */
public final class C5274jE1 implements ListenerHolder.Notifier {
    public final /* synthetic */ BinderC6038nE1 a;

    public C5274jE1(BinderC6038nE1 binderC6038nE1) {
        this.a = binderC6038nE1;
    }

    @Override // com.google.android.gms.common.api.internal.ListenerHolder.Notifier
    public final /* bridge */ /* synthetic */ void notifyListener(Object obj) {
        this.a.a.zzb();
    }

    @Override // com.google.android.gms.common.api.internal.ListenerHolder.Notifier
    public final void onNotifyListenerFailed() {
    }
}
