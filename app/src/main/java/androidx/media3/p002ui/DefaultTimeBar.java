package androidx.media3.p002ui;

import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Point;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.TextView;
import java.util.Collections;
import java.util.Formatter;
import java.util.Iterator;
import java.util.Locale;
import java.util.concurrent.CopyOnWriteArraySet;
import p000.AbstractC7419Ca1;
import p000.AbstractC7485Dh1;
import p000.C0772MG;
import p000.C10683pi0;
import p000.C1474XQ;
import p000.IB0;
import p000.InterfaceC10028ka1;
import p000.RunnableC0204DE;
import p000.ViewOnClickListenerC10427ni0;
import p000.YG0;
import p000.YN1;

/* loaded from: classes.dex */
public class DefaultTimeBar extends View implements InterfaceC10028ka1 {

    /* renamed from: N */
    public static final /* synthetic */ int f16365N = 0;

    /* renamed from: A */
    public int f16366A;

    /* renamed from: B */
    public long f16367B;

    /* renamed from: C */
    public int f16368C;

    /* renamed from: D */
    public Rect f16369D;

    /* renamed from: E */
    public float f16370E;

    /* renamed from: F */
    public boolean f16371F;

    /* renamed from: G */
    public long f16372G;

    /* renamed from: H */
    public long f16373H;

    /* renamed from: I */
    public long f16374I;

    /* renamed from: J */
    public long f16375J;

    /* renamed from: K */
    public int f16376K;

    /* renamed from: L */
    public long[] f16377L;

    /* renamed from: M */
    public boolean[] f16378M;

    /* renamed from: a */
    public final Rect f16379a;

    /* renamed from: b */
    public final Rect f16380b;

    /* renamed from: c */
    public final Rect f16381c;

    /* renamed from: d */
    public final Rect f16382d;

    /* renamed from: e */
    public final Paint f16383e;

    /* renamed from: f */
    public final Paint f16384f;

    /* renamed from: g */
    public final Paint f16385g;

    /* renamed from: h */
    public final Paint f16386h;

    /* renamed from: i */
    public final Paint f16387i;

    /* renamed from: j */
    public final Paint f16388j;

    /* renamed from: k */
    public final Drawable f16389k;

    /* renamed from: l */
    public final int f16390l;

    /* renamed from: m */
    public final int f16391m;

    /* renamed from: n */
    public final int f16392n;

    /* renamed from: o */
    public final int f16393o;

    /* renamed from: p */
    public final int f16394p;

    /* renamed from: q */
    public final int f16395q;

    /* renamed from: r */
    public final int f16396r;

    /* renamed from: s */
    public final int f16397s;

    /* renamed from: t */
    public final int f16398t;

    /* renamed from: u */
    public final StringBuilder f16399u;

    /* renamed from: v */
    public final Formatter f16400v;

    /* renamed from: w */
    public final RunnableC0204DE f16401w;

    /* renamed from: x */
    public final CopyOnWriteArraySet f16402x;

    /* renamed from: y */
    public final Point f16403y;

    /* renamed from: z */
    public final float f16404z;

