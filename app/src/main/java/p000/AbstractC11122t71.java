package p000;

import android.R;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.OvalShape;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.animation.DecelerateInterpolator;
import android.widget.ListView;
import com.yandex.varioqub.config.model.ConfigValue;
import java.util.WeakHashMap;
import kotlin.KotlinVersion;

/* renamed from: t71 */
/* loaded from: classes.dex */
public abstract class AbstractC11122t71 extends ViewGroup implements InterfaceC7770Iu0, InterfaceC7718Hu0, InterfaceC7614Fu0 {

    /* renamed from: K */
    public static final int[] f42843K = {R.attr.enabled};

    /* renamed from: A */
    public C10354n71 f42844A;

    /* renamed from: B */
    public C10354n71 f42845B;

    /* renamed from: C */
    public C10482o71 f42846C;

    /* renamed from: D */
    public C10482o71 f42847D;

    /* renamed from: E */
    public boolean f42848E;

    /* renamed from: F */
    public int f42849F;

    /* renamed from: G */
    public boolean f42850G;

    /* renamed from: H */
    public final AnimationAnimationListenerC9012ch0 f42851H;

    /* renamed from: I */
    public final C10610p71 f42852I;

    /* renamed from: J */
    public final C10610p71 f42853J;

    /* renamed from: a */
    public View f42854a;

    /* renamed from: b */
    public InterfaceC10866r71 f42855b;

    /* renamed from: c */
    public boolean f42856c;

    /* renamed from: d */
    public final int f42857d;

    /* renamed from: e */
    public float f42858e;

    /* renamed from: f */
    public float f42859f;

    /* renamed from: g */
    public final C11649xG0 f42860g;

    /* renamed from: h */
    public final C7666Gu0 f42861h;

    /* renamed from: i */
    public final int[] f42862i;

    /* renamed from: j */
    public final int[] f42863j;

    /* renamed from: k */
    public final int[] f42864k;

    /* renamed from: l */
    public boolean f42865l;

    /* renamed from: m */
    public final int f42866m;

    /* renamed from: n */
    public int f42867n;

    /* renamed from: o */
    public float f42868o;

    /* renamed from: p */
    public float f42869p;

    /* renamed from: q */
    public boolean f42870q;

    /* renamed from: r */
    public int f42871r;

    /* renamed from: s */
    public final DecelerateInterpolator f42872s;

    /* renamed from: t */
    public final C4206hs f42873t;

    /* renamed from: u */
    public int f42874u;

    /* renamed from: v */
    public int f42875v;

    /* renamed from: w */
    public int f42876w;

    /* renamed from: x */
    public int f42877x;

    /* renamed from: y */
    public int f42878y;

    /* renamed from: z */
    public final C6581os f42879z;

    public AbstractC11122t71(S91 s91) {
        super(s91, null);
        this.f42856c = false;
        this.f42858e = -1.0f;
        this.f42862i = new int[2];
        this.f42863j = new int[2];
        this.f42864k = new int[2];
        this.f42871r = -1;
        this.f42874u = -1;
        PM0 pm0 = (PM0) this;
        this.f42851H = new AnimationAnimationListenerC9012ch0(2, pm0);
        this.f42852I = new C10610p71(pm0, 0);
        this.f42853J = new C10610p71(pm0, 1);
        this.f42857d = ViewConfiguration.get(s91).getScaledTouchSlop();
        this.f42866m = getResources().getInteger(R.integer.config_mediumAnimTime);
        setWillNotDraw(false);
        this.f42872s = new DecelerateInterpolator(2.0f);
        DisplayMetrics displayMetrics = getResources().getDisplayMetrics();
        this.f42849F = (int) (displayMetrics.density * 40.0f);
        C4206hs c4206hs = new C4206hs(getContext());
        float f = c4206hs.getContext().getResources().getDisplayMetrics().density;
        TypedArray typedArrayObtainStyledAttributes = c4206hs.getContext().obtainStyledAttributes(JG0.f5441a);
        c4206hs.f28642b = typedArrayObtainStyledAttributes.getColor(0, -328966);
        typedArrayObtainStyledAttributes.recycle();
        ShapeDrawable shapeDrawable = new ShapeDrawable(new OvalShape());
        WeakHashMap weakHashMap = AbstractC10944rk1.f41842a;
        AbstractC9536gk1.m18624s(c4206hs, f * 4.0f);
        shapeDrawable.getPaint().setColor(c4206hs.f28642b);
        c4206hs.setBackground(shapeDrawable);
        this.f42873t = c4206hs;
        C6581os c6581os = new C6581os(getContext());
        this.f42879z = c6581os;
        c6581os.m23574c(1);
        this.f42873t.setImageDrawable(this.f42879z);
        this.f42873t.setVisibility(8);
        addView(this.f42873t);
        setChildrenDrawingOrderEnabled(true);
        int i = (int) (displayMetrics.density * 64.0f);
        this.f42877x = i;
        this.f42858e = i;
        this.f42860g = new C11649xG0(6);
        this.f42861h = new C7666Gu0(this);
        setNestedScrollingEnabled(true);
        int i2 = -this.f42849F;
        this.f42867n = i2;
        this.f42876w = i2;
        m24845k(1.0f);
        TypedArray typedArrayObtainStyledAttributes2 = s91.obtainStyledAttributes((AttributeSet) null, f42843K);
        setEnabled(typedArrayObtainStyledAttributes2.getBoolean(0, true));
        typedArrayObtainStyledAttributes2.recycle();
    }

