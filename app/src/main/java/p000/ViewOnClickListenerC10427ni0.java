package p000;

import android.view.View;
import java.util.List;

/* renamed from: ni0 */
/* loaded from: classes.dex */
public final class ViewOnClickListenerC10427ni0 implements GB0, View.OnClickListener {

    /* renamed from: a */
    public final /* synthetic */ C10683pi0 f38475a;

    public ViewOnClickListenerC10427ni0(C10683pi0 c10683pi0) {
        this.f38475a = c10683pi0;
    }

    @Override // p000.GB0
    /* renamed from: A */
    public final /* synthetic */ void mo2940A(List list) {
    }

    @Override // p000.GB0
    /* renamed from: B */
    public final /* synthetic */ void mo2941B(int i, boolean z) {
    }

    @Override // p000.GB0
    /* renamed from: C */
    public final /* synthetic */ void mo2942C(CB0 cb0) {
    }

    @Override // p000.GB0
    /* renamed from: D */
    public final /* synthetic */ void mo2943D(EB0 eb0) {
    }

    @Override // p000.GB0
    /* renamed from: F */
    public final /* synthetic */ void mo2944F(C7660Gr0 c7660Gr0) {
    }

    @Override // p000.GB0
    /* renamed from: G */
    public final /* synthetic */ void mo2945G(C10825qp0 c10825qp0, int i) {
    }

    @Override // p000.GB0
    /* renamed from: H */
    public final /* synthetic */ void mo2946H(int i, int i2) {
    }

    @Override // p000.GB0
    /* renamed from: I */
    public final /* synthetic */ void mo2947I(boolean z) {
    }

    @Override // p000.GB0
    /* renamed from: a */
    public final /* synthetic */ void mo2948a(int i) {
    }

    @Override // p000.GB0
    /* renamed from: b */
    public final /* synthetic */ void mo2949b(C1017Q9 c1017q9) {
    }

    @Override // p000.GB0
    /* renamed from: e */
    public final /* synthetic */ void mo2950e(C8321Tj1 c8321Tj1) {
    }

    @Override // p000.GB0
    /* renamed from: g */
    public final /* synthetic */ void mo2951g(boolean z) {
    }

    @Override // p000.GB0
    /* renamed from: h */
    public final /* synthetic */ void mo2952h(int i, boolean z) {
    }

    @Override // p000.GB0
    /* renamed from: i */
    public final /* synthetic */ void mo2953i(float f) {
    }

    @Override // p000.GB0
    /* renamed from: j */
    public final /* synthetic */ void mo2954j(int i) {
    }

    @Override // p000.GB0
    /* renamed from: m */
    public final /* synthetic */ void mo2955m(boolean z) {
    }

