package p000;

import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;

/* renamed from: Pp */
/* loaded from: classes2.dex */
public final class C0996Pp extends C6519nv {

    /* renamed from: c */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f9287c = AtomicIntegerFieldUpdater.newUpdater(C0996Pp.class, "_resumed$volatile");
    private volatile /* synthetic */ int _resumed$volatile;

    public C0996Pp(C0619Jp c0619Jp, Throwable th, boolean z) {
        if (th == null) {
            th = new CancellationException("Continuation " + c0619Jp + " was cancelled normally");
        }
        super(th, z);
        this._resumed$volatile = 0;
    }
}
