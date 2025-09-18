package p000;

import android.animation.TimeInterpolator;
import android.content.res.ColorStateList;
import android.content.res.Configuration;
import android.graphics.Bitmap;
import android.graphics.Color;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.os.Build;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.TextUtils;
import android.view.Gravity;
import android.view.animation.LinearInterpolator;
import com.google.android.material.textfield.TextInputLayout;
import java.util.WeakHashMap;

/* renamed from: su */
/* loaded from: classes.dex */
public final class C6852su {

    /* renamed from: A */
    public CharSequence f42655A;

    /* renamed from: B */
    public CharSequence f42656B;

    /* renamed from: C */
    public boolean f42657C;

    /* renamed from: E */
    public Bitmap f42659E;

    /* renamed from: F */
    public float f42660F;

    /* renamed from: G */
    public float f42661G;

    /* renamed from: H */
    public float f42662H;

    /* renamed from: I */
    public float f42663I;

    /* renamed from: J */
    public float f42664J;

    /* renamed from: K */
    public int f42665K;

    /* renamed from: L */
    public int[] f42666L;

    /* renamed from: M */
    public boolean f42667M;

    /* renamed from: N */
    public final TextPaint f42668N;

    /* renamed from: O */
    public final TextPaint f42669O;

    /* renamed from: P */
    public LinearInterpolator f42670P;

    /* renamed from: Q */
    public LinearInterpolator f42671Q;

    /* renamed from: R */
    public float f42672R;

    /* renamed from: S */
    public float f42673S;

    /* renamed from: T */
    public float f42674T;

    /* renamed from: U */
    public ColorStateList f42675U;

    /* renamed from: V */
    public float f42676V;

    /* renamed from: W */
    public float f42677W;

    /* renamed from: X */
    public float f42678X;

    /* renamed from: Y */
    public StaticLayout f42679Y;

    /* renamed from: Z */
    public float f42680Z;

    /* renamed from: a */
    public final TextInputLayout f42681a;

    /* renamed from: a0 */
    public float f42682a0;

    /* renamed from: b */
    public float f42683b;

    /* renamed from: b0 */
    public float f42684b0;

    /* renamed from: c */
    public final Rect f42685c;

    /* renamed from: c0 */
    public CharSequence f42686c0;

    /* renamed from: d */
    public final Rect f42687d;

    /* renamed from: e */
    public final RectF f42689e;

    /* renamed from: j */
    public ColorStateList f42696j;

    /* renamed from: k */
    public ColorStateList f42697k;

    /* renamed from: l */
    public float f42698l;

    /* renamed from: m */
    public float f42699m;

    /* renamed from: n */
    public float f42700n;

    /* renamed from: o */
    public float f42701o;

    /* renamed from: p */
    public float f42702p;

    /* renamed from: q */
    public float f42703q;

    /* renamed from: r */
    public Typeface f42704r;

    /* renamed from: s */
    public Typeface f42705s;

    /* renamed from: t */
    public Typeface f42706t;

    /* renamed from: u */
    public Typeface f42707u;

    /* renamed from: v */
    public Typeface f42708v;

    /* renamed from: w */
    public Typeface f42709w;

    /* renamed from: x */
    public Typeface f42710x;

    /* renamed from: y */
    public C0367Fp f42711y;

    /* renamed from: f */
    public int f42691f = 16;

    /* renamed from: g */
    public int f42693g = 16;

    /* renamed from: h */
    public float f42694h = 15.0f;

    /* renamed from: i */
    public float f42695i = 15.0f;

    /* renamed from: z */
    public final TextUtils.TruncateAt f42712z = TextUtils.TruncateAt.END;

    /* renamed from: D */
    public final boolean f42658D = true;

    /* renamed from: d0 */
    public final int f42688d0 = 1;

    /* renamed from: e0 */
    public final float f42690e0 = 1.0f;

    /* renamed from: f0 */
    public final int f42692f0 = 1;

    public C6852su(TextInputLayout textInputLayout) {
        this.f42681a = textInputLayout;
        TextPaint textPaint = new TextPaint(129);
        this.f42668N = textPaint;
        this.f42669O = new TextPaint(textPaint);
        this.f42687d = new Rect();
        this.f42685c = new Rect();
        this.f42689e = new RectF();
        m24802g(textInputLayout.getContext().getResources().getConfiguration());
    }

