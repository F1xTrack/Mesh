package defpackage;

import android.graphics.Matrix;
import android.graphics.Rect;
import android.util.Range;
import android.util.Size;
import androidx.camera.camera2.internal.compat.quirk.AeFpsRangeLegacyQuirk;
import androidx.camera.core.internal.compat.quirk.AeFpsRangeQuirk;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.Set;
import java.util.TreeMap;

/* renamed from: fh1 */
/* loaded from: classes.dex */
public abstract class AbstractC3821fh1 {
    public InterfaceC5361jh1 d;
    public InterfaceC5361jh1 e;
    public InterfaceC5361jh1 f;
    public C0500Ge g;
    public InterfaceC5361jh1 h;
    public Rect i;
    public InterfaceC7480uo k;
    public InterfaceC7480uo l;
    public final HashSet a = new HashSet();
    public final Object b = new Object();
    public int c = 2;
    public Matrix j = new Matrix();
    public C8194yY0 m = C8194yY0.a();
    public C8194yY0 n = C8194yY0.a();

    public AbstractC3821fh1(InterfaceC5361jh1 interfaceC5361jh1) {
        this.e = interfaceC5361jh1;
        this.f = interfaceC5361jh1;
    }

    public void A(Matrix matrix) {
        this.j = new Matrix(matrix);
    }

    public final boolean B(int i) {
        Size sizeS;
        int iN0 = ((Y60) this.f).n0(-1);
        if (iN0 != -1 && iN0 == i) {
            return false;
        }
        InterfaceC4393ih1 interfaceC4393ih1M = m(this.e);
        Y60 y60 = (Y60) interfaceC4393ih1M.d();
        int iN02 = y60.n0(-1);
        if (iN02 == -1 || iN02 != i) {
            C3709f60 c3709f60 = (C3709f60) interfaceC4393ih1M;
            switch (c3709f60.a) {
                case 0:
                    c3709f60.b.e(Y60.B0, Integer.valueOf(i));
                    break;
                case 1:
                    c3709f60.b.e(Y60.B0, Integer.valueOf(i));
                    break;
                case 2:
                    C0572Hc c0572Hc = Y60.B0;
                    Integer numValueOf = Integer.valueOf(i);
                    C0468Ft0 c0468Ft0 = c3709f60.b;
                    c0468Ft0.e(c0572Hc, numValueOf);
                    c0468Ft0.e(Y60.C0, Integer.valueOf(i));
                    break;
                default:
                    c3709f60.b.e(Y60.B0, Integer.valueOf(i));
                    break;
            }
        }
        if (iN02 != -1 && i != -1 && iN02 != i) {
            if (Math.abs(AbstractC4346iR1.d(i) - AbstractC4346iR1.d(iN02)) % 180 == 90 && (sizeS = y60.S()) != null) {
                C3709f60 c3709f602 = (C3709f60) interfaceC4393ih1M;
                Size size = new Size(sizeS.getHeight(), sizeS.getWidth());
                switch (c3709f602.a) {
                    case 0:
                        c3709f602.b.e(Y60.E0, size);
                        break;
                    case 1:
                        c3709f602.b.e(Y60.E0, size);
                        break;
                    case 2:
                        c3709f602.b.e(Y60.E0, size);
                        break;
                    default:
                        throw new UnsupportedOperationException("setTargetResolution is not supported.");
                }
            }
        }
        this.e = interfaceC4393ih1M.d();
        InterfaceC7480uo interfaceC7480uoD = d();
        if (interfaceC7480uoD == null) {
            this.f = this.e;
            return true;
        }
        this.f = o(interfaceC7480uoD.o(), this.d, this.h);
        return true;
    }

    public void C(Rect rect) {
        this.i = rect;
    }

