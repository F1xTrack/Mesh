package defpackage;

import android.graphics.Rect;
import android.os.Bundle;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

/* renamed from: el1 */
/* loaded from: classes.dex */
public final class C3642el1 extends LinearLayoutManager {
    public final /* synthetic */ C5564kl1 E;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3642el1(C5564kl1 c5564kl1) {
        super(1);
        this.E = c5564kl1;
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager
    public final void D0(KO0 ko0, int[] iArr) {
        C5564kl1 c5564kl1 = this.E;
        int offscreenPageLimit = c5564kl1.getOffscreenPageLimit();
        if (offscreenPageLimit == -1) {
            super.D0(ko0, iArr);
            return;
        }
        int pageSize = c5564kl1.getPageSize() * offscreenPageLimit;
        iArr[0] = pageSize;
        iArr[1] = pageSize;
    }

    @Override // defpackage.AbstractC8354zO0
    public final void V(FO0 fo0, KO0 ko0, Q1 q1) {
        super.V(fo0, ko0, q1);
        this.E.t.getClass();
    }

    @Override // defpackage.AbstractC8354zO0
    public final void X(FO0 fo0, KO0 ko0, View view, Q1 q1) {
        int iH;
        C5564kl1 c5564kl1 = (C5564kl1) this.E.t.d;
        int iH2 = 0;
        if (c5564kl1.getOrientation() == 1) {
            c5564kl1.g.getClass();
            iH = AbstractC8354zO0.H(view);
        } else {
            iH = 0;
        }
        if (c5564kl1.getOrientation() == 0) {
            c5564kl1.g.getClass();
            iH2 = AbstractC8354zO0.H(view);
        }
        q1.a.setCollectionItemInfo(AccessibilityNodeInfo.CollectionItemInfo.obtain(iH, 1, iH2, 1, false, false));
    }

    @Override // defpackage.AbstractC8354zO0
    public final boolean i0(FO0 fo0, KO0 ko0, int i, Bundle bundle) {
        this.E.t.getClass();
        return super.i0(fo0, ko0, i, bundle);
    }

    @Override // defpackage.AbstractC8354zO0
    public final boolean n0(RecyclerView recyclerView, View view, Rect rect, boolean z, boolean z2) {
        return false;
    }
}
