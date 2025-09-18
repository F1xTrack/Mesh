package androidx.lifecycle;

import kotlin.Metadata;
import p000.AbstractC7538Ei0;
import p000.C10145lV0;
import p000.C9505gV0;
import p000.EnumC7382Bi0;
import p000.InterfaceC7746Ii0;
import p000.InterfaceC7902Li0;
import p000.O90;

@Metadata(m22266d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m22267d2 = {"Landroidx/lifecycle/SavedStateHandleController;", "LIi0;", "lifecycle-viewmodel-savedstate_release"}, m22268k = 1, m22269mv = {1, 8, 0}, m22271xi = 48)
/* loaded from: classes.dex */
public final class SavedStateHandleController implements InterfaceC7746Ii0 {

    /* renamed from: a */
    public final String f16304a;

    /* renamed from: b */
    public final C9505gV0 f16305b;

    /* renamed from: c */
    public boolean f16306c;

    public SavedStateHandleController(String str, C9505gV0 c9505gV0) {
        this.f16304a = str;
        this.f16305b = c9505gV0;
    }

    /* renamed from: a */
    public final void m10123a(AbstractC7538Ei0 abstractC7538Ei0, C10145lV0 c10145lV0) {
        O90.m5968f(c10145lV0, "registry");
        O90.m5968f(abstractC7538Ei0, "lifecycle");
        if (this.f16306c) {
            throw new IllegalStateException("Already attached to lifecycleOwner");
        }
        this.f16306c = true;
        abstractC7538Ei0.mo2368a(this);
        c10145lV0.m22443c(this.f16304a, this.f16305b.f27818e);
    }

    @Override // p000.InterfaceC7746Ii0
    /* renamed from: f */
    public final void mo2792f(InterfaceC7902Li0 interfaceC7902Li0, EnumC7382Bi0 enumC7382Bi0) {
        if (enumC7382Bi0 == EnumC7382Bi0.ON_DESTROY) {
            this.f16306c = false;
            interfaceC7902Li0.getLifecycle().mo2369b(this);
        }
    }
}
