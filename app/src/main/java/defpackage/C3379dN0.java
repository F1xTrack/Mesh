package defpackage;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.text.Layout;
import android.text.Spannable;
import android.text.Spanned;
import android.text.TextUtils;
import android.text.method.LinkMovementMethod;
import android.text.util.Linkify;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.bridge.WritableMap;
import java.lang.reflect.InvocationTargetException;
import java.util.Locale;
import java.util.WeakHashMap;

/* renamed from: dN0 */
/* loaded from: classes.dex */
public final class C3379dN0 extends C6969s7 implements QJ0 {
    public static final ViewGroup.LayoutParams u = new ViewGroup.LayoutParams(0, 0);
    public boolean h;
    public int i;
    public TextUtils.TruncateAt j;
    public boolean k;
    public float l;
    public float m;
    public float n;
    public int o;
    public boolean p;
    public boolean q;
    public boolean r;
    public VY s;
    public Spannable t;

    private ReactContext getReactContext() {
        Context context = getContext();
        return context instanceof AbstractC0802Ka1 ? (ReactContext) ((AbstractC0802Ka1) context).getBaseContext() : (ReactContext) context;
    }

    public static WritableMap j(int i, int i2, int i3, int i4, int i5, int i6) {
        WritableMap writableMapCreateMap = Arguments.createMap();
        if (i == 8) {
            writableMapCreateMap.putString("visibility", "gone");
            writableMapCreateMap.putInt("index", i2);
        } else if (i == 0) {
            writableMapCreateMap.putString("visibility", "visible");
            writableMapCreateMap.putInt("index", i2);
            writableMapCreateMap.putDouble("left", AbstractC7586vL1.a(i3));
            writableMapCreateMap.putDouble("top", AbstractC7586vL1.a(i4));
            writableMapCreateMap.putDouble("right", AbstractC7586vL1.a(i5));
            writableMapCreateMap.putDouble("bottom", AbstractC7586vL1.a(i6));
        } else {
            writableMapCreateMap.putString("visibility", "unknown");
            writableMapCreateMap.putInt("index", i2);
        }
        return writableMapCreateMap;
    }

    @Override // android.view.View
    public final boolean dispatchHoverEvent(MotionEvent motionEvent) {
        if (AbstractC6897rk1.d(this) != null) {
            A1 a1C = AbstractC6897rk1.c(this);
            if (a1C instanceof AbstractC5884mR) {
                return ((AbstractC5884mR) a1C).l(motionEvent) || super.dispatchHoverEvent(motionEvent);
            }
        }
        return super.dispatchHoverEvent(motionEvent);
    }

    public int getGravityHorizontal() {
        return getGravity() & 8388615;
    }

    public Spannable getSpanned() {
        return this.t;
    }

