package p000;

import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathMeasure;
import android.graphics.PointF;
import android.graphics.RectF;
import java.util.ArrayList;

/* renamed from: Dg */
/* loaded from: classes.dex */
public abstract class AbstractC0232Dg implements InterfaceC4194hg, InterfaceC8052Of0, InterfaceC0463HL {

    /* renamed from: e */
    public final C10307mm0 f2142e;

    /* renamed from: f */
    public final AbstractC6504ng f2143f;

    /* renamed from: h */
    public final float[] f2145h;

    /* renamed from: i */
    public final C8314Tg0 f2146i;

    /* renamed from: j */
    public final C6494nW f2147j;

    /* renamed from: k */
    public final C0435Gu f2148k;

    /* renamed from: l */
    public final ArrayList f2149l;

    /* renamed from: m */
    public final C6494nW f2150m;

    /* renamed from: n */
    public C7901Lh1 f2151n;

    /* renamed from: o */
    public AbstractC6378lg f2152o;

    /* renamed from: p */
    public float f2153p;

    /* renamed from: q */
    public final C4048fM f2154q;

    /* renamed from: a */
    public final PathMeasure f2138a = new PathMeasure();

    /* renamed from: b */
    public final Path f2139b = new Path();

    /* renamed from: c */
    public final Path f2140c = new Path();

    /* renamed from: d */
    public final RectF f2141d = new RectF();

    /* renamed from: g */
    public final ArrayList f2144g = new ArrayList();

    public AbstractC0232Dg(C10307mm0 c10307mm0, AbstractC6504ng abstractC6504ng, Paint.Cap cap, Paint.Join join, float f, C0635K4 c0635k4, C0698L4 c0698l4, ArrayList arrayList, C0698L4 c0698l42) {
        C8314Tg0 c8314Tg0 = new C8314Tg0(1, 0);
        this.f2146i = c8314Tg0;
        this.f2153p = 0.0f;
        this.f2142e = c10307mm0;
        this.f2143f = abstractC6504ng;
        c8314Tg0.setStyle(Paint.Style.STROKE);
        c8314Tg0.setStrokeCap(cap);
        c8314Tg0.setStrokeJoin(join);
        c8314Tg0.setStrokeMiter(f);
        this.f2148k = (C0435Gu) c0635k4.mo4553M0();
        this.f2147j = c0698l4.mo4553M0();
        if (c0698l42 == null) {
            this.f2150m = null;
        } else {
            this.f2150m = c0698l42.mo4553M0();
        }
        this.f2149l = new ArrayList(arrayList.size());
        this.f2145h = new float[arrayList.size()];
        for (int i = 0; i < arrayList.size(); i++) {
            this.f2149l.add(((C0698L4) arrayList.get(i)).mo4553M0());
        }
        abstractC6504ng.m23162e(this.f2148k);
        abstractC6504ng.m23162e(this.f2147j);
        for (int i2 = 0; i2 < this.f2149l.size(); i2++) {
            abstractC6504ng.m23162e((AbstractC6378lg) this.f2149l.get(i2));
        }
        C6494nW c6494nW = this.f2150m;
        if (c6494nW != null) {
            abstractC6504ng.m23162e(c6494nW);
        }
        this.f2148k.m22527a(this);
        this.f2147j.m22527a(this);
        for (int i3 = 0; i3 < arrayList.size(); i3++) {
            ((AbstractC6378lg) this.f2149l.get(i3)).m22527a(this);
        }
        C6494nW c6494nW2 = this.f2150m;
        if (c6494nW2 != null) {
            c6494nW2.m22527a(this);
        }
        if (abstractC6504ng.mo8507l() != null) {
            C6494nW c6494nWMo4553M0 = ((C0698L4) abstractC6504ng.mo8507l().f3494a).mo4553M0();
            this.f2152o = c6494nWMo4553M0;
            c6494nWMo4553M0.m22527a(this);
            abstractC6504ng.m23162e(this.f2152o);
        }
        if (abstractC6504ng.mo8508m() != null) {
            this.f2154q = new C4048fM(this, abstractC6504ng, abstractC6504ng.mo8508m());
        }
    }

    @Override // p000.InterfaceC4194hg
    /* renamed from: a */
    public final void mo1741a() {
        this.f2142e.invalidateSelf();
    }

