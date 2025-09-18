package p000;

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

/* renamed from: Sk */
/* loaded from: classes.dex */
public class C1179Sk extends Drawable {

    /* renamed from: A */
    public int f10930A;

    /* renamed from: a */
    public Y21 f10931a;

    /* renamed from: b */
    public Y21 f10932b;

    /* renamed from: c */
    public Y21 f10933c;

    /* renamed from: d */
    public Path f10934d;

    /* renamed from: e */
    public Path f10935e;

    /* renamed from: f */
    public Path f10936f;

    /* renamed from: g */
    public Path f10937g;

    /* renamed from: h */
    public Path f10938h;

    /* renamed from: j */
    public Path f10940j;

    /* renamed from: k */
    public RectF f10941k;

    /* renamed from: l */
    public RectF f10942l;

    /* renamed from: m */
    public RectF f10943m;

    /* renamed from: n */
    public RectF f10944n;

    /* renamed from: o */
    public PointF f10945o;

    /* renamed from: p */
    public PointF f10946p;

    /* renamed from: q */
    public PointF f10947q;

    /* renamed from: r */
    public PointF f10948r;

    /* renamed from: w */
    public final C0737Li f10953w;

    /* renamed from: x */
    public C6520nw f10954x;

    /* renamed from: y */
    public final Context f10955y;

    /* renamed from: z */
    public int f10956z;

    /* renamed from: i */
    public final Path f10939i = new Path();

    /* renamed from: s */
    public boolean f10949s = false;

    /* renamed from: t */
    public final Paint f10950t = new Paint(1);

    /* renamed from: u */
    public int f10951u = 0;

    /* renamed from: v */
    public int f10952v = KotlinVersion.MAX_COMPONENT_VALUE;

    public C1179Sk(Context context) {
        C0737Li c0737Li = new C0737Li();
        c0737Li.f6805a = null;
        c0737Li.f6806b = null;
        c0737Li.f6807c = null;
        c0737Li.f6808d = null;
        c0737Li.f6809e = null;
        c0737Li.f6810f = null;
        c0737Li.f6811g = null;
        c0737Li.f6812h = null;
        c0737Li.f6813i = null;
        c0737Li.f6814j = null;
        c0737Li.f6815k = null;
        c0737Li.f6816l = null;
        c0737Li.f6817m = null;
        this.f10953w = c0737Li;
        this.f10954x = new C6520nw(0.0f, 0.0f, 0.0f, 0.0f);
        this.f10956z = -1;
        this.f10955y = context;
    }