    @Override // p000.GB0
    /* renamed from: n */
    public final /* synthetic */ void mo2956n(C6996vB c6996vB) {
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        C10683pi0 c10683pi0 = this.f38475a;
        IB0 ib0 = c10683pi0.f40293G;
        if (ib0 == null) {
            return;
        }
        if (c10683pi0.f40316d == view) {
            ((AbstractC1259U0) ib0).m7847p1();
            return;
        }
        if (c10683pi0.f40314c == view) {
            ((AbstractC1259U0) ib0).m7849r1();
            return;
        }
        if (c10683pi0.f40320g == view) {
            if (((C1474XQ) ib0).m9014K1() != 4) {
                AbstractC1259U0 abstractC1259U0 = (AbstractC1259U0) ib0;
                C1474XQ c1474xq = (C1474XQ) abstractC1259U0;
                c1474xq.m9035g2();
                abstractC1259U0.m7848q1(12, c1474xq.f13744v);
                return;
            }
            return;
        }
        if (c10683pi0.f40321h == view) {
            AbstractC1259U0 abstractC1259U02 = (AbstractC1259U0) ib0;
            C1474XQ c1474xq2 = (C1474XQ) abstractC1259U02;
            c1474xq2.m9035g2();
            abstractC1259U02.m7848q1(11, -c1474xq2.f13742u);
            return;
        }
        if (c10683pi0.f40318e == view) {
            AbstractC7485Dh1.m1794I(ib0);
            return;
        }
        if (c10683pi0.f40319f == view) {
            AbstractC7485Dh1.m1793H(ib0);
            return;
        }
        if (c10683pi0.f40322i == view) {
            C1474XQ c1474xq3 = (C1474XQ) ib0;
            c1474xq3.m9035g2();
            int i = c1474xq3.f13694F;
            int i2 = c10683pi0.f40301O;
            for (int i3 = 1; i3 <= 2; i3++) {
                int i4 = (i + i3) % 3;
                if (i4 != 0) {
                    if (i4 != 1) {
                        if (i4 != 2 || (i2 & 2) == 0) {
                        }
                    } else if ((i2 & 1) == 0) {
                    }
                }
                i = i4;
            }
            c1474xq3.m9027Y1(i);
            return;
        }
        if (c10683pi0.f40323j == view) {
            C1474XQ c1474xq4 = (C1474XQ) ib0;
            c1474xq4.m9035g2();
            boolean z = !c1474xq4.f13695G;
            c1474xq4.m9035g2();
            if (c1474xq4.f13695G != z) {
                c1474xq4.f13695G = z;
                R71 r71 = c1474xq4.f13729l.f26088h;
                r71.getClass();
                Q71 q71M6903b = R71.m6903b();
                q71M6903b.f9486a = r71.f10020a.obtainMessage(12, z ? 1 : 0, 0);
                q71M6903b.m6576b();
                C1159SQ c1159sq = new C1159SQ(z, 0);
                C8372Uj0 c8372Uj0 = c1474xq4.f13730m;
                c8372Uj0.m8131c(9, c1159sq);
                c1474xq4.m9031c2();
                c8372Uj0.m8130b();
            }
        }
    }

    @Override // p000.GB0
    /* renamed from: p */
    public final /* synthetic */ void mo2957p(C9264ec1 c9264ec1) {
    }

    @Override // p000.GB0
    /* renamed from: q */
    public final void mo2958q(IB0 ib0, FB0 fb0) {
        boolean zM2544a = fb0.m2544a(4, 5);
        C10683pi0 c10683pi0 = this.f38475a;
        if (zM2544a) {
            c10683pi0.m23846h();
        }
        if (fb0.m2544a(4, 5, 7)) {
            c10683pi0.m23847i();
        }
        C1353VV c1353vv = fb0.f3085a;
        if (c1353vv.f12594a.get(8)) {
            c10683pi0.m23848j();
        }
        if (c1353vv.f12594a.get(9)) {
            c10683pi0.m23849k();
        }
        if (fb0.m2544a(8, 9, 11, 0, 13)) {
            c10683pi0.m23845g();
        }
        if (fb0.m2544a(11, 0)) {
            c10683pi0.m23850l();
        }
    }

    @Override // p000.GB0
    /* renamed from: r */
    public final /* synthetic */ void mo2959r(int i, HB0 hb0, HB0 hb02) {
    }

    @Override // p000.GB0
    /* renamed from: s */
    public final /* synthetic */ void mo2960s(int i) {
    }

    @Override // p000.GB0
    /* renamed from: t */
    public final /* synthetic */ void mo2961t(C11337up0 c11337up0) {
    }

    @Override // p000.GB0
    /* renamed from: u */
    public final /* synthetic */ void mo2962u(C0531IQ c0531iq) {
    }

    @Override // p000.GB0
    /* renamed from: w */
    public final /* synthetic */ void mo2963w(int i) {
    }

    @Override // p000.GB0
    /* renamed from: x */
    public final /* synthetic */ void mo2964x(C0531IQ c0531iq) {
    }

    @Override // p000.GB0
    /* renamed from: y */
    public final /* synthetic */ void mo2965y() {
    }

    @Override // p000.GB0
    /* renamed from: z */
    public final /* synthetic */ void mo2966z(boolean z) {
    }
}
