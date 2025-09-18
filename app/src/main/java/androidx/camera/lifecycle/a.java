package androidx.camera.lifecycle;

import android.os.Trace;
import defpackage.DV1;
import defpackage.HT;
import defpackage.OY1;
import java.util.HashSet;
import java.util.Iterator;

/* loaded from: classes.dex */
public final /* synthetic */ class a implements Runnable {
    public final /* synthetic */ HT a;

    public /* synthetic */ a(HT ht) {
        this.a = ht;
    }

    @Override // java.lang.Runnable
    public final void run() {
        HT ht = this.a;
        Trace.beginSection(OY1.f("CX:unbindAll"));
        try {
            DV1.a();
            HT.d(ht, 0);
            ((b) ht.d).k();
            Trace.endSection();
            b bVar = (b) ht.d;
            synchronized (bVar.a) {
                try {
                    Iterator it = new HashSet(bVar.c.keySet()).iterator();
                    while (it.hasNext()) {
                        bVar.l(((LifecycleCameraRepository$LifecycleCameraRepositoryObserver) it.next()).b);
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
