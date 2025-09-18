package p000;

import java.util.Map;
import java.util.concurrent.atomic.AtomicMarkableReference;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes.dex */
public final /* synthetic */ class N61 implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ int f7506a;

    /* renamed from: b */
    public final /* synthetic */ Object f7507b;

    public /* synthetic */ N61(int i, Object obj) {
        this.f7506a = i;
        this.f7507b = obj;
    }

    /* renamed from: a */
    private final void m5543a() {
        C1338VG c1338vg = (C1338VG) this.f7507b;
        Map mapM25474a = null;
        ((AtomicReference) c1338vg.f12476d).set(null);
        synchronized (c1338vg) {
            try {
                if (((AtomicMarkableReference) c1338vg.f12475c).isMarked()) {
                    mapM25474a = ((C11447vg0) ((AtomicMarkableReference) c1338vg.f12475c).getReference()).m25474a();
                    AtomicMarkableReference atomicMarkableReference = (AtomicMarkableReference) c1338vg.f12475c;
                    atomicMarkableReference.set((C11447vg0) atomicMarkableReference.getReference(), false);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (mapM25474a != null) {
            C10030kb1 c10030kb1 = (C10030kb1) c1338vg.f12477e;
            ((C7504Dr0) c10030kb1.f36561a).m1915h(mapM25474a, (String) c10030kb1.f36563c, c1338vg.f12474b);
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
        throw new UnsupportedOperationException("Method not decompiled: p000.N61.run():void");
    }
}
