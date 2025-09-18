package p000;

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
public final class C10050kl1 extends ViewGroup {

    /* renamed from: a */
    public final Rect f36661a;

    /* renamed from: b */
    public final Rect f36662b;

    /* renamed from: c */
    public final C9021cl1 f36663c;

    /* renamed from: d */
    public int f36664d;

    /* renamed from: e */
    public boolean f36665e;

    /* renamed from: f */
    public final C8893bl1 f36666f;

    /* renamed from: g */
    public final C9282el1 f36667g;

    /* renamed from: h */
    public int f36668h;

    /* renamed from: i */
    public Parcelable f36669i;

    /* renamed from: j */
    public final C9794il1 f36670j;

    /* renamed from: k */
    public final C9666hl1 f36671k;

    /* renamed from: l */
    public final LW0 f36672l;

    /* renamed from: m */
    public final C9021cl1 f36673m;

    /* renamed from: n */
    public final QQ0 f36674n;

    /* renamed from: o */
    public final C8196Qz0 f36675o;

    /* renamed from: p */
    public AbstractC11538wO0 f36676p;

    /* renamed from: q */
    public boolean f36677q;

    /* renamed from: r */
    public boolean f36678r;

    /* renamed from: s */
    public int f36679s;

    /* renamed from: t */
    public final C8071Oo1 f36680t;

    public C10050kl1(S91 s91) {
        super(s91);
        this.f36661a = new Rect();
        this.f36662b = new Rect();
        C9021cl1 c9021cl1 = new C9021cl1();
        this.f36663c = c9021cl1;
        this.f36665e = false;
        this.f36666f = new C8893bl1(0, this);
        this.f36668h = -1;
        this.f36676p = null;
        this.f36677q = false;
        this.f36678r = true;
        this.f36679s = -1;
        C8071Oo1 c8071Oo1 = new C8071Oo1();
        c8071Oo1.f8630d = this;
        c8071Oo1.f8627a = new C10339n11(6, c8071Oo1);
        c8071Oo1.f8628b = new C10226m71(4, c8071Oo1);
        this.f36680t = c8071Oo1;
        C9794il1 c9794il1 = new C9794il1(this, s91);
        this.f36670j = c9794il1;
        c9794il1.setId(View.generateViewId());
        this.f36670j.setDescendantFocusability(131072);
        C9282el1 c9282el1 = new C9282el1(this);
        this.f36667g = c9282el1;
        this.f36670j.setLayoutManager(c9282el1);
        this.f36670j.setScrollingTouchSlop(1);
        int[] iArr = KG0.f5976a;
        TypedArray typedArrayObtainStyledAttributes = s91.obtainStyledAttributes((AttributeSet) null, iArr);
        AbstractC10944rk1.m24481m(this, s91, iArr, null, typedArrayObtainStyledAttributes, 0, 0);
        try {
            setOrientation(typedArrayObtainStyledAttributes.getInt(0, 0));
            typedArrayObtainStyledAttributes.recycle();
            this.f36670j.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
            C9794il1 c9794il12 = this.f36670j;
            C9154dl1 c9154dl1 = new C9154dl1();
            if (c9794il12.f16464C == null) {
                c9794il12.f16464C = new ArrayList();
            }
            c9794il12.f16464C.add(c9154dl1);
            LW0 lw0 = new LW0(this);
            this.f36672l = lw0;
            this.f36674n = new QQ0(lw0);
            C9666hl1 c9666hl1 = new C9666hl1(this);
            this.f36671k = c9666hl1;
            c9666hl1.m7138a(this.f36670j);
            this.f36670j.m10270j(this.f36672l);
            C9021cl1 c9021cl12 = new C9021cl1();
            this.f36673m = c9021cl12;
            this.f36672l.f6681a = c9021cl12;
            C9021cl1 c9021cl13 = new C9021cl1(this, 0);
            C9021cl1 c9021cl14 = new C9021cl1(this, 1);
            ((ArrayList) c9021cl12.f17733b).add(c9021cl13);
            ((ArrayList) this.f36673m.f17733b).add(c9021cl14);
            C8071Oo1 c8071Oo12 = this.f36680t;
            C9794il1 c9794il13 = this.f36670j;
            c8071Oo12.getClass();
            c9794il13.setImportantForAccessibility(2);
            c8071Oo12.f8629c = new C8893bl1(1, c8071Oo12);
            C10050kl1 c10050kl1 = (C10050kl1) c8071Oo12.f8630d;
            if (c10050kl1.getImportantForAccessibility() == 0) {
                c10050kl1.setImportantForAccessibility(1);
            }
            ((ArrayList) this.f36673m.f17733b).add(c9021cl1);
            C8196Qz0 c8196Qz0 = new C8196Qz0(this.f36667g);
            this.f36675o = c8196Qz0;
            ((ArrayList) this.f36673m.f17733b).add(c8196Qz0);
            C9794il1 c9794il14 = this.f36670j;
            attachViewToParent(c9794il14, 0, c9794il14.getLayoutParams());
        } catch (Throwable th) {
            typedArrayObtainStyledAttributes.recycle();
            throw th;
        }
    }

