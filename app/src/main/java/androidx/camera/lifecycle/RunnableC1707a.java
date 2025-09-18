package androidx.camera.lifecycle;

import android.os.Trace;
import java.util.HashSet;
import java.util.Iterator;
import p000.C0471HT;
import p000.DV1;
import p000.OY1;

/* renamed from: androidx.camera.lifecycle.a */
/* loaded from: classes.dex */
public final /* synthetic */ class RunnableC1707a implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ C0471HT f16033a;

    public /* synthetic */ RunnableC1707a(C0471HT c0471ht) {
        this.f16033a = c0471ht;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C0471HT c0471ht = this.f16033a;
        Trace.beginSection(OY1.m6088f("CX:unbindAll"));
        try {
            DV1.m1716a();
            C0471HT.m3436d(c0471ht, 0);
            ((C1708b) c0471ht.f4312d).m9944k();
            Trace.endSection();
            C1708b c1708b = (C1708b) c0471ht.f4312d;
            synchronized (c1708b.f16036a) {
                try {
                    Iterator it = new HashSet(c1708b.f16038c.keySet()).iterator();
                    while (it.hasNext()) {
                        c1708b.m9945l(((LifecycleCameraRepository$LifecycleCameraRepositoryObserver) it.next()).f16032b);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        } catch (Throwable th2) {
            Trace.endSection();
            throw th2;
        }
    }
}
