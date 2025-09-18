package com.google.android.material.timepicker;

import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.util.Pair;
import android.util.TypedValue;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.accessibility.AccessibilityManager;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.WeakHashMap;
import p000.AbstractC0691Ky;
import p000.AbstractC10490oB1;
import p000.AbstractC10944rk1;
import p000.AbstractC6467n5;
import p000.C10156la1;
import p000.C6708qt;
import p000.InterfaceC6771rt;
import p000.NG0;
import ru.mes.dnevnik.R;

/* loaded from: classes.dex */
class ClockHandView extends View {

    /* renamed from: v */
    public static final /* synthetic */ int f18360v = 0;

    /* renamed from: a */
    public final int f18361a;

    /* renamed from: b */
    public final TimeInterpolator f18362b;

    /* renamed from: c */
    public final ValueAnimator f18363c;

    /* renamed from: d */
    public boolean f18364d;

    /* renamed from: e */
    public float f18365e;

    /* renamed from: f */
    public float f18366f;

    /* renamed from: g */
    public boolean f18367g;

    /* renamed from: h */
    public final int f18368h;

    /* renamed from: i */
    public boolean f18369i;

    /* renamed from: j */
    public final ArrayList f18370j;

    /* renamed from: k */
    public final int f18371k;

    /* renamed from: l */
    public final float f18372l;

    /* renamed from: m */
    public final Paint f18373m;

    /* renamed from: n */
    public final RectF f18374n;

    /* renamed from: o */
    public final int f18375o;

    /* renamed from: p */
    public float f18376p;

    /* renamed from: q */
    public boolean f18377q;

    /* renamed from: r */
    public C1950f f18378r;

    /* renamed from: s */
    public double f18379s;

    /* renamed from: t */
    public int f18380t;

    /* renamed from: u */
    public int f18381u;

