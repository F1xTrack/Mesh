package io.sentry.react;

import android.content.Context;
import com.facebook.react.bridge.ReadableMap;
import com.p018my.tracker.obfuscated.C2359q2;
import com.p018my.tracker.obfuscated.InterfaceC2302c2;
import com.yandex.metrica.C3796o;
import io.sentry.C5759D1;
import io.sentry.C5782L0;
import io.sentry.C5985c;
import io.sentry.InterfaceC5779K0;
import io.sentry.InterfaceC5785M0;
import io.sentry.InterfaceC5793P;
import io.sentry.protocol.C6082E;
import io.sentry.protocol.C6087c;
import io.sentry.protocol.C6104t;
import java.util.HashMap;
import java.util.Iterator;

/* renamed from: io.sentry.react.c */
/* loaded from: classes2.dex */
public final /* synthetic */ class C6119c implements InterfaceC5785M0, InterfaceC5779K0, InterfaceC2302c2 {

    /* renamed from: a */
    public final /* synthetic */ Object f34517a;

    /* renamed from: b */
    public final /* synthetic */ Object f34518b;

    public /* synthetic */ C6119c(Context context, String str) {
        this.f34518b = str;
        this.f34517a = context;
    }

    @Override // com.p018my.tracker.obfuscated.InterfaceC2302c2
    /* renamed from: a */
    public Object mo9774a() {
        return C2359q2.m13450a((String) this.f34518b, (Context) this.f34517a);
    }

    @Override // io.sentry.InterfaceC5785M0
    /* renamed from: b */
    public void mo3170b(C5782L0 c5782l0) {
        ReadableMap readableMap = (ReadableMap) this.f34517a;
        String str = (String) this.f34518b;
        if (readableMap == null) {
            c5782l0.f33319o.remove(str);
            return;
        }
        HashMap<String, Object> hashMap = readableMap.toHashMap();
        C6087c c6087c = c5782l0.f33319o;
        c6087c.put(str, hashMap);
        Iterator<InterfaceC5793P> it = c5782l0.f33314j.getScopeObservers().iterator();
        while (it.hasNext()) {
            it.next().mo21444f(c6087c);
        }
    }

    public /* synthetic */ C6119c(Object obj, Object obj2) {
        this.f34517a = obj;
        this.f34518b = obj2;
    }

    @Override // io.sentry.InterfaceC5779K0
    /* renamed from: a */
    public void mo3167a(C3796o c3796o) {
        C5985c c5985c = (C5985c) c3796o.f25480c;
        C5759D1 c5759d1 = (C5759D1) this.f34517a;
        if (c5985c == null) {
            c5985c = new C5985c(c5759d1.getLogger());
            c3796o.f25480c = c5985c;
        }
        if (c5985c.f34087b) {
            C5782L0 c5782l0 = (C5782L0) this.f34518b;
            C3796o c3796o2 = c5782l0.f33321q;
            C6082E c6082e = c5782l0.f33306b;
            C6104t c6104t = c5782l0.f33322r;
            c5985c.m21701d("sentry-trace_id", ((C6104t) c3796o2.f25478a).toString());
            c5985c.m21701d("sentry-public_key", c5759d1.retrieveParsedDsn().f34509b);
            c5985c.m21701d("sentry-release", c5759d1.getRelease());
            c5985c.m21701d("sentry-environment", c5759d1.getEnvironment());
            if (!C6104t.f34442b.equals(c6104t)) {
                c5985c.m21701d("sentry-replay_id", c6104t.toString());
            }
            c5985c.m21701d("sentry-user_segment", c6082e != null ? C5985c.m21699c(c6082e) : null);
            c5985c.m21701d("sentry-transaction", null);
            c5985c.m21701d("sentry-sample_rate", null);
            c5985c.m21701d("sentry-sampled", null);
            c5985c.f34087b = false;
        }
    }
}
