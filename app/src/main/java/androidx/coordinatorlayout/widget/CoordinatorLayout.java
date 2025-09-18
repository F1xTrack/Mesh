package androidx.coordinatorlayout.widget;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Parcelable;
import android.os.SystemClock;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.view.Gravity;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.WeakHashMap;
import p000.AbstractC0628Jy;
import p000.AbstractC10944rk1;
import p000.AbstractC4236iL;
import p000.AbstractC6397lz;
import p000.AbstractC7335Ak1;
import p000.AbstractC9280ek1;
import p000.AbstractC9536gk1;
import p000.C10107lC0;
import p000.C11649xG0;
import p000.C1643a6;
import p000.C4032f6;
import p000.C6588oz;
import p000.C6714qz;
import p000.C8071Oo1;
import p000.C8433Vn1;
import p000.C8774aq0;
import p000.InterfaceC6334kz;
import p000.InterfaceC6460mz;
import p000.InterfaceC7718Hu0;
import p000.InterfaceC7770Iu0;
import p000.L01;
import p000.UG0;
import p000.ViewGroupOnHierarchyChangeListenerC6523nz;
import p000.ViewTreeObserverOnPreDrawListenerC6651pz;
import ru.mes.dnevnik.R;

/* loaded from: classes.dex */
public class CoordinatorLayout extends ViewGroup implements InterfaceC7718Hu0, InterfaceC7770Iu0 {

    /* renamed from: s */
    public static final String f16066s;

    /* renamed from: t */
    public static final Class[] f16067t;

    /* renamed from: u */
    public static final ThreadLocal f16068u;

    /* renamed from: v */
    public static final C8774aq0 f16069v;

    /* renamed from: w */
    public static final C10107lC0 f16070w;

    /* renamed from: a */
    public final ArrayList f16071a;

    /* renamed from: b */
    public final C8071Oo1 f16072b;

    /* renamed from: c */
    public final ArrayList f16073c;

    /* renamed from: d */
    public final int[] f16074d;

    /* renamed from: e */
    public final int[] f16075e;

    /* renamed from: f */
    public boolean f16076f;

    /* renamed from: g */
    public boolean f16077g;

    /* renamed from: h */
    public final int[] f16078h;

    /* renamed from: i */
    public View f16079i;

    /* renamed from: j */
    public View f16080j;

    /* renamed from: k */
    public ViewTreeObserverOnPreDrawListenerC6651pz f16081k;

    /* renamed from: l */
    public boolean f16082l;

    /* renamed from: m */
    public C8433Vn1 f16083m;

    /* renamed from: n */
    public boolean f16084n;

    /* renamed from: o */
    public Drawable f16085o;

    /* renamed from: p */
    public ViewGroup.OnHierarchyChangeListener f16086p;

    /* renamed from: q */
    public C1643a6 f16087q;

    /* renamed from: r */
    public final C11649xG0 f16088r;

    static {
        Package r0 = CoordinatorLayout.class.getPackage();
        f16066s = r0 != null ? r0.getName() : null;
        f16069v = new C8774aq0(7);
        f16067t = new Class[]{Context.class, AttributeSet.class};
        f16068u = new ThreadLocal();
        f16070w = new C10107lC0(12);
    }