    /* renamed from: e */
    public static void m7433e(double d, double d2, double d3, double d4, double d5, double d6, double d7, double d8, PointF pointF) {
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

    /* renamed from: h */
    public static int m7434h(int i, int i2) {
        if (i2 == 255) {
            return i;
        }
        if (i2 == 0) {
            return i & 16777215;
        }
        return (i & 16777215) | ((((i >>> 24) * (i2 + (i2 >> 7))) >> 8) << 24);
    }

    /* renamed from: a */
    public final void m7435a(Canvas canvas, int i, float f, float f2, float f3, float f4, float f5, float f6, float f7, float f8) {
        if (i == 0) {
            return;
        }
        if (this.f10938h == null) {
            this.f10938h = new Path();
        }
        Paint paint = this.f10950t;
        paint.setColor(i);
        this.f10938h.reset();
        this.f10938h.moveTo(f, f2);
        this.f10938h.lineTo(f3, f4);
        this.f10938h.lineTo(f5, f6);
        this.f10938h.lineTo(f7, f8);
        this.f10938h.lineTo(f, f2);
        canvas.drawPath(this.f10938h, paint);
    }

    /* renamed from: b */
    public final int m7436b(int i) {
        Y21 y21 = this.f10932b;
        float fM9207a = y21 != null ? y21.m9207a(i) : 0.0f;
        Y21 y212 = this.f10933c;
        return ((((int) (y212 != null ? y212.m9207a(i) : 255.0f)) << 24) & (-16777216)) | (((int) fM9207a) & 16777215);
    }

    /* renamed from: c */
    public final float m7437c(float f, int i) {
        Y21 y21 = this.f10931a;
        if (y21 == null) {
            return f;
        }
        float f2 = y21.f14122b[i];
        return Float.isNaN(f2) ? f : f2;
    }

    /* renamed from: d */
    public final RectF m7438d() {
        float fM7437c = m7437c(0.0f, 8);
        float fM7437c2 = m7437c(fM7437c, 1);
        float fM7437c3 = m7437c(fM7437c, 3);
        float fM7437c4 = m7437c(fM7437c, 0);
        float fM7437c5 = m7437c(fM7437c, 2);
        if (this.f10931a != null) {
            boolean z = getLayoutDirection() == 1;
            float[] fArr = this.f10931a.f14122b;
            float f = fArr[4];
            float f2 = fArr[5];
            Context context = this.f10955y;
            O90.m5968f(context, "context");
            if (context.getSharedPreferences("com.facebook.react.modules.i18nmanager.I18nUtil", 0).getBoolean("RCTI18nUtil_makeRTLFlipLeftAndRightStyles", true)) {
                if (!Float.isNaN(f)) {
                    fM7437c4 = f;
                }
                if (!Float.isNaN(f2)) {
                    fM7437c5 = f2;
                }
                float f3 = z ? fM7437c5 : fM7437c4;
                if (z) {
                    fM7437c5 = fM7437c4;
                }
                fM7437c4 = f3;
            } else {
                float f4 = z ? f2 : f;
                if (!z) {
                    f = f2;
                }
                if (!Float.isNaN(f4)) {
                    fM7437c4 = f4;
                }
                if (!Float.isNaN(f)) {
                    fM7437c5 = f;
                }
            }
        }
        return new RectF(fM7437c4, fM7437c2, fM7437c5, fM7437c3);
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
        throw new UnsupportedOperationException("Method not decompiled: p000.C1179Sk.draw(android.graphics.Canvas):void");
    }

    /* renamed from: f */
    public final boolean m7439f() {
        C0737Li c0737Li = this.f10953w;
        return (c0737Li.f6805a == null && c0737Li.f6806b == null && c0737Li.f6807c == null && c0737Li.f6808d == null && c0737Li.f6809e == null && c0737Li.f6810f == null && c0737Li.f6811g == null && c0737Li.f6812h == null && c0737Li.f6813i == null && c0737Li.f6814j == null && c0737Li.f6815k == null && c0737Li.f6816l == null && c0737Li.f6817m == null) ? false : true;
    }

    /* renamed from: g */
    public final boolean m7440g(int i) {
        Y21 y21 = this.f10932b;
        float fM9207a = y21 != null ? y21.m9207a(i) : Float.NaN;
        Y21 y212 = this.f10933c;
        return (Float.isNaN(fM9207a) || Float.isNaN(y212 != null ? y212.m9207a(i) : Float.NaN)) ? false : true;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getAlpha() {
        return this.f10952v;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getLayoutDirection() {
        int i = this.f10956z;
        return i == -1 ? super.getLayoutDirection() : i;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return (Color.alpha(this.f10951u) * this.f10952v) >> 8;
    }

    @Override // android.graphics.drawable.Drawable
    public final void getOutline(Outline outline) {
        if (!m7439f()) {
            outline.setRect(getBounds());
            return;
        }
        m7446n();
        Path path = this.f10937g;
        path.getClass();
        outline.setConvexPath(path);
    }

    /* renamed from: i */
    public final void m7441i(int i, float f, float f2) {
        if (this.f10932b == null) {
            this.f10932b = new Y21(0.0f);
        }
        if (!AbstractC9828j12.m21957a(this.f10932b.f14122b[i], f)) {
            this.f10932b.m9208b(f, i);
            invalidateSelf();
        }
        if (this.f10933c == null) {
            this.f10933c = new Y21(255.0f);
        }
        if (!AbstractC9828j12.m21957a(this.f10933c.f14122b[i], f2)) {
            this.f10933c.m9208b(f2, i);
            invalidateSelf();
        }
        this.f10949s = true;
    }

    /* renamed from: j */
    public final void m7442j(EnumC0675Ki enumC0675Ki, C11323ui0 c11323ui0) {
        C11323ui0 c11323ui02;
        C0737Li c0737Li = this.f10953w;
        c0737Li.getClass();
        O90.m5968f(enumC0675Ki, "property");
        switch (enumC0675Ki.ordinal()) {
            case 0:
                c11323ui02 = c0737Li.f6805a;
                break;
            case 1:
                c11323ui02 = c0737Li.f6806b;
                break;
            case 2:
                c11323ui02 = c0737Li.f6807c;
                break;
            case 3:
                c11323ui02 = c0737Li.f6809e;
                break;
            case 4:
                c11323ui02 = c0737Li.f6808d;
                break;
            case 5:
                c11323ui02 = c0737Li.f6810f;
                break;
            case 6:
                c11323ui02 = c0737Li.f6811g;
                break;
            case 7:
                c11323ui02 = c0737Li.f6812h;
                break;
            case 8:
                c11323ui02 = c0737Li.f6813i;
                break;
            case 9:
                c11323ui02 = c0737Li.f6817m;
                break;
            case 10:
                c11323ui02 = c0737Li.f6816l;
                break;
            case 11:
                c11323ui02 = c0737Li.f6815k;
                break;
            case 12:
                c11323ui02 = c0737Li.f6814j;
                break;
            default:
                throw new C6838sg();
        }
        if (Objects.equals(c11323ui0, c11323ui02)) {
            return;
        }
        c0737Li.m5066a(enumC0675Ki, c11323ui0);
        this.f10949s = true;
        invalidateSelf();
    }

    /* renamed from: k */
    public final void m7443k(int i, float f) {
        if (this.f10931a == null) {
            this.f10931a = new Y21(0.0f, new float[]{Float.NaN, Float.NaN, Float.NaN, Float.NaN, Float.NaN, Float.NaN, Float.NaN, Float.NaN, Float.NaN, Float.NaN, Float.NaN, Float.NaN});
        }
        if (AbstractC9828j12.m21957a(this.f10931a.f14122b[i], f)) {
            return;
        }
        this.f10931a.m9208b(f, i);
        if (i == 0 || i == 1 || i == 2 || i == 3 || i == 4 || i == 5 || i == 8) {
            this.f10949s = true;
        }
        invalidateSelf();
    }

    /* renamed from: l */
    public final void m7444l(float f) {
        Float fValueOf = Float.isNaN(f) ? null : Float.valueOf(f);
        if (fValueOf == null) {
            m7442j(EnumC0675Ki.f6262a, null);
        } else {
            m7442j(EnumC0675Ki.f6262a, new C11323ui0(fValueOf.floatValue(), EnumC11451vi0.f44499a));
        }
    }

    /* renamed from: m */
    public final void m7445m(float f, int i) {
        Float fValueOf = Float.isNaN(f) ? null : Float.valueOf(f);
        if (fValueOf == null) {
            this.f10953w.m5066a(EnumC0675Ki.values()[i], null);
        } else {
            m7442j(EnumC0675Ki.values()[i], new C11323ui0(fValueOf.floatValue(), EnumC11451vi0.f44499a));
        }
    }

    /* renamed from: n */
    public final void m7446n() {
        float f;
        C6520nw c6520nw;
        if (this.f10949s) {
            this.f10949s = false;
            if (this.f10934d == null) {
                this.f10934d = new Path();
            }
            if (this.f10935e == null) {
                this.f10935e = new Path();
            }
            if (this.f10936f == null) {
                this.f10936f = new Path();
            }
            if (this.f10937g == null) {
                this.f10937g = new Path();
            }
            if (this.f10940j == null) {
                this.f10940j = new Path();
            }
            if (this.f10941k == null) {
                this.f10941k = new RectF();
            }
            if (this.f10942l == null) {
                this.f10942l = new RectF();
            }
            if (this.f10943m == null) {
                this.f10943m = new RectF();
            }
            if (this.f10944n == null) {
                this.f10944n = new RectF();
            }
            this.f10934d.reset();
            this.f10935e.reset();
            this.f10936f.reset();
            this.f10937g.reset();
            this.f10940j.reset();
            this.f10941k.set(getBounds());
            this.f10942l.set(getBounds());
            this.f10943m.set(getBounds());
            this.f10944n.set(getBounds());
            RectF rectFM7438d = m7438d();
            int iM7436b = m7436b(0);
            int iM7436b2 = m7436b(1);
            int iM7436b3 = m7436b(2);
            int iM7436b4 = m7436b(3);
            int iM7436b5 = m7436b(8);
            int iM7436b6 = m7436b(9);
            int iM7436b7 = m7436b(11);
            int iM7436b8 = m7436b(10);
            if (m7440g(9)) {
                iM7436b2 = iM7436b6;
                iM7436b4 = iM7436b2;
            }
            if (!m7440g(10)) {
                iM7436b8 = iM7436b4;
            }
            if (!m7440g(11)) {
                iM7436b7 = iM7436b2;
            }
            if (Color.alpha(iM7436b) == 0 || Color.alpha(iM7436b7) == 0 || Color.alpha(iM7436b3) == 0 || Color.alpha(iM7436b8) == 0 || Color.alpha(iM7436b5) == 0) {
                f = 0.0f;
            } else {
                RectF rectF = this.f10941k;
                rectF.top += rectFM7438d.top;
                rectF.bottom -= rectFM7438d.bottom;
                rectF.left += rectFM7438d.left;
                rectF.right -= rectFM7438d.right;
                f = 0.8f;
            }
            RectF rectF2 = this.f10944n;
            rectF2.top = (rectFM7438d.top * 0.5f) + rectF2.top;
            rectF2.bottom -= rectFM7438d.bottom * 0.5f;
            rectF2.left = (rectFM7438d.left * 0.5f) + rectF2.left;
            rectF2.right -= rectFM7438d.right * 0.5f;
            int layoutDirection = getLayoutDirection();
            float fWidth = this.f10942l.width();
            float fHeight = this.f10942l.height();
            C0737Li c0737Li = this.f10953w;
            c0737Li.getClass();
            Context context = this.f10955y;
            O90.m5968f(context, "context");
            if (layoutDirection == 0) {
                C11323ui0 c11323ui0 = c0737Li.f6814j;
                if (c11323ui0 == null && (c11323ui0 = c0737Li.f6810f) == null && (c11323ui0 = c0737Li.f6806b) == null) {
                    c11323ui0 = c0737Li.f6805a;
                }
                float fM25224a = c11323ui0 != null ? c11323ui0.m25224a(fWidth, fHeight) : 0.0f;
                C11323ui0 c11323ui02 = c0737Li.f6816l;
                if (c11323ui02 == null && (c11323ui02 = c0737Li.f6811g) == null && (c11323ui02 = c0737Li.f6807c) == null) {
                    c11323ui02 = c0737Li.f6805a;
                }
                float fM25224a2 = c11323ui02 != null ? c11323ui02.m25224a(fWidth, fHeight) : 0.0f;
                C11323ui0 c11323ui03 = c0737Li.f6815k;
                if (c11323ui03 == null && (c11323ui03 = c0737Li.f6812h) == null && (c11323ui03 = c0737Li.f6808d) == null) {
                    c11323ui03 = c0737Li.f6805a;
                }
                float fM25224a3 = c11323ui03 != null ? c11323ui03.m25224a(fWidth, fHeight) : 0.0f;
                C11323ui0 c11323ui04 = c0737Li.f6817m;
                if (c11323ui04 == null && (c11323ui04 = c0737Li.f6813i) == null && (c11323ui04 = c0737Li.f6809e) == null) {
                    c11323ui04 = c0737Li.f6805a;
                }
                c6520nw = new C6520nw(fM25224a, fM25224a2, fM25224a3, c11323ui04 != null ? c11323ui04.m25224a(fWidth, fHeight) : 0.0f);
            } else {
                if (layoutDirection != 1) {
                    throw new IllegalArgumentException("Expected?.resolved layout direction");
                }
                if (context.getSharedPreferences("com.facebook.react.modules.i18nmanager.I18nUtil", 0).getBoolean("RCTI18nUtil_makeRTLFlipLeftAndRightStyles", true)) {
                    C11323ui0 c11323ui05 = c0737Li.f6816l;
                    if (c11323ui05 == null && (c11323ui05 = c0737Li.f6811g) == null && (c11323ui05 = c0737Li.f6807c) == null) {
                        c11323ui05 = c0737Li.f6805a;
                    }
                    float fM25224a4 = c11323ui05 != null ? c11323ui05.m25224a(fWidth, fHeight) : 0.0f;
                    C11323ui0 c11323ui06 = c0737Li.f6814j;
                    if (c11323ui06 == null && (c11323ui06 = c0737Li.f6810f) == null && (c11323ui06 = c0737Li.f6806b) == null) {
                        c11323ui06 = c0737Li.f6805a;
                    }
                    float fM25224a5 = c11323ui06 != null ? c11323ui06.m25224a(fWidth, fHeight) : 0.0f;
                    C11323ui0 c11323ui07 = c0737Li.f6817m;
                    if (c11323ui07 == null && (c11323ui07 = c0737Li.f6812h) == null && (c11323ui07 = c0737Li.f6809e) == null) {
                        c11323ui07 = c0737Li.f6805a;
                    }
                    float fM25224a6 = c11323ui07 != null ? c11323ui07.m25224a(fWidth, fHeight) : 0.0f;
                    C11323ui0 c11323ui08 = c0737Li.f6815k;
                    if (c11323ui08 == null && (c11323ui08 = c0737Li.f6813i) == null && (c11323ui08 = c0737Li.f6808d) == null) {
                        c11323ui08 = c0737Li.f6805a;
                    }
                    c6520nw = new C6520nw(fM25224a4, fM25224a5, fM25224a6, c11323ui08 != null ? c11323ui08.m25224a(fWidth, fHeight) : 0.0f);
                } else {
                    C11323ui0 c11323ui09 = c0737Li.f6816l;
                    if (c11323ui09 == null && (c11323ui09 = c0737Li.f6811g) == null && (c11323ui09 = c0737Li.f6806b) == null) {
                        c11323ui09 = c0737Li.f6805a;
                    }
                    float fM25224a7 = c11323ui09 != null ? c11323ui09.m25224a(fWidth, fHeight) : 0.0f;
                    C11323ui0 c11323ui010 = c0737Li.f6814j;
                    if (c11323ui010 == null && (c11323ui010 = c0737Li.f6810f) == null && (c11323ui010 = c0737Li.f6807c) == null) {
                        c11323ui010 = c0737Li.f6805a;
                    }
                    float fM25224a8 = c11323ui010 != null ? c11323ui010.m25224a(fWidth, fHeight) : 0.0f;
                    C11323ui0 c11323ui011 = c0737Li.f6817m;
                    if (c11323ui011 == null && (c11323ui011 = c0737Li.f6812h) == null && (c11323ui011 = c0737Li.f6808d) == null) {
                        c11323ui011 = c0737Li.f6805a;
                    }
                    float fM25224a9 = c11323ui011 != null ? c11323ui011.m25224a(fWidth, fHeight) : 0.0f;
                    C11323ui0 c11323ui012 = c0737Li.f6815k;
                    if (c11323ui012 == null && (c11323ui012 = c0737Li.f6813i) == null && (c11323ui012 = c0737Li.f6809e) == null) {
                        c11323ui012 = c0737Li.f6805a;
                    }
                    c6520nw = new C6520nw(fM25224a7, fM25224a8, fM25224a9, c11323ui012 != null ? c11323ui012.m25224a(fWidth, fHeight) : 0.0f);
                }
            }
            this.f10954x = c6520nw;
            float f2 = rectFM7438d.left;
            float f3 = c6520nw.f38613a;
            float fMax = Math.max(f3 - f2, 0.0f);
            float fMax2 = Math.max(f3 - rectFM7438d.top, 0.0f);
            float f4 = rectFM7438d.right;
            float f5 = c6520nw.f38614b;
            float fMax3 = Math.max(f5 - f4, 0.0f);
            float fMax4 = Math.max(f5 - rectFM7438d.top, 0.0f);
            float f6 = rectFM7438d.right;
            float f7 = c6520nw.f38616d;
            float fMax5 = Math.max(f7 - f6, 0.0f);
            float fMax6 = Math.max(f7 - rectFM7438d.bottom, 0.0f);
            float f8 = rectFM7438d.left;
            float f9 = c6520nw.f38615c;
            float fMax7 = Math.max(f9 - f8, 0.0f);
            float fMax8 = Math.max(f9 - rectFM7438d.bottom, 0.0f);
            Path.Direction direction = Path.Direction.CW;
            this.f10934d.addRoundRect(this.f10941k, new float[]{fMax, fMax2, fMax3, fMax4, fMax5, fMax6, fMax7, fMax8}, direction);
            Path path = this.f10935e;
            RectF rectF3 = this.f10941k;
            path.addRoundRect(rectF3.left - f, rectF3.top - f, rectF3.right + f, rectF3.bottom + f, new float[]{fMax, fMax2, fMax3, fMax4, fMax5, fMax6, fMax7, fMax8}, direction);
            this.f10936f.addRoundRect(this.f10942l, new float[]{f3, f3, f5, f5, f7, f7, f9, f9}, direction);
            Y21 y21 = this.f10931a;
            float fM9207a = y21 != null ? y21.m9207a(8) / 2.0f : 0.0f;
            float f10 = f3 + fM9207a;
            float f11 = f5 + fM9207a;
            float f12 = f7 + fM9207a;
            float f13 = f9 + fM9207a;
            this.f10937g.addRoundRect(this.f10943m, new float[]{f10, f10, f11, f11, f12, f12, f13, f13}, direction);
            Path path2 = this.f10940j;
            RectF rectF4 = this.f10944n;
            float f14 = rectFM7438d.left;
            float fMax9 = Math.max(f3 - (f14 * 0.5f), f14 > 0.0f ? f3 / f14 : 0.0f);
            float f15 = rectFM7438d.top;
            float fMax10 = Math.max(f3 - (f15 * 0.5f), f15 > 0.0f ? f3 / f15 : 0.0f);
            float f16 = rectFM7438d.right;
            float fMax11 = Math.max(f5 - (f16 * 0.5f), f16 > 0.0f ? f5 / f16 : 0.0f);
            float f17 = rectFM7438d.top;
            float fMax12 = Math.max(f5 - (f17 * 0.5f), f17 > 0.0f ? f5 / f17 : 0.0f);
            float f18 = rectFM7438d.right;
            float fMax13 = Math.max(f7 - (f18 * 0.5f), f18 > 0.0f ? f7 / f18 : 0.0f);
            float f19 = rectFM7438d.bottom;
            float fMax14 = Math.max(f7 - (f19 * 0.5f), f19 > 0.0f ? f7 / f19 : 0.0f);
            float f20 = rectFM7438d.left;
            float fMax15 = Math.max(f9 - (f20 * 0.5f), f20 > 0.0f ? f9 / f20 : 0.0f);
            float f21 = rectFM7438d.bottom;
            path2.addRoundRect(rectF4, new float[]{fMax9, fMax10, fMax11, fMax12, fMax13, fMax14, fMax15, Math.max(f9 - (f21 * 0.5f), f21 > 0.0f ? f9 / f21 : 0.0f)}, direction);
            if (this.f10945o == null) {
                this.f10945o = new PointF();
            }
            PointF pointF = this.f10945o;
            RectF rectF5 = this.f10941k;
            float f22 = rectF5.left;
            pointF.x = f22;
            float f23 = rectF5.top;
            pointF.y = f23;
            double d = f22;
            double d2 = f23;
            RectF rectF6 = this.f10942l;
            m7433e(d, d2, (fMax * 2.0f) + f22, (fMax2 * 2.0f) + f23, rectF6.left, rectF6.top, d, d2, pointF);
            if (this.f10948r == null) {
                this.f10948r = new PointF();
            }
            PointF pointF2 = this.f10948r;
            RectF rectF7 = this.f10941k;
            float f24 = rectF7.left;
            pointF2.x = f24;
            float f25 = rectF7.bottom;
            pointF2.y = f25;
            double d3 = f24;
            double d4 = f25;
            RectF rectF8 = this.f10942l;
            m7433e(d3, f25 - (fMax8 * 2.0f), (fMax7 * 2.0f) + f24, d4, rectF8.left, rectF8.bottom, d3, d4, pointF2);
            if (this.f10946p == null) {
                this.f10946p = new PointF();
            }
            PointF pointF3 = this.f10946p;
            RectF rectF9 = this.f10941k;
            float f26 = rectF9.right;
            pointF3.x = f26;
            float f27 = rectF9.top;
            pointF3.y = f27;
            double d5 = f26 - (fMax3 * 2.0f);
            double d6 = f27;
            double d7 = f26;
            RectF rectF10 = this.f10942l;
            m7433e(d5, d6, d7, (fMax4 * 2.0f) + f27, rectF10.right, rectF10.top, d7, d6, pointF3);
            if (this.f10947q == null) {
                this.f10947q = new PointF();
            }
            PointF pointF4 = this.f10947q;
            RectF rectF11 = this.f10941k;
            float f28 = rectF11.right;
            pointF4.x = f28;
            float f29 = rectF11.bottom;
            pointF4.y = f29;
            double d8 = f28 - (fMax5 * 2.0f);
            double d9 = f29 - (2.0f * fMax6);
            double d10 = f28;
            double d11 = f29;
            RectF rectF12 = this.f10942l;
            m7433e(d8, d9, d10, d11, rectF12.right, rectF12.bottom, d10, d11, pointF4);
        }
    }

    /* renamed from: o */
    public final void m7447o(int i) {
        int i2 = this.f10930A;
        this.f10950t.setPathEffect(i2 != 0 ? AbstractC7222ym.m26225b(i, i2) : null);
    }

    @Override // android.graphics.drawable.Drawable
    public final void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        this.f10949s = true;
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
        if (i != this.f10952v) {
            this.f10952v = i;
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
    }
}
