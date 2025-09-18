package androidx.lifecycle;

import kotlin.Metadata;
import p000.AbstractC7538Ei0;
import p000.C10145lV0;
import p000.EnumC7382Bi0;
import p000.InterfaceC7746Ii0;
import p000.InterfaceC7902Li0;

@Metadata(m22266d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m22267d2 = {"androidx/lifecycle/LegacySavedStateHandleController$tryToAddRecreator$1", "LIi0;", "lifecycle-viewmodel-savedstate_release"}, m22268k = 1, m22269mv = {1, 8, 0}, m22271xi = 48)
/* loaded from: classes.dex */
public final class LegacySavedStateHandleController$tryToAddRecreator$1 implements InterfaceC7746Ii0 {

    /* renamed from: a */
    public final /* synthetic */ AbstractC7538Ei0 f16288a;

    /* renamed from: b */
    public final /* synthetic */ C10145lV0 f16289b;

    public LegacySavedStateHandleController$tryToAddRecreator$1(AbstractC7538Ei0 abstractC7538Ei0, C10145lV0 c10145lV0) {
        this.f16288a = abstractC7538Ei0;
        this.f16289b = c10145lV0;
    }

    @Override // p000.InterfaceC7746Ii0
    /* renamed from: f */
    public final void mo2792f(InterfaceC7902Li0 interfaceC7902Li0, EnumC7382Bi0 enumC7382Bi0) {
        if (enumC7382Bi0 == EnumC7382Bi0.ON_START) {
            this.f16288a.mo2369b(this);
            this.f16289b.m22444d();
        }
    }
}
