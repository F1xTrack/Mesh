package io.appmetrica.analytics.impl;

import android.content.Context;
import java.util.Iterator;

/* renamed from: io.appmetrica.analytics.impl.m0 */
/* loaded from: classes2.dex */
public final class RunnableC5284m0 implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ C5309n0 f32163a;

    public RunnableC5284m0(C5309n0 c5309n0) {
        this.f32163a = c5309n0;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Context context = this.f32163a.f32236a;
        C5128fj c5128fj = AbstractC4499Fi.f30148a;
        synchronized (c5128fj) {
            try {
                c5128fj.f31693b = AbstractC4498Fh.f30147a.m19450a(context, "20799a27-fa80-4b36-b2db-0f8141f24180");
                Iterator it = c5128fj.f31692a.iterator();
                while (it.hasNext()) {
                    ((InterfaceC4683Na) it.next()).mo19451a(c5128fj.f31693b);
                }
                c5128fj.f31692a.clear();
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
