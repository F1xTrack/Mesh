package p000;

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
public final class T10 implements InterfaceC0463HL, InterfaceC4194hg, InterfaceC8052Of0 {

    /* renamed from: a */
    public final String f11107a;

    /* renamed from: b */
    public final boolean f11108b;

    /* renamed from: c */
    public final AbstractC6504ng f11109c;

    /* renamed from: d */
    public final C7544El0 f11110d = new C7544El0();

    /* renamed from: e */
    public final C7544El0 f11111e = new C7544El0();

    /* renamed from: f */
    public final Path f11112f;

    /* renamed from: g */
    public final C8314Tg0 f11113g;

    /* renamed from: h */
    public final RectF f11114h;

    /* renamed from: i */
    public final ArrayList f11115i;

    /* renamed from: j */
    public final int f11116j;

    /* renamed from: k */
    public final R10 f11117k;

    /* renamed from: l */
    public final C0435Gu f11118l;

    /* renamed from: m */
    public final R10 f11119m;

    /* renamed from: n */
    public final R10 f11120n;

    /* renamed from: o */
    public C7901Lh1 f11121o;

    /* renamed from: p */
    public C7901Lh1 f11122p;

    /* renamed from: q */
    public final C10307mm0 f11123q;

    /* renamed from: r */
    public final int f11124r;

    /* renamed from: s */
    public AbstractC6378lg f11125s;

    /* renamed from: t */
    public float f11126t;

    /* renamed from: u */
    public final C4048fM f11127u;

    public T10(C10307mm0 c10307mm0, C8532Xl0 c8532Xl0, AbstractC6504ng abstractC6504ng, S10 s10) {
        Path path = new Path();
        this.f11112f = path;
        this.f11113g = new C8314Tg0(1, 0);
        this.f11114h = new RectF();
        this.f11115i = new ArrayList();
        this.f11126t = 0.0f;
        this.f11109c = abstractC6504ng;
        this.f11107a = s10.f10535g;
        this.f11108b = s10.f10536h;
        this.f11123q = c10307mm0;
        this.f11116j = s10.f10529a;
        path.setFillType(s10.f10530b);
        this.f11124r = (int) (c8532Xl0.m9111b() / 32.0f);
        AbstractC6378lg abstractC6378lgMo4553M0 = s10.f10531c.mo4553M0();
        this.f11117k = (R10) abstractC6378lgMo4553M0;
        abstractC6378lgMo4553M0.m22527a(this);
        abstractC6504ng.m23162e(abstractC6378lgMo4553M0);
        AbstractC6378lg abstractC6378lgMo4553M02 = s10.f10532d.mo4553M0();
        this.f11118l = (C0435Gu) abstractC6378lgMo4553M02;
        abstractC6378lgMo4553M02.m22527a(this);
        abstractC6504ng.m23162e(abstractC6378lgMo4553M02);
        AbstractC6378lg abstractC6378lgMo4553M03 = s10.f10533e.mo4553M0();
        this.f11119m = (R10) abstractC6378lgMo4553M03;
        abstractC6378lgMo4553M03.m22527a(this);
        abstractC6504ng.m23162e(abstractC6378lgMo4553M03);
        AbstractC6378lg abstractC6378lgMo4553M04 = s10.f10534f.mo4553M0();
        this.f11120n = (R10) abstractC6378lgMo4553M04;
        abstractC6378lgMo4553M04.m22527a(this);
        abstractC6504ng.m23162e(abstractC6378lgMo4553M04);
        if (abstractC6504ng.mo8507l() != null) {
            C6494nW c6494nWMo4553M0 = ((C0698L4) abstractC6504ng.mo8507l().f3494a).mo4553M0();
            this.f11125s = c6494nWMo4553M0;
            c6494nWMo4553M0.m22527a(this);
            abstractC6504ng.m23162e(this.f11125s);
        }
        if (abstractC6504ng.mo8508m() != null) {
            this.f11127u = new C4048fM(this, abstractC6504ng, abstractC6504ng.mo8508m());
        }
    }

    @Override // p000.InterfaceC4194hg
    /* renamed from: a */
    public final void mo1741a() {
        this.f11123q.invalidateSelf();
    }

