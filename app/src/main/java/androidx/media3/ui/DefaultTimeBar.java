package androidx.media3.ui;

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
import defpackage.AbstractC0178Ca1;
import defpackage.AbstractC0277Dh1;
import defpackage.C6509pi0;
import defpackage.DE;
import defpackage.IB0;
import defpackage.InterfaceC5531ka1;
import defpackage.MG;
import defpackage.ViewOnClickListenerC6127ni0;
import defpackage.XQ;
import defpackage.YG0;
import defpackage.YN1;
import java.util.Collections;
import java.util.Formatter;
import java.util.Iterator;
import java.util.Locale;
import java.util.concurrent.CopyOnWriteArraySet;

/* loaded from: classes.dex */
public class DefaultTimeBar extends View implements InterfaceC5531ka1 {
    public static final /* synthetic */ int N = 0;
    public int A;
    public long B;
    public int C;
    public Rect D;
    public float E;
    public boolean F;
    public long G;
    public long H;
    public long I;
    public long J;
    public int K;
    public long[] L;
    public boolean[] M;
    public final Rect a;
    public final Rect b;
    public final Rect c;
    public final Rect d;
    public final Paint e;
    public final Paint f;
    public final Paint g;
    public final Paint h;
    public final Paint i;
    public final Paint j;
    public final Drawable k;
    public final int l;
    public final int m;
    public final int n;
    public final int o;
    public final int p;
    public final int q;
    public final int r;
    public final int s;
    public final int t;
    public final StringBuilder u;
    public final Formatter v;
    public final DE w;
    public final CopyOnWriteArraySet x;
    public final Point y;
    public final float z;