    /* JADX WARN: Removed duplicated region for block: B:64:0x0050  */
    @Override // p000.InterfaceC6793ry
    /* renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void mo1742b(java.util.List r8, java.util.List r9) {
        /*
            r7 = this;
            java.util.ArrayList r8 = (java.util.ArrayList) r8
            int r0 = r8.size()
            int r0 = r0 + (-1)
            r1 = 0
            r2 = r1
        La:
            r3 = 2
            if (r0 < 0) goto L21
            java.lang.Object r4 = r8.get(r0)
            ry r4 = (p000.InterfaceC6793ry) r4
            boolean r5 = r4 instanceof p000.C9138dd1
            if (r5 == 0) goto L1e
            dd1 r4 = (p000.C9138dd1) r4
            int r5 = r4.f26172c
            if (r5 != r3) goto L1e
            r2 = r4
        L1e:
            int r0 = r0 + (-1)
            goto La
        L21:
            if (r2 == 0) goto L26
            r2.m17719c(r7)
        L26:
            int r8 = r9.size()
            int r8 = r8 + (-1)
        L2c:
            java.util.ArrayList r0 = r7.f2144g
            if (r8 < 0) goto L65
            java.lang.Object r4 = r9.get(r8)
            ry r4 = (p000.InterfaceC6793ry) r4
            boolean r5 = r4 instanceof p000.C9138dd1
            if (r5 == 0) goto L50
            r5 = r4
            dd1 r5 = (p000.C9138dd1) r5
            int r6 = r5.f26172c
            if (r6 != r3) goto L50
            if (r1 == 0) goto L46
            r0.add(r1)
        L46:
            Cg r0 = new Cg
            r0.<init>(r5)
            r5.m17719c(r7)
            r1 = r0
            goto L62
        L50:
            boolean r0 = r4 instanceof p000.InterfaceC10615pA0
            if (r0 == 0) goto L62
            if (r1 != 0) goto L5b
            Cg r1 = new Cg
            r1.<init>(r2)
        L5b:
            java.util.ArrayList r0 = r1.f1573a
            pA0 r4 = (p000.InterfaceC10615pA0) r4
            r0.add(r4)
        L62:
            int r8 = r8 + (-1)
            goto L2c
        L65:
            if (r1 == 0) goto L6a
            r0.add(r1)
        L6a:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.AbstractC0232Dg.mo1742b(java.util.List, java.util.List):void");
    }

    @Override // p000.InterfaceC8000Nf0
    /* renamed from: c */
    public final void mo1743c(C7948Mf0 c7948Mf0, int i, ArrayList arrayList, C7948Mf0 c7948Mf02) {
        AbstractC8778as0.m10354f(c7948Mf0, i, arrayList, c7948Mf02, this);
    }

    @Override // p000.InterfaceC0463HL
    /* renamed from: d */
    public final void mo1744d(RectF rectF, Matrix matrix, boolean z) {
        Path path = this.f2139b;
        path.reset();
        int i = 0;
        while (true) {
            ArrayList arrayList = this.f2144g;
            if (i >= arrayList.size()) {
                RectF rectF2 = this.f2141d;
                path.computeBounds(rectF2, false);
                float fM23152k = this.f2147j.m23152k() / 2.0f;
                rectF2.set(rectF2.left - fM23152k, rectF2.top - fM23152k, rectF2.right + fM23152k, rectF2.bottom + fM23152k);
                rectF.set(rectF2);
                rectF.set(rectF.left - 1.0f, rectF.top - 1.0f, rectF.right + 1.0f, rectF.bottom + 1.0f);
                return;
            }
            C0169Cg c0169Cg = (C0169Cg) arrayList.get(i);
            for (int i2 = 0; i2 < c0169Cg.f1573a.size(); i2++) {
                path.addPath(((InterfaceC10615pA0) c0169Cg.f1573a.get(i2)).mo5778g(), matrix);
            }
            i++;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:203:0x0200  */
    @Override // p000.InterfaceC0463HL
    /* renamed from: f */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void mo1745f(android.graphics.Canvas r20, android.graphics.Matrix r21, int r22) {
        /*
            Method dump skipped, instructions count: 612
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.AbstractC0232Dg.mo1745f(android.graphics.Canvas, android.graphics.Matrix, int):void");
    }

    @Override // p000.InterfaceC8000Nf0
    /* renamed from: h */
    public void mo1746h(ColorFilter colorFilter, ES1 es1) {
        PointF pointF = InterfaceC10947rm0.f41869a;
        if (colorFilter == 4) {
            this.f2148k.m22530j(es1);
            return;
        }
        if (colorFilter == InterfaceC10947rm0.f41882n) {
            this.f2147j.m22530j(es1);
            return;
        }
        ColorFilter colorFilter2 = InterfaceC10947rm0.f41863F;
        AbstractC6504ng abstractC6504ng = this.f2143f;
        if (colorFilter == colorFilter2) {
            C7901Lh1 c7901Lh1 = this.f2151n;
            if (c7901Lh1 != null) {
                abstractC6504ng.m23167p(c7901Lh1);
            }
            C7901Lh1 c7901Lh12 = new C7901Lh1(es1, null);
            this.f2151n = c7901Lh12;
            c7901Lh12.m22527a(this);
            abstractC6504ng.m23162e(this.f2151n);
            return;
        }
        if (colorFilter == InterfaceC10947rm0.f41873e) {
            AbstractC6378lg abstractC6378lg = this.f2152o;
            if (abstractC6378lg != null) {
                abstractC6378lg.m22530j(es1);
                return;
            }
            C7901Lh1 c7901Lh13 = new C7901Lh1(es1, null);
            this.f2152o = c7901Lh13;
            c7901Lh13.m22527a(this);
            abstractC6504ng.m23162e(this.f2152o);
            return;
        }
        C4048fM c4048fM = this.f2154q;
        if (colorFilter == 5 && c4048fM != null) {
            c4048fM.f27147c.m22530j(es1);
            return;
        }
        if (colorFilter == InterfaceC10947rm0.f41859B && c4048fM != null) {
            c4048fM.m18220c(es1);
            return;
        }
        if (colorFilter == InterfaceC10947rm0.f41860C && c4048fM != null) {
            c4048fM.f27149e.m22530j(es1);
            return;
        }
        if (colorFilter == InterfaceC10947rm0.f41861D && c4048fM != null) {
            c4048fM.f27150f.m22530j(es1);
        } else {
            if (colorFilter != InterfaceC10947rm0.f41862E || c4048fM == null) {
                return;
            }
            c4048fM.f27151g.m22530j(es1);
        }
    }
}
