package defpackage;

import android.os.Handler;

/* renamed from: mF */
/* loaded from: classes.dex */
public final class C5848mF implements QL {
    public final OL a;
    public LL b;
    public boolean c;
    public final /* synthetic */ C6039nF d;

    public C5848mF(C6039nF c6039nF, OL ol) {
        this.d = c6039nF;
        this.a = ol;
    }

    @Override // defpackage.QL
    public final void release() {
        Handler handler = this.d.t;
        handler.getClass();
        AbstractC0277Dh1.U(handler, new DE(1, this));
    }
}
