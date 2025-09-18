package p000;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* loaded from: classes2.dex */
public final class RU0 implements InterfaceC1382Vy, InterfaceC0880Nz {

    /* renamed from: b */
    public static final AtomicReferenceFieldUpdater f10200b = AtomicReferenceFieldUpdater.newUpdater(RU0.class, Object.class, "result");

    /* renamed from: a */
    public final InterfaceC1382Vy f10201a;
    private volatile Object result;

    public RU0(InterfaceC1382Vy interfaceC1382Vy) {
        EnumC0817Mz enumC0817Mz = EnumC0817Mz.f7419b;
        this.f10201a = interfaceC1382Vy;
        this.result = enumC0817Mz;
    }

    /* renamed from: b */
    public final Object m7026b() {
        Object obj = this.result;
        EnumC0817Mz enumC0817Mz = EnumC0817Mz.f7419b;
        if (obj == enumC0817Mz) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f10200b;
            EnumC0817Mz enumC0817Mz2 = EnumC0817Mz.f7418a;
            while (!atomicReferenceFieldUpdater.compareAndSet(this, enumC0817Mz, enumC0817Mz2)) {
                if (atomicReferenceFieldUpdater.get(this) != enumC0817Mz) {
                    obj = this.result;
                }
            }
            return EnumC0817Mz.f7418a;
        }
        if (obj == EnumC0817Mz.f7420c) {
            return EnumC0817Mz.f7418a;
        }
        if (obj instanceof OS0) {
            throw ((OS0) obj).f8450a;
        }
        return obj;
    }

    @Override // p000.InterfaceC0880Nz
    public final InterfaceC0880Nz getCallerFrame() {
        InterfaceC1382Vy interfaceC1382Vy = this.f10201a;
        if (interfaceC1382Vy instanceof InterfaceC0880Nz) {
            return (InterfaceC0880Nz) interfaceC1382Vy;
        }
        return null;
    }

    @Override // p000.InterfaceC1382Vy
    public final InterfaceC0125Bz getContext() {
        return this.f10201a.getContext();
    }

    @Override // p000.InterfaceC1382Vy
    public final void resumeWith(Object obj) {
        while (true) {
            Object obj2 = this.result;
            EnumC0817Mz enumC0817Mz = EnumC0817Mz.f7419b;
            if (obj2 == enumC0817Mz) {
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f10200b;
                while (!atomicReferenceFieldUpdater.compareAndSet(this, enumC0817Mz, obj)) {
                    if (atomicReferenceFieldUpdater.get(this) != enumC0817Mz) {
                        break;
                    }
                }
                return;
            }
            EnumC0817Mz enumC0817Mz2 = EnumC0817Mz.f7418a;
            if (obj2 != enumC0817Mz2) {
                throw new IllegalStateException("Already resumed");
            }
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = f10200b;
            EnumC0817Mz enumC0817Mz3 = EnumC0817Mz.f7420c;
            while (!atomicReferenceFieldUpdater2.compareAndSet(this, enumC0817Mz2, enumC0817Mz3)) {
                if (atomicReferenceFieldUpdater2.get(this) != enumC0817Mz2) {
                    break;
                }
            }
            this.f10201a.resumeWith(obj);
            return;
        }
    }

    public final String toString() {
        return "SafeContinuation for " + this.f10201a;
    }
}
