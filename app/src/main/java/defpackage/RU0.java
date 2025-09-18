package defpackage;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* loaded from: classes2.dex */
public final class RU0 implements InterfaceC1729Vy, InterfaceC1108Nz {
    public static final AtomicReferenceFieldUpdater b = AtomicReferenceFieldUpdater.newUpdater(RU0.class, Object.class, "result");
    public final InterfaceC1729Vy a;
    private volatile Object result;

    public RU0(InterfaceC1729Vy interfaceC1729Vy) {
        EnumC1030Mz enumC1030Mz = EnumC1030Mz.b;
        this.a = interfaceC1729Vy;
        this.result = enumC1030Mz;
    }

    public final Object b() {
        Object obj = this.result;
        EnumC1030Mz enumC1030Mz = EnumC1030Mz.b;
        if (obj == enumC1030Mz) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = b;
            EnumC1030Mz enumC1030Mz2 = EnumC1030Mz.a;
            while (!atomicReferenceFieldUpdater.compareAndSet(this, enumC1030Mz, enumC1030Mz2)) {
                if (atomicReferenceFieldUpdater.get(this) != enumC1030Mz) {
                    obj = this.result;
                }
            }
            return EnumC1030Mz.a;
        }
        if (obj == EnumC1030Mz.c) {
            return EnumC1030Mz.a;
        }
        if (obj instanceof OS0) {
            throw ((OS0) obj).a;
        }
        return obj;
    }

    @Override // defpackage.InterfaceC1108Nz
    public final InterfaceC1108Nz getCallerFrame() {
        InterfaceC1729Vy interfaceC1729Vy = this.a;
        if (interfaceC1729Vy instanceof InterfaceC1108Nz) {
            return (InterfaceC1108Nz) interfaceC1729Vy;
        }
        return null;
    }

    @Override // defpackage.InterfaceC1729Vy
    public final InterfaceC0173Bz getContext() {
        return this.a.getContext();
    }

    @Override // defpackage.InterfaceC1729Vy
    public final void resumeWith(Object obj) {
        while (true) {
            Object obj2 = this.result;
            EnumC1030Mz enumC1030Mz = EnumC1030Mz.b;
            if (obj2 == enumC1030Mz) {
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = b;
                while (!atomicReferenceFieldUpdater.compareAndSet(this, enumC1030Mz, obj)) {
                    if (atomicReferenceFieldUpdater.get(this) != enumC1030Mz) {
                        break;
                    }
                }
                return;
            }
            EnumC1030Mz enumC1030Mz2 = EnumC1030Mz.a;
            if (obj2 != enumC1030Mz2) {
                throw new IllegalStateException("Already resumed");
            }
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = b;
            EnumC1030Mz enumC1030Mz3 = EnumC1030Mz.c;
            while (!atomicReferenceFieldUpdater2.compareAndSet(this, enumC1030Mz2, enumC1030Mz3)) {
                if (atomicReferenceFieldUpdater2.get(this) != enumC1030Mz2) {
                    break;
                }
            }
            this.a.resumeWith(obj);
            return;
        }
    }

    public final String toString() {
        return "SafeContinuation for " + this.a;
    }
}