    @Override // p000.InterfaceC6793ry
    /* renamed from: b */
    public final void mo1742b(List list, List list2) {
        for (int i = 0; i < list2.size(); i++) {
            InterfaceC6793ry interfaceC6793ry = (InterfaceC6793ry) list2.get(i);
            if (interfaceC6793ry instanceof InterfaceC10615pA0) {
                this.f11115i.add((InterfaceC10615pA0) interfaceC6793ry);
            }
        }
    }

    @Override // p000.InterfaceC8000Nf0
    /* renamed from: c */
    public final void mo1743c(C7948Mf0 c7948Mf0, int i, ArrayList arrayList, C7948Mf0 c7948Mf02) {
        AbstractC8778as0.m10354f(c7948Mf0, i, arrayList, c7948Mf02, this);
    }

    @Override // p000.InterfaceC0463HL
    /* renamed from: d */
    public final void mo1744d(RectF rectF, Matrix matrix, boolean z) {
        Path path = this.f11112f;
        path.reset();
        int i = 0;
        while (true) {
            ArrayList arrayList = this.f11115i;
            if (i >= arrayList.size()) {
                path.computeBounds(rectF, false);
                rectF.set(rectF.left - 1.0f, rectF.top - 1.0f, rectF.right + 1.0f, rectF.bottom + 1.0f);
                return;
            } else {
                path.addPath(((InterfaceC10615pA0) arrayList.get(i)).mo5778g(), matrix);
                i++;
            }
        }
    }

