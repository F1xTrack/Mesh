package p000;

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
public final class C0872Nr extends C10439no0 implements Drawable.Callback, InterfaceC10230m91 {

    /* renamed from: R1 */
    public static final int[] f8032R1 = {R.attr.state_enabled};

    /* renamed from: S1 */
    public static final ShapeDrawable f8033S1 = new ShapeDrawable(new OvalShape());

    /* renamed from: A */
    public float f8034A;

    /* renamed from: A1 */
    public int f8035A1;

    /* renamed from: B */
    public float f8036B;

    /* renamed from: B1 */
    public int f8037B1;

    /* renamed from: C */
    public ColorStateList f8038C;

    /* renamed from: C1 */
    public int f8039C1;

    /* renamed from: D */
    public float f8040D;

    /* renamed from: D1 */
    public boolean f8041D1;

    /* renamed from: E */
    public ColorStateList f8042E;

    /* renamed from: E1 */
    public int f8043E1;

    /* renamed from: F */
    public CharSequence f8044F;

    /* renamed from: F1 */
    public int f8045F1;

    /* renamed from: G */
    public boolean f8046G;

    /* renamed from: G1 */
    public ColorFilter f8047G1;

    /* renamed from: H */
    public Drawable f8048H;

    /* renamed from: H1 */
    public PorterDuffColorFilter f8049H1;

    /* renamed from: I */
    public ColorStateList f8050I;

    /* renamed from: I1 */
    public ColorStateList f8051I1;

    /* renamed from: J */
    public float f8052J;

    /* renamed from: J1 */
    public PorterDuff.Mode f8053J1;

    /* renamed from: K */
    public boolean f8054K;

    /* renamed from: K1 */
    public int[] f8055K1;

    /* renamed from: L */
    public boolean f8056L;

    /* renamed from: L1 */
    public ColorStateList f8057L1;

    /* renamed from: M */
    public Drawable f8058M;

    /* renamed from: M1 */
    public WeakReference f8059M1;

    /* renamed from: N */
    public RippleDrawable f8060N;

    /* renamed from: N1 */
    public TextUtils.TruncateAt f8061N1;

    /* renamed from: O */
    public ColorStateList f8062O;

    /* renamed from: O1 */
    public boolean f8063O1;

    /* renamed from: P */
    public float f8064P;

    /* renamed from: P1 */
    public int f8065P1;

    /* renamed from: Q */
    public SpannableStringBuilder f8066Q;

    /* renamed from: Q1 */
    public boolean f8067Q1;

    /* renamed from: R */
    public boolean f8068R;

    /* renamed from: S */
    public boolean f8069S;

    /* renamed from: T */
    public Drawable f8070T;

    /* renamed from: U */
    public ColorStateList f8071U;

    /* renamed from: V */
    public C8442Vs0 f8072V;

    /* renamed from: W */
    public C8442Vs0 f8073W;

    /* renamed from: X */
    public float f8074X;

    /* renamed from: Y */
    public float f8075Y;

    /* renamed from: Z */
    public float f8076Z;

    /* renamed from: a0 */
    public float f8077a0;

    /* renamed from: b0 */
    public float f8078b0;

    /* renamed from: c0 */
    public float f8079c0;

    /* renamed from: d0 */
    public float f8080d0;

    /* renamed from: e0 */
    public float f8081e0;

    /* renamed from: q1 */
    public final Context f8082q1;

    /* renamed from: r1 */
    public final Paint f8083r1;

    /* renamed from: s1 */
    public final Paint.FontMetrics f8084s1;

    /* renamed from: t1 */
    public final RectF f8085t1;

    /* renamed from: u1 */
    public final PointF f8086u1;

    /* renamed from: v1 */
    public final Path f8087v1;

    /* renamed from: w1 */
    public final C10358n91 f8088w1;

    /* renamed from: x1 */
    public int f8089x1;

