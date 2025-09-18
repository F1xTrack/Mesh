package com.google.android.material.bottomsheet;

import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.os.Build;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.SparseIntArray;
import android.util.TypedValue;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityNodeInfo;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.WeakHashMap;
import p000.AbstractC10490oB1;
import p000.AbstractC1052Qi;
import p000.AbstractC10871rA0;
import p000.AbstractC10944rk1;
import p000.AbstractC11153tN0;
import p000.AbstractC1374Vq;
import p000.AbstractC6397lz;
import p000.AbstractC8259Se1;
import p000.AbstractC9280ek1;
import p000.AbstractC9536gk1;
import p000.C0002A1;
import p000.C0695L1;
import p000.C0863Ni;
import p000.C0926Oi;
import p000.C0986Pf;
import p000.C0989Pi;
import p000.C10311mo0;
import p000.C10439no0;
import p000.C1114Ri;
import p000.C11583wk1;
import p000.C11712xl1;
import p000.C1177Si;
import p000.C6588oz;
import p000.C7112x1;
import p000.K80;
import p000.LZ0;
import p000.NG0;
import p000.RunnableC6217j7;
import p000.ViewOnAttachStateChangeListenerC7491Dk1;
import ru.mes.dnevnik.R;

/* loaded from: classes.dex */
public class BottomSheetBehavior<V extends View> extends AbstractC6397lz {

    /* renamed from: A */
    public final C1177Si f18090A;

    /* renamed from: B */
    public final ValueAnimator f18091B;

    /* renamed from: C */
    public int f18092C;

    /* renamed from: D */
    public int f18093D;

    /* renamed from: E */
    public int f18094E;

    /* renamed from: F */
    public float f18095F;

    /* renamed from: G */
    public int f18096G;

    /* renamed from: H */
    public final float f18097H;

    /* renamed from: I */
    public boolean f18098I;

    /* renamed from: J */
    public boolean f18099J;

    /* renamed from: K */
    public boolean f18100K;

    /* renamed from: L */
    public int f18101L;

    /* renamed from: M */
    public C11583wk1 f18102M;

    /* renamed from: N */
    public boolean f18103N;

    /* renamed from: O */
    public int f18104O;

    /* renamed from: P */
    public boolean f18105P;

    /* renamed from: Q */
    public final float f18106Q;

    /* renamed from: R */
    public int f18107R;

    /* renamed from: S */
    public int f18108S;

    /* renamed from: T */
    public int f18109T;

    /* renamed from: U */
    public WeakReference f18110U;

    /* renamed from: V */
    public WeakReference f18111V;

    /* renamed from: W */
    public final ArrayList f18112W;

    /* renamed from: X */
    public VelocityTracker f18113X;

    /* renamed from: Y */
    public int f18114Y;

    /* renamed from: Z */
    public int f18115Z;

    /* renamed from: a */
    public final int f18116a;

    /* renamed from: a0 */
    public boolean f18117a0;

    /* renamed from: b */
    public boolean f18118b;

    /* renamed from: b0 */
    public HashMap f18119b0;

    /* renamed from: c */
    public final float f18120c;

    /* renamed from: c0 */
    public final SparseIntArray f18121c0;

    /* renamed from: d */
    public final int f18122d;

    /* renamed from: d0 */
    public final C0989Pi f18123d0;

    /* renamed from: e */
    public int f18124e;

    /* renamed from: f */
    public boolean f18125f;

    /* renamed from: g */
    public int f18126g;

    /* renamed from: h */
    public final int f18127h;

    /* renamed from: i */
    public final C10439no0 f18128i;

    /* renamed from: j */
    public final ColorStateList f18129j;

    /* renamed from: k */
    public final int f18130k;

    /* renamed from: l */
    public int f18131l;

    /* renamed from: m */
    public int f18132m;

    /* renamed from: n */
    public final boolean f18133n;

    /* renamed from: o */
    public final boolean f18134o;

    /* renamed from: p */
    public final boolean f18135p;

    /* renamed from: q */
    public final boolean f18136q;

    /* renamed from: r */
    public final boolean f18137r;

    /* renamed from: s */
    public final boolean f18138s;

    /* renamed from: t */
    public final boolean f18139t;

    /* renamed from: u */
    public final boolean f18140u;

    /* renamed from: v */
    public int f18141v;

    /* renamed from: w */
    public int f18142w;

    /* renamed from: x */
    public final boolean f18143x;

    /* renamed from: y */
    public final LZ0 f18144y;

    /* renamed from: z */
    public boolean f18145z;

    public BottomSheetBehavior() {
        this.f18116a = 0;
        this.f18118b = true;
        this.f18130k = -1;
        this.f18131l = -1;
        this.f18090A = new C1177Si(this);
        this.f18095F = 0.5f;
        this.f18097H = -1.0f;
        this.f18100K = true;
        this.f18101L = 4;
        this.f18106Q = 0.1f;
        this.f18112W = new ArrayList();
        this.f18115Z = -1;
        this.f18121c0 = new SparseIntArray();
        this.f18123d0 = new C0989Pi(this, 0);
    }

    /* renamed from: x */
    public static View m11189x(View view) {
        if (view.getVisibility() != 0) {
            return null;
        }
        WeakHashMap weakHashMap = AbstractC10944rk1.f41842a;
        if (AbstractC9536gk1.m18621p(view)) {
            return view;
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            int childCount = viewGroup.getChildCount();
            for (int i = 0; i < childCount; i++) {
                View viewM11189x = m11189x(viewGroup.getChildAt(i));
                if (viewM11189x != null) {
                    return viewM11189x;
                }
            }
        }
        return null;
    }

