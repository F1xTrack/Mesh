package p000;

import android.graphics.Matrix;
import android.graphics.Rect;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Objects;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public final class R61 {

    /* renamed from: a */
    public final int f10002a;

    /* renamed from: b */
    public final Matrix f10003b;

    /* renamed from: c */
    public final boolean f10004c;

    /* renamed from: d */
    public final Rect f10005d;

    /* renamed from: e */
    public final boolean f10006e;

    /* renamed from: f */
    public final int f10007f;

    /* renamed from: g */
    public final C0419Ge f10008g;

    /* renamed from: h */
    public int f10009h;

    /* renamed from: i */
    public int f10010i;

    /* renamed from: k */
    public Z61 f10012k;

    /* renamed from: l */
    public Q61 f10013l;

    /* renamed from: j */
    public boolean f10011j = false;

    /* renamed from: m */
    public final HashSet f10014m = new HashSet();

    /* renamed from: n */
    public boolean f10015n = false;

    /* renamed from: o */
    public final ArrayList f10016o = new ArrayList();

    public R61(int i, int i2, C0419Ge c0419Ge, Matrix matrix, boolean z, Rect rect, int i3, int i4, boolean z2) {
        this.f10007f = i;
        this.f10002a = i2;
        this.f10008g = c0419Ge;
        this.f10003b = matrix;
        this.f10004c = z;
        this.f10005d = rect;
        this.f10010i = i3;
        this.f10009h = i4;
        this.f10006e = z2;
        this.f10013l = new Q61(c0419Ge.f3839a, i2);
    }

    /* renamed from: a */
    public final void m6896a(Runnable runnable) {
        DV1.m1716a();
        m6897b();
        this.f10014m.add(runnable);
    }

    /* renamed from: b */
    public final void m6897b() {
        AbstractC9104dM1.m17550i(!this.f10015n, "Edge is already closed.");
    }

    /* renamed from: c */
    public final void m6898c() {
        DV1.m1716a();
        this.f10013l.mo6573a();
        this.f10015n = true;
    }

    /* renamed from: d */
    public final Z61 m6899d(InterfaceC6972uo interfaceC6972uo, boolean z) {
        DV1.m1716a();
        m6897b();
        C0419Ge c0419Ge = this.f10008g;
        Z61 z61 = new Z61(c0419Ge.f3839a, interfaceC6972uo, z, c0419Ge.f3840b, c0419Ge.f3841c, new L61(this, 0));
        try {
            G70 g70 = z61.f14748l;
            Q61 q61 = this.f10013l;
            Objects.requireNonNull(q61);
            if (q61.m6574g(g70, new M61(q61, 0))) {
                AbstractC8301Sz1.m7489l(q61.f29023e).mo2494d(new N61(0, g70), QR1.m6703a());
            }
            this.f10012k = z61;
            m6901f();
            return z61;
        } catch (C4169hH e) {
            throw new AssertionError("Surface is somehow already closed", e);
        } catch (RuntimeException e2) {
            z61.m9493d();
            throw e2;
        }
    }

    /* renamed from: e */
    public final void m6900e() {
        boolean z;
        DV1.m1716a();
        m6897b();
        Q61 q61 = this.f10013l;
        q61.getClass();
        DV1.m1716a();
        if (q61.f9482q == null) {
            synchronized (q61.f29019a) {
                z = q61.f29021c;
            }
            if (!z) {
                return;
            }
        }
        this.f10011j = false;
        this.f10013l.mo6573a();
        this.f10013l = new Q61(this.f10008g.f3839a, this.f10002a);
        Iterator it = this.f10014m.iterator();
        while (it.hasNext()) {
            ((Runnable) it.next()).run();
        }
    }

    /* renamed from: f */
    public final void m6901f() {
        Y61 y61;
        Executor executor;
        DV1.m1716a();
        C0922Oe c0922Oe = new C0922Oe(this.f10005d, this.f10010i, this.f10009h, this.f10004c, this.f10003b, this.f10006e);
        Z61 z61 = this.f10012k;
        if (z61 != null) {
            synchronized (z61.f14737a) {
                z61.f14749m = c0922Oe;
                y61 = z61.f14750n;
                executor = z61.f14751o;
            }
            if (y61 != null && executor != null) {
                executor.execute(new U61(y61, c0922Oe, 0));
            }
        }
        Iterator it = this.f10016o.iterator();
        while (it.hasNext()) {
            ((InterfaceC6650py) it.next()).mo3020b(c0922Oe);
        }
    }
}
