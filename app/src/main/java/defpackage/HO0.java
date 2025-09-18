package defpackage;

import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public final class HO0 extends AbstractC7212tO0 {
    public final /* synthetic */ RecyclerView a;

    public HO0(RecyclerView recyclerView) {
        this.a = recyclerView;
    }

    @Override // defpackage.AbstractC7212tO0
    public final void a() {
        RecyclerView recyclerView = this.a;
        recyclerView.k(null);
        recyclerView.s1.f = true;
        recyclerView.Y(true);
        if (recyclerView.e.k()) {
            return;
        }
        recyclerView.requestLayout();
    }

    @Override // defpackage.AbstractC7212tO0
    public final void b(int i) {
        RecyclerView recyclerView = this.a;
        recyclerView.k(null);
        C4271i3 c4271i3 = recyclerView.e;
        ArrayList arrayList = (ArrayList) c4271i3.c;
        arrayList.add(c4271i3.m(1, i, 1));
        c4271i3.a |= 1;
        if (arrayList.size() == 1) {
            d();
        }
    }

    @Override // defpackage.AbstractC7212tO0
    public final void c(int i, int i2) {
        RecyclerView recyclerView = this.a;
        recyclerView.k(null);
        C4271i3 c4271i3 = recyclerView.e;
        if (i2 < 1) {
            c4271i3.getClass();
            return;
        }
        ArrayList arrayList = (ArrayList) c4271i3.c;
        arrayList.add(c4271i3.m(2, i, i2));
        c4271i3.a |= 2;
        if (arrayList.size() == 1) {
            d();
        }
    }

    public final void d() {
        boolean z = RecyclerView.Q1;
        RecyclerView recyclerView = this.a;
        if (z && recyclerView.t && recyclerView.s) {
            WeakHashMap weakHashMap = AbstractC6897rk1.a;
            recyclerView.postOnAnimation(recyclerView.i);
        } else {
            recyclerView.A = true;
            recyclerView.requestLayout();
        }
    }
}
