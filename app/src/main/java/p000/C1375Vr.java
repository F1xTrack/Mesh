package p000;

import android.net.Uri;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* renamed from: Vr */
/* loaded from: classes.dex */
public final class C1375Vr implements InterfaceC9121dV0, InterfaceC9511gY0, InterfaceC9919jk0, InterfaceC10303mk0 {

    /* renamed from: a */
    public final int f12802a;

    /* renamed from: b */
    public final int[] f12803b;

    /* renamed from: c */
    public final C6686qX[] f12804c;

    /* renamed from: d */
    public final boolean[] f12805d;

    /* renamed from: e */
    public final InterfaceC1438Wr f12806e;

    /* renamed from: f */
    public final Object f12807f;

    /* renamed from: g */
    public final C1356VY f12808g;

    /* renamed from: h */
    public final C3979eG f12809h;

    /* renamed from: i */
    public final C8539Xo1 f12810i;

    /* renamed from: j */
    public final C0926Oi f12811j;

    /* renamed from: k */
    public final ArrayList f12812k;

    /* renamed from: l */
    public final List f12813l;

    /* renamed from: m */
    public final C8988cV0 f12814m;

    /* renamed from: n */
    public final C8988cV0[] f12815n;

    /* renamed from: o */
    public final C1339VH f12816o;

    /* renamed from: p */
    public AbstractC1061Qr f12817p;

    /* renamed from: q */
    public C6686qX f12818q;

    /* renamed from: r */
    public C6871tC f12819r;

    /* renamed from: s */
    public long f12820s;

    /* renamed from: t */
    public long f12821t;

    /* renamed from: u */
    public int f12822u;

    /* renamed from: v */
    public AbstractC6632pg f12823v;

    /* renamed from: w */
    public boolean f12824w;

    public C1375Vr(int i, int[] iArr, C6686qX[] c6686qXArr, InterfaceC1438Wr interfaceC1438Wr, InterfaceC9383fY0 interfaceC9383fY0, C6224jE c6224jE, long j, InterfaceC1091RL interfaceC1091RL, C0903OL c0903ol, C3979eG c3979eG, C1356VY c1356vy) {
        this.f12802a = i;
        int i2 = 0;
        iArr = iArr == null ? new int[0] : iArr;
        this.f12803b = iArr;
        this.f12804c = c6686qXArr == null ? new C6686qX[0] : c6686qXArr;
        this.f12806e = interfaceC1438Wr;
        this.f12807f = interfaceC9383fY0;
        this.f12808g = c1356vy;
        this.f12809h = c3979eG;
        this.f12810i = new C8539Xo1("ChunkSampleStream", 2);
        this.f12811j = new C0926Oi(1, false);
        ArrayList arrayList = new ArrayList();
        this.f12812k = arrayList;
        this.f12813l = Collections.unmodifiableList(arrayList);
        int length = iArr.length;
        this.f12815n = new C8988cV0[length];
        this.f12805d = new boolean[length];
        int i3 = length + 1;
        int[] iArr2 = new int[i3];
        C8988cV0[] c8988cV0Arr = new C8988cV0[i3];
        interfaceC1091RL.getClass();
        C8988cV0 c8988cV0 = new C8988cV0(c6224jE, interfaceC1091RL, c0903ol);
        this.f12814m = c8988cV0;
        iArr2[0] = i;
        c8988cV0Arr[0] = c8988cV0;
        while (i2 < length) {
            C8988cV0 c8988cV02 = new C8988cV0(c6224jE, null, null);
            this.f12815n[i2] = c8988cV02;
            int i4 = i2 + 1;
            c8988cV0Arr[i4] = c8988cV02;
            iArr2[i4] = this.f12803b[i2];
            i2 = i4;
        }
        this.f12816o = new C1339VH(iArr2, c8988cV0Arr, false, 4);
        this.f12820s = j;
        this.f12821t = j;
    }

    /* renamed from: A */
    public final void m8603A(C6871tC c6871tC) {
        this.f12819r = c6871tC;
        C8988cV0 c8988cV0 = this.f12814m;
        c8988cV0.m10725j();
        InterfaceC0715LL interfaceC0715LL = c8988cV0.f17554h;
        if (interfaceC0715LL != null) {
            interfaceC0715LL.mo4951d(c8988cV0.f17551e);
            c8988cV0.f17554h = null;
            c8988cV0.f17553g = null;
        }
        for (C8988cV0 c8988cV02 : this.f12815n) {
            c8988cV02.m10725j();
            InterfaceC0715LL interfaceC0715LL2 = c8988cV02.f17554h;
            if (interfaceC0715LL2 != null) {
                interfaceC0715LL2.mo4951d(c8988cV02.f17551e);
                c8988cV02.f17554h = null;
                c8988cV02.f17553g = null;
            }
        }
        this.f12810i.m9133P(this);
    }

