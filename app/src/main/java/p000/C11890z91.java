package p000;

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
public final class C11890z91 extends AbstractC6504ng {

    /* renamed from: D */
    public final StringBuilder f46668D;

    /* renamed from: E */
    public final RectF f46669E;

    /* renamed from: F */
    public final Matrix f46670F;

    /* renamed from: G */
    public final C8314Tg0 f46671G;

    /* renamed from: H */
    public final C8314Tg0 f46672H;

    /* renamed from: I */
    public final HashMap f46673I;

    /* renamed from: J */
    public final C7544El0 f46674J;

    /* renamed from: K */
    public final ArrayList f46675K;

    /* renamed from: L */
    public final C0435Gu f46676L;

    /* renamed from: M */
    public final C10307mm0 f46677M;

    /* renamed from: N */
    public final C8532Xl0 f46678N;

    /* renamed from: O */
    public final int f46679O;

    /* renamed from: P */
    public final C0435Gu f46680P;

    /* renamed from: Q */
    public C7901Lh1 f46681Q;

    /* renamed from: R */
    public final C0435Gu f46682R;

    /* renamed from: S */
    public C7901Lh1 f46683S;

    /* renamed from: T */
    public final C6494nW f46684T;

    /* renamed from: U */
    public C7901Lh1 f46685U;

    /* renamed from: V */
    public final C6494nW f46686V;

    /* renamed from: W */
    public C7901Lh1 f46687W;

    /* renamed from: X */
    public final C0435Gu f46688X;

    /* renamed from: Y */
    public C7901Lh1 f46689Y;

    /* renamed from: Z */
    public C7901Lh1 f46690Z;

    /* renamed from: a0 */
    public final C0435Gu f46691a0;

    /* renamed from: b0 */
    public final C0435Gu f46692b0;

    /* renamed from: c0 */
    public final C0435Gu f46693c0;

