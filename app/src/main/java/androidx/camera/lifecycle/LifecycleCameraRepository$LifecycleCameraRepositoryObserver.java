package androidx.camera.lifecycle;

import p000.EnumC7382Bi0;
import p000.InterfaceC7850Ki0;
import p000.InterfaceC7902Li0;
import p000.InterfaceC8504Wx0;

/* loaded from: classes.dex */
class LifecycleCameraRepository$LifecycleCameraRepositoryObserver implements InterfaceC7850Ki0 {

    /* renamed from: a */
    public final C1708b f16031a;

    /* renamed from: b */
    public final InterfaceC7902Li0 f16032b;

    public LifecycleCameraRepository$LifecycleCameraRepositoryObserver(InterfaceC7902Li0 interfaceC7902Li0, C1708b c1708b) {
        this.f16032b = interfaceC7902Li0;
        this.f16031a = c1708b;
    }

    @InterfaceC8504Wx0(EnumC7382Bi0.ON_DESTROY)
    public void onDestroy(InterfaceC7902Li0 interfaceC7902Li0) {
        this.f16031a.m9945l(interfaceC7902Li0);
    }

    @InterfaceC8504Wx0(EnumC7382Bi0.ON_START)
    public void onStart(InterfaceC7902Li0 interfaceC7902Li0) {
        this.f16031a.m9940g(interfaceC7902Li0);
    }

    @InterfaceC8504Wx0(EnumC7382Bi0.ON_STOP)
    public void onStop(InterfaceC7902Li0 interfaceC7902Li0) {
        this.f16031a.m9941h(interfaceC7902Li0);
    }
}