    /* renamed from: y */
    public ColorStateList f8090y;

    /* renamed from: y1 */
    public int f8091y1;

    /* renamed from: z */
    public ColorStateList f8092z;

    /* renamed from: z1 */
    public int f8093z1;

    public C0872Nr(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, ru.mes.dnevnik.R.attr.chipStyle, ru.mes.dnevnik.R.style.Widget_MaterialComponents_Chip_Action);
        this.f8036B = -1.0f;
        this.f8083r1 = new Paint(1);
        this.f8084s1 = new Paint.FontMetrics();
        this.f8085t1 = new RectF();
        this.f8086u1 = new PointF();
        this.f8087v1 = new Path();
        this.f8045F1 = KotlinVersion.MAX_COMPONENT_VALUE;
        this.f8053J1 = PorterDuff.Mode.SRC_IN;
        this.f8059M1 = new WeakReference(null);
        m23236h(context);
        this.f8082q1 = context;
        C10358n91 c10358n91 = new C10358n91(this);
        this.f8088w1 = c10358n91;
        this.f8044F = "";
        c10358n91.f38149a.density = context.getResources().getDisplayMetrics().density;
        int[] iArr = f8032R1;
        setState(iArr);
        if (!Arrays.equals(this.f8055K1, iArr)) {
            this.f8055K1 = iArr;
            if (m5883T()) {
                m5890v(getState(), iArr);
            }
        }
        this.f8063O1 = true;
        f8033S1.setTint(-1);
    }

    /* renamed from: U */
    public static void m5861U(Drawable drawable) {
        if (drawable != null) {
            drawable.setCallback(null);
        }
    }

    /* renamed from: s */
    public static boolean m5862s(ColorStateList colorStateList) {
        return colorStateList != null && colorStateList.isStateful();
    }

    /* renamed from: t */
    public static boolean m5863t(Drawable drawable) {
        return drawable != null && drawable.isStateful();
    }

    /* renamed from: A */
    public final void m5864A(float f) {
        if (this.f8036B != f) {
            this.f8036B = f;
            C8435Vo1 c8435Vo1M5027e = this.f38516a.f37931a.m5027e();
            c8435Vo1M5027e.f12767e = new C7110x(f);
            c8435Vo1M5027e.f12768f = new C7110x(f);
            c8435Vo1M5027e.f12769g = new C7110x(f);
            c8435Vo1M5027e.f12770h = new C7110x(f);
            setShapeAppearanceModel(c8435Vo1M5027e.m8561c());
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: B */
    public final void m5865B(Drawable drawable) {
        Drawable drawable2;
        Drawable drawable3 = this.f8048H;
        if (drawable3 != 0) {
            boolean z = drawable3 instanceof InterfaceC9418fp1;
            drawable2 = drawable3;
            if (z) {
                drawable2 = null;
            }
        } else {
            drawable2 = null;
        }
        if (drawable2 != drawable) {
            float fM5886p = m5886p();
            this.f8048H = drawable != null ? drawable.mutate() : null;
            float fM5886p2 = m5886p();
            m5861U(drawable2);
            if (m5882S()) {
                m5884n(this.f8048H);
            }
            invalidateSelf();
            if (fM5886p != fM5886p2) {
                m5889u();
            }
        }
    }

    /* renamed from: C */
    public final void m5866C(float f) {
        if (this.f8052J != f) {
            float fM5886p = m5886p();
            this.f8052J = f;
            float fM5886p2 = m5886p();
            invalidateSelf();
            if (fM5886p != fM5886p2) {
                m5889u();
            }
        }
    }

    /* renamed from: D */
    public final void m5867D(ColorStateList colorStateList) {
        this.f8054K = true;
        if (this.f8050I != colorStateList) {
            this.f8050I = colorStateList;
            if (m5882S()) {
                AbstractC4173hL.m18806h(this.f8048H, colorStateList);
            }
            onStateChange(getState());
        }
    }

    /* renamed from: E */
    public final void m5868E(boolean z) {
        if (this.f8046G != z) {
            boolean zM5882S = m5882S();
            this.f8046G = z;
            boolean zM5882S2 = m5882S();
            if (zM5882S != zM5882S2) {
                if (zM5882S2) {
                    m5884n(this.f8048H);
                } else {
                    m5861U(this.f8048H);
                }
                invalidateSelf();
                m5889u();
            }
        }
    }

    /* renamed from: F */
    public final void m5869F(ColorStateList colorStateList) {
        if (this.f8038C != colorStateList) {
            this.f8038C = colorStateList;
            if (this.f8067Q1) {
                C10311mo0 c10311mo0 = this.f38516a;
                if (c10311mo0.f37934d != colorStateList) {
                    c10311mo0.f37934d = colorStateList;
                    onStateChange(getState());
                }
            }
            onStateChange(getState());
        }
    }

    /* renamed from: G */
    public final void m5870G(float f) {
        if (this.f8040D != f) {
            this.f8040D = f;
            this.f8083r1.setStrokeWidth(f);
            if (this.f8067Q1) {
                this.f38516a.f37940j = f;
                invalidateSelf();
            }
            invalidateSelf();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: H */
    public final void m5871H(Drawable drawable) {
        Drawable drawable2;
        Drawable drawable3 = this.f8058M;
        if (drawable3 != 0) {
            boolean z = drawable3 instanceof InterfaceC9418fp1;
            drawable2 = drawable3;
            if (z) {
                drawable2 = null;
            }
        } else {
            drawable2 = null;
        }
        if (drawable2 != drawable) {
            float fM5887q = m5887q();
            this.f8058M = drawable != null ? drawable.mutate() : null;
            this.f8060N = new RippleDrawable(AbstractC11767yB1.m26092b(this.f8042E), this.f8058M, f8033S1);
            float fM5887q2 = m5887q();
            m5861U(drawable2);
            if (m5883T()) {
                m5884n(this.f8058M);
            }
            invalidateSelf();
            if (fM5887q != fM5887q2) {
                m5889u();
            }
        }
    }

    /* renamed from: I */
    public final void m5872I(float f) {
        if (this.f8080d0 != f) {
            this.f8080d0 = f;
            invalidateSelf();
            if (m5883T()) {
                m5889u();
            }
        }
    }

    /* renamed from: J */
    public final void m5873J(float f) {
        if (this.f8064P != f) {
            this.f8064P = f;
            invalidateSelf();
            if (m5883T()) {
                m5889u();
            }
        }
    }

    /* renamed from: K */
    public final void m5874K(float f) {
        if (this.f8079c0 != f) {
            this.f8079c0 = f;
            invalidateSelf();
            if (m5883T()) {
                m5889u();
            }
        }
    }

    /* renamed from: L */
    public final void m5875L(ColorStateList colorStateList) {
        if (this.f8062O != colorStateList) {
            this.f8062O = colorStateList;
            if (m5883T()) {
                AbstractC4173hL.m18806h(this.f8058M, colorStateList);
            }
            onStateChange(getState());
        }
    }

    /* renamed from: M */
    public final void m5876M(boolean z) {
        if (this.f8056L != z) {
            boolean zM5883T = m5883T();
            this.f8056L = z;
            boolean zM5883T2 = m5883T();
            if (zM5883T != zM5883T2) {
                if (zM5883T2) {
                    m5884n(this.f8058M);
                } else {
                    m5861U(this.f8058M);
                }
                invalidateSelf();
                m5889u();
            }
        }
    }

    /* renamed from: N */
    public final void m5877N(float f) {
        if (this.f8076Z != f) {
            float fM5886p = m5886p();
            this.f8076Z = f;
            float fM5886p2 = m5886p();
            invalidateSelf();
            if (fM5886p != fM5886p2) {
                m5889u();
            }
        }
    }

    /* renamed from: O */
    public final void m5878O(float f) {
        if (this.f8075Y != f) {
            float fM5886p = m5886p();
            this.f8075Y = f;
            float fM5886p2 = m5886p();
            invalidateSelf();
            if (fM5886p != fM5886p2) {
                m5889u();
            }
        }
    }

    /* renamed from: P */
    public final void m5879P(ColorStateList colorStateList) {
        if (this.f8042E != colorStateList) {
            this.f8042E = colorStateList;
            this.f8057L1 = null;
            onStateChange(getState());
        }
    }

    /* renamed from: Q */
    public final void m5880Q(C9590h91 c9590h91) {
        C10358n91 c10358n91 = this.f8088w1;
        if (c10358n91.f38154f != c9590h91) {
            c10358n91.f38154f = c9590h91;
            if (c9590h91 != null) {
                TextPaint textPaint = c10358n91.f38149a;
                Context context = this.f8082q1;
                C0621Jr c0621Jr = c10358n91.f38150b;
                c9590h91.m18733f(context, textPaint, c0621Jr);
                InterfaceC10230m91 interfaceC10230m91 = (InterfaceC10230m91) c10358n91.f38153e.get();
                if (interfaceC10230m91 != null) {
                    textPaint.drawableState = interfaceC10230m91.getState();
                }
                c9590h91.m18732e(context, textPaint, c0621Jr);
                c10358n91.f38152d = true;
            }
            InterfaceC10230m91 interfaceC10230m912 = (InterfaceC10230m91) c10358n91.f38153e.get();
            if (interfaceC10230m912 != null) {
                C0872Nr c0872Nr = (C0872Nr) interfaceC10230m912;
                c0872Nr.m5889u();
                c0872Nr.invalidateSelf();
                c0872Nr.onStateChange(interfaceC10230m912.getState());
            }
        }
    }

    /* renamed from: R */
    public final boolean m5881R() {
        return this.f8069S && this.f8070T != null && this.f8041D1;
    }

    /* renamed from: S */
    public final boolean m5882S() {
        return this.f8046G && this.f8048H != null;
    }

    /* renamed from: T */
    public final boolean m5883T() {
        return this.f8056L && this.f8058M != null;
    }

    @Override // p000.C10439no0, android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        int i;
        RectF rectF;
        int i2;
        int i3;
        int i4;
        RectF rectF2;
        int iSave;
        Rect bounds = getBounds();
        if (bounds.isEmpty() || (i = this.f8045F1) == 0) {
            return;
        }
        int iSaveLayerAlpha = i < 255 ? canvas.saveLayerAlpha(bounds.left, bounds.top, bounds.right, bounds.bottom, i) : 0;
        boolean z = this.f8067Q1;
        Paint paint = this.f8083r1;
        RectF rectF3 = this.f8085t1;
        if (!z) {
            paint.setColor(this.f8089x1);
            paint.setStyle(Paint.Style.FILL);
            rectF3.set(bounds);
            canvas.drawRoundRect(rectF3, m5888r(), m5888r(), paint);
        }
        if (!this.f8067Q1) {
            paint.setColor(this.f8091y1);
            paint.setStyle(Paint.Style.FILL);
            ColorFilter colorFilter = this.f8047G1;
            if (colorFilter == null) {
                colorFilter = this.f8049H1;
            }
            paint.setColorFilter(colorFilter);
            rectF3.set(bounds);
            canvas.drawRoundRect(rectF3, m5888r(), m5888r(), paint);
        }
        if (this.f8067Q1) {
            super.draw(canvas);
        }
        if (this.f8040D > 0.0f && !this.f8067Q1) {
            paint.setColor(this.f8035A1);
            paint.setStyle(Paint.Style.STROKE);
            if (!this.f8067Q1) {
                ColorFilter colorFilter2 = this.f8047G1;
                if (colorFilter2 == null) {
                    colorFilter2 = this.f8049H1;
                }
                paint.setColorFilter(colorFilter2);
            }
            float f = bounds.left;
            float f2 = this.f8040D / 2.0f;
            rectF3.set(f + f2, bounds.top + f2, bounds.right - f2, bounds.bottom - f2);
            float f3 = this.f8036B - (this.f8040D / 2.0f);
            canvas.drawRoundRect(rectF3, f3, f3, paint);
        }
        paint.setColor(this.f8037B1);
        paint.setStyle(Paint.Style.FILL);
        rectF3.set(bounds);
        if (this.f8067Q1) {
            RectF rectF4 = new RectF(bounds);
            Path path = this.f8087v1;
            C10311mo0 c10311mo0 = this.f38516a;
            this.f38533r.m7778b(c10311mo0.f37931a, c10311mo0.f37939i, rectF4, this.f38532q, path);
            m23233d(canvas, paint, path, this.f38516a.f37931a, m23234f());
        } else {
            canvas.drawRoundRect(rectF3, m5888r(), m5888r(), paint);
        }
        if (m5882S()) {
            m5885o(bounds, rectF3);
            float f4 = rectF3.left;
            float f5 = rectF3.top;
            canvas.translate(f4, f5);
            this.f8048H.setBounds(0, 0, (int) rectF3.width(), (int) rectF3.height());
            this.f8048H.draw(canvas);
            canvas.translate(-f4, -f5);
        }
        if (m5881R()) {
            m5885o(bounds, rectF3);
            float f6 = rectF3.left;
            float f7 = rectF3.top;
            canvas.translate(f6, f7);
            this.f8070T.setBounds(0, 0, (int) rectF3.width(), (int) rectF3.height());
            this.f8070T.draw(canvas);
            canvas.translate(-f6, -f7);
        }
        if (!this.f8063O1 || this.f8044F == null) {
            rectF = rectF3;
            i2 = iSaveLayerAlpha;
            i3 = 0;
            i4 = 255;
        } else {
            PointF pointF = this.f8086u1;
            pointF.set(0.0f, 0.0f);
            Paint.Align align = Paint.Align.LEFT;
            CharSequence charSequence = this.f8044F;
            C10358n91 c10358n91 = this.f8088w1;
            if (charSequence != null) {
                float fM5886p = m5886p() + this.f8074X + this.f8077a0;
                if (AbstractC4236iL.m19003a(this) == 0) {
                    pointF.x = bounds.left + fM5886p;
                } else {
                    pointF.x = bounds.right - fM5886p;
                    align = Paint.Align.RIGHT;
                }
                float fCenterY = bounds.centerY();
                TextPaint textPaint = c10358n91.f38149a;
                Paint.FontMetrics fontMetrics = this.f8084s1;
                textPaint.getFontMetrics(fontMetrics);
                pointF.y = fCenterY - ((fontMetrics.descent + fontMetrics.ascent) / 2.0f);
            }
            rectF3.setEmpty();
            if (this.f8044F != null) {
                float fM5886p2 = m5886p() + this.f8074X + this.f8077a0;
                float fM5887q = m5887q() + this.f8081e0 + this.f8078b0;
                if (AbstractC4236iL.m19003a(this) == 0) {
                    rectF3.left = bounds.left + fM5886p2;
                    rectF3.right = bounds.right - fM5887q;
                } else {
                    rectF3.left = bounds.left + fM5887q;
                    rectF3.right = bounds.right - fM5886p2;
                }
                rectF3.top = bounds.top;
                rectF3.bottom = bounds.bottom;
            }
            C9590h91 c9590h91 = c10358n91.f38154f;
            TextPaint textPaint2 = c10358n91.f38149a;
            if (c9590h91 != null) {
                textPaint2.drawableState = getState();
                c10358n91.f38154f.m18732e(this.f8082q1, textPaint2, c10358n91.f38150b);
            }
            textPaint2.setTextAlign(align);
            boolean z2 = Math.round(c10358n91.m23094a(this.f8044F.toString())) > Math.round(rectF3.width());
            if (z2) {
                iSave = canvas.save();
                canvas.clipRect(rectF3);
            } else {
                iSave = 0;
            }
            CharSequence charSequenceEllipsize = this.f8044F;
            if (z2 && this.f8061N1 != null) {
                charSequenceEllipsize = TextUtils.ellipsize(charSequenceEllipsize, textPaint2, rectF3.width(), this.f8061N1);
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
        if (m5883T()) {
            rectF.setEmpty();
            if (m5883T()) {
                float f10 = this.f8081e0 + this.f8080d0;
                if (AbstractC4236iL.m19003a(this) == 0) {
                    float f11 = bounds.right - f10;
                    rectF2 = rectF;
                    rectF2.right = f11;
                    rectF2.left = f11 - this.f8064P;
                } else {
                    rectF2 = rectF;
                    float f12 = bounds.left + f10;
                    rectF2.left = f12;
                    rectF2.right = f12 + this.f8064P;
                }
                float fExactCenterY = bounds.exactCenterY();
                float f13 = this.f8064P;
                float f14 = fExactCenterY - (f13 / 2.0f);
                rectF2.top = f14;
                rectF2.bottom = f14 + f13;
            } else {
                rectF2 = rectF;
            }
            float f15 = rectF2.left;
            float f16 = rectF2.top;
            canvas.translate(f15, f16);
            this.f8058M.setBounds(i3, i3, (int) rectF2.width(), (int) rectF2.height());
            this.f8060N.setBounds(this.f8058M.getBounds());
            this.f8060N.jumpToCurrentState();
            this.f8060N.draw(canvas);
            canvas.translate(-f15, -f16);
        }
        if (this.f8045F1 < i4) {
            canvas.restoreToCount(i2);
        }
    }

    @Override // p000.C10439no0, android.graphics.drawable.Drawable
    public final int getAlpha() {
        return this.f8045F1;
    }

    @Override // android.graphics.drawable.Drawable
    public final ColorFilter getColorFilter() {
        return this.f8047G1;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        return (int) this.f8034A;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        return Math.min(Math.round(m5887q() + this.f8088w1.m23094a(this.f8044F.toString()) + m5886p() + this.f8074X + this.f8077a0 + this.f8078b0 + this.f8081e0), this.f8065P1);
    }

    @Override // p000.C10439no0, android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -3;
    }

    @Override // p000.C10439no0, android.graphics.drawable.Drawable
    public final void getOutline(Outline outline) {
        if (this.f8067Q1) {
            super.getOutline(outline);
            return;
        }
        Rect bounds = getBounds();
        if (bounds.isEmpty()) {
            outline.setRoundRect(0, 0, getIntrinsicWidth(), (int) this.f8034A, this.f8036B);
        } else {
            outline.setRoundRect(bounds, this.f8036B);
        }
        outline.setAlpha(this.f8045F1 / 255.0f);
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void invalidateDrawable(Drawable drawable) {
        Drawable.Callback callback = getCallback();
        if (callback != null) {
            callback.invalidateDrawable(this);
        }
    }

    @Override // p000.C10439no0, android.graphics.drawable.Drawable
    public final boolean isStateful() {
        C9590h91 c9590h91;
        ColorStateList colorStateList;
        return m5862s(this.f8090y) || m5862s(this.f8092z) || m5862s(this.f8038C) || !((c9590h91 = this.f8088w1.f38154f) == null || (colorStateList = c9590h91.f28284j) == null || !colorStateList.isStateful()) || ((this.f8069S && this.f8070T != null && this.f8068R) || m5863t(this.f8048H) || m5863t(this.f8070T) || m5862s(this.f8051I1));
    }

    /* renamed from: n */
    public final void m5884n(Drawable drawable) {
        if (drawable == null) {
            return;
        }
        drawable.setCallback(this);
        AbstractC4236iL.m19004b(drawable, AbstractC4236iL.m19003a(this));
        drawable.setLevel(getLevel());
        drawable.setVisible(isVisible(), false);
        if (drawable == this.f8058M) {
            if (drawable.isStateful()) {
                drawable.setState(this.f8055K1);
            }
            AbstractC4173hL.m18806h(drawable, this.f8062O);
            return;
        }
        Drawable drawable2 = this.f8048H;
        if (drawable == drawable2 && this.f8054K) {
            AbstractC4173hL.m18806h(drawable2, this.f8050I);
        }
        if (drawable.isStateful()) {
            drawable.setState(getState());
        }
    }

    /* renamed from: o */
    public final void m5885o(Rect rect, RectF rectF) {
        rectF.setEmpty();
        if (m5882S() || m5881R()) {
            float f = this.f8074X + this.f8075Y;
            Drawable drawable = this.f8041D1 ? this.f8070T : this.f8048H;
            float intrinsicWidth = this.f8052J;
            if (intrinsicWidth <= 0.0f && drawable != null) {
                intrinsicWidth = drawable.getIntrinsicWidth();
            }
            if (AbstractC4236iL.m19003a(this) == 0) {
                float f2 = rect.left + f;
                rectF.left = f2;
                rectF.right = f2 + intrinsicWidth;
            } else {
                float f3 = rect.right - f;
                rectF.right = f3;
                rectF.left = f3 - intrinsicWidth;
            }
            Drawable drawable2 = this.f8041D1 ? this.f8070T : this.f8048H;
            float fCeil = this.f8052J;
            if (fCeil <= 0.0f && drawable2 != null) {
                fCeil = (float) Math.ceil(TypedValue.applyDimension(1, 24, this.f8082q1.getResources().getDisplayMetrics()));
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
        if (m5882S()) {
            zOnLayoutDirectionChanged |= AbstractC4236iL.m19004b(this.f8048H, i);
        }
        if (m5881R()) {
            zOnLayoutDirectionChanged |= AbstractC4236iL.m19004b(this.f8070T, i);
        }
        if (m5883T()) {
            zOnLayoutDirectionChanged |= AbstractC4236iL.m19004b(this.f8058M, i);
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
        if (m5882S()) {
            zOnLevelChange |= this.f8048H.setLevel(i);
        }
        if (m5881R()) {
            zOnLevelChange |= this.f8070T.setLevel(i);
        }
        if (m5883T()) {
            zOnLevelChange |= this.f8058M.setLevel(i);
        }
        if (zOnLevelChange) {
            invalidateSelf();
        }
        return zOnLevelChange;
    }

    @Override // p000.C10439no0, android.graphics.drawable.Drawable
    public final boolean onStateChange(int[] iArr) {
        if (this.f8067Q1) {
            super.onStateChange(iArr);
        }
        return m5890v(iArr, this.f8055K1);
    }

    /* renamed from: p */
    public final float m5886p() {
        if (!m5882S() && !m5881R()) {
            return 0.0f;
        }
        float f = this.f8075Y;
        Drawable drawable = this.f8041D1 ? this.f8070T : this.f8048H;
        float intrinsicWidth = this.f8052J;
        if (intrinsicWidth <= 0.0f && drawable != null) {
            intrinsicWidth = drawable.getIntrinsicWidth();
        }
        return intrinsicWidth + f + this.f8076Z;
    }

    /* renamed from: q */
    public final float m5887q() {
        if (m5883T()) {
            return this.f8079c0 + this.f8064P + this.f8080d0;
        }
        return 0.0f;
    }

    /* renamed from: r */
    public final float m5888r() {
        return this.f8067Q1 ? this.f38516a.f37931a.f6718e.mo22818a(m23234f()) : this.f8036B;
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void scheduleDrawable(Drawable drawable, Runnable runnable, long j) {
        Drawable.Callback callback = getCallback();
        if (callback != null) {
            callback.scheduleDrawable(this, runnable, j);
        }
    }

    @Override // p000.C10439no0, android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
        if (this.f8045F1 != i) {
            this.f8045F1 = i;
            invalidateSelf();
        }
    }

    @Override // p000.C10439no0, android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        if (this.f8047G1 != colorFilter) {
            this.f8047G1 = colorFilter;
            invalidateSelf();
        }
    }

    @Override // p000.C10439no0, android.graphics.drawable.Drawable
    public final void setTintList(ColorStateList colorStateList) {
        if (this.f8051I1 != colorStateList) {
            this.f8051I1 = colorStateList;
            onStateChange(getState());
        }
    }

    @Override // p000.C10439no0, android.graphics.drawable.Drawable
    public final void setTintMode(PorterDuff.Mode mode) {
        if (this.f8053J1 != mode) {
            this.f8053J1 = mode;
            ColorStateList colorStateList = this.f8051I1;
            this.f8049H1 = (colorStateList == null || mode == null) ? null : new PorterDuffColorFilter(colorStateList.getColorForState(getState(), 0), mode);
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean setVisible(boolean z, boolean z2) {
        boolean visible = super.setVisible(z, z2);
        if (m5882S()) {
            visible |= this.f8048H.setVisible(z, z2);
        }
        if (m5881R()) {
            visible |= this.f8070T.setVisible(z, z2);
        }
        if (m5883T()) {
            visible |= this.f8058M.setVisible(z, z2);
        }
        if (visible) {
            invalidateSelf();
        }
        return visible;
    }

    /* renamed from: u */
    public final void m5889u() {
        InterfaceC0809Mr interfaceC0809Mr = (InterfaceC0809Mr) this.f8059M1.get();
        if (interfaceC0809Mr != null) {
            Chip chip = (Chip) interfaceC0809Mr;
            chip.m11232c(chip.f18190p);
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
    /* renamed from: v */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean m5890v(int[] r12, int[] r13) {
        /*
            Method dump skipped, instructions count: 383
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.C0872Nr.m5890v(int[], int[]):boolean");
    }

    /* renamed from: w */
    public final void m5891w(boolean z) {
        if (this.f8068R != z) {
            this.f8068R = z;
            float fM5886p = m5886p();
            if (!z && this.f8041D1) {
                this.f8041D1 = false;
            }
            float fM5886p2 = m5886p();
            invalidateSelf();
            if (fM5886p != fM5886p2) {
                m5889u();
            }
        }
    }

    /* renamed from: x */
    public final void m5892x(Drawable drawable) {
        if (this.f8070T != drawable) {
            float fM5886p = m5886p();
            this.f8070T = drawable;
            float fM5886p2 = m5886p();
            m5861U(this.f8070T);
            m5884n(this.f8070T);
            invalidateSelf();
            if (fM5886p != fM5886p2) {
                m5889u();
            }
        }
    }

    /* renamed from: y */
    public final void m5893y(ColorStateList colorStateList) {
        Drawable drawable;
        if (this.f8071U != colorStateList) {
            this.f8071U = colorStateList;
            if (this.f8069S && (drawable = this.f8070T) != null && this.f8068R) {
                AbstractC4173hL.m18806h(drawable, colorStateList);
            }
            onStateChange(getState());
        }
    }

    /* renamed from: z */
    public final void m5894z(boolean z) {
        if (this.f8069S != z) {
            boolean zM5881R = m5881R();
            this.f8069S = z;
            boolean zM5881R2 = m5881R();
            if (zM5881R != zM5881R2) {
                if (zM5881R2) {
                    m5884n(this.f8070T);
                } else {
                    m5861U(this.f8070T);
                }
                invalidateSelf();
                m5889u();
            }
        }
    }
}
