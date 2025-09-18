package p000;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceArray;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* renamed from: Qo1, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C8175Qo1 {

    /* renamed from: b */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f9792b = AtomicReferenceFieldUpdater.newUpdater(C8175Qo1.class, Object.class, "lastScheduledTask$volatile");

    /* renamed from: c */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f9793c = AtomicIntegerFieldUpdater.newUpdater(C8175Qo1.class, "producerIndex$volatile");

    /* renamed from: d */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f9794d = AtomicIntegerFieldUpdater.newUpdater(C8175Qo1.class, "consumerIndex$volatile");

    /* renamed from: e */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f9795e = AtomicIntegerFieldUpdater.newUpdater(C8175Qo1.class, "blockingTasksInBuffer$volatile");

    /* renamed from: a */
    public final AtomicReferenceArray f9796a = new AtomicReferenceArray(128);
    private volatile /* synthetic */ int blockingTasksInBuffer$volatile;
    private volatile /* synthetic */ int consumerIndex$volatile;
    private volatile /* synthetic */ Object lastScheduledTask$volatile;
    private volatile /* synthetic */ int producerIndex$volatile;

    /* renamed from: a */
    public final O81 m6789a(O81 o81) {
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = f9793c;
        if (atomicIntegerFieldUpdater.get(this) - f9794d.get(this) == 127) {
            return o81;
        }
        if (o81.f8259b) {
            f9795e.incrementAndGet(this);
        }
        int i = atomicIntegerFieldUpdater.get(this) & 127;
        while (true) {
            AtomicReferenceArray atomicReferenceArray = this.f9796a;
            if (atomicReferenceArray.get(i) == null) {
                atomicReferenceArray.lazySet(i, o81);
                atomicIntegerFieldUpdater.incrementAndGet(this);
                return null;
            }
            Thread.yield();
        }
    }

    /* renamed from: b */
    public final O81 m6790b() {
        O81 o81;
        while (true) {
            AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = f9794d;
            int i = atomicIntegerFieldUpdater.get(this);
            if (i - f9793c.get(this) == 0) {
                return null;
            }
            int i2 = i & 127;
            if (atomicIntegerFieldUpdater.compareAndSet(this, i, i + 1) && (o81 = (O81) this.f9796a.getAndSet(i2, null)) != null) {
                if (o81.f8259b) {
                    f9795e.decrementAndGet(this);
                }
                return o81;
            }
        }
    }

    /* renamed from: c */
    public final O81 m6791c(int i, boolean z) {
        int i2 = i & 127;
        AtomicReferenceArray atomicReferenceArray = this.f9796a;
        O81 o81 = (O81) atomicReferenceArray.get(i2);
        if (o81 != null && o81.f8259b == z) {
            while (!atomicReferenceArray.compareAndSet(i2, o81, null)) {
                if (atomicReferenceArray.get(i2) != o81) {
                }
            }
            if (z) {
                f9795e.decrementAndGet(this);
            }
            return o81;
        }
        return null;
    }
}
