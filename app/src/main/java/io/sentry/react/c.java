package io.sentry.react;

import android.content.Context;
import com.facebook.react.bridge.ReadableMap;
import com.my.tracker.obfuscated.c2;
import com.my.tracker.obfuscated.q2;
import com.yandex.metrica.o;
import io.sentry.C5113c;
import io.sentry.D1;
import io.sentry.K0;
import io.sentry.L0;
import io.sentry.M0;
import io.sentry.P;
import io.sentry.protocol.C5157c;
import io.sentry.protocol.E;
import io.sentry.protocol.t;
import java.util.HashMap;
import java.util.Iterator;

/* loaded from: classes2.dex */
public final /* synthetic */ class c implements M0, K0, c2 {
    public final /* synthetic */ Object a;
    public final /* synthetic */ Object b;

    public /* synthetic */ c(Context context, String str) {
        this.b = str;
        this.a = context;
    }

    @Override // com.my.tracker.obfuscated.c2
    public Object a() {
        return q2.a((String) this.b, (Context) this.a);
    }

    @Override // io.sentry.M0
    public void b(L0 l0) {
        ReadableMap readableMap = (ReadableMap) this.a;
        String str = (String) this.b;
        if (readableMap == null) {
            l0.o.remove(str);
            return;
        }
        HashMap<String, Object> hashMap = readableMap.toHashMap();
        C5157c c5157c = l0.o;
        c5157c.put(str, hashMap);
        Iterator<P> it = l0.j.getScopeObservers().iterator();
        while (it.hasNext()) {
            it.next().f(c5157c);
        }
    }

    public /* synthetic */ c(Object obj, Object obj2) {
        this.a = obj;
        this.b = obj2;
    }

    @Override // io.sentry.K0
    public void a(o oVar) {
        C5113c c5113c = (C5113c) oVar.c;
        D1 d1 = (D1) this.a;
        if (c5113c == null) {
            c5113c = new C5113c(d1.getLogger());
            oVar.c = c5113c;
        }
        if (c5113c.b) {
            L0 l0 = (L0) this.b;
            o oVar2 = l0.q;
            E e = l0.b;
            t tVar = l0.r;
            c5113c.d("sentry-trace_id", ((t) oVar2.a).toString());
            c5113c.d("sentry-public_key", d1.retrieveParsedDsn().b);
            c5113c.d("sentry-release", d1.getRelease());
            c5113c.d("sentry-environment", d1.getEnvironment());
            if (!t.b.equals(tVar)) {
                c5113c.d("sentry-replay_id", tVar.toString());
            }
            c5113c.d("sentry-user_segment", e != null ? C5113c.c(e) : null);
            c5113c.d("sentry-transaction", null);
            c5113c.d("sentry-sample_rate", null);
            c5113c.d("sentry-sampled", null);
            c5113c.b = false;
        }
    }
}
