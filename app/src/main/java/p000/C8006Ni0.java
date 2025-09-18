package p000;

import com.bumptech.glide.manager.C1876a;

/* renamed from: Ni0 */
/* loaded from: classes.dex */
public final class C8006Ni0 implements InterfaceC7798Ji0 {

    /* renamed from: a */
    public final /* synthetic */ AbstractC7538Ei0 f7968a;

    /* renamed from: b */
    public final /* synthetic */ C1876a f7969b;

    public C8006Ni0(C1876a c1876a, AbstractC7538Ei0 abstractC7538Ei0) {
        this.f7969b = c1876a;
        this.f7968a = abstractC7538Ei0;
    }

    @Override // p000.InterfaceC7798Ji0
    public final void onDestroy() {
        this.f7969b.f17790a.remove(this.f7968a);
    }

    @Override // p000.InterfaceC7798Ji0
    public final void onStart() {
    }

    @Override // p000.InterfaceC7798Ji0
    public final void onStop() {
    }
}
