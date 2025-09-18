package defpackage;

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
public abstract class AbstractC0272Dg implements InterfaceC4198hg, InterfaceC1127Of0, HL {
    public final C5948mm0 e;
    public final AbstractC6120ng f;
    public final float[] h;
    public final C1520Tg0 i;
    public final C6090nW j;
    public final C0548Gu k;
    public final ArrayList l;
    public final C6090nW m;
    public C0901Lh1 n;
    public AbstractC5738lg o;
    public float p;
    public final C3756fM q;
    public final PathMeasure a = new PathMeasure();
    public final Path b = new Path();
    public final Path c = new Path();
    public final RectF d = new RectF();
    public final ArrayList g = new ArrayList();

    public AbstractC0272Dg(C5948mm0 c5948mm0, AbstractC6120ng abstractC6120ng, Paint.Cap cap, Paint.Join join, float f, K4 k4, L4 l4, ArrayList arrayList, L4 l42) {
        C1520Tg0 c1520Tg0 = new C1520Tg0(1, 0);
        this.i = c1520Tg0;
        this.p = 0.0f;
        this.e = c5948mm0;
        this.f = abstractC6120ng;
        c1520Tg0.setStyle(Paint.Style.STROKE);
        c1520Tg0.setStrokeCap(cap);
        c1520Tg0.setStrokeJoin(join);
        c1520Tg0.setStrokeMiter(f);
        this.k = (C0548Gu) k4.M0();
        this.j = l4.M0();
        if (l42 == null) {
            this.m = null;
        } else {
            this.m = l42.M0();
        }
        this.l = new ArrayList(arrayList.size());
        this.h = new float[arrayList.size()];
        for (int i = 0; i < arrayList.size(); i++) {
            this.l.add(((L4) arrayList.get(i)).M0());
        }
        abstractC6120ng.e(this.k);
        abstractC6120ng.e(this.j);
        for (int i2 = 0; i2 < this.l.size(); i2++) {
            abstractC6120ng.e((AbstractC5738lg) this.l.get(i2));
        }
        C6090nW c6090nW = this.m;
        if (c6090nW != null) {
            abstractC6120ng.e(c6090nW);
        }
        this.k.a(this);
        this.j.a(this);
        for (int i3 = 0; i3 < arrayList.size(); i3++) {
            ((AbstractC5738lg) this.l.get(i3)).a(this);
        }
        C6090nW c6090nW2 = this.m;
        if (c6090nW2 != null) {
            c6090nW2.a(this);
        }
        if (abstractC6120ng.l() != null) {
            C6090nW c6090nWM0 = ((L4) abstractC6120ng.l().a).M0();
            this.o = c6090nWM0;
            c6090nWM0.a(this);
            abstractC6120ng.e(this.o);
        }
        if (abstractC6120ng.m() != null) {
            this.q = new C3756fM(this, abstractC6120ng, abstractC6120ng.m());
        }
    }

    @Override // defpackage.InterfaceC4198hg
    public final void a() {
        this.e.invalidateSelf();
    }

    /* JADX WARN: Removed duplicated region for block: B:64:0x0050  */
    @Override // defpackage.InterfaceC6937ry
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void b(java.util.List r8, java.util.List r9) {
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
            ry r4 = (defpackage.InterfaceC6937ry) r4
            boolean r5 = r4 instanceof defpackage.C3428dd1
            if (r5 == 0) goto L1e
            dd1 r4 = (defpackage.C3428dd1) r4
            int r5 = r4.c
            if (r5 != r3) goto L1e
            r2 = r4
        L1e:
            int r0 = r0 + (-1)
            goto La
        L21:
            if (r2 == 0) goto L26
            r2.c(r7)
        L26:
            int r8 = r9.size()
            int r8 = r8 + (-1)
        L2c:
            java.util.ArrayList r0 = r7.g
            if (r8 < 0) goto L65
            java.lang.Object r4 = r9.get(r8)
            ry r4 = (defpackage.InterfaceC6937ry) r4
            boolean r5 = r4 instanceof defpackage.C3428dd1
            if (r5 == 0) goto L50
            r5 = r4
            dd1 r5 = (defpackage.C3428dd1) r5
            int r6 = r5.c
            if (r6 != r3) goto L50
            if (r1 == 0) goto L46
            r0.add(r1)
        L46:
            Cg r0 = new Cg
            r0.<init>(r5)
            r5.c(r7)
            r1 = r0
            goto L62
        L50:
            boolean r0 = r4 instanceof defpackage.InterfaceC6407pA0
            if (r0 == 0) goto L62
            if (r1 != 0) goto L5b
            Cg r1 = new Cg
            r1.<init>(r2)
        L5b:
            java.util.ArrayList r0 = r1.a
            pA0 r4 = (defpackage.InterfaceC6407pA0) r4
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
        throw new UnsupportedOperationException("Method not decompiled: defpackage.AbstractC0272Dg.b(java.util.List, java.util.List):void");
    }

