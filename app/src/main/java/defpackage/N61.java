package defpackage;

import java.util.Map;
import java.util.concurrent.atomic.AtomicMarkableReference;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes.dex */
public final /* synthetic */ class N61 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ N61(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    private final void a() {
        VG vg = (VG) this.b;
        Map mapA = null;
        ((AtomicReference) vg.d).set(null);
        synchronized (vg) {
            try {
                if (((AtomicMarkableReference) vg.c).isMarked()) {
                    mapA = ((C7648vg0) ((AtomicMarkableReference) vg.c).getReference()).a();
                    AtomicMarkableReference atomicMarkableReference = (AtomicMarkableReference) vg.c;
                    atomicMarkableReference.set((C7648vg0) atomicMarkableReference.getReference(), false);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (mapA != null) {
            C5534kb1 c5534kb1 = (C5534kb1) vg.e;
            ((C0306Dr0) c5534kb1.a).h(mapA, (String) c5534kb1.c, vg.b);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:411:0x037d  */
    /* JADX WARN: Type inference failed for: r0v92, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r3v39, types: [java.lang.Object, kotlin.Lazy] */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void run() throws java.lang.IllegalAccessException, java.lang.IllegalArgumentException {
        /*
            Method dump skipped, instructions count: 1430
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.N61.run():void");
    }
}