    /* renamed from: y */
    public static int m11190y(int i, int i2, int i3, int i4) {
        int childMeasureSpec = ViewGroup.getChildMeasureSpec(i, i2, i4);
        if (i3 == -1) {
            return childMeasureSpec;
        }
        int mode = View.MeasureSpec.getMode(childMeasureSpec);
        int size = View.MeasureSpec.getSize(childMeasureSpec);
        if (mode == 1073741824) {
            return View.MeasureSpec.makeMeasureSpec(Math.min(size, i3), 1073741824);
        }
        if (size != 0) {
            i3 = Math.min(size, i3);
        }
        return View.MeasureSpec.makeMeasureSpec(i3, Integer.MIN_VALUE);
    }

    /* renamed from: A */
    public final int m11191A(int i) {
        if (i == 3) {
            return m11213z();
        }
        if (i == 4) {
            return this.f18096G;
        }
        if (i == 5) {
            return this.f18109T;
        }
        if (i == 6) {
            return this.f18094E;
        }
        throw new IllegalArgumentException(AbstractC11153tN0.m24909u(i, "Invalid state to get top offset: "));
    }

    /* renamed from: B */
    public final boolean m11192B() {
        WeakReference weakReference = this.f18110U;
        if (weakReference == null || weakReference.get() == null) {
            return false;
        }
        int[] iArr = new int[2];
        ((View) this.f18110U.get()).getLocationOnScreen(iArr);
        return iArr[1] == 0;
    }

    /* renamed from: C */
    public final void m11193C(int i) {
        if (i < 0) {
            throw new IllegalArgumentException("offset must be greater than or equal to 0");
        }
        this.f18092C = i;
        m11202L(this.f18101L, true);
    }

    /* renamed from: D */
    public final void m11194D(boolean z) {
        if (this.f18118b == z) {
            return;
        }
        this.f18118b = z;
        if (this.f18110U != null) {
            m11209t();
        }
        m11198H((this.f18118b && this.f18101L == 6) ? 3 : this.f18101L);
        m11202L(this.f18101L, true);
        m11201K();
    }

    /* renamed from: E */
    public final void m11195E(float f) {
        if (f <= 0.0f || f >= 1.0f) {
            throw new IllegalArgumentException("ratio must be a float value between 0 and 1");
        }
        this.f18095F = f;
        if (this.f18110U != null) {
            this.f18094E = (int) ((1.0f - f) * this.f18109T);
        }
    }

    /* renamed from: F */
    public final void m11196F(int i) {
        if (i == -1) {
            if (this.f18125f) {
                return;
            } else {
                this.f18125f = true;
            }
        } else {
            if (!this.f18125f && this.f18124e == i) {
                return;
            }
            this.f18125f = false;
            this.f18124e = Math.max(0, i);
        }
        m11204N();
    }

    /* renamed from: G */
    public final void m11197G(int i) {
        if (i == 1 || i == 2) {
            throw new IllegalArgumentException(AbstractC1374Vq.m8593l(new StringBuilder("STATE_"), i == 1 ? "DRAGGING" : "SETTLING", " should not be set externally."));
        }
        if (this.f18098I || i != 5) {
            int i2 = (i == 6 && this.f18118b && m11191A(i) <= this.f18093D) ? 3 : i;
            WeakReference weakReference = this.f18110U;
            if (weakReference == null || weakReference.get() == null) {
                m11198H(i);
                return;
            }
            View view = (View) this.f18110U.get();
            RunnableC6217j7 runnableC6217j7 = new RunnableC6217j7(this, view, i2);
            ViewParent parent = view.getParent();
            if (parent != null && parent.isLayoutRequested()) {
                WeakHashMap weakHashMap = AbstractC10944rk1.f41842a;
                if (view.isAttachedToWindow()) {
                    view.post(runnableC6217j7);
                    return;
                }
            }
            runnableC6217j7.run();
        }
    }

    /* renamed from: H */
    public final void m11198H(int i) {
        View view;
        if (this.f18101L == i) {
            return;
        }
        this.f18101L = i;
        if (i != 4 && i != 3 && i != 6) {
            boolean z = this.f18098I;
        }
        WeakReference weakReference = this.f18110U;
        if (weakReference == null || (view = (View) weakReference.get()) == null) {
            return;
        }
        int i2 = 0;
        if (i == 3) {
            m11203M(true);
        } else if (i == 6 || i == 5 || i == 4) {
            m11203M(false);
        }
        m11202L(i, true);
        while (true) {
            ArrayList arrayList = this.f18112W;
            if (i2 >= arrayList.size()) {
                m11201K();
                return;
            } else {
                ((AbstractC1052Qi) arrayList.get(i2)).mo6008b(i, view);
                i2++;
            }
        }
    }

    /* renamed from: I */
    public final boolean m11199I(View view, float f) {
        if (this.f18099J) {
            return true;
        }
        if (view.getTop() < this.f18096G) {
            return false;
        }
        return Math.abs(((f * this.f18106Q) + ((float) view.getTop())) - ((float) this.f18096G)) / ((float) m11211v()) > 0.5f;
    }

