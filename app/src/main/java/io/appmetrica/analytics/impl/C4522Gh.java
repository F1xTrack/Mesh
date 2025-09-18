package io.appmetrica.analytics.impl;

import android.content.Context;
import io.appmetrica.analytics.coreapi.internal.executors.IHandlerExecutor;
import java.util.HashMap;

/* renamed from: io.appmetrica.analytics.impl.Gh */
/* loaded from: classes2.dex */
public final class C4522Gh {

    /* renamed from: a */
    public final HashMap f30184a = new HashMap();

    /* renamed from: b */
    public final C5334o0 f30185b;

    public C4522Gh(C5334o0 c5334o0) {
        this.f30185b = c5334o0;
    }

    /* renamed from: a */
    public static C4522Gh m19449a() {
        return AbstractC4498Fh.f30147a;
    }

    /* renamed from: a */
    public final C5601yh m19450a(Context context, String str) {
        C5601yh c5601yh = (C5601yh) this.f30184a.get(str);
        if (c5601yh == null) {
            synchronized (this.f30184a) {
                try {
                    c5601yh = (C5601yh) this.f30184a.get(str);
                    if (c5601yh == null) {
                        IHandlerExecutor iHandlerExecutorM20407a = C5388q4.m20928h().f32420c.m20407a();
                        this.f30185b.getClass();
                        if (C5309n0.f32234e == null) {
                            ((C5543w9) iHandlerExecutorM20407a).f32761b.post(new RunnableC4474Eh(this, context));
                        }
                        c5601yh = new C5601yh(context.getApplicationContext(), str, new C5334o0());
                        this.f30184a.put(str, c5601yh);
                        c5601yh.m21221c(str);
                    }
                } finally {
                }
            }
        }
        return c5601yh;
    }
}
