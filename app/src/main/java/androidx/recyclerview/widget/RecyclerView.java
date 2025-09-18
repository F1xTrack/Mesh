package androidx.recyclerview.widget;

import android.R;
import android.animation.LayoutTransition;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.StateListDrawable;
import android.os.Build;
import android.os.Parcelable;
import android.os.SystemClock;
import android.os.Trace;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import android.widget.EdgeEffect;
import android.widget.OverScroller;
import androidx.core.view.ScrollingView;
import java.lang.ref.WeakReference;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.WeakHashMap;
import p000.AO0;
import p000.AbstractC10849r02;
import p000.AbstractC10899rO0;
import p000.AbstractC10944rk1;
import p000.AbstractC11072sk1;
import p000.AbstractC11411vO0;
import p000.AbstractC11456vk1;
import p000.AbstractC11538wO0;
import p000.AbstractC11665xO0;
import p000.AbstractC11919zO0;
import p000.AbstractC1374Vq;
import p000.AbstractC7222ym;
import p000.AbstractC7230yu;
import p000.AbstractC7421Cb1;
import p000.AbstractC9536gk1;
import p000.AbstractC9792ik1;
import p000.BO0;
import p000.C0344FS;
import p000.C0495Hr;
import p000.C10189lr0;
import p000.C11649xG0;
import p000.C1463XF;
import p000.C4155h3;
import p000.C4218i3;
import p000.C6327ks;
import p000.C7387Bk1;
import p000.C7391Bm1;
import p000.C7544El0;
import p000.C7666Gu0;
import p000.C7967Mo1;
import p000.C8760aj0;
import p000.C9154dl1;
import p000.C9196e41;
import p000.C9432fw1;
import p000.C9851jC0;
import p000.CO0;
import p000.DO0;
import p000.EO0;
import p000.FL1;
import p000.FO0;
import p000.GO0;
import p000.HO0;
import p000.IO0;
import p000.InterfaceC11283uO0;
import p000.InterfaceC7614Fu0;
import p000.InterpolatorC10771qO0;
import p000.KO0;
import p000.L01;
import p000.LO0;
import p000.MO0;
import p000.NO0;
import p000.OO0;
import p000.QO0;
import p000.QQ0;
import p000.RunnableC10643pO0;
import p000.RunnableC9311f00;
import p000.ZG0;

/* loaded from: classes.dex */
public class RecyclerView extends ViewGroup implements ScrollingView, InterfaceC7614Fu0 {

    /* renamed from: L1 */
    public static boolean f16450L1 = false;

    /* renamed from: M1 */
    public static boolean f16451M1 = false;

    /* renamed from: N1 */
    public static final int[] f16452N1 = {R.attr.nestedScrollingEnabled};

    /* renamed from: O1 */
    public static final float f16453O1 = (float) (Math.log(0.78d) / Math.log(0.9d));

    /* renamed from: P1 */
    public static final boolean f16454P1 = true;

    /* renamed from: Q1 */
    public static final boolean f16455Q1 = true;

    /* renamed from: R1 */
    public static final boolean f16456R1 = true;

    /* renamed from: S1 */
    public static final Class[] f16457S1;

    /* renamed from: T1 */
    public static final InterpolatorC10771qO0 f16458T1;

    /* renamed from: U1 */
    public static final LO0 f16459U1;

    /* renamed from: A */
    public boolean f16460A;

    /* renamed from: A1 */
    public final int[] f16461A1;

    /* renamed from: B */
    public final AccessibilityManager f16462B;

    /* renamed from: B1 */
    public C7666Gu0 f16463B1;

    /* renamed from: C */
    public ArrayList f16464C;

    /* renamed from: C1 */
    public final int[] f16465C1;

    /* renamed from: D */
    public boolean f16466D;

    /* renamed from: D1 */
    public final int[] f16467D1;

    /* renamed from: E */
    public boolean f16468E;

    /* renamed from: E1 */
    public final int[] f16469E1;

    /* renamed from: F */
    public int f16470F;

    /* renamed from: F1 */
    public final ArrayList f16471F1;

    /* renamed from: G */
    public int f16472G;

    /* renamed from: G1 */
    public final RunnableC10643pO0 f16473G1;

    /* renamed from: H */
    public AbstractC11411vO0 f16474H;

    /* renamed from: H1 */
    public boolean f16475H1;

    /* renamed from: I */
    public EdgeEffect f16476I;

    /* renamed from: I1 */
    public int f16477I1;

    /* renamed from: J */
    public EdgeEffect f16478J;

    /* renamed from: J1 */
    public int f16479J1;

    /* renamed from: K */
    public EdgeEffect f16480K;

    /* renamed from: K1 */
    public final QQ0 f16481K1;

    /* renamed from: L */
    public EdgeEffect f16482L;

    /* renamed from: M */
    public AbstractC11538wO0 f16483M;

    /* renamed from: N */
    public int f16484N;

    /* renamed from: O */
    public int f16485O;

    /* renamed from: P */
    public VelocityTracker f16486P;

    /* renamed from: Q */
    public int f16487Q;

    /* renamed from: R */
    public int f16488R;

    /* renamed from: S */
    public int f16489S;

    /* renamed from: T */
    public int f16490T;

    /* renamed from: U */
    public int f16491U;

    /* renamed from: V */
    public BO0 f16492V;

    /* renamed from: W */
    public final int f16493W;

    /* renamed from: a */
    public final float f16494a;

    /* renamed from: a0 */
    public final int f16495a0;

    /* renamed from: b */
    public final HO0 f16496b;

    /* renamed from: b0 */
    public final float f16497b0;

    /* renamed from: c */
    public final FO0 f16498c;

    /* renamed from: c0 */
    public final float f16499c0;

    /* renamed from: d */
    public IO0 f16500d;

    /* renamed from: d0 */
    public boolean f16501d0;

    /* renamed from: e */
    public final C4218i3 f16502e;

    /* renamed from: e0 */
    public final NO0 f16503e0;

    /* renamed from: f */
    public final C10189lr0 f16504f;

    /* renamed from: g */
    public final C7967Mo1 f16505g;

    /* renamed from: h */
    public boolean f16506h;

    /* renamed from: i */
    public final RunnableC10643pO0 f16507i;

    /* renamed from: j */
    public final Rect f16508j;

    /* renamed from: k */
    public final Rect f16509k;

    /* renamed from: l */
    public final RectF f16510l;

    /* renamed from: m */
    public AbstractC10899rO0 f16511m;

    /* renamed from: n */
    public AbstractC11919zO0 f16512n;

    /* renamed from: o */
    public final ArrayList f16513o;

    /* renamed from: p */
    public final ArrayList f16514p;

    /* renamed from: q */
    public final ArrayList f16515q;

    /* renamed from: q1 */
    public RunnableC9311f00 f16516q1;

    /* renamed from: r */
    public C0344FS f16517r;

    /* renamed from: r1 */
    public final C6327ks f16518r1;

    /* renamed from: s */
    public boolean f16519s;

    /* renamed from: s1 */
    public final KO0 f16520s1;

    /* renamed from: t */
    public boolean f16521t;

    /* renamed from: t1 */
    public CO0 f16522t1;

    /* renamed from: u */
    public boolean f16523u;

    /* renamed from: u1 */
    public ArrayList f16524u1;

    /* renamed from: v */
    public int f16525v;

    /* renamed from: v1 */
    public boolean f16526v1;

    /* renamed from: w */
    public boolean f16527w;

    /* renamed from: w1 */
    public boolean f16528w1;

    /* renamed from: x */
    public boolean f16529x;

    /* renamed from: x1 */
    public final C9432fw1 f16530x1;

    /* renamed from: y */
    public boolean f16531y;

    /* renamed from: y1 */
    public boolean f16532y1;

    /* renamed from: z */
    public int f16533z;

    /* renamed from: z1 */
    public QO0 f16534z1;

    static {
        Class cls = Integer.TYPE;
        f16457S1 = new Class[]{Context.class, AttributeSet.class, cls, cls};
        f16458T1 = new InterpolatorC10771qO0(0);
        f16459U1 = new LO0();
    }

