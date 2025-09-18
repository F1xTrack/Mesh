package p000;

import android.view.View;
import java.util.ArrayList;

/* renamed from: EY */
/* loaded from: classes.dex */
public final class C0287EY implements InterfaceC7527Ec1 {

    /* renamed from: a */
    public final /* synthetic */ View f2743a;

    /* renamed from: b */
    public final /* synthetic */ ArrayList f2744b;

    public C0287EY(View view, ArrayList arrayList) {
        this.f2743a = view;
        this.f2744b = arrayList;
    }

    @Override // p000.InterfaceC7527Ec1
    /* renamed from: a */
    public final void mo2334a(AbstractC7579Fc1 abstractC7579Fc1) {
        abstractC7579Fc1.mo2715z(this);
        abstractC7579Fc1.m2694a(this);
    }

    @Override // p000.InterfaceC7527Ec1
    /* renamed from: c */
    public final void mo2336c(AbstractC7579Fc1 abstractC7579Fc1) {
        abstractC7579Fc1.mo2715z(this);
        this.f2743a.setVisibility(8);
        ArrayList arrayList = this.f2744b;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            ((View) arrayList.get(i)).setVisibility(0);
        }
    }

    @Override // p000.InterfaceC7527Ec1
    /* renamed from: d */
    public final void mo2337d(AbstractC7579Fc1 abstractC7579Fc1) {
        mo2334a(abstractC7579Fc1);
    }

    @Override // p000.InterfaceC7527Ec1
    /* renamed from: e */
    public final void mo2338e(AbstractC7579Fc1 abstractC7579Fc1) {
        mo2336c(abstractC7579Fc1);
    }

    @Override // p000.InterfaceC7527Ec1
    /* renamed from: b */
    public final void mo2335b() {
    }

    @Override // p000.InterfaceC7527Ec1
    /* renamed from: f */
    public final void mo2339f() {
    }

    @Override // p000.InterfaceC7527Ec1
    /* renamed from: g */
    public final void mo2340g(AbstractC7579Fc1 abstractC7579Fc1) {
    }
}