    public final void D(InterfaceC7480uo interfaceC7480uo) {
        z();
        synchronized (this.b) {
            try {
                InterfaceC7480uo interfaceC7480uo2 = this.k;
                if (interfaceC7480uo == interfaceC7480uo2) {
                    this.a.remove(interfaceC7480uo2);
                    this.k = null;
                }
                InterfaceC7480uo interfaceC7480uo3 = this.l;
                if (interfaceC7480uo == interfaceC7480uo3) {
                    this.a.remove(interfaceC7480uo3);
                    this.l = null;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        this.g = null;
        this.i = null;
        this.f = this.e;
        this.d = null;
        this.h = null;
    }

    public final void E(List list) {
        if (list.isEmpty()) {
            return;
        }
        this.m = (C8194yY0) list.get(0);
        if (list.size() > 1) {
            this.n = (C8194yY0) list.get(1);
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            for (AbstractC4314iH abstractC4314iH : ((C8194yY0) it.next()).b()) {
                if (abstractC4314iH.j == null) {
                    abstractC4314iH.j = getClass();
                }
            }
        }
    }

    public final void a(C7433uY0 c7433uY0, C0500Ge c0500Ge) {
        Range range = C0500Ge.f;
        if (!range.equals(c0500Ge.c)) {
            Range range2 = c0500Ge.c;
            C2005Zm c2005Zm = c7433uY0.b;
            c2005Zm.getClass();
            ((C0468Ft0) c2005Zm.e).e(C1702Vp.k, range2);
            return;
        }
        synchronized (this.b) {
            try {
                InterfaceC7480uo interfaceC7480uo = this.k;
                interfaceC7480uo.getClass();
                ArrayList arrayListB0 = interfaceC7480uo.o().v().B0(AeFpsRangeQuirk.class);
                boolean z = true;
                if (arrayListB0.size() > 1) {
                    z = false;
                }
                AbstractC3377dM1.d("There should not have more than one AeFpsRangeQuirk.", z);
                if (!arrayListB0.isEmpty()) {
                    Range range3 = ((AeFpsRangeLegacyQuirk) ((AeFpsRangeQuirk) arrayListB0.get(0))).a;
                    if (range3 != null) {
                        range = range3;
                    }
                    C2005Zm c2005Zm2 = c7433uY0.b;
                    c2005Zm2.getClass();
                    ((C0468Ft0) c2005Zm2.e).e(C1702Vp.k, range);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void b(InterfaceC7480uo interfaceC7480uo, InterfaceC7480uo interfaceC7480uo2, InterfaceC5361jh1 interfaceC5361jh1, InterfaceC5361jh1 interfaceC5361jh12) {
        synchronized (this.b) {
            this.k = interfaceC7480uo;
            this.l = interfaceC7480uo2;
            this.a.add(interfaceC7480uo);
            if (interfaceC7480uo2 != null) {
                this.a.add(interfaceC7480uo2);
            }
        }
        this.d = interfaceC5361jh1;
        this.h = interfaceC5361jh12;
        this.f = o(interfaceC7480uo.o(), this.d, this.h);
        s();
    }

    public final Size c() {
        C0500Ge c0500Ge = this.g;
        if (c0500Ge != null) {
            return c0500Ge.a;
        }
        return null;
    }

    public final InterfaceC7480uo d() {
        InterfaceC7480uo interfaceC7480uo;
        synchronized (this.b) {
            interfaceC7480uo = this.k;
        }
        return interfaceC7480uo;
    }

    public final InterfaceC1930Yn e() {
        synchronized (this.b) {
            try {
                InterfaceC7480uo interfaceC7480uo = this.k;
                if (interfaceC7480uo == null) {
                    return InterfaceC1930Yn.m0;
                }
                return interfaceC7480uo.g();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final String f() {
        InterfaceC7480uo interfaceC7480uoD = d();
        AbstractC3377dM1.h(interfaceC7480uoD, "No camera attached to use case: " + this);
        return interfaceC7480uoD.o().e();
    }

    public abstract InterfaceC5361jh1 g(boolean z, InterfaceC5934mh1 interfaceC5934mh1);

    public final String h() {
        String strK = this.f.K("<UnknownUseCase-" + hashCode() + ">");
        Objects.requireNonNull(strK);
        return strK;
    }

    public final int i(InterfaceC7480uo interfaceC7480uo, boolean z) {
        int iP = interfaceC7480uo.o().p(l());
        return (interfaceC7480uo.m() || !z) ? iP : AbstractC7255tc1.h(-iP);
    }

    public final InterfaceC7480uo j() {
        InterfaceC7480uo interfaceC7480uo;
        synchronized (this.b) {
            interfaceC7480uo = this.l;
        }
        return interfaceC7480uo;
    }

    public Set k() {
        return Collections.emptySet();
    }

    public final int l() {
        return ((Y60) this.f).n0(0);
    }

    public abstract InterfaceC4393ih1 m(InterfaceC7122sw interfaceC7122sw);

    public final boolean n(InterfaceC7480uo interfaceC7480uo) {
        int iR = ((Y60) this.f).r();
        if (iR == -1 || iR == 0) {
            return false;
        }
        if (iR == 1) {
            return true;
        }
        if (iR == 2) {
            return interfaceC7480uo.e();
        }
        throw new AssertionError(AbstractC7209tN0.u(iR, "Unknown mirrorMode: "));
    }

    public final InterfaceC5361jh1 o(InterfaceC6907ro interfaceC6907ro, InterfaceC5361jh1 interfaceC5361jh1, InterfaceC5361jh1 interfaceC5361jh12) {
        C0468Ft0 c0468Ft0B;
        if (interfaceC5361jh12 != null) {
            c0468Ft0B = C0468Ft0.c(interfaceC5361jh12);
            c0468Ft0B.a.remove(C81.R0);
        } else {
            c0468Ft0B = C0468Ft0.b();
        }
        boolean zQ = this.e.Q(Y60.A0);
        TreeMap treeMap = c0468Ft0B.a;
        if (zQ || this.e.Q(Y60.E0)) {
            C0572Hc c0572Hc = Y60.I0;
            if (treeMap.containsKey(c0572Hc)) {
                treeMap.remove(c0572Hc);
            }
        }
        InterfaceC5361jh1 interfaceC5361jh13 = this.e;
        C0572Hc c0572Hc2 = Y60.I0;
        if (interfaceC5361jh13.Q(c0572Hc2)) {
            C0572Hc c0572Hc3 = Y60.G0;
            if (treeMap.containsKey(c0572Hc3) && ((C3775fS0) this.e.w(c0572Hc2)).b != null) {
                treeMap.remove(c0572Hc3);
            }
        }
        Iterator it = this.e.u().iterator();
        while (it.hasNext()) {
            AbstractC1705Vq.r(c0468Ft0B, c0468Ft0B, this.e, (C0572Hc) it.next());
        }
        if (interfaceC5361jh1 != null) {
            for (C0572Hc c0572Hc4 : interfaceC5361jh1.u()) {
                if (!c0572Hc4.a.equals(C81.R0.a)) {
                    AbstractC1705Vq.r(c0468Ft0B, c0468Ft0B, interfaceC5361jh1, c0572Hc4);
                }
            }
        }
        if (treeMap.containsKey(Y60.E0)) {
            C0572Hc c0572Hc5 = Y60.A0;
            if (treeMap.containsKey(c0572Hc5)) {
                treeMap.remove(c0572Hc5);
            }
        }
        C0572Hc c0572Hc6 = Y60.I0;
        if (treeMap.containsKey(c0572Hc6) && ((C3775fS0) c0468Ft0B.w(c0572Hc6)).d != 0) {
            c0468Ft0B.e(InterfaceC5361jh1.a1, Boolean.TRUE);
        }
        return u(interfaceC6907ro, m(c0468Ft0B));
    }

    public final void p() {
        this.c = 1;
        r();
    }

    public final void q() {
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            ((InterfaceC3630eh1) it.next()).d(this);
        }
    }

    public final void r() {
        int iX = AbstractC8235ym.x(this.c);
        HashSet hashSet = this.a;
        if (iX == 0) {
            Iterator it = hashSet.iterator();
            while (it.hasNext()) {
                ((InterfaceC3630eh1) it.next()).f(this);
            }
        } else {
            if (iX != 1) {
                return;
            }
            Iterator it2 = hashSet.iterator();
            while (it2.hasNext()) {
                ((InterfaceC3630eh1) it2.next()).p(this);
            }
        }
    }

    public abstract InterfaceC5361jh1 u(InterfaceC6907ro interfaceC6907ro, InterfaceC4393ih1 interfaceC4393ih1);

    public abstract C0500Ge x(C3456dn c3456dn);

    public abstract C0500Ge y(C0500Ge c0500Ge, C0500Ge c0500Ge2);

    public void s() {
    }

    public void t() {
    }

    public void v() {
    }

    public void w() {
    }

    public void z() {
    }
}