    /* renamed from: B */
    public final void m8604B(long j) {
        ArrayList arrayList;
        AbstractC6632pg abstractC6632pg;
        this.f12821t = j;
        if (m8609x()) {
            this.f12820s = j;
            return;
        }
        int i = 0;
        int i2 = 0;
        while (true) {
            arrayList = this.f12812k;
            if (i2 >= arrayList.size()) {
                break;
            }
            abstractC6632pg = (AbstractC6632pg) arrayList.get(i2);
            long j2 = abstractC6632pg.f9817g;
            if (j2 == j && abstractC6632pg.f40272k == -9223372036854775807L) {
                break;
            } else if (j2 > j) {
                break;
            } else {
                i2++;
            }
        }
        abstractC6632pg = null;
        C8988cV0 c8988cV0 = this.f12814m;
        boolean zM10719E = abstractC6632pg != null ? c8988cV0.m10719E(abstractC6632pg.m23833c(0)) : c8988cV0.m10720F(j, j < mo1880e());
        C8988cV0[] c8988cV0Arr = this.f12815n;
        if (zM10719E) {
            this.f12822u = m8611z(c8988cV0.m10732r(), 0);
            int length = c8988cV0Arr.length;
            while (i < length) {
                c8988cV0Arr[i].m10720F(j, true);
                i++;
            }
            return;
        }
        this.f12820s = j;
        this.f12824w = false;
        arrayList.clear();
        this.f12822u = 0;
        C8539Xo1 c8539Xo1 = this.f12810i;
        if (c8539Xo1.m9127I()) {
            c8988cV0.m10725j();
            int length2 = c8988cV0Arr.length;
            while (i < length2) {
                c8988cV0Arr[i].m10725j();
                i++;
            }
            c8539Xo1.m9147p();
            return;
        }
        c8539Xo1.f13983d = null;
        c8988cV0.m10717C(false);
        for (C8988cV0 c8988cV02 : c8988cV0Arr) {
            c8988cV02.m10717C(false);
        }
    }

    @Override // p000.InterfaceC9121dV0
    /* renamed from: a */
    public final void mo34a() throws IOException {
        C8539Xo1 c8539Xo1 = this.f12810i;
        c8539Xo1.mo858a();
        this.f12814m.m10739y();
        if (c8539Xo1.m9127I()) {
            return;
        }
        this.f12806e.mo2563a();
    }

    @Override // p000.InterfaceC10303mk0
    /* renamed from: c */
    public final void mo1998c() {
        C8988cV0 c8988cV0 = this.f12814m;
        c8988cV0.m10717C(true);
        InterfaceC0715LL interfaceC0715LL = c8988cV0.f17554h;
        if (interfaceC0715LL != null) {
            interfaceC0715LL.mo4951d(c8988cV0.f17551e);
            c8988cV0.f17554h = null;
            c8988cV0.f17553g = null;
        }
        for (C8988cV0 c8988cV02 : this.f12815n) {
            c8988cV02.m10717C(true);
            InterfaceC0715LL interfaceC0715LL2 = c8988cV02.f17554h;
            if (interfaceC0715LL2 != null) {
                interfaceC0715LL2.mo4951d(c8988cV02.f17551e);
                c8988cV02.f17554h = null;
                c8988cV02.f17553g = null;
            }
        }
        this.f12806e.release();
        C6871tC c6871tC = this.f12819r;
        if (c6871tC != null) {
            synchronized (c6871tC) {
                KB0 kb0 = (KB0) c6871tC.f42935o.remove(this);
                if (kb0 != null) {
                    C8988cV0 c8988cV03 = kb0.f5931a;
                    c8988cV03.m10717C(true);
                    InterfaceC0715LL interfaceC0715LL3 = c8988cV03.f17554h;
                    if (interfaceC0715LL3 != null) {
                        interfaceC0715LL3.mo4951d(c8988cV03.f17551e);
                        c8988cV03.f17554h = null;
                        c8988cV03.f17553g = null;
                    }
                }
            }
        }
    }