    public final void h() throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        if (!Float.isNaN(this.l)) {
            setTextSize(0, this.l);
        }
        if (Float.isNaN(this.n)) {
            return;
        }
        super.setLetterSpacing(this.n);
    }

    @Override // android.widget.TextView, android.view.View
    public final boolean hasOverlappingRendering() {
        return false;
    }

    public final void i() {
        VY vy = this.s;
        if (vy != null) {
            View view = (View) vy.d;
            WeakHashMap weakHashMap = AbstractC6897rk1.a;
            view.setBackground(null);
            vy.d = null;
            vy.c = null;
        }
        this.s = new VY(this);
        this.i = Integer.MAX_VALUE;
        this.k = false;
        this.o = 0;
        this.p = false;
        this.q = false;
        this.r = false;
        this.j = TextUtils.TruncateAt.END;
        this.l = Float.NaN;
        this.m = Float.NaN;
        this.n = 0.0f;
        this.t = null;
    }

    @Override // android.widget.TextView, android.view.View, android.graphics.drawable.Drawable.Callback
    public final void invalidateDrawable(Drawable drawable) {
        if (this.h && (getText() instanceof Spanned)) {
            Spanned spanned = (Spanned) getText();
            for (C4177hZ c4177hZ : (C4177hZ[]) spanned.getSpans(0, spanned.length(), C4177hZ.class)) {
                if (c4177hZ.a == drawable) {
                    invalidate();
                }
            }
        }
        super.invalidateDrawable(drawable);
    }

    public final void k() throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        i();
        setBreakStrategy(0);
        setMovementMethod(getDefaultMovementMethod());
        int i = Build.VERSION.SDK_INT;
        if (i >= 26) {
            setJustificationMode(0);
        }
        setLayoutParams(u);
        TextUtils.TruncateAt truncateAt = null;
        setText((CharSequence) null);
        h();
        setGravity(8388659);
        setNumberOfLines(this.i);
        setAdjustFontSizeToFit(this.k);
        setLinkifyMask(this.o);
        setTextIsSelectable(this.q);
        setIncludeFontPadding(true);
        setEnabled(true);
        setLinkifyMask(0);
        setEllipsizeLocation(this.j);
        setEnabled(true);
        if (i >= 26) {
            setFocusable(16);
        }
        setHyphenationFrequency(0);
        if (this.i != Integer.MAX_VALUE && !this.k) {
            truncateAt = this.j;
        }
        setEllipsize(truncateAt);
    }

    @Override // android.widget.TextView, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        setTextIsSelectable(this.q);
        if (this.h && (getText() instanceof Spanned)) {
            Spanned spanned = (Spanned) getText();
            for (C4177hZ c4177hZ : (C4177hZ[]) spanned.getSpans(0, spanned.length(), C4177hZ.class)) {
                EnumC7202tL enumC7202tL = EnumC7202tL.o;
                C6394p6 c6394p6 = c4177hZ.c;
                ((C7393uL) c6394p6.c).a(enumC7202tL);
                c6394p6.e = true;
                c6394p6.d();
            }
        }
    }

    @Override // defpackage.C6969s7, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        if (this.h && (getText() instanceof Spanned)) {
            Spanned spanned = (Spanned) getText();
            for (C4177hZ c4177hZ : (C4177hZ[]) spanned.getSpans(0, spanned.length(), C4177hZ.class)) {
                EnumC7202tL enumC7202tL = EnumC7202tL.p;
                C6394p6 c6394p6 = c4177hZ.c;
                ((C7393uL) c6394p6.c).a(enumC7202tL);
                c6394p6.e = false;
                c6394p6.d();
            }
        }
    }

    @Override // android.widget.TextView, android.view.View
    public final void onDraw(Canvas canvas) {
        if (this.k && getSpanned() != null && this.r) {
            this.r = false;
            Spannable spanned = getSpanned();
            float width = getWidth();
            EnumC0769Jp1 enumC0769Jp1 = EnumC0769Jp1.b;
            A91.a(spanned, width, enumC0769Jp1, getHeight(), enumC0769Jp1, this.m, this.i, getIncludeFontPadding(), getBreakStrategy(), getHyphenationFrequency(), Layout.Alignment.ALIGN_NORMAL);
            setText(getSpanned());
        }
        this.s.U(canvas);
        super.onDraw(canvas);
    }

    @Override // android.view.View
    public final void onFinishTemporaryDetach() {
        super.onFinishTemporaryDetach();
        if (this.h && (getText() instanceof Spanned)) {
            Spanned spanned = (Spanned) getText();
            for (C4177hZ c4177hZ : (C4177hZ[]) spanned.getSpans(0, spanned.length(), C4177hZ.class)) {
                EnumC7202tL enumC7202tL = EnumC7202tL.o;
                C6394p6 c6394p6 = c4177hZ.c;
                ((C7393uL) c6394p6.c).a(enumC7202tL);
                c6394p6.e = true;
                c6394p6.d();
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:107:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x00d2  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x00d6  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x00fa  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x0100  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x0117 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:147:0x011c  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x012b  */
    /* JADX WARN: Removed duplicated region for block: B:165:0x0153 A[SYNTHETIC] */
    @Override // defpackage.C6969s7, android.widget.TextView, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void onLayout(boolean r24, int r25, int r26, int r27, int r28) {
        /*
            Method dump skipped, instructions count: 409
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C3379dN0.onLayout(boolean, int, int, int, int):void");
    }

    @Override // android.view.View
    public final void onStartTemporaryDetach() {
        super.onStartTemporaryDetach();
        if (this.h && (getText() instanceof Spanned)) {
            Spanned spanned = (Spanned) getText();
            for (C4177hZ c4177hZ : (C4177hZ[]) spanned.getSpans(0, spanned.length(), C4177hZ.class)) {
                EnumC7202tL enumC7202tL = EnumC7202tL.p;
                C6394p6 c6394p6 = c4177hZ.c;
                ((C7393uL) c6394p6.c).a(enumC7202tL);
                c6394p6.e = false;
                c6394p6.d();
            }
        }
    }

    @Override // defpackage.QJ0
    public final int reactTagForTouch(float f, float f2) {
        int i;
        CharSequence text = getText();
        int id = getId();
        int i2 = (int) f;
        int i3 = (int) f2;
        Layout layout = getLayout();
        if (layout == null) {
            return id;
        }
        int lineForVertical = layout.getLineForVertical(i3);
        int lineLeft = (int) layout.getLineLeft(lineForVertical);
        int lineRight = (int) layout.getLineRight(lineForVertical);
        if ((text instanceof Spanned) && i2 >= lineLeft && i2 <= lineRight) {
            Spanned spanned = (Spanned) text;
            try {
                int offsetForHorizontal = layout.getOffsetForHorizontal(lineForVertical, i2);
                TM0[] tm0Arr = (TM0[]) spanned.getSpans(offsetForHorizontal, offsetForHorizontal, TM0.class);
                if (tm0Arr != null) {
                    int length = text.length();
                    for (int i4 = 0; i4 < tm0Arr.length; i4++) {
                        int spanStart = spanned.getSpanStart(tm0Arr[i4]);
                        int spanEnd = spanned.getSpanEnd(tm0Arr[i4]);
                        if (spanEnd >= offsetForHorizontal && (i = spanEnd - spanStart) <= length) {
                            id = tm0Arr[i4].a;
                            length = i;
                        }
                    }
                }
            } catch (ArrayIndexOutOfBoundsException e) {
                e.getMessage();
                AbstractC3393dS.e("ReactNative");
            }
        }
        return id;
    }

    public void setAdjustFontSizeToFit(boolean z) {
        this.k = z;
    }

    @Override // android.view.View
    public void setBackgroundColor(int i) {
        this.s.b0(i);
    }

    public void setBorderRadius(float f) {
        this.s.G().l(f);
    }

    public void setBorderStyle(String str) {
        int iB;
        C1453Sk c1453SkG = this.s.G();
        if (str == null) {
            iB = 0;
        } else {
            c1453SkG.getClass();
            iB = AbstractC8235ym.B(str.toUpperCase(Locale.US));
        }
        if (c1453SkG.A != iB) {
            c1453SkG.A = iB;
            c1453SkG.s = true;
            c1453SkG.invalidateSelf();
        }
    }

    @Override // android.widget.TextView
    public void setBreakStrategy(int i) {
        super.setBreakStrategy(i);
        this.r = true;
    }

    public void setEllipsizeLocation(TextUtils.TruncateAt truncateAt) {
        this.j = truncateAt;
    }

    public void setFontSize(float f) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        this.l = (float) (this.k ? Math.ceil(AbstractC7586vL1.c(f, Float.NaN)) : Math.ceil(AbstractC7586vL1.b(f)));
        h();
    }

    public void setGravityHorizontal(int i) {
        if (i == 0) {
            i = 8388611;
        }
        setGravity(i | (getGravity() & (-8388616)));
    }

    public void setGravityVertical(int i) {
        if (i == 0) {
            i = 48;
        }
        setGravity(i | (getGravity() & (-113)));
    }

    @Override // android.widget.TextView
    public void setHyphenationFrequency(int i) {
        super.setHyphenationFrequency(i);
        this.r = true;
    }

    @Override // android.widget.TextView
    public void setIncludeFontPadding(boolean z) {
        super.setIncludeFontPadding(z);
        this.r = true;
    }

    @Override // android.widget.TextView
    public void setLetterSpacing(float f) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        if (Float.isNaN(f)) {
            return;
        }
        this.n = AbstractC7586vL1.b(f) / this.l;
        h();
    }

    public void setLinkifyMask(int i) {
        this.o = i;
    }

    public void setMinimumFontSize(float f) {
        this.m = f;
        this.r = true;
    }

    public void setNotifyOnInlineViewLayout(boolean z) {
        this.p = z;
    }

    public void setNumberOfLines(int i) {
        if (i == 0) {
            i = Integer.MAX_VALUE;
        }
        this.i = i;
        setMaxLines(i);
        this.r = true;
    }

    public void setOverflow(String str) {
        this.s.e0(str);
    }

    public void setSpanned(Spannable spannable) {
        this.t = spannable;
        this.r = true;
    }

    public void setText(C2503cN0 c2503cN0) {
        this.h = c2503cN0.c;
        if (getLayoutParams() == null) {
            setLayoutParams(u);
        }
        int i = this.o;
        Spannable spannable = c2503cN0.a;
        if (i > 0) {
            Linkify.addLinks(spannable, i);
            setMovementMethod(LinkMovementMethod.getInstance());
        }
        setText(spannable);
        float f = c2503cN0.d;
        if (f != -1.0f) {
            float f2 = c2503cN0.e;
            if (f2 != -1.0f) {
                float f3 = c2503cN0.f;
                if (f3 != -1.0f) {
                    float f4 = c2503cN0.g;
                    if (f4 != -1.0f) {
                        setPadding((int) Math.floor(f), (int) Math.floor(f2), (int) Math.floor(f3), (int) Math.floor(f4));
                    }
                }
            }
        }
        int gravityHorizontal = getGravityHorizontal();
        int i2 = c2503cN0.h;
        if (i2 != gravityHorizontal) {
            setGravityHorizontal(i2);
        }
        int breakStrategy = getBreakStrategy();
        int i3 = c2503cN0.i;
        if (breakStrategy != i3) {
            setBreakStrategy(i3);
        }
        if (Build.VERSION.SDK_INT >= 26) {
            int justificationMode = getJustificationMode();
            int i4 = c2503cN0.j;
            if (justificationMode != i4) {
                setJustificationMode(i4);
            }
        }
        requestLayout();
    }

    @Override // android.widget.TextView
    public void setTextIsSelectable(boolean z) {
        this.q = z;
        super.setTextIsSelectable(z);
    }

    @Override // android.widget.TextView, android.view.View
    public final boolean verifyDrawable(Drawable drawable) {
        if (this.h && (getText() instanceof Spanned)) {
            Spanned spanned = (Spanned) getText();
            for (C4177hZ c4177hZ : (C4177hZ[]) spanned.getSpans(0, spanned.length(), C4177hZ.class)) {
                if (c4177hZ.a == drawable) {
                    return true;
                }
            }
        }
        return super.verifyDrawable(drawable);
    }
}
