package io.sentry;

import io.sentry.exception.C6015a;
import io.sentry.protocol.C6082E;
import io.sentry.protocol.C6087c;
import io.sentry.protocol.C6088d;
import io.sentry.protocol.C6098n;
import io.sentry.protocol.C6102r;
import io.sentry.protocol.C6104t;
import java.util.AbstractMap;
import java.util.HashMap;
import java.util.List;
import java.util.UUID;

/* renamed from: io.sentry.V0 */
/* loaded from: classes2.dex */
public abstract class AbstractC5811V0 {

    /* renamed from: a */
    public C6104t f33416a;

    /* renamed from: b */
    public final C6087c f33417b;

    /* renamed from: c */
    public C6102r f33418c;

    /* renamed from: d */
    public C6098n f33419d;

    /* renamed from: e */
    public AbstractMap f33420e;

    /* renamed from: f */
    public String f33421f;

    /* renamed from: g */
    public String f33422g;

    /* renamed from: h */
    public String f33423h;

    /* renamed from: i */
    public C6082E f33424i;

    /* renamed from: j */
    public transient C6015a f33425j;

    /* renamed from: k */
    public String f33426k;

    /* renamed from: l */
    public String f33427l;

    /* renamed from: m */
    public List f33428m;

    /* renamed from: n */
    public C6088d f33429n;

    /* renamed from: o */
    public AbstractMap f33430o;

    public AbstractC5811V0(C6104t c6104t) {
        this.f33417b = new C6087c();
        this.f33416a = c6104t;
    }

    /* renamed from: a */
    public final void m21473a(String str, String str2) {
        if (this.f33420e == null) {
            this.f33420e = new HashMap();
        }
        this.f33420e.put(str, str2);
    }

    public AbstractC5811V0() {
        this(new C6104t((UUID) null));
    }
}