    public C11890z91(C10307mm0 c10307mm0, C8574Yg0 c8574Yg0) {
        C9557gv0 c9557gv0;
        C9557gv0 c9557gv02;
        C0635K4 c0635k4;
        C9557gv0 c9557gv03;
        C0635K4 c0635k42;
        C9557gv0 c9557gv04;
        C0635K4 c0635k43;
        C6937uF c6937uF;
        C0635K4 c0635k44;
        C6937uF c6937uF2;
        C0698L4 c0698l4;
        C6937uF c6937uF3;
        C0698L4 c0698l42;
        C6937uF c6937uF4;
        C0635K4 c0635k45;
        C6937uF c6937uF5;
        C0635K4 c0635k46;
        super(c10307mm0, c8574Yg0);
        this.f46668D = new StringBuilder(2);
        this.f46669E = new RectF();
        this.f46670F = new Matrix();
        C8314Tg0 c8314Tg0 = new C8314Tg0(1, 1);
        c8314Tg0.setStyle(Paint.Style.FILL);
        this.f46671G = c8314Tg0;
        C8314Tg0 c8314Tg02 = new C8314Tg0(1, 2);
        c8314Tg02.setStyle(Paint.Style.STROKE);
        this.f46672H = c8314Tg02;
        this.f46673I = new HashMap();
        this.f46674J = new C7544El0();
        this.f46675K = new ArrayList();
        this.f46679O = 2;
        this.f46677M = c10307mm0;
        this.f46678N = c8574Yg0.f14419b;
        C0435Gu c0435Gu = new C0435Gu((List) c8574Yg0.f14434q.f11615b, 2);
        this.f46676L = c0435Gu;
        c0435Gu.m22527a(this);
        m23162e(c0435Gu);
        C7967Mo1 c7967Mo1 = c8574Yg0.f14435r;
        if (c7967Mo1 != null && (c6937uF5 = (C6937uF) c7967Mo1.f7362a) != null && (c0635k46 = (C0635K4) c6937uF5.f43616a) != null) {
            AbstractC6378lg abstractC6378lgMo4553M0 = c0635k46.mo4553M0();
            this.f46680P = (C0435Gu) abstractC6378lgMo4553M0;
            abstractC6378lgMo4553M0.m22527a(this);
            m23162e(abstractC6378lgMo4553M0);
        }
        if (c7967Mo1 != null && (c6937uF4 = (C6937uF) c7967Mo1.f7362a) != null && (c0635k45 = (C0635K4) c6937uF4.f43617b) != null) {
            AbstractC6378lg abstractC6378lgMo4553M02 = c0635k45.mo4553M0();
            this.f46682R = (C0435Gu) abstractC6378lgMo4553M02;
            abstractC6378lgMo4553M02.m22527a(this);
            m23162e(abstractC6378lgMo4553M02);
        }
        if (c7967Mo1 != null && (c6937uF3 = (C6937uF) c7967Mo1.f7362a) != null && (c0698l42 = (C0698L4) c6937uF3.f43618c) != null) {
            C6494nW c6494nWMo4553M0 = c0698l42.mo4553M0();
            this.f46684T = c6494nWMo4553M0;
            c6494nWMo4553M0.m22527a(this);
            m23162e(c6494nWMo4553M0);
        }
        if (c7967Mo1 != null && (c6937uF2 = (C6937uF) c7967Mo1.f7362a) != null && (c0698l4 = (C0698L4) c6937uF2.f43619d) != null) {
            C6494nW c6494nWMo4553M02 = c0698l4.mo4553M0();
            this.f46686V = c6494nWMo4553M02;
            c6494nWMo4553M02.m22527a(this);
            m23162e(c6494nWMo4553M02);
        }
        if (c7967Mo1 != null && (c6937uF = (C6937uF) c7967Mo1.f7362a) != null && (c0635k44 = (C0635K4) c6937uF.f43620e) != null) {
            AbstractC6378lg abstractC6378lgMo4553M03 = c0635k44.mo4553M0();
            this.f46688X = (C0435Gu) abstractC6378lgMo4553M03;
            abstractC6378lgMo4553M03.m22527a(this);
            m23162e(abstractC6378lgMo4553M03);
        }
        if (c7967Mo1 != null && (c9557gv04 = (C9557gv0) c7967Mo1.f7363b) != null && (c0635k43 = (C0635K4) c9557gv04.f28086b) != null) {
            AbstractC6378lg abstractC6378lgMo4553M04 = c0635k43.mo4553M0();
            this.f46691a0 = (C0435Gu) abstractC6378lgMo4553M04;
            abstractC6378lgMo4553M04.m22527a(this);
            m23162e(abstractC6378lgMo4553M04);
        }
        if (c7967Mo1 != null && (c9557gv03 = (C9557gv0) c7967Mo1.f7363b) != null && (c0635k42 = (C0635K4) c9557gv03.f28087c) != null) {
            AbstractC6378lg abstractC6378lgMo4553M05 = c0635k42.mo4553M0();
            this.f46692b0 = (C0435Gu) abstractC6378lgMo4553M05;
            abstractC6378lgMo4553M05.m22527a(this);
            m23162e(abstractC6378lgMo4553M05);
        }
        if (c7967Mo1 != null && (c9557gv02 = (C9557gv0) c7967Mo1.f7363b) != null && (c0635k4 = (C0635K4) c9557gv02.f28088d) != null) {
            AbstractC6378lg abstractC6378lgMo4553M06 = c0635k4.mo4553M0();
            this.f46693c0 = (C0435Gu) abstractC6378lgMo4553M06;
            abstractC6378lgMo4553M06.m22527a(this);
            m23162e(abstractC6378lgMo4553M06);
        }
        if (c7967Mo1 == null || (c9557gv0 = (C9557gv0) c7967Mo1.f7363b) == null) {
            return;
        }
        this.f46679O = c9557gv0.f28085a;
    }