    /* renamed from: a */
    public final void m22261a() {
        AbstractC10899rO0 adapter;
        if (this.f36668h == -1 || (adapter = getAdapter()) == null) {
            return;
        }
        if (this.f36669i != null) {
            this.f36669i = null;
        }
        int iMax = Math.max(0, Math.min(this.f36668h, adapter.mo3173a() - 1));
        this.f36664d = iMax;
        this.f36668h = -1;
        this.f36670j.m10265g0(iMax);
        this.f36680t.m6159z();
    }

    /* renamed from: b */
    public final void m22262b(int i, boolean z) {
        Object obj = this.f36674n.f9619a;
        m22263c(i, z);
    }

    /* renamed from: c */
    public final void m22263c(int i, boolean z) {
        AbstractC11919zO0 abstractC11919zO0;
        C9021cl1 c9021cl1;
        AbstractC10899rO0 adapter = getAdapter();
        if (adapter == null) {
            if (this.f36668h != -1) {
                this.f36668h = Math.max(i, 0);
                return;
            }
            return;
        }
        if (adapter.mo3173a() <= 0) {
            return;
        }
        int iMin = Math.min(Math.max(i, 0), adapter.mo3173a() - 1);
        int i2 = this.f36664d;
        if (iMin == i2 && this.f36672l.f6686f == 0) {
            return;
        }
        if (iMin == i2 && z) {
            return;
        }
        double d = i2;
        this.f36664d = iMin;
        this.f36680t.m6159z();
        LW0 lw0 = this.f36672l;
        if (lw0.f6686f != 0) {
            lw0.m5014e();
            KW0 kw0 = lw0.f6687g;
            d = kw0.f6143b + kw0.f6142a;
        }
        LW0 lw02 = this.f36672l;
        lw02.getClass();
        lw02.f6685e = z ? 2 : 3;
        boolean z2 = lw02.f6689i != iMin;
        lw02.f6689i = iMin;
        lw02.m5012c(2);
        if (z2 && (c9021cl1 = lw02.f6681a) != null) {
            c9021cl1.mo6841c(iMin);
        }
        if (!z) {
            this.f36670j.m10265g0(iMin);
            return;
        }
        double d2 = iMin;
        if (Math.abs(d2 - d) > 3.0d) {
            this.f36670j.m10265g0(d2 > d ? iMin - 3 : iMin + 3);
            C9794il1 c9794il1 = this.f36670j;
            c9794il1.post(new RunnableC0552Il(iMin, c9794il1));
        } else {
            C9794il1 c9794il12 = this.f36670j;
            if (c9794il12.f16529x || (abstractC11919zO0 = c9794il12.f16512n) == null) {
                return;
            }
            abstractC11919zO0.mo9354A0(c9794il12, iMin);
        }
    }

    @Override // android.view.View
    public final boolean canScrollHorizontally(int i) {
        return this.f36670j.canScrollHorizontally(i);
    }

    @Override // android.view.View
    public final boolean canScrollVertically(int i) {
        return this.f36670j.canScrollVertically(i);
    }

