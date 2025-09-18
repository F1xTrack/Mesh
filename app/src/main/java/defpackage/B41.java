package defpackage;

import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* loaded from: classes2.dex */
public final class B41 extends AbstractC2433c1 implements InterfaceC0780Jt0, InterfaceC6472pW {
    public static final /* synthetic */ AtomicReferenceFieldUpdater e = AtomicReferenceFieldUpdater.newUpdater(B41.class, Object.class, "_state$volatile");
    private volatile /* synthetic */ Object _state$volatile;
    public int d;

    public B41(Object obj) {
        this._state$volatile = obj;
    }

    @Override // defpackage.AbstractC2433c1
    public final AbstractC3309d1 b() {
        return new C41();
    }

    @Override // defpackage.AbstractC2433c1
    public final AbstractC3309d1[] c() {
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
    @Override // defpackage.InterfaceC6472pW
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object collect(defpackage.InterfaceC6853rW r17, defpackage.InterfaceC1729Vy r18) {
        /*
            Method dump skipped, instructions count: 258
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.B41.collect(rW, Vy):java.lang.Object");
    }

    public final Object e() {
        C8139yG c8139yG = XA1.a;
        Object obj = e.get(this);
        if (obj == c8139yG) {
            return null;
        }
        return obj;
    }

    @Override // defpackage.InterfaceC0702It0, defpackage.InterfaceC6853rW
    public final Object emit(Object obj, InterfaceC1729Vy interfaceC1729Vy) {
        f(obj);
        return C1518Tf1.a;
    }

    public final void f(Object obj) {
        int i;
        AbstractC3309d1[] abstractC3309d1Arr;
        C8139yG c8139yG;
        if (obj == null) {
            obj = XA1.a;
        }
        synchronized (this) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = e;
            if (O90.a(atomicReferenceFieldUpdater.get(this), obj)) {
                return;
            }
            atomicReferenceFieldUpdater.set(this, obj);
            int i2 = this.d;
            if ((i2 & 1) != 0) {
                this.d = i2 + 2;
                return;
            }
            int i3 = i2 + 1;
            this.d = i3;
            AbstractC3309d1[] abstractC3309d1Arr2 = this.a;
            while (true) {
                C41[] c41Arr = (C41[]) abstractC3309d1Arr2;
                if (c41Arr != null) {
                    for (C41 c41 : c41Arr) {
                        if (c41 != null) {
                            AtomicReference atomicReference = c41.a;
                            while (true) {
                                Object obj2 = atomicReference.get();
                                if (obj2 != null && obj2 != (c8139yG = JI1.b)) {
                                    C8139yG c8139yG2 = JI1.a;
                                    if (obj2 != c8139yG2) {
                                        while (!atomicReference.compareAndSet(obj2, c8139yG2)) {
                                            if (atomicReference.get() != obj2) {
                                                break;
                                            }
                                        }
                                        ((C0767Jp) obj2).resumeWith(C1518Tf1.a);
                                        break;
                                    }
                                    while (!atomicReference.compareAndSet(obj2, c8139yG)) {
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
                    i = this.d;
                    if (i == i3) {
                        this.d = i3 + 1;
                        return;
                    }
                    abstractC3309d1Arr = this.a;
                }
                abstractC3309d1Arr2 = abstractC3309d1Arr;
                i3 = i;
            }
        }
    }
}
