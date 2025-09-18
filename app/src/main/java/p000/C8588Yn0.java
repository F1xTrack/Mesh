package p000;

import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

/* renamed from: Yn0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C8588Yn0 extends LinearLayoutManager {

    /* renamed from: E */
    public final /* synthetic */ int f14524E;

    /* renamed from: F */
    public final /* synthetic */ C8898bo0 f14525F;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C8588Yn0(C8898bo0 c8898bo0, int i, int i2) {
        super(i);
        this.f14525F = c8898bo0;
        this.f14524E = i2;
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, p000.AbstractC11919zO0
    /* renamed from: A0 */
    public final void mo9354A0(RecyclerView recyclerView, int i) {
        C11875z21 c11875z21 = new C11875z21(recyclerView.getContext());
        c11875z21.f15637a = i;
        m26408B0(c11875z21);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager
    /* renamed from: D0 */
    public final void mo9355D0(KO0 ko0, int[] iArr) {
        int i = this.f14524E;
        C8898bo0 c8898bo0 = this.f14525F;
        if (i == 0) {
            iArr[0] = c8898bo0.f17167i.getWidth();
            iArr[1] = c8898bo0.f17167i.getWidth();
        } else {
            iArr[0] = c8898bo0.f17167i.getHeight();
            iArr[1] = c8898bo0.f17167i.getHeight();
        }
    }
}
