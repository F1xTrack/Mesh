package defpackage;

import android.os.SystemClock;
import android.util.Log;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;

/* loaded from: classes.dex */
public final class EO {
    public static final boolean i = Log.isLoggable("Engine", 2);
    public final C4332iN a;
    public final C0240Cv0 b;
    public final C0291Dm0 c;
    public final C1252Pv d;
    public final C1135Oi e;
    public final DO f;
    public final VY g;
    public final C8096y2 h;

    public EO(C0291Dm0 c0291Dm0, C0136Bm1 c0136Bm1, B10 b10, B10 b102, B10 b103, B10 b104) {
        this.c = c0291Dm0;
        DO r0 = new DO(c0136Bm1);
        this.f = r0;
        C8096y2 c8096y2 = new C8096y2();
        this.h = c8096y2;
        synchronized (this) {
            synchronized (c8096y2) {
                c8096y2.d = this;
            }
        }
        this.b = new C0240Cv0(13);
        this.a = new C4332iN(18, (byte) 0);
        C1252Pv c1252Pv = new C1252Pv();
        c1252Pv.g = AbstractC1254Pv1.b(150, new C1562Tu0(13, c1252Pv));
        c1252Pv.a = b10;
        c1252Pv.b = b102;
        c1252Pv.c = b103;
        c1252Pv.d = b104;
        c1252Pv.e = this;
        c1252Pv.f = this;
        this.d = c1252Pv;
        this.g = new VY(r0);
        this.e = new C1135Oi(10);
        c0291Dm0.d = this;
    }

    public static void f(InterfaceC5506kS0 interfaceC5506kS0) {
        if (!(interfaceC5506kS0 instanceof JO)) {
            throw new IllegalArgumentException("Cannot release anything but an EngineResource");
        }
        ((JO) interfaceC5506kS0).c();
    }

