package androidx.lifecycle;

import p000.AbstractC8762ak0;
import p000.EnumC7382Bi0;
import p000.EnumC7434Ci0;
import p000.InterfaceC7746Ii0;
import p000.InterfaceC7902Li0;
import p000.InterfaceC9305ex0;

/* loaded from: classes.dex */
class LiveData$LifecycleBoundObserver extends AbstractC8762ak0 implements InterfaceC7746Ii0 {

    /* renamed from: e */
    public final InterfaceC7902Li0 f16290e;

    /* renamed from: f */
    public final /* synthetic */ AbstractC1743b f16291f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LiveData$LifecycleBoundObserver(AbstractC1743b abstractC1743b, InterfaceC7902Li0 interfaceC7902Li0, InterfaceC9305ex0 interfaceC9305ex0) {
        super(abstractC1743b, interfaceC9305ex0);
        this.f16291f = abstractC1743b;
        this.f16290e = interfaceC7902Li0;
    }

    @Override // p000.AbstractC8762ak0
    /* renamed from: b */
    public final void mo9799b() {
        this.f16290e.getLifecycle().mo2369b(this);
    }

    @Override // p000.AbstractC8762ak0
    /* renamed from: c */
    public final boolean mo9800c(InterfaceC7902Li0 interfaceC7902Li0) {
        return this.f16290e == interfaceC7902Li0;
    }

    @Override // p000.AbstractC8762ak0
    /* renamed from: d */
    public final boolean mo9584d() {
        return ((C1742a) this.f16290e.getLifecycle()).f16309c.compareTo(EnumC7434Ci0.f1589d) >= 0;
    }

    @Override // p000.InterfaceC7746Ii0
    /* renamed from: f */
    public final void mo2792f(InterfaceC7902Li0 interfaceC7902Li0, EnumC7382Bi0 enumC7382Bi0) {
        InterfaceC7902Li0 interfaceC7902Li02 = this.f16290e;
        EnumC7434Ci0 enumC7434Ci0 = ((C1742a) interfaceC7902Li02.getLifecycle()).f16309c;
        if (enumC7434Ci0 == EnumC7434Ci0.f1586a) {
            this.f16291f.mo10135i(this.f15661a);
            return;
        }
        EnumC7434Ci0 enumC7434Ci02 = null;
        while (enumC7434Ci02 != enumC7434Ci0) {
            m9798a(mo9584d());
            enumC7434Ci02 = enumC7434Ci0;
            enumC7434Ci0 = ((C1742a) interfaceC7902Li02.getLifecycle()).f16309c;
        }
    }
}
