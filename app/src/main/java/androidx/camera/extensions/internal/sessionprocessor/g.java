package androidx.camera.extensions.internal.sessionprocessor;

import androidx.camera.extensions.internal.sessionprocessor.StillCaptureProcessor;
import defpackage.AbstractC0759Jm0;
import defpackage.C6974s81;
import defpackage.NT;
import defpackage.VY;
import java.util.Collections;
import java.util.List;

/* loaded from: classes.dex */
public final class g implements StillCaptureProcessor.OnCaptureResultCallback {
    public final /* synthetic */ int a;
    public final /* synthetic */ VY b;
    public final /* synthetic */ C6974s81 c;
    public final /* synthetic */ h d;

    public g(int i, VY vy, C6974s81 c6974s81, h hVar) {
        this.d = hVar;
        this.a = i;
        this.b = vy;
        this.c = c6974s81;
    }

    @Override // androidx.camera.extensions.internal.sessionprocessor.StillCaptureProcessor.OnCaptureResultCallback
    public final void onCaptureCompleted(long j, List list) {
        if (this.d.A) {
            NT nt = new NT(j, this.c, h.p(list));
            VY vy = this.b;
            vy.d = nt;
            vy.g();
        }
    }

    @Override // androidx.camera.extensions.internal.sessionprocessor.StillCaptureProcessor.OnCaptureResultCallback
    public final void onCaptureProcessProgressed(int i) {
        this.b.onCaptureProcessProgressed(i);
    }

    @Override // androidx.camera.extensions.internal.sessionprocessor.StillCaptureProcessor.OnCaptureResultCallback
    public final void onError(Exception exc) {
        this.b.d();
        this.d.t = false;
    }

    @Override // androidx.camera.extensions.internal.sessionprocessor.StillCaptureProcessor.OnCaptureResultCallback
    public final void onProcessCompleted() {
        long jLongValue;
        h hVar = this.d;
        if (!hVar.A) {
            int i = this.a;
            synchronized (hVar.e) {
                try {
                    Long l = (Long) hVar.w.get(Integer.valueOf(i));
                    if (l == null) {
                        jLongValue = -1;
                    } else {
                        hVar.w.remove(Integer.valueOf(i));
                        jLongValue = l.longValue();
                    }
                } finally {
                }
            }
            if (jLongValue == -1) {
                AbstractC0759Jm0.f("BasicSessionProcessor");
                this.b.d();
                this.d.t = false;
                return;
            } else {
                this.b.d = new NT(jLongValue, this.c, Collections.emptyMap());
                this.b.g();
            }
        }
        this.d.t = false;
    }
}
