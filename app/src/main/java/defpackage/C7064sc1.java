package defpackage;

import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.PointF;
import java.util.Collections;

/* renamed from: sc1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C7064sc1 {
    public final Matrix a = new Matrix();
    public final Matrix b;
    public final Matrix c;
    public final Matrix d;
    public final float[] e;
    public AbstractC5738lg f;
    public AbstractC5738lg g;
    public AbstractC5738lg h;
    public AbstractC5738lg i;
    public AbstractC5738lg j;
    public C6090nW k;
    public C6090nW l;
    public AbstractC5738lg m;
    public AbstractC5738lg n;
    public final boolean o;

    public C7064sc1(P4 p4) {
        C1016Mu0 c1016Mu0 = p4.a;
        this.f = c1016Mu0 == null ? null : c1016Mu0.M0();
        R4 r4 = p4.b;
        this.g = r4 == null ? null : r4.M0();
        K4 k4 = p4.c;
        this.h = k4 == null ? null : k4.M0();
        L4 l4 = p4.d;
        this.i = l4 == null ? null : l4.M0();
        L4 l42 = p4.f;
        C6090nW c6090nWM0 = l42 == null ? null : l42.M0();
        this.k = c6090nWM0;
        this.o = p4.j;
        if (c6090nWM0 != null) {
            this.b = new Matrix();
            this.c = new Matrix();
            this.d = new Matrix();
            this.e = new float[9];
        } else {
            this.b = null;
            this.c = null;
            this.d = null;
            this.e = null;
        }
        L4 l43 = p4.g;
        this.l = l43 == null ? null : l43.M0();
        K4 k42 = p4.e;
        if (k42 != null) {
            this.j = k42.M0();
        }
        L4 l44 = p4.h;
        if (l44 != null) {
            this.m = l44.M0();
        } else {
            this.m = null;
        }
        L4 l45 = p4.i;
        if (l45 != null) {
            this.n = l45.M0();
        } else {
            this.n = null;
        }
    }

    public final void a(AbstractC6120ng abstractC6120ng) {
        abstractC6120ng.e(this.j);
        abstractC6120ng.e(this.m);
        abstractC6120ng.e(this.n);
        abstractC6120ng.e(this.f);
        abstractC6120ng.e(this.g);
        abstractC6120ng.e(this.h);
        abstractC6120ng.e(this.i);
        abstractC6120ng.e(this.k);
        abstractC6120ng.e(this.l);
    }

    public final void b(InterfaceC4198hg interfaceC4198hg) {
        AbstractC5738lg abstractC5738lg = this.j;
        if (abstractC5738lg != null) {
            abstractC5738lg.a(interfaceC4198hg);
        }
        AbstractC5738lg abstractC5738lg2 = this.m;
        if (abstractC5738lg2 != null) {
            abstractC5738lg2.a(interfaceC4198hg);
        }
        AbstractC5738lg abstractC5738lg3 = this.n;
        if (abstractC5738lg3 != null) {
            abstractC5738lg3.a(interfaceC4198hg);
        }
        AbstractC5738lg abstractC5738lg4 = this.f;
        if (abstractC5738lg4 != null) {
            abstractC5738lg4.a(interfaceC4198hg);
        }
        AbstractC5738lg abstractC5738lg5 = this.g;
        if (abstractC5738lg5 != null) {
            abstractC5738lg5.a(interfaceC4198hg);
        }
        AbstractC5738lg abstractC5738lg6 = this.h;
        if (abstractC5738lg6 != null) {
            abstractC5738lg6.a(interfaceC4198hg);
        }
        AbstractC5738lg abstractC5738lg7 = this.i;
        if (abstractC5738lg7 != null) {
            abstractC5738lg7.a(interfaceC4198hg);
        }
        C6090nW c6090nW = this.k;
        if (c6090nW != null) {
            c6090nW.a(interfaceC4198hg);
        }
        C6090nW c6090nW2 = this.l;
        if (c6090nW2 != null) {
            c6090nW2.a(interfaceC4198hg);
        }
    }

    public final boolean c(ColorFilter colorFilter, ES1 es1) {
        if (colorFilter == InterfaceC6902rm0.a) {
            AbstractC5738lg abstractC5738lg = this.f;
            if (abstractC5738lg == null) {
                this.f = new C0901Lh1(es1, new PointF());
                return true;
            }
            abstractC5738lg.j(es1);
            return true;
        }
        if (colorFilter == InterfaceC6902rm0.b) {
            AbstractC5738lg abstractC5738lg2 = this.g;
            if (abstractC5738lg2 == null) {
                this.g = new C0901Lh1(es1, new PointF());
                return true;
            }
            abstractC5738lg2.j(es1);
            return true;
        }
        if (colorFilter == InterfaceC6902rm0.c) {
            AbstractC5738lg abstractC5738lg3 = this.g;
            if (abstractC5738lg3 instanceof C7722w31) {
                C7722w31 c7722w31 = (C7722w31) abstractC5738lg3;
                ES1 es12 = c7722w31.m;
                c7722w31.m = es1;
                return true;
            }
        }
        if (colorFilter == InterfaceC6902rm0.d) {
            AbstractC5738lg abstractC5738lg4 = this.g;
            if (abstractC5738lg4 instanceof C7722w31) {
                C7722w31 c7722w312 = (C7722w31) abstractC5738lg4;
                ES1 es13 = c7722w312.n;
                c7722w312.n = es1;
                return true;
            }
        }
        if (colorFilter == InterfaceC6902rm0.j) {
            AbstractC5738lg abstractC5738lg5 = this.h;
            if (abstractC5738lg5 == null) {
                this.h = new C0901Lh1(es1, new C7233tV0());
                return true;
            }
            abstractC5738lg5.j(es1);
            return true;
        }
        if (colorFilter == InterfaceC6902rm0.k) {
            AbstractC5738lg abstractC5738lg6 = this.i;
            if (abstractC5738lg6 == null) {
                this.i = new C0901Lh1(es1, Float.valueOf(0.0f));
                return true;
            }
            abstractC5738lg6.j(es1);
            return true;
        }
        if (colorFilter == 3) {
            AbstractC5738lg abstractC5738lg7 = this.j;
            if (abstractC5738lg7 == null) {
                this.j = new C0901Lh1(es1, 100);
                return true;
            }
            abstractC5738lg7.j(es1);
            return true;
        }
        if (colorFilter == InterfaceC6902rm0.x) {
            AbstractC5738lg abstractC5738lg8 = this.m;
            if (abstractC5738lg8 == null) {
                this.m = new C0901Lh1(es1, Float.valueOf(100.0f));
                return true;
            }
            abstractC5738lg8.j(es1);
            return true;
        }
        if (colorFilter == InterfaceC6902rm0.y) {
            AbstractC5738lg abstractC5738lg9 = this.n;
            if (abstractC5738lg9 == null) {
                this.n = new C0901Lh1(es1, Float.valueOf(100.0f));
                return true;
            }
            abstractC5738lg9.j(es1);
            return true;
        }
        if (colorFilter == InterfaceC6902rm0.l) {
            if (this.k == null) {
                this.k = new C6090nW(Collections.singletonList(new C6312og0(Float.valueOf(0.0f))));
            }
            this.k.j(es1);
            return true;
        }
        if (colorFilter != InterfaceC6902rm0.m) {
            return false;
        }
        if (this.l == null) {
            this.l = new C6090nW(Collections.singletonList(new C6312og0(Float.valueOf(0.0f))));
        }
        this.l.j(es1);
        return true;
    }

    public final void d() {
        for (int i = 0; i < 9; i++) {
            this.e[i] = 0.0f;
        }
    }

    public final Matrix e() {
        PointF pointF;
        C7233tV0 c7233tV0;
        PointF pointF2;
        Matrix matrix = this.a;
        matrix.reset();
        AbstractC5738lg abstractC5738lg = this.g;
        if (abstractC5738lg != null && (pointF2 = (PointF) abstractC5738lg.e()) != null) {
            float f = pointF2.x;
            if (f != 0.0f || pointF2.y != 0.0f) {
                matrix.preTranslate(f, pointF2.y);
            }
        }
        if (!this.o) {
            AbstractC5738lg abstractC5738lg2 = this.i;
            if (abstractC5738lg2 != null) {
                float fFloatValue = abstractC5738lg2 instanceof C0901Lh1 ? ((Float) abstractC5738lg2.e()).floatValue() : ((C6090nW) abstractC5738lg2).k();
                if (fFloatValue != 0.0f) {
                    matrix.preRotate(fFloatValue);
                }
            }
        } else if (abstractC5738lg != null) {
            float f2 = abstractC5738lg.d;
            PointF pointF3 = (PointF) abstractC5738lg.e();
            float f3 = pointF3.x;
            float f4 = pointF3.y;
            abstractC5738lg.i(1.0E-4f + f2);
            PointF pointF4 = (PointF) abstractC5738lg.e();
            abstractC5738lg.i(f2);
            matrix.preRotate((float) Math.toDegrees(Math.atan2(pointF4.y - f4, pointF4.x - f3)));
        }
        if (this.k != null) {
            float fCos = this.l == null ? 0.0f : (float) Math.cos(Math.toRadians((-r4.k()) + 90.0f));
            float fSin = this.l == null ? 1.0f : (float) Math.sin(Math.toRadians((-r6.k()) + 90.0f));
            float fTan = (float) Math.tan(Math.toRadians(r1.k()));
            d();
            float[] fArr = this.e;
            fArr[0] = fCos;
            fArr[1] = fSin;
            float f5 = -fSin;
            fArr[3] = f5;
            fArr[4] = fCos;
            fArr[8] = 1.0f;
            Matrix matrix2 = this.b;
            matrix2.setValues(fArr);
            d();
            fArr[0] = 1.0f;
            fArr[3] = fTan;
            fArr[4] = 1.0f;
            fArr[8] = 1.0f;
            Matrix matrix3 = this.c;
            matrix3.setValues(fArr);
            d();
            fArr[0] = fCos;
            fArr[1] = f5;
            fArr[3] = fSin;
            fArr[4] = fCos;
            fArr[8] = 1.0f;
            Matrix matrix4 = this.d;
            matrix4.setValues(fArr);
            matrix3.preConcat(matrix2);
            matrix4.preConcat(matrix3);
            matrix.preConcat(matrix4);
        }
        AbstractC5738lg abstractC5738lg3 = this.h;
        if (abstractC5738lg3 != null && (c7233tV0 = (C7233tV0) abstractC5738lg3.e()) != null) {
            float f6 = c7233tV0.a;
            if (f6 != 1.0f || c7233tV0.b != 1.0f) {
                matrix.preScale(f6, c7233tV0.b);
            }
        }
        AbstractC5738lg abstractC5738lg4 = this.f;
        if (abstractC5738lg4 != null && (pointF = (PointF) abstractC5738lg4.e()) != null) {
            float f7 = pointF.x;
            if (f7 != 0.0f || pointF.y != 0.0f) {
                matrix.preTranslate(-f7, -pointF.y);
            }
        }
        return matrix;
    }

    public final Matrix f(float f) {
        AbstractC5738lg abstractC5738lg = this.g;
        PointF pointF = abstractC5738lg == null ? null : (PointF) abstractC5738lg.e();
        AbstractC5738lg abstractC5738lg2 = this.h;
        C7233tV0 c7233tV0 = abstractC5738lg2 == null ? null : (C7233tV0) abstractC5738lg2.e();
        Matrix matrix = this.a;
        matrix.reset();
        if (pointF != null) {
            matrix.preTranslate(pointF.x * f, pointF.y * f);
        }
        if (c7233tV0 != null) {
            double d = f;
            matrix.preScale((float) Math.pow(c7233tV0.a, d), (float) Math.pow(c7233tV0.b, d));
        }
        AbstractC5738lg abstractC5738lg3 = this.i;
        if (abstractC5738lg3 != null) {
            float fFloatValue = ((Float) abstractC5738lg3.e()).floatValue();
            AbstractC5738lg abstractC5738lg4 = this.f;
            PointF pointF2 = abstractC5738lg4 != null ? (PointF) abstractC5738lg4.e() : null;
            matrix.preRotate(fFloatValue * f, pointF2 == null ? 0.0f : pointF2.x, pointF2 != null ? pointF2.y : 0.0f);
        }
        return matrix;
    }
}
