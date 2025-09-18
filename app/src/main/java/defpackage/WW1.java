package defpackage;

import android.os.Looper;

/* loaded from: classes.dex */
public final class WW1 extends AbstractC4128hI1 {
    public HandlerC7197tJ0 d;
    public boolean e;
    public final C6845rT0 f;
    public final H9 g;
    public final ES1 h;

    public WW1(C3386dP1 c3386dP1) {
        super(c3386dP1);
        this.e = true;
        this.f = new C6845rT0(this);
        H9 h9 = new H9();
        h9.d = this;
        h9.c = new C6477pX1(h9, (C3386dP1) this.b, 0);
        long jElapsedRealtime = ((C3386dP1) this.b).n.elapsedRealtime();
        h9.a = jElapsedRealtime;
        h9.b = jElapsedRealtime;
        this.g = h9;
        this.h = new ES1(29, this);
    }

    public final void C1() {
        v1();
        if (this.d == null) {
            this.d = new HandlerC7197tJ0(Looper.getMainLooper());
        }
    }

    @Override // defpackage.AbstractC4128hI1
    public final boolean z1() {
        return false;
    }
}