    @Override // p000.InterfaceC9511gY0
    /* renamed from: e */
    public final long mo1880e() {
        if (m8609x()) {
            return this.f12820s;
        }
        if (this.f12824w) {
            return Long.MIN_VALUE;
        }
        return m8607u().f9818h;
    }

    @Override // p000.InterfaceC9121dV0
    /* renamed from: f */
    public final boolean mo37f() {
        return !m8609x() && this.f12814m.m10737w(this.f12824w);
    }

    /* renamed from: i */
    public final void m8605i(long j) {
        long j2;
        if (m8609x()) {
            return;
        }
        C8988cV0 c8988cV0 = this.f12814m;
        int i = c8988cV0.f17563q;
        c8988cV0.m10724i(j, true);
        C8988cV0 c8988cV02 = this.f12814m;
        int i2 = c8988cV02.f17563q;
        if (i2 > i) {
            synchronized (c8988cV02) {
                j2 = c8988cV02.f17562p == 0 ? Long.MIN_VALUE : c8988cV02.f17560n[c8988cV02.f17564r];
            }
            int i3 = 0;
            while (true) {
                C8988cV0[] c8988cV0Arr = this.f12815n;
                if (i3 >= c8988cV0Arr.length) {
                    break;
                }
                c8988cV0Arr[i3].m10724i(j2, this.f12805d[i3]);
                i3++;
            }
        }
        int iMin = Math.min(m8611z(i2, 0), this.f12822u);
        if (iMin > 0) {
            AbstractC7485Dh1.m1807V(this.f12812k, 0, iMin);
            this.f12822u -= iMin;
        }
    }

    @Override // p000.InterfaceC9121dV0
    /* renamed from: j */
    public final int mo38j(long j) {
        if (m8609x()) {
            return 0;
        }
        C8988cV0 c8988cV0 = this.f12814m;
        int iM10734t = c8988cV0.m10734t(j, this.f12824w);
        AbstractC6632pg abstractC6632pg = this.f12823v;
        if (abstractC6632pg != null) {
            iM10734t = Math.min(iM10734t, abstractC6632pg.m23833c(0) - c8988cV0.m10732r());
        }
        c8988cV0.m10721G(iM10734t);
        m8610y();
        return iM10734t;
    }

    @Override // p000.InterfaceC9121dV0
    /* renamed from: k */
    public final int mo39k(C0827N8 c0827n8, C1587ZD c1587zd, int i) {
        if (m8609x()) {
            return -3;
        }
        AbstractC6632pg abstractC6632pg = this.f12823v;
        C8988cV0 c8988cV0 = this.f12814m;
        if (abstractC6632pg != null && abstractC6632pg.m23833c(0) <= c8988cV0.m10732r()) {
            return -3;
        }
        m8610y();
        return c8988cV0.m10716B(c0827n8, c1587zd, i, this.f12824w);
    }

    @Override // p000.InterfaceC9511gY0
    /* renamed from: l */
    public final boolean mo1884l() {
        return this.f12810i.m9127I();
    }

    /* JADX WARN: Type inference failed for: r1v6, types: [fY0, java.lang.Object] */
    @Override // p000.InterfaceC9919jk0
    /* renamed from: m */
    public final void mo2001m(InterfaceC10175lk0 interfaceC10175lk0, long j, long j2, boolean z) {
        AbstractC1061Qr abstractC1061Qr = (AbstractC1061Qr) interfaceC10175lk0;
        this.f12817p = null;
        this.f12823v = null;
        long j3 = abstractC1061Qr.f9811a;
        Uri uri = abstractC1061Qr.f9819i.f6987c;
        C9535gk0 c9535gk0 = new C9535gk0(j2);
        this.f12809h.getClass();
        this.f12808g.m8472J(c9535gk0, abstractC1061Qr.f9813c, this.f12802a, abstractC1061Qr.f9814d, abstractC1061Qr.f9815e, abstractC1061Qr.f9816f, abstractC1061Qr.f9817g, abstractC1061Qr.f9818h);
        if (z) {
            return;
        }
        if (m8609x()) {
            this.f12814m.m10717C(false);
            for (C8988cV0 c8988cV0 : this.f12815n) {
                c8988cV0.m10717C(false);
            }
        } else if (abstractC1061Qr instanceof AbstractC6632pg) {
            ArrayList arrayList = this.f12812k;
            m8606p(arrayList.size() - 1);
            if (arrayList.isEmpty()) {
                this.f12820s = this.f12821t;
            }
        }
        this.f12807f.mo1885m(this);
    }

