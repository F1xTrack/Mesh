package p000;

import java.util.concurrent.locks.LockSupport;

/* renamed from: Ci */
/* loaded from: classes2.dex */
public final class C0171Ci extends AbstractC0315F {

    /* renamed from: d */
    public final Thread f1584d;

    /* renamed from: e */
    public final AbstractC0656KP f1585e;

    public C0171Ci(InterfaceC0125Bz interfaceC0125Bz, Thread thread, AbstractC0656KP abstractC0656KP) {
        super(interfaceC0125Bz, true);
        this.f1584d = thread;
        this.f1585e = abstractC0656KP;
    }

    @Override // p000.C9002cc0
    /* renamed from: d */
    public final void mo1298d(Object obj) {
        Thread threadCurrentThread = Thread.currentThread();
        Thread thread = this.f1584d;
        if (O90.m5963a(threadCurrentThread, thread)) {
            return;
        }
        LockSupport.unpark(thread);
    }
}
