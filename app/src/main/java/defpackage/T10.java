package defpackage;

import android.graphics.BlurMaskFilter;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.RadialGradient;
import android.graphics.RectF;
import android.graphics.Shader;
import java.util.ArrayList;
import java.util.List;
import kotlin.KotlinVersion;

/* loaded from: classes.dex */
public final class T10 implements HL, InterfaceC4198hg, InterfaceC1127Of0 {
    public final String a;
    public final boolean b;
    public final AbstractC6120ng c;
    public final C0366El0 d = new C0366El0();
    public final C0366El0 e = new C0366El0();
    public final Path f;
    public final C1520Tg0 g;
    public final RectF h;
    public final ArrayList i;
    public final int j;
    public final R10 k;
    public final C0548Gu l;
    public final R10 m;
    public final R10 n;
    public C0901Lh1 o;
    public C0901Lh1 p;
    public final C5948mm0 q;
    public final int r;
    public AbstractC5738lg s;
    public float t;
    public final C3756fM u;

    public T10(C5948mm0 c5948mm0, C1847Xl0 c1847Xl0, AbstractC6120ng abstractC6120ng, S10 s10) {
        Path path = new Path();
        this.f = path;
        this.g = new C1520Tg0(1, 0);
        this.h = new RectF();
        this.i = new ArrayList();
        this.t = 0.0f;
        this.c = abstractC6120ng;
        this.a = s10.g;
        this.b = s10.h;
        this.q = c5948mm0;
        this.j = s10.a;
        path.setFillType(s10.b);
        this.r = (int) (c1847Xl0.b() / 32.0f);
        AbstractC5738lg abstractC5738lgM0 = s10.c.M0();
        this.k = (R10) abstractC5738lgM0;
        abstractC5738lgM0.a(this);
        abstractC6120ng.e(abstractC5738lgM0);
        AbstractC5738lg abstractC5738lgM02 = s10.d.M0();
        this.l = (C0548Gu) abstractC5738lgM02;
        abstractC5738lgM02.a(this);
        abstractC6120ng.e(abstractC5738lgM02);
        AbstractC5738lg abstractC5738lgM03 = s10.e.M0();
        this.m = (R10) abstractC5738lgM03;
        abstractC5738lgM03.a(this);
        abstractC6120ng.e(abstractC5738lgM03);
        AbstractC5738lg abstractC5738lgM04 = s10.f.M0();
        this.n = (R10) abstractC5738lgM04;
        abstractC5738lgM04.a(this);
        abstractC6120ng.e(abstractC5738lgM04);
        if (abstractC6120ng.l() != null) {
            C6090nW c6090nWM0 = ((L4) abstractC6120ng.l().a).M0();
            this.s = c6090nWM0;
            c6090nWM0.a(this);
            abstractC6120ng.e(this.s);
        }
        if (abstractC6120ng.m() != null) {
            this.u = new C3756fM(this, abstractC6120ng, abstractC6120ng.m());
        }
    }

    @Override // defpackage.InterfaceC4198hg
    public final void a() {
        this.q.invalidateSelf();
    }

    @Override // defpackage.InterfaceC6937ry
    public final void b(List list, List list2) {
        for (int i = 0; i < list2.size(); i++) {
            InterfaceC6937ry interfaceC6937ry = (InterfaceC6937ry) list2.get(i);
            if (interfaceC6937ry instanceof InterfaceC6407pA0) {
                this.i.add((InterfaceC6407pA0) interfaceC6937ry);
            }
        }
    }

    @Override // defpackage.InterfaceC1049Nf0
    public final void c(C0971Mf0 c0971Mf0, int i, ArrayList arrayList, C0971Mf0 c0971Mf02) {
        AbstractC2215as0.f(c0971Mf0, i, arrayList, c0971Mf02, this);
    }

    @Override // defpackage.HL
    public final void d(RectF rectF, Matrix matrix, boolean z) {
        Path path = this.f;
        path.reset();
        int i = 0;
        while (true) {
            ArrayList arrayList = this.i;
            if (i >= arrayList.size()) {
                path.computeBounds(rectF, false);
                rectF.set(rectF.left - 1.0f, rectF.top - 1.0f, rectF.right + 1.0f, rectF.bottom + 1.0f);
                return;
            } else {
                path.addPath(((InterfaceC6407pA0) arrayList.get(i)).g(), matrix);
                i++;
            }
        }
    }

