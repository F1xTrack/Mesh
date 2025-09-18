package defpackage;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.PointF;

/* loaded from: classes.dex */
public final class F51 extends AbstractC0272Dg {
    public final AbstractC6120ng r;
    public final String s;
    public final boolean t;
    public final C0548Gu u;
    public C0901Lh1 v;

    /* JADX WARN: Illegal instructions before constructor call */
    public F51(C5948mm0 c5948mm0, AbstractC6120ng abstractC6120ng, C3688f01 c3688f01) {
        int iX = AbstractC8235ym.x(c3688f01.g);
        Paint.Cap cap = iX != 0 ? iX != 1 ? Paint.Cap.SQUARE : Paint.Cap.ROUND : Paint.Cap.BUTT;
        int iX2 = AbstractC8235ym.x(c3688f01.h);
        super(c5948mm0, abstractC6120ng, cap, iX2 != 0 ? iX2 != 1 ? iX2 != 2 ? null : Paint.Join.BEVEL : Paint.Join.ROUND : Paint.Join.MITER, c3688f01.i, c3688f01.e, c3688f01.f, c3688f01.c, c3688f01.b);
        this.r = abstractC6120ng;
        this.s = c3688f01.a;
        this.t = c3688f01.j;
        AbstractC5738lg abstractC5738lgM0 = c3688f01.d.M0();
        this.u = (C0548Gu) abstractC5738lgM0;
        abstractC5738lgM0.a(this);
        abstractC6120ng.e(abstractC5738lgM0);
    }

    @Override // defpackage.AbstractC0272Dg, defpackage.HL
    public final void f(Canvas canvas, Matrix matrix, int i) {
        if (this.t) {
            return;
        }
        C0548Gu c0548Gu = this.u;
        int iK = c0548Gu.k(c0548Gu.c.e(), c0548Gu.c());
        C1520Tg0 c1520Tg0 = this.i;
        c1520Tg0.setColor(iK);
        C0901Lh1 c0901Lh1 = this.v;
        if (c0901Lh1 != null) {
            c1520Tg0.setColorFilter((ColorFilter) c0901Lh1.e());
        }
        super.f(canvas, matrix, i);
    }

    @Override // defpackage.InterfaceC6937ry
    public final String getName() {
        return this.s;
    }

    @Override // defpackage.AbstractC0272Dg, defpackage.InterfaceC1049Nf0
    public final void h(ColorFilter colorFilter, ES1 es1) {
        super.h(colorFilter, es1);
        PointF pointF = InterfaceC6902rm0.a;
        C0548Gu c0548Gu = this.u;
        if (colorFilter == 2) {
            c0548Gu.j(es1);
            return;
        }
        if (colorFilter == InterfaceC6902rm0.F) {
            C0901Lh1 c0901Lh1 = this.v;
            AbstractC6120ng abstractC6120ng = this.r;
            if (c0901Lh1 != null) {
                abstractC6120ng.p(c0901Lh1);
            }
            C0901Lh1 c0901Lh12 = new C0901Lh1(es1, null);
            this.v = c0901Lh12;
            c0901Lh12.a(this);
            abstractC6120ng.e(c0548Gu);
        }
    }
}