    public ClockHandView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.materialClockStyle);
        this.f18363c = new ValueAnimator();
        this.f18370j = new ArrayList();
        Paint paint = new Paint();
        this.f18373m = paint;
        this.f18374n = new RectF();
        this.f18381u = 1;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, NG0.f7693g, R.attr.materialClockStyle, R.style.Widget_MaterialComponents_TimePicker_Clock);
        this.f18361a = AbstractC10490oB1.m23359d(context, R.attr.motionDurationLong2, 200);
        this.f18362b = AbstractC10490oB1.m23360e(context, R.attr.motionEasingEmphasizedInterpolator, AbstractC6467n5.f38091b);
        this.f18380t = typedArrayObtainStyledAttributes.getDimensionPixelSize(1, 0);
        this.f18371k = typedArrayObtainStyledAttributes.getDimensionPixelSize(2, 0);
        this.f18375o = getResources().getDimensionPixelSize(R.dimen.material_clock_hand_stroke_width);
        this.f18372l = r4.getDimensionPixelSize(R.dimen.material_clock_hand_center_dot_radius);
        int color = typedArrayObtainStyledAttributes.getColor(0, 0);
        paint.setAntiAlias(true);
        paint.setColor(color);
        m11282c(0.0f, false);
        this.f18368h = ViewConfiguration.get(context).getScaledTouchSlop();
        WeakHashMap weakHashMap = AbstractC10944rk1.f41842a;
        setImportantForAccessibility(2);
        typedArrayObtainStyledAttributes.recycle();
    }

    /* renamed from: a */
    public final int m11280a(float f, float f2) {
        int degrees = (int) Math.toDegrees(Math.atan2(f2 - (getHeight() / 2), f - (getWidth() / 2)));
        int i = degrees + 90;
        return i < 0 ? degrees + 450 : i;
    }

    /* renamed from: b */
    public final int m11281b(int i) {
        return i == 2 ? Math.round(this.f18380t * 0.66f) : this.f18380t;
    }

    /* renamed from: c */
    public final void m11282c(float f, boolean z) {
        ValueAnimator valueAnimator = this.f18363c;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        if (!z) {
            m11283d(f, false);
            return;
        }
        float f2 = this.f18376p;
        if (Math.abs(f2 - f) > 180.0f) {
            if (f2 > 180.0f && f < 180.0f) {
                f += 360.0f;
            }
            if (f2 < 180.0f && f > 180.0f) {
                f2 += 360.0f;
            }
        }
        Pair pair = new Pair(Float.valueOf(f2), Float.valueOf(f));
        valueAnimator.setFloatValues(((Float) pair.first).floatValue(), ((Float) pair.second).floatValue());
        valueAnimator.setDuration(this.f18361a);
        valueAnimator.setInterpolator(this.f18362b);
        valueAnimator.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.google.android.material.timepicker.d
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator2) {
                int i = ClockHandView.f18360v;
                ClockHandView clockHandView = this.f18394a;
                clockHandView.getClass();
                clockHandView.m11283d(((Float) valueAnimator2.getAnimatedValue()).floatValue(), true);
            }
        });
        valueAnimator.addListener(new C6708qt());
        valueAnimator.start();
    }

    /* renamed from: d */
    public final void m11283d(float f, boolean z) {
        float f2 = f % 360.0f;
        this.f18376p = f2;
        this.f18379s = Math.toRadians(f2 - 90.0f);
        int height = getHeight() / 2;
        int width = getWidth() / 2;
        float fM11281b = m11281b(this.f18381u);
        float fCos = (((float) Math.cos(this.f18379s)) * fM11281b) + width;
        float fSin = (fM11281b * ((float) Math.sin(this.f18379s))) + height;
        float f3 = this.f18371k;
        this.f18374n.set(fCos - f3, fSin - f3, fCos + f3, fSin + f3);
        Iterator it = this.f18370j.iterator();
        while (it.hasNext()) {
            ((InterfaceC6771rt) it.next()).mo11277a(f2, z);
        }
        invalidate();
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        int height = getHeight() / 2;
        int width = getWidth() / 2;
        float f = width;
        float fM11281b = m11281b(this.f18381u);
        float fCos = (((float) Math.cos(this.f18379s)) * fM11281b) + f;
        float f2 = height;
        float fSin = (fM11281b * ((float) Math.sin(this.f18379s))) + f2;
        Paint paint = this.f18373m;
        paint.setStrokeWidth(0.0f);
        canvas.drawCircle(fCos, fSin, this.f18371k, paint);
        double dSin = Math.sin(this.f18379s);
        paint.setStrokeWidth(this.f18375o);
        canvas.drawLine(f, f2, width + ((int) (Math.cos(this.f18379s) * d)), height + ((int) (d * dSin)), paint);
        canvas.drawCircle(f, f2, this.f18372l, paint);
    }

    @Override // android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        if (this.f18363c.isRunning()) {
            return;
        }
        m11282c(this.f18376p, false);
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        C1950f c1950f;
        int actionMasked = motionEvent.getActionMasked();
        float x = motionEvent.getX();
        float y = motionEvent.getY();
        if (actionMasked != 0) {
            if (actionMasked == 1 || actionMasked == 2) {
                int i = (int) (x - this.f18365e);
                int i2 = (int) (y - this.f18366f);
                this.f18367g = (i2 * i2) + (i * i) > this.f18368h;
                z3 = this.f18377q;
                z2 = actionMasked == 1;
                if (this.f18369i) {
                    this.f18381u = ((float) Math.hypot((double) (x - ((float) (getWidth() / 2))), (double) (y - ((float) (getHeight() / 2))))) > ((float) m11281b(2)) + TypedValue.applyDimension(1, (float) 12, getContext().getResources().getDisplayMetrics()) ? 1 : 2;
                }
                z = false;
            } else {
                z2 = false;
                z = false;
                z3 = false;
            }
        } else {
            this.f18365e = x;
            this.f18366f = y;
            this.f18367g = true;
            this.f18377q = false;
            z = true;
            z2 = false;
            z3 = false;
        }
        boolean z5 = this.f18377q;
        float fM11280a = m11280a(x, y);
        boolean z6 = this.f18376p != fM11280a;
        if (z && z6) {
            z4 = true;
        } else if (z6 || z3) {
            m11282c(fM11280a, z2 && this.f18364d);
            z4 = true;
        } else {
            z4 = false;
        }
        boolean z7 = z4 | z5;
        this.f18377q = z7;
        if (z7 && z2 && (c1950f = this.f18378r) != null) {
            float fM11280a2 = m11280a(x, y);
            boolean z8 = this.f18367g;
            c1950f.f18424e = true;
            C10156la1 c10156la1 = c1950f.f18421b;
            int i3 = c10156la1.f37172e;
            int i4 = c10156la1.f37171d;
            int i5 = c10156la1.f37173f;
            TimePickerView timePickerView = c1950f.f18420a;
            if (i5 == 10) {
                timePickerView.f18385r.m11282c(c1950f.f18423d, false);
                AccessibilityManager accessibilityManager = (AccessibilityManager) AbstractC0691Ky.m4784b(timePickerView.getContext(), AccessibilityManager.class);
                if (accessibilityManager == null || !accessibilityManager.isTouchExplorationEnabled()) {
                    c1950f.m11287d(12, true);
                }
            } else {
                int iRound = Math.round(fM11280a2);
                if (!z8) {
                    c10156la1.m22513d(((iRound + 15) / 30) * 5);
                    c1950f.f18422c = c10156la1.f37172e * 6;
                }
                timePickerView.f18385r.m11282c(c1950f.f18422c, z8);
            }
            c1950f.f18424e = false;
            c1950f.m11288e();
            if (c10156la1.f37172e != i3 || c10156la1.f37171d != i4) {
                timePickerView.performHapticFeedback(4);
            }
        }
        return true;
    }
}
