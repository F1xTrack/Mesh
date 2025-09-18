package p000;

import android.os.CancellationSignal;

/* renamed from: Mp */
/* loaded from: classes.dex */
public abstract class AbstractC0807Mp {
    /* renamed from: a */
    public static void m5458a(CancellationSignal cancellationSignal) {
        cancellationSignal.cancel();
    }

    /* renamed from: b */
    public static CancellationSignal m5459b() {
        return new CancellationSignal();
    }
}
