package p000;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.PointF;

/* loaded from: classes.dex */
public final class F51 extends AbstractC0232Dg {

    /* renamed from: r */
    public final AbstractC6504ng f3062r;

    /* renamed from: s */
    public final String f3063s;

    /* renamed from: t */
    public final boolean f3064t;

    /* renamed from: u */
    public final C0435Gu f3065u;

    /* renamed from: v */
    public C7901Lh1 f3066v;

    /* JADX WARN: Illegal instructions before constructor call */
    public F51(C10307mm0 c10307mm0, AbstractC6504ng abstractC6504ng, C9312f01 c9312f01) {
        int iM26247x = AbstractC7222ym.m26247x(c9312f01.f27006g);
        Paint.Cap cap = iM26247x != 0 ? iM26247x != 1 ? Paint.Cap.SQUARE : Paint.Cap.ROUND : Paint.Cap.BUTT;
        int iM26247x2 = AbstractC7222ym.m26247x(c9312f01.f27007h);
        super(c10307mm0, abstractC6504ng, cap, iM26247x2 != 0 ? iM26247x2 != 1 ? iM26247x2 != 2 ? null : Paint.Join.BEVEL : Paint.Join.ROUND : Paint.Join.MITER, c9312f01.f27008i, c9312f01.f27004e, c9312f01.f27005f, c9312f01.f27002c, c9312f01.f27001b);
        this.f3062r = abstractC6504ng;
        this.f3063s = c9312f01.f27000a;
        this.f3064t = c9312f01.f27009j;
        AbstractC6378lg abstractC6378lgMo4553M0 = c9312f01.f27003d.mo4553M0();
        this.f3065u = (C0435Gu) abstractC6378lgMo4553M0;
        abstractC6378lgMo4553M0.m22527a(this);
        abstractC6504ng.m23162e(abstractC6378lgMo4553M0);
    }

    @Override // p000.AbstractC0232Dg, p000.InterfaceC0463HL
    /* renamed from: f */
    public final void mo1745f(Canvas canvas, Matrix matrix, int i) {
        if (this.f3064t) {
            return;
        }
        C0435Gu c0435Gu = this.f3065u;
        int iM3190k = c0435Gu.m3190k(c0435Gu.f37230c.mo7744e(), c0435Gu.m22528c());
        C8314Tg0 c8314Tg0 = this.f2146i;
        c8314Tg0.setColor(iM3190k);
        C7901Lh1 c7901Lh1 = this.f3066v;
        if (c7901Lh1 != null) {
            c8314Tg0.setColorFilter((ColorFilter) c7901Lh1.mo5063e());
        }
        super.mo1745f(canvas, matrix, i);
    }

    @Override // p000.InterfaceC6793ry
    public final String getName() {
        return this.f3063s;
    }

    @Override // p000.AbstractC0232Dg, p000.InterfaceC8000Nf0
    /* renamed from: h */
    public final void mo1746h(ColorFilter colorFilter, ES1 es1) {
        super.mo1746h(colorFilter, es1);
        PointF pointF = InterfaceC10947rm0.f41869a;
        C0435Gu c0435Gu = this.f3065u;
        if (colorFilter == 2) {
            c0435Gu.m22530j(es1);
            return;
        }
        if (colorFilter == InterfaceC10947rm0.f41863F) {
            C7901Lh1 c7901Lh1 = this.f3066v;
            AbstractC6504ng abstractC6504ng = this.f3062r;
            if (c7901Lh1 != null) {
                abstractC6504ng.m23167p(c7901Lh1);
            }
            C7901Lh1 c7901Lh12 = new C7901Lh1(es1, null);
            this.f3066v = c7901Lh12;
            c7901Lh12.m22527a(this);
            abstractC6504ng.m23162e(c0435Gu);
        }
    }
}
