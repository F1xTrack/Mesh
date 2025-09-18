package p000;

import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* loaded from: classes2.dex */
public final class B41 extends AbstractC1821c1 implements InterfaceC7820Jt0, InterfaceC6622pW {

    /* renamed from: e */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f551e = AtomicReferenceFieldUpdater.newUpdater(B41.class, Object.class, "_state$volatile");
    private volatile /* synthetic */ Object _state$volatile;

    /* renamed from: d */
    public int f552d;

    public B41(Object obj) {
        this._state$volatile = obj;
    }

    @Override // p000.AbstractC1821c1
    /* renamed from: b */
    public final AbstractC3902d1 mo487b() {
        return new C41();
    }

    @Override // p000.AbstractC1821c1
    /* renamed from: c */
    public final AbstractC3902d1[] mo488c() {
        return new C41[2];
    }

    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    /* JADX WARN: Removed duplicated region for block: B:105:0x0095 A[Catch: all -> 0x003e, TryCatch #0 {all -> 0x003e, blocks: (B:83:0x0039, B:97:0x007d, B:99:0x0085, B:102:0x008c, B:103:0x0092, B:105:0x0095, B:115:0x00b6, B:118:0x00c6, B:119:0x00e0, B:125:0x00f2, B:122:0x00e9, B:124:0x00ef, B:107:0x009b, B:111:0x00a2, B:90:0x0053, B:93:0x005d, B:96:0x006e), top: B:132:0x0027 }] */
    /* JADX WARN: Removed duplicated region for block: B:109:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x00b4 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:117:0x00c5  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x00c6 A[Catch: all -> 0x003e, TryCatch #0 {all -> 0x003e, blocks: (B:83:0x0039, B:97:0x007d, B:99:0x0085, B:102:0x008c, B:103:0x0092, B:105:0x0095, B:115:0x00b6, B:118:0x00c6, B:119:0x00e0, B:125:0x00f2, B:122:0x00e9, B:124:0x00ef, B:107:0x009b, B:111:0x00a2, B:90:0x0053, B:93:0x005d, B:96:0x006e), top: B:132:0x0027 }] */
    /* JADX WARN: Removed duplicated region for block: B:129:0x00fd A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0017  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0085 A[Catch: all -> 0x003e, TryCatch #0 {all -> 0x003e, blocks: (B:83:0x0039, B:97:0x007d, B:99:0x0085, B:102:0x008c, B:103:0x0092, B:105:0x0095, B:115:0x00b6, B:118:0x00c6, B:119:0x00e0, B:125:0x00f2, B:122:0x00e9, B:124:0x00ef, B:107:0x009b, B:111:0x00a2, B:90:0x0053, B:93:0x005d, B:96:0x006e), top: B:132:0x0027 }] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:117:0x00c5 -> B:97:0x007d). Please report as a decompilation issue!!! */
    @Override // p000.InterfaceC6622pW
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object collect(p000.InterfaceC6748rW r17, p000.InterfaceC1382Vy r18) {
        /*
            Method dump skipped, instructions count: 258
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.B41.collect(rW, Vy):java.lang.Object");
    }

    /* renamed from: e */
    public final Object m489e() {
        C7190yG c7190yG = XA1.f13602a;
        Object obj = f551e.get(this);
        if (obj == c7190yG) {
            return null;
        }
        return obj;
    }

    @Override // p000.InterfaceC7768It0, p000.InterfaceC6748rW
    public final Object emit(Object obj, InterfaceC1382Vy interfaceC1382Vy) {
        m490f(obj);
        return C8313Tf1.f11463a;
    }

    /* renamed from: f */
    public final void m490f(Object obj) {
        int i;
        AbstractC3902d1[] abstractC3902d1Arr;
        C7190yG c7190yG;
        if (obj == null) {
            obj = XA1.f13602a;
        }
        synchronized (this) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f551e;
            if (O90.m5963a(atomicReferenceFieldUpdater.get(this), obj)) {
                return;
            }
            atomicReferenceFieldUpdater.set(this, obj);
            int i2 = this.f552d;
            if ((i2 & 1) != 0) {
                this.f552d = i2 + 2;
                return;
            }
            int i3 = i2 + 1;
            this.f552d = i3;
            AbstractC3902d1[] abstractC3902d1Arr2 = this.f17259a;
            while (true) {
                C41[] c41Arr = (C41[]) abstractC3902d1Arr2;
                if (c41Arr != null) {
                    for (C41 c41 : c41Arr) {
                        if (c41 != null) {
                            AtomicReference atomicReference = c41.f1177a;
                            while (true) {
                                Object obj2 = atomicReference.get();
                                if (obj2 != null && obj2 != (c7190yG = JI1.f5446b)) {
                                    C7190yG c7190yG2 = JI1.f5445a;
                                    if (obj2 != c7190yG2) {
                                        while (!atomicReference.compareAndSet(obj2, c7190yG2)) {
                                            if (atomicReference.get() != obj2) {
                                                break;
                                            }
                                        }
                                        ((C0619Jp) obj2).resumeWith(C8313Tf1.f11463a);
                                        break;
                                    }
                                    while (!atomicReference.compareAndSet(obj2, c7190yG)) {
                                        if (atomicReference.get() != obj2) {
                                            break;
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
                synchronized (this) {
                    i = this.f552d;
                    if (i == i3) {
                        this.f552d = i3 + 1;
                        return;
                    }
                    abstractC3902d1Arr = this.f17259a;
                }
                abstractC3902d1Arr2 = abstractC3902d1Arr;
                i3 = i;
            }
        }
    }
}
