package io.appmetrica.analytics.impl;

import android.content.Intent;
import io.appmetrica.analytics.coreapi.internal.backport.BiConsumer;
import io.appmetrica.analytics.coreapi.internal.backport.Consumer;
import java.util.Iterator;

/* renamed from: io.appmetrica.analytics.impl.V2 */
/* loaded from: classes2.dex */
public final class C4866V2 implements BiConsumer {

    /* renamed from: a */
    public final /* synthetic */ C4890W2 f30840a;

    public C4866V2(C4890W2 c4890w2) {
        this.f30840a = c4890w2;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.backport.BiConsumer
    public final void consume(Object obj, Object obj2) {
        Intent intent = (Intent) obj2;
        synchronized (this.f30840a) {
            try {
                C4890W2 c4890w2 = this.f30840a;
                c4890w2.f30893b = intent;
                Iterator it = c4890w2.f30892a.iterator();
                while (it.hasNext()) {
                    ((Consumer) it.next()).consume(intent);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
