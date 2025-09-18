package defpackage;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.RectF;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/* renamed from: z91 */
/* loaded from: classes.dex */
public final class C8310z91 extends AbstractC6120ng {
    public final StringBuilder D;
    public final RectF E;
    public final Matrix F;
    public final C1520Tg0 G;
    public final C1520Tg0 H;
    public final HashMap I;
    public final C0366El0 J;
    public final ArrayList K;
    public final C0548Gu L;
    public final C5948mm0 M;
    public final C1847Xl0 N;
    public final int O;
    public final C0548Gu P;
    public C0901Lh1 Q;
    public final C0548Gu R;
    public C0901Lh1 S;
    public final C6090nW T;
    public C0901Lh1 U;
    public final C6090nW V;
    public C0901Lh1 W;
    public final C0548Gu X;
    public C0901Lh1 Y;
    public C0901Lh1 Z;
    public final C0548Gu a0;
    public final C0548Gu b0;
    public final C0548Gu c0;

    public C8310z91(C5948mm0 c5948mm0, C1910Yg0 c1910Yg0) {
        C4053gv0 c4053gv0;
        C4053gv0 c4053gv02;
        K4 k4;
        C4053gv0 c4053gv03;
        K4 k42;
        C4053gv0 c4053gv04;
        K4 k43;
        C7375uF c7375uF;
        K4 k44;
        C7375uF c7375uF2;
        L4 l4;
        C7375uF c7375uF3;
        L4 l42;
        C7375uF c7375uF4;
        K4 k45;
        C7375uF c7375uF5;
        K4 k46;
        super(c5948mm0, c1910Yg0);
        this.D = new StringBuilder(2);
        this.E = new RectF();
        this.F = new Matrix();
        C1520Tg0 c1520Tg0 = new C1520Tg0(1, 1);
        c1520Tg0.setStyle(Paint.Style.FILL);
        this.G = c1520Tg0;
        C1520Tg0 c1520Tg02 = new C1520Tg0(1, 2);
        c1520Tg02.setStyle(Paint.Style.STROKE);
        this.H = c1520Tg02;
        this.I = new HashMap();
        this.J = new C0366El0();
        this.K = new ArrayList();
        this.O = 2;
        this.M = c5948mm0;
        this.N = c1910Yg0.b;
        C0548Gu c0548Gu = new C0548Gu((List) c1910Yg0.q.b, 2);
        this.L = c0548Gu;
        c0548Gu.a(this);
        e(c0548Gu);
        C0999Mo1 c0999Mo1 = c1910Yg0.r;
        if (c0999Mo1 != null && (c7375uF5 = (C7375uF) c0999Mo1.a) != null && (k46 = (K4) c7375uF5.a) != null) {
            AbstractC5738lg abstractC5738lgM0 = k46.M0();
            this.P = (C0548Gu) abstractC5738lgM0;
            abstractC5738lgM0.a(this);
            e(abstractC5738lgM0);
        }
        if (c0999Mo1 != null && (c7375uF4 = (C7375uF) c0999Mo1.a) != null && (k45 = (K4) c7375uF4.b) != null) {
            AbstractC5738lg abstractC5738lgM02 = k45.M0();
            this.R = (C0548Gu) abstractC5738lgM02;
            abstractC5738lgM02.a(this);
            e(abstractC5738lgM02);
        }
        if (c0999Mo1 != null && (c7375uF3 = (C7375uF) c0999Mo1.a) != null && (l42 = (L4) c7375uF3.c) != null) {
            C6090nW c6090nWM0 = l42.M0();
            this.T = c6090nWM0;
            c6090nWM0.a(this);
            e(c6090nWM0);
        }
        if (c0999Mo1 != null && (c7375uF2 = (C7375uF) c0999Mo1.a) != null && (l4 = (L4) c7375uF2.d) != null) {
            C6090nW c6090nWM02 = l4.M0();
            this.V = c6090nWM02;
            c6090nWM02.a(this);
            e(c6090nWM02);
        }
        if (c0999Mo1 != null && (c7375uF = (C7375uF) c0999Mo1.a) != null && (k44 = (K4) c7375uF.e) != null) {
            AbstractC5738lg abstractC5738lgM03 = k44.M0();
            this.X = (C0548Gu) abstractC5738lgM03;
            abstractC5738lgM03.a(this);
            e(abstractC5738lgM03);
        }
        if (c0999Mo1 != null && (c4053gv04 = (C4053gv0) c0999Mo1.b) != null && (k43 = (K4) c4053gv04.b) != null) {
            AbstractC5738lg abstractC5738lgM04 = k43.M0();
            this.a0 = (C0548Gu) abstractC5738lgM04;
            abstractC5738lgM04.a(this);
            e(abstractC5738lgM04);
        }
        if (c0999Mo1 != null && (c4053gv03 = (C4053gv0) c0999Mo1.b) != null && (k42 = (K4) c4053gv03.c) != null) {
            AbstractC5738lg abstractC5738lgM05 = k42.M0();
            this.b0 = (C0548Gu) abstractC5738lgM05;
            abstractC5738lgM05.a(this);
            e(abstractC5738lgM05);
        }
        if (c0999Mo1 != null && (c4053gv02 = (C4053gv0) c0999Mo1.b) != null && (k4 = (K4) c4053gv02.d) != null) {
            AbstractC5738lg abstractC5738lgM06 = k4.M0();
            this.c0 = (C0548Gu) abstractC5738lgM06;
            abstractC5738lgM06.a(this);
            e(abstractC5738lgM06);
        }
        if (c0999Mo1 == null || (c4053gv0 = (C4053gv0) c0999Mo1.b) == null) {
            return;
        }
        this.O = c4053gv0.a;
    }

