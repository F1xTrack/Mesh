package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Typeface;
import android.text.TextPaint;
import android.util.TypedValue;

/* renamed from: h91, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4101h91 {
    public final ColorStateList a;
    public final String b;
    public final int c;
    public final int d;
    public final float e;
    public final float f;
    public final float g;
    public final boolean h;
    public final float i;
    public final ColorStateList j;
    public float k;
    public final int l;
    public boolean m = false;
    public Typeface n;

    public C4101h91(Context context, int i) throws Resources.NotFoundException {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(i, NG0.C);
        this.k = typedArrayObtainStyledAttributes.getDimension(0, 0.0f);
        this.j = AbstractC1437Se1.e(context, typedArrayObtainStyledAttributes, 3);
        AbstractC1437Se1.e(context, typedArrayObtainStyledAttributes, 4);
        AbstractC1437Se1.e(context, typedArrayObtainStyledAttributes, 5);
        this.c = typedArrayObtainStyledAttributes.getInt(2, 0);
        this.d = typedArrayObtainStyledAttributes.getInt(1, 1);
        int i2 = typedArrayObtainStyledAttributes.hasValue(12) ? 12 : 10;
        this.l = typedArrayObtainStyledAttributes.getResourceId(i2, 0);
        this.b = typedArrayObtainStyledAttributes.getString(i2);
        typedArrayObtainStyledAttributes.getBoolean(14, false);
        this.a = AbstractC1437Se1.e(context, typedArrayObtainStyledAttributes, 6);
        this.e = typedArrayObtainStyledAttributes.getFloat(7, 0.0f);
        this.f = typedArrayObtainStyledAttributes.getFloat(8, 0.0f);
        this.g = typedArrayObtainStyledAttributes.getFloat(9, 0.0f);
        typedArrayObtainStyledAttributes.recycle();
        TypedArray typedArrayObtainStyledAttributes2 = context.obtainStyledAttributes(i, NG0.t);
        this.h = typedArrayObtainStyledAttributes2.hasValue(0);
        this.i = typedArrayObtainStyledAttributes2.getFloat(0, 0.0f);
        typedArrayObtainStyledAttributes2.recycle();
    }

    public final void a() {
        String str;
        Typeface typeface = this.n;
        int i = this.c;
        if (typeface == null && (str = this.b) != null) {
            this.n = Typeface.create(str, i);
        }
        if (this.n == null) {
            int i2 = this.d;
            if (i2 == 1) {
                this.n = Typeface.SANS_SERIF;
            } else if (i2 == 2) {
                this.n = Typeface.SERIF;
            } else if (i2 != 3) {
                this.n = Typeface.DEFAULT;
            } else {
                this.n = Typeface.MONOSPACE;
            }
            this.n = Typeface.create(this.n, i);
        }
    }

    public final Typeface b(Context context) {
        if (this.m) {
            return this.n;
        }
        if (!context.isRestricted()) {
            try {
                Typeface typefaceB = ES0.b(context, this.l);
                this.n = typefaceB;
                if (typefaceB != null) {
                    this.n = Typeface.create(typefaceB, this.c);
                }
            } catch (Resources.NotFoundException | UnsupportedOperationException | Exception unused) {
            }
        }
        a();
        this.m = true;
        return this.n;
    }

    public final void c(Context context, AbstractC5895mU1 abstractC5895mU1) {
        if (d(context)) {
            b(context);
        } else {
            a();
        }
        int i = this.l;
        if (i == 0) {
            this.m = true;
        }
        if (this.m) {
            abstractC5895mU1.b(this.n, true);
            return;
        }
        try {
            C3719f91 c3719f91 = new C3719f91(this, abstractC5895mU1);
            ThreadLocal threadLocal = ES0.a;
            if (context.isRestricted()) {
                c3719f91.a(-4);
            } else {
                ES0.c(context, i, new TypedValue(), 0, c3719f91, false, false);
            }
        } catch (Resources.NotFoundException unused) {
            this.m = true;
            abstractC5895mU1.a(1);
        } catch (Exception unused2) {
            this.m = true;
            abstractC5895mU1.a(-3);
        }
    }

    public final boolean d(Context context) throws Resources.NotFoundException {
        Typeface typefaceC = null;
        int i = this.l;
        if (i != 0) {
            ThreadLocal threadLocal = ES0.a;
            if (!context.isRestricted()) {
                typefaceC = ES0.c(context, i, new TypedValue(), 0, null, false, true);
            }
        }
        return typefaceC != null;
    }

    public final void e(Context context, TextPaint textPaint, AbstractC5895mU1 abstractC5895mU1) {
        f(context, textPaint, abstractC5895mU1);
        ColorStateList colorStateList = this.j;
        textPaint.setColor(colorStateList != null ? colorStateList.getColorForState(textPaint.drawableState, colorStateList.getDefaultColor()) : -16777216);
        ColorStateList colorStateList2 = this.a;
        textPaint.setShadowLayer(this.g, this.e, this.f, colorStateList2 != null ? colorStateList2.getColorForState(textPaint.drawableState, colorStateList2.getDefaultColor()) : 0);
    }

    public final void f(Context context, TextPaint textPaint, AbstractC5895mU1 abstractC5895mU1) {
        if (d(context)) {
            g(context, textPaint, b(context));
            return;
        }
        a();
        g(context, textPaint, this.n);
        c(context, new C3910g91(this, context, textPaint, abstractC5895mU1));
    }

    public final void g(Context context, TextPaint textPaint, Typeface typeface) {
        Typeface typefaceB = IZ1.b(context.getResources().getConfiguration(), typeface);
        if (typefaceB != null) {
            typeface = typefaceB;
        }
        textPaint.setTypeface(typeface);
        int i = (~typeface.getStyle()) & this.c;
        textPaint.setFakeBoldText((i & 1) != 0);
        textPaint.setTextSkewX((i & 2) != 0 ? -0.25f : 0.0f);
        textPaint.setTextSize(this.k);
        if (this.h) {
            textPaint.setLetterSpacing(this.i);
        }
    }
}
