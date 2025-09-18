package defpackage;

import android.os.Bundle;
import java.util.concurrent.Callable;

/* renamed from: lA, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class CallableC5642lA implements Callable {
    public final /* synthetic */ long a;
    public final /* synthetic */ C5833mA b;

    public CallableC5642lA(C5833mA c5833mA, long j) {
        this.b = c5833mA;
        this.a = j;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        Bundle bundle = new Bundle();
        bundle.putInt("fatal", 1);
        bundle.putLong("timestamp", this.a);
        ((U3) this.b.k).w0(bundle);
        return null;
    }
}
