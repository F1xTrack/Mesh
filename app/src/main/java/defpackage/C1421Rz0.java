package defpackage;

import android.view.View;
import android.view.animation.DecelerateInterpolator;
import android.widget.Scroller;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;

/* renamed from: Rz0 */
/* loaded from: classes.dex */
public class C1421Rz0 extends BO0 {
    public RecyclerView a;
    public final B21 b = new B21(this);
    public C1262Py0 c;
    public C1262Py0 d;

    public static int c(View view, C1262Py0 c1262Py0) {
        return ((c1262Py0.c(view) / 2) + c1262Py0.e(view)) - ((c1262Py0.k() / 2) + c1262Py0.j());
    }

    public static View d(AbstractC8354zO0 abstractC8354zO0, C1262Py0 c1262Py0) {
        int iV = abstractC8354zO0.v();
        View view = null;
        if (iV == 0) {
            return null;
        }
        int iK = (c1262Py0.k() / 2) + c1262Py0.j();
        int i = Integer.MAX_VALUE;
        for (int i2 = 0; i2 < iV; i2++) {
            View viewU = abstractC8354zO0.u(i2);
            int iAbs = Math.abs(((c1262Py0.c(viewU) / 2) + c1262Py0.e(viewU)) - iK);
            if (iAbs < i) {
                view = viewU;
                i = iAbs;
            }
        }
        return view;
    }

    public final void a(RecyclerView recyclerView) {
        RecyclerView recyclerView2 = this.a;
        if (recyclerView2 == recyclerView) {
            return;
        }
        B21 b21 = this.b;
        if (recyclerView2 != null) {
            ArrayList arrayList = recyclerView2.u1;
            if (arrayList != null) {
                arrayList.remove(b21);
            }
            this.a.setOnFlingListener(null);
        }
        this.a = recyclerView;
        if (recyclerView != null) {
            if (recyclerView.getOnFlingListener() != null) {
                throw new IllegalStateException("An instance of OnFlingListener already set.");
            }
            this.a.j(b21);
            this.a.setOnFlingListener(this);
            new Scroller(this.a.getContext(), new DecelerateInterpolator());
            h();
        }
    }

    public final int[] b(AbstractC8354zO0 abstractC8354zO0, View view) {
        int[] iArr = new int[2];
        if (abstractC8354zO0.d()) {
            iArr[0] = c(view, f(abstractC8354zO0));
        } else {
            iArr[0] = 0;
        }
        if (abstractC8354zO0.e()) {
            iArr[1] = c(view, g(abstractC8354zO0));
        } else {
            iArr[1] = 0;
        }
        return iArr;
    }

    public View e(AbstractC8354zO0 abstractC8354zO0) {
        if (abstractC8354zO0.e()) {
            return d(abstractC8354zO0, g(abstractC8354zO0));
        }
        if (abstractC8354zO0.d()) {
            return d(abstractC8354zO0, f(abstractC8354zO0));
        }
        return null;
    }

    public final C1262Py0 f(AbstractC8354zO0 abstractC8354zO0) {
        C1262Py0 c1262Py0 = this.d;
        if (c1262Py0 == null || c1262Py0.a != abstractC8354zO0) {
            this.d = new C1262Py0(abstractC8354zO0, 0);
        }
        return this.d;
    }

    public final C1262Py0 g(AbstractC8354zO0 abstractC8354zO0) {
        C1262Py0 c1262Py0 = this.c;
        if (c1262Py0 == null || c1262Py0.a != abstractC8354zO0) {
            this.c = new C1262Py0(abstractC8354zO0, 1);
        }
        return this.c;
    }

    public final void h() {
        AbstractC8354zO0 layoutManager;
        View viewE;
        RecyclerView recyclerView = this.a;
        if (recyclerView == null || (layoutManager = recyclerView.getLayoutManager()) == null || (viewE = e(layoutManager)) == null) {
            return;
        }
        int[] iArrB = b(layoutManager, viewE);
        int i = iArrB[0];
        if (i == 0 && iArrB[1] == 0) {
            return;
        }
        this.a.i0(i, iArrB[1], false);
    }
}
