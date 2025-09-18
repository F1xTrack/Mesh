package p000;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;

/* renamed from: nv */
/* loaded from: classes2.dex */
public class C6519nv {

    /* renamed from: b */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f38605b = AtomicIntegerFieldUpdater.newUpdater(C6519nv.class, "_handled$volatile");
    private volatile /* synthetic */ int _handled$volatile;

    /* renamed from: a */
    public final Throwable f38606a;

    public C6519nv(Throwable th, boolean z) {
        this.f38606a = th;
        this._handled$volatile = z ? 1 : 0;
    }

    public final String toString() {
        return getClass().getSimpleName() + '[' + this.f38606a + ']';
    }
}
