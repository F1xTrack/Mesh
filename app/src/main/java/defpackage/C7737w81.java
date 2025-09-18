package defpackage;

import androidx.camera.core.internal.compat.quirk.ImageCaptureRotationOptionQuirk;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;

/* renamed from: w81 */
/* loaded from: classes.dex */
public final class C7737w81 implements InterfaceC8000xX {
    public final C1304Qm0 b;
    public C7375uF c;
    public WR0 d;
    public final ArrayList e;
    public final ArrayDeque a = new ArrayDeque();
    public boolean f = false;

    public C7737w81(C1304Qm0 c1304Qm0) {
        DV1.a();
        this.b = c1304Qm0;
        this.e = new ArrayList();
    }

    public final void a() {
        DV1.a();
        C7730w60 c7730w60 = new C7730w60("Camera is closed.", null);
        ArrayDeque arrayDeque = this.a;
        Iterator it = arrayDeque.iterator();
        while (it.hasNext()) {
            C1357Re c1357Re = (C1357Re) it.next();
            c1357Re.getClass();
            c1357Re.c.execute(new MD0(c1357Re, 28, c7730w60));
        }
        arrayDeque.clear();
        Iterator it2 = new ArrayList(this.e).iterator();
        while (it2.hasNext()) {
            WR0 wr0 = (WR0) it2.next();
            wr0.getClass();
            DV1.a();
            if (!wr0.d.b.isDone()) {
                DV1.a();
                wr0.g = true;
                RunnableC3467dr runnableC3467dr = wr0.i;
                Objects.requireNonNull(runnableC3467dr);
                runnableC3467dr.cancel(true);
                wr0.e.d(c7730w60);
                wr0.f.b(null);
                DV1.a();
                C1357Re c1357Re2 = wr0.a;
                c1357Re2.c.execute(new MD0(c1357Re2, 28, c7730w60));
            }
        }
    }

    @Override // defpackage.InterfaceC8000xX
    public final void b(AbstractC8190yX abstractC8190yX) {
        QR1.h().execute(new RunnableC7547v81(this, 0));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v0 */
    /* JADX WARN: Type inference failed for: r3v1 */
    /* JADX WARN: Type inference failed for: r3v21 */
    public final void c() {
        C1357Re c1357Re;
        C7375uF c7375uF;
        Iterator it;
        AbstractC6141nn abstractC6141nn;
        G70 g70;
        ?? r3 = 1;
        DV1.a();
        if (this.d == null && !this.f) {
            C7375uF c7375uF2 = this.c;
            c7375uF2.getClass();
            DV1.a();
            if (((C0593Hj) c7375uF2.c).i() == 0 || (c1357Re = (C1357Re) this.a.poll()) == null) {
                return;
            }
            WR0 wr0 = new WR0(c1357Re, this);
            AbstractC3377dM1.i(!(this.d != null), null);
            this.d = wr0;
            DV1.a();
            wr0.c.b.d(new RunnableC7547v81(this, 1), QR1.a());
            this.e.add(wr0);
            DV1.a();
            wr0.d.b.d(new MD0(this, 27, wr0), QR1.a());
            C7375uF c7375uF3 = this.c;
            DV1.a();
            C0599Hl c0599Hl = wr0.c;
            c7375uF3.getClass();
            DV1.a();
            C1546Tp c1546Tp = (C1546Tp) ((C7540v60) c7375uF3.a).q(C7540v60.d, new C1546Tp(Arrays.asList(new C5196iq())));
            Objects.requireNonNull(c1546Tp);
            int i = C7375uF.f;
            C7375uF.f = i + 1;
            ArrayList arrayList = new ArrayList();
            String strValueOf = String.valueOf(c1546Tp.hashCode());
            List list = c1546Tp.a;
            Objects.requireNonNull(list);
            Iterator it2 = list.iterator();
            while (it2.hasNext()) {
                C5196iq c5196iq = (C5196iq) it2.next();
                C2005Zm c2005Zm = new C2005Zm();
                C1702Vp c1702Vp = (C1702Vp) c7375uF3.b;
                c2005Zm.a = c1702Vp.c;
                c2005Zm.c(c1702Vp.b);
                c2005Zm.a(c1357Re.l);
                C0260Dc c0260Dc = (C0260Dc) c7375uF3.e;
                G70 g702 = c0260Dc.c;
                Objects.requireNonNull(g702);
                c2005Zm.d(g702);
                ArrayList arrayList2 = c0260Dc.h;
                if (arrayList2.size() > r3 && (g70 = c0260Dc.d) != null) {
                    c2005Zm.d(g70);
                }
                c2005Zm.b = c0260Dc.e != null ? r3 == true ? 1 : 0 : false;
                int i2 = c0260Dc.g;
                if (AbstractC5237j22.b(i2) || i2 == 32) {
                    if (((ImageCaptureRotationOptionQuirk) AbstractC7005sJ.a.z0(ImageCaptureRotationOptionQuirk.class)) != null) {
                        C0572Hc c0572Hc = C1702Vp.i;
                        c7375uF = c7375uF3;
                    } else {
                        c7375uF = c7375uF3;
                        ((C0468Ft0) c2005Zm.e).e(C1702Vp.i, Integer.valueOf(c1357Re.h));
                    }
                    it = it2;
                    ((C0468Ft0) c2005Zm.e).e(C1702Vp.j, Integer.valueOf(((c1357Re.d != null) && AbstractC7255tc1.b(c1357Re.f, c0260Dc.f)) ? c1357Re.j == 0 ? 100 : 95 : c1357Re.i));
                } else {
                    c7375uF = c7375uF3;
                    it = it2;
                }
                c2005Zm.c(c5196iq.a.b);
                ((C0858Kt0) c2005Zm.g).a.put(strValueOf, 0);
                ((C0858Kt0) c2005Zm.g).a.put("CAPTURE_CONFIG_ID_KEY", Integer.valueOf(i));
                c2005Zm.b(c0260Dc.a);
                r3 = 1;
                if (arrayList2.size() > 1 && (abstractC6141nn = c0260Dc.b) != null) {
                    c2005Zm.b(abstractC6141nn);
                }
                arrayList.add(c2005Zm.e());
                c7375uF3 = c7375uF;
                it2 = it;
            }
            VH vh = new VH(arrayList, wr0, false, 6);
            OD0 od0 = new OD0(c1546Tp, c1357Re, wr0, c0599Hl, i);
            C7375uF c7375uF4 = this.c;
            c7375uF4.getClass();
            DV1.a();
            ((C0260Dc) c7375uF4.e).l.b(od0);
            DV1.a();
            C7349u60 c7349u60 = (C7349u60) this.b.b;
            synchronized (c7349u60.p) {
                try {
                    if (c7349u60.p.get() == null) {
                        c7349u60.p.set(Integer.valueOf(c7349u60.H()));
                    }
                } finally {
                }
            }
            C7349u60 c7349u602 = (C7349u60) this.b.b;
            c7349u602.getClass();
            DV1.a();
            RunnableC3467dr runnableC3467drR = AbstractC1500Sz1.r(c7349u602.e().a0(arrayList, c7349u602.o, c7349u602.q), new C0136Bm1(20, new C0680Im(5)), QR1.a());
            AbstractC1500Sz1.a(runnableC3467drR, new C3383dO1(this, 27, vh), QR1.h());
            DV1.a();
            boolean z = r3;
            if (wr0.i != null) {
                z = false;
            }
            AbstractC3377dM1.i(z, "CaptureRequestFuture can only be set once.");
            wr0.i = runnableC3467drR;
        }
    }
}
