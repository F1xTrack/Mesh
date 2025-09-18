package defpackage;

import android.graphics.Matrix;
import android.graphics.Rect;
import androidx.camera.core.internal.compat.quirk.OnePixelShiftQuirk;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Objects;
import java.util.concurrent.Executor;

/* renamed from: i60 */
/* loaded from: classes.dex */
public final class C4282i60 extends AbstractC3821fh1 {
    public static final C3900g60 u = new C3900g60();
    public final AbstractC5631l60 o;
    public final Object p;
    public InterfaceC3328d60 q;
    public C7433uY0 r;
    public G70 s;
    public C7624vY0 t;

    public C4282i60(C6013n60 c6013n60) {
        super(c6013n60);
        this.p = new Object();
        if (((Integer) ((C0873Ky0) ((C6013n60) this.f).getConfig()).q(C6013n60.b, 0)).intValue() == 1) {
            this.o = new C5822m60();
        } else {
            this.o = new C6586q60(F91.a(c6013n60, QR1.e()));
        }
        this.o.d = G();
        AbstractC5631l60 abstractC5631l60 = this.o;
        C6013n60 c6013n602 = (C6013n60) this.f;
        Boolean bool = Boolean.FALSE;
        c6013n602.getClass();
        abstractC5631l60.e = ((Boolean) AbstractC7209tN0.j(c6013n602, C6013n60.g, bool)).booleanValue();
    }

    @Override // defpackage.AbstractC3821fh1
    public final void A(Matrix matrix) {
        super.A(matrix);
        AbstractC5631l60 abstractC5631l60 = this.o;
        synchronized (abstractC5631l60.r) {
            abstractC5631l60.l = matrix;
            abstractC5631l60.m = new Matrix(abstractC5631l60.l);
        }
    }

    @Override // defpackage.AbstractC3821fh1
    public final void C(Rect rect) {
        this.i = rect;
        AbstractC5631l60 abstractC5631l60 = this.o;
        synchronized (abstractC5631l60.r) {
            abstractC5631l60.j = rect;
            abstractC5631l60.k = new Rect(abstractC5631l60.j);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:113:0x0106  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x00a2  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final defpackage.C7433uY0 F(defpackage.C6013n60 r14, defpackage.C0500Ge r15) {
        /*
            Method dump skipped, instructions count: 412
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C4282i60.F(n60, Ge):uY0");
    }

    public final int G() {
        C6013n60 c6013n60 = (C6013n60) this.f;
        c6013n60.getClass();
        return ((Integer) AbstractC7209tN0.j(c6013n60, C6013n60.e, 1)).intValue();
    }

    public final void H(Executor executor, InterfaceC3328d60 interfaceC3328d60) {
        synchronized (this.p) {
            try {
                this.o.h(executor, new EE(19, interfaceC3328d60));
                if (this.q == null) {
                    p();
                }
                this.q = interfaceC3328d60;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // defpackage.AbstractC3821fh1
    public final InterfaceC5361jh1 g(boolean z, InterfaceC5934mh1 interfaceC5934mh1) {
        u.getClass();
        C6013n60 c6013n60 = C3900g60.a;
        c6013n60.getClass();
        InterfaceC7122sw interfaceC7122swA = interfaceC5934mh1.a(F91.b(c6013n60), 1);
        if (z) {
            interfaceC7122swA = AbstractC1705Vq.q(interfaceC7122swA, c6013n60);
        }
        if (interfaceC7122swA == null) {
            return null;
        }
        return ((C3709f60) m(interfaceC7122swA)).b();
    }

    @Override // defpackage.AbstractC3821fh1
    public final InterfaceC4393ih1 m(InterfaceC7122sw interfaceC7122sw) {
        return new C3709f60(C0468Ft0.c(interfaceC7122sw), 0);
    }

    @Override // defpackage.AbstractC3821fh1
    public final void s() {
        this.o.s = true;
    }

    public final String toString() {
        return "ImageAnalysis:".concat(h());
    }

    @Override // defpackage.AbstractC3821fh1
    public final InterfaceC5361jh1 u(InterfaceC6907ro interfaceC6907ro, InterfaceC4393ih1 interfaceC4393ih1) {
        C6013n60 c6013n60 = (C6013n60) this.f;
        c6013n60.getClass();
        Boolean bool = (Boolean) AbstractC7209tN0.j(c6013n60, C6013n60.f, null);
        boolean zX0 = interfaceC6907ro.v().x0(OnePixelShiftQuirk.class);
        AbstractC5631l60 abstractC5631l60 = this.o;
        if (bool != null) {
            zX0 = bool.booleanValue();
        }
        abstractC5631l60.f = zX0;
        synchronized (this.p) {
        }
        return interfaceC4393ih1.d();
    }

    @Override // defpackage.AbstractC3821fh1
    public final C0500Ge x(C3456dn c3456dn) {
        this.r.b(c3456dn);
        Object[] objArr = {this.r.d()};
        ArrayList arrayList = new ArrayList(1);
        Object obj = objArr[0];
        Objects.requireNonNull(obj);
        arrayList.add(obj);
        E(Collections.unmodifiableList(arrayList));
        C7375uF c7375uFA = this.g.a();
        c7375uFA.d = c3456dn;
        return c7375uFA.l();
    }

    @Override // defpackage.AbstractC3821fh1
    public final C0500Ge y(C0500Ge c0500Ge, C0500Ge c0500Ge2) {
        C6013n60 c6013n60 = (C6013n60) this.f;
        f();
        C7433uY0 c7433uY0F = F(c6013n60, c0500Ge);
        this.r = c7433uY0F;
        Object[] objArr = {c7433uY0F.d()};
        ArrayList arrayList = new ArrayList(1);
        Object obj = objArr[0];
        Objects.requireNonNull(obj);
        arrayList.add(obj);
        E(Collections.unmodifiableList(arrayList));
        return c0500Ge;
    }

    @Override // defpackage.AbstractC3821fh1
    public final void z() {
        DV1.a();
        C7624vY0 c7624vY0 = this.t;
        if (c7624vY0 != null) {
            c7624vY0.b();
            this.t = null;
        }
        G70 g70 = this.s;
        if (g70 != null) {
            g70.a();
            this.s = null;
        }
        AbstractC5631l60 abstractC5631l60 = this.o;
        abstractC5631l60.s = false;
        abstractC5631l60.c();
    }
}
