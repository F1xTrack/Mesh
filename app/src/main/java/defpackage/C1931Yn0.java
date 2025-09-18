package defpackage;

import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

/* renamed from: Yn0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1931Yn0 extends LinearLayoutManager {
    public final /* synthetic */ int E;
    public final /* synthetic */ C2394bo0 F;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1931Yn0(C2394bo0 c2394bo0, int i, int i2) {
        super(i);
        this.F = c2394bo0;
        this.E = i2;
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, defpackage.AbstractC8354zO0
    public final void A0(RecyclerView recyclerView, int i) {
        C8288z21 c8288z21 = new C8288z21(recyclerView.getContext());
        c8288z21.a = i;
        B0(c8288z21);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager
    public final void D0(KO0 ko0, int[] iArr) {
        int i = this.E;
        C2394bo0 c2394bo0 = this.F;
        if (i == 0) {
            iArr[0] = c2394bo0.i.getWidth();
            iArr[1] = c2394bo0.i.getWidth();
        } else {
            iArr[0] = c2394bo0.i.getHeight();
            iArr[1] = c2394bo0.i.getHeight();
        }
    }
}
