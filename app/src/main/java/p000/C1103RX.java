package p000;

import androidx.fragment.app.Fragment;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: RX */
/* loaded from: classes.dex */
public final class C1103RX extends AbstractC1229TX {

    /* renamed from: a */
    public final /* synthetic */ InterfaceC6894tZ f10256a;

    /* renamed from: b */
    public final /* synthetic */ AtomicReference f10257b;

    /* renamed from: c */
    public final /* synthetic */ AbstractC0696L2 f10258c;

    /* renamed from: d */
    public final /* synthetic */ InterfaceC0570J2 f10259d;

    /* renamed from: e */
    public final /* synthetic */ Fragment f10260e;

    public C1103RX(Fragment fragment, InterfaceC6894tZ interfaceC6894tZ, AtomicReference atomicReference, AbstractC0696L2 abstractC0696L2, InterfaceC0570J2 interfaceC0570J2) {
        this.f10260e = fragment;
        this.f10256a = interfaceC6894tZ;
        this.f10257b = atomicReference;
        this.f10258c = abstractC0696L2;
        this.f10259d = interfaceC0570J2;
    }

    @Override // p000.AbstractC1229TX
    /* renamed from: a */
    public final void mo7030a() {
        Fragment fragment = this.f10260e;
        this.f10257b.set(((AbstractC1576Z2) this.f10256a.apply(null)).m9457d(fragment.generateActivityResultKey(), fragment, this.f10258c, this.f10259d));
    }
}