    /* JADX WARN: Type inference failed for: r1v3, types: [fY0, java.lang.Object] */
    @Override // p000.InterfaceC9919jk0
    /* renamed from: o0 */
    public final C9407fk0 mo2002o0(InterfaceC10175lk0 interfaceC10175lk0, long j, long j2, IOException iOException, int i) {
        C9407fk0 c9407fk0;
        AbstractC1061Qr abstractC1061Qr = (AbstractC1061Qr) interfaceC10175lk0;
        long j3 = abstractC1061Qr.f9819i.f6986b;
        boolean z = abstractC1061Qr instanceof AbstractC6632pg;
        ArrayList arrayList = this.f12812k;
        int size = arrayList.size() - 1;
        boolean z2 = (j3 != 0 && z && m8608w(size)) ? false : true;
        Uri uri = abstractC1061Qr.f9819i.f6987c;
        C9535gk0 c9535gk0 = new C9535gk0(j2);
        AbstractC7485Dh1.m1819d0(abstractC1061Qr.f9817g);
        AbstractC7485Dh1.m1819d0(abstractC1061Qr.f9818h);
        C0986Pf c0986Pf = new C0986Pf(iOException, i, 9);
        InterfaceC1438Wr interfaceC1438Wr = this.f12806e;
        C3979eG c3979eG = this.f12809h;
        if (!interfaceC1438Wr.mo2568f(abstractC1061Qr, z2, c0986Pf, c3979eG)) {
            c9407fk0 = null;
        } else if (z2) {
            if (z) {
                YN1.m9281f(m8606p(size) == abstractC1061Qr);
                if (arrayList.isEmpty()) {
                    this.f12820s = this.f12821t;
                }
            }
            c9407fk0 = C8539Xo1.f13978h;
        } else {
            AbstractC10872rA1.m24175h("Ignoring attempt to cancel non-cancelable load.");
            c9407fk0 = null;
        }
        if (c9407fk0 == null) {
            long jMo17892e = c3979eG.mo17892e(c0986Pf);
            c9407fk0 = jMo17892e != -9223372036854775807L ? new C9407fk0(0, jMo17892e, false) : C8539Xo1.f13979i;
        }
        boolean zM18291a = c9407fk0.m18291a();
        C9407fk0 c9407fk02 = c9407fk0;
        this.f12808g.m8477O(c9535gk0, abstractC1061Qr.f9813c, this.f12802a, abstractC1061Qr.f9814d, abstractC1061Qr.f9815e, abstractC1061Qr.f9816f, abstractC1061Qr.f9817g, abstractC1061Qr.f9818h, iOException, !zM18291a);
        if (!zM18291a) {
            this.f12817p = null;
            c3979eG.getClass();
            this.f12807f.mo1885m(this);
        }
        return c9407fk02;
    }

    /* renamed from: p */
    public final AbstractC6632pg m8606p(int i) {
        ArrayList arrayList = this.f12812k;
        AbstractC6632pg abstractC6632pg = (AbstractC6632pg) arrayList.get(i);
        AbstractC7485Dh1.m1807V(arrayList, i, arrayList.size());
        this.f12822u = Math.max(this.f12822u, arrayList.size());
        int i2 = 0;
        this.f12814m.m10727l(abstractC6632pg.m23833c(0));
        while (true) {
            C8988cV0[] c8988cV0Arr = this.f12815n;
            if (i2 >= c8988cV0Arr.length) {
                return abstractC6632pg;
            }
            C8988cV0 c8988cV0 = c8988cV0Arr[i2];
            i2++;
            c8988cV0.m10727l(abstractC6632pg.m23833c(i2));
        }
    }

