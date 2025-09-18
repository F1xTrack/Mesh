package p000;

import android.R;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.DashPathEffect;
import android.graphics.Paint;
import android.graphics.PathEffect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.PaintDrawable;
import android.graphics.drawable.RippleDrawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.RectShape;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityNodeInfo;
import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes2.dex */
public final class DH0 extends ViewGroup implements InterfaceC11475vu0 {

    /* renamed from: u */
    public static DH0 f1941u;

    /* renamed from: v */
    public static DH0 f1942v;

    /* renamed from: a */
    public Integer f1944a;

    /* renamed from: b */
    public Integer f1945b;

    /* renamed from: c */
    public boolean f1946c;

    /* renamed from: d */
    public boolean f1947d;

    /* renamed from: e */
    public float f1948e;

    /* renamed from: f */
    public float f1949f;

    /* renamed from: g */
    public float f1950g;

    /* renamed from: h */
    public float f1951h;

    /* renamed from: i */
    public float f1952i;

    /* renamed from: j */
    public float f1953j;

    /* renamed from: k */
    public Integer f1954k;

    /* renamed from: l */
    public String f1955l;

    /* renamed from: m */
    public boolean f1956m;

    /* renamed from: n */
    public int f1957n;

    /* renamed from: o */
    public boolean f1958o;

    /* renamed from: p */
    public long f1959p;

    /* renamed from: q */
    public int f1960q;

    /* renamed from: r */
    public boolean f1961r;

    /* renamed from: s */
    public boolean f1962s;

    /* renamed from: t */
    public static final TypedValue f1940t = new TypedValue();

    /* renamed from: w */
    public static final CH0 f1943w = new CH0();

    private final boolean getHasBorderRadii() {
        return (this.f1948e == 0.0f && this.f1949f == 0.0f && this.f1950g == 0.0f && this.f1951h == 0.0f && this.f1952i == 0.0f) ? false : true;
    }

