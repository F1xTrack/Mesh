package defpackage;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.ColorFilter;
import android.graphics.Outline;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import java.util.Objects;
import kotlin.KotlinVersion;

/* renamed from: Sk, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C1453Sk extends Drawable {
    public int A;
    public Y21 a;
    public Y21 b;
    public Y21 c;
    public Path d;
    public Path e;
    public Path f;
    public Path g;
    public Path h;
    public Path j;
    public RectF k;
    public RectF l;
    public RectF m;
    public RectF n;
    public PointF o;
    public PointF p;
    public PointF q;
    public PointF r;
    public final C0902Li w;
    public C6168nw x;
    public final Context y;
    public int z;
    public final Path i = new Path();
    public boolean s = false;
    public final Paint t = new Paint(1);
    public int u = 0;
    public int v = KotlinVersion.MAX_COMPONENT_VALUE;

    public C1453Sk(Context context) {
        C0902Li c0902Li = new C0902Li();
        c0902Li.a = null;
        c0902Li.b = null;
        c0902Li.c = null;
        c0902Li.d = null;
        c0902Li.e = null;
        c0902Li.f = null;
        c0902Li.g = null;
        c0902Li.h = null;
        c0902Li.i = null;
        c0902Li.j = null;
        c0902Li.k = null;
        c0902Li.l = null;
        c0902Li.m = null;
        this.w = c0902Li;
        this.x = new C6168nw(0.0f, 0.0f, 0.0f, 0.0f);
        this.z = -1;
        this.y = context;
    }

    public static void e(double d, double d2, double d3, double d4, double d5, double d6, double d7, double d8, PointF pointF) {
        double d9 = (d + d3) / 2.0d;
        double d10 = (d2 + d4) / 2.0d;
        double d11 = d5 - d9;
        double d12 = d6 - d10;
        double dAbs = Math.abs(d3 - d) / 2.0d;
        double dAbs2 = Math.abs(d4 - d2) / 2.0d;
        double d13 = ((d8 - d10) - d12) / ((d7 - d9) - d11);
        double d14 = d12 - (d11 * d13);
        double d15 = dAbs2 * dAbs2;
        double d16 = dAbs * dAbs;
        double d17 = (d16 * d13 * d13) + d15;
        double d18 = dAbs * 2.0d * dAbs * d14 * d13;
        double d19 = (-(d16 * ((d14 * d14) - d15))) / d17;
        double d20 = d17 * 2.0d;
        double dSqrt = ((-d18) / d20) - Math.sqrt(Math.pow(d18 / d20, 2.0d) + d19);
        double d21 = (d13 * dSqrt) + d14;
        double d22 = dSqrt + d9;
        double d23 = d21 + d10;
        if (Double.isNaN(d22) || Double.isNaN(d23)) {
            return;
        }
        pointF.x = (float) d22;
        pointF.y = (float) d23;
    }

    public static int h(int i, int i2) {
        if (i2 == 255) {
            return i;
        }
        if (i2 == 0) {
            return i & 16777215;
        }
        return (i & 16777215) | ((((i >>> 24) * (i2 + (i2 >> 7))) >> 8) << 24);
    }

    public final void a(Canvas canvas, int i, float f, float f2, float f3, float f4, float f5, float f6, float f7, float f8) {
        if (i == 0) {
            return;
        }
        if (this.h == null) {
            this.h = new Path();
        }
        Paint paint = this.t;
        paint.setColor(i);
        this.h.reset();
        this.h.moveTo(f, f2);
        this.h.lineTo(f3, f4);
        this.h.lineTo(f5, f6);
        this.h.lineTo(f7, f8);
        this.h.lineTo(f, f2);
        canvas.drawPath(this.h, paint);
    }

    public final int b(int i) {
        Y21 y21 = this.b;
        float fA = y21 != null ? y21.a(i) : 0.0f;
        Y21 y212 = this.c;
        return ((((int) (y212 != null ? y212.a(i) : 255.0f)) << 24) & (-16777216)) | (((int) fA) & 16777215);
    }

    public final float c(float f, int i) {
        Y21 y21 = this.a;
        if (y21 == null) {
            return f;
        }
        float f2 = y21.b[i];
        return Float.isNaN(f2) ? f : f2;
    }

    public final RectF d() {
        float fC = c(0.0f, 8);
        float fC2 = c(fC, 1);
        float fC3 = c(fC, 3);
        float fC4 = c(fC, 0);
        float fC5 = c(fC, 2);
        if (this.a != null) {
            boolean z = getLayoutDirection() == 1;
            float[] fArr = this.a.b;
            float f = fArr[4];
            float f2 = fArr[5];
            Context context = this.y;
            O90.f(context, "context");
            if (context.getSharedPreferences("com.facebook.react.modules.i18nmanager.I18nUtil", 0).getBoolean("RCTI18nUtil_makeRTLFlipLeftAndRightStyles", true)) {
                if (!Float.isNaN(f)) {
                    fC4 = f;
                }
                if (!Float.isNaN(f2)) {
                    fC5 = f2;
                }
                float f3 = z ? fC5 : fC4;
                if (z) {
                    fC5 = fC4;
                }
                fC4 = f3;
            } else {
                float f4 = z ? f2 : f;
                if (!z) {
                    f = f2;
                }
                if (!Float.isNaN(f4)) {
                    fC4 = f4;
                }
                if (!Float.isNaN(f)) {
                    fC5 = f;
                }
            }
        }
        return new RectF(fC4, fC2, fC5, fC3);
    }

    /* JADX WARN: Removed duplicated region for block: B:170:0x037f  */
    /* JADX WARN: Removed duplicated region for block: B:172:0x0395  */
    /* JADX WARN: Removed duplicated region for block: B:174:0x0398  */
    /* JADX WARN: Removed duplicated region for block: B:177:0x03b0  */
    /* JADX WARN: Removed duplicated region for block: B:192:0x03cf  */
    /* JADX WARN: Removed duplicated region for block: B:213:0x0422  */
    /* JADX WARN: Removed duplicated region for block: B:214:0x045d  */
    /* JADX WARN: Removed duplicated region for block: B:217:0x0475  */
    /* JADX WARN: Removed duplicated region for block: B:220:0x0499  */
    /* JADX WARN: Removed duplicated region for block: B:223:0x04bc  */
    @Override // android.graphics.drawable.Drawable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void draw(android.graphics.Canvas r29) {
        /*
            Method dump skipped, instructions count: 1247
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C1453Sk.draw(android.graphics.Canvas):void");
    }

    public final boolean f() {
        C0902Li c0902Li = this.w;
        return (c0902Li.a == null && c0902Li.b == null && c0902Li.c == null && c0902Li.d == null && c0902Li.e == null && c0902Li.f == null && c0902Li.g == null && c0902Li.h == null && c0902Li.i == null && c0902Li.j == null && c0902Li.k == null && c0902Li.l == null && c0902Li.m == null) ? false : true;
    }

    public final boolean g(int i) {
        Y21 y21 = this.b;
        float fA = y21 != null ? y21.a(i) : Float.NaN;
        Y21 y212 = this.c;
        return (Float.isNaN(fA) || Float.isNaN(y212 != null ? y212.a(i) : Float.NaN)) ? false : true;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getAlpha() {
        return this.v;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getLayoutDirection() {
        int i = this.z;
        return i == -1 ? super.getLayoutDirection() : i;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return (Color.alpha(this.u) * this.v) >> 8;
    }

    @Override // android.graphics.drawable.Drawable
    public final void getOutline(Outline outline) {
        if (!f()) {
            outline.setRect(getBounds());
            return;
        }
        n();
        Path path = this.g;
        path.getClass();
        outline.setConvexPath(path);
    }

    public final void i(int i, float f, float f2) {
        if (this.b == null) {
            this.b = new Y21(0.0f);
        }
        if (!AbstractC5233j12.a(this.b.b[i], f)) {
            this.b.b(f, i);
            invalidateSelf();
        }
        if (this.c == null) {
            this.c = new Y21(255.0f);
        }
        if (!AbstractC5233j12.a(this.c.b[i], f2)) {
            this.c.b(f2, i);
            invalidateSelf();
        }
        this.s = true;
    }

    public final void j(EnumC0824Ki enumC0824Ki, C7463ui0 c7463ui0) {
        C7463ui0 c7463ui02;
        C0902Li c0902Li = this.w;
        c0902Li.getClass();
        O90.f(enumC0824Ki, "property");
        switch (enumC0824Ki.ordinal()) {
            case 0:
                c7463ui02 = c0902Li.a;
                break;
            case 1:
                c7463ui02 = c0902Li.b;
                break;
            case 2:
                c7463ui02 = c0902Li.c;
                break;
            case 3:
                c7463ui02 = c0902Li.e;
                break;
            case 4:
                c7463ui02 = c0902Li.d;
                break;
            case 5:
                c7463ui02 = c0902Li.f;
                break;
            case 6:
                c7463ui02 = c0902Li.g;
                break;
            case 7:
                c7463ui02 = c0902Li.h;
                break;
            case 8:
                c7463ui02 = c0902Li.i;
                break;
            case 9:
                c7463ui02 = c0902Li.m;
                break;
            case 10:
                c7463ui02 = c0902Li.l;
                break;
            case 11:
                c7463ui02 = c0902Li.k;
                break;
            case 12:
                c7463ui02 = c0902Li.j;
                break;
            default:
                throw new C7074sg();
        }
        if (Objects.equals(c7463ui0, c7463ui02)) {
            return;
        }
        c0902Li.a(enumC0824Ki, c7463ui0);
        this.s = true;
        invalidateSelf();
    }

    public final void k(int i, float f) {
        if (this.a == null) {
            this.a = new Y21(0.0f, new float[]{Float.NaN, Float.NaN, Float.NaN, Float.NaN, Float.NaN, Float.NaN, Float.NaN, Float.NaN, Float.NaN, Float.NaN, Float.NaN, Float.NaN});
        }
        if (AbstractC5233j12.a(this.a.b[i], f)) {
            return;
        }
        this.a.b(f, i);
        if (i == 0 || i == 1 || i == 2 || i == 3 || i == 4 || i == 5 || i == 8) {
            this.s = true;
        }
        invalidateSelf();
    }

    public final void l(float f) {
        Float fValueOf = Float.isNaN(f) ? null : Float.valueOf(f);
        if (fValueOf == null) {
            j(EnumC0824Ki.a, null);
        } else {
            j(EnumC0824Ki.a, new C7463ui0(fValueOf.floatValue(), EnumC7654vi0.a));
        }
    }

    public final void m(float f, int i) {
        Float fValueOf = Float.isNaN(f) ? null : Float.valueOf(f);
        if (fValueOf == null) {
            this.w.a(EnumC0824Ki.values()[i], null);
        } else {
            j(EnumC0824Ki.values()[i], new C7463ui0(fValueOf.floatValue(), EnumC7654vi0.a));
        }
    }

    public final void n() {
        float f;
        C6168nw c6168nw;
        if (this.s) {
            this.s = false;
            if (this.d == null) {
                this.d = new Path();
            }
            if (this.e == null) {
                this.e = new Path();
            }
            if (this.f == null) {
                this.f = new Path();
            }
            if (this.g == null) {
                this.g = new Path();
            }
            if (this.j == null) {
                this.j = new Path();
            }
            if (this.k == null) {
                this.k = new RectF();
            }
            if (this.l == null) {
                this.l = new RectF();
            }
            if (this.m == null) {
                this.m = new RectF();
            }
            if (this.n == null) {
                this.n = new RectF();
            }
            this.d.reset();
            this.e.reset();
            this.f.reset();
            this.g.reset();
            this.j.reset();
            this.k.set(getBounds());
            this.l.set(getBounds());
            this.m.set(getBounds());
            this.n.set(getBounds());
            RectF rectFD = d();
            int iB = b(0);
            int iB2 = b(1);
            int iB3 = b(2);
            int iB4 = b(3);
            int iB5 = b(8);
            int iB6 = b(9);
            int iB7 = b(11);
            int iB8 = b(10);
            if (g(9)) {
                iB2 = iB6;
                iB4 = iB2;
            }
            if (!g(10)) {
                iB8 = iB4;
            }
            if (!g(11)) {
                iB7 = iB2;
            }
            if (Color.alpha(iB) == 0 || Color.alpha(iB7) == 0 || Color.alpha(iB3) == 0 || Color.alpha(iB8) == 0 || Color.alpha(iB5) == 0) {
                f = 0.0f;
            } else {
                RectF rectF = this.k;
                rectF.top += rectFD.top;
                rectF.bottom -= rectFD.bottom;
                rectF.left += rectFD.left;
                rectF.right -= rectFD.right;
                f = 0.8f;
            }
            RectF rectF2 = this.n;
            rectF2.top = (rectFD.top * 0.5f) + rectF2.top;
            rectF2.bottom -= rectFD.bottom * 0.5f;
            rectF2.left = (rectFD.left * 0.5f) + rectF2.left;
            rectF2.right -= rectFD.right * 0.5f;
            int layoutDirection = getLayoutDirection();
            float fWidth = this.l.width();
            float fHeight = this.l.height();
            C0902Li c0902Li = this.w;
            c0902Li.getClass();
            Context context = this.y;
            O90.f(context, "context");
            if (layoutDirection == 0) {
                C7463ui0 c7463ui0 = c0902Li.j;
                if (c7463ui0 == null && (c7463ui0 = c0902Li.f) == null && (c7463ui0 = c0902Li.b) == null) {
                    c7463ui0 = c0902Li.a;
                }
                float fA = c7463ui0 != null ? c7463ui0.a(fWidth, fHeight) : 0.0f;
                C7463ui0 c7463ui02 = c0902Li.l;
                if (c7463ui02 == null && (c7463ui02 = c0902Li.g) == null && (c7463ui02 = c0902Li.c) == null) {
                    c7463ui02 = c0902Li.a;
                }
                float fA2 = c7463ui02 != null ? c7463ui02.a(fWidth, fHeight) : 0.0f;
                C7463ui0 c7463ui03 = c0902Li.k;
                if (c7463ui03 == null && (c7463ui03 = c0902Li.h) == null && (c7463ui03 = c0902Li.d) == null) {
                    c7463ui03 = c0902Li.a;
                }
                float fA3 = c7463ui03 != null ? c7463ui03.a(fWidth, fHeight) : 0.0f;
                C7463ui0 c7463ui04 = c0902Li.m;
                if (c7463ui04 == null && (c7463ui04 = c0902Li.i) == null && (c7463ui04 = c0902Li.e) == null) {
                    c7463ui04 = c0902Li.a;
                }
                c6168nw = new C6168nw(fA, fA2, fA3, c7463ui04 != null ? c7463ui04.a(fWidth, fHeight) : 0.0f);
            } else {
                if (layoutDirection != 1) {
                    throw new IllegalArgumentException("Expected?.resolved layout direction");
                }
                if (context.getSharedPreferences("com.facebook.react.modules.i18nmanager.I18nUtil", 0).getBoolean("RCTI18nUtil_makeRTLFlipLeftAndRightStyles", true)) {
                    C7463ui0 c7463ui05 = c0902Li.l;
                    if (c7463ui05 == null && (c7463ui05 = c0902Li.g) == null && (c7463ui05 = c0902Li.c) == null) {
                        c7463ui05 = c0902Li.a;
                    }
                    float fA4 = c7463ui05 != null ? c7463ui05.a(fWidth, fHeight) : 0.0f;
                    C7463ui0 c7463ui06 = c0902Li.j;
                    if (c7463ui06 == null && (c7463ui06 = c0902Li.f) == null && (c7463ui06 = c0902Li.b) == null) {
                        c7463ui06 = c0902Li.a;
                    }
                    float fA5 = c7463ui06 != null ? c7463ui06.a(fWidth, fHeight) : 0.0f;
                    C7463ui0 c7463ui07 = c0902Li.m;
                    if (c7463ui07 == null && (c7463ui07 = c0902Li.h) == null && (c7463ui07 = c0902Li.e) == null) {
                        c7463ui07 = c0902Li.a;
                    }
                    float fA6 = c7463ui07 != null ? c7463ui07.a(fWidth, fHeight) : 0.0f;
                    C7463ui0 c7463ui08 = c0902Li.k;
                    if (c7463ui08 == null && (c7463ui08 = c0902Li.i) == null && (c7463ui08 = c0902Li.d) == null) {
                        c7463ui08 = c0902Li.a;
                    }
                    c6168nw = new C6168nw(fA4, fA5, fA6, c7463ui08 != null ? c7463ui08.a(fWidth, fHeight) : 0.0f);
                } else {
                    C7463ui0 c7463ui09 = c0902Li.l;
                    if (c7463ui09 == null && (c7463ui09 = c0902Li.g) == null && (c7463ui09 = c0902Li.b) == null) {
                        c7463ui09 = c0902Li.a;
                    }
                    float fA7 = c7463ui09 != null ? c7463ui09.a(fWidth, fHeight) : 0.0f;
                    C7463ui0 c7463ui010 = c0902Li.j;
                    if (c7463ui010 == null && (c7463ui010 = c0902Li.f) == null && (c7463ui010 = c0902Li.c) == null) {
                        c7463ui010 = c0902Li.a;
                    }
                    float fA8 = c7463ui010 != null ? c7463ui010.a(fWidth, fHeight) : 0.0f;
                    C7463ui0 c7463ui011 = c0902Li.m;
                    if (c7463ui011 == null && (c7463ui011 = c0902Li.h) == null && (c7463ui011 = c0902Li.d) == null) {
                        c7463ui011 = c0902Li.a;
                    }
                    float fA9 = c7463ui011 != null ? c7463ui011.a(fWidth, fHeight) : 0.0f;
                    C7463ui0 c7463ui012 = c0902Li.k;
                    if (c7463ui012 == null && (c7463ui012 = c0902Li.i) == null && (c7463ui012 = c0902Li.e) == null) {
                        c7463ui012 = c0902Li.a;
                    }
                    c6168nw = new C6168nw(fA7, fA8, fA9, c7463ui012 != null ? c7463ui012.a(fWidth, fHeight) : 0.0f);
                }
            }
            this.x = c6168nw;
            float f2 = rectFD.left;
            float f3 = c6168nw.a;
            float fMax = Math.max(f3 - f2, 0.0f);
            float fMax2 = Math.max(f3 - rectFD.top, 0.0f);
            float f4 = rectFD.right;
            float f5 = c6168nw.b;
            float fMax3 = Math.max(f5 - f4, 0.0f);
            float fMax4 = Math.max(f5 - rectFD.top, 0.0f);
            float f6 = rectFD.right;
            float f7 = c6168nw.d;
            float fMax5 = Math.max(f7 - f6, 0.0f);
            float fMax6 = Math.max(f7 - rectFD.bottom, 0.0f);
            float f8 = rectFD.left;
            float f9 = c6168nw.c;
            float fMax7 = Math.max(f9 - f8, 0.0f);
            float fMax8 = Math.max(f9 - rectFD.bottom, 0.0f);
            Path.Direction direction = Path.Direction.CW;
            this.d.addRoundRect(this.k, new float[]{fMax, fMax2, fMax3, fMax4, fMax5, fMax6, fMax7, fMax8}, direction);
            Path path = this.e;
            RectF rectF3 = this.k;
            path.addRoundRect(rectF3.left - f, rectF3.top - f, rectF3.right + f, rectF3.bottom + f, new float[]{fMax, fMax2, fMax3, fMax4, fMax5, fMax6, fMax7, fMax8}, direction);
            this.f.addRoundRect(this.l, new float[]{f3, f3, f5, f5, f7, f7, f9, f9}, direction);
            Y21 y21 = this.a;
            float fA10 = y21 != null ? y21.a(8) / 2.0f : 0.0f;
            float f10 = f3 + fA10;
            float f11 = f5 + fA10;
            float f12 = f7 + fA10;
            float f13 = f9 + fA10;
            this.g.addRoundRect(this.m, new float[]{f10, f10, f11, f11, f12, f12, f13, f13}, direction);
            Path path2 = this.j;
            RectF rectF4 = this.n;
            float f14 = rectFD.left;
            float fMax9 = Math.max(f3 - (f14 * 0.5f), f14 > 0.0f ? f3 / f14 : 0.0f);
            float f15 = rectFD.top;
            float fMax10 = Math.max(f3 - (f15 * 0.5f), f15 > 0.0f ? f3 / f15 : 0.0f);
            float f16 = rectFD.right;
            float fMax11 = Math.max(f5 - (f16 * 0.5f), f16 > 0.0f ? f5 / f16 : 0.0f);
            float f17 = rectFD.top;
            float fMax12 = Math.max(f5 - (f17 * 0.5f), f17 > 0.0f ? f5 / f17 : 0.0f);
            float f18 = rectFD.right;
            float fMax13 = Math.max(f7 - (f18 * 0.5f), f18 > 0.0f ? f7 / f18 : 0.0f);
            float f19 = rectFD.bottom;
            float fMax14 = Math.max(f7 - (f19 * 0.5f), f19 > 0.0f ? f7 / f19 : 0.0f);
            float f20 = rectFD.left;
            float fMax15 = Math.max(f9 - (f20 * 0.5f), f20 > 0.0f ? f9 / f20 : 0.0f);
            float f21 = rectFD.bottom;
            path2.addRoundRect(rectF4, new float[]{fMax9, fMax10, fMax11, fMax12, fMax13, fMax14, fMax15, Math.max(f9 - (f21 * 0.5f), f21 > 0.0f ? f9 / f21 : 0.0f)}, direction);
            if (this.o == null) {
                this.o = new PointF();
            }
            PointF pointF = this.o;
            RectF rectF5 = this.k;
            float f22 = rectF5.left;
            pointF.x = f22;
            float f23 = rectF5.top;
            pointF.y = f23;
            double d = f22;
            double d2 = f23;
            RectF rectF6 = this.l;
            e(d, d2, (fMax * 2.0f) + f22, (fMax2 * 2.0f) + f23, rectF6.left, rectF6.top, d, d2, pointF);
            if (this.r == null) {
                this.r = new PointF();
            }
            PointF pointF2 = this.r;
            RectF rectF7 = this.k;
            float f24 = rectF7.left;
            pointF2.x = f24;
            float f25 = rectF7.bottom;
            pointF2.y = f25;
            double d3 = f24;
            double d4 = f25;
            RectF rectF8 = this.l;
            e(d3, f25 - (fMax8 * 2.0f), (fMax7 * 2.0f) + f24, d4, rectF8.left, rectF8.bottom, d3, d4, pointF2);
            if (this.p == null) {
                this.p = new PointF();
            }
            PointF pointF3 = this.p;
            RectF rectF9 = this.k;
            float f26 = rectF9.right;
            pointF3.x = f26;
            float f27 = rectF9.top;
            pointF3.y = f27;
            double d5 = f26 - (fMax3 * 2.0f);
            double d6 = f27;
            double d7 = f26;
            RectF rectF10 = this.l;
            e(d5, d6, d7, (fMax4 * 2.0f) + f27, rectF10.right, rectF10.top, d7, d6, pointF3);
            if (this.q == null) {
                this.q = new PointF();
            }
            PointF pointF4 = this.q;
            RectF rectF11 = this.k;
            float f28 = rectF11.right;
            pointF4.x = f28;
            float f29 = rectF11.bottom;
            pointF4.y = f29;
            double d8 = f28 - (fMax5 * 2.0f);
            double d9 = f29 - (2.0f * fMax6);
            double d10 = f28;
            double d11 = f29;
            RectF rectF12 = this.l;
            e(d8, d9, d10, d11, rectF12.right, rectF12.bottom, d10, d11, pointF4);
        }
    }

    public final void o(int i) {
        int i2 = this.A;
        this.t.setPathEffect(i2 != 0 ? AbstractC8235ym.b(i, i2) : null);
    }

    @Override // android.graphics.drawable.Drawable
    public final void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        this.s = true;
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
        if (i != this.v) {
            this.v = i;
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
    }
}