    @Override // defpackage.InterfaceC1049Nf0
    public final void c(C0971Mf0 c0971Mf0, int i, ArrayList arrayList, C0971Mf0 c0971Mf02) {
        AbstractC2215as0.f(c0971Mf0, i, arrayList, c0971Mf02, this);
    }

    @Override // defpackage.HL
    public final void d(RectF rectF, Matrix matrix, boolean z) {
        Path path = this.b;
        path.reset();
        int i = 0;
        while (true) {
            ArrayList arrayList = this.g;
            if (i >= arrayList.size()) {
                RectF rectF2 = this.d;
                path.computeBounds(rectF2, false);
                float fK = this.j.k() / 2.0f;
                rectF2.set(rectF2.left - fK, rectF2.top - fK, rectF2.right + fK, rectF2.bottom + fK);
                rectF.set(rectF2);
                rectF.set(rectF.left - 1.0f, rectF.top - 1.0f, rectF.right + 1.0f, rectF.bottom + 1.0f);
                return;
            }
            C0194Cg c0194Cg = (C0194Cg) arrayList.get(i);
            for (int i2 = 0; i2 < c0194Cg.a.size(); i2++) {
                path.addPath(((InterfaceC6407pA0) c0194Cg.a.get(i2)).g(), matrix);
            }
            i++;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:203:0x0200  */
    @Override // defpackage.HL
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void f(android.graphics.Canvas r20, android.graphics.Matrix r21, int r22) {
        /*
            Method dump skipped, instructions count: 612
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.AbstractC0272Dg.f(android.graphics.Canvas, android.graphics.Matrix, int):void");
    }

    @Override // defpackage.InterfaceC1049Nf0
    public void h(ColorFilter colorFilter, ES1 es1) {
        PointF pointF = InterfaceC6902rm0.a;
        if (colorFilter == 4) {
            this.k.j(es1);
            return;
        }
        if (colorFilter == InterfaceC6902rm0.n) {
            this.j.j(es1);
            return;
        }
        ColorFilter colorFilter2 = InterfaceC6902rm0.F;
        AbstractC6120ng abstractC6120ng = this.f;
        if (colorFilter == colorFilter2) {
            C0901Lh1 c0901Lh1 = this.n;
            if (c0901Lh1 != null) {
                abstractC6120ng.p(c0901Lh1);
            }
            C0901Lh1 c0901Lh12 = new C0901Lh1(es1, null);
            this.n = c0901Lh12;
            c0901Lh12.a(this);
            abstractC6120ng.e(this.n);
            return;
        }
        if (colorFilter == InterfaceC6902rm0.e) {
            AbstractC5738lg abstractC5738lg = this.o;
            if (abstractC5738lg != null) {
                abstractC5738lg.j(es1);
                return;
            }
            C0901Lh1 c0901Lh13 = new C0901Lh1(es1, null);
            this.o = c0901Lh13;
            c0901Lh13.a(this);
            abstractC6120ng.e(this.o);
            return;
        }
        C3756fM c3756fM = this.q;
        if (colorFilter == 5 && c3756fM != null) {
            c3756fM.c.j(es1);
            return;
        }
        if (colorFilter == InterfaceC6902rm0.B && c3756fM != null) {
            c3756fM.c(es1);
            return;
        }
        if (colorFilter == InterfaceC6902rm0.C && c3756fM != null) {
            c3756fM.e.j(es1);
            return;
        }
        if (colorFilter == InterfaceC6902rm0.D && c3756fM != null) {
            c3756fM.f.j(es1);
        } else {
            if (colorFilter != InterfaceC6902rm0.E || c3756fM == null) {
                return;
            }
            c3756fM.g.j(es1);
        }
    }
}
