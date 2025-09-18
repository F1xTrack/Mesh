package io.sentry.android.core;

import io.sentry.C5782L0;
import io.sentry.C5792O1;
import io.sentry.InterfaceC5785M0;
import java.util.Date;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: io.sentry.android.core.M */
/* loaded from: classes2.dex */
public final /* synthetic */ class C5841M implements InterfaceC5785M0 {

    /* renamed from: a */
    public final /* synthetic */ int f33562a;

    /* renamed from: b */
    public final /* synthetic */ Object f33563b;

    public /* synthetic */ C5841M(int i, Object obj) {
        this.f33562a = i;
        this.f33563b = obj;
    }

    @Override // io.sentry.InterfaceC5785M0
    /* renamed from: b */
    public final void mo3170b(C5782L0 c5782l0) {
        C5792O1 c5792o1;
        switch (this.f33562a) {
            case 0:
                LifecycleWatcher lifecycleWatcher = (LifecycleWatcher) this.f33563b;
                if (lifecycleWatcher.f33552a.get() == 0 && (c5792o1 = c5782l0.f33315k) != null) {
                    Date date = c5792o1.f33347a;
                    if ((date == null ? null : (Date) date.clone()) != null) {
                        AtomicLong atomicLong = lifecycleWatcher.f33552a;
                        Date date2 = c5792o1.f33347a;
                        atomicLong.set((date2 != null ? (Date) date2.clone() : null).getTime());
                        lifecycleWatcher.f33553b.set(true);
                        break;
                    }
                }
                break;
            case 1:
                c5782l0.m21414e((String) this.f33563b);
                break;
            case 2:
                c5782l0.getClass();
                ((AtomicReference) this.f33563b).set(new C5782L0(c5782l0));
                break;
            default:
                AtomicBoolean atomicBoolean = (AtomicBoolean) this.f33563b;
                C5792O1 c5792o12 = c5782l0.f33315k;
                if (c5792o12 != null) {
                    Date date3 = c5792o12.f33347a;
                    if ((date3 == null ? null : (Date) date3.clone()) != null) {
                        atomicBoolean.set(true);
                        break;
                    }
                }
                break;
        }
    }
}