    /* renamed from: J */
    public final void m11200J(int i, View view, boolean z) {
        int iM11191A = m11191A(i);
        C11583wk1 c11583wk1 = this.f18102M;
        if (c11583wk1 == null || (!z ? c11583wk1.m25692r(view, view.getLeft(), iM11191A) : c11583wk1.m25690p(view.getLeft(), iM11191A))) {
            m11198H(i);
            return;
        }
        m11198H(2);
        m11202L(i, true);
        this.f18090A.m7419a(i);
    }

    /* renamed from: K */
    public final void m11201K() {
        View view;
        int iM4832a;
        WeakReference weakReference = this.f18110U;
        if (weakReference == null || (view = (View) weakReference.get()) == null) {
            return;
        }
        AbstractC10944rk1.m24479k(524288, view);
        AbstractC10944rk1.m24476h(0, view);
        AbstractC10944rk1.m24479k(262144, view);
        AbstractC10944rk1.m24476h(0, view);
        AbstractC10944rk1.m24479k(1048576, view);
        AbstractC10944rk1.m24476h(0, view);
        SparseIntArray sparseIntArray = this.f18121c0;
        int i = sparseIntArray.get(0, -1);
        if (i != -1) {
            AbstractC10944rk1.m24479k(i, view);
            AbstractC10944rk1.m24476h(0, view);
            sparseIntArray.delete(0);
        }
        if (!this.f18118b && this.f18101L != 6) {
            String string = view.getResources().getString(R.string.bottomsheet_action_expand_halfway);
            C0986Pf c0986Pf = new C0986Pf(this, 6, 2);
            ArrayList arrayListM24474f = AbstractC10944rk1.m24474f(view);
            int i2 = 0;
            while (true) {
                if (i2 >= arrayListM24474f.size()) {
                    int i3 = -1;
                    for (int i4 = 0; i4 < 32 && i3 == -1; i4++) {
                        int i5 = AbstractC10944rk1.f41845d[i4];
                        boolean z = true;
                        for (int i6 = 0; i6 < arrayListM24474f.size(); i6++) {
                            z &= ((C0695L1) arrayListM24474f.get(i6)).m4832a() != i5;
                        }
                        if (z) {
                            i3 = i5;
                        }
                    }
                    iM4832a = i3;
                } else {
                    if (TextUtils.equals(string, ((AccessibilityNodeInfo.AccessibilityAction) ((C0695L1) arrayListM24474f.get(i2)).f6463a).getLabel())) {
                        iM4832a = ((C0695L1) arrayListM24474f.get(i2)).m4832a();
                        break;
                    }
                    i2++;
                }
            }
            if (iM4832a != -1) {
                C0695L1 c0695l1 = new C0695L1(null, iM4832a, string, c0986Pf, null);
                C0002A1 c0002a1M24471c = AbstractC10944rk1.m24471c(view);
                if (c0002a1M24471c == null) {
                    c0002a1M24471c = new C0002A1();
                }
                AbstractC10944rk1.m24482n(view, c0002a1M24471c);
                AbstractC10944rk1.m24479k(c0695l1.m4832a(), view);
                AbstractC10944rk1.m24474f(view).add(c0695l1);
                AbstractC10944rk1.m24476h(0, view);
            }
            sparseIntArray.put(0, iM4832a);
        }
        if (this.f18098I && this.f18101L != 5) {
            AbstractC10944rk1.m24480l(view, C0695L1.f6460m, new C0986Pf(this, 5, 2));
        }
        int i7 = this.f18101L;
        if (i7 == 3) {
            AbstractC10944rk1.m24480l(view, C0695L1.f6459l, new C0986Pf(this, this.f18118b ? 4 : 6, 2));
            return;
        }
        if (i7 == 4) {
            AbstractC10944rk1.m24480l(view, C0695L1.f6458k, new C0986Pf(this, this.f18118b ? 3 : 6, 2));
        } else {
            if (i7 != 6) {
                return;
            }
            AbstractC10944rk1.m24480l(view, C0695L1.f6459l, new C0986Pf(this, 4, 2));
            AbstractC10944rk1.m24480l(view, C0695L1.f6458k, new C0986Pf(this, 3, 2));
        }
    }

    /* renamed from: L */
    public final void m11202L(int i, boolean z) {
        C10439no0 c10439no0 = this.f18128i;
        ValueAnimator valueAnimator = this.f18091B;
        if (i == 2) {
            return;
        }
        boolean z2 = this.f18101L == 3 && (this.f18143x || m11192B());
        if (this.f18145z == z2 || c10439no0 == null) {
            return;
        }
        this.f18145z = z2;
        if (z && valueAnimator != null) {
            if (valueAnimator.isRunning()) {
                valueAnimator.reverse();
                return;
            } else {
                valueAnimator.setFloatValues(c10439no0.f38516a.f37939i, z2 ? m11210u() : 1.0f);
                valueAnimator.start();
                return;
            }
        }
        if (valueAnimator != null && valueAnimator.isRunning()) {
            valueAnimator.cancel();
        }
        float fM11210u = this.f18145z ? m11210u() : 1.0f;
        C10311mo0 c10311mo0 = c10439no0.f38516a;
        if (c10311mo0.f37939i != fM11210u) {
            c10311mo0.f37939i = fM11210u;
            c10439no0.f38520e = true;
            c10439no0.invalidateSelf();
        }
    }