    public final C5772lr0 a(C7903x10 c7903x10, Object obj, InterfaceC0660If0 interfaceC0660If0, int i2, int i3, Class cls, Class cls2, EnumC7561vD0 enumC7561vD0, AbstractC3750fK abstractC3750fK, Map map, boolean z, boolean z2, C0795Jy0 c0795Jy0, boolean z3, boolean z4, boolean z5, boolean z6, J11 j11, Executor executor) {
        long jElapsedRealtimeNanos;
        if (i) {
            int i4 = AbstractC6136nl0.a;
            jElapsedRealtimeNanos = SystemClock.elapsedRealtimeNanos();
        } else {
            jElapsedRealtimeNanos = 0;
        }
        long j = jElapsedRealtimeNanos;
        this.b.getClass();
        IO io2 = new IO(obj, interfaceC0660If0, i2, i3, map, cls, cls2, c0795Jy0);
        synchronized (this) {
            try {
                JO joC = c(io2, z3, j);
                if (joC == null) {
                    return h(c7903x10, obj, interfaceC0660If0, i2, i3, cls, cls2, enumC7561vD0, abstractC3750fK, map, z, z2, c0795Jy0, z3, z4, z5, z6, j11, executor, io2, j);
                }
                j11.l(joC, XC.e, false);
                return null;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final JO b(IO io2) {
        Object obj;
        C0291Dm0 c0291Dm0 = this.c;
        synchronized (c0291Dm0) {
            C0135Bm0 c0135Bm0 = (C0135Bm0) ((LinkedHashMap) c0291Dm0.c).remove(io2);
            if (c0135Bm0 == null) {
                obj = null;
            } else {
                c0291Dm0.b -= c0135Bm0.b;
                obj = c0135Bm0.a;
            }
        }
        InterfaceC5506kS0 interfaceC5506kS0 = (InterfaceC5506kS0) obj;
        JO jo = interfaceC5506kS0 != null ? interfaceC5506kS0 instanceof JO ? (JO) interfaceC5506kS0 : new JO(interfaceC5506kS0, true, true, io2, this) : null;
        if (jo != null) {
            jo.b();
            this.h.a(io2, jo);
        }
        return jo;
    }

    public final JO c(IO io2, boolean z, long j) {
        JO jo;
        if (!z) {
            return null;
        }
        C8096y2 c8096y2 = this.h;
        synchronized (c8096y2) {
            C7906x2 c7906x2 = (C7906x2) c8096y2.b.get(io2);
            if (c7906x2 == null) {
                jo = null;
            } else {
                jo = (JO) c7906x2.get();
                if (jo == null) {
                    c8096y2.b(c7906x2);
                }
            }
        }
        if (jo != null) {
            jo.b();
        }
        if (jo != null) {
            if (i) {
                int i2 = AbstractC6136nl0.a;
                SystemClock.elapsedRealtimeNanos();
                Objects.toString(io2);
            }
            return jo;
        }
        JO joB = b(io2);
        if (joB == null) {
            return null;
        }
        if (i) {
            int i3 = AbstractC6136nl0.a;
            SystemClock.elapsedRealtimeNanos();
            Objects.toString(io2);
        }
        return joB;
    }

    public final synchronized void d(HO ho, IO io2, JO jo) {
        if (jo != null) {
            try {
                if (jo.a) {
                    this.h.a(io2, jo);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        C4332iN c4332iN = this.a;
        c4332iN.getClass();
        HashMap map = (HashMap) (ho.p ? c4332iN.c : c4332iN.b);
        if (ho.equals(map.get(io2))) {
            map.remove(io2);
        }
    }

    public final void e(IO io2, JO jo) {
        C8096y2 c8096y2 = this.h;
        synchronized (c8096y2) {
            C7906x2 c7906x2 = (C7906x2) c8096y2.b.remove(io2);
            if (c7906x2 != null) {
                c7906x2.c = null;
                c7906x2.clear();
            }
        }
        if (jo.a) {
        } else {
            this.e.l(jo, false);
        }
    }

    public final void g() {
        C1252Pv c1252Pv = this.d;
        AbstractC8451zu1.c((B10) c1252Pv.a);
        AbstractC8451zu1.c((B10) c1252Pv.b);
        AbstractC8451zu1.c((B10) c1252Pv.c);
        AbstractC8451zu1.c((B10) c1252Pv.d);
        DO r0 = this.f;
        synchronized (r0) {
            if (((ZJ) r0.a) != null) {
                ((ZJ) r0.a).clear();
            }
        }
        C8096y2 c8096y2 = this.h;
        c8096y2.e = true;
        ExecutorService executorService = c8096y2.a;
        if (executorService instanceof ExecutorService) {
            AbstractC8451zu1.c(executorService);
        }
    }

    public final C5772lr0 h(C7903x10 c7903x10, Object obj, InterfaceC0660If0 interfaceC0660If0, int i2, int i3, Class cls, Class cls2, EnumC7561vD0 enumC7561vD0, AbstractC3750fK abstractC3750fK, Map map, boolean z, boolean z2, C0795Jy0 c0795Jy0, boolean z3, boolean z4, boolean z5, boolean z6, J11 j11, Executor executor, IO io2, long j) {
        C4332iN c4332iN = this.a;
        HO ho = (HO) ((HashMap) (z6 ? c4332iN.c : c4332iN.b)).get(io2);
        if (ho != null) {
            ho.a(j11, executor);
            if (i) {
                int i4 = AbstractC6136nl0.a;
                SystemClock.elapsedRealtimeNanos();
                Objects.toString(io2);
            }
            return new C5772lr0(this, j11, ho);
        }
        HO ho2 = (HO) ((C1857Xo1) this.d.g).i();
        synchronized (ho2) {
            ho2.l = io2;
            ho2.m = z3;
            ho2.n = z4;
            ho2.o = z5;
            ho2.p = z6;
        }
        VY vy = this.g;
        OD od = (OD) ((C1857Xo1) vy.d).i();
        int i5 = vy.b;
        vy.b = i5 + 1;
        ND nd = od.a;
        nd.c = c7903x10;
        nd.d = obj;
        nd.n = interfaceC0660If0;
        nd.e = i2;
        nd.f = i3;
        nd.p = abstractC3750fK;
        nd.g = cls;
        nd.h = od.d;
        nd.k = cls2;
        nd.o = enumC7561vD0;
        nd.i = c0795Jy0;
        nd.j = map;
        nd.q = z;
        nd.r = z2;
        od.h = c7903x10;
        od.i = interfaceC0660If0;
        od.j = enumC7561vD0;
        od.k = io2;
        od.l = i2;
        od.m = i3;
        od.n = abstractC3750fK;
        od.r = z6;
        od.o = c0795Jy0;
        od.p = ho2;
        od.q = i5;
        od.E = 1;
        od.s = obj;
        C4332iN c4332iN2 = this.a;
        c4332iN2.getClass();
        ((HashMap) (ho2.p ? c4332iN2.c : c4332iN2.b)).put(io2, ho2);
        ho2.a(j11, executor);
        ho2.k(od);
        if (i) {
            int i6 = AbstractC6136nl0.a;
            SystemClock.elapsedRealtimeNanos();
            Objects.toString(io2);
        }
        return new C5772lr0(this, j11, ho2);
    }
}
