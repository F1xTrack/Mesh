package defpackage;

import android.graphics.ColorFilter;
import android.graphics.Path;
import android.graphics.PathMeasure;
import android.graphics.PointF;
import com.yandex.varioqub.config.model.ConfigValue;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public final class ZB0 implements InterfaceC6407pA0, InterfaceC4198hg, InterfaceC1127Of0 {
    public final String e;
    public final C5948mm0 f;
    public final int g;
    public final boolean h;
    public final boolean i;
    public final C6090nW j;
    public final AbstractC5738lg k;
    public final C6090nW l;
    public final C6090nW m;
    public final C6090nW n;
    public final C6090nW o;
    public final C6090nW p;
    public boolean r;
    public final Path a = new Path();
    public final Path b = new Path();
    public final PathMeasure c = new PathMeasure();
    public final float[] d = new float[2];
    public final C0481Fx1 q = new C0481Fx1(9);

    public ZB0(C5948mm0 c5948mm0, AbstractC6120ng abstractC6120ng, C2089aC0 c2089aC0) {
        this.f = c5948mm0;
        this.e = c2089aC0.a;
        int i = c2089aC0.b;
        this.g = i;
        this.h = c2089aC0.j;
        this.i = c2089aC0.k;
        C6090nW c6090nWM0 = c2089aC0.c.M0();
        this.j = c6090nWM0;
        AbstractC5738lg abstractC5738lgM0 = c2089aC0.d.M0();
        this.k = abstractC5738lgM0;
        C6090nW c6090nWM02 = c2089aC0.e.M0();
        this.l = c6090nWM02;
        C6090nW c6090nWM03 = c2089aC0.g.M0();
        this.n = c6090nWM03;
        C6090nW c6090nWM04 = c2089aC0.i.M0();
        this.p = c6090nWM04;
        if (i == 1) {
            this.m = c2089aC0.f.M0();
            this.o = c2089aC0.h.M0();
        } else {
            this.m = null;
            this.o = null;
        }
        abstractC6120ng.e(c6090nWM0);
        abstractC6120ng.e(abstractC5738lgM0);
        abstractC6120ng.e(c6090nWM02);
        abstractC6120ng.e(c6090nWM03);
        abstractC6120ng.e(c6090nWM04);
        if (i == 1) {
            abstractC6120ng.e(this.m);
            abstractC6120ng.e(this.o);
        }
        c6090nWM0.a(this);
        abstractC5738lgM0.a(this);
        c6090nWM02.a(this);
        c6090nWM03.a(this);
        c6090nWM04.a(this);
        if (i == 1) {
            this.m.a(this);
            this.o.a(this);
        }
    }

    @Override // defpackage.InterfaceC4198hg
    public final void a() {
        this.r = false;
        this.f.invalidateSelf();
    }

    @Override // defpackage.InterfaceC6937ry
    public final void b(List list, List list2) {
        int i = 0;
        while (true) {
            ArrayList arrayList = (ArrayList) list;
            if (i >= arrayList.size()) {
                return;
            }
            InterfaceC6937ry interfaceC6937ry = (InterfaceC6937ry) arrayList.get(i);
            if (interfaceC6937ry instanceof C3428dd1) {
                C3428dd1 c3428dd1 = (C3428dd1) interfaceC6937ry;
                if (c3428dd1.c == 1) {
                    ((ArrayList) this.q.a).add(c3428dd1);
                    c3428dd1.c(this);
                }
            }
            i++;
        }
    }

    @Override // defpackage.InterfaceC1049Nf0
    public final void c(C0971Mf0 c0971Mf0, int i, ArrayList arrayList, C0971Mf0 c0971Mf02) {
        AbstractC2215as0.f(c0971Mf0, i, arrayList, c0971Mf02, this);
    }

    @Override // defpackage.InterfaceC6407pA0
    public final Path g() {
        double d;
        float fCos;
        float fSin;
        float f;
        float f2;
        float f3;
        float f4;
        float f5;
        float f6;
        float f7;
        float f8;
        float f9;
        float f10;
        int i;
        double d2;
        float f11;
        boolean z = this.r;
        Path path = this.a;
        if (z) {
            return path;
        }
        path.reset();
        if (this.h) {
            this.r = true;
            return path;
        }
        int iX = AbstractC8235ym.x(this.g);
        AbstractC5738lg abstractC5738lg = this.k;
        C6090nW c6090nW = this.n;
        C6090nW c6090nW2 = this.p;
        double dFloatValue = ConfigValue.DOUBLE_DEFAULT_VALUE;
        C6090nW c6090nW3 = this.l;
        C6090nW c6090nW4 = this.j;
        if (iX == 0) {
            float fFloatValue = ((Float) c6090nW4.e()).floatValue();
            if (c6090nW3 != null) {
                dFloatValue = ((Float) c6090nW3.e()).floatValue();
            }
            double radians = Math.toRadians(dFloatValue - 90.0d);
            double d3 = fFloatValue;
            float f12 = (float) (6.283185307179586d / d3);
            if (this.i) {
                f12 *= -1.0f;
            }
            float f13 = f12;
            float f14 = 2.0f;
            float f15 = f13 / 2.0f;
            float f16 = fFloatValue - ((int) fFloatValue);
            if (f16 != 0.0f) {
                radians += (1.0f - f16) * f15;
            }
            float fFloatValue2 = ((Float) c6090nW.e()).floatValue();
            float fFloatValue3 = ((Float) this.m.e()).floatValue();
            C6090nW c6090nW5 = this.o;
            float fFloatValue4 = c6090nW5 != null ? ((Float) c6090nW5.e()).floatValue() / 100.0f : 0.0f;
            float fFloatValue5 = c6090nW2 != null ? ((Float) c6090nW2.e()).floatValue() / 100.0f : 0.0f;
            if (f16 != 0.0f) {
                float fD = AbstractC1705Vq.d(fFloatValue2, fFloatValue3, f16, fFloatValue3);
                double d4 = fD;
                f = fD;
                fCos = (float) (Math.cos(radians) * d4);
                fSin = (float) (Math.sin(radians) * d4);
                path.moveTo(fCos, fSin);
                d = radians + ((f13 * f16) / 2.0f);
            } else {
                double d5 = fFloatValue2;
                float fCos2 = (float) (Math.cos(radians) * d5);
                float fSin2 = (float) (d5 * Math.sin(radians));
                path.moveTo(fCos2, fSin2);
                d = radians + f15;
                fCos = fCos2;
                fSin = fSin2;
                f = 0.0f;
            }
            double dCeil = Math.ceil(d3);
            double d6 = 2.0d;
            double d7 = dCeil * 2.0d;
            double d8 = d;
            int i2 = 0;
            boolean z2 = false;
            while (true) {
                double d9 = i2;
                if (d9 >= d7) {
                    break;
                }
                float f17 = z2 ? fFloatValue2 : fFloatValue3;
                float f18 = (f == 0.0f || d9 != d7 - d6) ? f15 : (f13 * f16) / f14;
                if (f == 0.0f || d9 != d7 - 1.0d) {
                    f2 = fFloatValue3;
                    f3 = fFloatValue2;
                } else {
                    f2 = fFloatValue3;
                    f3 = fFloatValue2;
                    f17 = f;
                }
                double d10 = f17;
                float f19 = f3;
                float f20 = f13;
                float fCos3 = (float) (Math.cos(d8) * d10);
                float fSin3 = (float) (d10 * Math.sin(d8));
                if (fFloatValue4 == 0.0f && fFloatValue5 == 0.0f) {
                    path.lineTo(fCos3, fSin3);
                    f4 = f20;
                    f5 = fSin3;
                    f6 = f2;
                    f7 = f19;
                    f8 = f15;
                    f10 = f18;
                    f9 = f16;
                } else {
                    f4 = f20;
                    float f21 = f18;
                    double dAtan2 = (float) (Math.atan2(fSin, fCos) - 1.5707963267948966d);
                    float fCos4 = (float) Math.cos(dAtan2);
                    float fSin4 = (float) Math.sin(dAtan2);
                    float f22 = f15;
                    f5 = fSin3;
                    double dAtan22 = (float) (Math.atan2(fSin3, fCos3) - 1.5707963267948966d);
                    float fCos5 = (float) Math.cos(dAtan22);
                    float fSin5 = (float) Math.sin(dAtan22);
                    float f23 = z2 ? fFloatValue4 : fFloatValue5;
                    float f24 = z2 ? fFloatValue5 : fFloatValue4;
                    float f25 = (z2 ? f2 : f19) * f23 * 0.47829f;
                    float f26 = fCos4 * f25;
                    float f27 = f25 * fSin4;
                    float f28 = (z2 ? f19 : f2) * f24 * 0.47829f;
                    float f29 = fCos5 * f28;
                    float f30 = f28 * fSin5;
                    if (f16 == 0.0f) {
                        f6 = f2;
                        f7 = f19;
                        f8 = f22;
                        f9 = f16;
                        path.cubicTo(fCos - f26, fSin - f27, fCos3 + f29, f5 + f30, fCos3, f5);
                        f10 = f21;
                    } else if (i2 == 0) {
                        f26 *= f16;
                        f27 *= f16;
                        f6 = f2;
                        f7 = f19;
                        f8 = f22;
                        f9 = f16;
                        path.cubicTo(fCos - f26, fSin - f27, fCos3 + f29, f5 + f30, fCos3, f5);
                        f10 = f21;
                    } else {
                        if (d9 == d7 - 1.0d) {
                            f29 *= f16;
                            f30 *= f16;
                        }
                        f6 = f2;
                        f7 = f19;
                        f8 = f22;
                        f9 = f16;
                        path.cubicTo(fCos - f26, fSin - f27, fCos3 + f29, f5 + f30, fCos3, f5);
                        f10 = f21;
                    }
                }
                d8 += f10;
                z2 = !z2;
                i2++;
                fFloatValue3 = f6;
                fFloatValue2 = f7;
                f16 = f9;
                fCos = fCos3;
                f15 = f8;
                f13 = f4;
                fSin = f5;
                d6 = 2.0d;
                f14 = 2.0f;
            }
            PointF pointF = (PointF) abstractC5738lg.e();
            path.offset(pointF.x, pointF.y);
            path.close();
        } else if (iX == 1) {
            int iFloor = (int) Math.floor(((Float) c6090nW4.e()).floatValue());
            if (c6090nW3 != null) {
                dFloatValue = ((Float) c6090nW3.e()).floatValue();
            }
            double radians2 = Math.toRadians(dFloatValue - 90.0d);
            double d11 = iFloor;
            float fFloatValue6 = ((Float) c6090nW2.e()).floatValue() / 100.0f;
            float fFloatValue7 = ((Float) c6090nW.e()).floatValue();
            double d12 = fFloatValue7;
            float fCos6 = (float) (Math.cos(radians2) * d12);
            float fSin6 = (float) (Math.sin(radians2) * d12);
            path.moveTo(fCos6, fSin6);
            double d13 = (float) (6.283185307179586d / d11);
            double dCeil2 = Math.ceil(d11);
            double d14 = radians2 + d13;
            int i3 = 0;
            while (true) {
                double d15 = i3;
                if (d15 >= dCeil2) {
                    break;
                }
                float fCos7 = (float) (Math.cos(d14) * d12);
                double d16 = d13;
                float fSin7 = (float) (Math.sin(d14) * d12);
                if (fFloatValue6 != 0.0f) {
                    d2 = d12;
                    double dAtan23 = (float) (Math.atan2(fSin6, fCos6) - 1.5707963267948966d);
                    float fCos8 = (float) Math.cos(dAtan23);
                    float fSin8 = (float) Math.sin(dAtan23);
                    i = i3;
                    float f31 = fCos6;
                    double dAtan24 = (float) (Math.atan2(fSin7, fCos7) - 1.5707963267948966d);
                    float f32 = fFloatValue7 * fFloatValue6 * 0.25f;
                    float f33 = fCos8 * f32;
                    float f34 = fSin8 * f32;
                    float fCos9 = ((float) Math.cos(dAtan24)) * f32;
                    float fSin9 = f32 * ((float) Math.sin(dAtan24));
                    if (d15 == dCeil2 - 1.0d) {
                        Path path2 = this.b;
                        path2.reset();
                        path2.moveTo(f31, fSin6);
                        float f35 = f31 - f33;
                        float f36 = fSin6 - f34;
                        float f37 = fCos9 + fCos7;
                        float f38 = fSin7 + fSin9;
                        path2.cubicTo(f35, f36, f37, f38, fCos7, fSin7);
                        PathMeasure pathMeasure = this.c;
                        pathMeasure.setPath(path2, false);
                        float length = pathMeasure.getLength() * 0.9999f;
                        f11 = fFloatValue7;
                        float[] fArr = this.d;
                        pathMeasure.getPosTan(length, fArr, null);
                        path.cubicTo(f35, f36, f37, f38, fArr[0], fArr[1]);
                    } else {
                        f11 = fFloatValue7;
                        path.cubicTo(f31 - f33, fSin6 - f34, fCos7 + fCos9, fSin7 + fSin9, fCos7, fSin7);
                    }
                } else {
                    i = i3;
                    d2 = d12;
                    f11 = fFloatValue7;
                    if (d15 == dCeil2 - 1.0d) {
                        i3 = i + 1;
                        fCos6 = fCos7;
                        fSin6 = fSin7;
                        fFloatValue7 = f11;
                        d12 = d2;
                        d13 = d16;
                    } else {
                        path.lineTo(fCos7, fSin7);
                    }
                }
                d14 += d16;
                i3 = i + 1;
                fCos6 = fCos7;
                fSin6 = fSin7;
                fFloatValue7 = f11;
                d12 = d2;
                d13 = d16;
            }
            PointF pointF2 = (PointF) abstractC5738lg.e();
            path.offset(pointF2.x, pointF2.y);
            path.close();
        }
        path.close();
        this.q.f(path);
        this.r = true;
        return path;
    }

    @Override // defpackage.InterfaceC6937ry
    public final String getName() {
        return this.e;
    }

    @Override // defpackage.InterfaceC1049Nf0
    public final void h(ColorFilter colorFilter, ES1 es1) {
        C6090nW c6090nW;
        C6090nW c6090nW2;
        if (colorFilter == InterfaceC6902rm0.r) {
            this.j.j(es1);
            return;
        }
        if (colorFilter == InterfaceC6902rm0.s) {
            this.l.j(es1);
            return;
        }
        if (colorFilter == InterfaceC6902rm0.i) {
            this.k.j(es1);
            return;
        }
        if (colorFilter == InterfaceC6902rm0.t && (c6090nW2 = this.m) != null) {
            c6090nW2.j(es1);
            return;
        }
        if (colorFilter == InterfaceC6902rm0.u) {
            this.n.j(es1);
            return;
        }
        if (colorFilter == InterfaceC6902rm0.v && (c6090nW = this.o) != null) {
            c6090nW.j(es1);
        } else if (colorFilter == InterfaceC6902rm0.w) {
            this.p.j(es1);
        }
    }
}
