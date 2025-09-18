package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Outline;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Region;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Looper;
import android.util.AttributeSet;
import java.util.BitSet;
import java.util.Objects;
import kotlin.KotlinVersion;

/* renamed from: no0 */
/* loaded from: classes.dex */
public class C6145no0 extends Drawable implements InterfaceC5228j01 {
    public static final Paint x;
    public C5954mo0 a;
    public final AbstractC2431c01[] b;
    public final AbstractC2431c01[] c;
    public final BitSet d;
    public boolean e;
    public final Matrix f;
    public final Path g;
    public final Path h;
    public final RectF i;
    public final RectF j;
    public final Region k;
    public final Region l;
    public LZ0 m;
    public final Paint n;
    public final Paint o;
    public final JZ0 p;
    public final C0136Bm1 q;
    public final C1547Tp0 r;
    public PorterDuffColorFilter s;
    public PorterDuffColorFilter t;
    public int u;
    public final RectF v;
    public final boolean w;

    static {
        Paint paint = new Paint(1);
        x = paint;
        paint.setColor(-1);
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
    }

    public C6145no0() {
        this(new LZ0());
    }

    public final void a(Path path, RectF rectF) {
        C5954mo0 c5954mo0 = this.a;
        this.r.b(c5954mo0.a, c5954mo0.i, rectF, this.q, path);
        if (this.a.h != 1.0f) {
            Matrix matrix = this.f;
            matrix.reset();
            float f = this.a.h;
            matrix.setScale(f, f, rectF.width() / 2.0f, rectF.height() / 2.0f);
            path.transform(matrix);
        }
        path.computeBounds(this.v, true);
    }

    public final int b(int i) {
        int i2;
        C5954mo0 c5954mo0 = this.a;
        float f = c5954mo0.m + 0.0f + c5954mo0.l;
        C6445pN c6445pN = c5954mo0.b;
        if (c6445pN == null || !c6445pN.a || AbstractC0937Lu.f(i, KotlinVersion.MAX_COMPONENT_VALUE) != c6445pN.d) {
            return i;
        }
        float fMin = (c6445pN.e <= 0.0f || f <= 0.0f) ? 0.0f : Math.min(((((float) Math.log1p(f / r4)) * 4.5f) + 2.0f) / 100.0f, 1.0f);
        int iAlpha = Color.alpha(i);
        int i3 = AbstractC5543ke1.i(AbstractC0937Lu.f(i, KotlinVersion.MAX_COMPONENT_VALUE), fMin, c6445pN.b);
        if (fMin > 0.0f && (i2 = c6445pN.c) != 0) {
            i3 = AbstractC0937Lu.d(AbstractC0937Lu.f(i2, C6445pN.f), i3);
        }
        return AbstractC0937Lu.f(i3, iAlpha);
    }

    public final void c(Canvas canvas) {
        this.d.cardinality();
        int i = this.a.o;
        Path path = this.g;
        JZ0 jz0 = this.p;
        if (i != 0) {
            canvas.drawPath(path, jz0.a);
        }
        for (int i2 = 0; i2 < 4; i2++) {
            AbstractC2431c01 abstractC2431c01 = this.b[i2];
            int i3 = this.a.n;
            Matrix matrix = AbstractC2431c01.b;
            abstractC2431c01.a(matrix, jz0, i3, canvas);
            this.c[i2].a(matrix, jz0, this.a.n, canvas);
        }
        if (this.w) {
            double d = 0;
            int iSin = (int) (Math.sin(Math.toRadians(d)) * this.a.o);
            int iCos = (int) (Math.cos(Math.toRadians(d)) * this.a.o);
            canvas.translate(-iSin, -iCos);
            canvas.drawPath(path, x);
            canvas.translate(iSin, iCos);
        }
    }

