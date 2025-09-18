package p000;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceArray;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* loaded from: classes2.dex */
public class XX0 {

    /* renamed from: b */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f13834b = AtomicReferenceFieldUpdater.newUpdater(XX0.class, Object.class, "head$volatile");

    /* renamed from: c */
    public static final /* synthetic */ AtomicLongFieldUpdater f13835c = AtomicLongFieldUpdater.newUpdater(XX0.class, "deqIdx$volatile");

    /* renamed from: d */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f13836d = AtomicReferenceFieldUpdater.newUpdater(XX0.class, Object.class, "tail$volatile");

    /* renamed from: e */
    public static final /* synthetic */ AtomicLongFieldUpdater f13837e = AtomicLongFieldUpdater.newUpdater(XX0.class, "enqIdx$volatile");

    /* renamed from: f */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f13838f = AtomicIntegerFieldUpdater.newUpdater(XX0.class, "_availablePermits$volatile");
    private volatile /* synthetic */ int _availablePermits$volatile;

    /* renamed from: a */
    public final C0556Ip f13839a;
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
        this.f13839a = new C0556Ip(1, this);
    }

    /* renamed from: a */
    public final void m9070a(C7976Mt0 c7976Mt0) {
        Object objM5972j;
        VX0 vx0;
        long j;
        while (true) {
            int andDecrement = f13838f.getAndDecrement(this);
            if (andDecrement <= 1) {
                Object obj = C8313Tf1.f11463a;
                InterfaceC6625pZ interfaceC6625pZ = this.f13839a;
                if (andDecrement > 0) {
                    c7976Mt0.mo3597e(obj, interfaceC6625pZ);
                    return;
                }
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f13836d;
                ZX0 zx0 = (ZX0) atomicReferenceFieldUpdater.get(this);
                long andIncrement = f13837e.getAndIncrement(this);
                VX0 vx02 = VX0.f12608a;
                long j2 = andIncrement / YX0.f14336f;
                while (true) {
                    objM5972j = O90.m5972j(zx0, j2, vx02);
                    if (!HR1.m3426c(objM5972j)) {
                        KX0 kx0M3425b = HR1.m3425b(objM5972j);
                        while (true) {
                            KX0 kx0 = (KX0) atomicReferenceFieldUpdater.get(this);
                            vx0 = vx02;
                            j = j2;
                            if (kx0.f6149c >= kx0M3425b.f6149c) {
                                break;
                            }
                            if (!kx0M3425b.m4667j()) {
                                break;
                            }
                            while (!atomicReferenceFieldUpdater.compareAndSet(this, kx0, kx0M3425b)) {
                                if (atomicReferenceFieldUpdater.get(this) != kx0) {
                                    if (kx0M3425b.m4663f()) {
                                        kx0M3425b.m23887e();
                                    }
                                    vx02 = vx0;
                                    j2 = j;
                                }
                            }
                            if (kx0.m4663f()) {
                                kx0.m23887e();
                            }
                        }
                    } else {
                        break;
                    }
                    vx02 = vx0;
                    j2 = j;
                }
                ZX0 zx02 = (ZX0) HR1.m3425b(objM5972j);
                int i = (int) (andIncrement % YX0.f14336f);
                AtomicReferenceArray atomicReferenceArray = zx02.f14960e;
                while (!atomicReferenceArray.compareAndSet(i, null, c7976Mt0)) {
                    if (atomicReferenceArray.get(i) != null) {
                        C7190yG c7190yG = YX0.f14332b;
                        C7190yG c7190yG2 = YX0.f14333c;
                        while (!atomicReferenceArray.compareAndSet(i, c7190yG, c7190yG2)) {
                            if (atomicReferenceArray.get(i) != c7190yG) {
                                break;
                            }
                        }
                        c7976Mt0.mo3597e(obj, interfaceC6625pZ);
                        return;
                    }
                }
                c7976Mt0.mo4425b(zx02, i);
                return;
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x0075  */
    /* renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void m9071b() {
        /*
            Method dump skipped, instructions count: 247
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.XX0.m9071b():void");
    }
}
