package p000;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Typeface;
import android.text.TextPaint;
import android.util.TypedValue;

/* renamed from: h91, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C9590h91 {

    /* renamed from: a */
    public final ColorStateList f28275a;

    /* renamed from: b */
    public final String f28276b;

    /* renamed from: c */
    public final int f28277c;

    /* renamed from: d */
    public final int f28278d;

    /* renamed from: e */
    public final float f28279e;

    /* renamed from: f */
    public final float f28280f;

    /* renamed from: g */
    public final float f28281g;

    /* renamed from: h */
    public final boolean f28282h;

    /* renamed from: i */
    public final float f28283i;

    /* renamed from: j */
    public final ColorStateList f28284j;

    /* renamed from: k */
    public float f28285k;

    /* renamed from: l */
    public final int f28286l;

    /* renamed from: m */
    public boolean f28287m = false;

    /* renamed from: n */
    public Typeface f28288n;

    public C9590h91(Context context, int i) throws Resources.NotFoundException {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(i, NG0.f7683C);
        this.f28285k = typedArrayObtainStyledAttributes.getDimension(0, 0.0f);
        this.f28284j = AbstractC8259Se1.m7406e(context, typedArrayObtainStyledAttributes, 3);
        AbstractC8259Se1.m7406e(context, typedArrayObtainStyledAttributes, 4);
        AbstractC8259Se1.m7406e(context, typedArrayObtainStyledAttributes, 5);
        this.f28277c = typedArrayObtainStyledAttributes.getInt(2, 0);
        this.f28278d = typedArrayObtainStyledAttributes.getInt(1, 1);
        int i2 = typedArrayObtainStyledAttributes.hasValue(12) ? 12 : 10;
        this.f28286l = typedArrayObtainStyledAttributes.getResourceId(i2, 0);
        this.f28276b = typedArrayObtainStyledAttributes.getString(i2);
        typedArrayObtainStyledAttributes.getBoolean(14, false);
        this.f28275a = AbstractC8259Se1.m7406e(context, typedArrayObtainStyledAttributes, 6);
        this.f28279e = typedArrayObtainStyledAttributes.getFloat(7, 0.0f);
        this.f28280f = typedArrayObtainStyledAttributes.getFloat(8, 0.0f);
        this.f28281g = typedArrayObtainStyledAttributes.getFloat(9, 0.0f);
        typedArrayObtainStyledAttributes.recycle();
        TypedArray typedArrayObtainStyledAttributes2 = context.obtainStyledAttributes(i, NG0.f7706t);
        this.f28282h = typedArrayObtainStyledAttributes2.hasValue(0);
        this.f28283i = typedArrayObtainStyledAttributes2.getFloat(0, 0.0f);
        typedArrayObtainStyledAttributes2.recycle();
    }

    /* renamed from: a */
    public final void m18728a() {
        String str;
        Typeface typeface = this.f28288n;
        int i = this.f28277c;
        if (typeface == null && (str = this.f28276b) != null) {
            this.f28288n = Typeface.create(str, i);
        }
        if (this.f28288n == null) {
            int i2 = this.f28278d;
            if (i2 == 1) {
                this.f28288n = Typeface.SANS_SERIF;
            } else if (i2 == 2) {
                this.f28288n = Typeface.SERIF;
            } else if (i2 != 3) {
                this.f28288n = Typeface.DEFAULT;
            } else {
                this.f28288n = Typeface.MONOSPACE;
            }
            this.f28288n = Typeface.create(this.f28288n, i);
        }
    }

    /* renamed from: b */
    public final Typeface m18729b(Context context) {
        if (this.f28287m) {
            return this.f28288n;
        }
        if (!context.isRestricted()) {
            try {
                Typeface typefaceM2276b = ES0.m2276b(context, this.f28286l);
                this.f28288n = typefaceM2276b;
                if (typefaceM2276b != null) {
                    this.f28288n = Typeface.create(typefaceM2276b, this.f28277c);
                }
            } catch (Resources.NotFoundException | UnsupportedOperationException | Exception unused) {
            }
        }
        m18728a();
        this.f28287m = true;
        return this.f28288n;
    }

    /* renamed from: c */
    public final void m18730c(Context context, AbstractC10272mU1 abstractC10272mU1) {
        if (m18731d(context)) {
            m18729b(context);
        } else {
            m18728a();
        }
        int i = this.f28286l;
        if (i == 0) {
            this.f28287m = true;
        }
        if (this.f28287m) {
            abstractC10272mU1.mo2789b(this.f28288n, true);
            return;
        }
        try {
            C9334f91 c9334f91 = new C9334f91(this, abstractC10272mU1);
            ThreadLocal threadLocal = ES0.f2702a;
            if (context.isRestricted()) {
                c9334f91.m2266a(-4);
            } else {
                ES0.m2277c(context, i, new TypedValue(), 0, c9334f91, false, false);
            }
        } catch (Resources.NotFoundException unused) {
            this.f28287m = true;
            abstractC10272mU1.mo2788a(1);
        } catch (Exception unused2) {
            this.f28287m = true;
            abstractC10272mU1.mo2788a(-3);
        }
    }

    /* renamed from: d */
    public final boolean m18731d(Context context) throws Resources.NotFoundException {
        Typeface typefaceM2277c = null;
        int i = this.f28286l;
        if (i != 0) {
            ThreadLocal threadLocal = ES0.f2702a;
            if (!context.isRestricted()) {
                typefaceM2277c = ES0.m2277c(context, i, new TypedValue(), 0, null, false, true);
            }
        }
        return typefaceM2277c != null;
    }

    /* renamed from: e */
    public final void m18732e(Context context, TextPaint textPaint, AbstractC10272mU1 abstractC10272mU1) {
        m18733f(context, textPaint, abstractC10272mU1);
        ColorStateList colorStateList = this.f28284j;
        textPaint.setColor(colorStateList != null ? colorStateList.getColorForState(textPaint.drawableState, colorStateList.getDefaultColor()) : -16777216);
        ColorStateList colorStateList2 = this.f28275a;
        textPaint.setShadowLayer(this.f28281g, this.f28279e, this.f28280f, colorStateList2 != null ? colorStateList2.getColorForState(textPaint.drawableState, colorStateList2.getDefaultColor()) : 0);
    }

    /* renamed from: f */
    public final void m18733f(Context context, TextPaint textPaint, AbstractC10272mU1 abstractC10272mU1) {
        if (m18731d(context)) {
            m18734g(context, textPaint, m18729b(context));
            return;
        }
        m18728a();
        m18734g(context, textPaint, this.f28288n);
        m18730c(context, new C9462g91(this, context, textPaint, abstractC10272mU1));
    }

    /* renamed from: g */
    public final void m18734g(Context context, TextPaint textPaint, Typeface typeface) {
        Typeface typefaceM3936b = IZ1.m3936b(context.getResources().getConfiguration(), typeface);
        if (typefaceM3936b != null) {
            typeface = typefaceM3936b;
        }
        textPaint.setTypeface(typeface);
        int i = (~typeface.getStyle()) & this.f28277c;
        textPaint.setFakeBoldText((i & 1) != 0);
        textPaint.setTextSkewX((i & 2) != 0 ? -0.25f : 0.0f);
        textPaint.setTextSize(this.f28285k);
        if (this.f28282h) {
            textPaint.setLetterSpacing(this.f28283i);
        }
    }
}
