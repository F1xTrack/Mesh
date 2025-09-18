package defpackage;

import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;

/* renamed from: Py0 */
/* loaded from: classes.dex */
public final class C1262Py0 {
    public final AbstractC8354zO0 a;
    public int b = Integer.MIN_VALUE;
    public final Rect c = new Rect();
    public final /* synthetic */ int d;

    public C1262Py0(AbstractC8354zO0 abstractC8354zO0, int i) {
        this.d = i;
        this.a = abstractC8354zO0;
    }

    public static C1262Py0 a(AbstractC8354zO0 abstractC8354zO0, int i) {
        if (i == 0) {
            return new C1262Py0(abstractC8354zO0, 0);
        }
        if (i == 1) {
            return new C1262Py0(abstractC8354zO0, 1);
        }
        throw new IllegalArgumentException("invalid orientation");
    }

    public final int b(View view) {
        switch (this.d) {
            case 0:
                AO0 ao0 = (AO0) view.getLayoutParams();
                this.a.getClass();
                return view.getRight() + ((AO0) view.getLayoutParams()).b.right + ((ViewGroup.MarginLayoutParams) ao0).rightMargin;
            default:
                AO0 ao02 = (AO0) view.getLayoutParams();
                this.a.getClass();
                return view.getBottom() + ((AO0) view.getLayoutParams()).b.bottom + ((ViewGroup.MarginLayoutParams) ao02).bottomMargin;
        }
    }

    public final int c(View view) {
        switch (this.d) {
            case 0:
                AO0 ao0 = (AO0) view.getLayoutParams();
                this.a.getClass();
                return AbstractC8354zO0.A(view) + ((ViewGroup.MarginLayoutParams) ao0).leftMargin + ((ViewGroup.MarginLayoutParams) ao0).rightMargin;
            default:
                AO0 ao02 = (AO0) view.getLayoutParams();
                this.a.getClass();
                return AbstractC8354zO0.z(view) + ((ViewGroup.MarginLayoutParams) ao02).topMargin + ((ViewGroup.MarginLayoutParams) ao02).bottomMargin;
        }
    }

    public final int d(View view) {
        switch (this.d) {
            case 0:
                AO0 ao0 = (AO0) view.getLayoutParams();
                this.a.getClass();
                return AbstractC8354zO0.z(view) + ((ViewGroup.MarginLayoutParams) ao0).topMargin + ((ViewGroup.MarginLayoutParams) ao0).bottomMargin;
            default:
                AO0 ao02 = (AO0) view.getLayoutParams();
                this.a.getClass();
                return AbstractC8354zO0.A(view) + ((ViewGroup.MarginLayoutParams) ao02).leftMargin + ((ViewGroup.MarginLayoutParams) ao02).rightMargin;
        }
    }

    public final int e(View view) {
        switch (this.d) {
            case 0:
                AO0 ao0 = (AO0) view.getLayoutParams();
                this.a.getClass();
                return (view.getLeft() - ((AO0) view.getLayoutParams()).b.left) - ((ViewGroup.MarginLayoutParams) ao0).leftMargin;
            default:
                AO0 ao02 = (AO0) view.getLayoutParams();
                this.a.getClass();
                return (view.getTop() - ((AO0) view.getLayoutParams()).b.top) - ((ViewGroup.MarginLayoutParams) ao02).topMargin;
        }
    }

    public final int f() {
        switch (this.d) {
            case 0:
                return this.a.n;
            default:
                return this.a.o;
        }
    }

    public final int g() {
        switch (this.d) {
            case 0:
                AbstractC8354zO0 abstractC8354zO0 = this.a;
                return abstractC8354zO0.n - abstractC8354zO0.F();
            default:
                AbstractC8354zO0 abstractC8354zO02 = this.a;
                return abstractC8354zO02.o - abstractC8354zO02.D();
        }
    }

    public final int h() {
        switch (this.d) {
            case 0:
                return this.a.F();
            default:
                return this.a.D();
        }
    }

    public final int i() {
        switch (this.d) {
            case 0:
                return this.a.l;
            default:
                return this.a.m;
        }
    }

    public final int j() {
        switch (this.d) {
            case 0:
                return this.a.E();
            default:
                return this.a.G();
        }
    }

    public final int k() {
        switch (this.d) {
            case 0:
                AbstractC8354zO0 abstractC8354zO0 = this.a;
                return (abstractC8354zO0.n - abstractC8354zO0.E()) - abstractC8354zO0.F();
            default:
                AbstractC8354zO0 abstractC8354zO02 = this.a;
                return (abstractC8354zO02.o - abstractC8354zO02.G()) - abstractC8354zO02.D();
        }
    }

    public final int l() {
        if (Integer.MIN_VALUE == this.b) {
            return 0;
        }
        return k() - this.b;
    }

    public final int m(View view) {
        switch (this.d) {
            case 0:
                AbstractC8354zO0 abstractC8354zO0 = this.a;
                Rect rect = this.c;
                abstractC8354zO0.K(view, rect);
                return rect.right;
            default:
                AbstractC8354zO0 abstractC8354zO02 = this.a;
                Rect rect2 = this.c;
                abstractC8354zO02.K(view, rect2);
                return rect2.bottom;
        }
    }

    public final int n(View view) {
        switch (this.d) {
            case 0:
                AbstractC8354zO0 abstractC8354zO0 = this.a;
                Rect rect = this.c;
                abstractC8354zO0.K(view, rect);
                return rect.left;
            default:
                AbstractC8354zO0 abstractC8354zO02 = this.a;
                Rect rect2 = this.c;
                abstractC8354zO02.K(view, rect2);
                return rect2.top;
        }
    }

    public final void o(int i) {
        switch (this.d) {
            case 0:
                this.a.O(i);
                break;
            default:
                this.a.P(i);
                break;
        }
    }
}
