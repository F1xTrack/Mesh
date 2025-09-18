package p000;

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
public abstract class AbstractC9402fh1 {

    /* renamed from: d */
    public InterfaceC9914jh1 f27335d;

    /* renamed from: e */
    public InterfaceC9914jh1 f27336e;

    /* renamed from: f */
    public InterfaceC9914jh1 f27337f;

    /* renamed from: g */
    public C0419Ge f27338g;

    /* renamed from: h */
    public InterfaceC9914jh1 f27339h;

    /* renamed from: i */
    public Rect f27340i;

    /* renamed from: k */
    public InterfaceC6972uo f27342k;

    /* renamed from: l */
    public InterfaceC6972uo f27343l;

    /* renamed from: a */
    public final HashSet f27332a = new HashSet();

    /* renamed from: b */
    public final Object f27333b = new Object();

    /* renamed from: c */
    public int f27334c = 2;

    /* renamed from: j */
    public Matrix f27341j = new Matrix();

    /* renamed from: m */
    public C11812yY0 f27344m = C11812yY0.m26163a();

    /* renamed from: n */
    public C11812yY0 f27345n = C11812yY0.m26163a();

    public AbstractC9402fh1(InterfaceC9914jh1 interfaceC9914jh1) {
        this.f27336e = interfaceC9914jh1;
        this.f27337f = interfaceC9914jh1;
    }

    /* renamed from: A */
    public void mo18267A(Matrix matrix) {
        this.f27341j = new Matrix(matrix);
    }

    /* renamed from: B */
    public final boolean m18268B(int i) {
        Size sizeMo7424S;
        int iMo7429n0 = ((Y60) this.f27337f).mo7429n0(-1);
        if (iMo7429n0 != -1 && iMo7429n0 == i) {
            return false;
        }
        InterfaceC9786ih1 interfaceC9786ih1Mo7103m = mo7103m(this.f27336e);
        Y60 y60 = (Y60) interfaceC9786ih1Mo7103m.mo4872d();
        int iMo7429n02 = y60.mo7429n0(-1);
        if (iMo7429n02 == -1 || iMo7429n02 != i) {
            C9327f60 c9327f60 = (C9327f60) interfaceC9786ih1Mo7103m;
            switch (c9327f60.f27075a) {
                case 0:
                    c9327f60.f27076b.m2815e(Y60.f14160B0, Integer.valueOf(i));
                    break;
                case 1:
                    c9327f60.f27076b.m2815e(Y60.f14160B0, Integer.valueOf(i));
                    break;
                case 2:
                    C0480Hc c0480Hc = Y60.f14160B0;
                    Integer numValueOf = Integer.valueOf(i);
                    C7612Ft0 c7612Ft0 = c9327f60.f27076b;
                    c7612Ft0.m2815e(c0480Hc, numValueOf);
                    c7612Ft0.m2815e(Y60.f14161C0, Integer.valueOf(i));
                    break;
                default:
                    c9327f60.f27076b.m2815e(Y60.f14160B0, Integer.valueOf(i));
                    break;
            }
        }
        if (iMo7429n02 != -1 && i != -1 && iMo7429n02 != i) {
            if (Math.abs(AbstractC9754iR1.m19040d(i) - AbstractC9754iR1.m19040d(iMo7429n02)) % 180 == 90 && (sizeMo7424S = y60.mo7424S()) != null) {
                C9327f60 c9327f602 = (C9327f60) interfaceC9786ih1Mo7103m;
                Size size = new Size(sizeMo7424S.getHeight(), sizeMo7424S.getWidth());
                switch (c9327f602.f27075a) {
                    case 0:
                        c9327f602.f27076b.m2815e(Y60.f14163E0, size);
                        break;
                    case 1:
                        c9327f602.f27076b.m2815e(Y60.f14163E0, size);
                        break;
                    case 2:
                        c9327f602.f27076b.m2815e(Y60.f14163E0, size);
                        break;
                    default:
                        throw new UnsupportedOperationException("setTargetResolution is not supported.");
                }
            }
        }
        this.f27336e = interfaceC9786ih1Mo7103m.mo4872d();
        InterfaceC6972uo interfaceC6972uoM18274d = m18274d();
        if (interfaceC6972uoM18274d == null) {
            this.f27337f = this.f27336e;
            return true;
        }
        this.f27337f = m18282o(interfaceC6972uoM18274d.mo1341o(), this.f27335d, this.f27339h);
        return true;
    }

