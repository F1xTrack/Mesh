package defpackage;

import android.os.OutcomeReceiver;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: az, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2235az extends AtomicBoolean implements OutcomeReceiver {
    public final C0767Jp a;

    public C2235az(C0767Jp c0767Jp) {
        super(false);
        this.a = c0767Jp;
    }

    public final void onError(Throwable th) {
        if (compareAndSet(false, true)) {
            this.a.resumeWith(RQ1.b(th));
        }
    }

    public final void onResult(Object obj) {
        if (compareAndSet(false, true)) {
            this.a.resumeWith(obj);
        }
    }

    @Override // java.util.concurrent.atomic.AtomicBoolean
    public final String toString() {
        return "ContinuationOutcomeReceiver(outcomeReceived = " + get() + ')';
    }
}
