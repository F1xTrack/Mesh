package io.sentry;

import io.sentry.config.AbstractC6003a;
import java.util.Arrays;
import java.util.Date;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: io.sentry.f */
/* loaded from: classes2.dex */
public final class C6017f implements InterfaceC6058l0 {

    /* renamed from: a */
    public final Long f34143a;

    /* renamed from: b */
    public Date f34144b;

    /* renamed from: c */
    public String f34145c;

    /* renamed from: d */
    public String f34146d;

    /* renamed from: e */
    public ConcurrentHashMap f34147e;

    /* renamed from: f */
    public String f34148f;

    /* renamed from: g */
    public String f34149g;

    /* renamed from: h */
    public EnumC6069n1 f34150h;

    /* renamed from: i */
    public ConcurrentHashMap f34151i;

    public C6017f(Date date) {
        this.f34147e = new ConcurrentHashMap();
        this.f34144b = date;
        this.f34143a = null;
    }

    /* renamed from: a */
    public final Date m21777a() {
        Date date = this.f34144b;
        if (date != null) {
            return (Date) date.clone();
        }
        Long l = this.f34143a;
        if (l == null) {
            throw new IllegalStateException("No timestamp set for breadcrumb");
        }
        Date dateM21753l = AbstractC6003a.m21753l(l.longValue());
        this.f34144b = dateM21753l;
        return dateM21753l;
    }

    /* renamed from: b */
    public final void m21778b(Object obj, String str) {
        this.f34147e.put(str, obj);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C6017f.class != obj.getClass()) {
            return false;
        }
        C6017f c6017f = (C6017f) obj;
        return m21777a().getTime() == c6017f.m21777a().getTime() && AbstractC6003a.m21747f(this.f34145c, c6017f.f34145c) && AbstractC6003a.m21747f(this.f34146d, c6017f.f34146d) && AbstractC6003a.m21747f(this.f34148f, c6017f.f34148f) && AbstractC6003a.m21747f(this.f34149g, c6017f.f34149g) && this.f34150h == c6017f.f34150h;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f34144b, this.f34145c, this.f34146d, this.f34148f, this.f34149g, this.f34150h});
    }

    @Override // io.sentry.InterfaceC6058l0
    public final void serialize(InterfaceC5749A0 interfaceC5749A0, ILogger iLogger) {
        interfaceC5749A0.mo13824q();
        interfaceC5749A0.mo13828u("timestamp").mo13825r(iLogger, m21777a());
        if (this.f34145c != null) {
            interfaceC5749A0.mo13828u("message").mo13811d(this.f34145c);
        }
        if (this.f34146d != null) {
            interfaceC5749A0.mo13828u("type").mo13811d(this.f34146d);
        }
        interfaceC5749A0.mo13828u("data").mo13825r(iLogger, this.f34147e);
        if (this.f34148f != null) {
            interfaceC5749A0.mo13828u("category").mo13811d(this.f34148f);
        }
        if (this.f34149g != null) {
            interfaceC5749A0.mo13828u("origin").mo13811d(this.f34149g);
        }
        if (this.f34150h != null) {
            interfaceC5749A0.mo13828u("level").mo13825r(iLogger, this.f34150h);
        }
        ConcurrentHashMap concurrentHashMap = this.f34151i;
        if (concurrentHashMap != null) {
            for (String str : concurrentHashMap.keySet()) {
                AbstractC6008d.m21773c(this.f34151i, str, interfaceC5749A0, str, iLogger);
            }
        }
        interfaceC5749A0.mo13817j();
    }

    public C6017f(long j) {
        this.f34147e = new ConcurrentHashMap();
        this.f34143a = Long.valueOf(j);
        this.f34144b = null;
    }

    public C6017f(C6017f c6017f) {
        this.f34147e = new ConcurrentHashMap();
        this.f34144b = c6017f.f34144b;
        this.f34143a = c6017f.f34143a;
        this.f34145c = c6017f.f34145c;
        this.f34146d = c6017f.f34146d;
        this.f34148f = c6017f.f34148f;
        this.f34149g = c6017f.f34149g;
        ConcurrentHashMap concurrentHashMapM21732A = AbstractC6003a.m21732A(c6017f.f34147e);
        if (concurrentHashMapM21732A != null) {
            this.f34147e = concurrentHashMapM21732A;
        }
        this.f34151i = AbstractC6003a.m21732A(c6017f.f34151i);
        this.f34150h = c6017f.f34150h;
    }

    public C6017f() {
        this(System.currentTimeMillis());
    }
}