    private void setColorViewAlpha(int i) {
        this.f42873t.getBackground().setAlpha(i);
        this.f42879z.setAlpha(i);
    }

    @Override // p000.InterfaceC7718Hu0
    /* renamed from: a */
    public final void mo3641a(int i, View view) {
        if (i == 0) {
            onStopNestedScroll(view);
        }
    }

    @Override // p000.InterfaceC7770Iu0
    /* renamed from: b */
    public final void mo4065b(View view, int i, int i2, int i3, int i4, int i5, int[] iArr) {
        if (i5 != 0) {
            return;
        }
        int i6 = iArr[1];
        if (i5 == 0) {
            this.f42861h.m3194d(i, i2, i3, i4, this.f42863j, i5, iArr);
        }
        int i7 = i4 - (iArr[1] - i6);
        if ((i7 == 0 ? i4 + this.f42863j[1] : i7) >= 0 || m24841g()) {
            return;
        }
        float fAbs = this.f42859f + Math.abs(r2);
        this.f42859f = fAbs;
        m24844j(fAbs);
        iArr[1] = iArr[1] + i7;
    }

    @Override // p000.InterfaceC7718Hu0
    /* renamed from: c */
    public final void mo3642c(View view, int i, int i2, int i3, int i4, int i5) {
        mo4065b(view, i, i2, i3, i4, i5, this.f42864k);
    }

    @Override // p000.InterfaceC7718Hu0
    /* renamed from: d */
    public final boolean mo3643d(View view, View view2, int i, int i2) {
        if (i2 == 0) {
            return onStartNestedScroll(view, view2, i);
        }
        return false;
    }

    @Override // android.view.View
    public final boolean dispatchNestedFling(float f, float f2, boolean z) {
        return this.f42861h.m3191a(f, f2, z);
    }

    @Override // android.view.View
    public final boolean dispatchNestedPreFling(float f, float f2) {
        return this.f42861h.m3192b(f, f2);
    }

    @Override // android.view.View
    public final boolean dispatchNestedPreScroll(int i, int i2, int[] iArr, int[] iArr2) {
        return this.f42861h.m3193c(i, i2, 0, iArr, iArr2);
    }

    @Override // android.view.View
    public final boolean dispatchNestedScroll(int i, int i2, int i3, int i4, int[] iArr) {
        return this.f42861h.m3194d(i, i2, i3, i4, iArr, 0, null);
    }

    @Override // p000.InterfaceC7718Hu0
    /* renamed from: e */
    public final void mo3644e(View view, View view2, int i, int i2) {
        if (i2 == 0) {
            onNestedScrollAccepted(view, view2, i);
        }
    }

    @Override // p000.InterfaceC7718Hu0
    /* renamed from: f */
    public final void mo3645f(View view, int i, int i2, int[] iArr, int i3) {
        if (i3 == 0) {
            onNestedPreScroll(view, i, i2, iArr);
        }
    }

