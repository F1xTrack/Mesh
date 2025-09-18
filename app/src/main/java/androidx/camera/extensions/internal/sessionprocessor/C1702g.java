package androidx.camera.extensions.internal.sessionprocessor;

import androidx.camera.extensions.internal.sessionprocessor.StillCaptureProcessor;
import java.util.Collections;
import java.util.List;
import p000.AbstractC7806Jm0;
import p000.C0848NT;
import p000.C10996s81;
import p000.C1356VY;

/* renamed from: androidx.camera.extensions.internal.sessionprocessor.g */
/* loaded from: classes.dex */
public final class C1702g implements StillCaptureProcessor.OnCaptureResultCallback {

    /* renamed from: a */
    public final /* synthetic */ int f15992a;

    /* renamed from: b */
    public final /* synthetic */ C1356VY f15993b;

    /* renamed from: c */
    public final /* synthetic */ C10996s81 f15994c;

    /* renamed from: d */
    public final /* synthetic */ C1703h f15995d;

    public C1702g(int i, C1356VY c1356vy, C10996s81 c10996s81, C1703h c1703h) {
        this.f15995d = c1703h;
        this.f15992a = i;
        this.f15993b = c1356vy;
        this.f15994c = c10996s81;
    }

    @Override // androidx.camera.extensions.internal.sessionprocessor.StillCaptureProcessor.OnCaptureResultCallback
    public final void onCaptureCompleted(long j, List list) {
        if (this.f15995d.f15997A) {
            C0848NT c0848nt = new C0848NT(j, this.f15994c, C1703h.m9920p(list));
            C1356VY c1356vy = this.f15993b;
            c1356vy.f12613d = c0848nt;
            c1356vy.mo8496g();
        }
    }

    @Override // androidx.camera.extensions.internal.sessionprocessor.StillCaptureProcessor.OnCaptureResultCallback
    public final void onCaptureProcessProgressed(int i) {
        this.f15993b.onCaptureProcessProgressed(i);
    }

    @Override // androidx.camera.extensions.internal.sessionprocessor.StillCaptureProcessor.OnCaptureResultCallback
    public final void onError(Exception exc) {
        this.f15993b.mo8492d();
        this.f15995d.f16010t = false;
    }

    @Override // androidx.camera.extensions.internal.sessionprocessor.StillCaptureProcessor.OnCaptureResultCallback
    public final void onProcessCompleted() {
        long jLongValue;
        C1703h c1703h = this.f15995d;
        if (!c1703h.f15997A) {
            int i = this.f15992a;
            synchronized (c1703h.f27846e) {
                try {
                    Long l = (Long) c1703h.f16013w.get(Integer.valueOf(i));
                    if (l == null) {
                        jLongValue = -1;
                    } else {
                        c1703h.f16013w.remove(Integer.valueOf(i));
                        jLongValue = l.longValue();
                    }
                } finally {
                }
            }
            if (jLongValue == -1) {
                AbstractC7806Jm0.m4412f("BasicSessionProcessor");
                this.f15993b.mo8492d();
                this.f15995d.f16010t = false;
                return;
            } else {
                this.f15993b.f12613d = new C0848NT(jLongValue, this.f15994c, Collections.emptyMap());
                this.f15993b.mo8496g();
            }
        }
        this.f15995d.f16010t = false;
    }
}
