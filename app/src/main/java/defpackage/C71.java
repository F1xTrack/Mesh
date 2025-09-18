package defpackage;

import java.util.LinkedHashSet;
import java.util.Objects;

/* loaded from: classes.dex */
public final /* synthetic */ class C71 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ E71 b;
    public final /* synthetic */ E71 c;

    public /* synthetic */ C71(E71 e71, E71 e712, int i) {
        this.a = i;
        this.b = e71;
        this.c = e712;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                E71 e71 = this.b;
                E71 e712 = this.c;
                U41 u41 = e71.b;
                synchronized (u41.a) {
                    ((LinkedHashSet) u41.c).remove(e71);
                    ((LinkedHashSet) u41.d).remove(e71);
                }
                e71.g(e712);
                if (e71.g == null) {
                    AbstractC0759Jm0.f("SyncCaptureSessionBase");
                    return;
                } else {
                    Objects.requireNonNull(e71.f);
                    e71.f.c(e712);
                    return;
                }
            default:
                E71 e713 = this.b;
                Objects.requireNonNull(e713.f);
                e713.f.g(this.c);
                return;
        }
    }
}