    /* renamed from: M */
    public final void m11203M(boolean z) {
        WeakReference weakReference = this.f18110U;
        if (weakReference == null) {
            return;
        }
        ViewParent parent = ((View) weakReference.get()).getParent();
        if (parent instanceof CoordinatorLayout) {
            CoordinatorLayout coordinatorLayout = (CoordinatorLayout) parent;
            int childCount = coordinatorLayout.getChildCount();
            if (z) {
                if (this.f18119b0 != null) {
                    return;
                } else {
                    this.f18119b0 = new HashMap(childCount);
                }
            }
            for (int i = 0; i < childCount; i++) {
                View childAt = coordinatorLayout.getChildAt(i);
                if (childAt != this.f18110U.get() && z) {
                    this.f18119b0.put(childAt, Integer.valueOf(childAt.getImportantForAccessibility()));
                }
            }
            if (z) {
                return;
            }
            this.f18119b0 = null;
        }
    }

    /* renamed from: N */
    public final void m11204N() {
        View view;
        if (this.f18110U != null) {
            m11209t();
            if (this.f18101L != 4 || (view = (View) this.f18110U.get()) == null) {
                return;
            }
            view.requestLayout();
        }
    }

    @Override // p000.AbstractC6397lz
    /* renamed from: c */
    public final void mo11205c(C6588oz c6588oz) {
        this.f18110U = null;
        this.f18102M = null;
    }

    @Override // p000.AbstractC6397lz
    /* renamed from: f */
    public final void mo11206f() {
        this.f18110U = null;
        this.f18102M = null;
    }