    /* renamed from: a */
    public static int m24796a(int i, float f, int i2) {
        float f2 = 1.0f - f;
        return Color.argb(Math.round((Color.alpha(i2) * f) + (Color.alpha(i) * f2)), Math.round((Color.red(i2) * f) + (Color.red(i) * f2)), Math.round((Color.green(i2) * f) + (Color.green(i) * f2)), Math.round((Color.blue(i2) * f) + (Color.blue(i) * f2)));
    }

    /* renamed from: f */
    public static float m24797f(float f, float f2, float f3, TimeInterpolator timeInterpolator) {
        if (timeInterpolator != null) {
            f3 = timeInterpolator.getInterpolation(f3);
        }
        return AbstractC6467n5.m23073a(f, f2, f3);
    }

    /* renamed from: b */
    public final boolean m24798b(CharSequence charSequence) {
        WeakHashMap weakHashMap = AbstractC10944rk1.f41842a;
        boolean z = this.f42681a.getLayoutDirection() == 1;
        if (this.f42658D) {
            return (z ? AbstractC10102l91.f36927d : AbstractC10102l91.f36926c).m6124j(charSequence.length(), charSequence);
        }
        return z;
    }

    /* renamed from: c */
    public final void m24799c(float f, boolean z) {
        float f2;
        float f3;
        Typeface typeface;
        boolean z2;
        Layout.Alignment alignment;
        if (this.f42655A == null) {
            return;
        }
        float fWidth = this.f42687d.width();
        float fWidth2 = this.f42685c.width();
        if (Math.abs(f - 1.0f) < 1.0E-5f) {
            f2 = this.f42695i;
            f3 = this.f42676V;
            this.f42660F = 1.0f;
            typeface = this.f42704r;
        } else {
            float f4 = this.f42694h;
            float f5 = this.f42677W;
            Typeface typeface2 = this.f42707u;
            if (Math.abs(f - 0.0f) < 1.0E-5f) {
                this.f42660F = 1.0f;
            } else {
                this.f42660F = m24797f(this.f42694h, this.f42695i, f, this.f42671Q) / this.f42694h;
            }
            float f6 = this.f42695i / this.f42694h;
            fWidth = (z || fWidth2 * f6 <= fWidth) ? fWidth2 : Math.min(fWidth / f6, fWidth2);
            f2 = f4;
            f3 = f5;
            typeface = typeface2;
        }
        TextPaint textPaint = this.f42668N;
        if (fWidth > 0.0f) {
            boolean z3 = this.f42661G != f2;
            boolean z4 = this.f42678X != f3;
            boolean z5 = this.f42710x != typeface;
            StaticLayout staticLayout = this.f42679Y;
            boolean z6 = z3 || z4 || (staticLayout != null && (fWidth > ((float) staticLayout.getWidth()) ? 1 : (fWidth == ((float) staticLayout.getWidth()) ? 0 : -1)) != 0) || z5 || this.f42667M;
            this.f42661G = f2;
            this.f42678X = f3;
            this.f42710x = typeface;
            this.f42667M = false;
            textPaint.setLinearText(this.f42660F != 1.0f);
            z2 = z6;
        } else {
            z2 = false;
        }
        if (this.f42656B == null || z2) {
            textPaint.setTextSize(this.f42661G);
            textPaint.setTypeface(this.f42710x);
            textPaint.setLetterSpacing(this.f42678X);
            boolean zM24798b = m24798b(this.f42655A);
            this.f42657C = zM24798b;
            int i = this.f42688d0;
            if (i <= 1 || zM24798b) {
                i = 1;
            }
            if (i == 1) {
                alignment = Layout.Alignment.ALIGN_NORMAL;
            } else {
                int absoluteGravity = Gravity.getAbsoluteGravity(this.f42691f, zM24798b ? 1 : 0) & 7;
                alignment = absoluteGravity != 1 ? absoluteGravity != 5 ? this.f42657C ? Layout.Alignment.ALIGN_OPPOSITE : Layout.Alignment.ALIGN_NORMAL : this.f42657C ? Layout.Alignment.ALIGN_NORMAL : Layout.Alignment.ALIGN_OPPOSITE : Layout.Alignment.ALIGN_CENTER;
            }
            J41 j41 = new J41(this.f42655A, textPaint, (int) fWidth);
            j41.f5330k = this.f42712z;
            j41.f5329j = zM24798b;
            j41.f5324e = alignment;
            j41.f5328i = false;
            j41.f5325f = i;
            j41.f5326g = this.f42690e0;
            j41.f5327h = this.f42692f0;
            StaticLayout staticLayoutM4152a = j41.m4152a();
            staticLayoutM4152a.getClass();
            this.f42679Y = staticLayoutM4152a;
            this.f42656B = staticLayoutM4152a.getText();
        }
    }