    public final void d(Canvas canvas, Paint paint, Path path, LZ0 lz0, RectF rectF) {
        if (!lz0.d(rectF)) {
            canvas.drawPath(path, paint);
        } else {
            float fA = lz0.f.a(rectF) * this.a.i;
            canvas.drawRoundRect(rectF, fA, fA, paint);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        Paint paint = this.n;
        paint.setColorFilter(this.s);
        int alpha = paint.getAlpha();
        int i = this.a.k;
        paint.setAlpha(((i + (i >>> 7)) * alpha) >>> 8);
        Paint paint2 = this.o;
        paint2.setColorFilter(this.t);
        paint2.setStrokeWidth(this.a.j);
        int alpha2 = paint2.getAlpha();
        int i2 = this.a.k;
        paint2.setAlpha(((i2 + (i2 >>> 7)) * alpha2) >>> 8);
        boolean z = this.e;
        Path path = this.g;
        if (z) {
            float f = -(g() ? paint2.getStrokeWidth() / 2.0f : 0.0f);
            LZ0 lz0 = this.a.a;
            C1701Vo1 c1701Vo1E = lz0.e();
            InterfaceC8274yz c6765r3 = lz0.e;
            if (!(c6765r3 instanceof C5882mQ0)) {
                c6765r3 = new C6765r3(f, c6765r3);
            }
            c1701Vo1E.e = c6765r3;
            InterfaceC8274yz c6765r32 = lz0.f;
            if (!(c6765r32 instanceof C5882mQ0)) {
                c6765r32 = new C6765r3(f, c6765r32);
            }
            c1701Vo1E.f = c6765r32;
            InterfaceC8274yz c6765r33 = lz0.h;
            if (!(c6765r33 instanceof C5882mQ0)) {
                c6765r33 = new C6765r3(f, c6765r33);
            }
            c1701Vo1E.h = c6765r33;
            InterfaceC8274yz c6765r34 = lz0.g;
            if (!(c6765r34 instanceof C5882mQ0)) {
                c6765r34 = new C6765r3(f, c6765r34);
            }
            c1701Vo1E.g = c6765r34;
            LZ0 lz0C = c1701Vo1E.c();
            this.m = lz0C;
            float f2 = this.a.i;
            RectF rectF = this.j;
            rectF.set(f());
            float strokeWidth = g() ? paint2.getStrokeWidth() / 2.0f : 0.0f;
            rectF.inset(strokeWidth, strokeWidth);
            this.r.b(lz0C, f2, rectF, null, this.h);
            a(path, f());
            this.e = false;
        }
        C5954mo0 c5954mo0 = this.a;
        c5954mo0.getClass();
        if (c5954mo0.n > 0) {
            int i3 = Build.VERSION.SDK_INT;
            if (!this.a.a.d(f()) && !path.isConvex() && i3 < 29) {
                canvas.save();
                double d = 0;
                canvas.translate((int) (Math.sin(Math.toRadians(d)) * this.a.o), (int) (Math.cos(Math.toRadians(d)) * this.a.o));
                if (this.w) {
                    RectF rectF2 = this.v;
                    int iWidth = (int) (rectF2.width() - getBounds().width());
                    int iHeight = (int) (rectF2.height() - getBounds().height());
                    if (iWidth < 0 || iHeight < 0) {
                        throw new IllegalStateException("Invalid shadow bounds. Check that the treatments result in a valid path.");
                    }
                    Bitmap bitmapCreateBitmap = Bitmap.createBitmap((this.a.n * 2) + ((int) rectF2.width()) + iWidth, (this.a.n * 2) + ((int) rectF2.height()) + iHeight, Bitmap.Config.ARGB_8888);
                    Canvas canvas2 = new Canvas(bitmapCreateBitmap);
                    float f3 = (getBounds().left - this.a.n) - iWidth;
                    float f4 = (getBounds().top - this.a.n) - iHeight;
                    canvas2.translate(-f3, -f4);
                    c(canvas2);
                    canvas.drawBitmap(bitmapCreateBitmap, f3, f4, (Paint) null);
                    bitmapCreateBitmap.recycle();
                    canvas.restore();
                } else {
                    c(canvas);
                    canvas.restore();
                }
            }
        }
        C5954mo0 c5954mo02 = this.a;
        Paint.Style style = c5954mo02.p;
        if (style == Paint.Style.FILL_AND_STROKE || style == Paint.Style.FILL) {
            d(canvas, paint, path, c5954mo02.a, f());
        }
        if (g()) {
            e(canvas);
        }
        paint.setAlpha(alpha);
        paint2.setAlpha(alpha2);
    }

    public void e(Canvas canvas) {
        Paint paint = this.o;
        Path path = this.h;
        LZ0 lz0 = this.m;
        RectF rectF = this.j;
        rectF.set(f());
        float strokeWidth = g() ? paint.getStrokeWidth() / 2.0f : 0.0f;
        rectF.inset(strokeWidth, strokeWidth);
        d(canvas, paint, path, lz0, rectF);
    }

    public final RectF f() {
        RectF rectF = this.i;
        rectF.set(getBounds());
        return rectF;
    }

    public final boolean g() {
        Paint.Style style = this.a.p;
        return (style == Paint.Style.FILL_AND_STROKE || style == Paint.Style.STROKE) && this.o.getStrokeWidth() > 0.0f;
    }

    @Override // android.graphics.drawable.Drawable
    public int getAlpha() {
        return this.a.k;
    }

    @Override // android.graphics.drawable.Drawable
    public final Drawable.ConstantState getConstantState() {
        return this.a;
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return -3;
    }

    @Override // android.graphics.drawable.Drawable
    public void getOutline(Outline outline) {
        this.a.getClass();
        if (this.a.a.d(f())) {
            outline.setRoundRect(getBounds(), this.a.a.e.a(f()) * this.a.i);
            return;
        }
        RectF rectFF = f();
        Path path = this.g;
        a(path, rectFF);
        int i = Build.VERSION.SDK_INT;
        if (i >= 30) {
            AbstractC6630qL.a(outline, path);
            return;
        }
        if (i >= 29) {
            try {
                AbstractC6439pL.a(outline, path);
            } catch (IllegalArgumentException unused) {
            }
        } else if (path.isConvex()) {
            AbstractC6439pL.a(outline, path);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean getPadding(Rect rect) {
        Rect rect2 = this.a.g;
        if (rect2 == null) {
            return super.getPadding(rect);
        }
        rect.set(rect2);
        return true;
    }

    @Override // android.graphics.drawable.Drawable
    public final Region getTransparentRegion() {
        Rect bounds = getBounds();
        Region region = this.k;
        region.set(bounds);
        RectF rectFF = f();
        Path path = this.g;
        a(path, rectFF);
        Region region2 = this.l;
        region2.setPath(path, region);
        region.op(region2, Region.Op.DIFFERENCE);
        return region;
    }

    public final void h(Context context) {
        this.a.b = new C6445pN(context);
        m();
    }

    public final void i(float f) {
        C5954mo0 c5954mo0 = this.a;
        if (c5954mo0.m != f) {
            c5954mo0.m = f;
            m();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void invalidateSelf() {
        this.e = true;
        super.invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isStateful() {
        ColorStateList colorStateList;
        ColorStateList colorStateList2;
        if (!super.isStateful() && ((colorStateList = this.a.e) == null || !colorStateList.isStateful())) {
            this.a.getClass();
            ColorStateList colorStateList3 = this.a.d;
            if ((colorStateList3 == null || !colorStateList3.isStateful()) && ((colorStateList2 = this.a.c) == null || !colorStateList2.isStateful())) {
                return false;
            }
        }
        return true;
    }

    public final void j(ColorStateList colorStateList) {
        C5954mo0 c5954mo0 = this.a;
        if (c5954mo0.c != colorStateList) {
            c5954mo0.c = colorStateList;
            onStateChange(getState());
        }
    }

    public final boolean k(int[] iArr) {
        boolean z;
        Paint paint;
        int color;
        int colorForState;
        Paint paint2;
        int color2;
        int colorForState2;
        if (this.a.c == null || color2 == (colorForState2 = this.a.c.getColorForState(iArr, (color2 = (paint2 = this.n).getColor())))) {
            z = false;
        } else {
            paint2.setColor(colorForState2);
            z = true;
        }
        if (this.a.d == null || color == (colorForState = this.a.d.getColorForState(iArr, (color = (paint = this.o).getColor())))) {
            return z;
        }
        paint.setColor(colorForState);
        return true;
    }

    public final boolean l() {
        PorterDuffColorFilter porterDuffColorFilter;
        PorterDuffColorFilter porterDuffColorFilter2 = this.s;
        PorterDuffColorFilter porterDuffColorFilter3 = this.t;
        C5954mo0 c5954mo0 = this.a;
        ColorStateList colorStateList = c5954mo0.e;
        PorterDuff.Mode mode = c5954mo0.f;
        Paint paint = this.n;
        if (colorStateList == null || mode == null) {
            int color = paint.getColor();
            int iB = b(color);
            this.u = iB;
            porterDuffColorFilter = iB != color ? new PorterDuffColorFilter(iB, PorterDuff.Mode.SRC_IN) : null;
        } else {
            int iB2 = b(colorStateList.getColorForState(getState(), 0));
            this.u = iB2;
            porterDuffColorFilter = new PorterDuffColorFilter(iB2, mode);
        }
        this.s = porterDuffColorFilter;
        this.a.getClass();
        this.t = null;
        this.a.getClass();
        return (Objects.equals(porterDuffColorFilter2, this.s) && Objects.equals(porterDuffColorFilter3, this.t)) ? false : true;
    }

    public final void m() {
        C5954mo0 c5954mo0 = this.a;
        float f = c5954mo0.m + 0.0f;
        c5954mo0.n = (int) Math.ceil(0.75f * f);
        this.a.o = (int) Math.ceil(f * 0.25f);
        l();
        super.invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public Drawable mutate() {
        this.a = new C5954mo0(this.a);
        return this;
    }

    @Override // android.graphics.drawable.Drawable
    public final void onBoundsChange(Rect rect) {
        this.e = true;
        super.onBoundsChange(rect);
    }

    @Override // android.graphics.drawable.Drawable
    public boolean onStateChange(int[] iArr) {
        boolean z = k(iArr) || l();
        if (z) {
            invalidateSelf();
        }
        return z;
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i) {
        C5954mo0 c5954mo0 = this.a;
        if (c5954mo0.k != i) {
            c5954mo0.k = i;
            super.invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        this.a.getClass();
        super.invalidateSelf();
    }

    @Override // defpackage.InterfaceC5228j01
    public final void setShapeAppearanceModel(LZ0 lz0) {
        this.a.a = lz0;
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTint(int i) {
        setTintList(ColorStateList.valueOf(i));
    }

    @Override // android.graphics.drawable.Drawable
    public void setTintList(ColorStateList colorStateList) {
        this.a.e = colorStateList;
        l();
        super.invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public void setTintMode(PorterDuff.Mode mode) {
        C5954mo0 c5954mo0 = this.a;
        if (c5954mo0.f != mode) {
            c5954mo0.f = mode;
            l();
            super.invalidateSelf();
        }
    }

    public C6145no0(Context context, AttributeSet attributeSet, int i, int i2) {
        this(LZ0.b(context, attributeSet, i, i2).c());
    }

    public C6145no0(LZ0 lz0) {
        this(new C5954mo0(lz0));
    }

    public C6145no0(C5954mo0 c5954mo0) {
        C1547Tp0 c1547Tp0;
        this.b = new AbstractC2431c01[4];
        this.c = new AbstractC2431c01[4];
        this.d = new BitSet(8);
        this.f = new Matrix();
        this.g = new Path();
        this.h = new Path();
        this.i = new RectF();
        this.j = new RectF();
        this.k = new Region();
        this.l = new Region();
        Paint paint = new Paint(1);
        this.n = paint;
        Paint paint2 = new Paint(1);
        this.o = paint2;
        this.p = new JZ0();
        if (Looper.getMainLooper().getThread() == Thread.currentThread()) {
            c1547Tp0 = MZ0.a;
        } else {
            c1547Tp0 = new C1547Tp0();
        }
        this.r = c1547Tp0;
        this.v = new RectF();
        this.w = true;
        this.a = c5954mo0;
        paint2.setStyle(Paint.Style.STROKE);
        paint.setStyle(Paint.Style.FILL);
        l();
        k(getState());
        this.q = new C0136Bm1(24, this);
    }
}
