package p000;

import android.view.View;
import java.util.List;

/* renamed from: Yi0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C8578Yi0 {

    /* renamed from: a */
    public boolean f14459a;

    /* renamed from: b */
    public int f14460b;

    /* renamed from: c */
    public int f14461c;

    /* renamed from: d */
    public int f14462d;

    /* renamed from: e */
    public int f14463e;

    /* renamed from: f */
    public int f14464f;

    /* renamed from: g */
    public int f14465g;

    /* renamed from: h */
    public int f14466h;

    /* renamed from: i */
    public int f14467i;

    /* renamed from: j */
    public int f14468j;

    /* renamed from: k */
    public List f14469k;

    /* renamed from: l */
    public boolean f14470l;

    /* renamed from: a */
    public final void m9341a(View view) {
        int iM6045b;
        int size = this.f14469k.size();
        View view2 = null;
        int i = Integer.MAX_VALUE;
        for (int i2 = 0; i2 < size; i2++) {
            View view3 = ((OO0) this.f14469k.get(i2)).f8408a;
            AO0 ao0 = (AO0) view3.getLayoutParams();
            if (view3 != view && !ao0.f182a.m6052i() && (iM6045b = (ao0.f182a.m6045b() - this.f14462d) * this.f14463e) >= 0 && iM6045b < i) {
                view2 = view3;
                if (iM6045b == 0) {
                    break;
                } else {
                    i = iM6045b;
                }
            }
        }
        if (view2 == null) {
            this.f14462d = -1;
        } else {
            this.f14462d = ((AO0) view2.getLayoutParams()).f182a.m6045b();
        }
    }

    /* renamed from: b */
    public final View m9342b(FO0 fo0) {
        List list = this.f14469k;
        if (list == null) {
            View view = fo0.m2628k(this.f14462d, Long.MAX_VALUE).f8408a;
            this.f14462d += this.f14463e;
            return view;
        }
        int size = list.size();
        for (int i = 0; i < size; i++) {
            View view2 = ((OO0) this.f14469k.get(i)).f8408a;
            AO0 ao0 = (AO0) view2.getLayoutParams();
            if (!ao0.f182a.m6052i() && this.f14462d == ao0.f182a.m6045b()) {
                m9341a(view2);
                return view2;
            }
        }
        return null;
    }
}
