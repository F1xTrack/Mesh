package defpackage;

import android.content.res.Resources;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicLong;

/* loaded from: classes.dex */
public abstract class O {
    public static final M g = new M();
    public static final NullPointerException h = new NullPointerException("No image request was specified!");
    public static final AtomicLong i = new AtomicLong();
    public Object a;
    public C6589q70 b;
    public C6589q70 c;
    public InterfaceC3301cz d;
    public boolean e;
    public InterfaceC7011sL f;

    public final C4297iB0 a() {
        C4297iB0 c4297iB0;
        C6589q70 c6589q70;
        if (this.b == null && (c6589q70 = this.c) != null) {
            this.b = c6589q70;
            this.c = null;
        }
        AbstractC4368iZ.b();
        C5264jB0 c5264jB0 = (C5264jB0) this;
        AbstractC4368iZ.b();
        try {
            InterfaceC7011sL interfaceC7011sL = c5264jB0.f;
            String strValueOf = String.valueOf(i.getAndIncrement());
            if (interfaceC7011sL instanceof C4297iB0) {
                c4297iB0 = (C4297iB0) interfaceC7011sL;
            } else {
                C6860rY0 c6860rY0 = c5264jB0.k;
                c4297iB0 = new C4297iB0((Resources) c6860rY0.b, (C6045nH) c6860rY0.c, (ScheduledExecutorServiceC0583Hf1) c6860rY0.d, (CC0) c6860rY0.e);
            }
            InterfaceC6396p61 interfaceC6396p61C = c5264jB0.c(c4297iB0, strValueOf);
            C6589q70 c6589q702 = c5264jB0.b;
            TE te = c5264jB0.j.i;
            C4204hi c4204hiK = (te == null || c6589q702 == null) ? null : c6589q702.p != null ? te.K(c6589q702, c5264jB0.a) : te.H(c6589q702, c5264jB0.a);
            Object obj = c5264jB0.a;
            c4297iB0.getClass();
            AbstractC4368iZ.b();
            c4297iB0.f(obj, strValueOf);
            c4297iB0.o = false;
            c4297iB0.w = interfaceC6396p61C;
            c4297iB0.q(null);
            c4297iB0.v = c4204hiK;
            c4297iB0.q(null);
            AbstractC4368iZ.b();
            synchronized (c4297iB0) {
                c4297iB0.x = c5264jB0.b;
            }
            AbstractC4368iZ.b();
            InterfaceC3301cz interfaceC3301cz = this.d;
            if (interfaceC3301cz != null) {
                c4297iB0.a(interfaceC3301cz);
            }
            if (this.e) {
                c4297iB0.a(g);
            }
            AbstractC4368iZ.b();
            return c4297iB0;
        } catch (Throwable th) {
            AbstractC4368iZ.b();
            throw th;
        }
    }

    public final void b() {
        this.a = null;
        this.b = null;
        this.c = null;
        this.d = null;
        this.e = false;
        this.f = null;
    }

    public final InterfaceC6396p61 c(C4297iB0 c4297iB0, String str) {
        C6589q70 c6589q70 = this.b;
        InterfaceC6396p61 n = c6589q70 != null ? new N(this, c4297iB0, str, c6589q70, this.a, 1) : null;
        if (n != null && this.c != null) {
            ArrayList arrayList = new ArrayList(2);
            arrayList.add(n);
            arrayList.add(new N(this, c4297iB0, str, this.c, this.a, 1));
            n = new C3715f80(arrayList);
        }
        return n == null ? new C2472cD(0) : n;
    }
}
