package p000;

import android.graphics.ColorFilter;
import android.graphics.Path;
import android.graphics.PathMeasure;
import android.graphics.PointF;
import com.yandex.varioqub.config.model.ConfigValue;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public final class ZB0 implements InterfaceC10615pA0, InterfaceC4194hg, InterfaceC8052Of0 {

    /* renamed from: e */
    public final String f14776e;

    /* renamed from: f */
    public final C10307mm0 f14777f;

    /* renamed from: g */
    public final int f14778g;

    /* renamed from: h */
    public final boolean f14779h;

    /* renamed from: i */
    public final boolean f14780i;

    /* renamed from: j */
    public final C6494nW f14781j;

    /* renamed from: k */
    public final AbstractC6378lg f14782k;

    /* renamed from: l */
    public final C6494nW f14783l;

    /* renamed from: m */
    public final C6494nW f14784m;

    /* renamed from: n */
    public final C6494nW f14785n;

    /* renamed from: o */
    public final C6494nW f14786o;

    /* renamed from: p */
    public final C6494nW f14787p;

    /* renamed from: r */
    public boolean f14789r;

    /* renamed from: a */
    public final Path f14772a = new Path();

    /* renamed from: b */
    public final Path f14773b = new Path();

    /* renamed from: c */
    public final PathMeasure f14774c = new PathMeasure();

    /* renamed from: d */
    public final float[] f14775d = new float[2];

    /* renamed from: q */
    public final C7621Fx1 f14788q = new C7621Fx1(9);

    public ZB0(C10307mm0 c10307mm0, AbstractC6504ng abstractC6504ng, C8694aC0 c8694aC0) {
        this.f14777f = c10307mm0;
        this.f14776e = c8694aC0.f15381a;
        int i = c8694aC0.f15382b;
        this.f14778g = i;
        this.f14779h = c8694aC0.f15390j;
        this.f14780i = c8694aC0.f15391k;
        C6494nW c6494nWMo4553M0 = c8694aC0.f15383c.mo4553M0();
        this.f14781j = c6494nWMo4553M0;
        AbstractC6378lg abstractC6378lgMo4553M0 = c8694aC0.f15384d.mo4553M0();
        this.f14782k = abstractC6378lgMo4553M0;
        C6494nW c6494nWMo4553M02 = c8694aC0.f15385e.mo4553M0();
        this.f14783l = c6494nWMo4553M02;
        C6494nW c6494nWMo4553M03 = c8694aC0.f15387g.mo4553M0();
        this.f14785n = c6494nWMo4553M03;
        C6494nW c6494nWMo4553M04 = c8694aC0.f15389i.mo4553M0();
        this.f14787p = c6494nWMo4553M04;
        if (i == 1) {
            this.f14784m = c8694aC0.f15386f.mo4553M0();
            this.f14786o = c8694aC0.f15388h.mo4553M0();
        } else {
            this.f14784m = null;
            this.f14786o = null;
        }
        abstractC6504ng.m23162e(c6494nWMo4553M0);
        abstractC6504ng.m23162e(abstractC6378lgMo4553M0);
        abstractC6504ng.m23162e(c6494nWMo4553M02);
        abstractC6504ng.m23162e(c6494nWMo4553M03);
        abstractC6504ng.m23162e(c6494nWMo4553M04);
        if (i == 1) {
            abstractC6504ng.m23162e(this.f14784m);
            abstractC6504ng.m23162e(this.f14786o);
        }
        c6494nWMo4553M0.m22527a(this);
        abstractC6378lgMo4553M0.m22527a(this);
        c6494nWMo4553M02.m22527a(this);
        c6494nWMo4553M03.m22527a(this);
        c6494nWMo4553M04.m22527a(this);
        if (i == 1) {
            this.f14784m.m22527a(this);
            this.f14786o.m22527a(this);
        }
    }

    @Override // p000.InterfaceC4194hg
    /* renamed from: a */
    public final void mo1741a() {
        this.f14789r = false;
        this.f14777f.invalidateSelf();
    }

    @Override // p000.InterfaceC6793ry
    /* renamed from: b */
    public final void mo1742b(List list, List list2) {
        int i = 0;
        while (true) {
            ArrayList arrayList = (ArrayList) list;
            if (i >= arrayList.size()) {
                return;
            }
            InterfaceC6793ry interfaceC6793ry = (InterfaceC6793ry) arrayList.get(i);
            if (interfaceC6793ry instanceof C9138dd1) {
                C9138dd1 c9138dd1 = (C9138dd1) interfaceC6793ry;
                if (c9138dd1.f26172c == 1) {
                    ((ArrayList) this.f14788q.f3494a).add(c9138dd1);
                    c9138dd1.m17719c(this);
                }
            }
            i++;
        }
    }

    @Override // p000.InterfaceC8000Nf0
    /* renamed from: c */
    public final void mo1743c(C7948Mf0 c7948Mf0, int i, ArrayList arrayList, C7948Mf0 c7948Mf02) {
        AbstractC8778as0.m10354f(c7948Mf0, i, arrayList, c7948Mf02, this);
    }

    @Override // p000.InterfaceC10615pA0
    /* renamed from: g */
    public final Path mo5778g() {
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
        boolean z = this.f14789r;
        Path path = this.f14772a;
        if (z) {
            return path;
        }
        path.reset();
        if (this.f14779h) {
            this.f14789r = true;
            return path;
        }
        int iM26247x = AbstractC7222ym.m26247x(this.f14778g);
        AbstractC6378lg abstractC6378lg = this.f14782k;
        C6494nW c6494nW = this.f14785n;
        C6494nW c6494nW2 = this.f14787p;
        double dFloatValue = ConfigValue.DOUBLE_DEFAULT_VALUE;
        C6494nW c6494nW3 = this.f14783l;
        C6494nW c6494nW4 = this.f14781j;
        if (iM26247x == 0) {
            float fFloatValue = ((Float) c6494nW4.mo5063e()).floatValue();
            if (c6494nW3 != null) {
                dFloatValue = ((Float) c6494nW3.mo5063e()).floatValue();
            }
            double radians = Math.toRadians(dFloatValue - 90.0d);
            double d3 = fFloatValue;
            float f12 = (float) (6.283185307179586d / d3);
            if (this.f14780i) {
                f12 *= -1.0f;
            }
            float f13 = f12;
            float f14 = 2.0f;
            float f15 = f13 / 2.0f;
            float f16 = fFloatValue - ((int) fFloatValue);
            if (f16 != 0.0f) {
                radians += (1.0f - f16) * f15;
            }
            float fFloatValue2 = ((Float) c6494nW.mo5063e()).floatValue();
            float fFloatValue3 = ((Float) this.f14784m.mo5063e()).floatValue();
            C6494nW c6494nW5 = this.f14786o;
            float fFloatValue4 = c6494nW5 != null ? ((Float) c6494nW5.mo5063e()).floatValue() / 100.0f : 0.0f;
            float fFloatValue5 = c6494nW2 != null ? ((Float) c6494nW2.mo5063e()).floatValue() / 100.0f : 0.0f;
            if (f16 != 0.0f) {
                float fM8585d = AbstractC1374Vq.m8585d(fFloatValue2, fFloatValue3, f16, fFloatValue3);
                double d4 = fM8585d;
                f = fM8585d;
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
            PointF pointF = (PointF) abstractC6378lg.mo5063e();
            path.offset(pointF.x, pointF.y);
            path.close();
        } else if (iM26247x == 1) {
            int iFloor = (int) Math.floor(((Float) c6494nW4.mo5063e()).floatValue());
            if (c6494nW3 != null) {
                dFloatValue = ((Float) c6494nW3.mo5063e()).floatValue();
            }
            double radians2 = Math.toRadians(dFloatValue - 90.0d);
            double d11 = iFloor;
            float fFloatValue6 = ((Float) c6494nW2.mo5063e()).floatValue() / 100.0f;
            float fFloatValue7 = ((Float) c6494nW.mo5063e()).floatValue();
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
                        Path path2 = this.f14773b;
                        path2.reset();
                        path2.moveTo(f31, fSin6);
                        float f35 = f31 - f33;
                        float f36 = fSin6 - f34;
                        float f37 = fCos9 + fCos7;
                        float f38 = fSin7 + fSin9;
                        path2.cubicTo(f35, f36, f37, f38, fCos7, fSin7);
                        PathMeasure pathMeasure = this.f14774c;
                        pathMeasure.setPath(path2, false);
                        float length = pathMeasure.getLength() * 0.9999f;
                        f11 = fFloatValue7;
                        float[] fArr = this.f14775d;
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
            PointF pointF2 = (PointF) abstractC6378lg.mo5063e();
            path.offset(pointF2.x, pointF2.y);
            path.close();
        }
        path.close();
        this.f14788q.m2843f(path);
        this.f14789r = true;
        return path;
    }

    @Override // p000.InterfaceC6793ry
    public final String getName() {
        return this.f14776e;
    }

    @Override // p000.InterfaceC8000Nf0
    /* renamed from: h */
    public final void mo1746h(ColorFilter colorFilter, ES1 es1) {
        C6494nW c6494nW;
        C6494nW c6494nW2;
        if (colorFilter == InterfaceC10947rm0.f41886r) {
            this.f14781j.m22530j(es1);
            return;
        }
        if (colorFilter == InterfaceC10947rm0.f41887s) {
            this.f14783l.m22530j(es1);
            return;
        }
        if (colorFilter == InterfaceC10947rm0.f41877i) {
            this.f14782k.m22530j(es1);
            return;
        }
        if (colorFilter == InterfaceC10947rm0.f41888t && (c6494nW2 = this.f14784m) != null) {
            c6494nW2.m22530j(es1);
            return;
        }
        if (colorFilter == InterfaceC10947rm0.f41889u) {
            this.f14785n.m22530j(es1);
            return;
        }
        if (colorFilter == InterfaceC10947rm0.f41890v && (c6494nW = this.f14786o) != null) {
            c6494nW.m22530j(es1);
        } else if (colorFilter == InterfaceC10947rm0.f41891w) {
            this.f14787p.m22530j(es1);
        }
    }
}