    public RecyclerView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, ru.mes.dnevnik.R.attr.recyclerViewStyle);
    }

    /* renamed from: H */
    public static RecyclerView m10225H(View view) {
        if (!(view instanceof ViewGroup)) {
            return null;
        }
        if (view instanceof RecyclerView) {
            return (RecyclerView) view;
        }
        ViewGroup viewGroup = (ViewGroup) view;
        int childCount = viewGroup.getChildCount();
        for (int i = 0; i < childCount; i++) {
            RecyclerView recyclerViewM10225H = m10225H(viewGroup.getChildAt(i));
            if (recyclerViewM10225H != null) {
                return recyclerViewM10225H;
            }
        }
        return null;
    }

    /* renamed from: M */
    public static OO0 m10226M(View view) {
        if (view == null) {
            return null;
        }
        return ((AO0) view.getLayoutParams()).f182a;
    }

    private C7666Gu0 getScrollingChildHelper() {
        if (this.f16463B1 == null) {
            this.f16463B1 = new C7666Gu0(this);
        }
        return this.f16463B1;
    }

    /* renamed from: l */
    public static void m10233l(OO0 oo0) {
        WeakReference weakReference = oo0.f8409b;
        if (weakReference != null) {
            View view = (View) weakReference.get();
            while (view != null) {
                if (view == oo0.f8408a) {
                    return;
                }
                Object parent = view.getParent();
                view = parent instanceof View ? (View) parent : null;
            }
            oo0.f8409b = null;
        }
    }

    /* renamed from: o */
    public static int m10234o(int i, EdgeEffect edgeEffect, EdgeEffect edgeEffect2, int i2) {
        if (i > 0 && edgeEffect != null && AbstractC10849r02.m24144b(edgeEffect) != 0.0f) {
            int iRound = Math.round(AbstractC10849r02.m24146d(edgeEffect, ((-i) * 4.0f) / i2, 0.5f) * ((-i2) / 4.0f));
            if (iRound != i) {
                edgeEffect.finish();
            }
            return i - iRound;
        }
        if (i >= 0 || edgeEffect2 == null || AbstractC10849r02.m24144b(edgeEffect2) == 0.0f) {
            return i;
        }
        float f = i2;
        int iRound2 = Math.round(AbstractC10849r02.m24146d(edgeEffect2, (i * 4.0f) / f, 0.5f) * (f / 4.0f));
        if (iRound2 != i) {
            edgeEffect2.finish();
        }
        return i - iRound2;
    }

    public static void setDebugAssertionsEnabled(boolean z) {
        f16450L1 = z;
    }

    public static void setVerboseLoggingEnabled(boolean z) {
        f16451M1 = z;
    }

    /* renamed from: A */
    public final void m10235A() {
        if (this.f16480K != null) {
            return;
        }
        ((LO0) this.f16474H).getClass();
        EdgeEffect edgeEffect = new EdgeEffect(getContext());
        this.f16480K = edgeEffect;
        if (this.f16506h) {
            edgeEffect.setSize((getMeasuredHeight() - getPaddingTop()) - getPaddingBottom(), (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight());
        } else {
            edgeEffect.setSize(getMeasuredHeight(), getMeasuredWidth());
        }
    }

    /* renamed from: B */
    public final void m10236B() {
        if (this.f16478J != null) {
            return;
        }
        ((LO0) this.f16474H).getClass();
        EdgeEffect edgeEffect = new EdgeEffect(getContext());
        this.f16478J = edgeEffect;
        if (this.f16506h) {
            edgeEffect.setSize((getMeasuredWidth() - getPaddingLeft()) - getPaddingRight(), (getMeasuredHeight() - getPaddingTop()) - getPaddingBottom());
        } else {
            edgeEffect.setSize(getMeasuredWidth(), getMeasuredHeight());
        }
    }

    /* renamed from: C */
    public final String m10237C() {
        return " " + super.toString() + ", adapter:" + this.f16511m + ", layout:" + this.f16512n + ", context:" + getContext();
    }

    /* renamed from: D */
    public final void m10238D(KO0 ko0) {
        if (getScrollState() != 2) {
            ko0.getClass();
            return;
        }
        OverScroller overScroller = this.f16503e0.f7749c;
        overScroller.getFinalX();
        overScroller.getCurrX();
        ko0.getClass();
        overScroller.getFinalY();
        overScroller.getCurrY();
    }

    /* renamed from: E */
    public final View m10239E(View view) {
        ViewParent parent = view.getParent();
        while (parent != null && parent != this && (parent instanceof View)) {
            view = parent;
            parent = view.getParent();
        }
        if (parent == this) {
            return view;
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:50:0x005e A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0061 A[SYNTHETIC] */
    /* renamed from: F */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean m10240F(android.view.MotionEvent r12) {
        /*
            r11 = this;
            int r0 = r12.getAction()
            java.util.ArrayList r1 = r11.f16515q
            int r2 = r1.size()
            r3 = 0
            r4 = r3
        Lc:
            if (r4 >= r2) goto L64
            java.lang.Object r5 = r1.get(r4)
            FS r5 = (p000.C0344FS) r5
            int r6 = r5.f3251v
            r7 = 1
            r8 = 2
            if (r6 != r7) goto L59
            float r6 = r12.getX()
            float r9 = r12.getY()
            boolean r6 = r5.m2658d(r6, r9)
            float r9 = r12.getX()
            float r10 = r12.getY()
            boolean r9 = r5.m2657c(r9, r10)
            int r10 = r12.getAction()
            if (r10 != 0) goto L61
            if (r6 != 0) goto L3c
            if (r9 == 0) goto L61
        L3c:
            if (r9 == 0) goto L49
            r5.f3252w = r7
            float r6 = r12.getX()
            int r6 = (int) r6
            float r6 = (float) r6
            r5.f3245p = r6
            goto L55
        L49:
            if (r6 == 0) goto L55
            r5.f3252w = r8
            float r6 = r12.getY()
            int r6 = (int) r6
            float r6 = (float) r6
            r5.f3242m = r6
        L55:
            r5.m2659f(r8)
            goto L5b
        L59:
            if (r6 != r8) goto L61
        L5b:
            r6 = 3
            if (r0 == r6) goto L61
            r11.f16517r = r5
            return r7
        L61:
            int r4 = r4 + 1
            goto Lc
        L64:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.m10240F(android.view.MotionEvent):boolean");
    }

    /* renamed from: G */
    public final void m10241G(int[] iArr) {
        int iM22557O = this.f16504f.m22557O();
        if (iM22557O == 0) {
            iArr[0] = -1;
            iArr[1] = -1;
            return;
        }
        int i = Integer.MAX_VALUE;
        int i2 = Integer.MIN_VALUE;
        for (int i3 = 0; i3 < iM22557O; i3++) {
            OO0 oo0M10226M = m10226M(this.f16504f.m22556N(i3));
            if (!oo0M10226M.m6059p()) {
                int iM6045b = oo0M10226M.m6045b();
                if (iM6045b < i) {
                    i = iM6045b;
                }
                if (iM6045b > i2) {
                    i2 = iM6045b;
                }
            }
        }
        iArr[0] = i;
        iArr[1] = i2;
    }

    /* renamed from: I */
    public final OO0 m10242I(int i) {
        OO0 oo0 = null;
        if (this.f16466D) {
            return null;
        }
        int iM22561T = this.f16504f.m22561T();
        for (int i2 = 0; i2 < iM22561T; i2++) {
            OO0 oo0M10226M = m10226M(this.f16504f.m22560S(i2));
            if (oo0M10226M != null && !oo0M10226M.m6052i() && m10243J(oo0M10226M) == i) {
                if (!((ArrayList) this.f16504f.f37325d).contains(oo0M10226M.f8408a)) {
                    return oo0M10226M;
                }
                oo0 = oo0M10226M;
            }
        }
        return oo0;
    }

    /* renamed from: J */
    public final int m10243J(OO0 oo0) {
        if (oo0.m6047d(524) || !oo0.m6049f()) {
            return -1;
        }
        C4218i3 c4218i3 = this.f16502e;
        int i = oo0.f8410c;
        ArrayList arrayList = (ArrayList) c4218i3.f28783c;
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            C4155h3 c4155h3 = (C4155h3) arrayList.get(i2);
            int i3 = c4155h3.f28181a;
            if (i3 != 1) {
                if (i3 == 2) {
                    int i4 = c4155h3.f28182b;
                    if (i4 <= i) {
                        int i5 = c4155h3.f28183c;
                        if (i4 + i5 > i) {
                            return -1;
                        }
                        i -= i5;
                    } else {
                        continue;
                    }
                } else if (i3 == 8) {
                    int i6 = c4155h3.f28182b;
                    if (i6 == i) {
                        i = c4155h3.f28183c;
                    } else {
                        if (i6 < i) {
                            i--;
                        }
                        if (c4155h3.f28183c <= i) {
                            i++;
                        }
                    }
                }
            } else if (c4155h3.f28182b <= i) {
                i += c4155h3.f28183c;
            }
        }
        return i;
    }

    /* renamed from: K */
    public final long m10244K(OO0 oo0) {
        return this.f16511m.f41642b ? oo0.f8412e : oo0.f8410c;
    }

    /* renamed from: L */
    public final OO0 m10245L(View view) {
        ViewParent parent = view.getParent();
        if (parent == null || parent == this) {
            return m10226M(view);
        }
        throw new IllegalArgumentException("View " + view + " is not a direct child of " + this);
    }

    /* renamed from: N */
    public final Rect m10246N(View view) {
        AO0 ao0 = (AO0) view.getLayoutParams();
        boolean z = ao0.f184c;
        Rect rect = ao0.f183b;
        if (!z) {
            return rect;
        }
        if (this.f16520s1.f6051g && (ao0.f182a.m6055l() || ao0.f182a.m6050g())) {
            return rect;
        }
        rect.set(0, 0, 0, 0);
        ArrayList arrayList = this.f16514p;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            Rect rect2 = this.f16508j;
            rect2.set(0, 0, 0, 0);
            ((AbstractC11665xO0) arrayList.get(i)).getClass();
            ((AO0) view.getLayoutParams()).f182a.getClass();
            rect2.set(0, 0, 0, 0);
            rect.left += rect2.left;
            rect.top += rect2.top;
            rect.right += rect2.right;
            rect.bottom += rect2.bottom;
        }
        ao0.f184c = false;
        return rect;
    }

    /* renamed from: O */
    public final boolean m10247O() {
        return !this.f16523u || this.f16466D || this.f16502e.m18946k();
    }

    /* renamed from: P */
    public final boolean m10248P() {
        return this.f16470F > 0;
    }

    /* renamed from: Q */
    public final void m10249Q(int i) {
        if (this.f16512n == null) {
            return;
        }
        setScrollState(2);
        this.f16512n.mo10223q0(i);
        awakenScrollBars();
    }

    /* renamed from: R */
    public final void m10250R() {
        int iM22561T = this.f16504f.m22561T();
        for (int i = 0; i < iM22561T; i++) {
            ((AO0) this.f16504f.m22560S(i).getLayoutParams()).f184c = true;
        }
        ArrayList arrayList = this.f16498c.f3194c;
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            AO0 ao0 = (AO0) ((OO0) arrayList.get(i2)).f8408a.getLayoutParams();
            if (ao0 != null) {
                ao0.f184c = true;
            }
        }
    }

    /* renamed from: S */
    public final void m10251S(int i, int i2, boolean z) {
        int i3 = i + i2;
        int iM22561T = this.f16504f.m22561T();
        for (int i4 = 0; i4 < iM22561T; i4++) {
            OO0 oo0M10226M = m10226M(this.f16504f.m22560S(i4));
            if (oo0M10226M != null && !oo0M10226M.m6059p()) {
                int i5 = oo0M10226M.f8410c;
                KO0 ko0 = this.f16520s1;
                if (i5 >= i3) {
                    if (f16451M1) {
                        oo0M10226M.toString();
                    }
                    oo0M10226M.m6056m(-i2, z);
                    ko0.f6050f = true;
                } else if (i5 >= i) {
                    if (f16451M1) {
                        oo0M10226M.toString();
                    }
                    oo0M10226M.m6044a(8);
                    oo0M10226M.m6056m(-i2, z);
                    oo0M10226M.f8410c = i - 1;
                    ko0.f6050f = true;
                }
            }
        }
        FO0 fo0 = this.f16498c;
        ArrayList arrayList = fo0.f3194c;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            OO0 oo0 = (OO0) arrayList.get(size);
            if (oo0 != null) {
                int i6 = oo0.f8410c;
                if (i6 >= i3) {
                    if (f16451M1) {
                        oo0.toString();
                    }
                    oo0.m6056m(-i2, z);
                } else if (i6 >= i) {
                    oo0.m6044a(8);
                    fo0.m2624g(size);
                }
            }
        }
        requestLayout();
    }

    /* renamed from: T */
    public final void m10252T() {
        this.f16470F++;
    }

    /* renamed from: U */
    public final void m10253U(boolean z) {
        int i;
        AccessibilityManager accessibilityManager;
        int i2 = this.f16470F - 1;
        this.f16470F = i2;
        if (i2 < 1) {
            if (f16450L1 && i2 < 0) {
                throw new IllegalStateException(AbstractC1374Vq.m8587f(this, new StringBuilder("layout or scroll counter cannot go below zero.Some calls are not matching")));
            }
            this.f16470F = 0;
            if (z) {
                int i3 = this.f16533z;
                this.f16533z = 0;
                if (i3 != 0 && (accessibilityManager = this.f16462B) != null && accessibilityManager.isEnabled()) {
                    AccessibilityEvent accessibilityEventObtain = AccessibilityEvent.obtain();
                    accessibilityEventObtain.setEventType(2048);
                    accessibilityEventObtain.setContentChangeTypes(i3);
                    sendAccessibilityEventUnchecked(accessibilityEventObtain);
                }
                ArrayList arrayList = this.f16471F1;
                for (int size = arrayList.size() - 1; size >= 0; size--) {
                    OO0 oo0 = (OO0) arrayList.get(size);
                    if (oo0.f8408a.getParent() == this && !oo0.m6059p() && (i = oo0.f8424q) != -1) {
                        WeakHashMap weakHashMap = AbstractC10944rk1.f41842a;
                        oo0.f8408a.setImportantForAccessibility(i);
                        oo0.f8424q = -1;
                    }
                }
                arrayList.clear();
            }
        }
    }

    /* renamed from: V */
    public final void m10254V(MotionEvent motionEvent) {
        int actionIndex = motionEvent.getActionIndex();
        if (motionEvent.getPointerId(actionIndex) == this.f16485O) {
            int i = actionIndex == 0 ? 1 : 0;
            this.f16485O = motionEvent.getPointerId(i);
            int x = (int) (motionEvent.getX(i) + 0.5f);
            this.f16489S = x;
            this.f16487Q = x;
            int y = (int) (motionEvent.getY(i) + 0.5f);
            this.f16490T = y;
            this.f16488R = y;
        }
    }

    /* renamed from: W */
    public final void m10255W() {
        if (this.f16532y1 || !this.f16519s) {
            return;
        }
        WeakHashMap weakHashMap = AbstractC10944rk1.f41842a;
        postOnAnimation(this.f16473G1);
        this.f16532y1 = true;
    }

    /* renamed from: X */
    public final void m10256X() {
        boolean z;
        boolean z2 = false;
        if (this.f16466D) {
            C4218i3 c4218i3 = this.f16502e;
            c4218i3.m18954s((ArrayList) c4218i3.f28783c);
            c4218i3.m18954s((ArrayList) c4218i3.f28784d);
            c4218i3.f28781a = 0;
            if (this.f16468E) {
                this.f16512n.mo10157Z();
            }
        }
        if (this.f16483M == null || !this.f16512n.mo10147C0()) {
            this.f16502e.m18940d();
        } else {
            this.f16502e.m18953r();
        }
        boolean z3 = this.f16526v1 || this.f16528w1;
        boolean z4 = this.f16523u && this.f16483M != null && ((z = this.f16466D) || z3 || this.f16512n.f46818f) && (!z || this.f16511m.f41642b);
        KO0 ko0 = this.f16520s1;
        ko0.f6054j = z4;
        if (z4 && z3 && !this.f16466D && this.f16483M != null && this.f16512n.mo10147C0()) {
            z2 = true;
        }
        ko0.f6055k = z2;
    }

    /* renamed from: Y */
    public final void m10257Y(boolean z) {
        this.f16468E = z | this.f16468E;
        this.f16466D = true;
        int iM22561T = this.f16504f.m22561T();
        for (int i = 0; i < iM22561T; i++) {
            OO0 oo0M10226M = m10226M(this.f16504f.m22560S(i));
            if (oo0M10226M != null && !oo0M10226M.m6059p()) {
                oo0M10226M.m6044a(6);
            }
        }
        m10250R();
        FO0 fo0 = this.f16498c;
        ArrayList arrayList = fo0.f3194c;
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            OO0 oo0 = (OO0) arrayList.get(i2);
            if (oo0 != null) {
                oo0.m6044a(6);
                oo0.m6044a(1024);
            }
        }
        AbstractC10899rO0 abstractC10899rO0 = fo0.f3199h.f16511m;
        if (abstractC10899rO0 == null || !abstractC10899rO0.f41642b) {
            fo0.m2623f();
        }
    }

    /* renamed from: Z */
    public final void m10258Z(OO0 oo0, C11649xG0 c11649xG0) {
        oo0.f8417j &= -8193;
        boolean z = this.f16520s1.f6052h;
        C7967Mo1 c7967Mo1 = this.f16505g;
        if (z && oo0.m6055l() && !oo0.m6052i() && !oo0.m6059p()) {
            ((C7544El0) c7967Mo1.f7363b).m2383k(m10244K(oo0), oo0);
        }
        L01 l01 = (L01) c7967Mo1.f7362a;
        C7387Bk1 c7387Bk1M850a = (C7387Bk1) l01.getOrDefault(oo0, null);
        if (c7387Bk1M850a == null) {
            c7387Bk1M850a = C7387Bk1.m850a();
            l01.put(oo0, c7387Bk1M850a);
        }
        c7387Bk1M850a.f1007b = c11649xG0;
        c7387Bk1M850a.f1006a |= 4;
    }

    /* renamed from: a0 */
    public final int m10259a0(float f, int i) {
        float height = f / getHeight();
        float width = i / getWidth();
        EdgeEffect edgeEffect = this.f16476I;
        float f2 = 0.0f;
        if (edgeEffect == null || AbstractC10849r02.m24144b(edgeEffect) == 0.0f) {
            EdgeEffect edgeEffect2 = this.f16480K;
            if (edgeEffect2 != null && AbstractC10849r02.m24144b(edgeEffect2) != 0.0f) {
                if (canScrollHorizontally(1)) {
                    this.f16480K.onRelease();
                } else {
                    float fM24146d = AbstractC10849r02.m24146d(this.f16480K, width, height);
                    if (AbstractC10849r02.m24144b(this.f16480K) == 0.0f) {
                        this.f16480K.onRelease();
                    }
                    f2 = fM24146d;
                }
                invalidate();
            }
        } else {
            if (canScrollHorizontally(-1)) {
                this.f16476I.onRelease();
            } else {
                float f3 = -AbstractC10849r02.m24146d(this.f16476I, -width, 1.0f - height);
                if (AbstractC10849r02.m24144b(this.f16476I) == 0.0f) {
                    this.f16476I.onRelease();
                }
                f2 = f3;
            }
            invalidate();
        }
        return Math.round(f2 * getWidth());
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void addFocusables(ArrayList arrayList, int i, int i2) {
        AbstractC11919zO0 abstractC11919zO0 = this.f16512n;
        if (abstractC11919zO0 != null) {
            abstractC11919zO0.getClass();
        }
        super.addFocusables(arrayList, i, i2);
    }

    /* renamed from: b0 */
    public final int m10260b0(float f, int i) {
        float width = f / getWidth();
        float height = i / getHeight();
        EdgeEffect edgeEffect = this.f16478J;
        float f2 = 0.0f;
        if (edgeEffect == null || AbstractC10849r02.m24144b(edgeEffect) == 0.0f) {
            EdgeEffect edgeEffect2 = this.f16482L;
            if (edgeEffect2 != null && AbstractC10849r02.m24144b(edgeEffect2) != 0.0f) {
                if (canScrollVertically(1)) {
                    this.f16482L.onRelease();
                } else {
                    float fM24146d = AbstractC10849r02.m24146d(this.f16482L, height, 1.0f - width);
                    if (AbstractC10849r02.m24144b(this.f16482L) == 0.0f) {
                        this.f16482L.onRelease();
                    }
                    f2 = fM24146d;
                }
                invalidate();
            }
        } else {
            if (canScrollVertically(-1)) {
                this.f16478J.onRelease();
            } else {
                float f3 = -AbstractC10849r02.m24146d(this.f16478J, -height, width);
                if (AbstractC10849r02.m24144b(this.f16478J) == 0.0f) {
                    this.f16478J.onRelease();
                }
                f2 = f3;
            }
            invalidate();
        }
        return Math.round(f2 * getHeight());
    }

    /* renamed from: c0 */
    public final void m10261c0(View view, View view2) {
        View view3 = view2 != null ? view2 : view;
        int width = view3.getWidth();
        int height = view3.getHeight();
        Rect rect = this.f16508j;
        rect.set(0, 0, width, height);
        ViewGroup.LayoutParams layoutParams = view3.getLayoutParams();
        if (layoutParams instanceof AO0) {
            AO0 ao0 = (AO0) layoutParams;
            if (!ao0.f184c) {
                int i = rect.left;
                Rect rect2 = ao0.f183b;
                rect.left = i - rect2.left;
                rect.right += rect2.right;
                rect.top -= rect2.top;
                rect.bottom += rect2.bottom;
            }
        }
        if (view2 != null) {
            offsetDescendantRectToMyCoords(view2, rect);
            offsetRectIntoDescendantCoords(view, rect);
        }
        this.f16512n.mo11228n0(this, view, this.f16508j, !this.f16523u, view2 == null);
    }

    @Override // android.view.ViewGroup
    public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return (layoutParams instanceof AO0) && this.f16512n.mo10164f((AO0) layoutParams);
    }

    @Override // android.view.View, androidx.core.view.ScrollingView
    public final int computeHorizontalScrollExtent() {
        AbstractC11919zO0 abstractC11919zO0 = this.f16512n;
        if (abstractC11919zO0 != null && abstractC11919zO0.mo10210d()) {
            return this.f16512n.mo10220j(this.f16520s1);
        }
        return 0;
    }

    @Override // android.view.View, androidx.core.view.ScrollingView
    public final int computeHorizontalScrollOffset() {
        AbstractC11919zO0 abstractC11919zO0 = this.f16512n;
        if (abstractC11919zO0 != null && abstractC11919zO0.mo10210d()) {
            return this.f16512n.mo10167k(this.f16520s1);
        }
        return 0;
    }

    @Override // android.view.View, androidx.core.view.ScrollingView
    public final int computeHorizontalScrollRange() {
        AbstractC11919zO0 abstractC11919zO0 = this.f16512n;
        if (abstractC11919zO0 != null && abstractC11919zO0.mo10210d()) {
            return this.f16512n.mo10169l(this.f16520s1);
        }
        return 0;
    }

    @Override // android.view.View, androidx.core.view.ScrollingView
    public final int computeVerticalScrollExtent() {
        AbstractC11919zO0 abstractC11919zO0 = this.f16512n;
        if (abstractC11919zO0 != null && abstractC11919zO0.mo10212e()) {
            return this.f16512n.mo10221m(this.f16520s1);
        }
        return 0;
    }

    @Override // android.view.View, androidx.core.view.ScrollingView
    public final int computeVerticalScrollOffset() {
        AbstractC11919zO0 abstractC11919zO0 = this.f16512n;
        if (abstractC11919zO0 != null && abstractC11919zO0.mo10212e()) {
            return this.f16512n.mo10172n(this.f16520s1);
        }
        return 0;
    }

    @Override // android.view.View, androidx.core.view.ScrollingView
    public final int computeVerticalScrollRange() {
        AbstractC11919zO0 abstractC11919zO0 = this.f16512n;
        if (abstractC11919zO0 != null && abstractC11919zO0.mo10212e()) {
            return this.f16512n.mo10174o(this.f16520s1);
        }
        return 0;
    }

    /* renamed from: d0 */
    public final void m10262d0() {
        VelocityTracker velocityTracker = this.f16486P;
        if (velocityTracker != null) {
            velocityTracker.clear();
        }
        boolean zIsFinished = false;
        m10274l0(0);
        EdgeEffect edgeEffect = this.f16476I;
        if (edgeEffect != null) {
            edgeEffect.onRelease();
            zIsFinished = this.f16476I.isFinished();
        }
        EdgeEffect edgeEffect2 = this.f16478J;
        if (edgeEffect2 != null) {
            edgeEffect2.onRelease();
            zIsFinished |= this.f16478J.isFinished();
        }
        EdgeEffect edgeEffect3 = this.f16480K;
        if (edgeEffect3 != null) {
            edgeEffect3.onRelease();
            zIsFinished |= this.f16480K.isFinished();
        }
        EdgeEffect edgeEffect4 = this.f16482L;
        if (edgeEffect4 != null) {
            edgeEffect4.onRelease();
            zIsFinished |= this.f16482L.isFinished();
        }
        if (zIsFinished) {
            WeakHashMap weakHashMap = AbstractC10944rk1.f41842a;
            postInvalidateOnAnimation();
        }
    }

    @Override // android.view.View
    public final boolean dispatchNestedFling(float f, float f2, boolean z) {
        return getScrollingChildHelper().m3191a(f, f2, z);
    }

    @Override // android.view.View
    public final boolean dispatchNestedPreFling(float f, float f2) {
        return getScrollingChildHelper().m3192b(f, f2);
    }

    @Override // android.view.View
    public final boolean dispatchNestedPreScroll(int i, int i2, int[] iArr, int[] iArr2) {
        return getScrollingChildHelper().m3193c(i, i2, 0, iArr, iArr2);
    }

    @Override // android.view.View
    public final boolean dispatchNestedScroll(int i, int i2, int i3, int i4, int[] iArr) {
        return getScrollingChildHelper().m3194d(i, i2, i3, i4, iArr, 0, null);
    }

    @Override // android.view.View
    public final boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        onPopulateAccessibilityEvent(accessibilityEvent);
        return true;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchRestoreInstanceState(SparseArray sparseArray) {
        dispatchThawSelfOnly(sparseArray);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchSaveInstanceState(SparseArray sparseArray) {
        dispatchFreezeSelfOnly(sparseArray);
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
        boolean z;
        super.draw(canvas);
        ArrayList arrayList = this.f16514p;
        int size = arrayList.size();
        boolean z2 = false;
        for (int i = 0; i < size; i++) {
            ((AbstractC11665xO0) arrayList.get(i)).mo2656b(canvas, this);
        }
        EdgeEffect edgeEffect = this.f16476I;
        if (edgeEffect == null || edgeEffect.isFinished()) {
            z = false;
        } else {
            int iSave = canvas.save();
            int paddingBottom = this.f16506h ? getPaddingBottom() : 0;
            canvas.rotate(270.0f);
            canvas.translate((-getHeight()) + paddingBottom, 0.0f);
            EdgeEffect edgeEffect2 = this.f16476I;
            z = edgeEffect2 != null && edgeEffect2.draw(canvas);
            canvas.restoreToCount(iSave);
        }
        EdgeEffect edgeEffect3 = this.f16478J;
        if (edgeEffect3 != null && !edgeEffect3.isFinished()) {
            int iSave2 = canvas.save();
            if (this.f16506h) {
                canvas.translate(getPaddingLeft(), getPaddingTop());
            }
            EdgeEffect edgeEffect4 = this.f16478J;
            z |= edgeEffect4 != null && edgeEffect4.draw(canvas);
            canvas.restoreToCount(iSave2);
        }
        EdgeEffect edgeEffect5 = this.f16480K;
        if (edgeEffect5 != null && !edgeEffect5.isFinished()) {
            int iSave3 = canvas.save();
            int width = getWidth();
            int paddingTop = this.f16506h ? getPaddingTop() : 0;
            canvas.rotate(90.0f);
            canvas.translate(paddingTop, -width);
            EdgeEffect edgeEffect6 = this.f16480K;
            z |= edgeEffect6 != null && edgeEffect6.draw(canvas);
            canvas.restoreToCount(iSave3);
        }
        EdgeEffect edgeEffect7 = this.f16482L;
        if (edgeEffect7 != null && !edgeEffect7.isFinished()) {
            int iSave4 = canvas.save();
            canvas.rotate(180.0f);
            if (this.f16506h) {
                canvas.translate(getPaddingRight() + (-getWidth()), getPaddingBottom() + (-getHeight()));
            } else {
                canvas.translate(-getWidth(), -getHeight());
            }
            EdgeEffect edgeEffect8 = this.f16482L;
            if (edgeEffect8 != null && edgeEffect8.draw(canvas)) {
                z2 = true;
            }
            z |= z2;
            canvas.restoreToCount(iSave4);
        }
        if ((z || this.f16483M == null || arrayList.size() <= 0 || !this.f16483M.mo8956f()) ? z : true) {
            WeakHashMap weakHashMap = AbstractC10944rk1.f41842a;
            postInvalidateOnAnimation();
        }
    }

    @Override // android.view.ViewGroup
    public final boolean drawChild(Canvas canvas, View view, long j) {
        return super.drawChild(canvas, view, j);
    }

    /* JADX WARN: Removed duplicated region for block: B:88:0x00d5  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x00ec  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0109  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0111  */
    /* renamed from: e0 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean m10263e0(int r19, int r20, android.view.MotionEvent r21, int r22) {
        /*
            Method dump skipped, instructions count: 308
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.m10263e0(int, int, android.view.MotionEvent, int):boolean");
    }

    /* renamed from: f0 */
    public final void m10264f0(int i, int i2, int[] iArr) {
        OO0 oo0;
        C10189lr0 c10189lr0 = this.f16504f;
        m10271j0();
        m10252T();
        int i3 = AbstractC7421Cb1.f1471a;
        Trace.beginSection("RV Scroll");
        KO0 ko0 = this.f16520s1;
        m10238D(ko0);
        FO0 fo0 = this.f16498c;
        int iMo10176p0 = i != 0 ? this.f16512n.mo10176p0(i, fo0, ko0) : 0;
        int iMo10180r0 = i2 != 0 ? this.f16512n.mo10180r0(i2, fo0, ko0) : 0;
        Trace.endSection();
        int iM22557O = c10189lr0.m22557O();
        for (int i4 = 0; i4 < iM22557O; i4++) {
            View viewM22556N = c10189lr0.m22556N(i4);
            OO0 oo0M10245L = m10245L(viewM22556N);
            if (oo0M10245L != null && (oo0 = oo0M10245L.f8416i) != null) {
                int left = viewM22556N.getLeft();
                int top = viewM22556N.getTop();
                View view = oo0.f8408a;
                if (left != view.getLeft() || top != view.getTop()) {
                    view.layout(left, top, view.getWidth() + left, view.getHeight() + top);
                }
            }
        }
        m10253U(true);
        m10273k0(false);
        if (iArr != null) {
            iArr[0] = iMo10176p0;
            iArr[1] = iMo10180r0;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:166:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:172:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:173:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:175:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:176:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:179:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:180:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:183:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:184:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:186:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:278:0x0190  */
    @Override // android.view.ViewGroup, android.view.ViewParent
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final android.view.View focusSearch(android.view.View r17, int r18) {
        /*
            Method dump skipped, instructions count: 409
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.focusSearch(android.view.View, int):android.view.View");
    }

    /* renamed from: g0 */
    public final void m10265g0(int i) {
        C8760aj0 c8760aj0;
        if (this.f16529x) {
            return;
        }
        setScrollState(0);
        NO0 no0 = this.f16503e0;
        no0.f7753g.removeCallbacks(no0);
        no0.f7749c.abortAnimation();
        AbstractC11919zO0 abstractC11919zO0 = this.f16512n;
        if (abstractC11919zO0 != null && (c8760aj0 = abstractC11919zO0.f46817e) != null) {
            c8760aj0.m9797i();
        }
        AbstractC11919zO0 abstractC11919zO02 = this.f16512n;
        if (abstractC11919zO02 == null) {
            return;
        }
        abstractC11919zO02.mo10223q0(i);
        awakenScrollBars();
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateDefaultLayoutParams() {
        AbstractC11919zO0 abstractC11919zO0 = this.f16512n;
        if (abstractC11919zO0 != null) {
            return abstractC11919zO0.mo10179r();
        }
        throw new IllegalStateException(AbstractC1374Vq.m8587f(this, new StringBuilder("RecyclerView has no LayoutManager")));
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        AbstractC11919zO0 abstractC11919zO0 = this.f16512n;
        if (abstractC11919zO0 != null) {
            return abstractC11919zO0.mo10181s(getContext(), attributeSet);
        }
        throw new IllegalStateException(AbstractC1374Vq.m8587f(this, new StringBuilder("RecyclerView has no LayoutManager")));
    }

    @Override // android.view.ViewGroup, android.view.View
    public CharSequence getAccessibilityClassName() {
        return "androidx.recyclerview.widget.RecyclerView";
    }

    public AbstractC10899rO0 getAdapter() {
        return this.f16511m;
    }

    @Override // android.view.View
    public int getBaseline() {
        AbstractC11919zO0 abstractC11919zO0 = this.f16512n;
        if (abstractC11919zO0 == null) {
            return super.getBaseline();
        }
        abstractC11919zO0.getClass();
        return -1;
    }

    @Override // android.view.ViewGroup
    public final int getChildDrawingOrder(int i, int i2) {
        return super.getChildDrawingOrder(i, i2);
    }

    @Override // android.view.ViewGroup
    public boolean getClipToPadding() {
        return this.f16506h;
    }

    public QO0 getCompatAccessibilityDelegate() {
        return this.f16534z1;
    }

    public AbstractC11411vO0 getEdgeEffectFactory() {
        return this.f16474H;
    }

    public AbstractC11538wO0 getItemAnimator() {
        return this.f16483M;
    }

    public int getItemDecorationCount() {
        return this.f16514p.size();
    }

    public AbstractC11919zO0 getLayoutManager() {
        return this.f16512n;
    }

    public int getMaxFlingVelocity() {
        return this.f16495a0;
    }

    public int getMinFlingVelocity() {
        return this.f16493W;
    }

    public long getNanoTime() {
        if (f16456R1) {
            return System.nanoTime();
        }
        return 0L;
    }

    public BO0 getOnFlingListener() {
        return this.f16492V;
    }

    public boolean getPreserveFocusAfterLayout() {
        return this.f16501d0;
    }

    public EO0 getRecycledViewPool() {
        return this.f16498c.m2620c();
    }

    public int getScrollState() {
        return this.f16484N;
    }

    /* renamed from: h */
    public final void m10266h(OO0 oo0) {
        View view = oo0.f8408a;
        boolean z = view.getParent() == this;
        this.f16498c.m2629l(m10245L(view));
        if (oo0.m6054k()) {
            this.f16504f.m22546C(view, -1, view.getLayoutParams(), true);
            return;
        }
        if (!z) {
            this.f16504f.m22544A(-1, view, true);
            return;
        }
        C10189lr0 c10189lr0 = this.f16504f;
        int iIndexOfChild = ((RecyclerView) ((C9196e41) c10189lr0.f37323b).f26532b).indexOfChild(view);
        if (iIndexOfChild >= 0) {
            ((C0495Hr) c10189lr0.f37324c).m3610B(iIndexOfChild);
            c10189lr0.m22563V(view);
        } else {
            throw new IllegalArgumentException("view is not a child, cannot hide " + view);
        }
    }

    /* renamed from: h0 */
    public final boolean m10267h0(EdgeEffect edgeEffect, int i, int i2) {
        if (i > 0) {
            return true;
        }
        float fM24144b = AbstractC10849r02.m24144b(edgeEffect) * i2;
        float fAbs = Math.abs(-i) * 0.35f;
        float f = this.f16494a * 0.015f;
        double dLog = Math.log(fAbs / f);
        double d = f16453O1;
        return ((float) (Math.exp((d / (d - 1.0d)) * dLog) * ((double) f))) < fM24144b;
    }

    @Override // android.view.View
    public final boolean hasNestedScrollingParent() {
        return getScrollingChildHelper().m3196f(0);
    }

    /* renamed from: i */
    public final void m10268i(AbstractC11665xO0 abstractC11665xO0) {
        AbstractC11919zO0 abstractC11919zO0 = this.f16512n;
        if (abstractC11919zO0 != null) {
            abstractC11919zO0.mo10208c("Cannot add item decoration during a scroll  or layout");
        }
        ArrayList arrayList = this.f16514p;
        if (arrayList.isEmpty()) {
            setWillNotDraw(false);
        }
        arrayList.add(abstractC11665xO0);
        m10250R();
        requestLayout();
    }

    /* renamed from: i0 */
    public final void m10269i0(int i, int i2, boolean z) {
        AbstractC11919zO0 abstractC11919zO0 = this.f16512n;
        if (abstractC11919zO0 == null || this.f16529x) {
            return;
        }
        if (!abstractC11919zO0.mo10210d()) {
            i = 0;
        }
        if (!this.f16512n.mo10212e()) {
            i2 = 0;
        }
        if (i == 0 && i2 == 0) {
            return;
        }
        if (z) {
            int i3 = i != 0 ? 1 : 0;
            if (i2 != 0) {
                i3 |= 2;
            }
            getScrollingChildHelper().m3197g(i3, 1);
        }
        this.f16503e0.m5670c(i, i2, Integer.MIN_VALUE, null);
    }

    @Override // android.view.View
    public final boolean isAttachedToWindow() {
        return this.f16519s;
    }

    @Override // android.view.ViewGroup
    public final boolean isLayoutSuppressed() {
        return this.f16529x;
    }

    @Override // android.view.View
    public final boolean isNestedScrollingEnabled() {
        return getScrollingChildHelper().f3954d;
    }

    /* renamed from: j */
    public final void m10270j(CO0 co0) {
        if (this.f16524u1 == null) {
            this.f16524u1 = new ArrayList();
        }
        this.f16524u1.add(co0);
    }

    /* renamed from: j0 */
    public final void m10271j0() {
        int i = this.f16525v + 1;
        this.f16525v = i;
        if (i != 1 || this.f16529x) {
            return;
        }
        this.f16527w = false;
    }

    /* renamed from: k */
    public final void m10272k(String str) {
        if (m10248P()) {
            if (str != null) {
                throw new IllegalStateException(str);
            }
            throw new IllegalStateException(AbstractC1374Vq.m8587f(this, new StringBuilder("Cannot call this method while RecyclerView is computing a layout or scrolling")));
        }
        if (this.f16472G > 0) {
            new IllegalStateException(AbstractC1374Vq.m8587f(this, new StringBuilder("")));
        }
    }

    /* renamed from: k0 */
    public final void m10273k0(boolean z) {
        if (this.f16525v < 1) {
            if (f16450L1) {
                throw new IllegalStateException(AbstractC1374Vq.m8587f(this, new StringBuilder("stopInterceptRequestLayout was called more times than startInterceptRequestLayout.")));
            }
            this.f16525v = 1;
        }
        if (!z && !this.f16529x) {
            this.f16527w = false;
        }
        if (this.f16525v == 1) {
            if (z && this.f16527w && !this.f16529x && this.f16512n != null && this.f16511m != null) {
                m10280s();
            }
            if (!this.f16529x) {
                this.f16527w = false;
            }
        }
        this.f16525v--;
    }

    /* renamed from: l0 */
    public final void m10274l0(int i) {
        getScrollingChildHelper().m3198h(i);
    }

    /* renamed from: m */
    public final void m10275m() {
        int iM22561T = this.f16504f.m22561T();
        for (int i = 0; i < iM22561T; i++) {
            OO0 oo0M10226M = m10226M(this.f16504f.m22560S(i));
            if (!oo0M10226M.m6059p()) {
                oo0M10226M.f8411d = -1;
                oo0M10226M.f8414g = -1;
            }
        }
        FO0 fo0 = this.f16498c;
        ArrayList arrayList = fo0.f3194c;
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            OO0 oo0 = (OO0) arrayList.get(i2);
            oo0.f8411d = -1;
            oo0.f8414g = -1;
        }
        ArrayList arrayList2 = fo0.f3192a;
        int size2 = arrayList2.size();
        for (int i3 = 0; i3 < size2; i3++) {
            OO0 oo02 = (OO0) arrayList2.get(i3);
            oo02.f8411d = -1;
            oo02.f8414g = -1;
        }
        ArrayList arrayList3 = fo0.f3193b;
        if (arrayList3 != null) {
            int size3 = arrayList3.size();
            for (int i4 = 0; i4 < size3; i4++) {
                OO0 oo03 = (OO0) fo0.f3193b.get(i4);
                oo03.f8411d = -1;
                oo03.f8414g = -1;
            }
        }
    }

    /* renamed from: n */
    public final void m10276n(int i, int i2) {
        boolean zIsFinished;
        EdgeEffect edgeEffect = this.f16476I;
        if (edgeEffect == null || edgeEffect.isFinished() || i <= 0) {
            zIsFinished = false;
        } else {
            this.f16476I.onRelease();
            zIsFinished = this.f16476I.isFinished();
        }
        EdgeEffect edgeEffect2 = this.f16480K;
        if (edgeEffect2 != null && !edgeEffect2.isFinished() && i < 0) {
            this.f16480K.onRelease();
            zIsFinished |= this.f16480K.isFinished();
        }
        EdgeEffect edgeEffect3 = this.f16478J;
        if (edgeEffect3 != null && !edgeEffect3.isFinished() && i2 > 0) {
            this.f16478J.onRelease();
            zIsFinished |= this.f16478J.isFinished();
        }
        EdgeEffect edgeEffect4 = this.f16482L;
        if (edgeEffect4 != null && !edgeEffect4.isFinished() && i2 < 0) {
            this.f16482L.onRelease();
            zIsFinished |= this.f16482L.isFinished();
        }
        if (zIsFinished) {
            WeakHashMap weakHashMap = AbstractC10944rk1.f41842a;
            postInvalidateOnAnimation();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:54:0x0066  */
    @Override // android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void onAttachedToWindow() {
        /*
            r5 = this;
            super.onAttachedToWindow()
            r0 = 0
            r5.f16470F = r0
            r1 = 1
            r5.f16519s = r1
            boolean r2 = r5.f16523u
            if (r2 == 0) goto L15
            boolean r2 = r5.isLayoutRequested()
            if (r2 != 0) goto L15
            r2 = r1
            goto L16
        L15:
            r2 = r0
        L16:
            r5.f16523u = r2
            FO0 r2 = r5.f16498c
            r2.m2621d()
            zO0 r2 = r5.f16512n
            if (r2 == 0) goto L26
            r2.f46819g = r1
            r2.mo11227R(r5)
        L26:
            r5.f16532y1 = r0
            boolean r0 = androidx.recyclerview.widget.RecyclerView.f16456R1
            if (r0 == 0) goto L91
            java.lang.ThreadLocal r0 = p000.RunnableC9311f00.f26994e
            java.lang.Object r1 = r0.get()
            f00 r1 = (p000.RunnableC9311f00) r1
            r5.f16516q1 = r1
            if (r1 != 0) goto L74
            f00 r1 = new f00
            r1.<init>()
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            r1.f26996a = r2
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            r1.f26999d = r2
            r5.f16516q1 = r1
            java.util.WeakHashMap r1 = p000.AbstractC10944rk1.f41842a
            android.view.Display r1 = r5.getDisplay()
            boolean r2 = r5.isInEditMode()
            if (r2 != 0) goto L66
            if (r1 == 0) goto L66
            float r1 = r1.getRefreshRate()
            r2 = 1106247680(0x41f00000, float:30.0)
            int r2 = (r1 > r2 ? 1 : (r1 == r2 ? 0 : -1))
            if (r2 < 0) goto L66
            goto L68
        L66:
            r1 = 1114636288(0x42700000, float:60.0)
        L68:
            f00 r2 = r5.f16516q1
            r3 = 1315859240(0x4e6e6b28, float:1.0E9)
            float r3 = r3 / r1
            long r3 = (long) r3
            r2.f26998c = r3
            r0.set(r2)
        L74:
            f00 r0 = r5.f16516q1
            r0.getClass()
            boolean r1 = androidx.recyclerview.widget.RecyclerView.f16450L1
            java.util.ArrayList r0 = r0.f26996a
            if (r1 == 0) goto L8e
            boolean r1 = r0.contains(r5)
            if (r1 != 0) goto L86
            goto L8e
        L86:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "RecyclerView already present in worker list!"
            r0.<init>(r1)
            throw r0
        L8e:
            r0.add(r5)
        L91:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.onAttachedToWindow():void");
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        FO0 fo0;
        RunnableC9311f00 runnableC9311f00;
        C8760aj0 c8760aj0;
        super.onDetachedFromWindow();
        AbstractC11538wO0 abstractC11538wO0 = this.f16483M;
        if (abstractC11538wO0 != null) {
            abstractC11538wO0.mo8955e();
        }
        int i = 0;
        setScrollState(0);
        NO0 no0 = this.f16503e0;
        no0.f7753g.removeCallbacks(no0);
        no0.f7749c.abortAnimation();
        AbstractC11919zO0 abstractC11919zO0 = this.f16512n;
        if (abstractC11919zO0 != null && (c8760aj0 = abstractC11919zO0.f46817e) != null) {
            c8760aj0.m9797i();
        }
        this.f16519s = false;
        AbstractC11919zO0 abstractC11919zO02 = this.f16512n;
        if (abstractC11919zO02 != null) {
            abstractC11919zO02.f46819g = false;
            abstractC11919zO02.mo10198S(this);
        }
        this.f16471F1.clear();
        removeCallbacks(this.f16473G1);
        this.f16505g.getClass();
        while (C7387Bk1.f1005d.mo4581i() != null) {
        }
        int i2 = 0;
        while (true) {
            fo0 = this.f16498c;
            ArrayList arrayList = fo0.f3194c;
            if (i2 >= arrayList.size()) {
                break;
            }
            FL1.m2582a(((OO0) arrayList.get(i2)).f8408a);
            i2++;
        }
        fo0.m2622e(fo0.f3199h.f16511m, false);
        while (i < getChildCount()) {
            int i3 = i + 1;
            View childAt = getChildAt(i);
            if (childAt == null) {
                throw new IndexOutOfBoundsException();
            }
            C9851jC0 c9851jC0 = (C9851jC0) childAt.getTag(ru.mes.dnevnik.R.id.pooling_container_listener_holder_tag);
            if (c9851jC0 == null) {
                c9851jC0 = new C9851jC0();
                childAt.setTag(ru.mes.dnevnik.R.id.pooling_container_listener_holder_tag, c9851jC0);
            }
            ArrayList arrayList2 = c9851jC0.f34971a;
            int iM26273d = AbstractC7230yu.m26273d(arrayList2);
            if (-1 < iM26273d) {
                AbstractC1374Vq.m8597p(arrayList2.get(iM26273d));
                throw null;
            }
            i = i3;
        }
        if (!f16456R1 || (runnableC9311f00 = this.f16516q1) == null) {
            return;
        }
        boolean zRemove = runnableC9311f00.f26996a.remove(this);
        if (f16450L1 && !zRemove) {
            throw new IllegalStateException("RecyclerView removal failed!");
        }
        this.f16516q1 = null;
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        ArrayList arrayList = this.f16514p;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            ((AbstractC11665xO0) arrayList.get(i)).mo9598a(canvas, this);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:107:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x00b9  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x00bb  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x00be  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x00c0  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x00ce  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x00d6  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x00d8  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x00db  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x00dd  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0070  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean onGenericMotionEvent(android.view.MotionEvent r17) {
        /*
            Method dump skipped, instructions count: 240
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.onGenericMotionEvent(android.view.MotionEvent):boolean");
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        boolean z;
        boolean z2;
        if (this.f16529x) {
            return false;
        }
        this.f16517r = null;
        if (m10240F(motionEvent)) {
            m10262d0();
            setScrollState(0);
            return true;
        }
        AbstractC11919zO0 abstractC11919zO0 = this.f16512n;
        if (abstractC11919zO0 == null) {
            return false;
        }
        boolean zMo10210d = abstractC11919zO0.mo10210d();
        boolean zMo10212e = this.f16512n.mo10212e();
        if (this.f16486P == null) {
            this.f16486P = VelocityTracker.obtain();
        }
        this.f16486P.addMovement(motionEvent);
        int actionMasked = motionEvent.getActionMasked();
        int actionIndex = motionEvent.getActionIndex();
        if (actionMasked == 0) {
            if (this.f16531y) {
                this.f16531y = false;
            }
            this.f16485O = motionEvent.getPointerId(0);
            int x = (int) (motionEvent.getX() + 0.5f);
            this.f16489S = x;
            this.f16487Q = x;
            int y = (int) (motionEvent.getY() + 0.5f);
            this.f16490T = y;
            this.f16488R = y;
            EdgeEffect edgeEffect = this.f16476I;
            if (edgeEffect == null || AbstractC10849r02.m24144b(edgeEffect) == 0.0f || canScrollHorizontally(-1)) {
                z = false;
            } else {
                AbstractC10849r02.m24146d(this.f16476I, 0.0f, 1.0f - (motionEvent.getY() / getHeight()));
                z = true;
            }
            EdgeEffect edgeEffect2 = this.f16480K;
            boolean z3 = z;
            if (edgeEffect2 != null) {
                z3 = z;
                if (AbstractC10849r02.m24144b(edgeEffect2) != 0.0f) {
                    z3 = z;
                    if (!canScrollHorizontally(1)) {
                        AbstractC10849r02.m24146d(this.f16480K, 0.0f, motionEvent.getY() / getHeight());
                        z3 = true;
                    }
                }
            }
            EdgeEffect edgeEffect3 = this.f16478J;
            boolean z4 = z3;
            if (edgeEffect3 != null) {
                z4 = z3;
                if (AbstractC10849r02.m24144b(edgeEffect3) != 0.0f) {
                    z4 = z3;
                    if (!canScrollVertically(-1)) {
                        AbstractC10849r02.m24146d(this.f16478J, 0.0f, motionEvent.getX() / getWidth());
                        z4 = true;
                    }
                }
            }
            EdgeEffect edgeEffect4 = this.f16482L;
            boolean z5 = z4;
            if (edgeEffect4 != null) {
                z5 = z4;
                if (AbstractC10849r02.m24144b(edgeEffect4) != 0.0f) {
                    z5 = z4;
                    if (!canScrollVertically(1)) {
                        AbstractC10849r02.m24146d(this.f16482L, 0.0f, 1.0f - (motionEvent.getX() / getWidth()));
                        z5 = true;
                    }
                }
            }
            if (z5 || this.f16484N == 2) {
                getParent().requestDisallowInterceptTouchEvent(true);
                setScrollState(1);
                m10274l0(1);
            }
            int[] iArr = this.f16467D1;
            iArr[1] = 0;
            iArr[0] = 0;
            int i = zMo10210d;
            if (zMo10212e) {
                i = (zMo10210d ? 1 : 0) | 2;
            }
            getScrollingChildHelper().m3197g(i, 0);
        } else if (actionMasked == 1) {
            this.f16486P.clear();
            m10274l0(0);
        } else if (actionMasked == 2) {
            int iFindPointerIndex = motionEvent.findPointerIndex(this.f16485O);
            if (iFindPointerIndex < 0) {
                return false;
            }
            int x2 = (int) (motionEvent.getX(iFindPointerIndex) + 0.5f);
            int y2 = (int) (motionEvent.getY(iFindPointerIndex) + 0.5f);
            if (this.f16484N != 1) {
                int i2 = x2 - this.f16487Q;
                int i3 = y2 - this.f16488R;
                if (zMo10210d == 0 || Math.abs(i2) <= this.f16491U) {
                    z2 = false;
                } else {
                    this.f16489S = x2;
                    z2 = true;
                }
                if (zMo10212e && Math.abs(i3) > this.f16491U) {
                    this.f16490T = y2;
                    z2 = true;
                }
                if (z2) {
                    setScrollState(1);
                }
            }
        } else if (actionMasked == 3) {
            m10262d0();
            setScrollState(0);
        } else if (actionMasked == 5) {
            this.f16485O = motionEvent.getPointerId(actionIndex);
            int x3 = (int) (motionEvent.getX(actionIndex) + 0.5f);
            this.f16489S = x3;
            this.f16487Q = x3;
            int y3 = (int) (motionEvent.getY(actionIndex) + 0.5f);
            this.f16490T = y3;
            this.f16488R = y3;
        } else if (actionMasked == 6) {
            m10254V(motionEvent);
        }
        return this.f16484N == 1;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int i5 = AbstractC7421Cb1.f1471a;
        Trace.beginSection("RV OnLayout");
        m10280s();
        Trace.endSection();
        this.f16523u = true;
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        AbstractC11919zO0 abstractC11919zO0 = this.f16512n;
        if (abstractC11919zO0 == null) {
            m10278q(i, i2);
            return;
        }
        boolean zMo10191L = abstractC11919zO0.mo10191L();
        boolean z = false;
        KO0 ko0 = this.f16520s1;
        if (zMo10191L) {
            int mode = View.MeasureSpec.getMode(i);
            int mode2 = View.MeasureSpec.getMode(i2);
            this.f16512n.f46814b.m10278q(i, i2);
            if (mode == 1073741824 && mode2 == 1073741824) {
                z = true;
            }
            this.f16475H1 = z;
            if (z || this.f16511m == null) {
                return;
            }
            if (ko0.f6048d == 1) {
                m10281t();
            }
            this.f16512n.m26424t0(i, i2);
            ko0.f6053i = true;
            m10282u();
            this.f16512n.m26427v0(i, i2);
            if (this.f16512n.mo10224y0()) {
                this.f16512n.m26424t0(View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), 1073741824));
                ko0.f6053i = true;
                m10282u();
                this.f16512n.m26427v0(i, i2);
            }
            this.f16477I1 = getMeasuredWidth();
            this.f16479J1 = getMeasuredHeight();
            return;
        }
        if (this.f16521t) {
            this.f16512n.f46814b.m10278q(i, i2);
            return;
        }
        if (this.f16460A) {
            m10271j0();
            m10252T();
            m10256X();
            m10253U(true);
            if (ko0.f6055k) {
                ko0.f6051g = true;
            } else {
                this.f16502e.m18940d();
                ko0.f6051g = false;
            }
            this.f16460A = false;
            m10273k0(false);
        } else if (ko0.f6055k) {
            setMeasuredDimension(getMeasuredWidth(), getMeasuredHeight());
            return;
        }
        AbstractC10899rO0 abstractC10899rO0 = this.f16511m;
        if (abstractC10899rO0 != null) {
            ko0.f6049e = abstractC10899rO0.mo3173a();
        } else {
            ko0.f6049e = 0;
        }
        m10271j0();
        this.f16512n.f46814b.m10278q(i, i2);
        m10273k0(false);
        ko0.f6051g = false;
    }

    @Override // android.view.ViewGroup
    public final boolean onRequestFocusInDescendants(int i, Rect rect) {
        if (m10248P()) {
            return false;
        }
        return super.onRequestFocusInDescendants(i, rect);
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof IO0)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        IO0 io0 = (IO0) parcelable;
        this.f16500d = io0;
        super.onRestoreInstanceState(io0.f44064a);
        requestLayout();
    }

    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        IO0 io0 = new IO0(super.onSaveInstanceState());
        IO0 io02 = this.f16500d;
        if (io02 != null) {
            io0.f4920c = io02.f4920c;
        } else {
            AbstractC11919zO0 abstractC11919zO0 = this.f16512n;
            if (abstractC11919zO0 != null) {
                io0.f4920c = abstractC11919zO0.mo10215g0();
            } else {
                io0.f4920c = null;
            }
        }
        return io0;
    }

    @Override // android.view.View
    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        if (i == i3 && i2 == i4) {
            return;
        }
        this.f16482L = null;
        this.f16478J = null;
        this.f16480K = null;
        this.f16476I = null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:413:0x01e0 A[PHI: r0
  0x01e0: PHI (r0v54 int) = (r0v39 int), (r0v58 int) binds: [B:407:0x01c9, B:411:0x01dc] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:415:0x01e3  */
    /* JADX WARN: Removed duplicated region for block: B:421:0x01f9  */
    /* JADX WARN: Removed duplicated region for block: B:464:0x02c8  */
    /* JADX WARN: Removed duplicated region for block: B:499:0x0339  */
    /* JADX WARN: Removed duplicated region for block: B:515:0x0378  */
    /* JADX WARN: Removed duplicated region for block: B:518:0x037e A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:519:0x0380  */
    /* JADX WARN: Removed duplicated region for block: B:525:0x03a0  */
    /* JADX WARN: Removed duplicated region for block: B:527:0x03a8  */
    /* JADX WARN: Removed duplicated region for block: B:554:0x03ff  */
    /* JADX WARN: Removed duplicated region for block: B:615:0x04bc  */
    /* JADX WARN: Removed duplicated region for block: B:616:0x04c2  */
    /* JADX WARN: Type inference failed for: r5v26, types: [boolean] */
    /* JADX WARN: Type inference failed for: r5v28 */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean onTouchEvent(android.view.MotionEvent r25) {
        /*
            Method dump skipped, instructions count: 1328
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.onTouchEvent(android.view.MotionEvent):boolean");
    }

    /* renamed from: p */
    public final void m10277p() {
        C10189lr0 c10189lr0 = this.f16504f;
        C4218i3 c4218i3 = this.f16502e;
        if (!this.f16523u || this.f16466D) {
            int i = AbstractC7421Cb1.f1471a;
            Trace.beginSection("RV FullInvalidate");
            m10280s();
            Trace.endSection();
            return;
        }
        if (c4218i3.m18946k()) {
            int i2 = c4218i3.f28781a;
            if ((i2 & 4) == 0 || (i2 & 11) != 0) {
                if (c4218i3.m18946k()) {
                    int i3 = AbstractC7421Cb1.f1471a;
                    Trace.beginSection("RV FullInvalidate");
                    m10280s();
                    Trace.endSection();
                    return;
                }
                return;
            }
            int i4 = AbstractC7421Cb1.f1471a;
            Trace.beginSection("RV PartialInvalidate");
            m10271j0();
            m10252T();
            c4218i3.m18953r();
            if (!this.f16527w) {
                int iM22557O = c10189lr0.m22557O();
                int i5 = 0;
                while (true) {
                    if (i5 < iM22557O) {
                        OO0 oo0M10226M = m10226M(c10189lr0.m22556N(i5));
                        if (oo0M10226M != null && !oo0M10226M.m6059p() && oo0M10226M.m6055l()) {
                            m10280s();
                            break;
                        }
                        i5++;
                    } else {
                        c4218i3.m18939c();
                        break;
                    }
                }
            }
            m10273k0(true);
            m10253U(true);
            Trace.endSection();
        }
    }

    /* renamed from: q */
    public final void m10278q(int i, int i2) {
        int paddingRight = getPaddingRight() + getPaddingLeft();
        WeakHashMap weakHashMap = AbstractC10944rk1.f41842a;
        setMeasuredDimension(AbstractC11919zO0.m26404g(i, paddingRight, getMinimumWidth()), AbstractC11919zO0.m26404g(i2, getPaddingBottom() + getPaddingTop(), getMinimumHeight()));
    }

    /* renamed from: r */
    public final void m10279r(View view) {
        m10226M(view);
        ArrayList arrayList = this.f16464C;
        if (arrayList != null) {
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                ((C9154dl1) this.f16464C.get(size)).getClass();
            }
        }
    }

    @Override // android.view.ViewGroup
    public final void removeDetachedView(View view, boolean z) {
        OO0 oo0M10226M = m10226M(view);
        if (oo0M10226M != null) {
            if (oo0M10226M.m6054k()) {
                oo0M10226M.f8417j &= -257;
            } else if (!oo0M10226M.m6059p()) {
                StringBuilder sb = new StringBuilder("Called removeDetachedView with a view which is not flagged as tmp detached.");
                sb.append(oo0M10226M);
                throw new IllegalArgumentException(AbstractC1374Vq.m8587f(this, sb));
            }
        } else if (f16450L1) {
            StringBuilder sb2 = new StringBuilder("No ViewHolder found for child: ");
            sb2.append(view);
            throw new IllegalArgumentException(AbstractC1374Vq.m8587f(this, sb2));
        }
        view.clearAnimation();
        m10279r(view);
        super.removeDetachedView(view, z);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void requestChildFocus(View view, View view2) {
        C8760aj0 c8760aj0 = this.f16512n.f46817e;
        if ((c8760aj0 == null || !c8760aj0.f15641e) && !m10248P() && view2 != null) {
            m10261c0(view, view2);
        }
        super.requestChildFocus(view, view2);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean requestChildRectangleOnScreen(View view, Rect rect, boolean z) {
        return this.f16512n.mo11228n0(this, view, rect, z, false);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void requestDisallowInterceptTouchEvent(boolean z) {
        ArrayList arrayList = this.f16515q;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            ((C0344FS) arrayList.get(i)).getClass();
        }
        super.requestDisallowInterceptTouchEvent(z);
    }

    @Override // android.view.View, android.view.ViewParent
    public final void requestLayout() {
        if (this.f16525v != 0 || this.f16529x) {
            this.f16527w = true;
        } else {
            super.requestLayout();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:415:0x031d  */
    /* JADX WARN: Removed duplicated region for block: B:442:0x037d  */
    /* JADX WARN: Type inference failed for: r11v0 */
    /* JADX WARN: Type inference failed for: r11v1, types: [OO0] */
    /* JADX WARN: Type inference failed for: r11v10 */
    /* JADX WARN: Type inference failed for: r11v2 */
    /* JADX WARN: Type inference failed for: r11v21 */
    /* JADX WARN: Type inference failed for: r11v3 */
    /* JADX WARN: Type inference failed for: r11v4 */
    /* JADX WARN: Type inference failed for: r11v9 */
    /* JADX WARN: Type inference failed for: r2v16 */
    /* JADX WARN: Type inference failed for: r2v23 */
    /* JADX WARN: Type inference failed for: r2v24, types: [int] */
    /* JADX WARN: Type inference failed for: r2v27 */
    /* JADX WARN: Type inference failed for: r2v31 */
    /* JADX WARN: Type inference failed for: r2v32 */
    /* JADX WARN: Type inference failed for: r2v33 */
    /* JADX WARN: Type inference failed for: r2v34 */
    /* renamed from: s */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void m10280s() {
        /*
            Method dump skipped, instructions count: 993
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.m10280s():void");
    }

    @Override // android.view.View
    public final void scrollBy(int i, int i2) {
        AbstractC11919zO0 abstractC11919zO0 = this.f16512n;
        if (abstractC11919zO0 == null || this.f16529x) {
            return;
        }
        boolean zMo10210d = abstractC11919zO0.mo10210d();
        boolean zMo10212e = this.f16512n.mo10212e();
        if (zMo10210d || zMo10212e) {
            if (!zMo10210d) {
                i = 0;
            }
            if (!zMo10212e) {
                i2 = 0;
            }
            m10263e0(i, i2, null, 0);
        }
    }

    @Override // android.view.View
    public final void scrollTo(int i, int i2) {
    }

    @Override // android.view.View, android.view.accessibility.AccessibilityEventSource
    public final void sendAccessibilityEventUnchecked(AccessibilityEvent accessibilityEvent) {
        if (!m10248P()) {
            super.sendAccessibilityEventUnchecked(accessibilityEvent);
        } else {
            int contentChangeTypes = accessibilityEvent != null ? accessibilityEvent.getContentChangeTypes() : 0;
            this.f16533z |= contentChangeTypes != 0 ? contentChangeTypes : 0;
        }
    }

    public void setAccessibilityDelegateCompat(QO0 qo0) {
        this.f16534z1 = qo0;
        AbstractC10944rk1.m24482n(this, qo0);
    }

    public void setAdapter(AbstractC10899rO0 abstractC10899rO0) {
        setLayoutFrozen(false);
        AbstractC10899rO0 abstractC10899rO02 = this.f16511m;
        HO0 ho0 = this.f16496b;
        if (abstractC10899rO02 != null) {
            abstractC10899rO02.f41641a.unregisterObserver(ho0);
            this.f16511m.getClass();
        }
        AbstractC11538wO0 abstractC11538wO0 = this.f16483M;
        if (abstractC11538wO0 != null) {
            abstractC11538wO0.mo8955e();
        }
        AbstractC11919zO0 abstractC11919zO0 = this.f16512n;
        FO0 fo0 = this.f16498c;
        if (abstractC11919zO0 != null) {
            abstractC11919zO0.m26417j0(fo0);
            this.f16512n.m26418k0(fo0);
        }
        fo0.f3192a.clear();
        fo0.m2623f();
        C4218i3 c4218i3 = this.f16502e;
        c4218i3.m18954s((ArrayList) c4218i3.f28783c);
        c4218i3.m18954s((ArrayList) c4218i3.f28784d);
        c4218i3.f28781a = 0;
        AbstractC10899rO0 abstractC10899rO03 = this.f16511m;
        this.f16511m = abstractC10899rO0;
        if (abstractC10899rO0 != null) {
            abstractC10899rO0.f41641a.registerObserver(ho0);
        }
        AbstractC11919zO0 abstractC11919zO02 = this.f16512n;
        if (abstractC11919zO02 != null) {
            abstractC11919zO02.mo10304Q();
        }
        AbstractC10899rO0 abstractC10899rO04 = this.f16511m;
        fo0.f3192a.clear();
        fo0.m2623f();
        fo0.m2622e(abstractC10899rO03, true);
        EO0 eo0M2620c = fo0.m2620c();
        if (abstractC10899rO03 != null) {
            eo0M2620c.f2688b--;
        }
        if (eo0M2620c.f2688b == 0) {
            int i = 0;
            while (true) {
                SparseArray sparseArray = eo0M2620c.f2687a;
                if (i >= sparseArray.size()) {
                    break;
                }
                DO0 do0 = (DO0) sparseArray.valueAt(i);
                Iterator it = do0.f1999a.iterator();
                while (it.hasNext()) {
                    FL1.m2582a(((OO0) it.next()).f8408a);
                }
                do0.f1999a.clear();
                i++;
            }
        }
        if (abstractC10899rO04 != null) {
            eo0M2620c.f2688b++;
        }
        fo0.m2621d();
        this.f16520s1.f6050f = true;
        m10257Y(false);
        requestLayout();
    }

    public void setChildDrawingOrderCallback(InterfaceC11283uO0 interfaceC11283uO0) {
        if (interfaceC11283uO0 == null) {
            return;
        }
        setChildrenDrawingOrderEnabled(false);
    }

    @Override // android.view.ViewGroup
    public void setClipToPadding(boolean z) {
        if (z != this.f16506h) {
            this.f16482L = null;
            this.f16478J = null;
            this.f16480K = null;
            this.f16476I = null;
        }
        this.f16506h = z;
        super.setClipToPadding(z);
        if (this.f16523u) {
            requestLayout();
        }
    }

    public void setEdgeEffectFactory(AbstractC11411vO0 abstractC11411vO0) {
        abstractC11411vO0.getClass();
        this.f16474H = abstractC11411vO0;
        this.f16482L = null;
        this.f16478J = null;
        this.f16480K = null;
        this.f16476I = null;
    }

    public void setHasFixedSize(boolean z) {
        this.f16521t = z;
    }

    public void setItemAnimator(AbstractC11538wO0 abstractC11538wO0) {
        AbstractC11538wO0 abstractC11538wO02 = this.f16483M;
        if (abstractC11538wO02 != null) {
            abstractC11538wO02.mo8955e();
            this.f16483M.f44847a = null;
        }
        this.f16483M = abstractC11538wO0;
        if (abstractC11538wO0 != null) {
            abstractC11538wO0.f44847a = this.f16530x1;
        }
    }

    public void setItemViewCacheSize(int i) {
        FO0 fo0 = this.f16498c;
        fo0.f3196e = i;
        fo0.m2630m();
    }

    @Deprecated
    public void setLayoutFrozen(boolean z) {
        suppressLayout(z);
    }

    public void setLayoutManager(AbstractC11919zO0 abstractC11919zO0) {
        RecyclerView recyclerView;
        C8760aj0 c8760aj0;
        if (abstractC11919zO0 == this.f16512n) {
            return;
        }
        setScrollState(0);
        NO0 no0 = this.f16503e0;
        no0.f7753g.removeCallbacks(no0);
        no0.f7749c.abortAnimation();
        AbstractC11919zO0 abstractC11919zO02 = this.f16512n;
        if (abstractC11919zO02 != null && (c8760aj0 = abstractC11919zO02.f46817e) != null) {
            c8760aj0.m9797i();
        }
        AbstractC11919zO0 abstractC11919zO03 = this.f16512n;
        FO0 fo0 = this.f16498c;
        if (abstractC11919zO03 != null) {
            AbstractC11538wO0 abstractC11538wO0 = this.f16483M;
            if (abstractC11538wO0 != null) {
                abstractC11538wO0.mo8955e();
            }
            this.f16512n.m26417j0(fo0);
            this.f16512n.m26418k0(fo0);
            fo0.f3192a.clear();
            fo0.m2623f();
            if (this.f16519s) {
                AbstractC11919zO0 abstractC11919zO04 = this.f16512n;
                abstractC11919zO04.f46819g = false;
                abstractC11919zO04.mo10198S(this);
            }
            this.f16512n.m26428w0(null);
            this.f16512n = null;
        } else {
            fo0.f3192a.clear();
            fo0.m2623f();
        }
        C10189lr0 c10189lr0 = this.f16504f;
        ((C0495Hr) c10189lr0.f37324c).m3609A();
        ArrayList arrayList = (ArrayList) c10189lr0.f37325d;
        int size = arrayList.size() - 1;
        while (true) {
            recyclerView = (RecyclerView) ((C9196e41) c10189lr0.f37323b).f26532b;
            if (size < 0) {
                break;
            }
            OO0 oo0M10226M = m10226M((View) arrayList.get(size));
            if (oo0M10226M != null) {
                int i = oo0M10226M.f8423p;
                if (recyclerView.m10248P()) {
                    oo0M10226M.f8424q = i;
                    recyclerView.f16471F1.add(oo0M10226M);
                } else {
                    WeakHashMap weakHashMap = AbstractC10944rk1.f41842a;
                    oo0M10226M.f8408a.setImportantForAccessibility(i);
                }
                oo0M10226M.f8423p = 0;
            }
            arrayList.remove(size);
            size--;
        }
        int childCount = recyclerView.getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = recyclerView.getChildAt(i2);
            recyclerView.m10279r(childAt);
            childAt.clearAnimation();
        }
        recyclerView.removeAllViews();
        this.f16512n = abstractC11919zO0;
        if (abstractC11919zO0 != null) {
            if (abstractC11919zO0.f46814b != null) {
                StringBuilder sb = new StringBuilder("LayoutManager ");
                sb.append(abstractC11919zO0);
                sb.append(" is already attached to a RecyclerView:");
                throw new IllegalArgumentException(AbstractC1374Vq.m8587f(abstractC11919zO0.f46814b, sb));
            }
            abstractC11919zO0.m26428w0(this);
            if (this.f16519s) {
                AbstractC11919zO0 abstractC11919zO05 = this.f16512n;
                abstractC11919zO05.f46819g = true;
                abstractC11919zO05.mo11227R(this);
            }
        }
        fo0.m2630m();
        requestLayout();
    }

    @Override // android.view.ViewGroup
    @Deprecated
    public void setLayoutTransition(LayoutTransition layoutTransition) {
        if (layoutTransition != null) {
            throw new IllegalArgumentException("Providing a LayoutTransition into RecyclerView is not supported. Please use setItemAnimator() instead for animating changes to the items in this RecyclerView");
        }
        super.setLayoutTransition(null);
    }

    @Override // android.view.View
    public void setNestedScrollingEnabled(boolean z) {
        C7666Gu0 scrollingChildHelper = getScrollingChildHelper();
        if (scrollingChildHelper.f3954d) {
            WeakHashMap weakHashMap = AbstractC10944rk1.f41842a;
            AbstractC9536gk1.m18631z(scrollingChildHelper.f3953c);
        }
        scrollingChildHelper.f3954d = z;
    }

    public void setOnFlingListener(BO0 bo0) {
        this.f16492V = bo0;
    }

    @Deprecated
    public void setOnScrollListener(CO0 co0) {
        this.f16522t1 = co0;
    }

    public void setPreserveFocusAfterLayout(boolean z) {
        this.f16501d0 = z;
    }

    public void setRecycledViewPool(EO0 eo0) {
        FO0 fo0 = this.f16498c;
        RecyclerView recyclerView = fo0.f3199h;
        fo0.m2622e(recyclerView.f16511m, false);
        if (fo0.f3198g != null) {
            r2.f2688b--;
        }
        fo0.f3198g = eo0;
        if (eo0 != null && recyclerView.getAdapter() != null) {
            fo0.f3198g.f2688b++;
        }
        fo0.m2621d();
    }

    public void setScrollState(int i) {
        C8760aj0 c8760aj0;
        if (i == this.f16484N) {
            return;
        }
        if (f16451M1) {
            new Exception();
        }
        this.f16484N = i;
        if (i != 2) {
            NO0 no0 = this.f16503e0;
            no0.f7753g.removeCallbacks(no0);
            no0.f7749c.abortAnimation();
            AbstractC11919zO0 abstractC11919zO0 = this.f16512n;
            if (abstractC11919zO0 != null && (c8760aj0 = abstractC11919zO0.f46817e) != null) {
                c8760aj0.m9797i();
            }
        }
        AbstractC11919zO0 abstractC11919zO02 = this.f16512n;
        if (abstractC11919zO02 != null) {
            abstractC11919zO02.mo10321h0(i);
        }
        CO0 co0 = this.f16522t1;
        if (co0 != null) {
            co0.mo468a(this, i);
        }
        ArrayList arrayList = this.f16524u1;
        if (arrayList != null) {
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                ((CO0) this.f16524u1.get(size)).mo468a(this, i);
            }
        }
    }

    public void setScrollingTouchSlop(int i) {
        ViewConfiguration viewConfiguration = ViewConfiguration.get(getContext());
        if (i != 1) {
            this.f16491U = viewConfiguration.getScaledTouchSlop();
        } else {
            this.f16491U = viewConfiguration.getScaledPagingTouchSlop();
        }
    }

    public void setViewCacheExtension(MO0 mo0) {
        this.f16498c.getClass();
    }

    @Override // android.view.View
    public final boolean startNestedScroll(int i) {
        return getScrollingChildHelper().m3197g(i, 0);
    }

    @Override // android.view.View
    public final void stopNestedScroll() {
        getScrollingChildHelper().m3198h(0);
    }

    @Override // android.view.ViewGroup
    public final void suppressLayout(boolean z) {
        C8760aj0 c8760aj0;
        if (z != this.f16529x) {
            m10272k("Do not suppressLayout in layout or scroll");
            if (!z) {
                this.f16529x = false;
                if (this.f16527w && this.f16512n != null && this.f16511m != null) {
                    requestLayout();
                }
                this.f16527w = false;
                return;
            }
            long jUptimeMillis = SystemClock.uptimeMillis();
            onTouchEvent(MotionEvent.obtain(jUptimeMillis, jUptimeMillis, 3, 0.0f, 0.0f, 0));
            this.f16529x = true;
            this.f16531y = true;
            setScrollState(0);
            NO0 no0 = this.f16503e0;
            no0.f7753g.removeCallbacks(no0);
            no0.f7749c.abortAnimation();
            AbstractC11919zO0 abstractC11919zO0 = this.f16512n;
            if (abstractC11919zO0 == null || (c8760aj0 = abstractC11919zO0.f46817e) == null) {
                return;
            }
            c8760aj0.m9797i();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:167:0x0063  */
    /* renamed from: t */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void m10281t() {
        /*
            Method dump skipped, instructions count: 525
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.m10281t():void");
    }

    /* renamed from: u */
    public final void m10282u() {
        m10271j0();
        m10252T();
        KO0 ko0 = this.f16520s1;
        ko0.m4624a(6);
        this.f16502e.m18940d();
        ko0.f6049e = this.f16511m.mo3173a();
        ko0.f6047c = 0;
        if (this.f16500d != null) {
            AbstractC10899rO0 abstractC10899rO0 = this.f16511m;
            int iM26247x = AbstractC7222ym.m26247x(abstractC10899rO0.f41643c);
            if (iM26247x == 1 ? abstractC10899rO0.mo3173a() > 0 : iM26247x != 2) {
                Parcelable parcelable = this.f16500d.f4920c;
                if (parcelable != null) {
                    this.f16512n.mo10213f0(parcelable);
                }
                this.f16500d = null;
            }
        }
        ko0.f6051g = false;
        this.f16512n.mo10161d0(this.f16498c, ko0);
        ko0.f6050f = false;
        ko0.f6054j = ko0.f6054j && this.f16483M != null;
        ko0.f6048d = 4;
        m10253U(true);
        m10273k0(false);
    }

    /* renamed from: v */
    public final boolean m10283v(int i, int i2, int i3, int[] iArr, int[] iArr2) {
        return getScrollingChildHelper().m3193c(i, i2, i3, iArr, iArr2);
    }

    /* renamed from: w */
    public final void m10284w(int i, int i2, int i3, int i4, int[] iArr, int i5, int[] iArr2) {
        getScrollingChildHelper().m3194d(i, i2, i3, i4, iArr, i5, iArr2);
    }

    /* renamed from: x */
    public final void m10285x(int i, int i2) {
        this.f16472G++;
        int scrollX = getScrollX();
        int scrollY = getScrollY();
        onScrollChanged(scrollX, scrollY, scrollX - i, scrollY - i2);
        CO0 co0 = this.f16522t1;
        if (co0 != null) {
            co0.mo469b(this, i, i2);
        }
        ArrayList arrayList = this.f16524u1;
        if (arrayList != null) {
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                ((CO0) this.f16524u1.get(size)).mo469b(this, i, i2);
            }
        }
        this.f16472G--;
    }

    /* renamed from: y */
    public final void m10286y() {
        if (this.f16482L != null) {
            return;
        }
        ((LO0) this.f16474H).getClass();
        EdgeEffect edgeEffect = new EdgeEffect(getContext());
        this.f16482L = edgeEffect;
        if (this.f16506h) {
            edgeEffect.setSize((getMeasuredWidth() - getPaddingLeft()) - getPaddingRight(), (getMeasuredHeight() - getPaddingTop()) - getPaddingBottom());
        } else {
            edgeEffect.setSize(getMeasuredWidth(), getMeasuredHeight());
        }
    }

    /* renamed from: z */
    public final void m10287z() {
        if (this.f16476I != null) {
            return;
        }
        ((LO0) this.f16474H).getClass();
        EdgeEffect edgeEffect = new EdgeEffect(getContext());
        this.f16476I = edgeEffect;
        if (this.f16506h) {
            edgeEffect.setSize((getMeasuredHeight() - getPaddingTop()) - getPaddingBottom(), (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight());
        } else {
            edgeEffect.setSize(getMeasuredHeight(), getMeasuredWidth());
        }
    }

    public RecyclerView(Context context, AttributeSet attributeSet, int i) throws NoSuchMethodException, SecurityException {
        float fM25483a;
        char c;
        int i2;
        Object[] objArr;
        Constructor constructor;
        super(context, attributeSet, i);
        this.f16496b = new HO0(this);
        this.f16498c = new FO0(this);
        this.f16505g = new C7967Mo1(24);
        this.f16507i = new RunnableC10643pO0(this, 0);
        this.f16508j = new Rect();
        this.f16509k = new Rect();
        this.f16510l = new RectF();
        this.f16513o = new ArrayList();
        this.f16514p = new ArrayList();
        this.f16515q = new ArrayList();
        this.f16525v = 0;
        this.f16466D = false;
        this.f16468E = false;
        this.f16470F = 0;
        this.f16472G = 0;
        this.f16474H = f16459U1;
        C1463XF c1463xf = new C1463XF();
        c1463xf.f44847a = null;
        c1463xf.f44848b = new ArrayList();
        c1463xf.f44849c = 120L;
        c1463xf.f44850d = 120L;
        c1463xf.f44851e = 250L;
        c1463xf.f44852f = 250L;
        c1463xf.f13634g = true;
        c1463xf.f13635h = new ArrayList();
        c1463xf.f13636i = new ArrayList();
        c1463xf.f13637j = new ArrayList();
        c1463xf.f13638k = new ArrayList();
        c1463xf.f13639l = new ArrayList();
        c1463xf.f13640m = new ArrayList();
        c1463xf.f13641n = new ArrayList();
        c1463xf.f13642o = new ArrayList();
        c1463xf.f13643p = new ArrayList();
        c1463xf.f13644q = new ArrayList();
        c1463xf.f13645r = new ArrayList();
        this.f16483M = c1463xf;
        this.f16484N = 0;
        this.f16485O = -1;
        this.f16497b0 = Float.MIN_VALUE;
        this.f16499c0 = Float.MIN_VALUE;
        this.f16501d0 = true;
        this.f16503e0 = new NO0(this);
        this.f16518r1 = f16456R1 ? new C6327ks() : null;
        KO0 ko0 = new KO0();
        ko0.f6045a = -1;
        ko0.f6046b = 0;
        ko0.f6047c = 0;
        ko0.f6048d = 1;
        ko0.f6049e = 0;
        ko0.f6050f = false;
        ko0.f6051g = false;
        ko0.f6052h = false;
        ko0.f6053i = false;
        ko0.f6054j = false;
        ko0.f6055k = false;
        this.f16520s1 = ko0;
        this.f16526v1 = false;
        this.f16528w1 = false;
        C9432fw1 c9432fw1 = new C9432fw1(27, this);
        this.f16530x1 = c9432fw1;
        this.f16532y1 = false;
        this.f16461A1 = new int[2];
        this.f16465C1 = new int[2];
        this.f16467D1 = new int[2];
        this.f16469E1 = new int[2];
        this.f16471F1 = new ArrayList();
        this.f16473G1 = new RunnableC10643pO0(this, 1);
        this.f16477I1 = 0;
        this.f16479J1 = 0;
        this.f16481K1 = new QQ0(this);
        setScrollContainer(true);
        setFocusableInTouchMode(true);
        ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
        this.f16491U = viewConfiguration.getScaledTouchSlop();
        int i3 = Build.VERSION.SDK_INT;
        if (i3 >= 26) {
            Method method = AbstractC11456vk1.f44514a;
            fM25483a = AbstractC11072sk1.m24775a(viewConfiguration);
        } else {
            fM25483a = AbstractC11456vk1.m25483a(viewConfiguration, context);
        }
        this.f16497b0 = fM25483a;
        this.f16499c0 = i3 >= 26 ? AbstractC11072sk1.m24776b(viewConfiguration) : AbstractC11456vk1.m25483a(viewConfiguration, context);
        this.f16493W = viewConfiguration.getScaledMinimumFlingVelocity();
        this.f16495a0 = viewConfiguration.getScaledMaximumFlingVelocity();
        this.f16494a = context.getResources().getDisplayMetrics().density * 160.0f * 386.0878f * 0.84f;
        setWillNotDraw(getOverScrollMode() == 2);
        this.f16483M.f44847a = c9432fw1;
        this.f16502e = new C4218i3(new C7391Bm1(29, this));
        this.f16504f = new C10189lr0(new C9196e41(28, this));
        WeakHashMap weakHashMap = AbstractC10944rk1.f41842a;
        if ((i3 >= 26 ? AbstractC9792ik1.m19076c(this) : 0) == 0 && i3 >= 26) {
            AbstractC9792ik1.m19086m(this, 8);
        }
        if (getImportantForAccessibility() == 0) {
            setImportantForAccessibility(1);
        }
        this.f16462B = (AccessibilityManager) getContext().getSystemService("accessibility");
        setAccessibilityDelegateCompat(new QO0(this));
        int[] iArr = ZG0.f14841a;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, iArr, i, 0);
        AbstractC10944rk1.m24481m(this, context, iArr, attributeSet, typedArrayObtainStyledAttributes, i, 0);
        String string = typedArrayObtainStyledAttributes.getString(8);
        if (typedArrayObtainStyledAttributes.getInt(2, -1) == -1) {
            setDescendantFocusability(262144);
        }
        this.f16506h = typedArrayObtainStyledAttributes.getBoolean(1, true);
        if (typedArrayObtainStyledAttributes.getBoolean(3, false)) {
            StateListDrawable stateListDrawable = (StateListDrawable) typedArrayObtainStyledAttributes.getDrawable(6);
            Drawable drawable = typedArrayObtainStyledAttributes.getDrawable(7);
            StateListDrawable stateListDrawable2 = (StateListDrawable) typedArrayObtainStyledAttributes.getDrawable(4);
            Drawable drawable2 = typedArrayObtainStyledAttributes.getDrawable(5);
            if (stateListDrawable == null || drawable == null || stateListDrawable2 == null || drawable2 == null) {
                throw new IllegalArgumentException(AbstractC1374Vq.m8587f(this, new StringBuilder("Trying to set fast scroller without both required drawables.")));
            }
            Resources resources = getContext().getResources();
            c = 2;
            i2 = 4;
            new C0344FS(this, stateListDrawable, drawable, stateListDrawable2, drawable2, resources.getDimensionPixelSize(ru.mes.dnevnik.R.dimen.fastscroll_default_thickness), resources.getDimensionPixelSize(ru.mes.dnevnik.R.dimen.fastscroll_minimum_range), resources.getDimensionPixelOffset(ru.mes.dnevnik.R.dimen.fastscroll_margin));
        } else {
            c = 2;
            i2 = 4;
        }
        typedArrayObtainStyledAttributes.recycle();
        if (string != null) {
            String strTrim = string.trim();
            if (!strTrim.isEmpty()) {
                if (strTrim.charAt(0) == '.') {
                    strTrim = context.getPackageName() + strTrim;
                } else if (!strTrim.contains(".")) {
                    strTrim = RecyclerView.class.getPackage().getName() + '.' + strTrim;
                }
                try {
                    Class<? extends U> clsAsSubclass = Class.forName(strTrim, false, isInEditMode() ? getClass().getClassLoader() : context.getClassLoader()).asSubclass(AbstractC11919zO0.class);
                    try {
                        constructor = clsAsSubclass.getConstructor(f16457S1);
                        objArr = new Object[i2];
                        objArr[0] = context;
                        objArr[1] = attributeSet;
                        objArr[c] = Integer.valueOf(i);
                        objArr[3] = 0;
                    } catch (NoSuchMethodException e) {
                        try {
                            objArr = null;
                            constructor = clsAsSubclass.getConstructor(null);
                        } catch (NoSuchMethodException e2) {
                            e2.initCause(e);
                            throw new IllegalStateException(attributeSet.getPositionDescription() + ": Error creating LayoutManager " + strTrim, e2);
                        }
                    }
                    constructor.setAccessible(true);
                    setLayoutManager((AbstractC11919zO0) constructor.newInstance(objArr));
                } catch (ClassCastException e3) {
                    throw new IllegalStateException(attributeSet.getPositionDescription() + ": Class is not a LayoutManager " + strTrim, e3);
                } catch (ClassNotFoundException e4) {
                    throw new IllegalStateException(attributeSet.getPositionDescription() + ": Unable to find LayoutManager " + strTrim, e4);
                } catch (IllegalAccessException e5) {
                    throw new IllegalStateException(attributeSet.getPositionDescription() + ": Cannot access non-public constructor " + strTrim, e5);
                } catch (InstantiationException e6) {
                    throw new IllegalStateException(attributeSet.getPositionDescription() + ": Could not instantiate the LayoutManager: " + strTrim, e6);
                } catch (InvocationTargetException e7) {
                    throw new IllegalStateException(attributeSet.getPositionDescription() + ": Could not instantiate the LayoutManager: " + strTrim, e7);
                }
            }
        }
        int[] iArr2 = f16452N1;
        TypedArray typedArrayObtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, iArr2, i, 0);
        AbstractC10944rk1.m24481m(this, context, iArr2, attributeSet, typedArrayObtainStyledAttributes2, i, 0);
        boolean z = typedArrayObtainStyledAttributes2.getBoolean(0, true);
        typedArrayObtainStyledAttributes2.recycle();
        setNestedScrollingEnabled(z);
        setTag(ru.mes.dnevnik.R.id.is_pooling_container_tag, Boolean.TRUE);
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        AbstractC11919zO0 abstractC11919zO0 = this.f16512n;
        if (abstractC11919zO0 != null) {
            return abstractC11919zO0.mo10182t(layoutParams);
        }
        throw new IllegalStateException(AbstractC1374Vq.m8587f(this, new StringBuilder("RecyclerView has no LayoutManager")));
    }

    @Deprecated
    public void setRecyclerListener(GO0 go0) {
    }
}
