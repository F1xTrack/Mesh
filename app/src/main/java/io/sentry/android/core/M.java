package io.sentry.android.core;

import io.sentry.L0;
import io.sentry.M0;
import io.sentry.O1;
import java.util.Date;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes2.dex */
public final /* synthetic */ class M implements M0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ M(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    @Override // io.sentry.M0
    public final void b(L0 l0) {
        O1 o1;
        switch (this.a) {
            case 0:
                LifecycleWatcher lifecycleWatcher = (LifecycleWatcher) this.b;
                if (lifecycleWatcher.a.get() == 0 && (o1 = l0.k) != null) {
                    Date date = o1.a;
                    if ((date == null ? null : (Date) date.clone()) != null) {
                        AtomicLong atomicLong = lifecycleWatcher.a;
                        Date date2 = o1.a;
                        atomicLong.set((date2 != null ? (Date) date2.clone() : null).getTime());
                        lifecycleWatcher.b.set(true);
                        break;
                    }
                }
                break;
            case 1:
                l0.e((String) this.b);
                break;
            case 2:
                l0.getClass();
                ((AtomicReference) this.b).set(new L0(l0));
                break;
            default:
                AtomicBoolean atomicBoolean = (AtomicBoolean) this.b;
                O1 o12 = l0.k;
                if (o12 != null) {
                    Date date3 = o12.a;
                    if ((date3 == null ? null : (Date) date3.clone()) != null) {
                        atomicBoolean.set(true);
                        break;
                    }
                }
                break;
        }
    }
}
