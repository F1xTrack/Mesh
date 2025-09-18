package p000;

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
public class C10439no0 extends Drawable implements InterfaceC9824j01 {

    /* renamed from: x */
    public static final Paint f38515x;

    /* renamed from: a */
    public C10311mo0 f38516a;

    /* renamed from: b */
    public final AbstractC8923c01[] f38517b;

    /* renamed from: c */
    public final AbstractC8923c01[] f38518c;

    /* renamed from: d */
    public final BitSet f38519d;

    /* renamed from: e */
    public boolean f38520e;

    /* renamed from: f */
    public final Matrix f38521f;

    /* renamed from: g */
    public final Path f38522g;

    /* renamed from: h */
    public final Path f38523h;

    /* renamed from: i */
    public final RectF f38524i;

    /* renamed from: j */
    public final RectF f38525j;

    /* renamed from: k */
    public final Region f38526k;

    /* renamed from: l */
    public final Region f38527l;

    /* renamed from: m */
    public LZ0 f38528m;

    /* renamed from: n */
    public final Paint f38529n;

    /* renamed from: o */
    public final Paint f38530o;

    /* renamed from: p */
    public final JZ0 f38531p;

    /* renamed from: q */
    public final C7391Bm1 f38532q;

    /* renamed from: r */
    public final C8332Tp0 f38533r;

    /* renamed from: s */
    public PorterDuffColorFilter f38534s;

    /* renamed from: t */
    public PorterDuffColorFilter f38535t;

    /* renamed from: u */
    public int f38536u;

    /* renamed from: v */
    public final RectF f38537v;

    /* renamed from: w */
    public final boolean f38538w;

    static {
        Paint paint = new Paint(1);
        f38515x = paint;
        paint.setColor(-1);
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
    }

    public C10439no0() {
        this(new LZ0());
    }

    /* renamed from: a */
    public final void m23230a(Path path, RectF rectF) {
        C10311mo0 c10311mo0 = this.f38516a;
        this.f38533r.m7778b(c10311mo0.f37931a, c10311mo0.f37939i, rectF, this.f38532q, path);
        if (this.f38516a.f37938h != 1.0f) {
            Matrix matrix = this.f38521f;
            matrix.reset();
            float f = this.f38516a.f37938h;
            matrix.setScale(f, f, rectF.width() / 2.0f, rectF.height() / 2.0f);
            path.transform(matrix);
        }
        path.computeBounds(this.f38537v, true);
    }

    /* renamed from: b */
    public final int m23231b(int i) {
        int i2;
        C10311mo0 c10311mo0 = this.f38516a;
        float f = c10311mo0.f37943m + 0.0f + c10311mo0.f37942l;
        C6613pN c6613pN = c10311mo0.f37932b;
        if (c6613pN == null || !c6613pN.f40036a || AbstractC0749Lu.m5133f(i, KotlinVersion.MAX_COMPONENT_VALUE) != c6613pN.f40039d) {
            return i;
        }
        float fMin = (c6613pN.f40040e <= 0.0f || f <= 0.0f) ? 0.0f : Math.min(((((float) Math.log1p(f / r4)) * 4.5f) + 2.0f) / 100.0f, 1.0f);
        int iAlpha = Color.alpha(i);
        int iM22234i = AbstractC10036ke1.m22234i(AbstractC0749Lu.m5133f(i, KotlinVersion.MAX_COMPONENT_VALUE), fMin, c6613pN.f40037b);
        if (fMin > 0.0f && (i2 = c6613pN.f40038c) != 0) {
            iM22234i = AbstractC0749Lu.m5131d(AbstractC0749Lu.m5133f(i2, C6613pN.f40035f), iM22234i);
        }
        return AbstractC0749Lu.m5133f(iM22234i, iAlpha);
    }