    @Override // p000.InterfaceC9511gY0
    /* renamed from: r */
    public final boolean mo1889r(C11455vk0 c11455vk0) {
        long j;
        List listEmptyList;
        if (!this.f12824w) {
            C8539Xo1 c8539Xo1 = this.f12810i;
            if (!c8539Xo1.m9127I() && !c8539Xo1.m9125G()) {
                boolean zM8609x = m8609x();
                if (zM8609x) {
                    listEmptyList = Collections.emptyList();
                    j = this.f12820s;
                } else {
                    j = m8607u().f9818h;
                    listEmptyList = this.f12813l;
                }
                this.f12806e.mo2565c(c11455vk0, j, listEmptyList, this.f12811j);
                C0926Oi c0926Oi = this.f12811j;
                boolean z = c0926Oi.f8575b;
                AbstractC1061Qr abstractC1061Qr = (AbstractC1061Qr) c0926Oi.f8576c;
                c0926Oi.f8576c = null;
                c0926Oi.f8575b = false;
                if (z) {
                    this.f12820s = -9223372036854775807L;
                    this.f12824w = true;
                    return true;
                }
                if (abstractC1061Qr == null) {
                    return false;
                }
                this.f12817p = abstractC1061Qr;
                boolean z2 = abstractC1061Qr instanceof AbstractC6632pg;
                C1339VH c1339vh = this.f12816o;
                if (z2) {
                    AbstractC6632pg abstractC6632pg = (AbstractC6632pg) abstractC1061Qr;
                    if (zM8609x) {
                        long j2 = this.f12820s;
                        if (abstractC6632pg.f9817g != j2) {
                            this.f12814m.f17566t = j2;
                            for (C8988cV0 c8988cV0 : this.f12815n) {
                                c8988cV0.f17566t = this.f12820s;
                            }
                        }
                        this.f12820s = -9223372036854775807L;
                    }
                    abstractC6632pg.f40274m = c1339vh;
                    C8988cV0[] c8988cV0Arr = (C8988cV0[]) c1339vh.f12487c;
                    int[] iArr = new int[c8988cV0Arr.length];
                    for (int i = 0; i < c8988cV0Arr.length; i++) {
                        C8988cV0 c8988cV02 = c8988cV0Arr[i];
                        iArr[i] = c8988cV02.f17563q + c8988cV02.f17562p;
                    }
                    abstractC6632pg.f40275n = iArr;
                    this.f12812k.add(abstractC6632pg);
                } else if (abstractC1061Qr instanceof C10611p80) {
                    ((C10611p80) abstractC1061Qr).f39859k = c1339vh;
                }
                this.f12808g.m8481S(new C9535gk0(abstractC1061Qr.f9811a, abstractC1061Qr.f9812b, c8539Xo1.m9136S(abstractC1061Qr, this, this.f12809h.mo17891d(abstractC1061Qr.f9813c))), abstractC1061Qr.f9813c, this.f12802a, abstractC1061Qr.f9814d, abstractC1061Qr.f9815e, abstractC1061Qr.f9816f, abstractC1061Qr.f9817g, abstractC1061Qr.f9818h);
                return true;
            }
        }
        return false;
    }

    @Override // p000.InterfaceC9511gY0
    /* renamed from: s */
    public final long mo1890s() {
        if (this.f12824w) {
            return Long.MIN_VALUE;
        }
        if (m8609x()) {
            return this.f12820s;
        }
        long jMax = this.f12821t;
        AbstractC6632pg abstractC6632pgM8607u = m8607u();
        if (!abstractC6632pgM8607u.mo1899b()) {
            ArrayList arrayList = this.f12812k;
            abstractC6632pgM8607u = arrayList.size() > 1 ? (AbstractC6632pg) AbstractC7222ym.m26228e(2, arrayList) : null;
        }
        if (abstractC6632pgM8607u != null) {
            jMax = Math.max(jMax, abstractC6632pgM8607u.f9818h);
        }
        return Math.max(jMax, this.f12814m.m10729o());
    }

