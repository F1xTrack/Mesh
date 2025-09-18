package p000;

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
public final class C9105dN0 extends C6803s7 implements QJ0 {

    /* renamed from: u */
    public static final ViewGroup.LayoutParams f25995u = new ViewGroup.LayoutParams(0, 0);

    /* renamed from: h */
    public boolean f25996h;

    /* renamed from: i */
    public int f25997i;

    /* renamed from: j */
    public TextUtils.TruncateAt f25998j;

    /* renamed from: k */
    public boolean f25999k;

    /* renamed from: l */
    public float f26000l;

    /* renamed from: m */
    public float f26001m;

    /* renamed from: n */
    public float f26002n;

    /* renamed from: o */
    public int f26003o;

    /* renamed from: p */
    public boolean f26004p;

    /* renamed from: q */
    public boolean f26005q;

    /* renamed from: r */
    public boolean f26006r;

    /* renamed from: s */
    public C1356VY f26007s;

    /* renamed from: t */
    public Spannable f26008t;

    private ReactContext getReactContext() {
        Context context = getContext();
        return context instanceof AbstractC7835Ka1 ? (ReactContext) ((AbstractC7835Ka1) context).getBaseContext() : (ReactContext) context;
    }

    /* renamed from: j */
    public static WritableMap m17555j(int i, int i2, int i3, int i4, int i5, int i6) {
        WritableMap writableMapCreateMap = Arguments.createMap();
        if (i == 8) {
            writableMapCreateMap.putString("visibility", "gone");
            writableMapCreateMap.putInt("index", i2);
        } else if (i == 0) {
            writableMapCreateMap.putString("visibility", "visible");
            writableMapCreateMap.putInt("index", i2);
            writableMapCreateMap.putDouble("left", AbstractC11406vL1.m25402a(i3));
            writableMapCreateMap.putDouble("top", AbstractC11406vL1.m25402a(i4));
            writableMapCreateMap.putDouble("right", AbstractC11406vL1.m25402a(i5));
            writableMapCreateMap.putDouble("bottom", AbstractC11406vL1.m25402a(i6));
        } else {
            writableMapCreateMap.putString("visibility", "unknown");
            writableMapCreateMap.putInt("index", i2);
        }
        return writableMapCreateMap;
    }

    @Override // android.view.View
    public final boolean dispatchHoverEvent(MotionEvent motionEvent) {
        if (AbstractC10944rk1.m24472d(this) != null) {
            C0002A1 c0002a1M24471c = AbstractC10944rk1.m24471c(this);
            if (c0002a1M24471c instanceof AbstractC6426mR) {
                return ((AbstractC6426mR) c0002a1M24471c).m22821l(motionEvent) || super.dispatchHoverEvent(motionEvent);
            }
        }
        return super.dispatchHoverEvent(motionEvent);
    }

    public int getGravityHorizontal() {
        return getGravity() & 8388615;
    }

    public Spannable getSpanned() {
        return this.f26008t;
    }

