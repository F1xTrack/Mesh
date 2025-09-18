package p000;

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
public final class W10 extends AbstractC0232Dg {

    /* renamed from: A */
    public final R10 f12919A;

    /* renamed from: B */
    public C7901Lh1 f12920B;

    /* renamed from: r */
    public final String f12921r;

    /* renamed from: s */
    public final boolean f12922s;

    /* renamed from: t */
    public final C7544El0 f12923t;

    /* renamed from: u */
    public final C7544El0 f12924u;

    /* renamed from: v */
    public final RectF f12925v;

    /* renamed from: w */
    public final int f12926w;

    /* renamed from: x */
    public final int f12927x;

    /* renamed from: y */
    public final R10 f12928y;

    /* renamed from: z */
    public final R10 f12929z;

    /* JADX WARN: Illegal instructions before constructor call */
    public W10(C10307mm0 c10307mm0, AbstractC6504ng abstractC6504ng, V10 v10) {
        int iM26247x = AbstractC7222ym.m26247x(v10.f12303h);
        Paint.Cap cap = iM26247x != 0 ? iM26247x != 1 ? Paint.Cap.SQUARE : Paint.Cap.ROUND : Paint.Cap.BUTT;
        int iM26247x2 = AbstractC7222ym.m26247x(v10.f12304i);
        super(c10307mm0, abstractC6504ng, cap, iM26247x2 != 0 ? iM26247x2 != 1 ? iM26247x2 != 2 ? null : Paint.Join.BEVEL : Paint.Join.ROUND : Paint.Join.MITER, v10.f12305j, v10.f12299d, v10.f12302g, v10.f12306k, v10.f12307l);
        this.f12923t = new C7544El0();
        this.f12924u = new C7544El0();
        this.f12925v = new RectF();
        this.f12921r = v10.f12296a;
        this.f12926w = v10.f12297b;
        this.f12922s = v10.f12308m;
        this.f12927x = (int) (c10307mm0.f37887a.m9111b() / 32.0f);
        AbstractC6378lg abstractC6378lgMo4553M0 = v10.f12298c.mo4553M0();
        this.f12928y = (R10) abstractC6378lgMo4553M0;
        abstractC6378lgMo4553M0.m22527a(this);
        abstractC6504ng.m23162e(abstractC6378lgMo4553M0);
        AbstractC6378lg abstractC6378lgMo4553M02 = v10.f12300e.mo4553M0();
        this.f12929z = (R10) abstractC6378lgMo4553M02;
        abstractC6378lgMo4553M02.m22527a(this);
        abstractC6504ng.m23162e(abstractC6378lgMo4553M02);
        AbstractC6378lg abstractC6378lgMo4553M03 = v10.f12301f.mo4553M0();
        this.f12919A = (R10) abstractC6378lgMo4553M03;
        abstractC6378lgMo4553M03.m22527a(this);
        abstractC6504ng.m23162e(abstractC6378lgMo4553M03);
    }

    /* renamed from: e */
    public final int[] m8649e(int[] iArr) {
        C7901Lh1 c7901Lh1 = this.f12920B;
        if (c7901Lh1 != null) {
            Integer[] numArr = (Integer[]) c7901Lh1.mo5063e();
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

    @Override // p000.AbstractC0232Dg, p000.InterfaceC0463HL
    /* renamed from: f */
    public final void mo1745f(Canvas canvas, Matrix matrix, int i) {
        Shader linearGradient;
        if (this.f12922s) {
            return;
        }
        mo1744d(this.f12925v, matrix, false);
        int i2 = this.f12926w;
        R10 r10 = this.f12928y;
        R10 r102 = this.f12919A;
        R10 r103 = this.f12929z;
        if (i2 == 1) {
            long jM8650i = m8650i();
            C7544El0 c7544El0 = this.f12923t;
            linearGradient = (LinearGradient) c7544El0.m2382j(jM8650i, null);
            if (linearGradient == null) {
                PointF pointF = (PointF) r103.mo5063e();
                PointF pointF2 = (PointF) r102.mo5063e();
                Q10 q10 = (Q10) r10.mo5063e();
                linearGradient = new LinearGradient(pointF.x, pointF.y, pointF2.x, pointF2.y, m8649e(q10.f9404b), q10.f9403a, Shader.TileMode.CLAMP);
                c7544El0.m2383k(jM8650i, linearGradient);
            }
        } else {
            long jM8650i2 = m8650i();
            C7544El0 c7544El02 = this.f12924u;
            linearGradient = (RadialGradient) c7544El02.m2382j(jM8650i2, null);
            if (linearGradient == null) {
                PointF pointF3 = (PointF) r103.mo5063e();
                PointF pointF4 = (PointF) r102.mo5063e();
                Q10 q102 = (Q10) r10.mo5063e();
                int[] iArrM8649e = m8649e(q102.f9404b);
                RadialGradient radialGradient = new RadialGradient(pointF3.x, pointF3.y, (float) Math.hypot(pointF4.x - r10, pointF4.y - r11), iArrM8649e, q102.f9403a, Shader.TileMode.CLAMP);
                c7544El02.m2383k(jM8650i2, radialGradient);
                linearGradient = radialGradient;
            }
        }
        this.f2146i.setShader(linearGradient);
        super.mo1745f(canvas, matrix, i);
    }

    @Override // p000.InterfaceC6793ry
    public final String getName() {
        return this.f12921r;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p000.AbstractC0232Dg, p000.InterfaceC8000Nf0
    /* renamed from: h */
    public final void mo1746h(ColorFilter colorFilter, ES1 es1) {
        super.mo1746h(colorFilter, es1);
        if (colorFilter == InterfaceC10947rm0.f41864G) {
            C7901Lh1 c7901Lh1 = this.f12920B;
            AbstractC6504ng abstractC6504ng = this.f2143f;
            if (c7901Lh1 != null) {
                abstractC6504ng.m23167p(c7901Lh1);
            }
            C7901Lh1 c7901Lh12 = new C7901Lh1(es1, null);
            this.f12920B = c7901Lh12;
            c7901Lh12.m22527a(this);
            abstractC6504ng.m23162e(this.f12920B);
        }
    }

    /* renamed from: i */
    public final int m8650i() {
        float f = this.f12929z.f37231d;
        float f2 = this.f12927x;
        int iRound = Math.round(f * f2);
        int iRound2 = Math.round(this.f12919A.f37231d * f2);
        int iRound3 = Math.round(this.f12928y.f37231d * f2);
        int i = iRound != 0 ? 527 * iRound : 17;
        if (iRound2 != 0) {
            i = i * 31 * iRound2;
        }
        return iRound3 != 0 ? i * 31 * iRound3 : i;
    }
}
