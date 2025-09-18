package p000;

import android.os.Bundle;
import java.util.concurrent.Callable;

/* renamed from: lA */
/* loaded from: classes.dex */
public final class CallableC6346lA implements Callable {

    /* renamed from: a */
    public final /* synthetic */ long f36928a;

    /* renamed from: b */
    public final /* synthetic */ C6409mA f36929b;

    public CallableC6346lA(C6409mA c6409mA, long j) {
        this.f36929b = c6409mA;
        this.f36928a = j;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        Bundle bundle = new Bundle();
        bundle.putInt("fatal", 1);
        bundle.putLong("timestamp", this.f36928a);
        ((C1262U3) this.f36929b.f37537k).mo1476w0(bundle);
        return null;
    }
}