    /* renamed from: C */
    public void mo7092C(Rect rect) {
        this.f27340i = rect;
    }

    /* renamed from: D */
    public final void m18269D(InterfaceC6972uo interfaceC6972uo) {
        mo17508z();
        synchronized (this.f27333b) {
            try {
                InterfaceC6972uo interfaceC6972uo2 = this.f27342k;
                if (interfaceC6972uo == interfaceC6972uo2) {
                    this.f27332a.remove(interfaceC6972uo2);
                    this.f27342k = null;
                }
                InterfaceC6972uo interfaceC6972uo3 = this.f27343l;
                if (interfaceC6972uo == interfaceC6972uo3) {
                    this.f27332a.remove(interfaceC6972uo3);
                    this.f27343l = null;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        this.f27338g = null;
        this.f27340i = null;
        this.f27337f = this.f27336e;
        this.f27335d = null;
        this.f27339h = null;
    }

    /* renamed from: E */
    public final void m18270E(List list) {
        if (list.isEmpty()) {
            return;
        }
        this.f27344m = (C11812yY0) list.get(0);
        if (list.size() > 1) {
            this.f27345n = (C11812yY0) list.get(1);
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            for (AbstractC4232iH abstractC4232iH : ((C11812yY0) it.next()).m26164b()) {
                if (abstractC4232iH.f29028j == null) {
                    abstractC4232iH.f29028j = getClass();
                }
            }
        }
    }

    /* renamed from: a */
    public final void m18271a(C11303uY0 c11303uY0, C0419Ge c0419Ge) {
        Range range = C0419Ge.f3838f;
        if (!range.equals(c0419Ge.f3841c)) {
            Range range2 = c0419Ge.f3841c;
            C1622Zm c1622Zm = c11303uY0.f43134b;
            c1622Zm.getClass();
            ((C7612Ft0) c1622Zm.f15117e).m2815e(C1373Vp.f12777k, range2);
            return;
        }
        synchronized (this.f27333b) {
            try {
                InterfaceC6972uo interfaceC6972uo = this.f27342k;
                interfaceC6972uo.getClass();
                ArrayList arrayListM17838B0 = interfaceC6972uo.mo1341o().mo2410v().m17838B0(AeFpsRangeQuirk.class);
                boolean z = true;
                if (arrayListM17838B0.size() > 1) {
                    z = false;
                }
                AbstractC9104dM1.m17545d("There should not have more than one AeFpsRangeQuirk.", z);
                if (!arrayListM17838B0.isEmpty()) {
                    Range range3 = ((AeFpsRangeLegacyQuirk) ((AeFpsRangeQuirk) arrayListM17838B0.get(0))).f15921a;
                    if (range3 != null) {
                        range = range3;
                    }
                    C1622Zm c1622Zm2 = c11303uY0.f43134b;
                    c1622Zm2.getClass();
                    ((C7612Ft0) c1622Zm2.f15117e).m2815e(C1373Vp.f12777k, range);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* renamed from: b */
    public final void m18272b(InterfaceC6972uo interfaceC6972uo, InterfaceC6972uo interfaceC6972uo2, InterfaceC9914jh1 interfaceC9914jh1, InterfaceC9914jh1 interfaceC9914jh12) {
        synchronized (this.f27333b) {
            this.f27342k = interfaceC6972uo;
            this.f27343l = interfaceC6972uo2;
            this.f27332a.add(interfaceC6972uo);
            if (interfaceC6972uo2 != null) {
                this.f27332a.add(interfaceC6972uo2);
            }
        }
        this.f27335d = interfaceC9914jh1;
        this.f27339h = interfaceC9914jh12;
        this.f27337f = m18282o(interfaceC6972uo.mo1341o(), this.f27335d, this.f27339h);
        mo18286s();
    }

    /* renamed from: c */
    public final Size m18273c() {
        C0419Ge c0419Ge = this.f27338g;
        if (c0419Ge != null) {
            return c0419Ge.f3839a;
        }
        return null;
    }

    /* renamed from: d */
    public final InterfaceC6972uo m18274d() {
        InterfaceC6972uo interfaceC6972uo;
        synchronized (this.f27333b) {
            interfaceC6972uo = this.f27342k;
        }
        return interfaceC6972uo;
    }

    /* renamed from: e */
    public final InterfaceC1560Yn m18275e() {
        synchronized (this.f27333b) {
            try {
                InterfaceC6972uo interfaceC6972uo = this.f27342k;
                if (interfaceC6972uo == null) {
                    return InterfaceC1560Yn.f14523m0;
                }
                return interfaceC6972uo.mo1333g();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* renamed from: f */
    public final String m18276f() {
        InterfaceC6972uo interfaceC6972uoM18274d = m18274d();
        AbstractC9104dM1.m17549h(interfaceC6972uoM18274d, "No camera attached to use case: " + this);
        return interfaceC6972uoM18274d.mo1341o().mo2393e();
    }

    /* renamed from: g */
    public abstract InterfaceC9914jh1 mo7101g(boolean z, InterfaceC10298mh1 interfaceC10298mh1);

    /* renamed from: h */
    public final String m18277h() {
        String strMo997K = this.f27337f.mo997K("<UnknownUseCase-" + hashCode() + ">");
        Objects.requireNonNull(strMo997K);
        return strMo997K;
    }

    /* renamed from: i */
    public final int m18278i(InterfaceC6972uo interfaceC6972uo, boolean z) {
        int iMo2404p = interfaceC6972uo.mo1341o().mo2404p(m18280l());
        return (interfaceC6972uo.mo1339m() || !z) ? iMo2404p : AbstractC11184tc1.m24954h(-iMo2404p);
    }

    /* renamed from: j */
    public final InterfaceC6972uo m18279j() {
        InterfaceC6972uo interfaceC6972uo;
        synchronized (this.f27333b) {
            interfaceC6972uo = this.f27343l;
        }
        return interfaceC6972uo;
    }

    /* renamed from: k */
    public Set mo7102k() {
        return Collections.emptySet();
    }

    /* renamed from: l */
    public final int m18280l() {
        return ((Y60) this.f27337f).mo7429n0(0);
    }

    /* renamed from: m */
    public abstract InterfaceC9786ih1 mo7103m(InterfaceC6854sw interfaceC6854sw);

    /* renamed from: n */
    public final boolean m18281n(InterfaceC6972uo interfaceC6972uo) {
        int iMo7432r = ((Y60) this.f27337f).mo7432r();
        if (iMo7432r == -1 || iMo7432r == 0) {
            return false;
        }
        if (iMo7432r == 1) {
            return true;
        }
        if (iMo7432r == 2) {
            return interfaceC6972uo.mo1331e();
        }
        throw new AssertionError(AbstractC11153tN0.m24909u(iMo7432r, "Unknown mirrorMode: "));
    }

    /* renamed from: o */
    public final InterfaceC9914jh1 m18282o(InterfaceC6766ro interfaceC6766ro, InterfaceC9914jh1 interfaceC9914jh1, InterfaceC9914jh1 interfaceC9914jh12) {
        C7612Ft0 c7612Ft0M2812b;
        if (interfaceC9914jh12 != null) {
            c7612Ft0M2812b = C7612Ft0.m2813c(interfaceC9914jh12);
            c7612Ft0M2812b.f6404a.remove(C81.f1225R0);
        } else {
            c7612Ft0M2812b = C7612Ft0.m2812b();
        }
        boolean zMo4790Q = this.f27336e.mo4790Q(Y60.f14159A0);
        TreeMap treeMap = c7612Ft0M2812b.f6404a;
        if (zMo4790Q || this.f27336e.mo4790Q(Y60.f14163E0)) {
            C0480Hc c0480Hc = Y60.f14167I0;
            if (treeMap.containsKey(c0480Hc)) {
                treeMap.remove(c0480Hc);
            }
        }
        InterfaceC9914jh1 interfaceC9914jh13 = this.f27336e;
        C0480Hc c0480Hc2 = Y60.f14167I0;
        if (interfaceC9914jh13.mo4790Q(c0480Hc2)) {
            C0480Hc c0480Hc3 = Y60.f14165G0;
            if (treeMap.containsKey(c0480Hc3) && ((C9371fS0) this.f27336e.mo4794w(c0480Hc2)).f27204b != null) {
                treeMap.remove(c0480Hc3);
            }
        }
        Iterator it = this.f27336e.mo4793u().iterator();
        while (it.hasNext()) {
            AbstractC1374Vq.m8599r(c7612Ft0M2812b, c7612Ft0M2812b, this.f27336e, (C0480Hc) it.next());
        }
        if (interfaceC9914jh1 != null) {
            for (C0480Hc c0480Hc4 : interfaceC9914jh1.mo4793u()) {
                if (!c0480Hc4.f4362a.equals(C81.f1225R0.f4362a)) {
                    AbstractC1374Vq.m8599r(c7612Ft0M2812b, c7612Ft0M2812b, interfaceC9914jh1, c0480Hc4);
                }
            }
        }
        if (treeMap.containsKey(Y60.f14163E0)) {
            C0480Hc c0480Hc5 = Y60.f14159A0;
            if (treeMap.containsKey(c0480Hc5)) {
                treeMap.remove(c0480Hc5);
            }
        }
        C0480Hc c0480Hc6 = Y60.f14167I0;
        if (treeMap.containsKey(c0480Hc6) && ((C9371fS0) c7612Ft0M2812b.mo4794w(c0480Hc6)).f27206d != 0) {
            c7612Ft0M2812b.m2815e(InterfaceC9914jh1.f35330a1, Boolean.TRUE);
        }
        return mo7104u(interfaceC6766ro, mo7103m(c7612Ft0M2812b));
    }

    /* renamed from: p */
    public final void m18283p() {
        this.f27334c = 1;
        m18285r();
    }

    /* renamed from: q */
    public final void m18284q() {
        Iterator it = this.f27332a.iterator();
        while (it.hasNext()) {
            ((InterfaceC9274eh1) it.next()).mo1330d(this);
        }
    }

    /* renamed from: r */
    public final void m18285r() {
        int iM26247x = AbstractC7222ym.m26247x(this.f27334c);
        HashSet hashSet = this.f27332a;
        if (iM26247x == 0) {
            Iterator it = hashSet.iterator();
            while (it.hasNext()) {
                ((InterfaceC9274eh1) it.next()).mo1332f(this);
            }
        } else {
            if (iM26247x != 1) {
                return;
            }
            Iterator it2 = hashSet.iterator();
            while (it2.hasNext()) {
                ((InterfaceC9274eh1) it2.next()).mo1342p(this);
            }
        }
    }

    /* renamed from: u */
    public abstract InterfaceC9914jh1 mo7104u(InterfaceC6766ro interfaceC6766ro, InterfaceC9786ih1 interfaceC9786ih1);

    /* renamed from: x */
    public abstract C0419Ge mo7107x(C3950dn c3950dn);

    /* renamed from: y */
    public abstract C0419Ge mo7108y(C0419Ge c0419Ge, C0419Ge c0419Ge2);

    /* renamed from: s */
    public void mo18286s() {
    }

    /* renamed from: t */
    public void mo18287t() {
    }

    /* renamed from: v */
    public void mo7105v() {
    }

    /* renamed from: w */
    public void mo7106w() {
    }

    /* renamed from: z */
    public void mo17508z() {
    }
}
