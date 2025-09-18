package p000;

import android.graphics.Rect;
import android.os.Bundle;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

/* renamed from: el1 */
/* loaded from: classes.dex */
public final class C9282el1 extends LinearLayoutManager {

    /* renamed from: E */
    public final /* synthetic */ C10050kl1 f26827E;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C9282el1(C10050kl1 c10050kl1) {
        super(1);
        this.f26827E = c10050kl1;
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager
    /* renamed from: D0 */
    public final void mo9355D0(KO0 ko0, int[] iArr) {
        C10050kl1 c10050kl1 = this.f26827E;
        int offscreenPageLimit = c10050kl1.getOffscreenPageLimit();
        if (offscreenPageLimit == -1) {
            super.mo9355D0(ko0, iArr);
            return;
        }
        int pageSize = c10050kl1.getPageSize() * offscreenPageLimit;
        iArr[0] = pageSize;
        iArr[1] = pageSize;
    }

    @Override // p000.AbstractC11919zO0
    /* renamed from: V */
    public final void mo10152V(FO0 fo0, KO0 ko0, C1009Q1 c1009q1) {
        super.mo10152V(fo0, ko0, c1009q1);
        this.f26827E.f36680t.getClass();
    }

    @Override // p000.AbstractC11919zO0
    /* renamed from: X */
    public final void mo10153X(FO0 fo0, KO0 ko0, View view, C1009Q1 c1009q1) {
        int iM26400H;
        C10050kl1 c10050kl1 = (C10050kl1) this.f26827E.f36680t.f8630d;
        int iM26400H2 = 0;
        if (c10050kl1.getOrientation() == 1) {
            c10050kl1.f36667g.getClass();
            iM26400H = AbstractC11919zO0.m26400H(view);
        } else {
            iM26400H = 0;
        }
        if (c10050kl1.getOrientation() == 0) {
            c10050kl1.f36667g.getClass();
            iM26400H2 = AbstractC11919zO0.m26400H(view);
        }
        c1009q1.f9401a.setCollectionItemInfo(AccessibilityNodeInfo.CollectionItemInfo.obtain(iM26400H, 1, iM26400H2, 1, false, false));
    }

    @Override // p000.AbstractC11919zO0
    /* renamed from: i0 */
    public final boolean mo18031i0(FO0 fo0, KO0 ko0, int i, Bundle bundle) {
        this.f26827E.f36680t.getClass();
        return super.mo18031i0(fo0, ko0, i, bundle);
    }

    @Override // p000.AbstractC11919zO0
    /* renamed from: n0 */
    public final boolean mo11228n0(RecyclerView recyclerView, View view, Rect rect, boolean z, boolean z2) {
        return false;
    }
}