    public final int[] e(int[] iArr) {
        C0901Lh1 c0901Lh1 = this.p;
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

    @Override // defpackage.HL
    public final void f(Canvas canvas, Matrix matrix, int i) {
        Shader shader;
        if (this.b) {
            return;
        }
        Path path = this.f;
        path.reset();
        int i2 = 0;
        while (true) {
            ArrayList arrayList = this.i;
            if (i2 >= arrayList.size()) {
                break;
            }
            path.addPath(((InterfaceC6407pA0) arrayList.get(i2)).g(), matrix);
            i2++;
        }
        path.computeBounds(this.h, false);
        int i3 = this.j;
        R10 r10 = this.k;
        R10 r102 = this.n;
        R10 r103 = this.m;
        if (i3 == 1) {
            long jI = i();
            C0366El0 c0366El0 = this.d;
            shader = (LinearGradient) c0366El0.j(jI, null);
            if (shader == null) {
                PointF pointF = (PointF) r103.e();
                PointF pointF2 = (PointF) r102.e();
                Q10 q10 = (Q10) r10.e();
                LinearGradient linearGradient = new LinearGradient(pointF.x, pointF.y, pointF2.x, pointF2.y, e(q10.b), q10.a, Shader.TileMode.CLAMP);
                c0366El0.k(jI, linearGradient);
                shader = linearGradient;
            }
        } else {
            long jI2 = i();
            C0366El0 c0366El02 = this.e;
            shader = (RadialGradient) c0366El02.j(jI2, null);
            if (shader == null) {
                PointF pointF3 = (PointF) r103.e();
                PointF pointF4 = (PointF) r102.e();
                Q10 q102 = (Q10) r10.e();
                int[] iArrE = e(q102.b);
                float f = pointF3.x;
                float f2 = pointF3.y;
                float fHypot = (float) Math.hypot(pointF4.x - f, pointF4.y - f2);
                if (fHypot <= 0.0f) {
                    fHypot = 0.001f;
                }
                RadialGradient radialGradient = new RadialGradient(f, f2, fHypot, iArrE, q102.a, Shader.TileMode.CLAMP);
                c0366El02.k(jI2, radialGradient);
                shader = radialGradient;
            }
        }
        shader.setLocalMatrix(matrix);
        C1520Tg0 c1520Tg0 = this.g;
        c1520Tg0.setShader(shader);
        C0901Lh1 c0901Lh1 = this.o;
        if (c0901Lh1 != null) {
            c1520Tg0.setColorFilter((ColorFilter) c0901Lh1.e());
        }
        AbstractC5738lg abstractC5738lg = this.s;
        if (abstractC5738lg != null) {
            float fFloatValue = ((Float) abstractC5738lg.e()).floatValue();
            if (fFloatValue == 0.0f) {
                c1520Tg0.setMaskFilter(null);
            } else if (fFloatValue != this.t) {
                c1520Tg0.setMaskFilter(new BlurMaskFilter(fFloatValue, BlurMaskFilter.Blur.NORMAL));
            }
            this.t = fFloatValue;
        }
        float f3 = i / 255.0f;
        int iIntValue = (int) (((((Integer) this.l.e()).intValue() * f3) / 100.0f) * 255.0f);
        PointF pointF5 = AbstractC2215as0.a;
        c1520Tg0.setAlpha(Math.max(0, Math.min(KotlinVersion.MAX_COMPONENT_VALUE, iIntValue)));
        C3756fM c3756fM = this.u;
        if (c3756fM != null) {
            C6987sD c6987sD = AbstractC0667Ih1.a;
            c3756fM.b(c1520Tg0, matrix, (int) (((f3 * iIntValue) / 255.0f) * 255.0f));
        }
        canvas.drawPath(path, c1520Tg0);
    }

    @Override // defpackage.InterfaceC6937ry
    public final String getName() {
        return this.a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.InterfaceC1049Nf0
    public final void h(ColorFilter colorFilter, ES1 es1) {
        PointF pointF = InterfaceC6902rm0.a;
        if (colorFilter == 4) {
            this.l.j(es1);
            return;
        }
        ColorFilter colorFilter2 = InterfaceC6902rm0.F;
        AbstractC6120ng abstractC6120ng = this.c;
        if (colorFilter == colorFilter2) {
            C0901Lh1 c0901Lh1 = this.o;
            if (c0901Lh1 != null) {
                abstractC6120ng.p(c0901Lh1);
            }
            C0901Lh1 c0901Lh12 = new C0901Lh1(es1, null);
            this.o = c0901Lh12;
            c0901Lh12.a(this);
            abstractC6120ng.e(this.o);
            return;
        }
        if (colorFilter == InterfaceC6902rm0.G) {
            C0901Lh1 c0901Lh13 = this.p;
            if (c0901Lh13 != null) {
                abstractC6120ng.p(c0901Lh13);
            }
            this.d.e();
            this.e.e();
            C0901Lh1 c0901Lh14 = new C0901Lh1(es1, null);
            this.p = c0901Lh14;
            c0901Lh14.a(this);
            abstractC6120ng.e(this.p);
            return;
        }
        if (colorFilter == InterfaceC6902rm0.e) {
            AbstractC5738lg abstractC5738lg = this.s;
            if (abstractC5738lg != null) {
                abstractC5738lg.j(es1);
                return;
            }
            C0901Lh1 c0901Lh15 = new C0901Lh1(es1, null);
            this.s = c0901Lh15;
            c0901Lh15.a(this);
            abstractC6120ng.e(this.s);
            return;
        }
        C3756fM c3756fM = this.u;
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

    public final int i() {
        float f = this.m.d;
        float f2 = this.r;
        int iRound = Math.round(f * f2);
        int iRound2 = Math.round(this.n.d * f2);
        int iRound3 = Math.round(this.k.d * f2);
        int i = iRound != 0 ? 527 * iRound : 17;
        if (iRound2 != 0) {
            i = i * 31 * iRound2;
        }
        return iRound3 != 0 ? i * 31 * iRound3 : i;
    }
}