    @Override // p000.InterfaceC9511gY0
    /* renamed from: t */
    public final void mo1891t(long j) {
        C8539Xo1 c8539Xo1 = this.f12810i;
        if (c8539Xo1.m9125G() || m8609x()) {
            return;
        }
        boolean zM9127I = c8539Xo1.m9127I();
        InterfaceC1438Wr interfaceC1438Wr = this.f12806e;
        ArrayList arrayList = this.f12812k;
        List list = this.f12813l;
        if (zM9127I) {
            AbstractC1061Qr abstractC1061Qr = this.f12817p;
            abstractC1061Qr.getClass();
            boolean z = abstractC1061Qr instanceof AbstractC6632pg;
            if (!(z && m8608w(arrayList.size() - 1)) && interfaceC1438Wr.mo2567e(j, abstractC1061Qr, list)) {
                c8539Xo1.m9147p();
                if (z) {
                    this.f12823v = (AbstractC6632pg) abstractC1061Qr;
                    return;
                }
                return;
            }
            return;
        }
        int iMo2569g = interfaceC1438Wr.mo2569g(j, list);
        if (iMo2569g < arrayList.size()) {
            YN1.m9281f(!c8539Xo1.m9127I());
            int size = arrayList.size();
            while (true) {
                if (iMo2569g >= size) {
                    iMo2569g = -1;
                    break;
                } else if (!m8608w(iMo2569g)) {
                    break;
                } else {
                    iMo2569g++;
                }
            }
            if (iMo2569g == -1) {
                return;
            }
            long j2 = m8607u().f9818h;
            AbstractC6632pg abstractC6632pgM8606p = m8606p(iMo2569g);
            if (arrayList.isEmpty()) {
                this.f12820s = this.f12821t;
            }
            this.f12824w = false;
            this.f12808g.m8498h0(new C11081sp0(1, this.f12802a, null, 3, null, AbstractC7485Dh1.m1819d0(abstractC6632pgM8606p.f9817g), AbstractC7485Dh1.m1819d0(j2)));
        }
    }

    /* renamed from: u */
    public final AbstractC6632pg m8607u() {
        return (AbstractC6632pg) AbstractC7222ym.m26228e(1, this.f12812k);
    }

    /* JADX WARN: Type inference failed for: r1v2, types: [fY0, java.lang.Object] */
    @Override // p000.InterfaceC9919jk0
    /* renamed from: v */
    public final void mo2004v(InterfaceC10175lk0 interfaceC10175lk0, long j, long j2) {
        AbstractC1061Qr abstractC1061Qr = (AbstractC1061Qr) interfaceC10175lk0;
        this.f12817p = null;
        this.f12806e.mo2566d(abstractC1061Qr);
        long j3 = abstractC1061Qr.f9811a;
        Uri uri = abstractC1061Qr.f9819i.f6987c;
        C9535gk0 c9535gk0 = new C9535gk0(j2);
        this.f12809h.getClass();
        this.f12808g.m8475M(c9535gk0, abstractC1061Qr.f9813c, this.f12802a, abstractC1061Qr.f9814d, abstractC1061Qr.f9815e, abstractC1061Qr.f9816f, abstractC1061Qr.f9817g, abstractC1061Qr.f9818h);
        this.f12807f.mo1885m(this);
    }

    /* renamed from: w */
    public final boolean m8608w(int i) {
        int iM10732r;
        AbstractC6632pg abstractC6632pg = (AbstractC6632pg) this.f12812k.get(i);
        if (this.f12814m.m10732r() > abstractC6632pg.m23833c(0)) {
            return true;
        }
        int i2 = 0;
        do {
            C8988cV0[] c8988cV0Arr = this.f12815n;
            if (i2 >= c8988cV0Arr.length) {
                return false;
            }
            iM10732r = c8988cV0Arr[i2].m10732r();
            i2++;
        } while (iM10732r <= abstractC6632pg.m23833c(i2));
        return true;
    }

    /* renamed from: x */
    public final boolean m8609x() {
        return this.f12820s != -9223372036854775807L;
    }

    /* renamed from: y */
    public final void m8610y() {
        int iM8611z = m8611z(this.f12814m.m10732r(), this.f12822u - 1);
        while (true) {
            int i = this.f12822u;
            if (i > iM8611z) {
                return;
            }
            this.f12822u = i + 1;
            AbstractC6632pg abstractC6632pg = (AbstractC6632pg) this.f12812k.get(i);
            C6686qX c6686qX = abstractC6632pg.f9814d;
            if (!c6686qX.equals(this.f12818q)) {
                this.f12808g.m8504x(this.f12802a, c6686qX, abstractC6632pg.f9815e, abstractC6632pg.f9816f, abstractC6632pg.f9817g);
            }
            this.f12818q = c6686qX;
        }
    }

    /* renamed from: z */
    public final int m8611z(int i, int i2) {
        ArrayList arrayList;
        do {
            i2++;
            arrayList = this.f12812k;
            if (i2 >= arrayList.size()) {
                return arrayList.size() - 1;
            }
        } while (((AbstractC6632pg) arrayList.get(i2)).m23833c(0) <= i);
        return i2 - 1;
    }
}