    /* renamed from: u */
    public static void m26316u(String str, Paint paint, Canvas canvas) {
        if (paint.getColor() == 0) {
            return;
        }
        if (paint.getStyle() == Paint.Style.STROKE && paint.getStrokeWidth() == 0.0f) {
            return;
        }
        canvas.drawText(str, 0, str.length(), 0.0f, 0.0f, paint);
    }

    /* renamed from: v */
    public static void m26317v(Path path, Paint paint, Canvas canvas) {
        if (paint.getColor() == 0) {
            return;
        }
        if (paint.getStyle() == Paint.Style.STROKE && paint.getStrokeWidth() == 0.0f) {
            return;
        }
        canvas.drawPath(path, paint);
    }

    @Override // p000.AbstractC6504ng, p000.InterfaceC0463HL
    /* renamed from: d */
    public final void mo1744d(RectF rectF, Matrix matrix, boolean z) {
        super.mo1744d(rectF, matrix, z);
        C8532Xl0 c8532Xl0 = this.f46678N;
        rectF.set(0.0f, 0.0f, c8532Xl0.f13957k.width(), c8532Xl0.f13957k.height());
    }

    @Override // p000.AbstractC6504ng, p000.InterfaceC8000Nf0
    /* renamed from: h */
    public final void mo1746h(ColorFilter colorFilter, ES1 es1) {
        super.mo1746h(colorFilter, es1);
        PointF pointF = InterfaceC10947rm0.f41869a;
        if (colorFilter == 1) {
            C7901Lh1 c7901Lh1 = this.f46681Q;
            if (c7901Lh1 != null) {
                m23167p(c7901Lh1);
            }
            C7901Lh1 c7901Lh12 = new C7901Lh1(es1, null);
            this.f46681Q = c7901Lh12;
            c7901Lh12.m22527a(this);
            m23162e(this.f46681Q);
            return;
        }
        if (colorFilter == 2) {
            C7901Lh1 c7901Lh13 = this.f46683S;
            if (c7901Lh13 != null) {
                m23167p(c7901Lh13);
            }
            C7901Lh1 c7901Lh14 = new C7901Lh1(es1, null);
            this.f46683S = c7901Lh14;
            c7901Lh14.m22527a(this);
            m23162e(this.f46683S);
            return;
        }
        if (colorFilter == InterfaceC10947rm0.f41882n) {
            C7901Lh1 c7901Lh15 = this.f46685U;
            if (c7901Lh15 != null) {
                m23167p(c7901Lh15);
            }
            C7901Lh1 c7901Lh16 = new C7901Lh1(es1, null);
            this.f46685U = c7901Lh16;
            c7901Lh16.m22527a(this);
            m23162e(this.f46685U);
            return;
        }
        if (colorFilter == InterfaceC10947rm0.f41883o) {
            C7901Lh1 c7901Lh17 = this.f46687W;
            if (c7901Lh17 != null) {
                m23167p(c7901Lh17);
            }
            C7901Lh1 c7901Lh18 = new C7901Lh1(es1, null);
            this.f46687W = c7901Lh18;
            c7901Lh18.m22527a(this);
            m23162e(this.f46687W);
            return;
        }
        if (colorFilter == InterfaceC10947rm0.f41858A) {
            C7901Lh1 c7901Lh19 = this.f46689Y;
            if (c7901Lh19 != null) {
                m23167p(c7901Lh19);
            }
            C7901Lh1 c7901Lh110 = new C7901Lh1(es1, null);
            this.f46689Y = c7901Lh110;
            c7901Lh110.m22527a(this);
            m23162e(this.f46689Y);
            return;
        }
        if (colorFilter != InterfaceC10947rm0.f41865H) {
            if (colorFilter == InterfaceC10947rm0.f41867J) {
                C0435Gu c0435Gu = this.f46676L;
                c0435Gu.getClass();
                c0435Gu.m22530j(new C11636x91(new C10563om0(), es1, new C1153SK()));
                return;
            }
            return;
        }
        C7901Lh1 c7901Lh111 = this.f46690Z;
        if (c7901Lh111 != null) {
            m23167p(c7901Lh111);
        }
        C7901Lh1 c7901Lh112 = new C7901Lh1(es1, null);
        this.f46690Z = c7901Lh112;
        c7901Lh112.m22527a(this);
        m23162e(this.f46690Z);
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
    @Override // p000.AbstractC6504ng
    /* renamed from: k */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void mo5542k(android.graphics.Canvas r32, android.graphics.Matrix r33, int r34) {
        /*
            Method dump skipped, instructions count: 1656
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.C11890z91.mo5542k(android.graphics.Canvas, android.graphics.Matrix, int):void");
    }

    /* renamed from: t */
    public final void m26318t(C1153SK c1153sk, int i, int i2) {
        C7901Lh1 c7901Lh1 = this.f46681Q;
        C8314Tg0 c8314Tg0 = this.f46671G;
        if (c7901Lh1 != null) {
            c8314Tg0.setColor(((Integer) c7901Lh1.mo5063e()).intValue());
        } else {
            C0435Gu c0435Gu = this.f46680P;
            if (c0435Gu == null || !m26320x(i2)) {
                c8314Tg0.setColor(c1153sk.f10692h);
            } else {
                c8314Tg0.setColor(((Integer) c0435Gu.mo5063e()).intValue());
            }
        }
        C7901Lh1 c7901Lh12 = this.f46683S;
        C8314Tg0 c8314Tg02 = this.f46672H;
        if (c7901Lh12 != null) {
            c8314Tg02.setColor(((Integer) c7901Lh12.mo5063e()).intValue());
        } else {
            C0435Gu c0435Gu2 = this.f46682R;
            if (c0435Gu2 == null || !m26320x(i2)) {
                c8314Tg02.setColor(c1153sk.f10693i);
            } else {
                c8314Tg02.setColor(((Integer) c0435Gu2.mo5063e()).intValue());
            }
        }
        AbstractC6378lg abstractC6378lg = this.f38464w.f42510j;
        int iIntValue = 100;
        int iIntValue2 = abstractC6378lg == null ? 100 : ((Integer) abstractC6378lg.mo5063e()).intValue();
        C0435Gu c0435Gu3 = this.f46688X;
        if (c0435Gu3 != null && m26320x(i2)) {
            iIntValue = ((Integer) c0435Gu3.mo5063e()).intValue();
        }
        int iRound = Math.round((((iIntValue / 100.0f) * ((iIntValue2 * 255.0f) / 100.0f)) * i) / 255.0f);
        c8314Tg0.setAlpha(iRound);
        c8314Tg02.setAlpha(iRound);
        C7901Lh1 c7901Lh13 = this.f46685U;
        if (c7901Lh13 != null) {
            c8314Tg02.setStrokeWidth(((Float) c7901Lh13.mo5063e()).floatValue());
            return;
        }
        C6494nW c6494nW = this.f46684T;
        if (c6494nW == null || !m26320x(i2)) {
            c8314Tg02.setStrokeWidth(AbstractC7745Ih1.m3974c() * c1153sk.f10694j);
        } else {
            c8314Tg02.setStrokeWidth(((Float) c6494nW.mo5063e()).floatValue());
        }
    }

    /* renamed from: w */
    public final C11763y91 m26319w(int i) {
        ArrayList arrayList = this.f46675K;
        for (int size = arrayList.size(); size < i; size++) {
            C11763y91 c11763y91 = new C11763y91();
            c11763y91.f46106a = "";
            c11763y91.f46107b = 0.0f;
            arrayList.add(c11763y91);
        }
        return (C11763y91) arrayList.get(i - 1);
    }

    /* renamed from: x */
    public final boolean m26320x(int i) {
        C0435Gu c0435Gu;
        int length = ((C1153SK) this.f46676L.mo5063e()).f10685a.length();
        C0435Gu c0435Gu2 = this.f46691a0;
        if (c0435Gu2 == null || (c0435Gu = this.f46692b0) == null) {
            return true;
        }
        int iMin = Math.min(((Integer) c0435Gu2.mo5063e()).intValue(), ((Integer) c0435Gu.mo5063e()).intValue());
        int iMax = Math.max(((Integer) c0435Gu2.mo5063e()).intValue(), ((Integer) c0435Gu.mo5063e()).intValue());
        C0435Gu c0435Gu3 = this.f46693c0;
        if (c0435Gu3 != null) {
            int iIntValue = ((Integer) c0435Gu3.mo5063e()).intValue();
            iMin += iIntValue;
            iMax += iIntValue;
        }
        if (this.f46679O == 2) {
            return i >= iMin && i < iMax;
        }
        float f = (i / length) * 100.0f;
        return f >= ((float) iMin) && f < ((float) iMax);
    }

    /* renamed from: y */
    public final boolean m26321y(Canvas canvas, C1153SK c1153sk, int i, float f) {
        PointF pointF = c1153sk.f10696l;
        PointF pointF2 = c1153sk.f10697m;
        float fM3974c = AbstractC7745Ih1.m3974c();
        float f2 = (i * c1153sk.f10690f * fM3974c) + (pointF == null ? 0.0f : (c1153sk.f10690f * fM3974c) + pointF.y);
        if (this.f46677M.f37908v && pointF2 != null && pointF != null && f2 >= pointF.y + pointF2.y + c1153sk.f10687c) {
            return false;
        }
        float f3 = pointF == null ? 0.0f : pointF.x;
        float f4 = pointF2 != null ? pointF2.x : 0.0f;
        int iM26247x = AbstractC7222ym.m26247x(c1153sk.f10688d);
        if (iM26247x == 0) {
            canvas.translate(f3, f2);
        } else if (iM26247x == 1) {
            canvas.translate((f3 + f4) - f, f2);
        } else if (iM26247x == 2) {
            canvas.translate(((f4 / 2.0f) + f3) - (f / 2.0f), f2);
        }
        return true;
    }

    /* renamed from: z */
    public final List m26322z(String str, float f, C1102RW c1102rw, float f2, float f3, boolean z) {
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
                C1228TW c1228tw = (C1228TW) this.f46678N.f13954h.m10582f(C1228TW.m7703a(cCharAt, c1102rw.f10245a, c1102rw.f10247c), null);
                if (c1228tw != null) {
                    fMeasureText = (AbstractC7745Ih1.m3974c() * ((float) c1228tw.f11408c) * f2) + f3;
                }
            } else {
                fMeasureText = this.f46671G.measureText(str.substring(i4, i4 + 1)) + f3;
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
                C11763y91 c11763y91M26319w = m26319w(i);
                if (i3 == i2) {
                    c11763y91M26319w.f46106a = str.substring(i2, i4).trim();
                    c11763y91M26319w.f46107b = (f4 - fMeasureText) - ((r10.length() - r8.length()) * f6);
                    i2 = i4;
                    i3 = i2;
                    f4 = fMeasureText;
                    f5 = f4;
                } else {
                    c11763y91M26319w.f46106a = str.substring(i2, i3 - 1).trim();
                    c11763y91M26319w.f46107b = ((f4 - f5) - ((r8.length() - r13.length()) * f6)) - f6;
                    f4 = f5;
                    i2 = i3;
                }
            }
        }
        if (f4 > 0.0f) {
            i++;
            C11763y91 c11763y91M26319w2 = m26319w(i);
            c11763y91M26319w2.f46106a = str.substring(i2);
            c11763y91M26319w2.f46107b = f4;
        }
        return this.f46675K.subList(0, i);
    }
}
