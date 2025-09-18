package defpackage;

import android.graphics.Matrix;
import android.graphics.Rect;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Objects;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public final class R61 {
    public final int a;
    public final Matrix b;
    public final boolean c;
    public final Rect d;
    public final boolean e;
    public final int f;
    public final C0500Ge g;
    public int h;
    public int i;
    public Z61 k;
    public Q61 l;
    public boolean j = false;
    public final HashSet m = new HashSet();
    public boolean n = false;
    public final ArrayList o = new ArrayList();

    public R61(int i, int i2, C0500Ge c0500Ge, Matrix matrix, boolean z, Rect rect, int i3, int i4, boolean z2) {
        this.f = i;
        this.a = i2;
        this.g = c0500Ge;
        this.b = matrix;
        this.c = z;
        this.d = rect;
        this.i = i3;
        this.h = i4;
        this.e = z2;
        this.l = new Q61(c0500Ge.a, i2);
    }

    public final void a(Runnable runnable) {
        DV1.a();
        b();
        this.m.add(runnable);
    }

    public final void b() {
        AbstractC3377dM1.i(!this.n, "Edge is already closed.");
    }

    public final void c() {
        DV1.a();
        this.l.a();
        this.n = true;
    }

    public final Z61 d(InterfaceC7480uo interfaceC7480uo, boolean z) {
        DV1.a();
        b();
        C0500Ge c0500Ge = this.g;
        Z61 z61 = new Z61(c0500Ge.a, interfaceC7480uo, z, c0500Ge.b, c0500Ge.c, new L61(this, 0));
        try {
            G70 g70 = z61.l;
            Q61 q61 = this.l;
            Objects.requireNonNull(q61);
            if (q61.g(g70, new M61(q61, 0))) {
                AbstractC1500Sz1.l(q61.e).d(new N61(0, g70), QR1.a());
            }
            this.k = z61;
            f();
            return z61;
        } catch (C4123hH e) {
            throw new AssertionError("Surface is somehow already closed", e);
        } catch (RuntimeException e2) {
            z61.d();
            throw e2;
        }
    }

    public final void e() {
        boolean z;
        DV1.a();
        b();
        Q61 q61 = this.l;
        q61.getClass();
        DV1.a();
        if (q61.q == null) {
            synchronized (q61.a) {
                z = q61.c;
            }
            if (!z) {
                return;
            }
        }
        this.j = false;
        this.l.a();
        this.l = new Q61(this.g.a, this.a);
        Iterator it = this.m.iterator();
        while (it.hasNext()) {
            ((Runnable) it.next()).run();
        }
    }

    public final void f() {
        Y61 y61;
        Executor executor;
        DV1.a();
        C1123Oe c1123Oe = new C1123Oe(this.d, this.i, this.h, this.c, this.b, this.e);
        Z61 z61 = this.k;
        if (z61 != null) {
            synchronized (z61.a) {
                z61.m = c1123Oe;
                y61 = z61.n;
                executor = z61.o;
            }
            if (y61 != null && executor != null) {
                executor.execute(new U61(y61, c1123Oe, 0));
            }
        }
        Iterator it = this.o.iterator();
        while (it.hasNext()) {
            ((InterfaceC6556py) it.next()).b(c1123Oe);
        }
    }
}