    /* renamed from: e */
    public final int[] m7518e(int[] iArr) {
        C7901Lh1 c7901Lh1 = this.f11122p;
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

    @Override // p000.InterfaceC0463HL
    /* renamed from: f */
    public final void mo1745f(Canvas canvas, Matrix matrix, int i) {
        Shader shader;
        if (this.f11108b) {
            return;
        }
        Path path = this.f11112f;
        path.reset();
        int i2 = 0;
        while (true) {
            ArrayList arrayList = this.f11115i;
            if (i2 >= arrayList.size()) {
                break;
            }
            path.addPath(((InterfaceC10615pA0) arrayList.get(i2)).mo5778g(), matrix);
            i2++;
        }
        path.computeBounds(this.f11114h, false);
        int i3 = this.f11116j;
        R10 r10 = this.f11117k;
        R10 r102 = this.f11120n;
        R10 r103 = this.f11119m;
        if (i3 == 1) {
            long jM7519i = m7519i();
            C7544El0 c7544El0 = this.f11110d;
            shader = (LinearGradient) c7544El0.m2382j(jM7519i, null);
            if (shader == null) {
                PointF pointF = (PointF) r103.mo5063e();
                PointF pointF2 = (PointF) r102.mo5063e();
                Q10 q10 = (Q10) r10.mo5063e();
                LinearGradient linearGradient = new LinearGradient(pointF.x, pointF.y, pointF2.x, pointF2.y, m7518e(q10.f9404b), q10.f9403a, Shader.TileMode.CLAMP);
                c7544El0.m2383k(jM7519i, linearGradient);
                shader = linearGradient;
            }
        } else {
            long jM7519i2 = m7519i();
            C7544El0 c7544El02 = this.f11111e;
            shader = (RadialGradient) c7544El02.m2382j(jM7519i2, null);
            if (shader == null) {
                PointF pointF3 = (PointF) r103.mo5063e();
                PointF pointF4 = (PointF) r102.mo5063e();
                Q10 q102 = (Q10) r10.mo5063e();
                int[] iArrM7518e = m7518e(q102.f9404b);
                float f = pointF3.x;
                float f2 = pointF3.y;
                float fHypot = (float) Math.hypot(pointF4.x - f, pointF4.y - f2);
                if (fHypot <= 0.0f) {
                    fHypot = 0.001f;
                }
                RadialGradient radialGradient = new RadialGradient(f, f2, fHypot, iArrM7518e, q102.f9403a, Shader.TileMode.CLAMP);
                c7544El02.m2383k(jM7519i2, radialGradient);
                shader = radialGradient;
            }
        }
        shader.setLocalMatrix(matrix);
        C8314Tg0 c8314Tg0 = this.f11113g;
        c8314Tg0.setShader(shader);
        C7901Lh1 c7901Lh1 = this.f11121o;
        if (c7901Lh1 != null) {
            c8314Tg0.setColorFilter((ColorFilter) c7901Lh1.mo5063e());
        }
        AbstractC6378lg abstractC6378lg = this.f11125s;
        if (abstractC6378lg != null) {
            float fFloatValue = ((Float) abstractC6378lg.mo5063e()).floatValue();
            if (fFloatValue == 0.0f) {
                c8314Tg0.setMaskFilter(null);
            } else if (fFloatValue != this.f11126t) {
                c8314Tg0.setMaskFilter(new BlurMaskFilter(fFloatValue, BlurMaskFilter.Blur.NORMAL));
            }
            this.f11126t = fFloatValue;
        }
        float f3 = i / 255.0f;
        int iIntValue = (int) (((((Integer) this.f11118l.mo5063e()).intValue() * f3) / 100.0f) * 255.0f);
        PointF pointF5 = AbstractC8778as0.f16638a;
        c8314Tg0.setAlpha(Math.max(0, Math.min(KotlinVersion.MAX_COMPONENT_VALUE, iIntValue)));
        C4048fM c4048fM = this.f11127u;
        if (c4048fM != null) {
            C6809sD c6809sD = AbstractC7745Ih1.f5085a;
            c4048fM.m18219b(c8314Tg0, matrix, (int) (((f3 * iIntValue) / 255.0f) * 255.0f));
        }
        canvas.drawPath(path, c8314Tg0);
    }

    @Override // p000.InterfaceC6793ry
    public final String getName() {
        return this.f11107a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p000.InterfaceC8000Nf0
    /* renamed from: h */
    public final void mo1746h(ColorFilter colorFilter, ES1 es1) {
        PointF pointF = InterfaceC10947rm0.f41869a;
        if (colorFilter == 4) {
            this.f11118l.m22530j(es1);
            return;
        }
        ColorFilter colorFilter2 = InterfaceC10947rm0.f41863F;
        AbstractC6504ng abstractC6504ng = this.f11109c;
        if (colorFilter == colorFilter2) {
            C7901Lh1 c7901Lh1 = this.f11121o;
            if (c7901Lh1 != null) {
                abstractC6504ng.m23167p(c7901Lh1);
            }
            C7901Lh1 c7901Lh12 = new C7901Lh1(es1, null);
            this.f11121o = c7901Lh12;
            c7901Lh12.m22527a(this);
            abstractC6504ng.m23162e(this.f11121o);
            return;
        }
        if (colorFilter == InterfaceC10947rm0.f41864G) {
            C7901Lh1 c7901Lh13 = this.f11122p;
            if (c7901Lh13 != null) {
                abstractC6504ng.m23167p(c7901Lh13);
            }
            this.f11110d.m2379e();
            this.f11111e.m2379e();
            C7901Lh1 c7901Lh14 = new C7901Lh1(es1, null);
            this.f11122p = c7901Lh14;
            c7901Lh14.m22527a(this);
            abstractC6504ng.m23162e(this.f11122p);
            return;
        }
        if (colorFilter == InterfaceC10947rm0.f41873e) {
            AbstractC6378lg abstractC6378lg = this.f11125s;
            if (abstractC6378lg != null) {
                abstractC6378lg.m22530j(es1);
                return;
            }
            C7901Lh1 c7901Lh15 = new C7901Lh1(es1, null);
            this.f11125s = c7901Lh15;
            c7901Lh15.m22527a(this);
            abstractC6504ng.m23162e(this.f11125s);
            return;
        }
        C4048fM c4048fM = this.f11127u;
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

    /* renamed from: i */
    public final int m7519i() {
        float f = this.f11119m.f37231d;
        float f2 = this.f11124r;
        int iRound = Math.round(f * f2);
        int iRound2 = Math.round(this.f11120n.f37231d * f2);
        int iRound3 = Math.round(this.f11117k.f37231d * f2);
        int i = iRound != 0 ? 527 * iRound : 17;
        if (iRound2 != 0) {
            i = i * 31 * iRound2;
        }
        return iRound3 != 0 ? i * 31 * iRound3 : i;
    }
}
