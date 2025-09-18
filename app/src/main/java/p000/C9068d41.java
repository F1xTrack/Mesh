package p000;

import android.view.View;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;
import java.util.ArrayList;

/* renamed from: d41, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C9068d41 {

    /* renamed from: a */
    public final ArrayList f25796a = new ArrayList();

    /* renamed from: b */
    public int f25797b = Integer.MIN_VALUE;

    /* renamed from: c */
    public int f25798c = Integer.MIN_VALUE;

    /* renamed from: d */
    public int f25799d = 0;

    /* renamed from: e */
    public final int f25800e;

    /* renamed from: f */
    public final /* synthetic */ StaggeredGridLayoutManager f25801f;

    public C9068d41(StaggeredGridLayoutManager staggeredGridLayoutManager, int i) {
        this.f25801f = staggeredGridLayoutManager;
        this.f25800e = i;
    }

    /* renamed from: a */
    public final void m17483a() {
        View view = (View) AbstractC7222ym.m26228e(1, this.f25796a);
        C8679a41 c8679a41 = (C8679a41) view.getLayoutParams();
        this.f25798c = this.f25801f.f16548r.m6493b(view);
        c8679a41.getClass();
    }

    /* renamed from: b */
    public final void m17484b() {
        this.f25796a.clear();
        this.f25797b = Integer.MIN_VALUE;
        this.f25798c = Integer.MIN_VALUE;
        this.f25799d = 0;
    }

    /* renamed from: c */
    public final int m17485c() {
        return this.f25801f.f16553w ? m17487e(r1.size() - 1, -1) : m17487e(0, this.f25796a.size());
    }

    /* renamed from: d */
    public final int m17486d() {
        return this.f25801f.f16553w ? m17487e(0, this.f25796a.size()) : m17487e(r1.size() - 1, -1);
    }

    /* renamed from: e */
    public final int m17487e(int i, int i2) {
        StaggeredGridLayoutManager staggeredGridLayoutManager = this.f25801f;
        int iM6501j = staggeredGridLayoutManager.f16548r.m6501j();
        int iM6498g = staggeredGridLayoutManager.f16548r.m6498g();
        int i3 = i2 > i ? 1 : -1;
        while (i != i2) {
            View view = (View) this.f25796a.get(i);
            int iM6496e = staggeredGridLayoutManager.f16548r.m6496e(view);
            int iM6493b = staggeredGridLayoutManager.f16548r.m6493b(view);
            boolean z = iM6496e <= iM6498g;
            boolean z2 = iM6493b >= iM6501j;
            if (z && z2 && (iM6496e < iM6501j || iM6493b > iM6498g)) {
                return AbstractC11919zO0.m26400H(view);
            }
            i += i3;
        }
        return -1;
    }

    /* renamed from: f */
    public final int m17488f(int i) {
        int i2 = this.f25798c;
        if (i2 != Integer.MIN_VALUE) {
            return i2;
        }
        if (this.f25796a.size() == 0) {
            return i;
        }
        m17483a();
        return this.f25798c;
    }

    /* renamed from: g */
    public final View m17489g(int i, int i2) {
        ArrayList arrayList = this.f25796a;
        StaggeredGridLayoutManager staggeredGridLayoutManager = this.f25801f;
        View view = null;
        if (i2 != -1) {
            int size = arrayList.size() - 1;
            while (size >= 0) {
                View view2 = (View) arrayList.get(size);
                if ((staggeredGridLayoutManager.f16553w && AbstractC11919zO0.m26400H(view2) >= i) || ((!staggeredGridLayoutManager.f16553w && AbstractC11919zO0.m26400H(view2) <= i) || !view2.hasFocusable())) {
                    break;
                }
                size--;
                view = view2;
            }
        } else {
            int size2 = arrayList.size();
            int i3 = 0;
            while (i3 < size2) {
                View view3 = (View) arrayList.get(i3);
                if ((staggeredGridLayoutManager.f16553w && AbstractC11919zO0.m26400H(view3) <= i) || ((!staggeredGridLayoutManager.f16553w && AbstractC11919zO0.m26400H(view3) >= i) || !view3.hasFocusable())) {
                    break;
                }
                i3++;
                view = view3;
            }
        }
        return view;
    }

    /* renamed from: h */
    public final int m17490h(int i) {
        int i2 = this.f25797b;
        if (i2 != Integer.MIN_VALUE) {
            return i2;
        }
        if (this.f25796a.size() == 0) {
            return i;
        }
        View view = (View) this.f25796a.get(0);
        C8679a41 c8679a41 = (C8679a41) view.getLayoutParams();
        this.f25797b = this.f25801f.f16548r.m6496e(view);
        c8679a41.getClass();
        return this.f25797b;
    }
}