    public static void u(String str, Paint paint, Canvas canvas) {
        if (paint.getColor() == 0) {
            return;
        }
        if (paint.getStyle() == Paint.Style.STROKE && paint.getStrokeWidth() == 0.0f) {
            return;
        }
        canvas.drawText(str, 0, str.length(), 0.0f, 0.0f, paint);
    }

    public static void v(Path path, Paint paint, Canvas canvas) {
        if (paint.getColor() == 0) {
            return;
        }
        if (paint.getStyle() == Paint.Style.STROKE && paint.getStrokeWidth() == 0.0f) {
            return;
        }
        canvas.drawPath(path, paint);
    }

    @Override // defpackage.AbstractC6120ng, defpackage.HL
    public final void d(RectF rectF, Matrix matrix, boolean z) {
        super.d(rectF, matrix, z);
        C1847Xl0 c1847Xl0 = this.N;
        rectF.set(0.0f, 0.0f, c1847Xl0.k.width(), c1847Xl0.k.height());
    }

    @Override // defpackage.AbstractC6120ng, defpackage.InterfaceC1049Nf0
    public final void h(ColorFilter colorFilter, ES1 es1) {
        super.h(colorFilter, es1);
        PointF pointF = InterfaceC6902rm0.a;
        if (colorFilter == 1) {
            C0901Lh1 c0901Lh1 = this.Q;
            if (c0901Lh1 != null) {
                p(c0901Lh1);
            }
            C0901Lh1 c0901Lh12 = new C0901Lh1(es1, null);
            this.Q = c0901Lh12;
            c0901Lh12.a(this);
            e(this.Q);
            return;
        }
        if (colorFilter == 2) {
            C0901Lh1 c0901Lh13 = this.S;
            if (c0901Lh13 != null) {
                p(c0901Lh13);
            }
            C0901Lh1 c0901Lh14 = new C0901Lh1(es1, null);
            this.S = c0901Lh14;
            c0901Lh14.a(this);
            e(this.S);
            return;
        }
        if (colorFilter == InterfaceC6902rm0.n) {
            C0901Lh1 c0901Lh15 = this.U;
            if (c0901Lh15 != null) {
                p(c0901Lh15);
            }
            C0901Lh1 c0901Lh16 = new C0901Lh1(es1, null);
            this.U = c0901Lh16;
            c0901Lh16.a(this);
            e(this.U);
            return;
        }
        if (colorFilter == InterfaceC6902rm0.o) {
            C0901Lh1 c0901Lh17 = this.W;
            if (c0901Lh17 != null) {
                p(c0901Lh17);
            }
            C0901Lh1 c0901Lh18 = new C0901Lh1(es1, null);
            this.W = c0901Lh18;
            c0901Lh18.a(this);
            e(this.W);
            return;
        }
        if (colorFilter == InterfaceC6902rm0.A) {
            C0901Lh1 c0901Lh19 = this.Y;
            if (c0901Lh19 != null) {
                p(c0901Lh19);
            }
            C0901Lh1 c0901Lh110 = new C0901Lh1(es1, null);
            this.Y = c0901Lh110;
            c0901Lh110.a(this);
            e(this.Y);
            return;
        }
        if (colorFilter != InterfaceC6902rm0.H) {
            if (colorFilter == InterfaceC6902rm0.J) {
                C0548Gu c0548Gu = this.L;
                c0548Gu.getClass();
                c0548Gu.j(new C7930x91(new C6330om0(), es1, new SK()));
                return;
            }
            return;
        }
        C0901Lh1 c0901Lh111 = this.Z;
        if (c0901Lh111 != null) {
            p(c0901Lh111);
        }
        C0901Lh1 c0901Lh112 = new C0901Lh1(es1, null);
        this.Z = c0901Lh112;
        c0901Lh112.a(this);
        e(this.Z);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:349:0x03b2, code lost:
    
        if (r8.equals("Regular") == false) goto L357;
     */
    /* JADX WARN: Code restructure failed: missing block: B:352:0x03bb, code lost:
    
        if (r8.equals("Normal") == false) goto L357;
     */
    /* JADX WARN: Code restructure failed: missing block: B:354:0x03be, code lost:
    
        r1 = 400;
     */
    /* JADX WARN: Removed duplicated region for block: B:265:0x00e2  */
    /* JADX WARN: Removed duplicated region for block: B:384:0x0467  */
    /* JADX WARN: Removed duplicated region for block: B:385:0x0469  */
    /* JADX WARN: Removed duplicated region for block: B:409:0x0514  */
    @Override // defpackage.AbstractC6120ng
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void k(android.graphics.Canvas r32, android.graphics.Matrix r33, int r34) {
        /*
            Method dump skipped, instructions count: 1656
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C8310z91.k(android.graphics.Canvas, android.graphics.Matrix, int):void");
    }

    public final void t(SK sk, int i, int i2) {
        C0901Lh1 c0901Lh1 = this.Q;
        C1520Tg0 c1520Tg0 = this.G;
        if (c0901Lh1 != null) {
            c1520Tg0.setColor(((Integer) c0901Lh1.e()).intValue());
        } else {
            C0548Gu c0548Gu = this.P;
            if (c0548Gu == null || !x(i2)) {
                c1520Tg0.setColor(sk.h);
            } else {
                c1520Tg0.setColor(((Integer) c0548Gu.e()).intValue());
            }
        }
        C0901Lh1 c0901Lh12 = this.S;
        C1520Tg0 c1520Tg02 = this.H;
        if (c0901Lh12 != null) {
            c1520Tg02.setColor(((Integer) c0901Lh12.e()).intValue());
        } else {
            C0548Gu c0548Gu2 = this.R;
            if (c0548Gu2 == null || !x(i2)) {
                c1520Tg02.setColor(sk.i);
            } else {
                c1520Tg02.setColor(((Integer) c0548Gu2.e()).intValue());
            }
        }
        AbstractC5738lg abstractC5738lg = this.w.j;
        int iIntValue = 100;
        int iIntValue2 = abstractC5738lg == null ? 100 : ((Integer) abstractC5738lg.e()).intValue();
        C0548Gu c0548Gu3 = this.X;
        if (c0548Gu3 != null && x(i2)) {
            iIntValue = ((Integer) c0548Gu3.e()).intValue();
        }
        int iRound = Math.round((((iIntValue / 100.0f) * ((iIntValue2 * 255.0f) / 100.0f)) * i) / 255.0f);
        c1520Tg0.setAlpha(iRound);
        c1520Tg02.setAlpha(iRound);
        C0901Lh1 c0901Lh13 = this.U;
        if (c0901Lh13 != null) {
            c1520Tg02.setStrokeWidth(((Float) c0901Lh13.e()).floatValue());
            return;
        }
        C6090nW c6090nW = this.T;
        if (c6090nW == null || !x(i2)) {
            c1520Tg02.setStrokeWidth(AbstractC0667Ih1.c() * sk.j);
        } else {
            c1520Tg02.setStrokeWidth(((Float) c6090nW.e()).floatValue());
        }
    }

    public final C8120y91 w(int i) {
        ArrayList arrayList = this.K;
        for (int size = arrayList.size(); size < i; size++) {
            C8120y91 c8120y91 = new C8120y91();
            c8120y91.a = "";
            c8120y91.b = 0.0f;
            arrayList.add(c8120y91);
        }
        return (C8120y91) arrayList.get(i - 1);
    }

    public final boolean x(int i) {
        C0548Gu c0548Gu;
        int length = ((SK) this.L.e()).a.length();
        C0548Gu c0548Gu2 = this.a0;
        if (c0548Gu2 == null || (c0548Gu = this.b0) == null) {
            return true;
        }
        int iMin = Math.min(((Integer) c0548Gu2.e()).intValue(), ((Integer) c0548Gu.e()).intValue());
        int iMax = Math.max(((Integer) c0548Gu2.e()).intValue(), ((Integer) c0548Gu.e()).intValue());
        C0548Gu c0548Gu3 = this.c0;
        if (c0548Gu3 != null) {
            int iIntValue = ((Integer) c0548Gu3.e()).intValue();
            iMin += iIntValue;
            iMax += iIntValue;
        }
        if (this.O == 2) {
            return i >= iMin && i < iMax;
        }
        float f = (i / length) * 100.0f;
        return f >= ((float) iMin) && f < ((float) iMax);
    }

    public final boolean y(Canvas canvas, SK sk, int i, float f) {
        PointF pointF = sk.l;
        PointF pointF2 = sk.m;
        float fC = AbstractC0667Ih1.c();
        float f2 = (i * sk.f * fC) + (pointF == null ? 0.0f : (sk.f * fC) + pointF.y);
        if (this.M.v && pointF2 != null && pointF != null && f2 >= pointF.y + pointF2.y + sk.c) {
            return false;
        }
        float f3 = pointF == null ? 0.0f : pointF.x;
        float f4 = pointF2 != null ? pointF2.x : 0.0f;
        int iX = AbstractC8235ym.x(sk.d);
        if (iX == 0) {
            canvas.translate(f3, f2);
        } else if (iX == 1) {
            canvas.translate((f3 + f4) - f, f2);
        } else if (iX == 2) {
            canvas.translate(((f4 / 2.0f) + f3) - (f / 2.0f), f2);
        }
        return true;
    }

    public final List z(String str, float f, RW rw, float f2, float f3, boolean z) {
        float fMeasureText;
        float f4 = 0.0f;
        float f5 = 0.0f;
        float f6 = 0.0f;
        int i = 0;
        int i2 = 0;
        boolean z2 = false;
        int i3 = 0;
        for (int i4 = 0; i4 < str.length(); i4++) {
            char cCharAt = str.charAt(i4);
            if (z) {
                TW tw = (TW) this.N.h.f(TW.a(cCharAt, rw.a, rw.c), null);
                if (tw != null) {
                    fMeasureText = (AbstractC0667Ih1.c() * ((float) tw.c) * f2) + f3;
                }
            } else {
                fMeasureText = this.G.measureText(str.substring(i4, i4 + 1)) + f3;
            }
            if (cCharAt == ' ') {
                z2 = true;
                f6 = fMeasureText;
            } else if (z2) {
                i3 = i4;
                f5 = fMeasureText;
                z2 = false;
            } else {
                f5 += fMeasureText;
            }
            f4 += fMeasureText;
            if (f > 0.0f && f4 >= f && cCharAt != ' ') {
                i++;
                C8120y91 c8120y91W = w(i);
                if (i3 == i2) {
                    c8120y91W.a = str.substring(i2, i4).trim();
                    c8120y91W.b = (f4 - fMeasureText) - ((r10.length() - r8.length()) * f6);
                    i2 = i4;
                    i3 = i2;
                    f4 = fMeasureText;
                    f5 = f4;
                } else {
                    c8120y91W.a = str.substring(i2, i3 - 1).trim();
                    c8120y91W.b = ((f4 - f5) - ((r8.length() - r13.length()) * f6)) - f6;
                    f4 = f5;
                    i2 = i3;
                }
            }
        }
        if (f4 > 0.0f) {
            i++;
            C8120y91 c8120y91W2 = w(i);
            c8120y91W2.a = str.substring(i2);
            c8120y91W2.b = f4;
        }
        return this.K.subList(0, i);
    }
}
