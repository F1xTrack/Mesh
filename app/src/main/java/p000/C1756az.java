package p000;

import android.p001os.OutcomeReceiver;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: az */
/* loaded from: classes.dex */
public final class C1756az extends AtomicBoolean implements OutcomeReceiver {

    /* renamed from: a */
    public final C0619Jp f16695a;

    public C1756az(C0619Jp c0619Jp) {
        super(false);
        this.f16695a = c0619Jp;
    }

    public final void onError(Throwable th) {
        if (compareAndSet(false, true)) {
            this.f16695a.resumeWith(RQ1.m7015b(th));
        }
    }

    public final void onResult(Object obj) {
        if (compareAndSet(false, true)) {
            this.f16695a.resumeWith(obj);
        }
    }

    @Override // java.util.concurrent.atomic.AtomicBoolean
    public final String toString() {
        return "ContinuationOutcomeReceiver(outcomeReceived = " + get() + ')';
    }
}
