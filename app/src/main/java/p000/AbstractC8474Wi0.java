package p000;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.LinearLayout;

/* renamed from: Wi0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC8474Wi0 extends ViewGroup {

    /* renamed from: a */
    public boolean f13330a;

    /* renamed from: b */
    public int f13331b;

    /* renamed from: c */
    public int f13332c;

    /* renamed from: d */
    public int f13333d;

    /* renamed from: e */
    public int f13334e;

    /* renamed from: f */
    public int f13335f;

    /* renamed from: g */
    public float f13336g;

    /* renamed from: h */
    public boolean f13337h;

    /* renamed from: i */
    public int[] f13338i;

    /* renamed from: j */
    public int[] f13339j;

    /* renamed from: k */
    public Drawable f13340k;

    /* renamed from: l */
    public int f13341l;

    /* renamed from: m */
    public int f13342m;

    /* renamed from: n */
    public int f13343n;

    /* renamed from: o */
    public int f13344o;

    public AbstractC8474Wi0(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f13330a = true;
        this.f13331b = -1;
        this.f13332c = 0;
        this.f13334e = 8388659;
        int[] iArr = AbstractC8704aH0.f15436n;
        C8539Xo1 c8539Xo1M9117J = C8539Xo1.m9117J(context, attributeSet, iArr, i);
        AbstractC10944rk1.m24481m(this, context, iArr, attributeSet, (TypedArray) c8539Xo1M9117J.f13982c, i, 0);
        TypedArray typedArray = (TypedArray) c8539Xo1M9117J.f13982c;
        int i2 = typedArray.getInt(1, -1);
        if (i2 >= 0) {
            setOrientation(i2);
        }
        int i3 = typedArray.getInt(0, -1);
        if (i3 >= 0) {
            setGravity(i3);
        }
        boolean z = typedArray.getBoolean(2, true);
        if (!z) {
            setBaselineAligned(z);
        }
        this.f13336g = typedArray.getFloat(4, -1.0f);
        this.f13331b = typedArray.getInt(3, -1);
        this.f13337h = typedArray.getBoolean(7, false);
        setDividerDrawable(c8539Xo1M9117J.m9121C(5));
        this.f13343n = typedArray.getInt(8, 0);
        this.f13344o = typedArray.getDimensionPixelSize(6, 0);
        c8539Xo1M9117J.m9130M();
    }

    @Override // android.view.ViewGroup
    public boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof C8422Vi0;
    }

    /* renamed from: f */
    public final void m8833f(Canvas canvas, int i) {
        this.f13340k.setBounds(getPaddingLeft() + this.f13344o, i, (getWidth() - getPaddingRight()) - this.f13344o, this.f13342m + i);
        this.f13340k.draw(canvas);
    }

    /* renamed from: g */
    public final void m8834g(Canvas canvas, int i) {
        this.f13340k.setBounds(i, getPaddingTop() + this.f13344o, this.f13341l + i, (getHeight() - getPaddingBottom()) - this.f13344o);
        this.f13340k.draw(canvas);
    }

    @Override // android.view.View
    public int getBaseline() {
        int i;
        if (this.f13331b < 0) {
            return super.getBaseline();
        }
        int childCount = getChildCount();
        int i2 = this.f13331b;
        if (childCount <= i2) {
            throw new RuntimeException("mBaselineAlignedChildIndex of LinearLayout set to an index that is out of bounds.");
        }
        View childAt = getChildAt(i2);
        int baseline = childAt.getBaseline();
        if (baseline == -1) {
            if (this.f13331b == 0) {
                return -1;
            }
            throw new RuntimeException("mBaselineAlignedChildIndex of LinearLayout points to a View that doesn't know how to get its baseline.");
        }
        int bottom = this.f13332c;
        if (this.f13333d == 1 && (i = this.f13334e & 112) != 48) {
            if (i == 16) {
                bottom += ((((getBottom() - getTop()) - getPaddingTop()) - getPaddingBottom()) - this.f13335f) / 2;
            } else if (i == 80) {
                bottom = ((getBottom() - getTop()) - getPaddingBottom()) - this.f13335f;
            }
        }
        return bottom + ((LinearLayout.LayoutParams) ((C8422Vi0) childAt.getLayoutParams())).topMargin + baseline;
    }

    public int getBaselineAlignedChildIndex() {
        return this.f13331b;
    }

    public Drawable getDividerDrawable() {
        return this.f13340k;
    }

    public int getDividerPadding() {
        return this.f13344o;
    }

    public int getDividerWidth() {
        return this.f13341l;
    }

    public int getGravity() {
        return this.f13334e;
    }

    public int getOrientation() {
        return this.f13333d;
    }

    public int getShowDividers() {
        return this.f13343n;
    }

    public int getVirtualChildCount() {
        return getChildCount();
    }

    public float getWeightSum() {
        return this.f13336g;
    }

    @Override // android.view.ViewGroup
    /* renamed from: h, reason: merged with bridge method [inline-methods] */
    public C8422Vi0 generateDefaultLayoutParams() {
        int i = this.f13333d;
        if (i == 0) {
            return new C8422Vi0(-2, -2);
        }
        if (i == 1) {
            return new C8422Vi0(-1, -2);
        }
        return null;
    }

    @Override // android.view.ViewGroup
    /* renamed from: i, reason: merged with bridge method [inline-methods] */
    public C8422Vi0 generateLayoutParams(AttributeSet attributeSet) {
        return new C8422Vi0(getContext(), attributeSet);
    }

    @Override // android.view.ViewGroup
    /* renamed from: j, reason: merged with bridge method [inline-methods] */
    public C8422Vi0 generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof C8422Vi0 ? new C8422Vi0((C8422Vi0) layoutParams) : layoutParams instanceof ViewGroup.MarginLayoutParams ? new C8422Vi0((ViewGroup.MarginLayoutParams) layoutParams) : new C8422Vi0(layoutParams);
    }

    /* renamed from: k */
    public final boolean m8838k(int i) {
        if (i == 0) {
            return (this.f13343n & 1) != 0;
        }
        if (i == getChildCount()) {
            return (this.f13343n & 4) != 0;
        }
        if ((this.f13343n & 2) == 0) {
            return false;
        }
        for (int i2 = i - 1; i2 >= 0; i2--) {
            if (getChildAt(i2).getVisibility() != 8) {
                return true;
            }
        }
        return false;
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        int right;
        int left;
        int i;
        if (this.f13340k == null) {
            return;
        }
        int i2 = 0;
        if (this.f13333d == 1) {
            int virtualChildCount = getVirtualChildCount();
            while (i2 < virtualChildCount) {
                View childAt = getChildAt(i2);
                if (childAt != null && childAt.getVisibility() != 8 && m8838k(i2)) {
                    m8833f(canvas, (childAt.getTop() - ((LinearLayout.LayoutParams) ((C8422Vi0) childAt.getLayoutParams())).topMargin) - this.f13342m);
                }
                i2++;
            }
            if (m8838k(virtualChildCount)) {
                View childAt2 = getChildAt(virtualChildCount - 1);
                m8833f(canvas, childAt2 == null ? (getHeight() - getPaddingBottom()) - this.f13342m : childAt2.getBottom() + ((LinearLayout.LayoutParams) ((C8422Vi0) childAt2.getLayoutParams())).bottomMargin);
                return;
            }
            return;
        }
        int virtualChildCount2 = getVirtualChildCount();
        boolean z = AbstractC7337Al1.f354a;
        boolean z2 = getLayoutDirection() == 1;
        while (i2 < virtualChildCount2) {
            View childAt3 = getChildAt(i2);
            if (childAt3 != null && childAt3.getVisibility() != 8 && m8838k(i2)) {
                C8422Vi0 c8422Vi0 = (C8422Vi0) childAt3.getLayoutParams();
                m8834g(canvas, z2 ? childAt3.getRight() + ((LinearLayout.LayoutParams) c8422Vi0).rightMargin : (childAt3.getLeft() - ((LinearLayout.LayoutParams) c8422Vi0).leftMargin) - this.f13341l);
            }
            i2++;
        }
        if (m8838k(virtualChildCount2)) {
            View childAt4 = getChildAt(virtualChildCount2 - 1);
            if (childAt4 != null) {
                C8422Vi0 c8422Vi02 = (C8422Vi0) childAt4.getLayoutParams();
                if (z2) {
                    left = childAt4.getLeft() - ((LinearLayout.LayoutParams) c8422Vi02).leftMargin;
                    i = this.f13341l;
                    right = left - i;
                } else {
                    right = childAt4.getRight() + ((LinearLayout.LayoutParams) c8422Vi02).rightMargin;
                }
            } else if (z2) {
                right = getPaddingLeft();
            } else {
                left = getWidth() - getPaddingRight();
                i = this.f13341l;
                right = left - i;
            }
            m8834g(canvas, right);
        }
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        accessibilityEvent.setClassName("androidx.appcompat.widget.LinearLayoutCompat");
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName("androidx.appcompat.widget.LinearLayoutCompat");
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0156  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x015f  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x018f  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x01a1  */
    @Override // android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void onLayout(boolean r23, int r24, int r25, int r26, int r27) {
        /*
            Method dump skipped, instructions count: 461
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.AbstractC8474Wi0.onLayout(boolean, int, int, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:153:0x02f4  */
    /* JADX WARN: Removed duplicated region for block: B:213:0x0486  */
    /* JADX WARN: Removed duplicated region for block: B:214:0x048b  */
    /* JADX WARN: Removed duplicated region for block: B:217:0x04b3  */
    /* JADX WARN: Removed duplicated region for block: B:218:0x04b8  */
    /* JADX WARN: Removed duplicated region for block: B:221:0x04c0  */
    /* JADX WARN: Removed duplicated region for block: B:222:0x04cc  */
    /* JADX WARN: Removed duplicated region for block: B:224:0x04de  */
    /* JADX WARN: Removed duplicated region for block: B:230:0x04f2  */
    /* JADX WARN: Removed duplicated region for block: B:240:0x0537  */
    /* JADX WARN: Removed duplicated region for block: B:246:0x0548  */
    /* JADX WARN: Removed duplicated region for block: B:249:0x0550  */
    /* JADX WARN: Removed duplicated region for block: B:252:0x055b  */
    /* JADX WARN: Removed duplicated region for block: B:280:0x05e4  */
    /* JADX WARN: Removed duplicated region for block: B:313:0x0691  */
    /* JADX WARN: Removed duplicated region for block: B:315:0x0698  */
    /* JADX WARN: Removed duplicated region for block: B:318:0x06b4  */
    /* JADX WARN: Removed duplicated region for block: B:368:0x07cb  */
    /* JADX WARN: Removed duplicated region for block: B:381:0x0806  */
    /* JADX WARN: Removed duplicated region for block: B:388:0x083d  */
    /* JADX WARN: Removed duplicated region for block: B:391:0x0860  */
    /* JADX WARN: Removed duplicated region for block: B:442:? A[RETURN, SYNTHETIC] */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void onMeasure(int r38, int r39) {
        /*
            Method dump skipped, instructions count: 2208
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.AbstractC8474Wi0.onMeasure(int, int):void");
    }

    public void setBaselineAligned(boolean z) {
        this.f13330a = z;
    }

    public void setBaselineAlignedChildIndex(int i) {
        if (i >= 0 && i < getChildCount()) {
            this.f13331b = i;
            return;
        }
        throw new IllegalArgumentException("base aligned child index out of range (0, " + getChildCount() + ")");
    }

    public void setDividerDrawable(Drawable drawable) {
        if (drawable == this.f13340k) {
            return;
        }
        this.f13340k = drawable;
        if (drawable != null) {
            this.f13341l = drawable.getIntrinsicWidth();
            this.f13342m = drawable.getIntrinsicHeight();
        } else {
            this.f13341l = 0;
            this.f13342m = 0;
        }
        setWillNotDraw(drawable == null);
        requestLayout();
    }

    public void setDividerPadding(int i) {
        this.f13344o = i;
    }

    public void setGravity(int i) {
        if (this.f13334e != i) {
            if ((8388615 & i) == 0) {
                i |= 8388611;
            }
            if ((i & 112) == 0) {
                i |= 48;
            }
            this.f13334e = i;
            requestLayout();
        }
    }

    public void setHorizontalGravity(int i) {
        int i2 = i & 8388615;
        int i3 = this.f13334e;
        if ((8388615 & i3) != i2) {
            this.f13334e = i2 | ((-8388616) & i3);
            requestLayout();
        }
    }

    public void setMeasureWithLargestChildEnabled(boolean z) {
        this.f13337h = z;
    }

    public void setOrientation(int i) {
        if (this.f13333d != i) {
            this.f13333d = i;
            requestLayout();
        }
    }

    public void setShowDividers(int i) {
        if (i != this.f13343n) {
            requestLayout();
        }
        this.f13343n = i;
    }

    public void setVerticalGravity(int i) {
        int i2 = i & 112;
        int i3 = this.f13334e;
        if ((i3 & 112) != i2) {
            this.f13334e = i2 | (i3 & (-113));
            requestLayout();
        }
    }

    public void setWeightSum(float f) {
        this.f13336g = Math.max(0.0f, f);
    }

    @Override // android.view.ViewGroup
    public final boolean shouldDelayChildPressedState() {
        return false;
    }
}