    public CoordinatorLayout(Context context, AttributeSet attributeSet) throws Resources.NotFoundException {
        super(context, attributeSet, R.attr.coordinatorLayoutStyle);
        this.f16071a = new ArrayList();
        this.f16072b = new C8071Oo1(7);
        this.f16073c = new ArrayList();
        this.f16074d = new int[2];
        this.f16075e = new int[2];
        this.f16088r = new C11649xG0(6);
        int[] iArr = UG0.f11709a;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, iArr, R.attr.coordinatorLayoutStyle, 0);
        AbstractC10944rk1.m24481m(this, context, iArr, attributeSet, typedArrayObtainStyledAttributes, R.attr.coordinatorLayoutStyle, 0);
        int resourceId = typedArrayObtainStyledAttributes.getResourceId(0, 0);
        if (resourceId != 0) {
            Resources resources = context.getResources();
            int[] intArray = resources.getIntArray(resourceId);
            this.f16078h = intArray;
            float f = resources.getDisplayMetrics().density;
            int length = intArray.length;
            for (int i = 0; i < length; i++) {
                this.f16078h[i] = (int) (r3[i] * f);
            }
        }
        this.f16085o = typedArrayObtainStyledAttributes.getDrawable(1);
        typedArrayObtainStyledAttributes.recycle();
        m9976x();
        super.setOnHierarchyChangeListener(new ViewGroupOnHierarchyChangeListenerC6523nz(this, 0));
        WeakHashMap weakHashMap = AbstractC10944rk1.f41842a;
        if (getImportantForAccessibility() == 0) {
            setImportantForAccessibility(1);
        }
    }

    /* renamed from: g */
    public static Rect m9959g() {
        Rect rect = (Rect) f16070w.mo4581i();
        return rect == null ? new Rect() : rect;
    }

    /* renamed from: l */
    public static void m9960l(int i, Rect rect, Rect rect2, C6588oz c6588oz, int i2, int i3) {
        int i4 = c6588oz.f39407c;
        if (i4 == 0) {
            i4 = 17;
        }
        int absoluteGravity = Gravity.getAbsoluteGravity(i4, i);
        int i5 = c6588oz.f39408d;
        if ((i5 & 7) == 0) {
            i5 |= 8388611;
        }
        if ((i5 & 112) == 0) {
            i5 |= 48;
        }
        int absoluteGravity2 = Gravity.getAbsoluteGravity(i5, i);
        int i6 = absoluteGravity & 7;
        int i7 = absoluteGravity & 112;
        int i8 = absoluteGravity2 & 7;
        int i9 = absoluteGravity2 & 112;
        int iWidth = i8 != 1 ? i8 != 5 ? rect.left : rect.right : rect.left + (rect.width() / 2);
        int iHeight = i9 != 16 ? i9 != 80 ? rect.top : rect.bottom : rect.top + (rect.height() / 2);
        if (i6 == 1) {
            iWidth -= i2 / 2;
        } else if (i6 != 5) {
            iWidth -= i2;
        }
        if (i7 == 16) {
            iHeight -= i3 / 2;
        } else if (i7 != 80) {
            iHeight -= i3;
        }
        rect2.set(iWidth, iHeight, i2 + iWidth, i3 + iHeight);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: m */
    public static C6588oz m9961m(View view) {
        C6588oz c6588oz = (C6588oz) view.getLayoutParams();
        if (!c6588oz.f39406b) {
            if (view instanceof InterfaceC6334kz) {
                c6588oz.m23583b(((C4032f6) ((InterfaceC6334kz) view)).getBehavior());
                c6588oz.f39406b = true;
            } else {
                InterfaceC6460mz interfaceC6460mz = null;
                for (Class<?> superclass = view.getClass(); superclass != null; superclass = superclass.getSuperclass()) {
                    interfaceC6460mz = (InterfaceC6460mz) superclass.getAnnotation(InterfaceC6460mz.class);
                    if (interfaceC6460mz != null) {
                        break;
                    }
                }
                if (interfaceC6460mz != null) {
                    try {
                        c6588oz.m23583b((AbstractC6397lz) interfaceC6460mz.value().getDeclaredConstructor(null).newInstance(null));
                    } catch (Exception unused) {
                        interfaceC6460mz.value().getClass();
                    }
                }
                c6588oz.f39406b = true;
            }
        }
        return c6588oz;
    }

    /* renamed from: v */
    public static void m9962v(int i, View view) {
        C6588oz c6588oz = (C6588oz) view.getLayoutParams();
        int i2 = c6588oz.f39413i;
        if (i2 != i) {
            WeakHashMap weakHashMap = AbstractC10944rk1.f41842a;
            view.offsetLeftAndRight(i - i2);
            c6588oz.f39413i = i;
        }
    }

    /* renamed from: w */
    public static void m9963w(int i, View view) {
        C6588oz c6588oz = (C6588oz) view.getLayoutParams();
        int i2 = c6588oz.f39414j;
        if (i2 != i) {
            WeakHashMap weakHashMap = AbstractC10944rk1.f41842a;
            view.offsetTopAndBottom(i - i2);
            c6588oz.f39414j = i;
        }
    }

    @Override // p000.InterfaceC7718Hu0
    /* renamed from: a */
    public final void mo3641a(int i, View view) {
        C11649xG0 c11649xG0 = this.f16088r;
        if (i == 1) {
            c11649xG0.f45509c = 0;
        } else {
            c11649xG0.f45508b = 0;
        }
        int childCount = getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = getChildAt(i2);
            C6588oz c6588oz = (C6588oz) childAt.getLayoutParams();
            if (c6588oz.m23582a(i)) {
                AbstractC6397lz abstractC6397lz = c6588oz.f39405a;
                if (abstractC6397lz != null) {
                    abstractC6397lz.mo11175q(this, childAt, view, i);
                }
                if (i == 0) {
                    c6588oz.f39417m = false;
                } else if (i == 1) {
                    c6588oz.f39418n = false;
                }
                c6588oz.f39419o = false;
            }
        }
        this.f16080j = null;
    }

    @Override // p000.InterfaceC7770Iu0
    /* renamed from: b */
    public final void mo4065b(View view, int i, int i2, int i3, int i4, int i5, int[] iArr) {
        AbstractC6397lz abstractC6397lz;
        int childCount = getChildCount();
        boolean z = false;
        int iMax = 0;
        int iMax2 = 0;
        for (int i6 = 0; i6 < childCount; i6++) {
            View childAt = getChildAt(i6);
            if (childAt.getVisibility() != 8) {
                C6588oz c6588oz = (C6588oz) childAt.getLayoutParams();
                if (c6588oz.m23582a(i5) && (abstractC6397lz = c6588oz.f39405a) != null) {
                    int[] iArr2 = this.f16074d;
                    iArr2[0] = 0;
                    iArr2[1] = 0;
                    abstractC6397lz.mo11171l(this, childAt, i2, i3, i4, iArr2);
                    iMax = i3 > 0 ? Math.max(iMax, iArr2[0]) : Math.min(iMax, iArr2[0]);
                    iMax2 = i4 > 0 ? Math.max(iMax2, iArr2[1]) : Math.min(iMax2, iArr2[1]);
                    z = true;
                }
            }
        }
        iArr[0] = iArr[0] + iMax;
        iArr[1] = iArr[1] + iMax2;
        if (z) {
            m9969o(1);
        }
    }

    @Override // p000.InterfaceC7718Hu0
    /* renamed from: c */
    public final void mo3642c(View view, int i, int i2, int i3, int i4, int i5) {
        mo4065b(view, i, i2, i3, i4, 0, this.f16075e);
    }

    @Override // android.view.ViewGroup
    public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return (layoutParams instanceof C6588oz) && super.checkLayoutParams(layoutParams);
    }

    @Override // p000.InterfaceC7718Hu0
    /* renamed from: d */
    public final boolean mo3643d(View view, View view2, int i, int i2) {
        int childCount = getChildCount();
        boolean z = false;
        for (int i3 = 0; i3 < childCount; i3++) {
            View childAt = getChildAt(i3);
            if (childAt.getVisibility() != 8) {
                C6588oz c6588oz = (C6588oz) childAt.getLayoutParams();
                AbstractC6397lz abstractC6397lz = c6588oz.f39405a;
                if (abstractC6397lz != null) {
                    boolean zMo11174p = abstractC6397lz.mo11174p(this, childAt, view, i, i2);
                    z |= zMo11174p;
                    if (i2 == 0) {
                        c6588oz.f39417m = zMo11174p;
                    } else if (i2 == 1) {
                        c6588oz.f39418n = zMo11174p;
                    }
                } else if (i2 == 0) {
                    c6588oz.f39417m = false;
                } else if (i2 == 1) {
                    c6588oz.f39418n = false;
                }
            }
        }
        return z;
    }

    @Override // android.view.ViewGroup
    public final boolean drawChild(Canvas canvas, View view, long j) {
        AbstractC6397lz abstractC6397lz = ((C6588oz) view.getLayoutParams()).f39405a;
        if (abstractC6397lz != null) {
            abstractC6397lz.getClass();
        }
        return super.drawChild(canvas, view, j);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        int[] drawableState = getDrawableState();
        Drawable drawable = this.f16085o;
        if ((drawable == null || !drawable.isStateful()) ? false : drawable.setState(drawableState)) {
            invalidate();
        }
    }

    @Override // p000.InterfaceC7718Hu0
    /* renamed from: e */
    public final void mo3644e(View view, View view2, int i, int i2) {
        C11649xG0 c11649xG0 = this.f16088r;
        if (i2 == 1) {
            c11649xG0.f45509c = i;
        } else {
            c11649xG0.f45508b = i;
        }
        this.f16080j = view2;
        int childCount = getChildCount();
        for (int i3 = 0; i3 < childCount; i3++) {
            ((C6588oz) getChildAt(i3).getLayoutParams()).getClass();
        }
    }

    @Override // p000.InterfaceC7718Hu0
    /* renamed from: f */
    public final void mo3645f(View view, int i, int i2, int[] iArr, int i3) {
        AbstractC6397lz abstractC6397lz;
        int childCount = getChildCount();
        boolean z = false;
        int iMax = 0;
        int iMax2 = 0;
        for (int i4 = 0; i4 < childCount; i4++) {
            View childAt = getChildAt(i4);
            if (childAt.getVisibility() != 8) {
                C6588oz c6588oz = (C6588oz) childAt.getLayoutParams();
                if (c6588oz.m23582a(i3) && (abstractC6397lz = c6588oz.f39405a) != null) {
                    int[] iArr2 = this.f16074d;
                    iArr2[0] = 0;
                    iArr2[1] = 0;
                    abstractC6397lz.mo11170k(this, childAt, view, i, i2, iArr2, i3);
                    iMax = i > 0 ? Math.max(iMax, iArr2[0]) : Math.min(iMax, iArr2[0]);
                    iMax2 = i2 > 0 ? Math.max(iMax2, iArr2[1]) : Math.min(iMax2, iArr2[1]);
                    z = true;
                }
            }
        }
        iArr[0] = iMax;
        iArr[1] = iMax2;
        if (z) {
            m9969o(1);
        }
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new C6588oz(-2, -2);
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new C6588oz(getContext(), attributeSet);
    }

    public final List<View> getDependencySortedChildren() {
        m9974t();
        return Collections.unmodifiableList(this.f16071a);
    }

    public final C8433Vn1 getLastWindowInsets() {
        return this.f16083m;
    }

    @Override // android.view.ViewGroup
    public int getNestedScrollAxes() {
        C11649xG0 c11649xG0 = this.f16088r;
        return c11649xG0.f45509c | c11649xG0.f45508b;
    }

    public Drawable getStatusBarBackground() {
        return this.f16085o;
    }

    @Override // android.view.View
    public int getSuggestedMinimumHeight() {
        return Math.max(super.getSuggestedMinimumHeight(), getPaddingBottom() + getPaddingTop());
    }

    @Override // android.view.View
    public int getSuggestedMinimumWidth() {
        return Math.max(super.getSuggestedMinimumWidth(), getPaddingRight() + getPaddingLeft());
    }

    /* renamed from: h */
    public final void m9964h(C6588oz c6588oz, Rect rect, int i, int i2) {
        int width = getWidth();
        int height = getHeight();
        int iMax = Math.max(getPaddingLeft() + ((ViewGroup.MarginLayoutParams) c6588oz).leftMargin, Math.min(rect.left, ((width - getPaddingRight()) - i) - ((ViewGroup.MarginLayoutParams) c6588oz).rightMargin));
        int iMax2 = Math.max(getPaddingTop() + ((ViewGroup.MarginLayoutParams) c6588oz).topMargin, Math.min(rect.top, ((height - getPaddingBottom()) - i2) - ((ViewGroup.MarginLayoutParams) c6588oz).bottomMargin));
        rect.set(iMax, iMax2, i + iMax, i2 + iMax2);
    }

    /* renamed from: i */
    public final void m9965i(View view, Rect rect, boolean z) {
        if (view.isLayoutRequested() || view.getVisibility() == 8) {
            rect.setEmpty();
        } else if (z) {
            m9967k(view, rect);
        } else {
            rect.set(view.getLeft(), view.getTop(), view.getRight(), view.getBottom());
        }
    }

    /* renamed from: j */
    public final List m9966j(View view) {
        L01 l01 = (L01) this.f16072b.f8628b;
        int i = l01.f6450c;
        ArrayList arrayList = null;
        for (int i2 = 0; i2 < i; i2++) {
            ArrayList arrayList2 = (ArrayList) l01.m4831m(i2);
            if (arrayList2 != null && arrayList2.contains(view)) {
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                arrayList.add(l01.m4827i(i2));
            }
        }
        return arrayList == null ? Collections.emptyList() : arrayList;
    }

    /* renamed from: k */
    public final void m9967k(View view, Rect rect) {
        ThreadLocal threadLocal = AbstractC7335Ak1.f347a;
        rect.set(0, 0, view.getWidth(), view.getHeight());
        ThreadLocal threadLocal2 = AbstractC7335Ak1.f347a;
        Matrix matrix = (Matrix) threadLocal2.get();
        if (matrix == null) {
            matrix = new Matrix();
            threadLocal2.set(matrix);
        } else {
            matrix.reset();
        }
        AbstractC7335Ak1.m314a(this, view, matrix);
        ThreadLocal threadLocal3 = AbstractC7335Ak1.f348b;
        RectF rectF = (RectF) threadLocal3.get();
        if (rectF == null) {
            rectF = new RectF();
            threadLocal3.set(rectF);
        }
        rectF.set(rect);
        matrix.mapRect(rectF);
        rect.set((int) (rectF.left + 0.5f), (int) (rectF.top + 0.5f), (int) (rectF.right + 0.5f), (int) (rectF.bottom + 0.5f));
    }

    /* renamed from: n */
    public final boolean m9968n(View view, int i, int i2) {
        C10107lC0 c10107lC0 = f16070w;
        Rect rectM9959g = m9959g();
        m9967k(view, rectM9959g);
        try {
            return rectM9959g.contains(i, i2);
        } finally {
            rectM9959g.setEmpty();
            c10107lC0.mo4580d(rectM9959g);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:185:0x00e5  */
    /* JADX WARN: Removed duplicated region for block: B:262:0x029b  */
    /* JADX WARN: Removed duplicated region for block: B:265:0x02a7  */
    /* JADX WARN: Removed duplicated region for block: B:270:0x02cd  */
    /* JADX WARN: Removed duplicated region for block: B:274:0x02d8  */
    /* JADX WARN: Removed duplicated region for block: B:296:0x0044 A[EDGE_INSN: B:296:0x0044->B:160:0x0044 BREAK  A[LOOP:2: B:272:0x02d4->B:289:0x030d], SYNTHETIC] */
    /* renamed from: o */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void m9969o(int r26) {
        /*
            Method dump skipped, instructions count: 824
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.coordinatorlayout.widget.CoordinatorLayout.m9969o(int):void");
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        m9975u();
        if (this.f16082l) {
            if (this.f16081k == null) {
                this.f16081k = new ViewTreeObserverOnPreDrawListenerC6651pz(0, this);
            }
            getViewTreeObserver().addOnPreDrawListener(this.f16081k);
        }
        if (this.f16083m == null) {
            WeakHashMap weakHashMap = AbstractC10944rk1.f41842a;
            if (getFitsSystemWindows()) {
                AbstractC9280ek1.m18029c(this);
            }
        }
        this.f16077g = true;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        m9975u();
        if (this.f16082l && this.f16081k != null) {
            getViewTreeObserver().removeOnPreDrawListener(this.f16081k);
        }
        View view = this.f16080j;
        if (view != null) {
            mo3641a(0, view);
        }
        this.f16077g = false;
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (!this.f16084n || this.f16085o == null) {
            return;
        }
        C8433Vn1 c8433Vn1 = this.f16083m;
        int iM8555d = c8433Vn1 != null ? c8433Vn1.m8555d() : 0;
        if (iM8555d > 0) {
            this.f16085o.setBounds(0, 0, getWidth(), iM8555d);
            this.f16085o.draw(canvas);
        }
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            m9975u();
        }
        boolean zM9973s = m9973s(motionEvent, 0);
        if (actionMasked == 1 || actionMasked == 3) {
            this.f16079i = null;
            m9975u();
        }
        return zM9973s;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        AbstractC6397lz abstractC6397lz;
        WeakHashMap weakHashMap = AbstractC10944rk1.f41842a;
        int layoutDirection = getLayoutDirection();
        ArrayList arrayList = this.f16071a;
        int size = arrayList.size();
        for (int i5 = 0; i5 < size; i5++) {
            View view = (View) arrayList.get(i5);
            if (view.getVisibility() != 8 && ((abstractC6397lz = ((C6588oz) view.getLayoutParams()).f39405a) == null || !abstractC6397lz.mo9810h(this, view, layoutDirection))) {
                m9970p(layoutDirection, view);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:163:0x0101  */
    /* JADX WARN: Removed duplicated region for block: B:172:0x0122 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:173:0x0124  */
    /* JADX WARN: Removed duplicated region for block: B:184:0x016d  */
    /* JADX WARN: Removed duplicated region for block: B:187:0x0175  */
    /* JADX WARN: Removed duplicated region for block: B:190:0x0196  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void onMeasure(int r31, int r32) {
        /*
            Method dump skipped, instructions count: 523
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.coordinatorlayout.widget.CoordinatorLayout.onMeasure(int, int):void");
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onNestedFling(View view, float f, float f2, boolean z) {
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            if (childAt.getVisibility() != 8) {
                C6588oz c6588oz = (C6588oz) childAt.getLayoutParams();
                if (c6588oz.m23582a(0)) {
                    AbstractC6397lz abstractC6397lz = c6588oz.f39405a;
                }
            }
        }
        return false;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onNestedPreFling(View view, float f, float f2) {
        AbstractC6397lz abstractC6397lz;
        int childCount = getChildCount();
        boolean zMo11207j = false;
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            if (childAt.getVisibility() != 8) {
                C6588oz c6588oz = (C6588oz) childAt.getLayoutParams();
                if (c6588oz.m23582a(0) && (abstractC6397lz = c6588oz.f39405a) != null) {
                    zMo11207j |= abstractC6397lz.mo11207j(view);
                }
            }
        }
        return zMo11207j;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedPreScroll(View view, int i, int i2, int[] iArr) {
        mo3645f(view, i, i2, iArr, 0);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedScroll(View view, int i, int i2, int i3, int i4) {
        mo3642c(view, i, i2, i3, i4, 0);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedScrollAccepted(View view, View view2, int i) {
        mo3644e(view, view2, i, 0);
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        Parcelable parcelable2;
        if (!(parcelable instanceof C6714qz)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        C6714qz c6714qz = (C6714qz) parcelable;
        super.onRestoreInstanceState(c6714qz.f44064a);
        SparseArray sparseArray = c6714qz.f41276c;
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            int id = childAt.getId();
            AbstractC6397lz abstractC6397lz = m9961m(childAt).f39405a;
            if (id != -1 && abstractC6397lz != null && (parcelable2 = (Parcelable) sparseArray.get(id)) != null) {
                abstractC6397lz.mo11172n(childAt, parcelable2);
            }
        }
    }

    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        Parcelable parcelableMo11173o;
        C6714qz c6714qz = new C6714qz(super.onSaveInstanceState());
        SparseArray sparseArray = new SparseArray();
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            int id = childAt.getId();
            AbstractC6397lz abstractC6397lz = ((C6588oz) childAt.getLayoutParams()).f39405a;
            if (id != -1 && abstractC6397lz != null && (parcelableMo11173o = abstractC6397lz.mo11173o(childAt)) != null) {
                sparseArray.append(id, parcelableMo11173o);
            }
        }
        c6714qz.f41276c = sparseArray;
        return c6714qz;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onStartNestedScroll(View view, View view2, int i) {
        return mo3643d(view, view2, i, 0);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onStopNestedScroll(View view) {
        mo3641a(0, view);
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        boolean zM9973s;
        int actionMasked = motionEvent.getActionMasked();
        View view = this.f16079i;
        boolean z = false;
        if (view != null) {
            AbstractC6397lz abstractC6397lz = ((C6588oz) view.getLayoutParams()).f39405a;
            zM9973s = abstractC6397lz != null ? abstractC6397lz.mo11176r(this, this.f16079i, motionEvent) : false;
        } else {
            zM9973s = m9973s(motionEvent, 1);
            if (actionMasked != 0 && zM9973s) {
                z = true;
            }
        }
        if (this.f16079i == null || actionMasked == 3) {
            zM9973s |= super.onTouchEvent(motionEvent);
        } else if (z) {
            MotionEvent motionEventObtain = MotionEvent.obtain(motionEvent);
            motionEventObtain.setAction(3);
            super.onTouchEvent(motionEventObtain);
            motionEventObtain.recycle();
        }
        if (actionMasked == 1 || actionMasked == 3) {
            this.f16079i = null;
            m9975u();
        }
        return zM9973s;
    }

    /* JADX WARN: Removed duplicated region for block: B:106:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x00b6  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x00bd  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x00c4  */
    /* renamed from: p */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void m9970p(int r13, android.view.View r14) {
        /*
            Method dump skipped, instructions count: 425
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.coordinatorlayout.widget.CoordinatorLayout.m9970p(int, android.view.View):void");
    }

    /* renamed from: q */
    public final void m9971q(View view, int i, int i2, int i3) {
        measureChildWithMargins(view, i, i2, i3, 0);
    }

    /* renamed from: r */
    public final boolean m9972r(AbstractC6397lz abstractC6397lz, View view, MotionEvent motionEvent, int i) {
        if (i == 0) {
            return abstractC6397lz.mo11168g(this, view, motionEvent);
        }
        if (i == 1) {
            return abstractC6397lz.mo11176r(this, view, motionEvent);
        }
        throw new IllegalArgumentException();
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean requestChildRectangleOnScreen(View view, Rect rect, boolean z) {
        AbstractC6397lz abstractC6397lz = ((C6588oz) view.getLayoutParams()).f39405a;
        if (abstractC6397lz == null || !abstractC6397lz.mo11185m(this, view, rect, z)) {
            return super.requestChildRectangleOnScreen(view, rect, z);
        }
        return true;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void requestDisallowInterceptTouchEvent(boolean z) {
        super.requestDisallowInterceptTouchEvent(z);
        if (!z || this.f16076f) {
            return;
        }
        if (this.f16079i == null) {
            int childCount = getChildCount();
            MotionEvent motionEventObtain = null;
            for (int i = 0; i < childCount; i++) {
                View childAt = getChildAt(i);
                AbstractC6397lz abstractC6397lz = ((C6588oz) childAt.getLayoutParams()).f39405a;
                if (abstractC6397lz != null) {
                    if (motionEventObtain == null) {
                        long jUptimeMillis = SystemClock.uptimeMillis();
                        motionEventObtain = MotionEvent.obtain(jUptimeMillis, jUptimeMillis, 3, 0.0f, 0.0f, 0);
                    }
                    abstractC6397lz.mo11168g(this, childAt, motionEventObtain);
                }
            }
            if (motionEventObtain != null) {
                motionEventObtain.recycle();
            }
        }
        m9975u();
        this.f16076f = true;
    }

    /* renamed from: s */
    public final boolean m9973s(MotionEvent motionEvent, int i) {
        int actionMasked = motionEvent.getActionMasked();
        ArrayList arrayList = this.f16073c;
        arrayList.clear();
        boolean zIsChildrenDrawingOrderEnabled = isChildrenDrawingOrderEnabled();
        int childCount = getChildCount();
        for (int i2 = childCount - 1; i2 >= 0; i2--) {
            arrayList.add(getChildAt(zIsChildrenDrawingOrderEnabled ? getChildDrawingOrder(childCount, i2) : i2));
        }
        C8774aq0 c8774aq0 = f16069v;
        if (c8774aq0 != null) {
            Collections.sort(arrayList, c8774aq0);
        }
        int size = arrayList.size();
        MotionEvent motionEventObtain = null;
        boolean zM9972r = false;
        for (int i3 = 0; i3 < size; i3++) {
            View view = (View) arrayList.get(i3);
            AbstractC6397lz abstractC6397lz = ((C6588oz) view.getLayoutParams()).f39405a;
            if (zM9972r && actionMasked != 0) {
                if (abstractC6397lz != null) {
                    if (motionEventObtain == null) {
                        motionEventObtain = MotionEvent.obtain(motionEvent);
                        motionEventObtain.setAction(3);
                    }
                    m9972r(abstractC6397lz, view, motionEventObtain, i);
                }
            } else if (!zM9972r && abstractC6397lz != null && (zM9972r = m9972r(abstractC6397lz, view, motionEvent, i))) {
                this.f16079i = view;
                if (actionMasked != 3 && actionMasked != 1) {
                    for (int i4 = 0; i4 < i3; i4++) {
                        View view2 = (View) arrayList.get(i4);
                        AbstractC6397lz abstractC6397lz2 = ((C6588oz) view2.getLayoutParams()).f39405a;
                        if (abstractC6397lz2 != null) {
                            if (motionEventObtain == null) {
                                motionEventObtain = MotionEvent.obtain(motionEvent);
                                motionEventObtain.setAction(3);
                            }
                            m9972r(abstractC6397lz2, view2, motionEventObtain, i);
                        }
                    }
                }
            }
        }
        arrayList.clear();
        if (motionEventObtain != null) {
            motionEventObtain.recycle();
        }
        return zM9972r;
    }

    @Override // android.view.View
    public void setFitsSystemWindows(boolean z) {
        super.setFitsSystemWindows(z);
        m9976x();
    }

    @Override // android.view.ViewGroup
    public void setOnHierarchyChangeListener(ViewGroup.OnHierarchyChangeListener onHierarchyChangeListener) {
        this.f16086p = onHierarchyChangeListener;
    }

    public void setStatusBarBackground(Drawable drawable) {
        Drawable drawable2 = this.f16085o;
        if (drawable2 != drawable) {
            if (drawable2 != null) {
                drawable2.setCallback(null);
            }
            Drawable drawableMutate = drawable != null ? drawable.mutate() : null;
            this.f16085o = drawableMutate;
            if (drawableMutate != null) {
                if (drawableMutate.isStateful()) {
                    this.f16085o.setState(getDrawableState());
                }
                Drawable drawable3 = this.f16085o;
                WeakHashMap weakHashMap = AbstractC10944rk1.f41842a;
                AbstractC4236iL.m19004b(drawable3, getLayoutDirection());
                this.f16085o.setVisible(getVisibility() == 0, false);
                this.f16085o.setCallback(this);
            }
            WeakHashMap weakHashMap2 = AbstractC10944rk1.f41842a;
            postInvalidateOnAnimation();
        }
    }

    public void setStatusBarBackgroundColor(int i) {
        setStatusBarBackground(new ColorDrawable(i));
    }

    public void setStatusBarBackgroundResource(int i) {
        setStatusBarBackground(i != 0 ? AbstractC0628Jy.m4480b(getContext(), i) : null);
    }

    @Override // android.view.View
    public void setVisibility(int i) {
        super.setVisibility(i);
        boolean z = i == 0;
        Drawable drawable = this.f16085o;
        if (drawable == null || drawable.isVisible() == z) {
            return;
        }
        this.f16085o.setVisible(z, false);
    }

    /* JADX WARN: Removed duplicated region for block: B:159:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:179:0x00bd  */
    /* JADX WARN: Removed duplicated region for block: B:200:0x0106  */
    /* renamed from: t */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void m9974t() {
        /*
            Method dump skipped, instructions count: 402
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.coordinatorlayout.widget.CoordinatorLayout.m9974t():void");
    }

    /* renamed from: u */
    public final void m9975u() {
        View view = this.f16079i;
        if (view != null) {
            AbstractC6397lz abstractC6397lz = ((C6588oz) view.getLayoutParams()).f39405a;
            if (abstractC6397lz != null) {
                long jUptimeMillis = SystemClock.uptimeMillis();
                MotionEvent motionEventObtain = MotionEvent.obtain(jUptimeMillis, jUptimeMillis, 3, 0.0f, 0.0f, 0);
                abstractC6397lz.mo11176r(this, this.f16079i, motionEventObtain);
                motionEventObtain.recycle();
            }
            this.f16079i = null;
        }
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            ((C6588oz) getChildAt(i).getLayoutParams()).getClass();
        }
        this.f16076f = false;
    }

    @Override // android.view.View
    public final boolean verifyDrawable(Drawable drawable) {
        return super.verifyDrawable(drawable) || drawable == this.f16085o;
    }

    /* renamed from: x */
    public final void m9976x() {
        WeakHashMap weakHashMap = AbstractC10944rk1.f41842a;
        if (!getFitsSystemWindows()) {
            AbstractC9536gk1.m18626u(this, null);
            return;
        }
        if (this.f16087q == null) {
            this.f16087q = new C1643a6(2, this);
        }
        AbstractC9536gk1.m18626u(this, this.f16087q);
        setSystemUiVisibility(1280);
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof C6588oz ? new C6588oz((C6588oz) layoutParams) : layoutParams instanceof ViewGroup.MarginLayoutParams ? new C6588oz((ViewGroup.MarginLayoutParams) layoutParams) : new C6588oz(layoutParams);
    }
}
