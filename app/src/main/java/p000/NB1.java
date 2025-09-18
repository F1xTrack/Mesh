package p000;

import com.google.android.gms.common.api.internal.ListenerHolder;
import com.google.android.gms.common.api.internal.RemoteCall;

/* loaded from: classes.dex */
public final class NB1 implements RemoteCall, OD1 {

    /* renamed from: a */
    public final JB1 f7541a;

    /* renamed from: b */
    public ListenerHolder f7542b;

    /* renamed from: c */
    public boolean f7543c = true;

    /* renamed from: d */
    public final /* synthetic */ RB1 f7544d;

    public NB1(RB1 rb1, ListenerHolder listenerHolder, JB1 jb1) {
        this.f7544d = rb1;
        this.f7542b = listenerHolder;
        this.f7541a = jb1;
    }

    @Override // com.google.android.gms.common.api.internal.RemoteCall
    public final /* bridge */ /* synthetic */ void accept(Object obj, Object obj2) {
        ListenerHolder.ListenerKey listenerKey;
        boolean z;
        C11900zE1 c11900zE1 = (C11900zE1) obj;
        S81 s81 = (S81) obj2;
        synchronized (this) {
            listenerKey = this.f7542b.getListenerKey();
            z = this.f7543c;
            this.f7542b.clear();
        }
        if (listenerKey == null) {
            s81.m7184b(Boolean.FALSE);
        } else {
            this.f7541a.mo1467Z(c11900zE1, listenerKey, z, s81);
        }
    }

    @Override // p000.OD1
    /* renamed from: c */
    public final synchronized void mo5581c(ListenerHolder listenerHolder) {
        ListenerHolder listenerHolder2 = this.f7542b;
        if (listenerHolder2 != listenerHolder) {
            listenerHolder2.clear();
            this.f7542b = listenerHolder;
        }
    }

    @Override // p000.OD1
    public final synchronized ListenerHolder zza() {
        return this.f7542b;
    }

    @Override // p000.OD1
    public final void zzb() {
        ListenerHolder.ListenerKey<?> listenerKey;
        synchronized (this) {
            this.f7543c = false;
            listenerKey = this.f7542b.getListenerKey();
        }
        if (listenerKey != null) {
            this.f7544d.doUnregisterEventListener(listenerKey, 2441);
        }
    }
}