    /* renamed from: j */
    public static boolean m1608j(InterfaceC9127dY0 interfaceC9127dY0) {
        Iterator it = interfaceC9127dY0.iterator();
        while (it.hasNext()) {
            View view = (View) it.next();
            if (view instanceof DH0) {
                DH0 dh0 = (DH0) view;
                if (dh0.f1962s || dh0.isPressed()) {
                    return true;
                }
            }
            if (view instanceof ViewGroup) {
                if (m1608j(new C0764M8(5, (ViewGroup) view))) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // p000.InterfaceC11475vu0
    /* renamed from: a */
    public final boolean mo1609a() {
        return false;
    }

    @Override // p000.InterfaceC11475vu0
    /* renamed from: b */
    public final boolean mo1610b(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 3 || motionEvent.getAction() == 1 || motionEvent.getActionMasked() == 6) {
            return false;
        }
        boolean zM1618k = m1618k();
        if (zM1618k) {
            this.f1962s = true;
        }
        return zM1618k;
    }

    @Override // p000.InterfaceC11475vu0
    /* renamed from: c */
    public final boolean mo1611c() {
        return false;
    }

    @Override // p000.InterfaceC11475vu0
    /* renamed from: d */
    public final boolean mo1612d(View view) {
        return QB1.m6598a(view);
    }

    @Override // android.view.View
    public final void drawableHotspotChanged(float f, float f2) {
        DH0 dh0 = f1941u;
        if (dh0 == null || dh0 == this) {
            super.drawableHotspotChanged(f, f2);
        }
    }

    @Override // p000.InterfaceC11475vu0
    /* renamed from: f */
    public final Boolean mo1614f(R00 r00) {
        O90.m5968f(r00, "handler");
        return null;
    }

    @Override // p000.InterfaceC11475vu0
    /* renamed from: g */
    public final Boolean mo1615g(View view, MotionEvent motionEvent) {
        return QB1.m6602e(view, motionEvent);
    }

    public final float getBorderBottomLeftRadius() {
        return this.f1951h;
    }

    public final float getBorderBottomRightRadius() {
        return this.f1952i;
    }

    public final Integer getBorderColor() {
        return this.f1954k;
    }

    public final float getBorderRadius() {
        return this.f1948e;
    }

    public final String getBorderStyle() {
        return this.f1955l;
    }

    public final float getBorderTopLeftRadius() {
        return this.f1949f;
    }

    public final float getBorderTopRightRadius() {
        return this.f1950g;
    }

    public final float getBorderWidth() {
        return this.f1953j;
    }

    public final boolean getExclusive() {
        return this.f1956m;
    }

    public final Integer getRippleColor() {
        return this.f1944a;
    }

    public final Integer getRippleRadius() {
        return this.f1945b;
    }

    public final boolean getUseBorderlessDrawable() {
        return this.f1947d;
    }

    public final boolean getUseDrawableOnForeground() {
        return this.f1946c;
    }

    @Override // p000.InterfaceC11475vu0
    /* renamed from: h */
    public final void mo1616h(MotionEvent motionEvent) {
        if (f1941u == this) {
            f1941u = null;
            f1942v = this;
        }
        this.f1962s = false;
    }

    /* renamed from: i */
    public final float[] m1617i() {
        float f = this.f1949f;
        float f2 = this.f1950g;
        float f3 = this.f1952i;
        float f4 = this.f1951h;
        int i = 0;
        float[] fArr = {f, f, f2, f2, f3, f3, f4, f4};
        ArrayList arrayList = new ArrayList(8);
        for (int i2 = 0; i2 < 8; i2++) {
            float f5 = fArr[i2];
            if (f5 == 0.0f) {
                f5 = this.f1948e;
            }
            arrayList.add(Float.valueOf(f5));
        }
        float[] fArr2 = new float[arrayList.size()];
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            fArr2[i] = ((Number) it.next()).floatValue();
            i++;
        }
        return fArr2;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0029  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0054  */
    /* renamed from: k */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean m1618k() {
        /*
            r7 = this;
            r0 = 0
            r1 = r0
        L2:
            int r2 = r7.getChildCount()
            r3 = 1
            if (r1 >= r2) goto Lb
            r2 = r3
            goto Lc
        Lb:
            r2 = r0
        Lc:
            if (r2 == 0) goto L73
            int r2 = r1 + 1
            android.view.View r1 = r7.getChildAt(r1)
            if (r1 == 0) goto L6d
            boolean r4 = r1 instanceof p000.DH0
            if (r4 == 0) goto L29
            r4 = r1
            DH0 r4 = (p000.DH0) r4
            boolean r5 = r4.f1962s
            if (r5 != 0) goto L27
            boolean r4 = r4.isPressed()
            if (r4 == 0) goto L29
        L27:
            r1 = r3
            goto L74
        L29:
            boolean r4 = r1 instanceof android.view.ViewGroup
            if (r4 == 0) goto L6b
            android.view.ViewGroup r1 = (android.view.ViewGroup) r1
            q0 r4 = new q0
            r5 = 3
            r4.<init>(r5, r1)
        L35:
            boolean r1 = r4.hasNext()
            if (r1 == 0) goto L67
            java.lang.Object r1 = r4.next()
            android.view.View r1 = (android.view.View) r1
            boolean r5 = r1 instanceof p000.DH0
            if (r5 == 0) goto L54
            r5 = r1
            DH0 r5 = (p000.DH0) r5
            boolean r6 = r5.f1962s
            if (r6 != 0) goto L52
            boolean r5 = r5.isPressed()
            if (r5 == 0) goto L54
        L52:
            r1 = r3
            goto L68
        L54:
            boolean r5 = r1 instanceof android.view.ViewGroup
            if (r5 == 0) goto L35
            android.view.ViewGroup r1 = (android.view.ViewGroup) r1
            M8 r5 = new M8
            r6 = 5
            r5.<init>(r6, r1)
            boolean r1 = m1608j(r5)
            if (r1 == 0) goto L35
            goto L52
        L67:
            r1 = r0
        L68:
            if (r1 == 0) goto L6b
            goto L27
        L6b:
            r1 = r2
            goto L2
        L6d:
            java.lang.IndexOutOfBoundsException r0 = new java.lang.IndexOutOfBoundsException
            r0.<init>()
            throw r0
        L73:
            r1 = r0
        L74:
            if (r1 == 0) goto L77
            return r0
        L77:
            DH0 r1 = p000.DH0.f1941u
            if (r1 != 0) goto L7e
            p000.DH0.f1941u = r7
            return r3
        L7e:
            boolean r2 = r7.f1956m
            if (r2 == 0) goto L86
            if (r1 != r7) goto L8b
        L84:
            r0 = r3
            goto L8b
        L86:
            boolean r1 = r1.f1956m
            if (r1 != 0) goto L8b
            goto L84
        L8b:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.DH0.m1618k():boolean");
    }

    /* renamed from: l */
    public final void m1619l() {
        ColorStateList colorStateList;
        RippleDrawable rippleDrawable;
        PathEffect dashPathEffect;
        if (this.f1958o) {
            this.f1958o = false;
            if (this.f1957n == 0) {
                setBackground(null);
            }
            setForeground(null);
            Integer num = this.f1944a;
            if (num != null && num.intValue() == 0) {
                rippleDrawable = null;
            } else {
                int[][] iArr = {new int[]{R.attr.state_enabled}};
                Integer num2 = this.f1945b;
                Integer num3 = this.f1944a;
                if (num3 != null) {
                    colorStateList = new ColorStateList(iArr, new int[]{num3.intValue()});
                } else {
                    Resources.Theme theme = getContext().getTheme();
                    TypedValue typedValue = f1940t;
                    theme.resolveAttribute(R.attr.colorControlHighlight, typedValue, true);
                    colorStateList = new ColorStateList(iArr, new int[]{typedValue.data});
                }
                rippleDrawable = new RippleDrawable(colorStateList, null, this.f1947d ? null : new ShapeDrawable(new RectShape()));
                if (num2 != null) {
                    rippleDrawable.setRadius((int) AbstractC11406vL1.m25403b(num2.intValue()));
                }
            }
            PaintDrawable paintDrawable = new PaintDrawable(0);
            if (getHasBorderRadii()) {
                paintDrawable.setCornerRadii(m1617i());
            }
            if (this.f1953j > 0.0f) {
                Paint paint = paintDrawable.getPaint();
                paint.setStyle(Paint.Style.STROKE);
                paint.setStrokeWidth(this.f1953j);
                Integer num4 = this.f1954k;
                paint.setColor(num4 != null ? num4.intValue() : -16777216);
                String str = this.f1955l;
                if (O90.m5963a(str, "dotted")) {
                    float f = this.f1953j;
                    dashPathEffect = new DashPathEffect(new float[]{f, f, f, f}, 0.0f);
                } else if (O90.m5963a(str, "dashed")) {
                    float f2 = this.f1953j * 3;
                    dashPathEffect = new DashPathEffect(new float[]{f2, f2, f2, f2}, 0.0f);
                } else {
                    dashPathEffect = null;
                }
                paint.setPathEffect(dashPathEffect);
            }
            if (getHasBorderRadii() && (rippleDrawable instanceof RippleDrawable)) {
                PaintDrawable paintDrawable2 = new PaintDrawable(-1);
                paintDrawable2.setCornerRadii(m1617i());
                rippleDrawable.setDrawableByLayerId(R.id.mask, paintDrawable2);
            }
            if (this.f1946c) {
                setForeground(rippleDrawable);
                int i = this.f1957n;
                if (i != 0) {
                    m1620m(i, paintDrawable, null);
                    return;
                }
                return;
            }
            int i2 = this.f1957n;
            if (i2 == 0 && this.f1944a == null) {
                setBackground(new LayerDrawable(new Drawable[]{rippleDrawable, paintDrawable}));
            } else {
                m1620m(i2, paintDrawable, rippleDrawable);
            }
        }
    }

    /* renamed from: m */
    public final void m1620m(int i, PaintDrawable paintDrawable, RippleDrawable rippleDrawable) {
        PaintDrawable paintDrawable2 = new PaintDrawable(i);
        if (getHasBorderRadii()) {
            paintDrawable2.setCornerRadii(m1617i());
        }
        setBackground(new LayerDrawable(rippleDrawable != null ? new Drawable[]{paintDrawable2, rippleDrawable, paintDrawable} : new Drawable[]{paintDrawable2, paintDrawable}));
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        O90.m5968f(accessibilityNodeInfo, "info");
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        Object tag = getTag(ru.mes.dnevnik.R.id.react_test_id);
        if (tag instanceof String) {
            accessibilityNodeInfo.setViewIdResourceName((String) tag);
        }
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        O90.m5968f(motionEvent, "ev");
        if (super.onInterceptTouchEvent(motionEvent)) {
            return true;
        }
        onTouchEvent(motionEvent);
        return isPressed();
    }

    @Override // android.view.View, android.view.KeyEvent.Callback
    public final boolean onKeyUp(int i, KeyEvent keyEvent) {
        this.f1961r = true;
        return super.onKeyUp(i, keyEvent);
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        O90.m5968f(motionEvent, "event");
        long eventTime = motionEvent.getEventTime();
        int action = motionEvent.getAction();
        DH0 dh0 = f1941u;
        if (dh0 != null && dh0 != this && dh0.f1956m) {
            if (isPressed()) {
                setPressed(false);
            }
            this.f1959p = eventTime;
            this.f1960q = action;
            return false;
        }
        if (motionEvent.getAction() == 3 && f1941u == this) {
            f1941u = null;
            f1942v = this;
        }
        if (this.f1959p == eventTime && this.f1960q == action && action != 3) {
            return false;
        }
        this.f1959p = eventTime;
        this.f1960q = action;
        return super.onTouchEvent(motionEvent);
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0028  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean performClick() {
        /*
            Method dump skipped, instructions count: 220
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.DH0.performClick():boolean");
    }

    @Override // android.view.View
    public void setBackgroundColor(int i) {
        this.f1957n = i;
        this.f1958o = true;
    }

    public final void setBorderBottomLeftRadius(float f) {
        this.f1951h = f * getResources().getDisplayMetrics().density;
        this.f1958o = true;
    }

    public final void setBorderBottomRightRadius(float f) {
        this.f1952i = f * getResources().getDisplayMetrics().density;
        this.f1958o = true;
    }

    public final void setBorderColor(Integer num) {
        this.f1954k = num;
        this.f1958o = true;
    }

    public final void setBorderRadius(float f) {
        this.f1948e = f * getResources().getDisplayMetrics().density;
        this.f1958o = true;
    }

    public final void setBorderStyle(String str) {
        this.f1955l = str;
        this.f1958o = true;
    }

    public final void setBorderTopLeftRadius(float f) {
        this.f1949f = f * getResources().getDisplayMetrics().density;
        this.f1958o = true;
    }

    public final void setBorderTopRightRadius(float f) {
        this.f1950g = f * getResources().getDisplayMetrics().density;
        this.f1958o = true;
    }

    public final void setBorderWidth(float f) {
        this.f1953j = f * getResources().getDisplayMetrics().density;
        this.f1958o = true;
    }

    public final void setExclusive(boolean z) {
        this.f1956m = z;
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x008a A[EDGE_INSN: B:64:0x008a->B:51:0x008a BREAK  A[LOOP:0: B:14:0x001b->B:48:0x0082], EDGE_INSN: B:65:0x008a->B:51:0x008a BREAK  A[LOOP:0: B:14:0x001b->B:48:0x0082], EDGE_INSN: B:66:0x008a->B:51:0x008a BREAK  A[LOOP:0: B:14:0x001b->B:48:0x0082]] */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void setPressed(boolean r8) {
        /*
            r7 = this;
            if (r8 == 0) goto La
            boolean r0 = r7.m1618k()
            if (r0 == 0) goto La
            p000.DH0.f1942v = r7
        La:
            boolean r0 = r7.f1956m
            r1 = 0
            if (r0 != 0) goto L8a
            DH0 r0 = p000.DH0.f1941u
            r2 = 1
            if (r0 == 0) goto L1a
            boolean r0 = r0.f1956m
            if (r0 != r2) goto L1a
            goto L8a
        L1a:
            r0 = r1
        L1b:
            int r3 = r7.getChildCount()
            if (r0 >= r3) goto L23
            r3 = r2
            goto L24
        L23:
            r3 = r1
        L24:
            if (r3 == 0) goto L8b
            int r3 = r0 + 1
            android.view.View r0 = r7.getChildAt(r0)
            if (r0 == 0) goto L84
            boolean r4 = r0 instanceof p000.DH0
            if (r4 == 0) goto L40
            r4 = r0
            DH0 r4 = (p000.DH0) r4
            boolean r5 = r4.f1962s
            if (r5 != 0) goto L8a
            boolean r4 = r4.isPressed()
            if (r4 == 0) goto L40
            goto L8a
        L40:
            boolean r4 = r0 instanceof android.view.ViewGroup
            if (r4 == 0) goto L82
            android.view.ViewGroup r0 = (android.view.ViewGroup) r0
            q0 r4 = new q0
            r5 = 3
            r4.<init>(r5, r0)
        L4c:
            boolean r0 = r4.hasNext()
            if (r0 == 0) goto L7e
            java.lang.Object r0 = r4.next()
            android.view.View r0 = (android.view.View) r0
            boolean r5 = r0 instanceof p000.DH0
            if (r5 == 0) goto L6b
            r5 = r0
            DH0 r5 = (p000.DH0) r5
            boolean r6 = r5.f1962s
            if (r6 != 0) goto L69
            boolean r5 = r5.isPressed()
            if (r5 == 0) goto L6b
        L69:
            r0 = r2
            goto L7f
        L6b:
            boolean r5 = r0 instanceof android.view.ViewGroup
            if (r5 == 0) goto L4c
            android.view.ViewGroup r0 = (android.view.ViewGroup) r0
            M8 r5 = new M8
            r6 = 5
            r5.<init>(r6, r0)
            boolean r0 = m1608j(r5)
            if (r0 == 0) goto L4c
            goto L69
        L7e:
            r0 = r1
        L7f:
            if (r0 == 0) goto L82
            goto L8a
        L82:
            r0 = r3
            goto L1b
        L84:
            java.lang.IndexOutOfBoundsException r8 = new java.lang.IndexOutOfBoundsException
            r8.<init>()
            throw r8
        L8a:
            r2 = r1
        L8b:
            if (r8 == 0) goto L93
            DH0 r0 = p000.DH0.f1941u
            if (r0 == r7) goto L93
            if (r2 == 0) goto L98
        L93:
            r7.f1962s = r8
            super.setPressed(r8)
        L98:
            if (r8 != 0) goto La0
            DH0 r8 = p000.DH0.f1941u
            if (r8 != r7) goto La0
            r7.f1962s = r1
        La0:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.DH0.setPressed(boolean):void");
    }

    public final void setRippleColor(Integer num) {
        this.f1944a = num;
        this.f1958o = true;
    }

    public final void setRippleRadius(Integer num) {
        this.f1945b = num;
        this.f1958o = true;
    }

    public final void setTouched(boolean z) {
        this.f1962s = z;
    }

    public final void setUseBorderlessDrawable(boolean z) {
        this.f1947d = z;
    }

    public final void setUseDrawableOnForeground(boolean z) {
        this.f1946c = z;
        this.f1958o = true;
    }

    @Override // p000.InterfaceC11475vu0
    /* renamed from: e */
    public final void mo1613e(MotionEvent motionEvent) {
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDrawableHotspotChanged(float f, float f2) {
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
    }
}
