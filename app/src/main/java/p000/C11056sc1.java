package p000;

import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.PointF;
import java.util.Collections;

/* renamed from: sc1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C11056sc1 {

    /* renamed from: a */
    public final Matrix f42501a = new Matrix();

    /* renamed from: b */
    public final Matrix f42502b;

    /* renamed from: c */
    public final Matrix f42503c;

    /* renamed from: d */
    public final Matrix f42504d;

    /* renamed from: e */
    public final float[] f42505e;

    /* renamed from: f */
    public AbstractC6378lg f42506f;

    /* renamed from: g */
    public AbstractC6378lg f42507g;

    /* renamed from: h */
    public AbstractC6378lg f42508h;

    /* renamed from: i */
    public AbstractC6378lg f42509i;

    /* renamed from: j */
    public AbstractC6378lg f42510j;

    /* renamed from: k */
    public C6494nW f42511k;

    /* renamed from: l */
    public C6494nW f42512l;

    /* renamed from: m */
    public AbstractC6378lg f42513m;

    /* renamed from: n */
    public AbstractC6378lg f42514n;

    /* renamed from: o */
    public final boolean f42515o;

    public C11056sc1(C0949P4 c0949p4) {
        C7978Mu0 c7978Mu0 = c0949p4.f8832a;
        this.f42506f = c7978Mu0 == null ? null : c7978Mu0.mo4553M0();
        InterfaceC1074R4 interfaceC1074R4 = c0949p4.f8833b;
        this.f42507g = interfaceC1074R4 == null ? null : interfaceC1074R4.mo4553M0();
        C0635K4 c0635k4 = c0949p4.f8834c;
        this.f42508h = c0635k4 == null ? null : c0635k4.mo4553M0();
        C0698L4 c0698l4 = c0949p4.f8835d;
        this.f42509i = c0698l4 == null ? null : c0698l4.mo4553M0();
        C0698L4 c0698l42 = c0949p4.f8837f;
        C6494nW c6494nWMo4553M0 = c0698l42 == null ? null : c0698l42.mo4553M0();
        this.f42511k = c6494nWMo4553M0;
        this.f42515o = c0949p4.f8841j;
        if (c6494nWMo4553M0 != null) {
            this.f42502b = new Matrix();
            this.f42503c = new Matrix();
            this.f42504d = new Matrix();
            this.f42505e = new float[9];
        } else {
            this.f42502b = null;
            this.f42503c = null;
            this.f42504d = null;
            this.f42505e = null;
        }
        C0698L4 c0698l43 = c0949p4.f8838g;
        this.f42512l = c0698l43 == null ? null : c0698l43.mo4553M0();
        C0635K4 c0635k42 = c0949p4.f8836e;
        if (c0635k42 != null) {
            this.f42510j = c0635k42.mo4553M0();
        }
        C0698L4 c0698l44 = c0949p4.f8839h;
        if (c0698l44 != null) {
            this.f42513m = c0698l44.mo4553M0();
        } else {
            this.f42513m = null;
        }
        C0698L4 c0698l45 = c0949p4.f8840i;
        if (c0698l45 != null) {
            this.f42514n = c0698l45.mo4553M0();
        } else {
            this.f42514n = null;
        }
    }

    /* renamed from: a */
    public final void m24750a(AbstractC6504ng abstractC6504ng) {
        abstractC6504ng.m23162e(this.f42510j);
        abstractC6504ng.m23162e(this.f42513m);
        abstractC6504ng.m23162e(this.f42514n);
        abstractC6504ng.m23162e(this.f42506f);
        abstractC6504ng.m23162e(this.f42507g);
        abstractC6504ng.m23162e(this.f42508h);
        abstractC6504ng.m23162e(this.f42509i);
        abstractC6504ng.m23162e(this.f42511k);
        abstractC6504ng.m23162e(this.f42512l);
    }

    /* renamed from: b */
    public final void m24751b(InterfaceC4194hg interfaceC4194hg) {
        AbstractC6378lg abstractC6378lg = this.f42510j;
        if (abstractC6378lg != null) {
            abstractC6378lg.m22527a(interfaceC4194hg);
        }
        AbstractC6378lg abstractC6378lg2 = this.f42513m;
        if (abstractC6378lg2 != null) {
            abstractC6378lg2.m22527a(interfaceC4194hg);
        }
        AbstractC6378lg abstractC6378lg3 = this.f42514n;
        if (abstractC6378lg3 != null) {
            abstractC6378lg3.m22527a(interfaceC4194hg);
        }
        AbstractC6378lg abstractC6378lg4 = this.f42506f;
        if (abstractC6378lg4 != null) {
            abstractC6378lg4.m22527a(interfaceC4194hg);
        }
        AbstractC6378lg abstractC6378lg5 = this.f42507g;
        if (abstractC6378lg5 != null) {
            abstractC6378lg5.m22527a(interfaceC4194hg);
        }
        AbstractC6378lg abstractC6378lg6 = this.f42508h;
        if (abstractC6378lg6 != null) {
            abstractC6378lg6.m22527a(interfaceC4194hg);
        }
        AbstractC6378lg abstractC6378lg7 = this.f42509i;
        if (abstractC6378lg7 != null) {
            abstractC6378lg7.m22527a(interfaceC4194hg);
        }
        C6494nW c6494nW = this.f42511k;
        if (c6494nW != null) {
            c6494nW.m22527a(interfaceC4194hg);
        }
        C6494nW c6494nW2 = this.f42512l;
        if (c6494nW2 != null) {
            c6494nW2.m22527a(interfaceC4194hg);
        }
    }

    /* renamed from: c */
    public final boolean m24752c(ColorFilter colorFilter, ES1 es1) {
        if (colorFilter == InterfaceC10947rm0.f41869a) {
            AbstractC6378lg abstractC6378lg = this.f42506f;
            if (abstractC6378lg == null) {
                this.f42506f = new C7901Lh1(es1, new PointF());
                return true;
            }
            abstractC6378lg.m22530j(es1);
            return true;
        }
        if (colorFilter == InterfaceC10947rm0.f41870b) {
            AbstractC6378lg abstractC6378lg2 = this.f42507g;
            if (abstractC6378lg2 == null) {
                this.f42507g = new C7901Lh1(es1, new PointF());
                return true;
            }
            abstractC6378lg2.m22530j(es1);
            return true;
        }
        if (colorFilter == InterfaceC10947rm0.f41871c) {
            AbstractC6378lg abstractC6378lg3 = this.f42507g;
            if (abstractC6378lg3 instanceof C11497w31) {
                C11497w31 c11497w31 = (C11497w31) abstractC6378lg3;
                ES1 es12 = c11497w31.f44669m;
                c11497w31.f44669m = es1;
                return true;
            }
        }
        if (colorFilter == InterfaceC10947rm0.f41872d) {
            AbstractC6378lg abstractC6378lg4 = this.f42507g;
            if (abstractC6378lg4 instanceof C11497w31) {
                C11497w31 c11497w312 = (C11497w31) abstractC6378lg4;
                ES1 es13 = c11497w312.f44670n;
                c11497w312.f44670n = es1;
                return true;
            }
        }
        if (colorFilter == InterfaceC10947rm0.f41878j) {
            AbstractC6378lg abstractC6378lg5 = this.f42508h;
            if (abstractC6378lg5 == null) {
                this.f42508h = new C7901Lh1(es1, new C11169tV0());
                return true;
            }
            abstractC6378lg5.m22530j(es1);
            return true;
        }
        if (colorFilter == InterfaceC10947rm0.f41879k) {
            AbstractC6378lg abstractC6378lg6 = this.f42509i;
            if (abstractC6378lg6 == null) {
                this.f42509i = new C7901Lh1(es1, Float.valueOf(0.0f));
                return true;
            }
            abstractC6378lg6.m22530j(es1);
            return true;
        }
        if (colorFilter == 3) {
            AbstractC6378lg abstractC6378lg7 = this.f42510j;
            if (abstractC6378lg7 == null) {
                this.f42510j = new C7901Lh1(es1, 100);
                return true;
            }
            abstractC6378lg7.m22530j(es1);
            return true;
        }
        if (colorFilter == InterfaceC10947rm0.f41892x) {
            AbstractC6378lg abstractC6378lg8 = this.f42513m;
            if (abstractC6378lg8 == null) {
                this.f42513m = new C7901Lh1(es1, Float.valueOf(100.0f));
                return true;
            }
            abstractC6378lg8.m22530j(es1);
            return true;
        }
        if (colorFilter == InterfaceC10947rm0.f41893y) {
            AbstractC6378lg abstractC6378lg9 = this.f42514n;
            if (abstractC6378lg9 == null) {
                this.f42514n = new C7901Lh1(es1, Float.valueOf(100.0f));
                return true;
            }
            abstractC6378lg9.m22530j(es1);
            return true;
        }
        if (colorFilter == InterfaceC10947rm0.f41880l) {
            if (this.f42511k == null) {
                this.f42511k = new C6494nW(Collections.singletonList(new C10551og0(Float.valueOf(0.0f))));
            }
            this.f42511k.m22530j(es1);
            return true;
        }
        if (colorFilter != InterfaceC10947rm0.f41881m) {
            return false;
        }
        if (this.f42512l == null) {
            this.f42512l = new C6494nW(Collections.singletonList(new C10551og0(Float.valueOf(0.0f))));
        }
        this.f42512l.m22530j(es1);
        return true;
    }

    /* renamed from: d */
    public final void m24753d() {
        for (int i = 0; i < 9; i++) {
            this.f42505e[i] = 0.0f;
        }
    }

    /* renamed from: e */
    public final Matrix m24754e() {
        PointF pointF;
        C11169tV0 c11169tV0;
        PointF pointF2;
        Matrix matrix = this.f42501a;
        matrix.reset();
        AbstractC6378lg abstractC6378lg = this.f42507g;
        if (abstractC6378lg != null && (pointF2 = (PointF) abstractC6378lg.mo5063e()) != null) {
            float f = pointF2.x;
            if (f != 0.0f || pointF2.y != 0.0f) {
                matrix.preTranslate(f, pointF2.y);
            }
        }
        if (!this.f42515o) {
            AbstractC6378lg abstractC6378lg2 = this.f42509i;
            if (abstractC6378lg2 != null) {
                float fFloatValue = abstractC6378lg2 instanceof C7901Lh1 ? ((Float) abstractC6378lg2.mo5063e()).floatValue() : ((C6494nW) abstractC6378lg2).m23152k();
                if (fFloatValue != 0.0f) {
                    matrix.preRotate(fFloatValue);
                }
            }
        } else if (abstractC6378lg != null) {
            float f2 = abstractC6378lg.f37231d;
            PointF pointF3 = (PointF) abstractC6378lg.mo5063e();
            float f3 = pointF3.x;
            float f4 = pointF3.y;
            abstractC6378lg.mo5065i(1.0E-4f + f2);
            PointF pointF4 = (PointF) abstractC6378lg.mo5063e();
            abstractC6378lg.mo5065i(f2);
            matrix.preRotate((float) Math.toDegrees(Math.atan2(pointF4.y - f4, pointF4.x - f3)));
        }
        if (this.f42511k != null) {
            float fCos = this.f42512l == null ? 0.0f : (float) Math.cos(Math.toRadians((-r4.m23152k()) + 90.0f));
            float fSin = this.f42512l == null ? 1.0f : (float) Math.sin(Math.toRadians((-r6.m23152k()) + 90.0f));
            float fTan = (float) Math.tan(Math.toRadians(r1.m23152k()));
            m24753d();
            float[] fArr = this.f42505e;
            fArr[0] = fCos;
            fArr[1] = fSin;
            float f5 = -fSin;
            fArr[3] = f5;
            fArr[4] = fCos;
            fArr[8] = 1.0f;
            Matrix matrix2 = this.f42502b;
            matrix2.setValues(fArr);
            m24753d();
            fArr[0] = 1.0f;
            fArr[3] = fTan;
            fArr[4] = 1.0f;
            fArr[8] = 1.0f;
            Matrix matrix3 = this.f42503c;
            matrix3.setValues(fArr);
            m24753d();
            fArr[0] = fCos;
            fArr[1] = f5;
            fArr[3] = fSin;
            fArr[4] = fCos;
            fArr[8] = 1.0f;
            Matrix matrix4 = this.f42504d;
            matrix4.setValues(fArr);
            matrix3.preConcat(matrix2);
            matrix4.preConcat(matrix3);
            matrix.preConcat(matrix4);
        }
        AbstractC6378lg abstractC6378lg3 = this.f42508h;
        if (abstractC6378lg3 != null && (c11169tV0 = (C11169tV0) abstractC6378lg3.mo5063e()) != null) {
            float f6 = c11169tV0.f43097a;
            if (f6 != 1.0f || c11169tV0.f43098b != 1.0f) {
                matrix.preScale(f6, c11169tV0.f43098b);
            }
        }
        AbstractC6378lg abstractC6378lg4 = this.f42506f;
        if (abstractC6378lg4 != null && (pointF = (PointF) abstractC6378lg4.mo5063e()) != null) {
            float f7 = pointF.x;
            if (f7 != 0.0f || pointF.y != 0.0f) {
                matrix.preTranslate(-f7, -pointF.y);
            }
        }
        return matrix;
    }

    /* renamed from: f */
    public final Matrix m24755f(float f) {
        AbstractC6378lg abstractC6378lg = this.f42507g;
        PointF pointF = abstractC6378lg == null ? null : (PointF) abstractC6378lg.mo5063e();
        AbstractC6378lg abstractC6378lg2 = this.f42508h;
        C11169tV0 c11169tV0 = abstractC6378lg2 == null ? null : (C11169tV0) abstractC6378lg2.mo5063e();
        Matrix matrix = this.f42501a;
        matrix.reset();
        if (pointF != null) {
            matrix.preTranslate(pointF.x * f, pointF.y * f);
        }
        if (c11169tV0 != null) {
            double d = f;
            matrix.preScale((float) Math.pow(c11169tV0.f43097a, d), (float) Math.pow(c11169tV0.f43098b, d));
        }
        AbstractC6378lg abstractC6378lg3 = this.f42509i;
        if (abstractC6378lg3 != null) {
            float fFloatValue = ((Float) abstractC6378lg3.mo5063e()).floatValue();
            AbstractC6378lg abstractC6378lg4 = this.f42506f;
            PointF pointF2 = abstractC6378lg4 != null ? (PointF) abstractC6378lg4.mo5063e() : null;
            matrix.preRotate(fFloatValue * f, pointF2 == null ? 0.0f : pointF2.x, pointF2 != null ? pointF2.y : 0.0f);
        }
        return matrix;
    }
}
