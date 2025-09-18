package androidx.activity;

import kotlin.Metadata;
import p000.AbstractC7538Ei0;
import p000.C0767MB;
import p000.C1648aB;
import p000.C7828Jx0;
import p000.EnumC7382Bi0;
import p000.InterfaceC0430Gp;
import p000.InterfaceC7746Ii0;
import p000.InterfaceC7902Li0;
import p000.O90;

@Metadata(m22266d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0082\u0004\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, m22267d2 = {"androidx/activity/OnBackPressedDispatcher$LifecycleOnBackPressedCancellable", "LIi0;", "LGp;", "activity_release"}, m22268k = 1, m22269mv = {1, 8, 0}, m22271xi = 48)
/* loaded from: classes.dex */
final class OnBackPressedDispatcher$LifecycleOnBackPressedCancellable implements InterfaceC7746Ii0, InterfaceC0430Gp {

    /* renamed from: a */
    public final AbstractC7538Ei0 f15738a;

    /* renamed from: b */
    public final C0767MB f15739b;

    /* renamed from: c */
    public C7828Jx0 f15740c;

    /* renamed from: d */
    public final /* synthetic */ C1690a f15741d;

    public OnBackPressedDispatcher$LifecycleOnBackPressedCancellable(C1690a c1690a, AbstractC7538Ei0 abstractC7538Ei0, C0767MB c0767mb) {
        O90.m5968f(c0767mb, "onBackPressedCallback");
        this.f15741d = c1690a;
        this.f15738a = abstractC7538Ei0;
        this.f15739b = c0767mb;
        abstractC7538Ei0.mo2368a(this);
    }

    @Override // p000.InterfaceC0430Gp
    public final void cancel() {
        this.f15738a.mo2369b(this);
        this.f15739b.f7027b.remove(this);
        C7828Jx0 c7828Jx0 = this.f15740c;
        if (c7828Jx0 != null) {
            c7828Jx0.cancel();
        }
        this.f15740c = null;
    }

    @Override // p000.InterfaceC7746Ii0
    /* renamed from: f */
    public final void mo2792f(InterfaceC7902Li0 interfaceC7902Li0, EnumC7382Bi0 enumC7382Bi0) {
        if (enumC7382Bi0 != EnumC7382Bi0.ON_START) {
            if (enumC7382Bi0 != EnumC7382Bi0.ON_STOP) {
                if (enumC7382Bi0 == EnumC7382Bi0.ON_DESTROY) {
                    cancel();
                    return;
                }
                return;
            } else {
                C7828Jx0 c7828Jx0 = this.f15740c;
                if (c7828Jx0 != null) {
                    c7828Jx0.cancel();
                    return;
                }
                return;
            }
        }
        C1690a c1690a = this.f15741d;
        c1690a.getClass();
        C0767MB c0767mb = this.f15739b;
        O90.m5968f(c0767mb, "onBackPressedCallback");
        c1690a.f15743b.m23084i(c0767mb);
        C7828Jx0 c7828Jx02 = new C7828Jx0(c1690a, c0767mb);
        c0767mb.f7027b.add(c7828Jx02);
        c1690a.m9823e();
        c0767mb.f7028c = new C1648aB(0, c1690a, C1690a.class, "updateEnabledCallbacks", "updateEnabledCallbacks()V", 0, 5);
        this.f15740c = c7828Jx02;
    }
}