    /* renamed from: d */
    public final float m24800d() {
        TextPaint textPaint = this.f42669O;
        textPaint.setTextSize(this.f42695i);
        textPaint.setTypeface(this.f42704r);
        textPaint.setLetterSpacing(this.f42676V);
        return -textPaint.ascent();
    }

    /* renamed from: e */
    public final int m24801e(ColorStateList colorStateList) {
        if (colorStateList == null) {
            return 0;
        }
        int[] iArr = this.f42666L;
        return iArr != null ? colorStateList.getColorForState(iArr, 0) : colorStateList.getDefaultColor();
    }

    /* renamed from: g */
    public final void m24802g(Configuration configuration) {
        if (Build.VERSION.SDK_INT >= 31) {
            Typeface typeface = this.f42706t;
            if (typeface != null) {
                this.f42705s = IZ1.m3936b(configuration, typeface);
            }
            Typeface typeface2 = this.f42709w;
            if (typeface2 != null) {
                this.f42708v = IZ1.m3936b(configuration, typeface2);
            }
            Typeface typeface3 = this.f42705s;
            if (typeface3 == null) {
                typeface3 = this.f42706t;
            }
            this.f42704r = typeface3;
            Typeface typeface4 = this.f42708v;
            if (typeface4 == null) {
                typeface4 = this.f42709w;
            }
            this.f42707u = typeface4;
            m24803h(true);
        }
    }