    public DefaultTimeBar(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, attributeSet);
    }

    /* renamed from: a */
    public static int m10136a(float f, int i) {
        return (int) ((i * f) + 0.5f);
    }

    private long getPositionIncrement() {
        long j = this.f16367B;
        if (j != -9223372036854775807L) {
            return j;
        }
        long j2 = this.f16373H;
        if (j2 == -9223372036854775807L) {
            return 0L;
        }
        return j2 / this.f16366A;
    }

    private String getProgressText() {
        return AbstractC7485Dh1.m1789D(this.f16399u, this.f16400v, this.f16374I);
    }

    private long getScrubberPosition() {
        if (this.f16380b.width() <= 0 || this.f16373H == -9223372036854775807L) {
            return 0L;
        }
        return (this.f16382d.width() * this.f16373H) / r0.width();
    }

    /* renamed from: b */
    public final boolean m10137b(long j) {
        long j2 = this.f16373H;
        if (j2 <= 0) {
            return false;
        }
        long j3 = this.f16371F ? this.f16372G : this.f16374I;
        long jM1826k = AbstractC7485Dh1.m1826k(j3 + j, 0L, j2);
        if (jM1826k == j3) {
            return false;
        }
        if (this.f16371F) {
            m10141f(jM1826k);
        } else {
            m10138c(jM1826k);
        }
        m10140e();
        return true;
    }

    /* renamed from: c */
    public final void m10138c(long j) {
        this.f16372G = j;
        this.f16371F = true;
        setPressed(true);
        ViewParent parent = getParent();
        if (parent != null) {
            parent.requestDisallowInterceptTouchEvent(true);
        }
        Iterator it = this.f16402x.iterator();
        while (it.hasNext()) {
            C10683pi0 c10683pi0 = ((ViewOnClickListenerC10427ni0) it.next()).f38475a;
            c10683pi0.f40298L = true;
            TextView textView = c10683pi0.f40326m;
            if (textView != null) {
                textView.setText(AbstractC7485Dh1.m1789D(c10683pi0.f40328o, c10683pi0.f40329p, j));
            }
        }
    }

    /* renamed from: d */
    public final void m10139d(boolean z) {
        IB0 ib0;
        int iM9007D1;
        removeCallbacks(this.f16401w);
        this.f16371F = false;
        setPressed(false);
        ViewParent parent = getParent();
        if (parent != null) {
            parent.requestDisallowInterceptTouchEvent(false);
        }
        invalidate();
        Iterator it = this.f16402x.iterator();
        while (it.hasNext()) {
            ViewOnClickListenerC10427ni0 viewOnClickListenerC10427ni0 = (ViewOnClickListenerC10427ni0) it.next();
            long j = this.f16372G;
            C10683pi0 c10683pi0 = viewOnClickListenerC10427ni0.f38475a;
            c10683pi0.f40298L = false;
            if (!z && (ib0 = c10683pi0.f40293G) != null) {
                C1474XQ c1474xq = (C1474XQ) ib0;
                AbstractC7419Ca1 abstractC7419Ca1M9010G1 = c1474xq.m9010G1();
                if (c10683pi0.f40297K && !abstractC7419Ca1M9010G1.m1259p()) {
                    int iMo1258o = abstractC7419Ca1M9010G1.mo1258o();
                    iM9007D1 = 0;
                    while (true) {
                        long jM1819d0 = AbstractC7485Dh1.m1819d0(abstractC7419Ca1M9010G1.mo1256m(iM9007D1, c10683pi0.f40331r, 0L).f926m);
                        if (j < jM1819d0) {
                            break;
                        }
                        if (iM9007D1 == iMo1258o - 1) {
                            j = jM1819d0;
                            break;
                        } else {
                            j -= jM1819d0;
                            iM9007D1++;
                        }
                    }
                } else {
                    iM9007D1 = c1474xq.m9007D1();
                }
                c1474xq.mo7846o1(iM9007D1, j, false);
                c10683pi0.m23847i();
            }
        }
    }

    @Override // android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        Drawable drawable = this.f16389k;
        if (drawable != null && drawable.isStateful() && drawable.setState(getDrawableState())) {
            invalidate();
        }
    }

    /* renamed from: e */
    public final void m10140e() {
        Rect rect = this.f16381c;
        Rect rect2 = this.f16380b;
        rect.set(rect2);
        Rect rect3 = this.f16382d;
        rect3.set(rect2);
        long j = this.f16371F ? this.f16372G : this.f16374I;
        if (this.f16373H > 0) {
            rect.right = Math.min(rect2.left + ((int) ((rect2.width() * this.f16375J) / this.f16373H)), rect2.right);
            rect3.right = Math.min(rect2.left + ((int) ((rect2.width() * j) / this.f16373H)), rect2.right);
        } else {
            int i = rect2.left;
            rect.right = i;
            rect3.right = i;
        }
        invalidate(this.f16379a);
    }

    /* renamed from: f */
    public final void m10141f(long j) {
        if (this.f16372G == j) {
            return;
        }
        this.f16372G = j;
        Iterator it = this.f16402x.iterator();
        while (it.hasNext()) {
            C10683pi0 c10683pi0 = ((ViewOnClickListenerC10427ni0) it.next()).f38475a;
            TextView textView = c10683pi0.f40326m;
            if (textView != null) {
                textView.setText(AbstractC7485Dh1.m1789D(c10683pi0.f40328o, c10683pi0.f40329p, j));
            }
        }
    }

    @Override // p000.InterfaceC10028ka1
    public long getPreferredUpdateDelay() {
        int iWidth = (int) (this.f16380b.width() / this.f16404z);
        if (iWidth != 0) {
            long j = this.f16373H;
            if (j != 0 && j != -9223372036854775807L) {
                return j / iWidth;
            }
        }
        return Long.MAX_VALUE;
    }

    @Override // android.view.View
    public final void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        Drawable drawable = this.f16389k;
        if (drawable != null) {
            drawable.jumpToCurrentState();
        }
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        canvas.save();
        Rect rect = this.f16380b;
        int iHeight = rect.height();
        int iCenterY = rect.centerY() - (iHeight / 2);
        int i = iCenterY + iHeight;
        long j = this.f16373H;
        Paint paint = this.f16385g;
        Rect rect2 = this.f16382d;
        if (j <= 0) {
            canvas.drawRect(rect.left, iCenterY, rect.right, i, paint);
        } else {
            Rect rect3 = this.f16381c;
            int i2 = rect3.left;
            int i3 = rect3.right;
            int iMax = Math.max(Math.max(rect.left, i3), rect2.right);
            int i4 = rect.right;
            if (iMax < i4) {
                canvas.drawRect(iMax, iCenterY, i4, i, paint);
            }
            int iMax2 = Math.max(i2, rect2.right);
            if (i3 > iMax2) {
                canvas.drawRect(iMax2, iCenterY, i3, i, this.f16384f);
            }
            if (rect2.width() > 0) {
                canvas.drawRect(rect2.left, iCenterY, rect2.right, i, this.f16383e);
            }
            if (this.f16376K != 0) {
                long[] jArr = this.f16377L;
                jArr.getClass();
                boolean[] zArr = this.f16378M;
                zArr.getClass();
                int i5 = this.f16393o;
                int i6 = i5 / 2;
                int i7 = 0;
                int i8 = 0;
                while (i8 < this.f16376K) {
                    canvas.drawRect(Math.min(rect.width() - i5, Math.max(i7, ((int) ((rect.width() * AbstractC7485Dh1.m1826k(jArr[i8], 0L, this.f16373H)) / this.f16373H)) - i6)) + rect.left, iCenterY, r1 + i5, i, zArr[i8] ? this.f16387i : this.f16386h);
                    i8++;
                    i7 = i7;
                    i5 = i5;
                }
            }
        }
        if (this.f16373H > 0) {
            int iM1825j = AbstractC7485Dh1.m1825j(rect2.right, rect2.left, rect.right);
            int iCenterY2 = rect2.centerY();
            Drawable drawable = this.f16389k;
            if (drawable == null) {
                canvas.drawCircle(iM1825j, iCenterY2, (int) ((((this.f16371F || isFocused()) ? this.f16396r : isEnabled() ? this.f16394p : this.f16395q) * this.f16370E) / 2.0f), this.f16388j);
            } else {
                int intrinsicWidth = ((int) (drawable.getIntrinsicWidth() * this.f16370E)) / 2;
                int intrinsicHeight = ((int) (drawable.getIntrinsicHeight() * this.f16370E)) / 2;
                drawable.setBounds(iM1825j - intrinsicWidth, iCenterY2 - intrinsicHeight, iM1825j + intrinsicWidth, iCenterY2 + intrinsicHeight);
                drawable.draw(canvas);
            }
        }
        canvas.restore();
    }

    @Override // android.view.View
    public final void onFocusChanged(boolean z, int i, Rect rect) {
        super.onFocusChanged(z, i, rect);
        if (!this.f16371F || z) {
            return;
        }
        m10139d(false);
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        if (accessibilityEvent.getEventType() == 4) {
            accessibilityEvent.getText().add(getProgressText());
        }
        accessibilityEvent.setClassName("android.widget.SeekBar");
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName("android.widget.SeekBar");
        accessibilityNodeInfo.setContentDescription(getProgressText());
        if (this.f16373H <= 0) {
            return;
        }
        if (AbstractC7485Dh1.f2166a >= 21) {
            accessibilityNodeInfo.addAction(AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_FORWARD);
            accessibilityNodeInfo.addAction(AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_BACKWARD);
        } else {
            accessibilityNodeInfo.addAction(4096);
            accessibilityNodeInfo.addAction(8192);
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:30:0x001a  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0025  */
    @Override // android.view.View, android.view.KeyEvent.Callback
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean onKeyDown(int r5, android.view.KeyEvent r6) {
        /*
            r4 = this;
            boolean r0 = r4.isEnabled()
            if (r0 == 0) goto L2e
            long r0 = r4.getPositionIncrement()
            r2 = 66
            r3 = 1
            if (r5 == r2) goto L25
            switch(r5) {
                case 21: goto L13;
                case 22: goto L14;
                case 23: goto L25;
                default: goto L12;
            }
        L12:
            goto L2e
        L13:
            long r0 = -r0
        L14:
            boolean r0 = r4.m10137b(r0)
            if (r0 == 0) goto L2e
            DE r5 = r4.f16401w
            r4.removeCallbacks(r5)
            r0 = 1000(0x3e8, double:4.94E-321)
            r4.postDelayed(r5, r0)
            return r3
        L25:
            boolean r0 = r4.f16371F
            if (r0 == 0) goto L2e
            r5 = 0
            r4.m10139d(r5)
            return r3
        L2e:
            boolean r5 = super.onKeyDown(r5, r6)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.media3.p002ui.DefaultTimeBar.onKeyDown(int, android.view.KeyEvent):boolean");
    }

    @Override // android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int paddingBottom;
        int paddingBottom2;
        Rect rect;
        int i5 = i3 - i;
        int i6 = i4 - i2;
        int paddingLeft = getPaddingLeft();
        int paddingRight = i5 - getPaddingRight();
        int i7 = this.f16392n;
        int i8 = this.f16390l;
        int i9 = this.f16391m;
        int i10 = this.f16397s;
        if (i7 == 1) {
            paddingBottom = (i6 - getPaddingBottom()) - i9;
            paddingBottom2 = ((i6 - getPaddingBottom()) - i8) - Math.max(i10 - (i8 / 2), 0);
        } else {
            paddingBottom = (i6 - i9) / 2;
            paddingBottom2 = (i6 - i8) / 2;
        }
        Rect rect2 = this.f16379a;
        rect2.set(paddingLeft, paddingBottom, paddingRight, i9 + paddingBottom);
        this.f16380b.set(rect2.left + i10, paddingBottom2, rect2.right - i10, i8 + paddingBottom2);
        if (AbstractC7485Dh1.f2166a >= 29 && ((rect = this.f16369D) == null || rect.width() != i5 || this.f16369D.height() != i6)) {
            Rect rect3 = new Rect(0, 0, i5, i6);
            this.f16369D = rect3;
            setSystemGestureExclusionRects(Collections.singletonList(rect3));
        }
        m10140e();
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        int mode = View.MeasureSpec.getMode(i2);
        int size = View.MeasureSpec.getSize(i2);
        int i3 = this.f16391m;
        if (mode == 0) {
            size = i3;
        } else if (mode != 1073741824) {
            size = Math.min(i3, size);
        }
        setMeasuredDimension(View.MeasureSpec.getSize(i), size);
        Drawable drawable = this.f16389k;
        if (drawable != null && drawable.isStateful() && drawable.setState(getDrawableState())) {
            invalidate();
        }
    }

    @Override // android.view.View
    public final void onRtlPropertiesChanged(int i) {
        Drawable drawable = this.f16389k;
        if (drawable == null || AbstractC7485Dh1.f2166a < 23 || !drawable.setLayoutDirection(i)) {
            return;
        }
        invalidate();
    }

    /* JADX WARN: Removed duplicated region for block: B:58:0x006e  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean onTouchEvent(android.view.MotionEvent r10) {
        /*
            r9 = this;
            boolean r0 = r9.isEnabled()
            r1 = 0
            if (r0 == 0) goto La1
            long r2 = r9.f16373H
            r4 = 0
            int r0 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r0 > 0) goto L11
            goto La1
        L11:
            android.graphics.Point r0 = r9.f16403y
            float r2 = r10.getX()
            int r2 = (int) r2
            float r3 = r10.getY()
            int r3 = (int) r3
            r0.set(r2, r3)
            int r2 = r0.x
            int r0 = r0.y
            int r3 = r10.getAction()
            android.graphics.Rect r4 = r9.f16382d
            android.graphics.Rect r5 = r9.f16380b
            r6 = 1
            if (r3 == 0) goto L7d
            r7 = 3
            if (r3 == r6) goto L6e
            r8 = 2
            if (r3 == r8) goto L38
            if (r3 == r7) goto L6e
            goto La1
        L38:
            boolean r10 = r9.f16371F
            if (r10 == 0) goto La1
            int r10 = r9.f16398t
            if (r0 >= r10) goto L52
            int r10 = r9.f16368C
            int r2 = r2 - r10
            int r2 = r2 / r7
            int r2 = r2 + r10
            float r10 = (float) r2
            int r10 = (int) r10
            int r0 = r5.left
            int r1 = r5.right
            int r10 = p000.AbstractC7485Dh1.m1825j(r10, r0, r1)
            r4.right = r10
            goto L60
        L52:
            r9.f16368C = r2
            float r10 = (float) r2
            int r10 = (int) r10
            int r0 = r5.left
            int r1 = r5.right
            int r10 = p000.AbstractC7485Dh1.m1825j(r10, r0, r1)
            r4.right = r10
        L60:
            long r0 = r9.getScrubberPosition()
            r9.m10141f(r0)
            r9.m10140e()
            r9.invalidate()
            return r6
        L6e:
            boolean r0 = r9.f16371F
            if (r0 == 0) goto La1
            int r10 = r10.getAction()
            if (r10 != r7) goto L79
            r1 = r6
        L79:
            r9.m10139d(r1)
            return r6
        L7d:
            float r10 = (float) r2
            float r0 = (float) r0
            int r10 = (int) r10
            int r0 = (int) r0
            android.graphics.Rect r2 = r9.f16379a
            boolean r0 = r2.contains(r10, r0)
            if (r0 == 0) goto La1
            int r0 = r5.left
            int r1 = r5.right
            int r10 = p000.AbstractC7485Dh1.m1825j(r10, r0, r1)
            r4.right = r10
            long r0 = r9.getScrubberPosition()
            r9.m10138c(r0)
            r9.m10140e()
            r9.invalidate()
            return r6
        La1:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.media3.p002ui.DefaultTimeBar.onTouchEvent(android.view.MotionEvent):boolean");
    }

    @Override // android.view.View
    public final boolean performAccessibilityAction(int i, Bundle bundle) {
        if (super.performAccessibilityAction(i, bundle)) {
            return true;
        }
        if (this.f16373H <= 0) {
            return false;
        }
        if (i == 8192) {
            if (m10137b(-getPositionIncrement())) {
                m10139d(false);
            }
        } else {
            if (i != 4096) {
                return false;
            }
            if (m10137b(getPositionIncrement())) {
                m10139d(false);
            }
        }
        sendAccessibilityEvent(4);
        return true;
    }

    public void setAdMarkerColor(int i) {
        this.f16386h.setColor(i);
        invalidate(this.f16379a);
    }

    public void setBufferedColor(int i) {
        this.f16384f.setColor(i);
        invalidate(this.f16379a);
    }

    @Override // p000.InterfaceC10028ka1
    public void setBufferedPosition(long j) {
        if (this.f16375J == j) {
            return;
        }
        this.f16375J = j;
        m10140e();
    }

    @Override // p000.InterfaceC10028ka1
    public void setDuration(long j) {
        if (this.f16373H == j) {
            return;
        }
        this.f16373H = j;
        if (this.f16371F && j == -9223372036854775807L) {
            m10139d(true);
        }
        m10140e();
    }

    @Override // android.view.View, p000.InterfaceC10028ka1
    public void setEnabled(boolean z) {
        super.setEnabled(z);
        if (!this.f16371F || z) {
            return;
        }
        m10139d(true);
    }

    public void setKeyCountIncrement(int i) {
        YN1.m9278c(i > 0);
        this.f16366A = i;
        this.f16367B = -9223372036854775807L;
    }

    public void setKeyTimeIncrement(long j) {
        YN1.m9278c(j > 0);
        this.f16366A = -1;
        this.f16367B = j;
    }

    public void setPlayedAdMarkerColor(int i) {
        this.f16387i.setColor(i);
        invalidate(this.f16379a);
    }

    public void setPlayedColor(int i) {
        this.f16383e.setColor(i);
        invalidate(this.f16379a);
    }

    @Override // p000.InterfaceC10028ka1
    public void setPosition(long j) {
        if (this.f16374I == j) {
            return;
        }
        this.f16374I = j;
        setContentDescription(getProgressText());
        m10140e();
    }

    public void setScrubberColor(int i) {
        this.f16388j.setColor(i);
        invalidate(this.f16379a);
    }

    public void setUnplayedColor(int i) {
        this.f16385g.setColor(i);
        invalidate(this.f16379a);
    }

    public DefaultTimeBar(Context context, AttributeSet attributeSet, AttributeSet attributeSet2) {
        Paint paint;
        super(context, attributeSet, 0);
        this.f16379a = new Rect();
        this.f16380b = new Rect();
        this.f16381c = new Rect();
        this.f16382d = new Rect();
        Paint paint2 = new Paint();
        this.f16383e = paint2;
        Paint paint3 = new Paint();
        this.f16384f = paint3;
        Paint paint4 = new Paint();
        this.f16385g = paint4;
        Paint paint5 = new Paint();
        this.f16386h = paint5;
        Paint paint6 = new Paint();
        this.f16387i = paint6;
        Paint paint7 = new Paint();
        this.f16388j = paint7;
        paint7.setAntiAlias(true);
        this.f16402x = new CopyOnWriteArraySet();
        this.f16403y = new Point();
        float f = context.getResources().getDisplayMetrics().density;
        this.f16404z = f;
        this.f16398t = m10136a(f, -50);
        int iM10136a = m10136a(f, 4);
        int iM10136a2 = m10136a(f, 26);
        int iM10136a3 = m10136a(f, 4);
        int iM10136a4 = m10136a(f, 12);
        int iM10136a5 = m10136a(f, 0);
        int iM10136a6 = m10136a(f, 16);
        if (attributeSet2 != null) {
            TypedArray typedArrayObtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet2, YG0.f14220b, 0, 0);
            try {
                Drawable drawable = typedArrayObtainStyledAttributes.getDrawable(10);
                this.f16389k = drawable;
                if (drawable != null) {
                    int i = AbstractC7485Dh1.f2166a;
                    if (i >= 23) {
                        paint = paint5;
                        int layoutDirection = getLayoutDirection();
                        if (i < 23 || drawable.setLayoutDirection(layoutDirection)) {
                        }
                    } else {
                        paint = paint5;
                    }
                    iM10136a2 = Math.max(drawable.getMinimumHeight(), iM10136a2);
                } else {
                    paint = paint5;
                }
                this.f16390l = typedArrayObtainStyledAttributes.getDimensionPixelSize(3, iM10136a);
                this.f16391m = typedArrayObtainStyledAttributes.getDimensionPixelSize(12, iM10136a2);
                this.f16392n = typedArrayObtainStyledAttributes.getInt(2, 0);
                this.f16393o = typedArrayObtainStyledAttributes.getDimensionPixelSize(1, iM10136a3);
                this.f16394p = typedArrayObtainStyledAttributes.getDimensionPixelSize(11, iM10136a4);
                this.f16395q = typedArrayObtainStyledAttributes.getDimensionPixelSize(8, iM10136a5);
                this.f16396r = typedArrayObtainStyledAttributes.getDimensionPixelSize(9, iM10136a6);
                int i2 = typedArrayObtainStyledAttributes.getInt(6, -1);
                int i3 = typedArrayObtainStyledAttributes.getInt(7, -1);
                int i4 = typedArrayObtainStyledAttributes.getInt(4, -855638017);
                int i5 = typedArrayObtainStyledAttributes.getInt(13, 872415231);
                int i6 = typedArrayObtainStyledAttributes.getInt(0, -1291845888);
                int i7 = typedArrayObtainStyledAttributes.getInt(5, 872414976);
                paint2.setColor(i2);
                paint7.setColor(i3);
                paint3.setColor(i4);
                paint4.setColor(i5);
                paint.setColor(i6);
                paint6.setColor(i7);
                typedArrayObtainStyledAttributes.recycle();
            } catch (Throwable th) {
                typedArrayObtainStyledAttributes.recycle();
                throw th;
            }
        } else {
            this.f16390l = iM10136a;
            this.f16391m = iM10136a2;
            this.f16392n = 0;
            this.f16393o = iM10136a3;
            this.f16394p = iM10136a4;
            this.f16395q = iM10136a5;
            this.f16396r = iM10136a6;
            paint2.setColor(-1);
            paint7.setColor(-1);
            paint3.setColor(-855638017);
            paint4.setColor(872415231);
            paint5.setColor(-1291845888);
            paint6.setColor(872414976);
            this.f16389k = null;
        }
        StringBuilder sb = new StringBuilder();
        this.f16399u = sb;
        this.f16400v = new Formatter(sb, Locale.getDefault());
        this.f16401w = new RunnableC0204DE(5, this);
        Drawable drawable2 = this.f16389k;
        if (drawable2 != null) {
            this.f16397s = (drawable2.getMinimumWidth() + 1) / 2;
        } else {
            this.f16397s = (Math.max(this.f16395q, Math.max(this.f16394p, this.f16396r)) + 1) / 2;
        }
        this.f16370E = 1.0f;
        new ValueAnimator().addUpdateListener(new C0772MG(0, this));
        this.f16373H = -9223372036854775807L;
        this.f16367B = -9223372036854775807L;
        this.f16366A = 20;
        setFocusable(true);
        if (getImportantForAccessibility() == 0) {
            setImportantForAccessibility(1);
        }
    }
}
