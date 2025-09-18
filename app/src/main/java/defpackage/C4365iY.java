package defpackage;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.o;
import java.util.ArrayList;

/* renamed from: iY, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4365iY implements InterfaceC4174hY {
    public final int a;
    public final /* synthetic */ o b;

    public C4365iY(o oVar, int i) {
        this.b = oVar;
        this.a = i;
    }

    @Override // defpackage.InterfaceC4174hY
    public final boolean a(ArrayList arrayList, ArrayList arrayList2) {
        o oVar = this.b;
        Fragment fragment = oVar.w;
        int i = this.a;
        if (fragment == null || i >= 0 || !fragment.getChildFragmentManager().P(-1, 0)) {
            return oVar.Q(arrayList, arrayList2, i, 1);
        }
        return false;
    }
}
