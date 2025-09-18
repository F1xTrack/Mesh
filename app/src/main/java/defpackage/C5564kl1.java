package defpackage;

import android.content.res.TypedArray;
import android.graphics.Rect;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.view.Gravity;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityNodeInfo;
import java.util.ArrayList;

/* renamed from: kl1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C5564kl1 extends ViewGroup {
    public final Rect a;
    public final Rect b;
    public final C2576cl1 c;
    public int d;
    public boolean e;
    public final C2386bl1 f;
    public final C3642el1 g;
    public int h;
    public Parcelable i;
    public final C4405il1 j;
    public final C4215hl1 k;
    public final LW0 l;
    public final C2576cl1 m;
    public final QQ0 n;
    public final C1343Qz0 o;
    public AbstractC7784wO0 p;
    public boolean q;
    public boolean r;
    public int s;
    public final C1155Oo1 t;

    public C5564kl1(S91 s91) {
        super(s91);
        this.a = new Rect();
        this.b = new Rect();
        C2576cl1 c2576cl1 = new C2576cl1();
        this.c = c2576cl1;
        this.e = false;
        this.f = new C2386bl1(0, this);
        this.h = -1;
        this.p = null;
        this.q = false;
        this.r = true;
        this.s = -1;
        C1155Oo1 c1155Oo1 = new C1155Oo1();
        c1155Oo1.d = this;
        c1155Oo1.a = new C5996n11(6, c1155Oo1);
        c1155Oo1.b = new C5826m71(4, c1155Oo1);
        this.t = c1155Oo1;
        C4405il1 c4405il1 = new C4405il1(this, s91);
        this.j = c4405il1;
        c4405il1.setId(View.generateViewId());
        this.j.setDescendantFocusability(131072);
        C3642el1 c3642el1 = new C3642el1(this);
        this.g = c3642el1;
        this.j.setLayoutManager(c3642el1);
        this.j.setScrollingTouchSlop(1);
        int[] iArr = KG0.a;
        TypedArray typedArrayObtainStyledAttributes = s91.obtainStyledAttributes((AttributeSet) null, iArr);
        AbstractC6897rk1.m(this, s91, iArr, null, typedArrayObtainStyledAttributes, 0, 0);
        try {
            setOrientation(typedArrayObtainStyledAttributes.getInt(0, 0));
            typedArrayObtainStyledAttributes.recycle();
            this.j.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
            C4405il1 c4405il12 = this.j;
            C3452dl1 c3452dl1 = new C3452dl1();
            if (c4405il12.C == null) {
                c4405il12.C = new ArrayList();
            }
            c4405il12.C.add(c3452dl1);
            LW0 lw0 = new LW0(this);
            this.l = lw0;
            this.n = new QQ0(lw0);
            C4215hl1 c4215hl1 = new C4215hl1(this);
            this.k = c4215hl1;
            c4215hl1.a(this.j);
            this.j.j(this.l);
            C2576cl1 c2576cl12 = new C2576cl1();
            this.m = c2576cl12;
            this.l.a = c2576cl12;
            C2576cl1 c2576cl13 = new C2576cl1(this, 0);
            C2576cl1 c2576cl14 = new C2576cl1(this, 1);
            ((ArrayList) c2576cl12.b).add(c2576cl13);
            ((ArrayList) this.m.b).add(c2576cl14);
            C1155Oo1 c1155Oo12 = this.t;
            C4405il1 c4405il13 = this.j;
            c1155Oo12.getClass();
            c4405il13.setImportantForAccessibility(2);
            c1155Oo12.c = new C2386bl1(1, c1155Oo12);
            C5564kl1 c5564kl1 = (C5564kl1) c1155Oo12.d;
            if (c5564kl1.getImportantForAccessibility() == 0) {
                c5564kl1.setImportantForAccessibility(1);
            }
            ((ArrayList) this.m.b).add(c2576cl1);
            C1343Qz0 c1343Qz0 = new C1343Qz0(this.g);
            this.o = c1343Qz0;
            ((ArrayList) this.m.b).add(c1343Qz0);
            C4405il1 c4405il14 = this.j;
            attachViewToParent(c4405il14, 0, c4405il14.getLayoutParams());
        } catch (Throwable th) {
            typedArrayObtainStyledAttributes.recycle();
            throw th;
        }
    }

    public final void a() {
        AbstractC6830rO0 adapter;
        if (this.h == -1 || (adapter = getAdapter()) == null) {
            return;
        }
        if (this.i != null) {
            this.i = null;
        }
        int iMax = Math.max(0, Math.min(this.h, adapter.a() - 1));
        this.d = iMax;
        this.h = -1;
        this.j.g0(iMax);
        this.t.z();
    }

    public final void b(int i, boolean z) {
        Object obj = this.n.a;
        c(i, z);
    }

    public final void c(int i, boolean z) {
        AbstractC8354zO0 abstractC8354zO0;
        C2576cl1 c2576cl1;
        AbstractC6830rO0 adapter = getAdapter();
        if (adapter == null) {
            if (this.h != -1) {
                this.h = Math.max(i, 0);
                return;
            }
            return;
        }
        if (adapter.a() <= 0) {
            return;
        }
        int iMin = Math.min(Math.max(i, 0), adapter.a() - 1);
        int i2 = this.d;
        if (iMin == i2 && this.l.f == 0) {
            return;
        }
        if (iMin == i2 && z) {
            return;
        }
        double d = i2;
        this.d = iMin;
        this.t.z();
        LW0 lw0 = this.l;
        if (lw0.f != 0) {
            lw0.e();
            KW0 kw0 = lw0.g;
            d = kw0.b + kw0.a;
        }
        LW0 lw02 = this.l;
        lw02.getClass();
        lw02.e = z ? 2 : 3;
        boolean z2 = lw02.i != iMin;
        lw02.i = iMin;
        lw02.c(2);
        if (z2 && (c2576cl1 = lw02.a) != null) {
            c2576cl1.c(iMin);
        }
        if (!z) {
            this.j.g0(iMin);
            return;
        }
        double d2 = iMin;
        if (Math.abs(d2 - d) > 3.0d) {
            this.j.g0(d2 > d ? iMin - 3 : iMin + 3);
            C4405il1 c4405il1 = this.j;
            c4405il1.post(new RunnableC0677Il(iMin, c4405il1));
        } else {
            C4405il1 c4405il12 = this.j;
            if (c4405il12.x || (abstractC8354zO0 = c4405il12.n) == null) {
                return;
            }
            abstractC8354zO0.A0(c4405il12, iMin);
        }
    }

    @Override // android.view.View
    public final boolean canScrollHorizontally(int i) {
        return this.j.canScrollHorizontally(i);
    }

    @Override // android.view.View
    public final boolean canScrollVertically(int i) {
        return this.j.canScrollVertically(i);
    }

    public final void d() {
        C4215hl1 c4215hl1 = this.k;
        if (c4215hl1 == null) {
            throw new IllegalStateException("Design assumption violated.");
        }
        View viewE = c4215hl1.e(this.g);
        if (viewE == null) {
            return;
        }
        this.g.getClass();
        int iH = AbstractC8354zO0.H(viewE);
        if (iH != this.d && getScrollState() == 0) {
            this.m.c(iH);
        }
        this.e = false;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchRestoreInstanceState(SparseArray sparseArray) {
        Parcelable parcelable = (Parcelable) sparseArray.get(getId());
        if (parcelable instanceof C5373jl1) {
            int i = ((C5373jl1) parcelable).a;
            sparseArray.put(this.j.getId(), (Parcelable) sparseArray.get(i));
            sparseArray.remove(i);
        }
        super.dispatchRestoreInstanceState(sparseArray);
        a();
    }

    @Override // android.view.ViewGroup, android.view.View
    public CharSequence getAccessibilityClassName() {
        this.t.getClass();
        this.t.getClass();
        return "androidx.viewpager.widget.ViewPager";
    }

    public AbstractC6830rO0 getAdapter() {
        return this.j.getAdapter();
    }

    public int getCurrentItem() {
        return this.d;
    }

    public int getItemDecorationCount() {
        return this.j.getItemDecorationCount();
    }

    public int getOffscreenPageLimit() {
        return this.s;
    }

    public int getOrientation() {
        return this.g.p == 1 ? 1 : 0;
    }

    public int getPageSize() {
        int height;
        int paddingBottom;
        C4405il1 c4405il1 = this.j;
        if (getOrientation() == 0) {
            height = c4405il1.getWidth() - c4405il1.getPaddingLeft();
            paddingBottom = c4405il1.getPaddingRight();
        } else {
            height = c4405il1.getHeight() - c4405il1.getPaddingTop();
            paddingBottom = c4405il1.getPaddingBottom();
        }
        return height - paddingBottom;
    }

    public int getScrollState() {
        return this.l.f;
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        int iA;
        int iA2;
        int iA3;
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        C5564kl1 c5564kl1 = (C5564kl1) this.t.d;
        if (c5564kl1.getAdapter() == null) {
            iA = 0;
            iA2 = 0;
        } else if (c5564kl1.getOrientation() == 1) {
            iA = c5564kl1.getAdapter().a();
            iA2 = 1;
        } else {
            iA2 = c5564kl1.getAdapter().a();
            iA = 1;
        }
        accessibilityNodeInfo.setCollectionInfo(AccessibilityNodeInfo.CollectionInfo.obtain(iA, iA2, false, 0));
        AbstractC6830rO0 adapter = c5564kl1.getAdapter();
        if (adapter == null || (iA3 = adapter.a()) == 0 || !c5564kl1.r) {
            return;
        }
        if (c5564kl1.d > 0) {
            accessibilityNodeInfo.addAction(8192);
        }
        if (c5564kl1.d < iA3 - 1) {
            accessibilityNodeInfo.addAction(4096);
        }
        accessibilityNodeInfo.setScrollable(true);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int measuredWidth = this.j.getMeasuredWidth();
        int measuredHeight = this.j.getMeasuredHeight();
        int paddingLeft = getPaddingLeft();
        Rect rect = this.a;
        rect.left = paddingLeft;
        rect.right = (i3 - i) - getPaddingRight();
        rect.top = getPaddingTop();
        rect.bottom = (i4 - i2) - getPaddingBottom();
        Rect rect2 = this.b;
        Gravity.apply(8388659, measuredWidth, measuredHeight, rect, rect2);
        this.j.layout(rect2.left, rect2.top, rect2.right, rect2.bottom);
        if (this.e) {
            d();
        }
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        measureChild(this.j, i, i2);
        int measuredWidth = this.j.getMeasuredWidth();
        int measuredHeight = this.j.getMeasuredHeight();
        int measuredState = this.j.getMeasuredState();
        int paddingRight = getPaddingRight() + getPaddingLeft() + measuredWidth;
        int paddingBottom = getPaddingBottom() + getPaddingTop() + measuredHeight;
        setMeasuredDimension(View.resolveSizeAndState(Math.max(paddingRight, getSuggestedMinimumWidth()), i, measuredState), View.resolveSizeAndState(Math.max(paddingBottom, getSuggestedMinimumHeight()), i2, measuredState << 16));
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof C5373jl1)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        C5373jl1 c5373jl1 = (C5373jl1) parcelable;
        super.onRestoreInstanceState(c5373jl1.getSuperState());
        this.h = c5373jl1.b;
        this.i = c5373jl1.c;
    }

    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        C5373jl1 c5373jl1 = new C5373jl1(super.onSaveInstanceState());
        c5373jl1.a = this.j.getId();
        int i = this.h;
        if (i == -1) {
            i = this.d;
        }
        c5373jl1.b = i;
        Parcelable parcelable = this.i;
        if (parcelable != null) {
            c5373jl1.c = parcelable;
        } else {
            this.j.getAdapter();
        }
        return c5373jl1;
    }

    @Override // android.view.ViewGroup
    public final void onViewAdded(View view) {
        throw new IllegalStateException(C5564kl1.class.getSimpleName().concat(" does not support direct child views"));
    }

    @Override // android.view.View
    public final boolean performAccessibilityAction(int i, Bundle bundle) {
        this.t.getClass();
        if (i != 8192 && i != 4096) {
            return super.performAccessibilityAction(i, bundle);
        }
        C1155Oo1 c1155Oo1 = this.t;
        c1155Oo1.getClass();
        if (i != 8192 && i != 4096) {
            throw new IllegalStateException();
        }
        C5564kl1 c5564kl1 = (C5564kl1) c1155Oo1.d;
        int currentItem = i == 8192 ? c5564kl1.getCurrentItem() - 1 : c5564kl1.getCurrentItem() + 1;
        if (c5564kl1.r) {
            c5564kl1.c(currentItem, true);
        }
        return true;
    }

    public void setAdapter(AbstractC6830rO0 abstractC6830rO0) {
        AbstractC6830rO0 adapter = this.j.getAdapter();
        C1155Oo1 c1155Oo1 = this.t;
        if (adapter != null) {
            adapter.a.unregisterObserver((C2386bl1) c1155Oo1.c);
        } else {
            c1155Oo1.getClass();
        }
        C2386bl1 c2386bl1 = this.f;
        if (adapter != null) {
            adapter.a.unregisterObserver(c2386bl1);
        }
        this.j.setAdapter(abstractC6830rO0);
        this.d = 0;
        a();
        C1155Oo1 c1155Oo12 = this.t;
        c1155Oo12.z();
        if (abstractC6830rO0 != null) {
            abstractC6830rO0.a.registerObserver((C2386bl1) c1155Oo12.c);
        }
        if (abstractC6830rO0 != null) {
            abstractC6830rO0.a.registerObserver(c2386bl1);
        }
    }

    public void setCurrentItem(int i) {
        b(i, true);
    }

    @Override // android.view.View
    public void setLayoutDirection(int i) {
        super.setLayoutDirection(i);
        this.t.z();
    }

    public void setOffscreenPageLimit(int i) {
        if (i < 1 && i != -1) {
            throw new IllegalArgumentException("Offscreen page limit must be OFFSCREEN_PAGE_LIMIT_DEFAULT or a number > 0");
        }
        this.s = i;
        this.j.requestLayout();
    }

    public void setOrientation(int i) {
        this.g.d1(i);
        this.t.z();
    }

    public void setPageTransformer(InterfaceC4024gl1 interfaceC4024gl1) {
        if (interfaceC4024gl1 != null) {
            if (!this.q) {
                this.p = this.j.getItemAnimator();
                this.q = true;
            }
            this.j.setItemAnimator(null);
        } else if (this.q) {
            this.j.setItemAnimator(this.p);
            this.p = null;
            this.q = false;
        }
        C1343Qz0 c1343Qz0 = this.o;
        if (interfaceC4024gl1 == ((InterfaceC4024gl1) c1343Qz0.c)) {
            return;
        }
        c1343Qz0.c = interfaceC4024gl1;
        if (interfaceC4024gl1 == null) {
            return;
        }
        LW0 lw0 = this.l;
        lw0.e();
        KW0 kw0 = lw0.g;
        double d = kw0.b + kw0.a;
        int i = (int) d;
        float f = (float) (d - i);
        this.o.b(i, f, Math.round(getPageSize() * f));
    }

    public void setUserInputEnabled(boolean z) {
        this.r = z;
        this.t.z();
    }
}
