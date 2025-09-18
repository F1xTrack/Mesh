package androidx.lifecycle;

import kotlin.Metadata;
import p000.AbstractC1589ZF;
import p000.EnumC7382Bi0;
import p000.InterfaceC7746Ii0;
import p000.InterfaceC7902Li0;
import p000.O90;

@Metadata(m22266d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m22267d2 = {"Landroidx/lifecycle/DefaultLifecycleObserverAdapter;", "LIi0;", "lifecycle-common"}, m22268k = 1, m22269mv = {1, 8, 0}, m22271xi = 48)
/* loaded from: classes.dex */
public final class DefaultLifecycleObserverAdapter implements InterfaceC7746Ii0 {

    /* renamed from: a */
    public final DefaultLifecycleObserver f16286a;

    /* renamed from: b */
    public final InterfaceC7746Ii0 f16287b;

    public DefaultLifecycleObserverAdapter(DefaultLifecycleObserver defaultLifecycleObserver, InterfaceC7746Ii0 interfaceC7746Ii0) {
        O90.m5968f(defaultLifecycleObserver, "defaultLifecycleObserver");
        this.f16286a = defaultLifecycleObserver;
        this.f16287b = interfaceC7746Ii0;
    }

    @Override // p000.InterfaceC7746Ii0
    /* renamed from: f */
    public final void mo2792f(InterfaceC7902Li0 interfaceC7902Li0, EnumC7382Bi0 enumC7382Bi0) {
        int i = AbstractC1589ZF.f14819a[enumC7382Bi0.ordinal()];
        DefaultLifecycleObserver defaultLifecycleObserver = this.f16286a;
        switch (i) {
            case 1:
                defaultLifecycleObserver.onCreate(interfaceC7902Li0);
                break;
            case 2:
                defaultLifecycleObserver.onStart(interfaceC7902Li0);
                break;
            case 3:
                defaultLifecycleObserver.onResume(interfaceC7902Li0);
                break;
            case 4:
                defaultLifecycleObserver.onPause(interfaceC7902Li0);
                break;
            case 5:
                defaultLifecycleObserver.onStop(interfaceC7902Li0);
                break;
            case 6:
                defaultLifecycleObserver.onDestroy(interfaceC7902Li0);
                break;
            case 7:
                throw new IllegalArgumentException("ON_ANY must not been send by anybody");
        }
        InterfaceC7746Ii0 interfaceC7746Ii0 = this.f16287b;
        if (interfaceC7746Ii0 != null) {
            interfaceC7746Ii0.mo2792f(interfaceC7902Li0, enumC7382Bi0);
        }
    }
}
