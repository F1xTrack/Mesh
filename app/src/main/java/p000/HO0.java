package p000;

import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public final class HO0 extends AbstractC11155tO0 {

    /* renamed from: a */
    public final /* synthetic */ RecyclerView f4281a;

    public HO0(RecyclerView recyclerView) {
        this.f4281a = recyclerView;
    }

    @Override // p000.AbstractC11155tO0
    /* renamed from: a */
    public final void mo3399a() {
        RecyclerView recyclerView = this.f4281a;
        recyclerView.m10272k(null);
        recyclerView.f16520s1.f6050f = true;
        recyclerView.m10257Y(true);
        if (recyclerView.f16502e.m18946k()) {
            return;
        }
        recyclerView.requestLayout();
    }

    @Override // p000.AbstractC11155tO0
    /* renamed from: b */
    public final void mo3400b(int i) {
        RecyclerView recyclerView = this.f4281a;
        recyclerView.m10272k(null);
        C4218i3 c4218i3 = recyclerView.f16502e;
        ArrayList arrayList = (ArrayList) c4218i3.f28783c;
        arrayList.add(c4218i3.m18948m(1, i, 1));
        c4218i3.f28781a |= 1;
        if (arrayList.size() == 1) {
            m3402d();
        }
    }

    @Override // p000.AbstractC11155tO0
    /* renamed from: c */
    public final void mo3401c(int i, int i2) {
        RecyclerView recyclerView = this.f4281a;
        recyclerView.m10272k(null);
        C4218i3 c4218i3 = recyclerView.f16502e;
        if (i2 < 1) {
            c4218i3.getClass();
            return;
        }
        ArrayList arrayList = (ArrayList) c4218i3.f28783c;
        arrayList.add(c4218i3.m18948m(2, i, i2));
        c4218i3.f28781a |= 2;
        if (arrayList.size() == 1) {
            m3402d();
        }
    }

    /* renamed from: d */
    public final void m3402d() {
        boolean z = RecyclerView.f16455Q1;
        RecyclerView recyclerView = this.f4281a;
        if (z && recyclerView.f16521t && recyclerView.f16519s) {
            WeakHashMap weakHashMap = AbstractC10944rk1.f41842a;
            recyclerView.postOnAnimation(recyclerView.f16507i);
        } else {
            recyclerView.f16460A = true;
            recyclerView.requestLayout();
        }
    }
}
