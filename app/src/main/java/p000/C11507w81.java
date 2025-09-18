package p000;

import androidx.camera.core.internal.compat.quirk.ImageCaptureRotationOptionQuirk;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;

/* renamed from: w81 */
/* loaded from: classes.dex */
public final class C11507w81 implements InterfaceC7144xX {

    /* renamed from: b */
    public final C8170Qm0 f44693b;

    /* renamed from: c */
    public C6937uF f44694c;

    /* renamed from: d */
    public WR0 f44695d;

    /* renamed from: e */
    public final ArrayList f44696e;

    /* renamed from: a */
    public final ArrayDeque f44692a = new ArrayDeque();

    /* renamed from: f */
    public boolean f44697f = false;

    public C11507w81(C8170Qm0 c8170Qm0) {
        DV1.m1716a();
        this.f44693b = c8170Qm0;
        this.f44696e = new ArrayList();
    }

    /* renamed from: a */
    public final void m25566a() {
        DV1.m1716a();
        C11502w60 c11502w60 = new C11502w60("Camera is closed.", null);
        ArrayDeque arrayDeque = this.f44692a;
        Iterator it = arrayDeque.iterator();
        while (it.hasNext()) {
            C1110Re c1110Re = (C1110Re) it.next();
            c1110Re.getClass();
            c1110Re.f10349c.execute(new MD0(c1110Re, 28, c11502w60));
        }
        arrayDeque.clear();
        Iterator it2 = new ArrayList(this.f44696e).iterator();
        while (it2.hasNext()) {
            WR0 wr0 = (WR0) it2.next();
            wr0.getClass();
            DV1.m1716a();
            if (!wr0.f13182d.f4484b.isDone()) {
                DV1.m1716a();
                wr0.f13185g = true;
                RunnableC3953dr runnableC3953dr = wr0.f13187i;
                Objects.requireNonNull(runnableC3953dr);
                runnableC3953dr.cancel(true);
                wr0.f13183e.m2377d(c11502w60);
                wr0.f13184f.m2375b(null);
                DV1.m1716a();
                C1110Re c1110Re2 = wr0.f13179a;
                c1110Re2.f10349c.execute(new MD0(c1110Re2, 28, c11502w60));
            }
        }
    }

