package defpackage;

import com.google.android.gms.common.api.internal.ListenerHolder;
import com.google.android.gms.common.api.internal.RemoteCall;

/* loaded from: classes.dex */
public final class NB1 implements RemoteCall, OD1 {
    public final JB1 a;
    public ListenerHolder b;
    public boolean c = true;
    public final /* synthetic */ RB1 d;

    public NB1(RB1 rb1, ListenerHolder listenerHolder, JB1 jb1) {
        this.d = rb1;
        this.b = listenerHolder;
        this.a = jb1;
    }

    @Override // com.google.android.gms.common.api.internal.RemoteCall
    public final /* bridge */ /* synthetic */ void accept(Object obj, Object obj2) {
        ListenerHolder.ListenerKey listenerKey;
        boolean z;
        C8325zE1 c8325zE1 = (C8325zE1) obj;
        S81 s81 = (S81) obj2;
        synchronized (this) {
            listenerKey = this.b.getListenerKey();
            z = this.c;
            this.b.clear();
        }
        if (listenerKey == null) {
            s81.b(Boolean.FALSE);
        } else {
            this.a.Z(c8325zE1, listenerKey, z, s81);
        }
    }

    @Override // defpackage.OD1
    public final synchronized void c(ListenerHolder listenerHolder) {
        ListenerHolder listenerHolder2 = this.b;
        if (listenerHolder2 != listenerHolder) {
            listenerHolder2.clear();
            this.b = listenerHolder;
        }
    }

    @Override // defpackage.OD1
    public final synchronized ListenerHolder zza() {
        return this.b;
    }

    @Override // defpackage.OD1
    public final void zzb() {
        ListenerHolder.ListenerKey<?> listenerKey;
        synchronized (this) {
            this.c = false;
            listenerKey = this.b.getListenerKey();
        }
        if (listenerKey != null) {
            this.d.doUnregisterEventListener(listenerKey, 2441);
        }
    }
}
