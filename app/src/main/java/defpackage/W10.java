package defpackage;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.PointF;
import android.graphics.RadialGradient;
import android.graphics.RectF;
import android.graphics.Shader;

/* loaded from: classes.dex */
public final class W10 extends AbstractC0272Dg {
    public final R10 A;
    public C0901Lh1 B;
    public final String r;
    public final boolean s;
    public final C0366El0 t;
    public final C0366El0 u;
    public final RectF v;
    public final int w;
    public final int x;
    public final R10 y;
    public final R10 z;

    /* JADX WARN: Illegal instructions before constructor call */
    public W10(C5948mm0 c5948mm0, AbstractC6120ng abstractC6120ng, V10 v10) {
        int iX = AbstractC8235ym.x(v10.h);
        Paint.Cap cap = iX != 0 ? iX != 1 ? Paint.Cap.SQUARE : Paint.Cap.ROUND : Paint.Cap.BUTT;
        int iX2 = AbstractC8235ym.x(v10.i);
        super(c5948mm0, abstractC6120ng, cap, iX2 != 0 ? iX2 != 1 ? iX2 != 2 ? null : Paint.Join.BEVEL : Paint.Join.ROUND : Paint.Join.MITER, v10.j, v10.d, v10.g, v10.k, v10.l);
        this.t = new C0366El0();
        this.u = new C0366El0();
        this.v = new RectF();
        this.r = v10.a;
        this.w = v10.b;
        this.s = v10.m;
        this.x = (int) (c5948mm0.a.b() / 32.0f);
        AbstractC5738lg abstractC5738lgM0 = v10.c.M0();
        this.y = (R10) abstractC5738lgM0;
        abstractC5738lgM0.a(this);
        abstractC6120ng.e(abstractC5738lgM0);
        AbstractC5738lg abstractC5738lgM02 = v10.e.M0();
        this.z = (R10) abstractC5738lgM02;
        abstractC5738lgM02.a(this);
        abstractC6120ng.e(abstractC5738lgM02);
        AbstractC5738lg abstractC5738lgM03 = v10.f.M0();
        this.A = (R10) abstractC5738lgM03;
        abstractC5738lgM03.a(this);
        abstractC6120ng.e(abstractC5738lgM03);
    }

    public final int[] e(int[] iArr) {
        C0901Lh1 c0901Lh1 = this.B;
        if (c0901Lh1 != null) {
            Integer[] numArr = (Integer[]) c0901Lh1.e();
            int i = 0;
            if (iArr.length == numArr.length) {
                while (i < iArr.length) {
                    iArr[i] = numArr[i].intValue();
                    i++;
                }
            } else {
                iArr = new int[numArr.length];
                while (i < numArr.length) {
                    iArr[i] = numArr[i].intValue();
                    i++;
                }
            }
        }
        return iArr;
    }

    @Override // defpackage.AbstractC0272Dg, defpackage.HL
    public final void f(Canvas canvas, Matrix matrix, int i) {
        Shader linearGradient;
        if (this.s) {
            return;
        }
        d(this.v, matrix, false);
        int i2 = this.w;
        R10 r10 = this.y;
        R10 r102 = this.A;
        R10 r103 = this.z;
        if (i2 == 1) {
            long jI = i();
            C0366El0 c0366El0 = this.t;
            linearGradient = (LinearGradient) c0366El0.j(jI, null);
            if (linearGradient == null) {
                PointF pointF = (PointF) r103.e();
                PointF pointF2 = (PointF) r102.e();
                Q10 q10 = (Q10) r10.e();
                linearGradient = new LinearGradient(pointF.x, pointF.y, pointF2.x, pointF2.y, e(q10.b), q10.a, Shader.TileMode.CLAMP);
                c0366El0.k(jI, linearGradient);
            }
        } else {
            long jI2 = i();
            C0366El0 c0366El02 = this.u;
            linearGradient = (RadialGradient) c0366El02.j(jI2, null);
            if (linearGradient == null) {
                PointF pointF3 = (PointF) r103.e();
                PointF pointF4 = (PointF) r102.e();
                Q10 q102 = (Q10) r10.e();
                int[] iArrE = e(q102.b);
                RadialGradient radialGradient = new RadialGradient(pointF3.x, pointF3.y, (float) Math.hypot(pointF4.x - r10, pointF4.y - r11), iArrE, q102.a, Shader.TileMode.CLAMP);
                c0366El02.k(jI2, radialGradient);
                linearGradient = radialGradient;
            }
        }
        this.i.setShader(linearGradient);
        super.f(canvas, matrix, i);
    }

    @Override // defpackage.InterfaceC6937ry
    public final String getName() {
        return this.r;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.AbstractC0272Dg, defpackage.InterfaceC1049Nf0
    public final void h(ColorFilter colorFilter, ES1 es1) {
        super.h(colorFilter, es1);
        if (colorFilter == InterfaceC6902rm0.G) {
            C0901Lh1 c0901Lh1 = this.B;
            AbstractC6120ng abstractC6120ng = this.f;
            if (c0901Lh1 != null) {
                abstractC6120ng.p(c0901Lh1);
            }
            C0901Lh1 c0901Lh12 = new C0901Lh1(es1, null);
            this.B = c0901Lh12;
            c0901Lh12.a(this);
            abstractC6120ng.e(this.B);
        }
    }

    public final int i() {
        float f = this.z.d;
        float f2 = this.x;
        int iRound = Math.round(f * f2);
        int iRound2 = Math.round(this.A.d * f2);
        int iRound3 = Math.round(this.y.d * f2);
        int i = iRound != 0 ? 527 * iRound : 17;
        if (iRound2 != 0) {
            i = i * 31 * iRound2;
        }
        return iRound3 != 0 ? i * 31 * iRound3 : i;
    }
}
