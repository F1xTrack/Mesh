package defpackage;

import android.os.CancellationSignal;

/* renamed from: Mp, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC1000Mp {
    public static void a(CancellationSignal cancellationSignal) {
        cancellationSignal.cancel();
    }

    public static CancellationSignal b() {
        return new CancellationSignal();
    }
}