    /* renamed from: g */
    public final boolean m24841g() {
        View view = this.f42854a;
        return view instanceof ListView ? ((ListView) view).canScrollList(-1) : view.canScrollVertically(-1);
    }

    @Override // android.view.ViewGroup
    public final int getChildDrawingOrder(int i, int i2) {
        int i3 = this.f42874u;
        return i3 < 0 ? i2 : i2 == i + (-1) ? i3 : i2 >= i3 ? i2 + 1 : i2;
    }

    @Override // android.view.ViewGroup
    public int getNestedScrollAxes() {
        C11649xG0 c11649xG0 = this.f42860g;
        return c11649xG0.f45509c | c11649xG0.f45508b;
    }

    public int getProgressCircleDiameter() {
        return this.f42849F;
    }

    public int getProgressViewEndOffset() {
        return this.f42877x;
    }

    public int getProgressViewStartOffset() {
        return this.f42876w;
    }

    /* renamed from: h */
    public final void m24842h() {
        if (this.f42854a == null) {
            for (int i = 0; i < getChildCount(); i++) {
                View childAt = getChildAt(i);
                if (!childAt.equals(this.f42873t)) {
                    this.f42854a = childAt;
                    return;
                }
            }
        }
    }

    @Override // android.view.View
    public final boolean hasNestedScrollingParent() {
        return this.f42861h.m3196f(0);
    }

    /* renamed from: i */
    public final void m24843i(float f) {
        if (f > this.f42858e) {
            m24847m(true, true);
            return;
        }
        this.f42856c = false;
        C6581os c6581os = this.f42879z;
        C6516ns c6516ns = c6581os.f39316a;
        c6516ns.f38569e = 0.0f;
        c6516ns.f38570f = 0.0f;
        c6581os.invalidateSelf();
        AnimationAnimationListenerC9012ch0 animationAnimationListenerC9012ch0 = new AnimationAnimationListenerC9012ch0(3, this);
        this.f42875v = this.f42867n;
        C10610p71 c10610p71 = this.f42853J;
        c10610p71.reset();
        c10610p71.setDuration(200L);
        c10610p71.setInterpolator(this.f42872s);
        this.f42873t.f28641a = animationAnimationListenerC9012ch0;
        this.f42873t.clearAnimation();
        this.f42873t.startAnimation(c10610p71);
        C6581os c6581os2 = this.f42879z;
        C6516ns c6516ns2 = c6581os2.f39316a;
        if (c6516ns2.f38578n) {
            c6516ns2.f38578n = false;
        }
        c6581os2.invalidateSelf();
    }

    @Override // android.view.View
    public final boolean isNestedScrollingEnabled() {
        return this.f42861h.f3954d;
    }