    /* renamed from: h */
    public final void m17556h() throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        if (!Float.isNaN(this.f26000l)) {
            setTextSize(0, this.f26000l);
        }
        if (Float.isNaN(this.f26002n)) {
            return;
        }
        super.setLetterSpacing(this.f26002n);
    }

    @Override // android.widget.TextView, android.view.View
    public final boolean hasOverlappingRendering() {
        return false;
    }

    /* renamed from: i */
    public final void m17557i() {
        C1356VY c1356vy = this.f26007s;
        if (c1356vy != null) {
            View view = (View) c1356vy.f12613d;
            WeakHashMap weakHashMap = AbstractC10944rk1.f41842a;
            view.setBackground(null);
            c1356vy.f12613d = null;
            c1356vy.f12612c = null;
        }
        this.f26007s = new C1356VY(this);
        this.f25997i = Integer.MAX_VALUE;
        this.f25999k = false;
        this.f26003o = 0;
        this.f26004p = false;
        this.f26005q = false;
        this.f26006r = false;
        this.f25998j = TextUtils.TruncateAt.END;
        this.f26000l = Float.NaN;
        this.f26001m = Float.NaN;
        this.f26002n = 0.0f;
        this.f26008t = null;
    }

    @Override // android.widget.TextView, android.view.View, android.graphics.drawable.Drawable.Callback
    public final void invalidateDrawable(Drawable drawable) {
        if (this.f25996h && (getText() instanceof Spanned)) {
            Spanned spanned = (Spanned) getText();
            for (C4187hZ c4187hZ : (C4187hZ[]) spanned.getSpans(0, spanned.length(), C4187hZ.class)) {
                if (c4187hZ.f28448a == drawable) {
                    invalidate();
                }
            }
        }
        super.invalidateDrawable(drawable);
    }

    /* renamed from: k */
    public final void m17558k() throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        m17557i();
        setBreakStrategy(0);
        setMovementMethod(getDefaultMovementMethod());
        int i = Build.VERSION.SDK_INT;
        if (i >= 26) {
            setJustificationMode(0);
        }
        setLayoutParams(f25995u);
        TextUtils.TruncateAt truncateAt = null;
        setText((CharSequence) null);
        m17556h();
        setGravity(8388659);
        setNumberOfLines(this.f25997i);
        setAdjustFontSizeToFit(this.f25999k);
        setLinkifyMask(this.f26003o);
        setTextIsSelectable(this.f26005q);
        setIncludeFontPadding(true);
        setEnabled(true);
        setLinkifyMask(0);
        setEllipsizeLocation(this.f25998j);
        setEnabled(true);
        if (i >= 26) {
            setFocusable(16);
        }
        setHyphenationFrequency(0);
        if (this.f25997i != Integer.MAX_VALUE && !this.f25999k) {
            truncateAt = this.f25998j;
        }
        setEllipsize(truncateAt);
    }

    @Override // android.widget.TextView, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        setTextIsSelectable(this.f26005q);
        if (this.f25996h && (getText() instanceof Spanned)) {
            Spanned spanned = (Spanned) getText();
            for (C4187hZ c4187hZ : (C4187hZ[]) spanned.getSpans(0, spanned.length(), C4187hZ.class)) {
                EnumC6880tL enumC6880tL = EnumC6880tL.f43011o;
                C6596p6 c6596p6 = c4187hZ.f28450c;
                ((C6943uL) c6596p6.f39834c).m25182a(enumC6880tL);
                c6596p6.f39836e = true;
                c6596p6.m23614d();
            }
        }
    }

    @Override // p000.C6803s7, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        if (this.f25996h && (getText() instanceof Spanned)) {
            Spanned spanned = (Spanned) getText();
            for (C4187hZ c4187hZ : (C4187hZ[]) spanned.getSpans(0, spanned.length(), C4187hZ.class)) {
                EnumC6880tL enumC6880tL = EnumC6880tL.f43012p;
                C6596p6 c6596p6 = c4187hZ.f28450c;
                ((C6943uL) c6596p6.f39834c).m25182a(enumC6880tL);
                c6596p6.f39836e = false;
                c6596p6.m23614d();
            }
        }
    }

    @Override // android.widget.TextView, android.view.View
    public final void onDraw(Canvas canvas) {
        if (this.f25999k && getSpanned() != null && this.f26006r) {
            this.f26006r = false;
            Spannable spanned = getSpanned();
            float width = getWidth();
            EnumC7813Jp1 enumC7813Jp1 = EnumC7813Jp1.f5716b;
            A91.m91a(spanned, width, enumC7813Jp1, getHeight(), enumC7813Jp1, this.f26001m, this.f25997i, getIncludeFontPadding(), getBreakStrategy(), getHyphenationFrequency(), Layout.Alignment.ALIGN_NORMAL);
            setText(getSpanned());
        }
        this.f26007s.m8483U(canvas);
        super.onDraw(canvas);
    }

    @Override // android.view.View
    public final void onFinishTemporaryDetach() {
        super.onFinishTemporaryDetach();
        if (this.f25996h && (getText() instanceof Spanned)) {
            Spanned spanned = (Spanned) getText();
            for (C4187hZ c4187hZ : (C4187hZ[]) spanned.getSpans(0, spanned.length(), C4187hZ.class)) {
                EnumC6880tL enumC6880tL = EnumC6880tL.f43011o;
                C6596p6 c6596p6 = c4187hZ.f28450c;
                ((C6943uL) c6596p6.f39834c).m25182a(enumC6880tL);
                c6596p6.f39836e = true;
                c6596p6.m23614d();
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
    @Override // p000.C6803s7, android.widget.TextView, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void onLayout(boolean r24, int r25, int r26, int r27, int r28) {
        /*
            Method dump skipped, instructions count: 409
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.C9105dN0.onLayout(boolean, int, int, int, int):void");
    }

    @Override // android.view.View
    public final void onStartTemporaryDetach() {
        super.onStartTemporaryDetach();
        if (this.f25996h && (getText() instanceof Spanned)) {
            Spanned spanned = (Spanned) getText();
            for (C4187hZ c4187hZ : (C4187hZ[]) spanned.getSpans(0, spanned.length(), C4187hZ.class)) {
                EnumC6880tL enumC6880tL = EnumC6880tL.f43012p;
                C6596p6 c6596p6 = c4187hZ.f28450c;
                ((C6943uL) c6596p6.f39834c).m25182a(enumC6880tL);
                c6596p6.f39836e = false;
                c6596p6.m23614d();
            }
        }
    }

    @Override // p000.QJ0
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
                            id = tm0Arr[i4].f11329a;
                            length = i;
                        }
                    }
                }
            } catch (ArrayIndexOutOfBoundsException e) {
                e.getMessage();
                AbstractC3929dS.m17672e("ReactNative");
            }
        }
        return id;
    }

    public void setAdjustFontSizeToFit(boolean z) {
        this.f25999k = z;
    }

    @Override // android.view.View
    public void setBackgroundColor(int i) {
        this.f26007s.m8489b0(i);
    }

    public void setBorderRadius(float f) {
        this.f26007s.m8469G().m7444l(f);
    }

    public void setBorderStyle(String str) {
        int iM26222B;
        C1179Sk c1179SkM8469G = this.f26007s.m8469G();
        if (str == null) {
            iM26222B = 0;
        } else {
            c1179SkM8469G.getClass();
            iM26222B = AbstractC7222ym.m26222B(str.toUpperCase(Locale.US));
        }
        if (c1179SkM8469G.f10930A != iM26222B) {
            c1179SkM8469G.f10930A = iM26222B;
            c1179SkM8469G.f10949s = true;
            c1179SkM8469G.invalidateSelf();
        }
    }

    @Override // android.widget.TextView
    public void setBreakStrategy(int i) {
        super.setBreakStrategy(i);
        this.f26006r = true;
    }

    public void setEllipsizeLocation(TextUtils.TruncateAt truncateAt) {
        this.f25998j = truncateAt;
    }

    public void setFontSize(float f) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        this.f26000l = (float) (this.f25999k ? Math.ceil(AbstractC11406vL1.m25404c(f, Float.NaN)) : Math.ceil(AbstractC11406vL1.m25403b(f)));
        m17556h();
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
        this.f26006r = true;
    }

    @Override // android.widget.TextView
    public void setIncludeFontPadding(boolean z) {
        super.setIncludeFontPadding(z);
        this.f26006r = true;
    }

    @Override // android.widget.TextView
    public void setLetterSpacing(float f) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        if (Float.isNaN(f)) {
            return;
        }
        this.f26002n = AbstractC11406vL1.m25403b(f) / this.f26000l;
        m17556h();
    }

    public void setLinkifyMask(int i) {
        this.f26003o = i;
    }

    public void setMinimumFontSize(float f) {
        this.f26001m = f;
        this.f26006r = true;
    }

    public void setNotifyOnInlineViewLayout(boolean z) {
        this.f26004p = z;
    }

    public void setNumberOfLines(int i) {
        if (i == 0) {
            i = Integer.MAX_VALUE;
        }
        this.f25997i = i;
        setMaxLines(i);
        this.f26006r = true;
    }

    public void setOverflow(String str) {
        this.f26007s.m8493e0(str);
    }

    public void setSpanned(Spannable spannable) {
        this.f26008t = spannable;
        this.f26006r = true;
    }

    public void setText(C8972cN0 c8972cN0) {
        this.f25996h = c8972cN0.f17456c;
        if (getLayoutParams() == null) {
            setLayoutParams(f25995u);
        }
        int i = this.f26003o;
        Spannable spannable = c8972cN0.f17454a;
        if (i > 0) {
            Linkify.addLinks(spannable, i);
            setMovementMethod(LinkMovementMethod.getInstance());
        }
        setText(spannable);
        float f = c8972cN0.f17457d;
        if (f != -1.0f) {
            float f2 = c8972cN0.f17458e;
            if (f2 != -1.0f) {
                float f3 = c8972cN0.f17459f;
                if (f3 != -1.0f) {
                    float f4 = c8972cN0.f17460g;
                    if (f4 != -1.0f) {
                        setPadding((int) Math.floor(f), (int) Math.floor(f2), (int) Math.floor(f3), (int) Math.floor(f4));
                    }
                }
            }
        }
        int gravityHorizontal = getGravityHorizontal();
        int i2 = c8972cN0.f17461h;
        if (i2 != gravityHorizontal) {
            setGravityHorizontal(i2);
        }
        int breakStrategy = getBreakStrategy();
        int i3 = c8972cN0.f17462i;
        if (breakStrategy != i3) {
            setBreakStrategy(i3);
        }
        if (Build.VERSION.SDK_INT >= 26) {
            int justificationMode = getJustificationMode();
            int i4 = c8972cN0.f17463j;
            if (justificationMode != i4) {
                setJustificationMode(i4);
            }
        }
        requestLayout();
    }

    @Override // android.widget.TextView
    public void setTextIsSelectable(boolean z) {
        this.f26005q = z;
        super.setTextIsSelectable(z);
    }

    @Override // android.widget.TextView, android.view.View
    public final boolean verifyDrawable(Drawable drawable) {
        if (this.f25996h && (getText() instanceof Spanned)) {
            Spanned spanned = (Spanned) getText();
            for (C4187hZ c4187hZ : (C4187hZ[]) spanned.getSpans(0, spanned.length(), C4187hZ.class)) {
                if (c4187hZ.f28448a == drawable) {
                    return true;
                }
            }
        }
        return super.verifyDrawable(drawable);
    }
}