    /* renamed from: c */
    public final void m23232c(Canvas canvas) {
        this.f38519d.cardinality();
        int i = this.f38516a.f37945o;
        Path path = this.f38522g;
        JZ0 jz0 = this.f38531p;
        if (i != 0) {
            canvas.drawPath(path, jz0.f5608a);
        }
        for (int i2 = 0; i2 < 4; i2++) {
            AbstractC8923c01 abstractC8923c01 = this.f38517b[i2];
            int i3 = this.f38516a.f37944n;
            Matrix matrix = AbstractC8923c01.f17257b;
            abstractC8923c01.mo8818a(matrix, jz0, i3, canvas);
            this.f38518c[i2].mo8818a(matrix, jz0, this.f38516a.f37944n, canvas);
        }
        if (this.f38538w) {
            double d = 0;
            int iSin = (int) (Math.sin(Math.toRadians(d)) * this.f38516a.f37945o);
            int iCos = (int) (Math.cos(Math.toRadians(d)) * this.f38516a.f37945o);
            canvas.translate(-iSin, -iCos);
            canvas.drawPath(path, f38515x);
            canvas.translate(iSin, iCos);
        }
    }

    /* renamed from: d */
    public final void m23233d(Canvas canvas, Paint paint, Path path, LZ0 lz0, RectF rectF) {
        if (!lz0.m5026d(rectF)) {
            canvas.drawPath(path, paint);
        } else {
            float fMo22818a = lz0.f6719f.mo22818a(rectF) * this.f38516a.f37939i;
            canvas.drawRoundRect(rectF, fMo22818a, fMo22818a, paint);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        Paint paint = this.f38529n;
        paint.setColorFilter(this.f38534s);
        int alpha = paint.getAlpha();
        int i = this.f38516a.f37941k;
        paint.setAlpha(((i + (i >>> 7)) * alpha) >>> 8);
        Paint paint2 = this.f38530o;
        paint2.setColorFilter(this.f38535t);
        paint2.setStrokeWidth(this.f38516a.f37940j);
        int alpha2 = paint2.getAlpha();
        int i2 = this.f38516a.f37941k;
        paint2.setAlpha(((i2 + (i2 >>> 7)) * alpha2) >>> 8);
        boolean z = this.f38520e;
        Path path = this.f38522g;
        if (z) {
            float f = -(m23235g() ? paint2.getStrokeWidth() / 2.0f : 0.0f);
            LZ0 lz0 = this.f38516a.f37931a;
            C8435Vo1 c8435Vo1M5027e = lz0.m5027e();
            InterfaceC7235yz c6719r3 = lz0.f6718e;
            if (!(c6719r3 instanceof C10263mQ0)) {
                c6719r3 = new C6719r3(f, c6719r3);
            }
            c8435Vo1M5027e.f12767e = c6719r3;
            InterfaceC7235yz c6719r32 = lz0.f6719f;
            if (!(c6719r32 instanceof C10263mQ0)) {
                c6719r32 = new C6719r3(f, c6719r32);
            }
            c8435Vo1M5027e.f12768f = c6719r32;
            InterfaceC7235yz c6719r33 = lz0.f6721h;
            if (!(c6719r33 instanceof C10263mQ0)) {
                c6719r33 = new C6719r3(f, c6719r33);
            }
            c8435Vo1M5027e.f12770h = c6719r33;
            InterfaceC7235yz c6719r34 = lz0.f6720g;
            if (!(c6719r34 instanceof C10263mQ0)) {
                c6719r34 = new C6719r3(f, c6719r34);
            }
            c8435Vo1M5027e.f12769g = c6719r34;
            LZ0 lz0M8561c = c8435Vo1M5027e.m8561c();
            this.f38528m = lz0M8561c;
            float f2 = this.f38516a.f37939i;
            RectF rectF = this.f38525j;
            rectF.set(m23234f());
            float strokeWidth = m23235g() ? paint2.getStrokeWidth() / 2.0f : 0.0f;
            rectF.inset(strokeWidth, strokeWidth);
            this.f38533r.m7778b(lz0M8561c, f2, rectF, null, this.f38523h);
            m23230a(path, m23234f());
            this.f38520e = false;
        }
        C10311mo0 c10311mo0 = this.f38516a;
        c10311mo0.getClass();
        if (c10311mo0.f37944n > 0) {
            int i3 = Build.VERSION.SDK_INT;
            if (!this.f38516a.f37931a.m5026d(m23234f()) && !path.isConvex() && i3 < 29) {
                canvas.save();
                double d = 0;
                canvas.translate((int) (Math.sin(Math.toRadians(d)) * this.f38516a.f37945o), (int) (Math.cos(Math.toRadians(d)) * this.f38516a.f37945o));
                if (this.f38538w) {
                    RectF rectF2 = this.f38537v;
                    int iWidth = (int) (rectF2.width() - getBounds().width());
                    int iHeight = (int) (rectF2.height() - getBounds().height());
                    if (iWidth < 0 || iHeight < 0) {
                        throw new IllegalStateException("Invalid shadow bounds. Check that the treatments result in a valid path.");
                    }
                    Bitmap bitmapCreateBitmap = Bitmap.createBitmap((this.f38516a.f37944n * 2) + ((int) rectF2.width()) + iWidth, (this.f38516a.f37944n * 2) + ((int) rectF2.height()) + iHeight, Bitmap.Config.ARGB_8888);
                    Canvas canvas2 = new Canvas(bitmapCreateBitmap);
                    float f3 = (getBounds().left - this.f38516a.f37944n) - iWidth;
                    float f4 = (getBounds().top - this.f38516a.f37944n) - iHeight;
                    canvas2.translate(-f3, -f4);
                    m23232c(canvas2);
                    canvas.drawBitmap(bitmapCreateBitmap, f3, f4, (Paint) null);
                    bitmapCreateBitmap.recycle();
                    canvas.restore();
                } else {
                    m23232c(canvas);
                    canvas.restore();
                }
            }
        }
        C10311mo0 c10311mo02 = this.f38516a;
        Paint.Style style = c10311mo02.f37946p;
        if (style == Paint.Style.FILL_AND_STROKE || style == Paint.Style.FILL) {
            m23233d(canvas, paint, path, c10311mo02.f37931a, m23234f());
        }
        if (m23235g()) {
            mo18194e(canvas);
        }
        paint.setAlpha(alpha);
        paint2.setAlpha(alpha2);
    }

    /* renamed from: e */
    public void mo18194e(Canvas canvas) {
        Paint paint = this.f38530o;
        Path path = this.f38523h;
        LZ0 lz0 = this.f38528m;
        RectF rectF = this.f38525j;
        rectF.set(m23234f());
        float strokeWidth = m23235g() ? paint.getStrokeWidth() / 2.0f : 0.0f;
        rectF.inset(strokeWidth, strokeWidth);
        m23233d(canvas, paint, path, lz0, rectF);
    }

    /* renamed from: f */
    public final RectF m23234f() {
        RectF rectF = this.f38524i;
        rectF.set(getBounds());
        return rectF;
    }

    /* renamed from: g */
    public final boolean m23235g() {
        Paint.Style style = this.f38516a.f37946p;
        return (style == Paint.Style.FILL_AND_STROKE || style == Paint.Style.STROKE) && this.f38530o.getStrokeWidth() > 0.0f;
    }

    @Override // android.graphics.drawable.Drawable
    public int getAlpha() {
        return this.f38516a.f37941k;
    }

    @Override // android.graphics.drawable.Drawable
    public final Drawable.ConstantState getConstantState() {
        return this.f38516a;
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return -3;
    }

    @Override // android.graphics.drawable.Drawable
    public void getOutline(Outline outline) {
        this.f38516a.getClass();
        if (this.f38516a.f37931a.m5026d(m23234f())) {
            outline.setRoundRect(getBounds(), this.f38516a.f37931a.f6718e.mo22818a(m23234f()) * this.f38516a.f37939i);
            return;
        }
        RectF rectFM23234f = m23234f();
        Path path = this.f38522g;
        m23230a(path, rectFM23234f);
        int i = Build.VERSION.SDK_INT;
        if (i >= 30) {
            AbstractC6674qL.m23984a(outline, path);
            return;
        }
        if (i >= 29) {
            try {
                AbstractC6611pL.m23740a(outline, path);
            } catch (IllegalArgumentException unused) {
            }
        } else if (path.isConvex()) {
            AbstractC6611pL.m23740a(outline, path);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean getPadding(Rect rect) {
        Rect rect2 = this.f38516a.f37937g;
        if (rect2 == null) {
            return super.getPadding(rect);
        }
        rect.set(rect2);
        return true;
    }

    @Override // android.graphics.drawable.Drawable
    public final Region getTransparentRegion() {
        Rect bounds = getBounds();
        Region region = this.f38526k;
        region.set(bounds);
        RectF rectFM23234f = m23234f();
        Path path = this.f38522g;
        m23230a(path, rectFM23234f);
        Region region2 = this.f38527l;
        region2.setPath(path, region);
        region.op(region2, Region.Op.DIFFERENCE);
        return region;
    }

    /* renamed from: h */
    public final void m23236h(Context context) {
        this.f38516a.f37932b = new C6613pN(context);
        m23241m();
    }

    /* renamed from: i */
    public final void m23237i(float f) {
        C10311mo0 c10311mo0 = this.f38516a;
        if (c10311mo0.f37943m != f) {
            c10311mo0.f37943m = f;
            m23241m();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void invalidateSelf() {
        this.f38520e = true;
        super.invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isStateful() {
        ColorStateList colorStateList;
        ColorStateList colorStateList2;
        if (!super.isStateful() && ((colorStateList = this.f38516a.f37935e) == null || !colorStateList.isStateful())) {
            this.f38516a.getClass();
            ColorStateList colorStateList3 = this.f38516a.f37934d;
            if ((colorStateList3 == null || !colorStateList3.isStateful()) && ((colorStateList2 = this.f38516a.f37933c) == null || !colorStateList2.isStateful())) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: j */
    public final void m23238j(ColorStateList colorStateList) {
        C10311mo0 c10311mo0 = this.f38516a;
        if (c10311mo0.f37933c != colorStateList) {
            c10311mo0.f37933c = colorStateList;
            onStateChange(getState());
        }
    }

    /* renamed from: k */
    public final boolean m23239k(int[] iArr) {
        boolean z;
        Paint paint;
        int color;
        int colorForState;
        Paint paint2;
        int color2;
        int colorForState2;
        if (this.f38516a.f37933c == null || color2 == (colorForState2 = this.f38516a.f37933c.getColorForState(iArr, (color2 = (paint2 = this.f38529n).getColor())))) {
            z = false;
        } else {
            paint2.setColor(colorForState2);
            z = true;
        }
        if (this.f38516a.f37934d == null || color == (colorForState = this.f38516a.f37934d.getColorForState(iArr, (color = (paint = this.f38530o).getColor())))) {
            return z;
        }
        paint.setColor(colorForState);
        return true;
    }

    /* renamed from: l */
    public final boolean m23240l() {
        PorterDuffColorFilter porterDuffColorFilter;
        PorterDuffColorFilter porterDuffColorFilter2 = this.f38534s;
        PorterDuffColorFilter porterDuffColorFilter3 = this.f38535t;
        C10311mo0 c10311mo0 = this.f38516a;
        ColorStateList colorStateList = c10311mo0.f37935e;
        PorterDuff.Mode mode = c10311mo0.f37936f;
        Paint paint = this.f38529n;
        if (colorStateList == null || mode == null) {
            int color = paint.getColor();
            int iM23231b = m23231b(color);
            this.f38536u = iM23231b;
            porterDuffColorFilter = iM23231b != color ? new PorterDuffColorFilter(iM23231b, PorterDuff.Mode.SRC_IN) : null;
        } else {
            int iM23231b2 = m23231b(colorStateList.getColorForState(getState(), 0));
            this.f38536u = iM23231b2;
            porterDuffColorFilter = new PorterDuffColorFilter(iM23231b2, mode);
        }
        this.f38534s = porterDuffColorFilter;
        this.f38516a.getClass();
        this.f38535t = null;
        this.f38516a.getClass();
        return (Objects.equals(porterDuffColorFilter2, this.f38534s) && Objects.equals(porterDuffColorFilter3, this.f38535t)) ? false : true;
    }

    /* renamed from: m */
    public final void m23241m() {
        C10311mo0 c10311mo0 = this.f38516a;
        float f = c10311mo0.f37943m + 0.0f;
        c10311mo0.f37944n = (int) Math.ceil(0.75f * f);
        this.f38516a.f37945o = (int) Math.ceil(f * 0.25f);
        m23240l();
        super.invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public Drawable mutate() {
        this.f38516a = new C10311mo0(this.f38516a);
        return this;
    }

    @Override // android.graphics.drawable.Drawable
    public final void onBoundsChange(Rect rect) {
        this.f38520e = true;
        super.onBoundsChange(rect);
    }

    @Override // android.graphics.drawable.Drawable
    public boolean onStateChange(int[] iArr) {
        boolean z = m23239k(iArr) || m23240l();
        if (z) {
            invalidateSelf();
        }
        return z;
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i) {
        C10311mo0 c10311mo0 = this.f38516a;
        if (c10311mo0.f37941k != i) {
            c10311mo0.f37941k = i;
            super.invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        this.f38516a.getClass();
        super.invalidateSelf();
    }

    @Override // p000.InterfaceC9824j01
    public final void setShapeAppearanceModel(LZ0 lz0) {
        this.f38516a.f37931a = lz0;
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTint(int i) {
        setTintList(ColorStateList.valueOf(i));
    }

    @Override // android.graphics.drawable.Drawable
    public void setTintList(ColorStateList colorStateList) {
        this.f38516a.f37935e = colorStateList;
        m23240l();
        super.invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public void setTintMode(PorterDuff.Mode mode) {
        C10311mo0 c10311mo0 = this.f38516a;
        if (c10311mo0.f37936f != mode) {
            c10311mo0.f37936f = mode;
            m23240l();
            super.invalidateSelf();
        }
    }

    public C10439no0(Context context, AttributeSet attributeSet, int i, int i2) {
        this(LZ0.m5024b(context, attributeSet, i, i2).m8561c());
    }

    public C10439no0(LZ0 lz0) {
        this(new C10311mo0(lz0));
    }

    public C10439no0(C10311mo0 c10311mo0) {
        C8332Tp0 c8332Tp0;
        this.f38517b = new AbstractC8923c01[4];
        this.f38518c = new AbstractC8923c01[4];
        this.f38519d = new BitSet(8);
        this.f38521f = new Matrix();
        this.f38522g = new Path();
        this.f38523h = new Path();
        this.f38524i = new RectF();
        this.f38525j = new RectF();
        this.f38526k = new Region();
        this.f38527l = new Region();
        Paint paint = new Paint(1);
        this.f38529n = paint;
        Paint paint2 = new Paint(1);
        this.f38530o = paint2;
        this.f38531p = new JZ0();
        if (Looper.getMainLooper().getThread() == Thread.currentThread()) {
            c8332Tp0 = MZ0.f7227a;
        } else {
            c8332Tp0 = new C8332Tp0();
        }
        this.f38533r = c8332Tp0;
        this.f38537v = new RectF();
        this.f38538w = true;
        this.f38516a = c10311mo0;
        paint2.setStyle(Paint.Style.STROKE);
        paint.setStyle(Paint.Style.FILL);
        m23240l();
        m23239k(getState());
        this.f38532q = new C7391Bm1(24, this);
    }
}