    @Override // p000.AbstractC6397lz
    /* renamed from: g */
    public final boolean mo11168g(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
        int i;
        C11583wk1 c11583wk1;
        if (!view.isShown() || !this.f18100K) {
            this.f18103N = true;
            return false;
        }
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            this.f18114Y = -1;
            this.f18115Z = -1;
            VelocityTracker velocityTracker = this.f18113X;
            if (velocityTracker != null) {
                velocityTracker.recycle();
                this.f18113X = null;
            }
        }
        if (this.f18113X == null) {
            this.f18113X = VelocityTracker.obtain();
        }
        this.f18113X.addMovement(motionEvent);
        if (actionMasked == 0) {
            int x = (int) motionEvent.getX();
            this.f18115Z = (int) motionEvent.getY();
            if (this.f18101L != 2) {
                WeakReference weakReference = this.f18111V;
                View view2 = weakReference != null ? (View) weakReference.get() : null;
                if (view2 != null && coordinatorLayout.m9968n(view2, x, this.f18115Z)) {
                    this.f18114Y = motionEvent.getPointerId(motionEvent.getActionIndex());
                    this.f18117a0 = true;
                }
            }
            this.f18103N = this.f18114Y == -1 && !coordinatorLayout.m9968n(view, x, this.f18115Z);
        } else if (actionMasked == 1 || actionMasked == 3) {
            this.f18117a0 = false;
            this.f18114Y = -1;
            if (this.f18103N) {
                this.f18103N = false;
                return false;
            }
        }
        if (!this.f18103N && (c11583wk1 = this.f18102M) != null && c11583wk1.m25691q(motionEvent)) {
            return true;
        }
        WeakReference weakReference2 = this.f18111V;
        View view3 = weakReference2 != null ? (View) weakReference2.get() : null;
        return (actionMasked != 2 || view3 == null || this.f18103N || this.f18101L == 1 || coordinatorLayout.m9968n(view3, (int) motionEvent.getX(), (int) motionEvent.getY()) || this.f18102M == null || (i = this.f18115Z) == -1 || Math.abs(((float) i) - motionEvent.getY()) <= ((float) this.f18102M.f45055b)) ? false : true;
    }

    @Override // p000.AbstractC6397lz
    /* renamed from: h */
    public final boolean mo9810h(CoordinatorLayout coordinatorLayout, View view, int i) throws Resources.NotFoundException {
        C10439no0 c10439no0 = this.f18128i;
        int i2 = 0;
        WeakHashMap weakHashMap = AbstractC10944rk1.f41842a;
        if (coordinatorLayout.getFitsSystemWindows() && !view.getFitsSystemWindows()) {
            view.setFitsSystemWindows(true);
        }
        if (this.f18110U == null) {
            this.f18126g = coordinatorLayout.getResources().getDimensionPixelSize(R.dimen.design_bottom_sheet_peek_height_min);
            boolean z = (Build.VERSION.SDK_INT < 29 || this.f18133n || this.f18125f) ? false : true;
            if (this.f18134o || this.f18135p || this.f18136q || this.f18138s || this.f18139t || this.f18140u || z) {
                C0926Oi c0926Oi = new C0926Oi(this, z, 0);
                int paddingStart = view.getPaddingStart();
                view.getPaddingTop();
                int paddingEnd = view.getPaddingEnd();
                int paddingBottom = view.getPaddingBottom();
                C7112x1 c7112x1 = new C7112x1();
                c7112x1.f45257a = paddingStart;
                c7112x1.f45258b = paddingEnd;
                c7112x1.f45259c = paddingBottom;
                AbstractC9536gk1.m18626u(view, new C11712xl1(c0926Oi, c7112x1));
                if (view.isAttachedToWindow()) {
                    AbstractC9280ek1.m18029c(view);
                } else {
                    view.addOnAttachStateChangeListener(new ViewOnAttachStateChangeListenerC7491Dk1(1));
                }
            }
            AbstractC10944rk1.m24484p(view, new K80(view));
            this.f18110U = new WeakReference(view);
            Context context = view.getContext();
            AbstractC10490oB1.m23360e(context, R.attr.motionEasingStandardDecelerateInterpolator, AbstractC10871rA0.m24167b(0.0f, 0.0f, 0.0f, 1.0f));
            AbstractC10490oB1.m23359d(context, R.attr.motionDurationMedium2, 300);
            AbstractC10490oB1.m23359d(context, R.attr.motionDurationShort3, 150);
            AbstractC10490oB1.m23359d(context, R.attr.motionDurationShort2, 100);
            Resources resources = view.getResources();
            resources.getDimension(R.dimen.m3_back_progress_bottom_container_max_scale_x_distance);
            resources.getDimension(R.dimen.m3_back_progress_bottom_container_max_scale_y_distance);
            if (c10439no0 != null) {
                view.setBackground(c10439no0);
                float fM18614i = this.f18097H;
                if (fM18614i == -1.0f) {
                    fM18614i = AbstractC9536gk1.m18614i(view);
                }
                c10439no0.m23237i(fM18614i);
            } else {
                ColorStateList colorStateList = this.f18129j;
                if (colorStateList != null) {
                    AbstractC9536gk1.m18622q(view, colorStateList);
                }
            }
            m11201K();
            if (view.getImportantForAccessibility() == 0) {
                view.setImportantForAccessibility(1);
            }
        }
        if (this.f18102M == null) {
            this.f18102M = new C11583wk1(coordinatorLayout.getContext(), coordinatorLayout, this.f18123d0);
        }
        int top = view.getTop();
        coordinatorLayout.m9970p(i, view);
        this.f18108S = coordinatorLayout.getWidth();
        this.f18109T = coordinatorLayout.getHeight();
        int height = view.getHeight();
        this.f18107R = height;
        int iMin = this.f18109T;
        int i3 = iMin - height;
        int i4 = this.f18142w;
        if (i3 < i4) {
            if (this.f18137r) {
                int i5 = this.f18131l;
                if (i5 != -1) {
                    iMin = Math.min(iMin, i5);
                }
                this.f18107R = iMin;
            } else {
                int iMin2 = iMin - i4;
                int i6 = this.f18131l;
                if (i6 != -1) {
                    iMin2 = Math.min(iMin2, i6);
                }
                this.f18107R = iMin2;
            }
        }
        this.f18093D = Math.max(0, this.f18109T - this.f18107R);
        this.f18094E = (int) ((1.0f - this.f18095F) * this.f18109T);
        m11209t();
        int i7 = this.f18101L;
        if (i7 == 3) {
            view.offsetTopAndBottom(m11213z());
        } else if (i7 == 6) {
            view.offsetTopAndBottom(this.f18094E);
        } else if (this.f18098I && i7 == 5) {
            view.offsetTopAndBottom(this.f18109T);
        } else if (i7 == 4) {
            view.offsetTopAndBottom(this.f18096G);
        } else if (i7 == 1 || i7 == 2) {
            view.offsetTopAndBottom(top - view.getTop());
        }
        m11202L(this.f18101L, false);
        this.f18111V = new WeakReference(m11189x(view));
        while (true) {
            ArrayList arrayList = this.f18112W;
            if (i2 >= arrayList.size()) {
                return true;
            }
            ((AbstractC1052Qi) arrayList.get(i2)).getClass();
            i2++;
        }
    }

    @Override // p000.AbstractC6397lz
    /* renamed from: i */
    public final boolean mo11169i(CoordinatorLayout coordinatorLayout, View view, int i, int i2, int i3) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        view.measure(m11190y(i, coordinatorLayout.getPaddingRight() + coordinatorLayout.getPaddingLeft() + marginLayoutParams.leftMargin + marginLayoutParams.rightMargin + i2, this.f18130k, marginLayoutParams.width), m11190y(i3, coordinatorLayout.getPaddingBottom() + coordinatorLayout.getPaddingTop() + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin, this.f18131l, marginLayoutParams.height));
        return true;
    }

    @Override // p000.AbstractC6397lz
    /* renamed from: j */
    public final boolean mo11207j(View view) {
        WeakReference weakReference = this.f18111V;
        return (weakReference == null || view != weakReference.get() || this.f18101L == 3) ? false : true;
    }

    @Override // p000.AbstractC6397lz
    /* renamed from: k */
    public final void mo11170k(CoordinatorLayout coordinatorLayout, View view, View view2, int i, int i2, int[] iArr, int i3) {
        if (i3 == 1) {
            return;
        }
        WeakReference weakReference = this.f18111V;
        if (view2 != (weakReference != null ? (View) weakReference.get() : null)) {
            return;
        }
        int top = view.getTop();
        int i4 = top - i2;
        if (i2 > 0) {
            if (i4 < m11213z()) {
                int iM11213z = top - m11213z();
                iArr[1] = iM11213z;
                int i5 = -iM11213z;
                WeakHashMap weakHashMap = AbstractC10944rk1.f41842a;
                view.offsetTopAndBottom(i5);
                m11198H(3);
            } else {
                if (!this.f18100K) {
                    return;
                }
                iArr[1] = i2;
                WeakHashMap weakHashMap2 = AbstractC10944rk1.f41842a;
                view.offsetTopAndBottom(-i2);
                m11198H(1);
            }
        } else if (i2 < 0 && !view2.canScrollVertically(-1)) {
            int i6 = this.f18096G;
            if (i4 > i6 && !this.f18098I) {
                int i7 = top - i6;
                iArr[1] = i7;
                int i8 = -i7;
                WeakHashMap weakHashMap3 = AbstractC10944rk1.f41842a;
                view.offsetTopAndBottom(i8);
                m11198H(4);
            } else {
                if (!this.f18100K) {
                    return;
                }
                iArr[1] = i2;
                WeakHashMap weakHashMap4 = AbstractC10944rk1.f41842a;
                view.offsetTopAndBottom(-i2);
                m11198H(1);
            }
        }
        m11212w(view.getTop());
        this.f18104O = i2;
        this.f18105P = true;
    }

    @Override // p000.AbstractC6397lz
    /* renamed from: n */
    public final void mo11172n(View view, Parcelable parcelable) {
        C1114Ri c1114Ri = (C1114Ri) parcelable;
        int i = this.f18116a;
        if (i != 0) {
            if (i == -1 || (i & 1) == 1) {
                this.f18124e = c1114Ri.f10382d;
            }
            if (i == -1 || (i & 2) == 2) {
                this.f18118b = c1114Ri.f10383e;
            }
            if (i == -1 || (i & 4) == 4) {
                this.f18098I = c1114Ri.f10384f;
            }
            if (i == -1 || (i & 8) == 8) {
                this.f18099J = c1114Ri.f10385g;
            }
        }
        int i2 = c1114Ri.f10381c;
        if (i2 == 1 || i2 == 2) {
            this.f18101L = 4;
        } else {
            this.f18101L = i2;
        }
    }

    @Override // p000.AbstractC6397lz
    /* renamed from: o */
    public final Parcelable mo11173o(View view) {
        return new C1114Ri(View.BaseSavedState.EMPTY_STATE, this);
    }

    @Override // p000.AbstractC6397lz
    /* renamed from: p */
    public final boolean mo11174p(CoordinatorLayout coordinatorLayout, View view, View view2, int i, int i2) {
        this.f18104O = 0;
        this.f18105P = false;
        return (i & 2) != 0;
    }

    /* JADX WARN: Removed duplicated region for block: B:103:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x00ae  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0055  */
    @Override // p000.AbstractC6397lz
    /* renamed from: q */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void mo11175q(androidx.coordinatorlayout.widget.CoordinatorLayout r3, android.view.View r4, android.view.View r5, int r6) {
        /*
            r2 = this;
            int r3 = r4.getTop()
            int r6 = r2.m11213z()
            r0 = 3
            if (r3 != r6) goto Lf
            r2.m11198H(r0)
            return
        Lf:
            java.lang.ref.WeakReference r3 = r2.f18111V
            if (r3 == 0) goto Lb5
            java.lang.Object r3 = r3.get()
            if (r5 != r3) goto Lb5
            boolean r3 = r2.f18105P
            if (r3 != 0) goto L1f
            goto Lb5
        L1f:
            int r3 = r2.f18104O
            r5 = 6
            if (r3 <= 0) goto L34
            boolean r3 = r2.f18118b
            if (r3 == 0) goto L2a
            goto Laf
        L2a:
            int r3 = r4.getTop()
            int r6 = r2.f18094E
            if (r3 <= r6) goto Laf
            goto Lae
        L34:
            boolean r3 = r2.f18098I
            if (r3 == 0) goto L55
            android.view.VelocityTracker r3 = r2.f18113X
            if (r3 != 0) goto L3e
            r3 = 0
            goto L4d
        L3e:
            r6 = 1000(0x3e8, float:1.401E-42)
            float r1 = r2.f18120c
            r3.computeCurrentVelocity(r6, r1)
            android.view.VelocityTracker r3 = r2.f18113X
            int r6 = r2.f18114Y
            float r3 = r3.getYVelocity(r6)
        L4d:
            boolean r3 = r2.m11199I(r4, r3)
            if (r3 == 0) goto L55
            r0 = 5
            goto Laf
        L55:
            int r3 = r2.f18104O
            r6 = 4
            if (r3 != 0) goto L93
            int r3 = r4.getTop()
            boolean r1 = r2.f18118b
            if (r1 == 0) goto L74
            int r5 = r2.f18093D
            int r5 = r3 - r5
            int r5 = java.lang.Math.abs(r5)
            int r1 = r2.f18096G
            int r3 = r3 - r1
            int r3 = java.lang.Math.abs(r3)
            if (r5 >= r3) goto L97
            goto Laf
        L74:
            int r1 = r2.f18094E
            if (r3 >= r1) goto L83
            int r6 = r2.f18096G
            int r6 = r3 - r6
            int r6 = java.lang.Math.abs(r6)
            if (r3 >= r6) goto Lae
            goto Laf
        L83:
            int r0 = r3 - r1
            int r0 = java.lang.Math.abs(r0)
            int r1 = r2.f18096G
            int r3 = r3 - r1
            int r3 = java.lang.Math.abs(r3)
            if (r0 >= r3) goto L97
            goto Lae
        L93:
            boolean r3 = r2.f18118b
            if (r3 == 0) goto L99
        L97:
            r0 = r6
            goto Laf
        L99:
            int r3 = r4.getTop()
            int r0 = r2.f18094E
            int r0 = r3 - r0
            int r0 = java.lang.Math.abs(r0)
            int r1 = r2.f18096G
            int r3 = r3 - r1
            int r3 = java.lang.Math.abs(r3)
            if (r0 >= r3) goto L97
        Lae:
            r0 = r5
        Laf:
            r3 = 0
            r2.m11200J(r0, r4, r3)
            r2.f18105P = r3
        Lb5:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.bottomsheet.BottomSheetBehavior.mo11175q(androidx.coordinatorlayout.widget.CoordinatorLayout, android.view.View, android.view.View, int):void");
    }

    @Override // p000.AbstractC6397lz
    /* renamed from: r */
    public final boolean mo11176r(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
        if (!view.isShown()) {
            return false;
        }
        int actionMasked = motionEvent.getActionMasked();
        int i = this.f18101L;
        if (i == 1 && actionMasked == 0) {
            return true;
        }
        C11583wk1 c11583wk1 = this.f18102M;
        if (c11583wk1 != null && (this.f18100K || i == 1)) {
            c11583wk1.m25684j(motionEvent);
        }
        if (actionMasked == 0) {
            this.f18114Y = -1;
            this.f18115Z = -1;
            VelocityTracker velocityTracker = this.f18113X;
            if (velocityTracker != null) {
                velocityTracker.recycle();
                this.f18113X = null;
            }
        }
        if (this.f18113X == null) {
            this.f18113X = VelocityTracker.obtain();
        }
        this.f18113X.addMovement(motionEvent);
        if (this.f18102M != null && ((this.f18100K || this.f18101L == 1) && actionMasked == 2 && !this.f18103N)) {
            float fAbs = Math.abs(this.f18115Z - motionEvent.getY());
            C11583wk1 c11583wk12 = this.f18102M;
            if (fAbs > c11583wk12.f45055b) {
                c11583wk12.m25676b(motionEvent.getPointerId(motionEvent.getActionIndex()), view);
            }
        }
        return !this.f18103N;
    }

    /* renamed from: s */
    public final void m11208s(AbstractC1052Qi abstractC1052Qi) {
        ArrayList arrayList = this.f18112W;
        if (arrayList.contains(abstractC1052Qi)) {
            return;
        }
        arrayList.add(abstractC1052Qi);
    }

    /* renamed from: t */
    public final void m11209t() {
        int iM11211v = m11211v();
        if (this.f18118b) {
            this.f18096G = Math.max(this.f18109T - iM11211v, this.f18093D);
        } else {
            this.f18096G = this.f18109T - iM11211v;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:53:0x004e  */
    /* renamed from: u */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final float m11210u() {
        /*
            r5 = this;
            no0 r0 = r5.f18128i
            r1 = 0
            if (r0 == 0) goto L79
            java.lang.ref.WeakReference r0 = r5.f18110U
            if (r0 == 0) goto L79
            java.lang.Object r0 = r0.get()
            if (r0 == 0) goto L79
            int r0 = android.os.Build.VERSION.SDK_INT
            r2 = 31
            if (r0 < r2) goto L79
            java.lang.ref.WeakReference r0 = r5.f18110U
            java.lang.Object r0 = r0.get()
            android.view.View r0 = (android.view.View) r0
            boolean r2 = r5.m11192B()
            if (r2 == 0) goto L79
            android.view.WindowInsets r0 = r0.getRootWindowInsets()
            if (r0 == 0) goto L79
            no0 r2 = r5.f18128i
            mo0 r3 = r2.f38516a
            LZ0 r3 = r3.f37931a
            yz r3 = r3.f6718e
            android.graphics.RectF r2 = r2.m23234f()
            float r2 = r3.mo22818a(r2)
            android.view.RoundedCorner r3 = p000.AbstractC1205T9.m7596o(r0)
            if (r3 == 0) goto L4e
            int r3 = p000.AbstractC1205T9.m7586e(r3)
            float r3 = (float) r3
            int r4 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r4 <= 0) goto L4e
            int r4 = (r2 > r1 ? 1 : (r2 == r1 ? 0 : -1))
            if (r4 <= 0) goto L4e
            float r3 = r3 / r2
            goto L4f
        L4e:
            r3 = r1
        L4f:
            no0 r2 = r5.f18128i
            mo0 r4 = r2.f38516a
            LZ0 r4 = r4.f37931a
            yz r4 = r4.f6719f
            android.graphics.RectF r2 = r2.m23234f()
            float r2 = r4.mo22818a(r2)
            android.view.RoundedCorner r0 = p000.AbstractC1205T9.m7581D(r0)
            if (r0 == 0) goto L74
            int r0 = p000.AbstractC1205T9.m7586e(r0)
            float r0 = (float) r0
            int r4 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r4 <= 0) goto L74
            int r4 = (r2 > r1 ? 1 : (r2 == r1 ? 0 : -1))
            if (r4 <= 0) goto L74
            float r1 = r0 / r2
        L74:
            float r0 = java.lang.Math.max(r3, r1)
            return r0
        L79:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.bottomsheet.BottomSheetBehavior.m11210u():float");
    }

    /* renamed from: v */
    public final int m11211v() {
        int i;
        return this.f18125f ? Math.min(Math.max(this.f18126g, this.f18109T - ((this.f18108S * 9) / 16)), this.f18107R) + this.f18141v : (this.f18133n || this.f18134o || (i = this.f18132m) <= 0) ? this.f18124e + this.f18141v : Math.max(this.f18124e, i + this.f18127h);
    }

    /* renamed from: w */
    public final void m11212w(int i) {
        float f;
        float fM11213z;
        View view = (View) this.f18110U.get();
        if (view != null) {
            ArrayList arrayList = this.f18112W;
            if (arrayList.isEmpty()) {
                return;
            }
            int i2 = this.f18096G;
            if (i > i2 || i2 == m11213z()) {
                int i3 = this.f18096G;
                f = i3 - i;
                fM11213z = this.f18109T - i3;
            } else {
                int i4 = this.f18096G;
                f = i4 - i;
                fM11213z = i4 - m11213z();
            }
            float f2 = f / fM11213z;
            for (int i5 = 0; i5 < arrayList.size(); i5++) {
                ((AbstractC1052Qi) arrayList.get(i5)).mo6007a(view, f2);
            }
        }
    }

    /* renamed from: z */
    public final int m11213z() {
        if (this.f18118b) {
            return this.f18093D;
        }
        return Math.max(this.f18092C, this.f18137r ? 0 : this.f18142w);
    }

    public BottomSheetBehavior(Context context, AttributeSet attributeSet) {
        int i;
        this.f18116a = 0;
        this.f18118b = true;
        this.f18130k = -1;
        this.f18131l = -1;
        this.f18090A = new C1177Si(this);
        this.f18095F = 0.5f;
        this.f18097H = -1.0f;
        this.f18100K = true;
        this.f18101L = 4;
        this.f18106Q = 0.1f;
        this.f18112W = new ArrayList();
        this.f18115Z = -1;
        this.f18121c0 = new SparseIntArray();
        this.f18123d0 = new C0989Pi(this, 0);
        this.f18127h = context.getResources().getDimensionPixelSize(R.dimen.mtrl_min_touch_target_size);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, NG0.f7689c);
        if (typedArrayObtainStyledAttributes.hasValue(3)) {
            this.f18129j = AbstractC8259Se1.m7406e(context, typedArrayObtainStyledAttributes, 3);
        }
        if (typedArrayObtainStyledAttributes.hasValue(21)) {
            this.f18144y = LZ0.m5024b(context, attributeSet, R.attr.bottomSheetStyle, R.style.Widget_Design_BottomSheet_Modal).m8561c();
        }
        LZ0 lz0 = this.f18144y;
        if (lz0 != null) {
            C10439no0 c10439no0 = new C10439no0(lz0);
            this.f18128i = c10439no0;
            c10439no0.m23236h(context);
            ColorStateList colorStateList = this.f18129j;
            if (colorStateList != null) {
                this.f18128i.m23238j(colorStateList);
            } else {
                TypedValue typedValue = new TypedValue();
                context.getTheme().resolveAttribute(android.R.attr.colorBackground, typedValue, true);
                this.f18128i.setTint(typedValue.data);
            }
        }
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(m11210u(), 1.0f);
        this.f18091B = valueAnimatorOfFloat;
        valueAnimatorOfFloat.setDuration(500L);
        this.f18091B.addUpdateListener(new C0863Ni(0, this));
        this.f18097H = typedArrayObtainStyledAttributes.getDimension(2, -1.0f);
        if (typedArrayObtainStyledAttributes.hasValue(0)) {
            this.f18130k = typedArrayObtainStyledAttributes.getDimensionPixelSize(0, -1);
        }
        if (typedArrayObtainStyledAttributes.hasValue(1)) {
            this.f18131l = typedArrayObtainStyledAttributes.getDimensionPixelSize(1, -1);
        }
        TypedValue typedValuePeekValue = typedArrayObtainStyledAttributes.peekValue(9);
        if (typedValuePeekValue != null && (i = typedValuePeekValue.data) == -1) {
            m11196F(i);
        } else {
            m11196F(typedArrayObtainStyledAttributes.getDimensionPixelSize(9, -1));
        }
        boolean z = typedArrayObtainStyledAttributes.getBoolean(8, false);
        if (this.f18098I != z) {
            this.f18098I = z;
            if (!z && this.f18101L == 5) {
                m11197G(4);
            }
            m11201K();
        }
        this.f18133n = typedArrayObtainStyledAttributes.getBoolean(13, false);
        m11194D(typedArrayObtainStyledAttributes.getBoolean(6, true));
        this.f18099J = typedArrayObtainStyledAttributes.getBoolean(12, false);
        this.f18100K = typedArrayObtainStyledAttributes.getBoolean(4, true);
        this.f18116a = typedArrayObtainStyledAttributes.getInt(10, 0);
        m11195E(typedArrayObtainStyledAttributes.getFloat(7, 0.5f));
        TypedValue typedValuePeekValue2 = typedArrayObtainStyledAttributes.peekValue(5);
        if (typedValuePeekValue2 != null && typedValuePeekValue2.type == 16) {
            m11193C(typedValuePeekValue2.data);
        } else {
            m11193C(typedArrayObtainStyledAttributes.getDimensionPixelOffset(5, 0));
        }
        this.f18122d = typedArrayObtainStyledAttributes.getInt(11, 500);
        this.f18134o = typedArrayObtainStyledAttributes.getBoolean(17, false);
        this.f18135p = typedArrayObtainStyledAttributes.getBoolean(18, false);
        this.f18136q = typedArrayObtainStyledAttributes.getBoolean(19, false);
        this.f18137r = typedArrayObtainStyledAttributes.getBoolean(20, true);
        this.f18138s = typedArrayObtainStyledAttributes.getBoolean(14, false);
        this.f18139t = typedArrayObtainStyledAttributes.getBoolean(15, false);
        this.f18140u = typedArrayObtainStyledAttributes.getBoolean(16, false);
        this.f18143x = typedArrayObtainStyledAttributes.getBoolean(23, true);
        typedArrayObtainStyledAttributes.recycle();
        this.f18120c = ViewConfiguration.get(context).getScaledMaximumFlingVelocity();
    }

    @Override // p000.AbstractC6397lz
    /* renamed from: l */
    public final void mo11171l(CoordinatorLayout coordinatorLayout, View view, int i, int i2, int i3, int[] iArr) {
    }
}
