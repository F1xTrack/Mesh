package defpackage;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceArray;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* loaded from: classes2.dex */
public class XX0 {
    public static final /* synthetic */ AtomicReferenceFieldUpdater b = AtomicReferenceFieldUpdater.newUpdater(XX0.class, Object.class, "head$volatile");
    public static final /* synthetic */ AtomicLongFieldUpdater c = AtomicLongFieldUpdater.newUpdater(XX0.class, "deqIdx$volatile");
    public static final /* synthetic */ AtomicReferenceFieldUpdater d = AtomicReferenceFieldUpdater.newUpdater(XX0.class, Object.class, "tail$volatile");
    public static final /* synthetic */ AtomicLongFieldUpdater e = AtomicLongFieldUpdater.newUpdater(XX0.class, "enqIdx$volatile");
    public static final /* synthetic */ AtomicIntegerFieldUpdater f = AtomicIntegerFieldUpdater.newUpdater(XX0.class, "_availablePermits$volatile");
    private volatile /* synthetic */ int _availablePermits$volatile;
    public final C0689Ip a;
    private volatile /* synthetic */ long deqIdx$volatile;
    private volatile /* synthetic */ long enqIdx$volatile;
    private volatile /* synthetic */ Object head$volatile;
    private volatile /* synthetic */ Object tail$volatile;

    public XX0(int i) {
        if (i < 0 || i > 1) {
            throw new IllegalArgumentException("The number of acquired permits should be in 0..1".toString());
        }
        ZX0 zx0 = new ZX0(0L, null, 2);
        this.head$volatile = zx0;
        this.tail$volatile = zx0;
        this._availablePermits$volatile = 1 - i;
        this.a = new C0689Ip(1, this);
    }

    public final void a(C1013Mt0 c1013Mt0) {
        Object objJ;
        VX0 vx0;
        long j;
        while (true) {
            int andDecrement = f.getAndDecrement(this);
            if (andDecrement <= 1) {
                Object obj = C1518Tf1.a;
                InterfaceC6481pZ interfaceC6481pZ = this.a;
                if (andDecrement > 0) {
                    c1013Mt0.e(obj, interfaceC6481pZ);
                    return;
                }
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = d;
                ZX0 zx0 = (ZX0) atomicReferenceFieldUpdater.get(this);
                long andIncrement = e.getAndIncrement(this);
                VX0 vx02 = VX0.a;
                long j2 = andIncrement / YX0.f;
                while (true) {
                    objJ = O90.j(zx0, j2, vx02);
                    if (!HR1.c(objJ)) {
                        KX0 kx0B = HR1.b(objJ);
                        while (true) {
                            KX0 kx0 = (KX0) atomicReferenceFieldUpdater.get(this);
                            vx0 = vx02;
                            j = j2;
                            if (kx0.c >= kx0B.c) {
                                break;
                            }
                            if (!kx0B.j()) {
                                break;
                            }
                            while (!atomicReferenceFieldUpdater.compareAndSet(this, kx0, kx0B)) {
                                if (atomicReferenceFieldUpdater.get(this) != kx0) {
                                    if (kx0B.f()) {
                                        kx0B.e();
                                    }
                                    vx02 = vx0;
                                    j2 = j;
                                }
                            }
                            if (kx0.f()) {
                                kx0.e();
                            }
                        }
                    } else {
                        break;
                    }
                    vx02 = vx0;
                    j2 = j;
                }
                ZX0 zx02 = (ZX0) HR1.b(objJ);
                int i = (int) (andIncrement % YX0.f);
                AtomicReferenceArray atomicReferenceArray = zx02.e;
                while (!atomicReferenceArray.compareAndSet(i, null, c1013Mt0)) {
                    if (atomicReferenceArray.get(i) != null) {
                        C8139yG c8139yG = YX0.b;
                        C8139yG c8139yG2 = YX0.c;
                        while (!atomicReferenceArray.compareAndSet(i, c8139yG, c8139yG2)) {
                            if (atomicReferenceArray.get(i) != c8139yG) {
                                break;
                            }
                        }
                        c1013Mt0.e(obj, interfaceC6481pZ);
                        return;
                    }
                }
                c1013Mt0.b(zx02, i);
                return;
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x0075  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void b() {
        /*
            Method dump skipped, instructions count: 247
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.XX0.b():void");
    }
}
