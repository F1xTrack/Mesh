package p000;

import java.util.LinkedHashSet;
import java.util.Objects;

/* loaded from: classes.dex */
public final /* synthetic */ class C71 implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ int f1212a;

    /* renamed from: b */
    public final /* synthetic */ E71 f1213b;

    /* renamed from: c */
    public final /* synthetic */ E71 f1214c;

    public /* synthetic */ C71(E71 e71, E71 e712, int i) {
        this.f1212a = i;
        this.f1213b = e71;
        this.f1214c = e712;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f1212a) {
            case 0:
                E71 e71 = this.f1213b;
                E71 e712 = this.f1214c;
                U41 u41 = e71.f2480b;
                synchronized (u41.f11644a) {
                    ((LinkedHashSet) u41.f11646c).remove(e71);
                    ((LinkedHashSet) u41.f11647d).remove(e71);
                }
                e71.mo516g(e712);
                if (e71.f2485g == null) {
                    AbstractC7806Jm0.m4412f("SyncCaptureSessionBase");
                    return;
                } else {
                    Objects.requireNonNull(e71.f2484f);
                    e71.f2484f.mo512c(e712);
                    return;
                }
            default:
                E71 e713 = this.f1213b;
                Objects.requireNonNull(e713.f2484f);
                e713.f2484f.mo516g(this.f1214c);
                return;
        }
    }
}
