package p000;

import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;

/* renamed from: Py0 */
/* loaded from: classes.dex */
public final class C8142Py0 {

    /* renamed from: a */
    public final AbstractC11919zO0 f9372a;

    /* renamed from: b */
    public int f9373b = Integer.MIN_VALUE;

    /* renamed from: c */
    public final Rect f9374c = new Rect();

    /* renamed from: d */
    public final /* synthetic */ int f9375d;

    public C8142Py0(AbstractC11919zO0 abstractC11919zO0, int i) {
        this.f9375d = i;
        this.f9372a = abstractC11919zO0;
    }

    /* renamed from: a */
    public static C8142Py0 m6492a(AbstractC11919zO0 abstractC11919zO0, int i) {
        if (i == 0) {
            return new C8142Py0(abstractC11919zO0, 0);
        }
        if (i == 1) {
            return new C8142Py0(abstractC11919zO0, 1);
        }
        throw new IllegalArgumentException("invalid orientation");
    }

    /* renamed from: b */
    public final int m6493b(View view) {
        switch (this.f9375d) {
            case 0:
                AO0 ao0 = (AO0) view.getLayoutParams();
                this.f9372a.getClass();
                return view.getRight() + ((AO0) view.getLayoutParams()).f183b.right + ((ViewGroup.MarginLayoutParams) ao0).rightMargin;
            default:
                AO0 ao02 = (AO0) view.getLayoutParams();
                this.f9372a.getClass();
                return view.getBottom() + ((AO0) view.getLayoutParams()).f183b.bottom + ((ViewGroup.MarginLayoutParams) ao02).bottomMargin;
        }
    }

    /* renamed from: c */
    public final int m6494c(View view) {
        switch (this.f9375d) {
            case 0:
                AO0 ao0 = (AO0) view.getLayoutParams();
                this.f9372a.getClass();
                return AbstractC11919zO0.m26399A(view) + ((ViewGroup.MarginLayoutParams) ao0).leftMargin + ((ViewGroup.MarginLayoutParams) ao0).rightMargin;
            default:
                AO0 ao02 = (AO0) view.getLayoutParams();
                this.f9372a.getClass();
                return AbstractC11919zO0.m26406z(view) + ((ViewGroup.MarginLayoutParams) ao02).topMargin + ((ViewGroup.MarginLayoutParams) ao02).bottomMargin;
        }
    }

    /* renamed from: d */
    public final int m6495d(View view) {
        switch (this.f9375d) {
            case 0:
                AO0 ao0 = (AO0) view.getLayoutParams();
                this.f9372a.getClass();
                return AbstractC11919zO0.m26406z(view) + ((ViewGroup.MarginLayoutParams) ao0).topMargin + ((ViewGroup.MarginLayoutParams) ao0).bottomMargin;
            default:
                AO0 ao02 = (AO0) view.getLayoutParams();
                this.f9372a.getClass();
                return AbstractC11919zO0.m26399A(view) + ((ViewGroup.MarginLayoutParams) ao02).leftMargin + ((ViewGroup.MarginLayoutParams) ao02).rightMargin;
        }
    }

    /* renamed from: e */
    public final int m6496e(View view) {
        switch (this.f9375d) {
            case 0:
                AO0 ao0 = (AO0) view.getLayoutParams();
                this.f9372a.getClass();
                return (view.getLeft() - ((AO0) view.getLayoutParams()).f183b.left) - ((ViewGroup.MarginLayoutParams) ao0).leftMargin;
            default:
                AO0 ao02 = (AO0) view.getLayoutParams();
                this.f9372a.getClass();
                return (view.getTop() - ((AO0) view.getLayoutParams()).f183b.top) - ((ViewGroup.MarginLayoutParams) ao02).topMargin;
        }
    }

    /* renamed from: f */
    public final int m6497f() {
        switch (this.f9375d) {
            case 0:
                return this.f9372a.f46826n;
            default:
                return this.f9372a.f46827o;
        }
    }

    /* renamed from: g */
    public final int m6498g() {
        switch (this.f9375d) {
            case 0:
                AbstractC11919zO0 abstractC11919zO0 = this.f9372a;
                return abstractC11919zO0.f46826n - abstractC11919zO0.m26412F();
            default:
                AbstractC11919zO0 abstractC11919zO02 = this.f9372a;
                return abstractC11919zO02.f46827o - abstractC11919zO02.m26410D();
        }
    }

    /* renamed from: h */
    public final int m6499h() {
        switch (this.f9375d) {
            case 0:
                return this.f9372a.m26412F();
            default:
                return this.f9372a.m26410D();
        }
    }

    /* renamed from: i */
    public final int m6500i() {
        switch (this.f9375d) {
            case 0:
                return this.f9372a.f46824l;
            default:
                return this.f9372a.f46825m;
        }
    }

    /* renamed from: j */
    public final int m6501j() {
        switch (this.f9375d) {
            case 0:
                return this.f9372a.m26411E();
            default:
                return this.f9372a.m26413G();
        }
    }

    /* renamed from: k */
    public final int m6502k() {
        switch (this.f9375d) {
            case 0:
                AbstractC11919zO0 abstractC11919zO0 = this.f9372a;
                return (abstractC11919zO0.f46826n - abstractC11919zO0.m26411E()) - abstractC11919zO0.m26412F();
            default:
                AbstractC11919zO0 abstractC11919zO02 = this.f9372a;
                return (abstractC11919zO02.f46827o - abstractC11919zO02.m26413G()) - abstractC11919zO02.m26410D();
        }
    }

    /* renamed from: l */
    public final int m6503l() {
        if (Integer.MIN_VALUE == this.f9373b) {
            return 0;
        }
        return m6502k() - this.f9373b;
    }

    /* renamed from: m */
    public final int m6504m(View view) {
        switch (this.f9375d) {
            case 0:
                AbstractC11919zO0 abstractC11919zO0 = this.f9372a;
                Rect rect = this.f9374c;
                abstractC11919zO0.m26414K(view, rect);
                return rect.right;
            default:
                AbstractC11919zO0 abstractC11919zO02 = this.f9372a;
                Rect rect2 = this.f9374c;
                abstractC11919zO02.m26414K(view, rect2);
                return rect2.bottom;
        }
    }

    /* renamed from: n */
    public final int m6505n(View view) {
        switch (this.f9375d) {
            case 0:
                AbstractC11919zO0 abstractC11919zO0 = this.f9372a;
                Rect rect = this.f9374c;
                abstractC11919zO0.m26414K(view, rect);
                return rect.left;
            default:
                AbstractC11919zO0 abstractC11919zO02 = this.f9372a;
                Rect rect2 = this.f9374c;
                abstractC11919zO02.m26414K(view, rect2);
                return rect2.top;
        }
    }

    /* renamed from: o */
    public final void m6506o(int i) {
        switch (this.f9375d) {
            case 0:
                this.f9372a.mo10300O(i);
                break;
            default:
                this.f9372a.mo10302P(i);
                break;
        }
    }
}
