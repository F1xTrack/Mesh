package defpackage;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Outline;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.OvalShape;
import android.text.SpannableStringBuilder;
import android.text.TextPaint;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.TypedValue;
import com.google.android.material.chip.Chip;
import java.lang.ref.WeakReference;
import java.util.Arrays;
import kotlin.KotlinVersion;

/* renamed from: Nr */
/* loaded from: classes.dex */
public final class C1084Nr extends C6145no0 implements Drawable.Callback, InterfaceC5832m91 {
    public static final int[] R1 = {R.attr.state_enabled};
    public static final ShapeDrawable S1 = new ShapeDrawable(new OvalShape());
    public float A;
    public int A1;
    public float B;
    public int B1;
    public ColorStateList C;
    public int C1;
    public float D;
    public boolean D1;
    public ColorStateList E;
    public int E1;
    public CharSequence F;
    public int F1;
    public boolean G;
    public ColorFilter G1;
    public Drawable H;
    public PorterDuffColorFilter H1;
    public ColorStateList I;
    public ColorStateList I1;
    public float J;
    public PorterDuff.Mode J1;
    public boolean K;
    public int[] K1;
    public boolean L;
    public ColorStateList L1;
    public Drawable M;
    public WeakReference M1;
    public RippleDrawable N;
    public TextUtils.TruncateAt N1;
    public ColorStateList O;
    public boolean O1;
    public float P;
    public int P1;
    public SpannableStringBuilder Q;
    public boolean Q1;
    public boolean R;
    public boolean S;
    public Drawable T;
    public ColorStateList U;
    public C1712Vs0 V;
    public C1712Vs0 W;
    public float X;
    public float Y;
    public float Z;
    public float a0;
    public float b0;
    public float c0;
    public float d0;
    public float e0;
    public final Context q1;
    public final Paint r1;
    public final Paint.FontMetrics s1;
    public final RectF t1;
    public final PointF u1;
    public final Path v1;
    public final C6023n91 w1;
    public int x1;
    public ColorStateList y;
    public int y1;
    public ColorStateList z;
    public int z1;

