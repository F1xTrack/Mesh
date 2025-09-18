package defpackage;

import java.util.concurrent.locks.LockSupport;

/* renamed from: Ci, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C0200Ci extends F {
    public final Thread d;
    public final KP e;

    public C0200Ci(InterfaceC0173Bz interfaceC0173Bz, Thread thread, KP kp) {
        super(interfaceC0173Bz, true);
        this.d = thread;
        this.e = kp;
    }

    @Override // defpackage.C2548cc0
    public final void d(Object obj) {
        Thread threadCurrentThread = Thread.currentThread();
        Thread thread = this.d;
        if (O90.a(threadCurrentThread, thread)) {
            return;
        }
        LockSupport.unpark(thread);
    }
}