    /* renamed from: j */
    public final void m24844j(float f) {
        C10482o71 c10482o71;
        C10482o71 c10482o712;
        C6581os c6581os = this.f42879z;
        C6516ns c6516ns = c6581os.f39316a;
        if (!c6516ns.f38578n) {
            c6516ns.f38578n = true;
        }
        c6581os.invalidateSelf();
        float fMin = Math.min(1.0f, Math.abs(f / this.f42858e));
        float fMax = (((float) Math.max(fMin - 0.4d, ConfigValue.DOUBLE_DEFAULT_VALUE)) * 5.0f) / 3.0f;
        float fAbs = Math.abs(f) - this.f42858e;
        int i = this.f42878y;
        if (i <= 0) {
            i = this.f42850G ? this.f42877x - this.f42876w : this.f42877x;
        }
        float f2 = i;
        double dMax = Math.max(0.0f, Math.min(fAbs, f2 * 2.0f) / f2) / 4.0f;
        float fPow = ((float) (dMax - Math.pow(dMax, 2.0d))) * 2.0f;
        int i2 = this.f42876w + ((int) ((f2 * fMin) + (f2 * fPow * 2.0f)));
        if (this.f42873t.getVisibility() != 0) {
            this.f42873t.setVisibility(0);
        }
        this.f42873t.setScaleX(1.0f);
        this.f42873t.setScaleY(1.0f);
        if (f < this.f42858e) {
            if (this.f42879z.f39316a.f38584t > 76 && ((c10482o712 = this.f42846C) == null || !c10482o712.hasStarted() || c10482o712.hasEnded())) {
                C10482o71 c10482o713 = new C10482o71(this, this.f42879z.f39316a.f38584t, 76);
                c10482o713.setDuration(300L);
                C4206hs c4206hs = this.f42873t;
                c4206hs.f28641a = null;
                c4206hs.clearAnimation();
                this.f42873t.startAnimation(c10482o713);
                this.f42846C = c10482o713;
            }
        } else if (this.f42879z.f39316a.f38584t < 255 && ((c10482o71 = this.f42847D) == null || !c10482o71.hasStarted() || c10482o71.hasEnded())) {
            C10482o71 c10482o714 = new C10482o71(this, this.f42879z.f39316a.f38584t, KotlinVersion.MAX_COMPONENT_VALUE);
            c10482o714.setDuration(300L);
            C4206hs c4206hs2 = this.f42873t;
            c4206hs2.f28641a = null;
            c4206hs2.clearAnimation();
            this.f42873t.startAnimation(c10482o714);
            this.f42847D = c10482o714;
        }
        C6581os c6581os2 = this.f42879z;
        float fMin2 = Math.min(0.8f, fMax * 0.8f);
        C6516ns c6516ns2 = c6581os2.f39316a;
        c6516ns2.f38569e = 0.0f;
        c6516ns2.f38570f = fMin2;
        c6581os2.invalidateSelf();
        C6581os c6581os3 = this.f42879z;
        float fMin3 = Math.min(1.0f, fMax);
        C6516ns c6516ns3 = c6581os3.f39316a;
        if (fMin3 != c6516ns3.f38580p) {
            c6516ns3.f38580p = fMin3;
        }
        c6581os3.invalidateSelf();
        C6581os c6581os4 = this.f42879z;
        c6581os4.f39316a.f38571g = ((fPow * 2.0f) + ((fMax * 0.4f) - 0.25f)) * 0.5f;
        c6581os4.invalidateSelf();
        setTargetOffsetTopAndBottom(i2 - this.f42867n);
    }

    /* renamed from: k */
    public final void m24845k(float f) {
        setTargetOffsetTopAndBottom((this.f42875v + ((int) ((this.f42876w - r0) * f))) - this.f42873t.getTop());
    }

    /* renamed from: l */
    public final void m24846l() {
        this.f42873t.clearAnimation();
        this.f42879z.stop();
        this.f42873t.setVisibility(8);
        setColorViewAlpha(KotlinVersion.MAX_COMPONENT_VALUE);
        setTargetOffsetTopAndBottom(this.f42876w - this.f42867n);
        this.f42867n = this.f42873t.getTop();
    }

    /* renamed from: m */
    public final void m24847m(boolean z, boolean z2) {
        if (this.f42856c != z) {
            this.f42848E = z2;
            m24842h();
            this.f42856c = z;
            AnimationAnimationListenerC9012ch0 animationAnimationListenerC9012ch0 = this.f42851H;
            if (!z) {
                C10354n71 c10354n71 = new C10354n71(this, 1);
                this.f42845B = c10354n71;
                c10354n71.setDuration(150L);
                C4206hs c4206hs = this.f42873t;
                c4206hs.f28641a = animationAnimationListenerC9012ch0;
                c4206hs.clearAnimation();
                this.f42873t.startAnimation(this.f42845B);
                return;
            }
            this.f42875v = this.f42867n;
            C10610p71 c10610p71 = this.f42852I;
            c10610p71.reset();
            c10610p71.setDuration(200L);
            c10610p71.setInterpolator(this.f42872s);
            if (animationAnimationListenerC9012ch0 != null) {
                this.f42873t.f28641a = animationAnimationListenerC9012ch0;
            }
            this.f42873t.clearAnimation();
            this.f42873t.startAnimation(c10610p71);
        }
    }

    /* renamed from: n */
    public final void m24848n(float f) {
        float f2 = this.f42869p;
        float f3 = f - f2;
        float f4 = this.f42857d;
        if (f3 <= f4 || this.f42870q) {
            return;
        }
        this.f42868o = f2 + f4;
        this.f42870q = true;
        this.f42879z.setAlpha(76);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        m24846l();
    }