    public C1084Nr(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, ru.mes.dnevnik.R.attr.chipStyle, ru.mes.dnevnik.R.style.Widget_MaterialComponents_Chip_Action);
        this.B = -1.0f;
        this.r1 = new Paint(1);
        this.s1 = new Paint.FontMetrics();
        this.t1 = new RectF();
        this.u1 = new PointF();
        this.v1 = new Path();
        this.F1 = KotlinVersion.MAX_COMPONENT_VALUE;
        this.J1 = PorterDuff.Mode.SRC_IN;
        this.M1 = new WeakReference(null);
        h(context);
        this.q1 = context;
        C6023n91 c6023n91 = new C6023n91(this);
        this.w1 = c6023n91;
        this.F = "";
        c6023n91.a.density = context.getResources().getDisplayMetrics().density;
        int[] iArr = R1;
        setState(iArr);
        if (!Arrays.equals(this.K1, iArr)) {
            this.K1 = iArr;
            if (T()) {
                v(getState(), iArr);
            }
        }
        this.O1 = true;
        S1.setTint(-1);
    }

    public static void U(Drawable drawable) {
        if (drawable != null) {
            drawable.setCallback(null);
        }
    }

    public static boolean s(ColorStateList colorStateList) {
        return colorStateList != null && colorStateList.isStateful();
    }

    public static boolean t(Drawable drawable) {
        return drawable != null && drawable.isStateful();
    }

    public final void A(float f) {
        if (this.B != f) {
            this.B = f;
            C1701Vo1 c1701Vo1E = this.a.a.e();
            c1701Vo1E.e = new C7897x(f);
            c1701Vo1E.f = new C7897x(f);
            c1701Vo1E.g = new C7897x(f);
            c1701Vo1E.h = new C7897x(f);
            setShapeAppearanceModel(c1701Vo1E.c());
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void B(Drawable drawable) {
        Drawable drawable2;
        Drawable drawable3 = this.H;
        if (drawable3 != 0) {
            boolean z = drawable3 instanceof InterfaceC3845fp1;
            drawable2 = drawable3;
            if (z) {
                drawable2 = null;
            }
        } else {
            drawable2 = null;
        }
        if (drawable2 != drawable) {
            float fP = p();
            this.H = drawable != null ? drawable.mutate() : null;
            float fP2 = p();
            U(drawable2);
            if (S()) {
                n(this.H);
            }
            invalidateSelf();
            if (fP != fP2) {
                u();
            }
        }
    }

    public final void C(float f) {
        if (this.J != f) {
            float fP = p();
            this.J = f;
            float fP2 = p();
            invalidateSelf();
            if (fP != fP2) {
                u();
            }
        }
    }

    public final void D(ColorStateList colorStateList) {
        this.K = true;
        if (this.I != colorStateList) {
            this.I = colorStateList;
            if (S()) {
                AbstractC4135hL.h(this.H, colorStateList);
            }
            onStateChange(getState());
        }
    }

    public final void E(boolean z) {
        if (this.G != z) {
            boolean zS = S();
            this.G = z;
            boolean zS2 = S();
            if (zS != zS2) {
                if (zS2) {
                    n(this.H);
                } else {
                    U(this.H);
                }
                invalidateSelf();
                u();
            }
        }
    }

    public final void F(ColorStateList colorStateList) {
        if (this.C != colorStateList) {
            this.C = colorStateList;
            if (this.Q1) {
                C5954mo0 c5954mo0 = this.a;
                if (c5954mo0.d != colorStateList) {
                    c5954mo0.d = colorStateList;
                    onStateChange(getState());
                }
            }
            onStateChange(getState());
        }
    }

    public final void G(float f) {
        if (this.D != f) {
            this.D = f;
            this.r1.setStrokeWidth(f);
            if (this.Q1) {
                this.a.j = f;
                invalidateSelf();
            }
            invalidateSelf();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void H(Drawable drawable) {
        Drawable drawable2;
        Drawable drawable3 = this.M;
        if (drawable3 != 0) {
            boolean z = drawable3 instanceof InterfaceC3845fp1;
            drawable2 = drawable3;
            if (z) {
                drawable2 = null;
            }
        } else {
            drawable2 = null;
        }
        if (drawable2 != drawable) {
            float fQ = q();
            this.M = drawable != null ? drawable.mutate() : null;
            this.N = new RippleDrawable(AbstractC8126yB1.b(this.E), this.M, S1);
            float fQ2 = q();
            U(drawable2);
            if (T()) {
                n(this.M);
            }
            invalidateSelf();
            if (fQ != fQ2) {
                u();
            }
        }
    }

    public final void I(float f) {
        if (this.d0 != f) {
            this.d0 = f;
            invalidateSelf();
            if (T()) {
                u();
            }
        }
    }

    public final void J(float f) {
        if (this.P != f) {
            this.P = f;
            invalidateSelf();
            if (T()) {
                u();
            }
        }
    }

    public final void K(float f) {
        if (this.c0 != f) {
            this.c0 = f;
            invalidateSelf();
            if (T()) {
                u();
            }
        }
    }

    public final void L(ColorStateList colorStateList) {
        if (this.O != colorStateList) {
            this.O = colorStateList;
            if (T()) {
                AbstractC4135hL.h(this.M, colorStateList);
            }
            onStateChange(getState());
        }
    }

    public final void M(boolean z) {
        if (this.L != z) {
            boolean zT = T();
            this.L = z;
            boolean zT2 = T();
            if (zT != zT2) {
                if (zT2) {
                    n(this.M);
                } else {
                    U(this.M);
                }
                invalidateSelf();
                u();
            }
        }
    }

    public final void N(float f) {
        if (this.Z != f) {
            float fP = p();
            this.Z = f;
            float fP2 = p();
            invalidateSelf();
            if (fP != fP2) {
                u();
            }
        }
    }

    public final void O(float f) {
        if (this.Y != f) {
            float fP = p();
            this.Y = f;
            float fP2 = p();
            invalidateSelf();
            if (fP != fP2) {
                u();
            }
        }
    }

    public final void P(ColorStateList colorStateList) {
        if (this.E != colorStateList) {
            this.E = colorStateList;
            this.L1 = null;
            onStateChange(getState());
        }
    }

    public final void Q(C4101h91 c4101h91) {
        C6023n91 c6023n91 = this.w1;
        if (c6023n91.f != c4101h91) {
            c6023n91.f = c4101h91;
            if (c4101h91 != null) {
                TextPaint textPaint = c6023n91.a;
                Context context = this.q1;
                C0773Jr c0773Jr = c6023n91.b;
                c4101h91.f(context, textPaint, c0773Jr);
                InterfaceC5832m91 interfaceC5832m91 = (InterfaceC5832m91) c6023n91.e.get();
                if (interfaceC5832m91 != null) {
                    textPaint.drawableState = interfaceC5832m91.getState();
                }
                c4101h91.e(context, textPaint, c0773Jr);
                c6023n91.d = true;
            }
            InterfaceC5832m91 interfaceC5832m912 = (InterfaceC5832m91) c6023n91.e.get();
            if (interfaceC5832m912 != null) {
                C1084Nr c1084Nr = (C1084Nr) interfaceC5832m912;
                c1084Nr.u();
                c1084Nr.invalidateSelf();
                c1084Nr.onStateChange(interfaceC5832m912.getState());
            }
        }
    }

    public final boolean R() {
        return this.S && this.T != null && this.D1;
    }

    public final boolean S() {
        return this.G && this.H != null;
    }

    public final boolean T() {
        return this.L && this.M != null;
    }

    @Override // defpackage.C6145no0, android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        int i;
        RectF rectF;
        int i2;
        int i3;
        int i4;
        RectF rectF2;
        int iSave;
        Rect bounds = getBounds();
        if (bounds.isEmpty() || (i = this.F1) == 0) {
            return;
        }
        int iSaveLayerAlpha = i < 255 ? canvas.saveLayerAlpha(bounds.left, bounds.top, bounds.right, bounds.bottom, i) : 0;
        boolean z = this.Q1;
        Paint paint = this.r1;
        RectF rectF3 = this.t1;
        if (!z) {
            paint.setColor(this.x1);
            paint.setStyle(Paint.Style.FILL);
            rectF3.set(bounds);
            canvas.drawRoundRect(rectF3, r(), r(), paint);
        }
        if (!this.Q1) {
            paint.setColor(this.y1);
            paint.setStyle(Paint.Style.FILL);
            ColorFilter colorFilter = this.G1;
            if (colorFilter == null) {
                colorFilter = this.H1;
            }
            paint.setColorFilter(colorFilter);
            rectF3.set(bounds);
            canvas.drawRoundRect(rectF3, r(), r(), paint);
        }
        if (this.Q1) {
            super.draw(canvas);
        }
        if (this.D > 0.0f && !this.Q1) {
            paint.setColor(this.A1);
            paint.setStyle(Paint.Style.STROKE);
            if (!this.Q1) {
                ColorFilter colorFilter2 = this.G1;
                if (colorFilter2 == null) {
                    colorFilter2 = this.H1;
                }
                paint.setColorFilter(colorFilter2);
            }
            float f = bounds.left;
            float f2 = this.D / 2.0f;
            rectF3.set(f + f2, bounds.top + f2, bounds.right - f2, bounds.bottom - f2);
            float f3 = this.B - (this.D / 2.0f);
            canvas.drawRoundRect(rectF3, f3, f3, paint);
        }
        paint.setColor(this.B1);
        paint.setStyle(Paint.Style.FILL);
        rectF3.set(bounds);
        if (this.Q1) {
            RectF rectF4 = new RectF(bounds);
            Path path = this.v1;
            C5954mo0 c5954mo0 = this.a;
            this.r.b(c5954mo0.a, c5954mo0.i, rectF4, this.q, path);
            d(canvas, paint, path, this.a.a, f());
        } else {
            canvas.drawRoundRect(rectF3, r(), r(), paint);
        }
        if (S()) {
            o(bounds, rectF3);
            float f4 = rectF3.left;
            float f5 = rectF3.top;
            canvas.translate(f4, f5);
            this.H.setBounds(0, 0, (int) rectF3.width(), (int) rectF3.height());
            this.H.draw(canvas);
            canvas.translate(-f4, -f5);
        }
        if (R()) {
            o(bounds, rectF3);
            float f6 = rectF3.left;
            float f7 = rectF3.top;
            canvas.translate(f6, f7);
            this.T.setBounds(0, 0, (int) rectF3.width(), (int) rectF3.height());
            this.T.draw(canvas);
            canvas.translate(-f6, -f7);
        }
        if (!this.O1 || this.F == null) {
            rectF = rectF3;
            i2 = iSaveLayerAlpha;
            i3 = 0;
            i4 = 255;
        } else {
            PointF pointF = this.u1;
            pointF.set(0.0f, 0.0f);
            Paint.Align align = Paint.Align.LEFT;
            CharSequence charSequence = this.F;
            C6023n91 c6023n91 = this.w1;
            if (charSequence != null) {
                float fP = p() + this.X + this.a0;
                if (AbstractC4326iL.a(this) == 0) {
                    pointF.x = bounds.left + fP;
                } else {
                    pointF.x = bounds.right - fP;
                    align = Paint.Align.RIGHT;
                }
                float fCenterY = bounds.centerY();
                TextPaint textPaint = c6023n91.a;
                Paint.FontMetrics fontMetrics = this.s1;
                textPaint.getFontMetrics(fontMetrics);
                pointF.y = fCenterY - ((fontMetrics.descent + fontMetrics.ascent) / 2.0f);
            }
            rectF3.setEmpty();
            if (this.F != null) {
                float fP2 = p() + this.X + this.a0;
                float fQ = q() + this.e0 + this.b0;
                if (AbstractC4326iL.a(this) == 0) {
                    rectF3.left = bounds.left + fP2;
                    rectF3.right = bounds.right - fQ;
                } else {
                    rectF3.left = bounds.left + fQ;
                    rectF3.right = bounds.right - fP2;
                }
                rectF3.top = bounds.top;
                rectF3.bottom = bounds.bottom;
            }
            C4101h91 c4101h91 = c6023n91.f;
            TextPaint textPaint2 = c6023n91.a;
            if (c4101h91 != null) {
                textPaint2.drawableState = getState();
                c6023n91.f.e(this.q1, textPaint2, c6023n91.b);
            }
            textPaint2.setTextAlign(align);
            boolean z2 = Math.round(c6023n91.a(this.F.toString())) > Math.round(rectF3.width());
            if (z2) {
                iSave = canvas.save();
                canvas.clipRect(rectF3);
            } else {
                iSave = 0;
            }
            CharSequence charSequenceEllipsize = this.F;
            if (z2 && this.N1 != null) {
                charSequenceEllipsize = TextUtils.ellipsize(charSequenceEllipsize, textPaint2, rectF3.width(), this.N1);
            }
            CharSequence charSequence2 = charSequenceEllipsize;
            int length = charSequence2.length();
            float f8 = pointF.x;
            float f9 = pointF.y;
            rectF = rectF3;
            i2 = iSaveLayerAlpha;
            i3 = 0;
            i4 = 255;
            canvas.drawText(charSequence2, 0, length, f8, f9, textPaint2);
            if (z2) {
                canvas.restoreToCount(iSave);
            }
        }
        if (T()) {
            rectF.setEmpty();
            if (T()) {
                float f10 = this.e0 + this.d0;
                if (AbstractC4326iL.a(this) == 0) {
                    float f11 = bounds.right - f10;
                    rectF2 = rectF;
                    rectF2.right = f11;
                    rectF2.left = f11 - this.P;
                } else {
                    rectF2 = rectF;
                    float f12 = bounds.left + f10;
                    rectF2.left = f12;
                    rectF2.right = f12 + this.P;
                }
                float fExactCenterY = bounds.exactCenterY();
                float f13 = this.P;
                float f14 = fExactCenterY - (f13 / 2.0f);
                rectF2.top = f14;
                rectF2.bottom = f14 + f13;
            } else {
                rectF2 = rectF;
            }
            float f15 = rectF2.left;
            float f16 = rectF2.top;
            canvas.translate(f15, f16);
            this.M.setBounds(i3, i3, (int) rectF2.width(), (int) rectF2.height());
            this.N.setBounds(this.M.getBounds());
            this.N.jumpToCurrentState();
            this.N.draw(canvas);
            canvas.translate(-f15, -f16);
        }
        if (this.F1 < i4) {
            canvas.restoreToCount(i2);
        }
    }

    @Override // defpackage.C6145no0, android.graphics.drawable.Drawable
    public final int getAlpha() {
        return this.F1;
    }

    @Override // android.graphics.drawable.Drawable
    public final ColorFilter getColorFilter() {
        return this.G1;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        return (int) this.A;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        return Math.min(Math.round(q() + this.w1.a(this.F.toString()) + p() + this.X + this.a0 + this.b0 + this.e0), this.P1);
    }

    @Override // defpackage.C6145no0, android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -3;
    }

    @Override // defpackage.C6145no0, android.graphics.drawable.Drawable
    public final void getOutline(Outline outline) {
        if (this.Q1) {
            super.getOutline(outline);
            return;
        }
        Rect bounds = getBounds();
        if (bounds.isEmpty()) {
            outline.setRoundRect(0, 0, getIntrinsicWidth(), (int) this.A, this.B);
        } else {
            outline.setRoundRect(bounds, this.B);
        }
        outline.setAlpha(this.F1 / 255.0f);
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void invalidateDrawable(Drawable drawable) {
        Drawable.Callback callback = getCallback();
        if (callback != null) {
            callback.invalidateDrawable(this);
        }
    }

    @Override // defpackage.C6145no0, android.graphics.drawable.Drawable
    public final boolean isStateful() {
        C4101h91 c4101h91;
        ColorStateList colorStateList;
        return s(this.y) || s(this.z) || s(this.C) || !((c4101h91 = this.w1.f) == null || (colorStateList = c4101h91.j) == null || !colorStateList.isStateful()) || ((this.S && this.T != null && this.R) || t(this.H) || t(this.T) || s(this.I1));
    }

    public final void n(Drawable drawable) {
        if (drawable == null) {
            return;
        }
        drawable.setCallback(this);
        AbstractC4326iL.b(drawable, AbstractC4326iL.a(this));
        drawable.setLevel(getLevel());
        drawable.setVisible(isVisible(), false);
        if (drawable == this.M) {
            if (drawable.isStateful()) {
                drawable.setState(this.K1);
            }
            AbstractC4135hL.h(drawable, this.O);
            return;
        }
        Drawable drawable2 = this.H;
        if (drawable == drawable2 && this.K) {
            AbstractC4135hL.h(drawable2, this.I);
        }
        if (drawable.isStateful()) {
            drawable.setState(getState());
        }
    }

    public final void o(Rect rect, RectF rectF) {
        rectF.setEmpty();
        if (S() || R()) {
            float f = this.X + this.Y;
            Drawable drawable = this.D1 ? this.T : this.H;
            float intrinsicWidth = this.J;
            if (intrinsicWidth <= 0.0f && drawable != null) {
                intrinsicWidth = drawable.getIntrinsicWidth();
            }
            if (AbstractC4326iL.a(this) == 0) {
                float f2 = rect.left + f;
                rectF.left = f2;
                rectF.right = f2 + intrinsicWidth;
            } else {
                float f3 = rect.right - f;
                rectF.right = f3;
                rectF.left = f3 - intrinsicWidth;
            }
            Drawable drawable2 = this.D1 ? this.T : this.H;
            float fCeil = this.J;
            if (fCeil <= 0.0f && drawable2 != null) {
                fCeil = (float) Math.ceil(TypedValue.applyDimension(1, 24, this.q1.getResources().getDisplayMetrics()));
                if (drawable2.getIntrinsicHeight() <= fCeil) {
                    fCeil = drawable2.getIntrinsicHeight();
                }
            }
            float fExactCenterY = rect.exactCenterY() - (fCeil / 2.0f);
            rectF.top = fExactCenterY;
            rectF.bottom = fExactCenterY + fCeil;
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean onLayoutDirectionChanged(int i) {
        boolean zOnLayoutDirectionChanged = super.onLayoutDirectionChanged(i);
        if (S()) {
            zOnLayoutDirectionChanged |= AbstractC4326iL.b(this.H, i);
        }
        if (R()) {
            zOnLayoutDirectionChanged |= AbstractC4326iL.b(this.T, i);
        }
        if (T()) {
            zOnLayoutDirectionChanged |= AbstractC4326iL.b(this.M, i);
        }
        if (!zOnLayoutDirectionChanged) {
            return true;
        }
        invalidateSelf();
        return true;
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean onLevelChange(int i) {
        boolean zOnLevelChange = super.onLevelChange(i);
        if (S()) {
            zOnLevelChange |= this.H.setLevel(i);
        }
        if (R()) {
            zOnLevelChange |= this.T.setLevel(i);
        }
        if (T()) {
            zOnLevelChange |= this.M.setLevel(i);
        }
        if (zOnLevelChange) {
            invalidateSelf();
        }
        return zOnLevelChange;
    }

    @Override // defpackage.C6145no0, android.graphics.drawable.Drawable
    public final boolean onStateChange(int[] iArr) {
        if (this.Q1) {
            super.onStateChange(iArr);
        }
        return v(iArr, this.K1);
    }

    public final float p() {
        if (!S() && !R()) {
            return 0.0f;
        }
        float f = this.Y;
        Drawable drawable = this.D1 ? this.T : this.H;
        float intrinsicWidth = this.J;
        if (intrinsicWidth <= 0.0f && drawable != null) {
            intrinsicWidth = drawable.getIntrinsicWidth();
        }
        return intrinsicWidth + f + this.Z;
    }

    public final float q() {
        if (T()) {
            return this.c0 + this.P + this.d0;
        }
        return 0.0f;
    }

    public final float r() {
        return this.Q1 ? this.a.a.e.a(f()) : this.B;
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void scheduleDrawable(Drawable drawable, Runnable runnable, long j) {
        Drawable.Callback callback = getCallback();
        if (callback != null) {
            callback.scheduleDrawable(this, runnable, j);
        }
    }

    @Override // defpackage.C6145no0, android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
        if (this.F1 != i) {
            this.F1 = i;
            invalidateSelf();
        }
    }

    @Override // defpackage.C6145no0, android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        if (this.G1 != colorFilter) {
            this.G1 = colorFilter;
            invalidateSelf();
        }
    }

    @Override // defpackage.C6145no0, android.graphics.drawable.Drawable
    public final void setTintList(ColorStateList colorStateList) {
        if (this.I1 != colorStateList) {
            this.I1 = colorStateList;
            onStateChange(getState());
        }
    }

    @Override // defpackage.C6145no0, android.graphics.drawable.Drawable
    public final void setTintMode(PorterDuff.Mode mode) {
        if (this.J1 != mode) {
            this.J1 = mode;
            ColorStateList colorStateList = this.I1;
            this.H1 = (colorStateList == null || mode == null) ? null : new PorterDuffColorFilter(colorStateList.getColorForState(getState(), 0), mode);
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean setVisible(boolean z, boolean z2) {
        boolean visible = super.setVisible(z, z2);
        if (S()) {
            visible |= this.H.setVisible(z, z2);
        }
        if (R()) {
            visible |= this.T.setVisible(z, z2);
        }
        if (T()) {
            visible |= this.M.setVisible(z, z2);
        }
        if (visible) {
            invalidateSelf();
        }
        return visible;
    }

    public final void u() {
        InterfaceC1006Mr interfaceC1006Mr = (InterfaceC1006Mr) this.M1.get();
        if (interfaceC1006Mr != null) {
            Chip chip = (Chip) interfaceC1006Mr;
            chip.c(chip.p);
            chip.requestLayout();
            chip.invalidateOutline();
        }
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        Drawable.Callback callback = getCallback();
        if (callback != null) {
            callback.unscheduleDrawable(this, runnable);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:185:0x00a3  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean v(int[] r12, int[] r13) {
        /*
            Method dump skipped, instructions count: 383
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C1084Nr.v(int[], int[]):boolean");
    }

    public final void w(boolean z) {
        if (this.R != z) {
            this.R = z;
            float fP = p();
            if (!z && this.D1) {
                this.D1 = false;
            }
            float fP2 = p();
            invalidateSelf();
            if (fP != fP2) {
                u();
            }
        }
    }

    public final void x(Drawable drawable) {
        if (this.T != drawable) {
            float fP = p();
            this.T = drawable;
            float fP2 = p();
            U(this.T);
            n(this.T);
            invalidateSelf();
            if (fP != fP2) {
                u();
            }
        }
    }

    public final void y(ColorStateList colorStateList) {
        Drawable drawable;
        if (this.U != colorStateList) {
            this.U = colorStateList;
            if (this.S && (drawable = this.T) != null && this.R) {
                AbstractC4135hL.h(drawable, colorStateList);
            }
            onStateChange(getState());
        }
    }

    public final void z(boolean z) {
        if (this.S != z) {
            boolean zR = R();
            this.S = z;
            boolean zR2 = R();
            if (zR != zR2) {
                if (zR2) {
                    n(this.T);
                } else {
                    U(this.T);
                }
                invalidateSelf();
                u();
            }
        }
    }
}