    /* renamed from: h */
    public final void m24803h(boolean z) {
        float fMeasureText;
        StaticLayout staticLayout;
        TextInputLayout textInputLayout = this.f42681a;
        if ((textInputLayout.getHeight() <= 0 || textInputLayout.getWidth() <= 0) && !z) {
            return;
        }
        m24799c(1.0f, z);
        CharSequence charSequence = this.f42656B;
        TextPaint textPaint = this.f42668N;
        if (charSequence != null && (staticLayout = this.f42679Y) != null) {
            this.f42686c0 = TextUtils.ellipsize(charSequence, textPaint, staticLayout.getWidth(), this.f42712z);
        }
        CharSequence charSequence2 = this.f42686c0;
        if (charSequence2 != null) {
            this.f42680Z = textPaint.measureText(charSequence2, 0, charSequence2.length());
        } else {
            this.f42680Z = 0.0f;
        }
        int absoluteGravity = Gravity.getAbsoluteGravity(this.f42693g, this.f42657C ? 1 : 0);
        int i = absoluteGravity & 112;
        Rect rect = this.f42687d;
        if (i == 48) {
            this.f42699m = rect.top;
        } else if (i != 80) {
            this.f42699m = rect.centerY() - ((textPaint.descent() - textPaint.ascent()) / 2.0f);
        } else {
            this.f42699m = textPaint.ascent() + rect.bottom;
        }
        int i2 = absoluteGravity & 8388615;
        if (i2 == 1) {
            this.f42701o = rect.centerX() - (this.f42680Z / 2.0f);
        } else if (i2 != 5) {
            this.f42701o = rect.left;
        } else {
            this.f42701o = rect.right - this.f42680Z;
        }
        m24799c(0.0f, z);
        float height = this.f42679Y != null ? r1.getHeight() : 0.0f;
        StaticLayout staticLayout2 = this.f42679Y;
        if (staticLayout2 == null || this.f42688d0 <= 1) {
            CharSequence charSequence3 = this.f42656B;
            fMeasureText = charSequence3 != null ? textPaint.measureText(charSequence3, 0, charSequence3.length()) : 0.0f;
        } else {
            fMeasureText = staticLayout2.getWidth();
        }
        StaticLayout staticLayout3 = this.f42679Y;
        if (staticLayout3 != null) {
            staticLayout3.getLineCount();
        }
        int absoluteGravity2 = Gravity.getAbsoluteGravity(this.f42691f, this.f42657C ? 1 : 0);
        int i3 = absoluteGravity2 & 112;
        Rect rect2 = this.f42685c;
        if (i3 == 48) {
            this.f42698l = rect2.top;
        } else if (i3 != 80) {
            this.f42698l = rect2.centerY() - (height / 2.0f);
        } else {
            this.f42698l = textPaint.descent() + (rect2.bottom - height);
        }
        int i4 = absoluteGravity2 & 8388615;
        if (i4 == 1) {
            this.f42700n = rect2.centerX() - (fMeasureText / 2.0f);
        } else if (i4 != 5) {
            this.f42700n = rect2.left;
        } else {
            this.f42700n = rect2.right - fMeasureText;
        }
        Bitmap bitmap = this.f42659E;
        if (bitmap != null) {
            bitmap.recycle();
            this.f42659E = null;
        }
        m24807l(this.f42683b);
        float f = this.f42683b;
        float fM24797f = m24797f(rect2.left, rect.left, f, this.f42670P);
        RectF rectF = this.f42689e;
        rectF.left = fM24797f;
        rectF.top = m24797f(this.f42698l, this.f42699m, f, this.f42670P);
        rectF.right = m24797f(rect2.right, rect.right, f, this.f42670P);
        rectF.bottom = m24797f(rect2.bottom, rect.bottom, f, this.f42670P);
        this.f42702p = m24797f(this.f42700n, this.f42701o, f, this.f42670P);
        this.f42703q = m24797f(this.f42698l, this.f42699m, f, this.f42670P);
        m24807l(f);
        C0092BS c0092bs = AbstractC6467n5.f38091b;
        this.f42682a0 = 1.0f - m24797f(0.0f, 1.0f, 1.0f - f, c0092bs);
        WeakHashMap weakHashMap = AbstractC10944rk1.f41842a;
        textInputLayout.postInvalidateOnAnimation();
        this.f42684b0 = m24797f(1.0f, 0.0f, f, c0092bs);
        textInputLayout.postInvalidateOnAnimation();
        ColorStateList colorStateList = this.f42697k;
        ColorStateList colorStateList2 = this.f42696j;
        if (colorStateList != colorStateList2) {
            textPaint.setColor(m24796a(m24801e(colorStateList2), f, m24801e(this.f42697k)));
        } else {
            textPaint.setColor(m24801e(colorStateList));
        }
        float f2 = this.f42676V;
        float f3 = this.f42677W;
        if (f2 != f3) {
            textPaint.setLetterSpacing(m24797f(f3, f2, f, c0092bs));
        } else {
            textPaint.setLetterSpacing(f2);
        }
        this.f42662H = AbstractC6467n5.m23073a(0.0f, this.f42672R, f);
        this.f42663I = AbstractC6467n5.m23073a(0.0f, this.f42673S, f);
        this.f42664J = AbstractC6467n5.m23073a(0.0f, this.f42674T, f);
        int iM24796a = m24796a(0, f, m24801e(this.f42675U));
        this.f42665K = iM24796a;
        textPaint.setShadowLayer(this.f42662H, this.f42663I, this.f42664J, iM24796a);
        textInputLayout.postInvalidateOnAnimation();
    }

    /* renamed from: i */
    public final void m24804i(ColorStateList colorStateList) {
        if (this.f42697k == colorStateList && this.f42696j == colorStateList) {
            return;
        }
        this.f42697k = colorStateList;
        this.f42696j = colorStateList;
        m24803h(false);
    }

