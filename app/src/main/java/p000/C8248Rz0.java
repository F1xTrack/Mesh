package p000;

import android.view.View;
import android.view.animation.DecelerateInterpolator;
import android.widget.Scroller;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;

/* renamed from: Rz0 */
/* loaded from: classes.dex */
public class C8248Rz0 extends BO0 {

    /* renamed from: a */
    public RecyclerView f10511a;

    /* renamed from: b */
    public final B21 f10512b = new B21(this);

    /* renamed from: c */
    public C8142Py0 f10513c;

    /* renamed from: d */
    public C8142Py0 f10514d;

    /* renamed from: c */
    public static int m7136c(View view, C8142Py0 c8142Py0) {
        return ((c8142Py0.m6494c(view) / 2) + c8142Py0.m6496e(view)) - ((c8142Py0.m6502k() / 2) + c8142Py0.m6501j());
    }

    /* renamed from: d */
    public static View m7137d(AbstractC11919zO0 abstractC11919zO0, C8142Py0 c8142Py0) {
        int iM26426v = abstractC11919zO0.m26426v();
        View view = null;
        if (iM26426v == 0) {
            return null;
        }
        int iM6502k = (c8142Py0.m6502k() / 2) + c8142Py0.m6501j();
        int i = Integer.MAX_VALUE;
        for (int i2 = 0; i2 < iM26426v; i2++) {
            View viewM26425u = abstractC11919zO0.m26425u(i2);
            int iAbs = Math.abs(((c8142Py0.m6494c(viewM26425u) / 2) + c8142Py0.m6496e(viewM26425u)) - iM6502k);
            if (iAbs < i) {
                view = viewM26425u;
                i = iAbs;
            }
        }
        return view;
    }

    /* renamed from: a */
    public final void m7138a(RecyclerView recyclerView) {
        RecyclerView recyclerView2 = this.f10511a;
        if (recyclerView2 == recyclerView) {
            return;
        }
        B21 b21 = this.f10512b;
        if (recyclerView2 != null) {
            ArrayList arrayList = recyclerView2.f16524u1;
            if (arrayList != null) {
                arrayList.remove(b21);
            }
            this.f10511a.setOnFlingListener(null);
        }
        this.f10511a = recyclerView;
        if (recyclerView != null) {
            if (recyclerView.getOnFlingListener() != null) {
                throw new IllegalStateException("An instance of OnFlingListener already set.");
            }
            this.f10511a.m10270j(b21);
            this.f10511a.setOnFlingListener(this);
            new Scroller(this.f10511a.getContext(), new DecelerateInterpolator());
            m7143h();
        }
    }

    /* renamed from: b */
    public final int[] m7139b(AbstractC11919zO0 abstractC11919zO0, View view) {
        int[] iArr = new int[2];
        if (abstractC11919zO0.mo10210d()) {
            iArr[0] = m7136c(view, m7141f(abstractC11919zO0));
        } else {
            iArr[0] = 0;
        }
        if (abstractC11919zO0.mo10212e()) {
            iArr[1] = m7136c(view, m7142g(abstractC11919zO0));
        } else {
            iArr[1] = 0;
        }
        return iArr;
    }

    /* renamed from: e */
    public View mo7140e(AbstractC11919zO0 abstractC11919zO0) {
        if (abstractC11919zO0.mo10212e()) {
            return m7137d(abstractC11919zO0, m7142g(abstractC11919zO0));
        }
        if (abstractC11919zO0.mo10210d()) {
            return m7137d(abstractC11919zO0, m7141f(abstractC11919zO0));
        }
        return null;
    }

    /* renamed from: f */
    public final C8142Py0 m7141f(AbstractC11919zO0 abstractC11919zO0) {
        C8142Py0 c8142Py0 = this.f10514d;
        if (c8142Py0 == null || c8142Py0.f9372a != abstractC11919zO0) {
            this.f10514d = new C8142Py0(abstractC11919zO0, 0);
        }
        return this.f10514d;
    }

    /* renamed from: g */
    public final C8142Py0 m7142g(AbstractC11919zO0 abstractC11919zO0) {
        C8142Py0 c8142Py0 = this.f10513c;
        if (c8142Py0 == null || c8142Py0.f9372a != abstractC11919zO0) {
            this.f10513c = new C8142Py0(abstractC11919zO0, 1);
        }
        return this.f10513c;
    }

    /* renamed from: h */
    public final void m7143h() {
        AbstractC11919zO0 layoutManager;
        View viewMo7140e;
        RecyclerView recyclerView = this.f10511a;
        if (recyclerView == null || (layoutManager = recyclerView.getLayoutManager()) == null || (viewMo7140e = mo7140e(layoutManager)) == null) {
            return;
        }
        int[] iArrM7139b = m7139b(layoutManager, viewMo7140e);
        int i = iArrM7139b[0];
        if (i == 0 && iArrM7139b[1] == 0) {
            return;
        }
        this.f10511a.m10269i0(i, iArrM7139b[1], false);
    }
}
