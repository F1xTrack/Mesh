package io.sentry;

import java.util.Date;
import java.util.Locale;
import java.util.UUID;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes2.dex */
public final class O1 implements InterfaceC5141l0 {
    public final Date a;
    public Date b;
    public final AtomicInteger c;
    public final String d;
    public final UUID e;
    public Boolean f;
    public N1 g;
    public Long h;
    public Double i;
    public final String j;
    public String k;
    public final String l;
    public final String m;
    public String n;
    public final Object o = new Object();
    public ConcurrentHashMap p;

    public O1(N1 n1, Date date, Date date2, int i, String str, UUID uuid, Boolean bool, Long l, Double d, String str2, String str3, String str4, String str5, String str6) {
        this.g = n1;
        this.a = date;
        this.b = date2;
        this.c = new AtomicInteger(i);
        this.d = str;
        this.e = uuid;
        this.f = bool;
        this.h = l;
        this.i = d;
        this.j = str2;
        this.k = str3;
        this.l = str4;
        this.m = str5;
        this.n = str6;
    }

    /* renamed from: a */
    public final O1 clone() {
        return new O1(this.g, this.a, this.b, this.c.get(), this.d, this.e, this.f, this.h, this.i, this.j, this.k, this.l, this.m, this.n);
    }

    public final void b(Date date) {
        synchronized (this.o) {
            try {
                this.f = null;
                if (this.g == N1.Ok) {
                    this.g = N1.Exited;
                }
                if (date != null) {
                    this.b = date;
                } else {
                    this.b = io.sentry.config.a.k();
                }
                if (this.b != null) {
                    this.i = Double.valueOf(Math.abs(r6.getTime() - this.a.getTime()) / 1000.0d);
                    long time = this.b.getTime();
                    if (time < 0) {
                        time = Math.abs(time);
                    }
                    this.h = Long.valueOf(time);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final boolean c(N1 n1, String str, boolean z, String str2) {
        boolean z2;
        boolean z3;
        synchronized (this.o) {
            z2 = true;
            if (n1 != null) {
                try {
                    this.g = n1;
                    z3 = true;
                } catch (Throwable th) {
                    throw th;
                }
            } else {
                z3 = false;
            }
            if (str != null) {
                this.k = str;
                z3 = true;
            }
            if (z) {
                this.c.addAndGet(1);
                z3 = true;
            }
            if (str2 != null) {
                this.n = str2;
            } else {
                z2 = z3;
            }
            if (z2) {
                this.f = null;
                Date dateK = io.sentry.config.a.k();
                this.b = dateK;
                if (dateK != null) {
                    long time = dateK.getTime();
                    if (time < 0) {
                        time = Math.abs(time);
                    }
                    this.h = Long.valueOf(time);
                }
            }
        }
        return z2;
    }

    @Override // io.sentry.InterfaceC5141l0
    public final void serialize(A0 a0, ILogger iLogger) {
        a0.q();
        UUID uuid = this.e;
        if (uuid != null) {
            a0.u("sid").d(uuid.toString());
        }
        String str = this.d;
        if (str != null) {
            a0.u("did").d(str);
        }
        if (this.f != null) {
            a0.u("init").s(this.f);
        }
        a0.u("started").r(iLogger, this.a);
        a0.u("status").r(iLogger, this.g.name().toLowerCase(Locale.ROOT));
        if (this.h != null) {
            a0.u("seq").m(this.h);
        }
        a0.u("errors").b(this.c.intValue());
        if (this.i != null) {
            a0.u("duration").m(this.i);
        }
        if (this.b != null) {
            a0.u("timestamp").r(iLogger, this.b);
        }
        if (this.n != null) {
            a0.u("abnormal_mechanism").r(iLogger, this.n);
        }
        a0.u("attrs");
        a0.q();
        a0.u("release").r(iLogger, this.m);
        String str2 = this.l;
        if (str2 != null) {
            a0.u("environment").r(iLogger, str2);
        }
        String str3 = this.j;
        if (str3 != null) {
            a0.u("ip_address").r(iLogger, str3);
        }
        if (this.k != null) {
            a0.u("user_agent").r(iLogger, this.k);
        }
        a0.j();
        ConcurrentHashMap concurrentHashMap = this.p;
        if (concurrentHashMap != null) {
            for (String str4 : concurrentHashMap.keySet()) {
                AbstractC5116d.c(this.p, str4, a0, str4, iLogger);
            }
        }
        a0.j();
    }
}