    /* renamed from: j */
    public final boolean m24805j(Typeface typeface) {
        C0367Fp c0367Fp = this.f42711y;
        if (c0367Fp != null) {
            c0367Fp.f3429c = true;
        }
        if (this.f42706t == typeface) {
            return false;
        }
        this.f42706t = typeface;
        Typeface typefaceM3936b = IZ1.m3936b(this.f42681a.getContext().getResources().getConfiguration(), typeface);
        this.f42705s = typefaceM3936b;
        if (typefaceM3936b == null) {
            typefaceM3936b = this.f42706t;
        }
        this.f42704r = typefaceM3936b;
        return true;
    }

    /* renamed from: k */
    public final void m24806k(float f) {
        if (f < 0.0f) {
            f = 0.0f;
        } else if (f > 1.0f) {
            f = 1.0f;
        }
        if (f != this.f42683b) {
            this.f42683b = f;
            float f2 = this.f42685c.left;
            Rect rect = this.f42687d;
            float fM24797f = m24797f(f2, rect.left, f, this.f42670P);
            RectF rectF = this.f42689e;
            rectF.left = fM24797f;
            rectF.top = m24797f(this.f42698l, this.f42699m, f, this.f42670P);
            rectF.right = m24797f(r1.right, rect.right, f, this.f42670P);
            rectF.bottom = m24797f(r1.bottom, rect.bottom, f, this.f42670P);
            this.f42702p = m24797f(this.f42700n, this.f42701o, f, this.f42670P);
            this.f42703q = m24797f(this.f42698l, this.f42699m, f, this.f42670P);
            m24807l(f);
            C0092BS c0092bs = AbstractC6467n5.f38091b;
            this.f42682a0 = 1.0f - m24797f(0.0f, 1.0f, 1.0f - f, c0092bs);
            WeakHashMap weakHashMap = AbstractC10944rk1.f41842a;
            TextInputLayout textInputLayout = this.f42681a;
            textInputLayout.postInvalidateOnAnimation();
            this.f42684b0 = m24797f(1.0f, 0.0f, f, c0092bs);
            textInputLayout.postInvalidateOnAnimation();
            ColorStateList colorStateList = this.f42697k;
            ColorStateList colorStateList2 = this.f42696j;
            TextPaint textPaint = this.f42668N;
            if (colorStateList != colorStateList2) {
                textPaint.setColor(m24796a(m24801e(colorStateList2), f, m24801e(this.f42697k)));
            } else {
                textPaint.setColor(m24801e(colorStateList));
            }
            float f3 = this.f42676V;
            float f4 = this.f42677W;
            if (f3 != f4) {
                textPaint.setLetterSpacing(m24797f(f4, f3, f, c0092bs));
            } else {
                textPaint.setLetterSpacing(f3);
            }
            this.f42662H = AbstractC6467n5.m23073a(0.0f, this.f42672R, f);
            this.f42663I = AbstractC6467n5.m23073a(0.0f, this.f42673S, f);
            this.f42664J = AbstractC6467n5.m23073a(0.0f, this.f42674T, f);
            int iM24796a = m24796a(0, f, m24801e(this.f42675U));
            this.f42665K = iM24796a;
            textPaint.setShadowLayer(this.f42662H, this.f42663I, this.f42664J, iM24796a);
            textInputLayout.postInvalidateOnAnimation();
        }
    }

    /* renamed from: l */
    public final void m24807l(float f) {
        m24799c(f, false);
        WeakHashMap weakHashMap = AbstractC10944rk1.f41842a;
        this.f42681a.postInvalidateOnAnimation();
    }

    /* renamed from: m */
    public final void m24808m(Typeface typeface) {
        boolean z;
        boolean zM24805j = m24805j(typeface);
        if (this.f42709w != typeface) {
            this.f42709w = typeface;
            Typeface typefaceM3936b = IZ1.m3936b(this.f42681a.getContext().getResources().getConfiguration(), typeface);
            this.f42708v = typefaceM3936b;
            if (typefaceM3936b == null) {
                typefaceM3936b = this.f42709w;
            }
            this.f42707u = typefaceM3936b;
            z = true;
        } else {
            z = false;
        }
        if (zM24805j || z) {
            m24803h(false);
        }
    }
}