    public DefaultTimeBar(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, attributeSet);
    }

    public static int a(float f, int i) {
        return (int) ((i * f) + 0.5f);
    }

    private long getPositionIncrement() {
        long j = this.B;
        if (j != -9223372036854775807L) {
            return j;
        }
        long j2 = this.H;
        if (j2 == -9223372036854775807L) {
            return 0L;
        }
        return j2 / this.A;
    }

    private String getProgressText() {
        return AbstractC0277Dh1.D(this.u, this.v, this.I);
    }

    private long getScrubberPosition() {
        if (this.b.width() <= 0 || this.H == -9223372036854775807L) {
            return 0L;
        }
        return (this.d.width() * this.H) / r0.width();
    }

    public final boolean b(long j) {
        long j2 = this.H;
        if (j2 <= 0) {
            return false;
        }
        long j3 = this.F ? this.G : this.I;
        long jK = AbstractC0277Dh1.k(j3 + j, 0L, j2);
        if (jK == j3) {
            return false;
        }
        if (this.F) {
            f(jK);
        } else {
            c(jK);
        }
        e();
        return true;
    }

    public final void c(long j) {
        this.G = j;
        this.F = true;
        setPressed(true);
        ViewParent parent = getParent();
        if (parent != null) {
            parent.requestDisallowInterceptTouchEvent(true);
        }
        Iterator it = this.x.iterator();
        while (it.hasNext()) {
            C6509pi0 c6509pi0 = ((ViewOnClickListenerC6127ni0) it.next()).a;
            c6509pi0.L = true;
            TextView textView = c6509pi0.m;
            if (textView != null) {
                textView.setText(AbstractC0277Dh1.D(c6509pi0.o, c6509pi0.p, j));
            }
        }
    }

    public final void d(boolean z) {
        IB0 ib0;
        int iD1;
        removeCallbacks(this.w);
        this.F = false;
        setPressed(false);
        ViewParent parent = getParent();
        if (parent != null) {
            parent.requestDisallowInterceptTouchEvent(false);
        }
        invalidate();
        Iterator it = this.x.iterator();
        while (it.hasNext()) {
            ViewOnClickListenerC6127ni0 viewOnClickListenerC6127ni0 = (ViewOnClickListenerC6127ni0) it.next();
            long j = this.G;
            C6509pi0 c6509pi0 = viewOnClickListenerC6127ni0.a;
            c6509pi0.L = false;
            if (!z && (ib0 = c6509pi0.G) != null) {
                XQ xq = (XQ) ib0;
                AbstractC0178Ca1 abstractC0178Ca1G1 = xq.G1();
                if (c6509pi0.K && !abstractC0178Ca1G1.p()) {
                    int iO = abstractC0178Ca1G1.o();
                    iD1 = 0;
                    while (true) {
                        long jD0 = AbstractC0277Dh1.d0(abstractC0178Ca1G1.m(iD1, c6509pi0.r, 0L).m);
                        if (j < jD0) {
                            break;
                        }
                        if (iD1 == iO - 1) {
                            j = jD0;
                            break;
                        } else {
                            j -= jD0;
                            iD1++;
                        }
                    }
                } else {
                    iD1 = xq.D1();
                }
                xq.o1(iD1, j, false);
                c6509pi0.i();
            }
        }
    }

    @Override // android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        Drawable drawable = this.k;
        if (drawable != null && drawable.isStateful() && drawable.setState(getDrawableState())) {
            invalidate();
        }
    }

    public final void e() {
        Rect rect = this.c;
        Rect rect2 = this.b;
        rect.set(rect2);
        Rect rect3 = this.d;
        rect3.set(rect2);
        long j = this.F ? this.G : this.I;
        if (this.H > 0) {
            rect.right = Math.min(rect2.left + ((int) ((rect2.width() * this.J) / this.H)), rect2.right);
            rect3.right = Math.min(rect2.left + ((int) ((rect2.width() * j) / this.H)), rect2.right);
        } else {
            int i = rect2.left;
            rect.right = i;
            rect3.right = i;
        }
        invalidate(this.a);
    }

    public final void f(long j) {
        if (this.G == j) {
            return;
        }
        this.G = j;
        Iterator it = this.x.iterator();
        while (it.hasNext()) {
            C6509pi0 c6509pi0 = ((ViewOnClickListenerC6127ni0) it.next()).a;
            TextView textView = c6509pi0.m;
            if (textView != null) {
                textView.setText(AbstractC0277Dh1.D(c6509pi0.o, c6509pi0.p, j));
            }
        }
    }

    @Override // defpackage.InterfaceC5531ka1
    public long getPreferredUpdateDelay() {
        int iWidth = (int) (this.b.width() / this.z);
        if (iWidth != 0) {
            long j = this.H;
            if (j != 0 && j != -9223372036854775807L) {
                return j / iWidth;
            }
        }
        return Long.MAX_VALUE;
    }

    @Override // android.view.View
    public final void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        Drawable drawable = this.k;
        if (drawable != null) {
            drawable.jumpToCurrentState();
        }
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        canvas.save();
        Rect rect = this.b;
        int iHeight = rect.height();
        int iCenterY = rect.centerY() - (iHeight / 2);
        int i = iCenterY + iHeight;
        long j = this.H;
        Paint paint = this.g;
        Rect rect2 = this.d;
        if (j <= 0) {
            canvas.drawRect(rect.left, iCenterY, rect.right, i, paint);
        } else {
            Rect rect3 = this.c;
            int i2 = rect3.left;
            int i3 = rect3.right;
            int iMax = Math.max(Math.max(rect.left, i3), rect2.right);
            int i4 = rect.right;
            if (iMax < i4) {
                canvas.drawRect(iMax, iCenterY, i4, i, paint);
            }
            int iMax2 = Math.max(i2, rect2.right);
            if (i3 > iMax2) {
                canvas.drawRect(iMax2, iCenterY, i3, i, this.f);
            }
            if (rect2.width() > 0) {
                canvas.drawRect(rect2.left, iCenterY, rect2.right, i, this.e);
            }
            if (this.K != 0) {
                long[] jArr = this.L;
                jArr.getClass();
                boolean[] zArr = this.M;
                zArr.getClass();
                int i5 = this.o;
                int i6 = i5 / 2;
                int i7 = 0;
                int i8 = 0;
                while (i8 < this.K) {
                    canvas.drawRect(Math.min(rect.width() - i5, Math.max(i7, ((int) ((rect.width() * AbstractC0277Dh1.k(jArr[i8], 0L, this.H)) / this.H)) - i6)) + rect.left, iCenterY, r1 + i5, i, zArr[i8] ? this.i : this.h);
                    i8++;
                    i7 = i7;
                    i5 = i5;
                }
            }
        }
        if (this.H > 0) {
            int iJ = AbstractC0277Dh1.j(rect2.right, rect2.left, rect.right);
            int iCenterY2 = rect2.centerY();
            Drawable drawable = this.k;
            if (drawable == null) {
                canvas.drawCircle(iJ, iCenterY2, (int) ((((this.F || isFocused()) ? this.r : isEnabled() ? this.p : this.q) * this.E) / 2.0f), this.j);
            } else {
                int intrinsicWidth = ((int) (drawable.getIntrinsicWidth() * this.E)) / 2;
                int intrinsicHeight = ((int) (drawable.getIntrinsicHeight() * this.E)) / 2;
                drawable.setBounds(iJ - intrinsicWidth, iCenterY2 - intrinsicHeight, iJ + intrinsicWidth, iCenterY2 + intrinsicHeight);
                drawable.draw(canvas);
            }
        }
        canvas.restore();
    }

    @Override // android.view.View
    public final void onFocusChanged(boolean z, int i, Rect rect) {
        super.onFocusChanged(z, i, rect);
        if (!this.F || z) {
            return;
        }
        d(false);
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
        if (this.H <= 0) {
            return;
        }
        if (AbstractC0277Dh1.a >= 21) {
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
            boolean r0 = r4.b(r0)
            if (r0 == 0) goto L2e
            DE r5 = r4.w
            r4.removeCallbacks(r5)
            r0 = 1000(0x3e8, double:4.94E-321)
            r4.postDelayed(r5, r0)
            return r3
        L25:
            boolean r0 = r4.F
            if (r0 == 0) goto L2e
            r5 = 0
            r4.d(r5)
            return r3
        L2e:
            boolean r5 = super.onKeyDown(r5, r6)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.media3.ui.DefaultTimeBar.onKeyDown(int, android.view.KeyEvent):boolean");
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
        int i7 = this.n;
        int i8 = this.l;
        int i9 = this.m;
        int i10 = this.s;
        if (i7 == 1) {
            paddingBottom = (i6 - getPaddingBottom()) - i9;
            paddingBottom2 = ((i6 - getPaddingBottom()) - i8) - Math.max(i10 - (i8 / 2), 0);
        } else {
            paddingBottom = (i6 - i9) / 2;
            paddingBottom2 = (i6 - i8) / 2;
        }
        Rect rect2 = this.a;
        rect2.set(paddingLeft, paddingBottom, paddingRight, i9 + paddingBottom);
        this.b.set(rect2.left + i10, paddingBottom2, rect2.right - i10, i8 + paddingBottom2);
        if (AbstractC0277Dh1.a >= 29 && ((rect = this.D) == null || rect.width() != i5 || this.D.height() != i6)) {
            Rect rect3 = new Rect(0, 0, i5, i6);
            this.D = rect3;
            setSystemGestureExclusionRects(Collections.singletonList(rect3));
        }
        e();
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        int mode = View.MeasureSpec.getMode(i2);
        int size = View.MeasureSpec.getSize(i2);
        int i3 = this.m;
        if (mode == 0) {
            size = i3;
        } else if (mode != 1073741824) {
            size = Math.min(i3, size);
        }
        setMeasuredDimension(View.MeasureSpec.getSize(i), size);
        Drawable drawable = this.k;
        if (drawable != null && drawable.isStateful() && drawable.setState(getDrawableState())) {
            invalidate();
        }
    }

    @Override // android.view.View
    public final void onRtlPropertiesChanged(int i) {
        Drawable drawable = this.k;
        if (drawable == null || AbstractC0277Dh1.a < 23 || !drawable.setLayoutDirection(i)) {
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
            long r2 = r9.H
            r4 = 0
            int r0 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r0 > 0) goto L11
            goto La1
        L11:
            android.graphics.Point r0 = r9.y
            float r2 = r10.getX()
            int r2 = (int) r2
            float r3 = r10.getY()
            int r3 = (int) r3
            r0.set(r2, r3)
            int r2 = r0.x
            int r0 = r0.y
            int r3 = r10.getAction()
            android.graphics.Rect r4 = r9.d
            android.graphics.Rect r5 = r9.b
            r6 = 1
            if (r3 == 0) goto L7d
            r7 = 3
            if (r3 == r6) goto L6e
            r8 = 2
            if (r3 == r8) goto L38
            if (r3 == r7) goto L6e
            goto La1
        L38:
            boolean r10 = r9.F
            if (r10 == 0) goto La1
            int r10 = r9.t
            if (r0 >= r10) goto L52
            int r10 = r9.C
            int r2 = r2 - r10
            int r2 = r2 / r7
            int r2 = r2 + r10
            float r10 = (float) r2
            int r10 = (int) r10
            int r0 = r5.left
            int r1 = r5.right
            int r10 = defpackage.AbstractC0277Dh1.j(r10, r0, r1)
            r4.right = r10
            goto L60
        L52:
            r9.C = r2
            float r10 = (float) r2
            int r10 = (int) r10
            int r0 = r5.left
            int r1 = r5.right
            int r10 = defpackage.AbstractC0277Dh1.j(r10, r0, r1)
            r4.right = r10
        L60:
            long r0 = r9.getScrubberPosition()
            r9.f(r0)
            r9.e()
            r9.invalidate()
            return r6
        L6e:
            boolean r0 = r9.F
            if (r0 == 0) goto La1
            int r10 = r10.getAction()
            if (r10 != r7) goto L79
            r1 = r6
        L79:
            r9.d(r1)
            return r6
        L7d:
            float r10 = (float) r2
            float r0 = (float) r0
            int r10 = (int) r10
            int r0 = (int) r0
            android.graphics.Rect r2 = r9.a
            boolean r0 = r2.contains(r10, r0)
            if (r0 == 0) goto La1
            int r0 = r5.left
            int r1 = r5.right
            int r10 = defpackage.AbstractC0277Dh1.j(r10, r0, r1)
            r4.right = r10
            long r0 = r9.getScrubberPosition()
            r9.c(r0)
            r9.e()
            r9.invalidate()
            return r6
        La1:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.media3.ui.DefaultTimeBar.onTouchEvent(android.view.MotionEvent):boolean");
    }

    @Override // android.view.View
    public final boolean performAccessibilityAction(int i, Bundle bundle) {
        if (super.performAccessibilityAction(i, bundle)) {
            return true;
        }
        if (this.H <= 0) {
            return false;
        }
        if (i == 8192) {
            if (b(-getPositionIncrement())) {
                d(false);
            }
        } else {
            if (i != 4096) {
                return false;
            }
            if (b(getPositionIncrement())) {
                d(false);
            }
        }
        sendAccessibilityEvent(4);
        return true;
    }

    public void setAdMarkerColor(int i) {
        this.h.setColor(i);
        invalidate(this.a);
    }

    public void setBufferedColor(int i) {
        this.f.setColor(i);
        invalidate(this.a);
    }

    @Override // defpackage.InterfaceC5531ka1
    public void setBufferedPosition(long j) {
        if (this.J == j) {
            return;
        }
        this.J = j;
        e();
    }

    @Override // defpackage.InterfaceC5531ka1
    public void setDuration(long j) {
        if (this.H == j) {
            return;
        }
        this.H = j;
        if (this.F && j == -9223372036854775807L) {
            d(true);
        }
        e();
    }

    @Override // android.view.View, defpackage.InterfaceC5531ka1
    public void setEnabled(boolean z) {
        super.setEnabled(z);
        if (!this.F || z) {
            return;
        }
        d(true);
    }

    public void setKeyCountIncrement(int i) {
        YN1.c(i > 0);
        this.A = i;
        this.B = -9223372036854775807L;
    }

    public void setKeyTimeIncrement(long j) {
        YN1.c(j > 0);
        this.A = -1;
        this.B = j;
    }

    public void setPlayedAdMarkerColor(int i) {
        this.i.setColor(i);
        invalidate(this.a);
    }

    public void setPlayedColor(int i) {
        this.e.setColor(i);
        invalidate(this.a);
    }

    @Override // defpackage.InterfaceC5531ka1
    public void setPosition(long j) {
        if (this.I == j) {
            return;
        }
        this.I = j;
        setContentDescription(getProgressText());
        e();
    }

    public void setScrubberColor(int i) {
        this.j.setColor(i);
        invalidate(this.a);
    }

    public void setUnplayedColor(int i) {
        this.g.setColor(i);
        invalidate(this.a);
    }

    public DefaultTimeBar(Context context, AttributeSet attributeSet, AttributeSet attributeSet2) {
        Paint paint;
        super(context, attributeSet, 0);
        this.a = new Rect();
        this.b = new Rect();
        this.c = new Rect();
        this.d = new Rect();
        Paint paint2 = new Paint();
        this.e = paint2;
        Paint paint3 = new Paint();
        this.f = paint3;
        Paint paint4 = new Paint();
        this.g = paint4;
        Paint paint5 = new Paint();
        this.h = paint5;
        Paint paint6 = new Paint();
        this.i = paint6;
        Paint paint7 = new Paint();
        this.j = paint7;
        paint7.setAntiAlias(true);
        this.x = new CopyOnWriteArraySet();
        this.y = new Point();
        float f = context.getResources().getDisplayMetrics().density;
        this.z = f;
        this.t = a(f, -50);
        int iA = a(f, 4);
        int iA2 = a(f, 26);
        int iA3 = a(f, 4);
        int iA4 = a(f, 12);
        int iA5 = a(f, 0);
        int iA6 = a(f, 16);
        if (attributeSet2 != null) {
            TypedArray typedArrayObtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet2, YG0.b, 0, 0);
            try {
                Drawable drawable = typedArrayObtainStyledAttributes.getDrawable(10);
                this.k = drawable;
                if (drawable != null) {
                    int i = AbstractC0277Dh1.a;
                    if (i >= 23) {
                        paint = paint5;
                        int layoutDirection = getLayoutDirection();
                        if (i < 23 || drawable.setLayoutDirection(layoutDirection)) {
                        }
                    } else {
                        paint = paint5;
                    }
                    iA2 = Math.max(drawable.getMinimumHeight(), iA2);
                } else {
                    paint = paint5;
                }
                this.l = typedArrayObtainStyledAttributes.getDimensionPixelSize(3, iA);
                this.m = typedArrayObtainStyledAttributes.getDimensionPixelSize(12, iA2);
                this.n = typedArrayObtainStyledAttributes.getInt(2, 0);
                this.o = typedArrayObtainStyledAttributes.getDimensionPixelSize(1, iA3);
                this.p = typedArrayObtainStyledAttributes.getDimensionPixelSize(11, iA4);
                this.q = typedArrayObtainStyledAttributes.getDimensionPixelSize(8, iA5);
                this.r = typedArrayObtainStyledAttributes.getDimensionPixelSize(9, iA6);
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
            this.l = iA;
            this.m = iA2;
            this.n = 0;
            this.o = iA3;
            this.p = iA4;
            this.q = iA5;
            this.r = iA6;
            paint2.setColor(-1);
            paint7.setColor(-1);
            paint3.setColor(-855638017);
            paint4.setColor(872415231);
            paint5.setColor(-1291845888);
            paint6.setColor(872414976);
            this.k = null;
        }
        StringBuilder sb = new StringBuilder();
        this.u = sb;
        this.v = new Formatter(sb, Locale.getDefault());
        this.w = new DE(5, this);
        Drawable drawable2 = this.k;
        if (drawable2 != null) {
            this.s = (drawable2.getMinimumWidth() + 1) / 2;
        } else {
            this.s = (Math.max(this.q, Math.max(this.p, this.r)) + 1) / 2;
        }
        this.E = 1.0f;
        new ValueAnimator().addUpdateListener(new MG(0, this));
        this.H = -9223372036854775807L;
        this.B = -9223372036854775807L;
        this.A = 20;
        setFocusable(true);
        if (getImportantForAccessibility() == 0) {
            setImportantForAccessibility(1);
        }
    }
}