    @Override // p000.InterfaceC7144xX
    /* renamed from: b */
    public final void mo4038b(AbstractC7207yX abstractC7207yX) {
        QR1.m6710h().execute(new RunnableC11380v81(this, 0));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v0 */
    /* JADX WARN: Type inference failed for: r3v1 */
    /* JADX WARN: Type inference failed for: r3v21 */
    /* renamed from: c */
    public final void m25567c() {
        C1110Re c1110Re;
        C6937uF c6937uF;
        Iterator it;
        AbstractC6511nn abstractC6511nn;
        G70 g70;
        ?? r3 = 1;
        DV1.m1716a();
        if (this.f44695d == null && !this.f44697f) {
            C6937uF c6937uF2 = this.f44694c;
            c6937uF2.getClass();
            DV1.m1716a();
            if (((C0487Hj) c6937uF2.f43618c).m3555i() == 0 || (c1110Re = (C1110Re) this.f44692a.poll()) == null) {
                return;
            }
            WR0 wr0 = new WR0(c1110Re, this);
            AbstractC9104dM1.m17550i(!(this.f44695d != null), null);
            this.f44695d = wr0;
            DV1.m1716a();
            wr0.f13181c.f4484b.mo2494d(new RunnableC11380v81(this, 1), QR1.m6703a());
            this.f44696e.add(wr0);
            DV1.m1716a();
            wr0.f13182d.f4484b.mo2494d(new MD0(this, 27, wr0), QR1.m6703a());
            C6937uF c6937uF3 = this.f44694c;
            DV1.m1716a();
            C0489Hl c0489Hl = wr0.f13181c;
            c6937uF3.getClass();
            DV1.m1716a();
            C1247Tp c1247Tp = (C1247Tp) ((C11375v60) c6937uF3.f43616a).mo4792q(C11375v60.f44149d, new C1247Tp(Arrays.asList(new C6200iq())));
            Objects.requireNonNull(c1247Tp);
            int i = C6937uF.f43615f;
            C6937uF.f43615f = i + 1;
            ArrayList arrayList = new ArrayList();
            String strValueOf = String.valueOf(c1247Tp.hashCode());
            List list = c1247Tp.f11535a;
            Objects.requireNonNull(list);
            Iterator it2 = list.iterator();
            while (it2.hasNext()) {
                C6200iq c6200iq = (C6200iq) it2.next();
                C1622Zm c1622Zm = new C1622Zm();
                C1373Vp c1373Vp = (C1373Vp) c6937uF3.f43617b;
                c1622Zm.f15113a = c1373Vp.f12780c;
                c1622Zm.m9590c(c1373Vp.f12779b);
                c1622Zm.m9588a(c1110Re.f10358l);
                C0228Dc c0228Dc = (C0228Dc) c6937uF3.f43620e;
                G70 g702 = c0228Dc.f2062c;
                Objects.requireNonNull(g702);
                c1622Zm.m9591d(g702);
                ArrayList arrayList2 = c0228Dc.f2067h;
                if (arrayList2.size() > r3 && (g70 = c0228Dc.f2063d) != null) {
                    c1622Zm.m9591d(g70);
                }
                c1622Zm.f15114b = c0228Dc.f2064e != null ? r3 == true ? 1 : 0 : false;
                int i2 = c0228Dc.f2066g;
                if (AbstractC9831j22.m21967b(i2) || i2 == 32) {
                    if (((ImageCaptureRotationOptionQuirk) AbstractC6815sJ.f42362a.m17864z0(ImageCaptureRotationOptionQuirk.class)) != null) {
                        C0480Hc c0480Hc = C1373Vp.f12775i;
                        c6937uF = c6937uF3;
                    } else {
                        c6937uF = c6937uF3;
                        ((C7612Ft0) c1622Zm.f15117e).m2815e(C1373Vp.f12775i, Integer.valueOf(c1110Re.f10354h));
                    }
                    it = it2;
                    ((C7612Ft0) c1622Zm.f15117e).m2815e(C1373Vp.f12776j, Integer.valueOf(((c1110Re.f10350d != null) && AbstractC11184tc1.m24948b(c1110Re.f10352f, c0228Dc.f2065f)) ? c1110Re.f10356j == 0 ? 100 : 95 : c1110Re.f10355i));
                } else {
                    c6937uF = c6937uF3;
                    it = it2;
                }
                c1622Zm.m9590c(c6200iq.f34757a.f12779b);
                ((C7872Kt0) c1622Zm.f15119g).f42279a.put(strValueOf, 0);
                ((C7872Kt0) c1622Zm.f15119g).f42279a.put("CAPTURE_CONFIG_ID_KEY", Integer.valueOf(i));
                c1622Zm.m9589b(c0228Dc.f2060a);
                r3 = 1;
                if (arrayList2.size() > 1 && (abstractC6511nn = c0228Dc.f2061b) != null) {
                    c1622Zm.m9589b(abstractC6511nn);
                }
                arrayList.add(c1622Zm.m9592e());
                c6937uF3 = c6937uF;
                it2 = it;
            }
            C1339VH c1339vh = new C1339VH(arrayList, wr0, false, 6);
            OD0 od0 = new OD0(c1247Tp, c1110Re, wr0, c0489Hl, i);
            C6937uF c6937uF4 = this.f44694c;
            c6937uF4.getClass();
            DV1.m1716a();
            ((C0228Dc) c6937uF4.f43620e).f2071l.mo3020b(od0);
            DV1.m1716a();
            C11247u60 c11247u60 = (C11247u60) this.f44693b.f9780b;
            synchronized (c11247u60.f43515p) {
                try {
                    if (c11247u60.f43515p.get() == null) {
                        c11247u60.f43515p.set(Integer.valueOf(c11247u60.m25112H()));
                    }
                } finally {
                }
            }
            C11247u60 c11247u602 = (C11247u60) this.f44693b.f9780b;
            c11247u602.getClass();
            DV1.m1716a();
            RunnableC3953dr runnableC3953drM7495r = AbstractC8301Sz1.m7495r(c11247u602.m18275e().mo910a0(arrayList, c11247u602.f43514o, c11247u602.f43516q), new C7391Bm1(20, new C0553Im(5)), QR1.m6703a());
            AbstractC8301Sz1.m7478a(runnableC3953drM7495r, new C9108dO1(this, 27, c1339vh), QR1.m6710h());
            DV1.m1716a();
            boolean z = r3;
            if (wr0.f13187i != null) {
                z = false;
            }
            AbstractC9104dM1.m17550i(z, "CaptureRequestFuture can only be set once.");
            wr0.f13187i = runnableC3953drM7495r;
        }
    }
}
