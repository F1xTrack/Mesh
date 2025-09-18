package defpackage;

import androidx.fragment.app.Fragment;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes.dex */
public final class RX extends TX {
    public final /* synthetic */ InterfaceC7244tZ a;
    public final /* synthetic */ AtomicReference b;
    public final /* synthetic */ L2 c;
    public final /* synthetic */ J2 d;
    public final /* synthetic */ Fragment e;

    public RX(Fragment fragment, InterfaceC7244tZ interfaceC7244tZ, AtomicReference atomicReference, L2 l2, J2 j2) {
        this.e = fragment;
        this.a = interfaceC7244tZ;
        this.b = atomicReference;
        this.c = l2;
        this.d = j2;
    }

    @Override // defpackage.TX
    public final void a() {
        Fragment fragment = this.e;
        this.b.set(((Z2) this.a.apply(null)).d(fragment.generateActivityResultKey(), fragment, this.c, this.d));
    }
}
