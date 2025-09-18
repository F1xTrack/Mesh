package p000;

import androidx.fragment.app.AbstractC1733o;
import androidx.fragment.app.Fragment;
import java.util.ArrayList;

/* renamed from: iY */
/* loaded from: classes.dex */
public final class C4249iY implements InterfaceC4186hY {

    /* renamed from: a */
    public final int f29312a;

    /* renamed from: b */
    public final /* synthetic */ AbstractC1733o f29313b;

    public C4249iY(AbstractC1733o abstractC1733o, int i) {
        this.f29313b = abstractC1733o;
        this.f29312a = i;
    }

    @Override // p000.InterfaceC4186hY
    /* renamed from: a */
    public final boolean mo10012a(ArrayList arrayList, ArrayList arrayList2) {
        AbstractC1733o abstractC1733o = this.f29313b;
        Fragment fragment = abstractC1733o.f16235w;
        int i = this.f29312a;
        if (fragment == null || i >= 0 || !fragment.getChildFragmentManager().m10050P(-1, 0)) {
            return abstractC1733o.m10051Q(arrayList, arrayList2, i, 1);
        }
        return false;
    }
}
