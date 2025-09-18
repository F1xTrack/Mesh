package io.sentry;

import io.sentry.protocol.C5157c;
import io.sentry.protocol.C5158d;
import java.util.AbstractMap;
import java.util.HashMap;
import java.util.List;
import java.util.UUID;

/* loaded from: classes2.dex */
public abstract class V0 {
    public io.sentry.protocol.t a;
    public final C5157c b;
    public io.sentry.protocol.r c;
    public io.sentry.protocol.n d;
    public AbstractMap e;
    public String f;
    public String g;
    public String h;
    public io.sentry.protocol.E i;
    public transient io.sentry.exception.a j;
    public String k;
    public String l;
    public List m;
    public C5158d n;
    public AbstractMap o;

    public V0(io.sentry.protocol.t tVar) {
        this.b = new C5157c();
        this.a = tVar;
    }

    public final void a(String str, String str2) {
        if (this.e == null) {
            this.e = new HashMap();
        }
        this.e.put(str, str2);
    }

    public V0() {
        this(new io.sentry.protocol.t((UUID) null));
    }
}
