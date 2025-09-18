package defpackage;

import com.bumptech.glide.manager.a;

/* renamed from: Ni0 */
/* loaded from: classes.dex */
public final class C1058Ni0 implements InterfaceC0747Ji0 {
    public final /* synthetic */ AbstractC0357Ei0 a;
    public final /* synthetic */ a b;

    public C1058Ni0(a aVar, AbstractC0357Ei0 abstractC0357Ei0) {
        this.b = aVar;
        this.a = abstractC0357Ei0;
    }

    @Override // defpackage.InterfaceC0747Ji0
    public final void onDestroy() {
        this.b.a.remove(this.a);
    }

    @Override // defpackage.InterfaceC0747Ji0
    public final void onStart() {
    }

    @Override // defpackage.InterfaceC0747Ji0
    public final void onStop() {
    }
}
