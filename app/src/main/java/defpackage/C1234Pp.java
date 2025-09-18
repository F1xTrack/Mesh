package defpackage;

import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;

/* renamed from: Pp, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1234Pp extends C6165nv {
    public static final /* synthetic */ AtomicIntegerFieldUpdater c = AtomicIntegerFieldUpdater.newUpdater(C1234Pp.class, "_resumed$volatile");
    private volatile /* synthetic */ int _resumed$volatile;

    public C1234Pp(C0767Jp c0767Jp, Throwable th, boolean z) {
        if (th == null) {
            th = new CancellationException("Continuation " + c0767Jp + " was cancelled normally");
        }
        super(th, z);
        this._resumed$volatile = 0;
    }
}