    /* renamed from: d */
    public final void m22264d() {
        C9666hl1 c9666hl1 = this.f36671k;
        if (c9666hl1 == null) {
            throw new IllegalStateException("Design assumption violated.");
        }
        View viewMo7140e = c9666hl1.mo7140e(this.f36667g);
        if (viewMo7140e == null) {
            return;
        }
        this.f36667g.getClass();
        int iM26400H = AbstractC11919zO0.m26400H(viewMo7140e);
        if (iM26400H != this.f36664d && getScrollState() == 0) {
            this.f36673m.mo6841c(iM26400H);
        }
        this.f36665e = false;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchRestoreInstanceState(SparseArray sparseArray) {
        Parcelable parcelable = (Parcelable) sparseArray.get(getId());
        if (parcelable instanceof C9922jl1) {
            int i = ((C9922jl1) parcelable).f35368a;
            sparseArray.put(this.f36670j.getId(), (Parcelable) sparseArray.get(i));
            sparseArray.remove(i);
        }
        super.dispatchRestoreInstanceState(sparseArray);
        m22261a();
    }

    @Override // android.view.ViewGroup, android.view.View
    public CharSequence getAccessibilityClassName() {
        this.f36680t.getClass();
        this.f36680t.getClass();
        return "androidx.viewpager.widget.ViewPager";
    }

    public AbstractC10899rO0 getAdapter() {
        return this.f36670j.getAdapter();
    }

    public int getCurrentItem() {
        return this.f36664d;
    }

    public int getItemDecorationCount() {
        return this.f36670j.getItemDecorationCount();
    }

    public int getOffscreenPageLimit() {
        return this.f36679s;
    }

    public int getOrientation() {
        return this.f36667g.f16439p == 1 ? 1 : 0;
    }

    public int getPageSize() {
        int height;
        int paddingBottom;
        C9794il1 c9794il1 = this.f36670j;
        if (getOrientation() == 0) {
            height = c9794il1.getWidth() - c9794il1.getPaddingLeft();
            paddingBottom = c9794il1.getPaddingRight();
        } else {
            height = c9794il1.getHeight() - c9794il1.getPaddingTop();
            paddingBottom = c9794il1.getPaddingBottom();
        }
        return height - paddingBottom;
    }

    public int getScrollState() {
        return this.f36672l.f6686f;
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        int iMo3173a;
        int iMo3173a2;
        int iMo3173a3;
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        C10050kl1 c10050kl1 = (C10050kl1) this.f36680t.f8630d;
        if (c10050kl1.getAdapter() == null) {
            iMo3173a = 0;
            iMo3173a2 = 0;
        } else if (c10050kl1.getOrientation() == 1) {
            iMo3173a = c10050kl1.getAdapter().mo3173a();
            iMo3173a2 = 1;
        } else {
            iMo3173a2 = c10050kl1.getAdapter().mo3173a();
            iMo3173a = 1;
        }
        accessibilityNodeInfo.setCollectionInfo(AccessibilityNodeInfo.CollectionInfo.obtain(iMo3173a, iMo3173a2, false, 0));
        AbstractC10899rO0 adapter = c10050kl1.getAdapter();
        if (adapter == null || (iMo3173a3 = adapter.mo3173a()) == 0 || !c10050kl1.f36678r) {
            return;
        }
        if (c10050kl1.f36664d > 0) {
            accessibilityNodeInfo.addAction(8192);
        }
        if (c10050kl1.f36664d < iMo3173a3 - 1) {
            accessibilityNodeInfo.addAction(4096);
        }
        accessibilityNodeInfo.setScrollable(true);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int measuredWidth = this.f36670j.getMeasuredWidth();
        int measuredHeight = this.f36670j.getMeasuredHeight();
        int paddingLeft = getPaddingLeft();
        Rect rect = this.f36661a;
        rect.left = paddingLeft;
        rect.right = (i3 - i) - getPaddingRight();
        rect.top = getPaddingTop();
        rect.bottom = (i4 - i2) - getPaddingBottom();
        Rect rect2 = this.f36662b;
        Gravity.apply(8388659, measuredWidth, measuredHeight, rect, rect2);
        this.f36670j.layout(rect2.left, rect2.top, rect2.right, rect2.bottom);
        if (this.f36665e) {
            m22264d();
        }
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        measureChild(this.f36670j, i, i2);
        int measuredWidth = this.f36670j.getMeasuredWidth();
        int measuredHeight = this.f36670j.getMeasuredHeight();
        int measuredState = this.f36670j.getMeasuredState();
        int paddingRight = getPaddingRight() + getPaddingLeft() + measuredWidth;
        int paddingBottom = getPaddingBottom() + getPaddingTop() + measuredHeight;
        setMeasuredDimension(View.resolveSizeAndState(Math.max(paddingRight, getSuggestedMinimumWidth()), i, measuredState), View.resolveSizeAndState(Math.max(paddingBottom, getSuggestedMinimumHeight()), i2, measuredState << 16));
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof C9922jl1)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        C9922jl1 c9922jl1 = (C9922jl1) parcelable;
        super.onRestoreInstanceState(c9922jl1.getSuperState());
        this.f36668h = c9922jl1.f35369b;
        this.f36669i = c9922jl1.f35370c;
    }

    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        C9922jl1 c9922jl1 = new C9922jl1(super.onSaveInstanceState());
        c9922jl1.f35368a = this.f36670j.getId();
        int i = this.f36668h;
        if (i == -1) {
            i = this.f36664d;
        }
        c9922jl1.f35369b = i;
        Parcelable parcelable = this.f36669i;
        if (parcelable != null) {
            c9922jl1.f35370c = parcelable;
        } else {
            this.f36670j.getAdapter();
        }
        return c9922jl1;
    }

    @Override // android.view.ViewGroup
    public final void onViewAdded(View view) {
        throw new IllegalStateException(C10050kl1.class.getSimpleName().concat(" does not support direct child views"));
    }

    @Override // android.view.View
    public final boolean performAccessibilityAction(int i, Bundle bundle) {
        this.f36680t.getClass();
        if (i != 8192 && i != 4096) {
            return super.performAccessibilityAction(i, bundle);
        }
        C8071Oo1 c8071Oo1 = this.f36680t;
        c8071Oo1.getClass();
        if (i != 8192 && i != 4096) {
            throw new IllegalStateException();
        }
        C10050kl1 c10050kl1 = (C10050kl1) c8071Oo1.f8630d;
        int currentItem = i == 8192 ? c10050kl1.getCurrentItem() - 1 : c10050kl1.getCurrentItem() + 1;
        if (c10050kl1.f36678r) {
            c10050kl1.m22263c(currentItem, true);
        }
        return true;
    }

    public void setAdapter(AbstractC10899rO0 abstractC10899rO0) {
        AbstractC10899rO0 adapter = this.f36670j.getAdapter();
        C8071Oo1 c8071Oo1 = this.f36680t;
        if (adapter != null) {
            adapter.f41641a.unregisterObserver((C8893bl1) c8071Oo1.f8629c);
        } else {
            c8071Oo1.getClass();
        }
        C8893bl1 c8893bl1 = this.f36666f;
        if (adapter != null) {
            adapter.f41641a.unregisterObserver(c8893bl1);
        }
        this.f36670j.setAdapter(abstractC10899rO0);
        this.f36664d = 0;
        m22261a();
        C8071Oo1 c8071Oo12 = this.f36680t;
        c8071Oo12.m6159z();
        if (abstractC10899rO0 != null) {
            abstractC10899rO0.f41641a.registerObserver((C8893bl1) c8071Oo12.f8629c);
        }
        if (abstractC10899rO0 != null) {
            abstractC10899rO0.f41641a.registerObserver(c8893bl1);
        }
    }

    public void setCurrentItem(int i) {
        m22262b(i, true);
    }

    @Override // android.view.View
    public void setLayoutDirection(int i) {
        super.setLayoutDirection(i);
        this.f36680t.m6159z();
    }

    public void setOffscreenPageLimit(int i) {
        if (i < 1 && i != -1) {
            throw new IllegalArgumentException("Offscreen page limit must be OFFSCREEN_PAGE_LIMIT_DEFAULT or a number > 0");
        }
        this.f36679s = i;
        this.f36670j.requestLayout();
    }

    public void setOrientation(int i) {
        this.f36667g.m10211d1(i);
        this.f36680t.m6159z();
    }

    public void setPageTransformer(InterfaceC9538gl1 interfaceC9538gl1) {
        if (interfaceC9538gl1 != null) {
            if (!this.f36677q) {
                this.f36676p = this.f36670j.getItemAnimator();
                this.f36677q = true;
            }
            this.f36670j.setItemAnimator(null);
        } else if (this.f36677q) {
            this.f36670j.setItemAnimator(this.f36676p);
            this.f36676p = null;
            this.f36677q = false;
        }
        C8196Qz0 c8196Qz0 = this.f36675o;
        if (interfaceC9538gl1 == ((InterfaceC9538gl1) c8196Qz0.f9882c)) {
            return;
        }
        c8196Qz0.f9882c = interfaceC9538gl1;
        if (interfaceC9538gl1 == null) {
            return;
        }
        LW0 lw0 = this.f36672l;
        lw0.m5014e();
        KW0 kw0 = lw0.f6687g;
        double d = kw0.f6143b + kw0.f6142a;
        int i = (int) d;
        float f = (float) (d - i);
        this.f36675o.mo6840b(i, f, Math.round(getPageSize() * f));
    }

    public void setUserInputEnabled(boolean z) {
        this.f36678r = z;
        this.f36680t.m6159z();
    }
}