    /* JADX WARN: Removed duplicated region for block: B:74:0x0057  */
    @Override // android.view.ViewGroup
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean onInterceptTouchEvent(android.view.MotionEvent r6) {
        /*
            r5 = this;
            r5.m24842h()
            int r0 = r6.getActionMasked()
            boolean r1 = r5.isEnabled()
            r2 = 0
            if (r1 == 0) goto L80
            boolean r1 = r5.m24841g()
            if (r1 != 0) goto L80
            boolean r1 = r5.f42856c
            if (r1 != 0) goto L80
            boolean r1 = r5.f42865l
            if (r1 == 0) goto L1d
            goto L80
        L1d:
            if (r0 == 0) goto L5c
            r1 = 1
            r3 = -1
            if (r0 == r1) goto L57
            r4 = 2
            if (r0 == r4) goto L43
            r4 = 3
            if (r0 == r4) goto L57
            r3 = 6
            if (r0 == r3) goto L2d
            goto L7d
        L2d:
            int r0 = r6.getActionIndex()
            int r3 = r6.getPointerId(r0)
            int r4 = r5.f42871r
            if (r3 != r4) goto L7d
            if (r0 != 0) goto L3c
            r2 = r1
        L3c:
            int r6 = r6.getPointerId(r2)
            r5.f42871r = r6
            goto L7d
        L43:
            int r0 = r5.f42871r
            if (r0 != r3) goto L48
            return r2
        L48:
            int r0 = r6.findPointerIndex(r0)
            if (r0 >= 0) goto L4f
            return r2
        L4f:
            float r6 = r6.getY(r0)
            r5.m24848n(r6)
            goto L7d
        L57:
            r5.f42870q = r2
            r5.f42871r = r3
            goto L7d
        L5c:
            int r0 = r5.f42876w
            hs r1 = r5.f42873t
            int r1 = r1.getTop()
            int r0 = r0 - r1
            r5.setTargetOffsetTopAndBottom(r0)
            int r0 = r6.getPointerId(r2)
            r5.f42871r = r0
            r5.f42870q = r2
            int r0 = r6.findPointerIndex(r0)
            if (r0 >= 0) goto L77
            return r2
        L77:
            float r6 = r6.getY(r0)
            r5.f42869p = r6
        L7d:
            boolean r6 = r5.f42870q
            return r6
        L80:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.AbstractC11122t71.onInterceptTouchEvent(android.view.MotionEvent):boolean");
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int measuredWidth = getMeasuredWidth();
        int measuredHeight = getMeasuredHeight();
        if (getChildCount() == 0) {
            return;
        }
        if (this.f42854a == null) {
            m24842h();
        }
        View view = this.f42854a;
        if (view == null) {
            return;
        }
        int paddingLeft = getPaddingLeft();
        int paddingTop = getPaddingTop();
        view.layout(paddingLeft, paddingTop, ((measuredWidth - getPaddingLeft()) - getPaddingRight()) + paddingLeft, ((measuredHeight - getPaddingTop()) - getPaddingBottom()) + paddingTop);
        int measuredWidth2 = this.f42873t.getMeasuredWidth();
        int measuredHeight2 = this.f42873t.getMeasuredHeight();
        int i5 = measuredWidth / 2;
        int i6 = measuredWidth2 / 2;
        int i7 = this.f42867n;
        this.f42873t.layout(i5 - i6, i7, i5 + i6, measuredHeight2 + i7);
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        if (this.f42854a == null) {
            m24842h();
        }
        View view = this.f42854a;
        if (view == null) {
            return;
        }
        view.measure(View.MeasureSpec.makeMeasureSpec((getMeasuredWidth() - getPaddingLeft()) - getPaddingRight(), 1073741824), View.MeasureSpec.makeMeasureSpec((getMeasuredHeight() - getPaddingTop()) - getPaddingBottom(), 1073741824));
        this.f42873t.measure(View.MeasureSpec.makeMeasureSpec(this.f42849F, 1073741824), View.MeasureSpec.makeMeasureSpec(this.f42849F, 1073741824));
        this.f42874u = -1;
        for (int i3 = 0; i3 < getChildCount(); i3++) {
            if (getChildAt(i3) == this.f42873t) {
                this.f42874u = i3;
                return;
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onNestedFling(View view, float f, float f2, boolean z) {
        return this.f42861h.m3191a(f, f2, z);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onNestedPreFling(View view, float f, float f2) {
        return this.f42861h.m3192b(f, f2);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedPreScroll(View view, int i, int i2, int[] iArr) {
        if (i2 > 0) {
            float f = this.f42859f;
            if (f > 0.0f) {
                float f2 = i2;
                if (f2 > f) {
                    iArr[1] = (int) f;
                    this.f42859f = 0.0f;
                } else {
                    this.f42859f = f - f2;
                    iArr[1] = i2;
                }
                m24844j(this.f42859f);
            }
        }
        if (this.f42850G && i2 > 0 && this.f42859f == 0.0f && Math.abs(i2 - iArr[1]) > 0) {
            this.f42873t.setVisibility(8);
        }
        int i3 = i - iArr[0];
        int i4 = i2 - iArr[1];
        int[] iArr2 = this.f42862i;
        if (dispatchNestedPreScroll(i3, i4, iArr2, null)) {
            iArr[0] = iArr[0] + iArr2[0];
            iArr[1] = iArr[1] + iArr2[1];
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedScroll(View view, int i, int i2, int i3, int i4) {
        mo4065b(view, i, i2, i3, i4, 0, this.f42864k);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedScrollAccepted(View view, View view2, int i) {
        this.f42860g.f45508b = i;
        startNestedScroll(i & 2);
        this.f42859f = 0.0f;
        this.f42865l = true;
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        C10994s71 c10994s71 = (C10994s71) parcelable;
        super.onRestoreInstanceState(c10994s71.getSuperState());
        setRefreshing(c10994s71.f42271a);
    }

    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        return new C10994s71(super.onSaveInstanceState(), this.f42856c);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onStartNestedScroll(View view, View view2, int i) {
        return (!isEnabled() || this.f42856c || (i & 2) == 0) ? false : true;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onStopNestedScroll(View view) {
        this.f42860g.f45508b = 0;
        this.f42865l = false;
        float f = this.f42859f;
        if (f > 0.0f) {
            m24843i(f);
            this.f42859f = 0.0f;
        }
        stopNestedScroll();
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (!isEnabled() || m24841g() || this.f42856c || this.f42865l) {
            return false;
        }
        if (actionMasked == 0) {
            this.f42871r = motionEvent.getPointerId(0);
            this.f42870q = false;
        } else {
            if (actionMasked == 1) {
                int iFindPointerIndex = motionEvent.findPointerIndex(this.f42871r);
                if (iFindPointerIndex < 0) {
                    return false;
                }
                if (this.f42870q) {
                    float y = (motionEvent.getY(iFindPointerIndex) - this.f42868o) * 0.5f;
                    this.f42870q = false;
                    m24843i(y);
                }
                this.f42871r = -1;
                return false;
            }
            if (actionMasked == 2) {
                int iFindPointerIndex2 = motionEvent.findPointerIndex(this.f42871r);
                if (iFindPointerIndex2 < 0) {
                    return false;
                }
                float y2 = motionEvent.getY(iFindPointerIndex2);
                m24848n(y2);
                if (this.f42870q) {
                    float f = (y2 - this.f42868o) * 0.5f;
                    if (f <= 0.0f) {
                        return false;
                    }
                    getParent().requestDisallowInterceptTouchEvent(true);
                    m24844j(f);
                }
            } else {
                if (actionMasked == 3) {
                    return false;
                }
                if (actionMasked == 5) {
                    int actionIndex = motionEvent.getActionIndex();
                    if (actionIndex < 0) {
                        return false;
                    }
                    this.f42871r = motionEvent.getPointerId(actionIndex);
                } else if (actionMasked == 6) {
                    int actionIndex2 = motionEvent.getActionIndex();
                    if (motionEvent.getPointerId(actionIndex2) == this.f42871r) {
                        this.f42871r = motionEvent.getPointerId(actionIndex2 == 0 ? 1 : 0);
                    }
                }
            }
        }
        return true;
    }

    public void setAnimationProgress(float f) {
        this.f42873t.setScaleX(f);
        this.f42873t.setScaleY(f);
    }

    @Deprecated
    public void setColorScheme(int... iArr) {
        setColorSchemeResources(iArr);
    }

    public void setColorSchemeColors(int... iArr) {
        m24842h();
        C6581os c6581os = this.f42879z;
        C6516ns c6516ns = c6581os.f39316a;
        c6516ns.f38573i = iArr;
        c6516ns.m23242a(0);
        c6516ns.m23242a(0);
        c6581os.invalidateSelf();
    }

    public void setColorSchemeResources(int... iArr) {
        Context context = getContext();
        int[] iArr2 = new int[iArr.length];
        for (int i = 0; i < iArr.length; i++) {
            iArr2[i] = AbstractC0691Ky.m4783a(context, iArr[i]);
        }
        setColorSchemeColors(iArr2);
    }

    public void setDistanceToTriggerSync(int i) {
        this.f42858e = i;
    }

    @Override // android.view.View
    public void setEnabled(boolean z) {
        super.setEnabled(z);
        if (z) {
            return;
        }
        m24846l();
    }

    @Override // android.view.View
    public void setNestedScrollingEnabled(boolean z) {
        C7666Gu0 c7666Gu0 = this.f42861h;
        if (c7666Gu0.f3954d) {
            WeakHashMap weakHashMap = AbstractC10944rk1.f41842a;
            AbstractC9536gk1.m18631z(c7666Gu0.f3953c);
        }
        c7666Gu0.f3954d = z;
    }

    public void setOnRefreshListener(InterfaceC10866r71 interfaceC10866r71) {
        this.f42855b = interfaceC10866r71;
    }

    @Deprecated
    public void setProgressBackgroundColor(int i) {
        setProgressBackgroundColorSchemeResource(i);
    }

    public void setProgressBackgroundColorSchemeColor(int i) {
        this.f42873t.setBackgroundColor(i);
    }

    public void setProgressBackgroundColorSchemeResource(int i) {
        setProgressBackgroundColorSchemeColor(AbstractC0691Ky.m4783a(getContext(), i));
    }

    public void setRefreshing(boolean z) {
        if (!z || this.f42856c == z) {
            m24847m(z, false);
            return;
        }
        this.f42856c = z;
        setTargetOffsetTopAndBottom((!this.f42850G ? this.f42877x + this.f42876w : this.f42877x) - this.f42867n);
        this.f42848E = false;
        AnimationAnimationListenerC9012ch0 animationAnimationListenerC9012ch0 = this.f42851H;
        this.f42873t.setVisibility(0);
        this.f42879z.setAlpha(KotlinVersion.MAX_COMPONENT_VALUE);
        C10354n71 c10354n71 = new C10354n71(this, 0);
        this.f42844A = c10354n71;
        c10354n71.setDuration(this.f42866m);
        if (animationAnimationListenerC9012ch0 != null) {
            this.f42873t.f28641a = animationAnimationListenerC9012ch0;
        }
        this.f42873t.clearAnimation();
        this.f42873t.startAnimation(this.f42844A);
    }

    public void setSize(int i) {
        if (i == 0 || i == 1) {
            DisplayMetrics displayMetrics = getResources().getDisplayMetrics();
            if (i == 0) {
                this.f42849F = (int) (displayMetrics.density * 56.0f);
            } else {
                this.f42849F = (int) (displayMetrics.density * 40.0f);
            }
            this.f42873t.setImageDrawable(null);
            this.f42879z.m23574c(i);
            this.f42873t.setImageDrawable(this.f42879z);
        }
    }

    public void setSlingshotDistance(int i) {
        this.f42878y = i;
    }

    public void setTargetOffsetTopAndBottom(int i) {
        C4206hs c4206hs = this.f42873t;
        c4206hs.bringToFront();
        WeakHashMap weakHashMap = AbstractC10944rk1.f41842a;
        c4206hs.offsetTopAndBottom(i);
        this.f42867n = c4206hs.getTop();
    }

    @Override // android.view.View
    public final boolean startNestedScroll(int i) {
        return this.f42861h.m3197g(i, 0);
    }

    @Override // android.view.View
    public final void stopNestedScroll() {
        this.f42861h.m3198h(0);
    }

    @Deprecated
    public void setLegacyRequestDisallowInterceptTouchEventEnabled(boolean z) {
    }

    public void setOnChildScrollUpCallback(InterfaceC10738q71 interfaceC10738q71) {
    }
}
