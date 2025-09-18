package androidx.lifecycle;

import kotlin.Metadata;
import p000.C9633hV0;
import p000.EnumC7382Bi0;
import p000.InterfaceC7746Ii0;
import p000.InterfaceC7902Li0;

@Metadata(m22266d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m22267d2 = {"Landroidx/lifecycle/SavedStateHandleAttacher;", "LIi0;", "lifecycle-viewmodel-savedstate_release"}, m22268k = 1, m22269mv = {1, 8, 0}, m22271xi = 48)
/* loaded from: classes.dex */
public final class SavedStateHandleAttacher implements InterfaceC7746Ii0 {

    /* renamed from: a */
    public final C9633hV0 f16303a;

    public SavedStateHandleAttacher(C9633hV0 c9633hV0) {
        this.f16303a = c9633hV0;
    }

    @Override // p000.InterfaceC7746Ii0
    /* renamed from: f */
    public final void mo2792f(InterfaceC7902Li0 interfaceC7902Li0, EnumC7382Bi0 enumC7382Bi0) {
        if (enumC7382Bi0 == EnumC7382Bi0.ON_CREATE) {
            interfaceC7902Li0.getLifecycle().mo2369b(this);
            this.f16303a.m18820b();
        } else {
            throw new IllegalStateException(("Next event must be ON_CREATE, it was " + enumC7382Bi0).toString());
        }
    }
}
