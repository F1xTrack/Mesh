package p000;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;

/* loaded from: classes2.dex */
public abstract class KX0 extends AbstractC6648pw implements InterfaceC7980Mv0 {

    /* renamed from: d */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f6148d = AtomicIntegerFieldUpdater.newUpdater(KX0.class, "cleanedAndPointers$volatile");

    /* renamed from: c */
    public final long f6149c;
    private volatile /* synthetic */ int cleanedAndPointers$volatile;

    public KX0(long j, KX0 kx0, int i) {
        super(kx0);
        this.f6149c = j;
        this.cleanedAndPointers$volatile = i << 16;
    }

    @Override // p000.AbstractC6648pw
    /* renamed from: d */
    public final boolean mo4662d() {
        return f6148d.get(this) == mo4664g() && m23886c() != null;
    }

    /* renamed from: f */
    public final boolean m4663f() {
        return f6148d.addAndGet(this, -65536) == mo4664g() && m23886c() != null;
    }

    /* renamed from: g */
    public abstract int mo4664g();

    /* renamed from: h */
    public abstract void mo4665h(int i, InterfaceC0125Bz interfaceC0125Bz);

    /* renamed from: i */
    public final void m4666i() {
        if (f6148d.incrementAndGet(this) == mo4664g()) {
            m23887e();
        }
    }

    /* renamed from: j */
    public final boolean m4667j() {
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater;
        int i;
        do {
            atomicIntegerFieldUpdater = f6148d;
            i = atomicIntegerFieldUpdater.get(this);
            if (i == mo4664g() && m23886c() != null) {
                return false;
            }
        } while (!atomicIntegerFieldUpdater.compareAndSet(this, i, 65536 + i));
        return true;
    }
}
