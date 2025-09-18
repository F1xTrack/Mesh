package io.sentry;

import io.sentry.config.AbstractC6003a;
import java.util.Date;
import java.util.Locale;
import java.util.UUID;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: io.sentry.O1 */
/* loaded from: classes2.dex */
public final class C5792O1 implements InterfaceC6058l0 {

    /* renamed from: a */
    public final Date f33347a;

    /* renamed from: b */
    public Date f33348b;

    /* renamed from: c */
    public final AtomicInteger f33349c;

    /* renamed from: d */
    public final String f33350d;

    /* renamed from: e */
    public final UUID f33351e;

    /* renamed from: f */
    public Boolean f33352f;

    /* renamed from: g */
    public EnumC5789N1 f33353g;

    /* renamed from: h */
    public Long f33354h;

    /* renamed from: i */
    public Double f33355i;

    /* renamed from: j */
    public final String f33356j;

    /* renamed from: k */
    public String f33357k;

    /* renamed from: l */
    public final String f33358l;

    /* renamed from: m */
    public final String f33359m;

    /* renamed from: n */
    public String f33360n;

    /* renamed from: o */
    public final Object f33361o = new Object();

    /* renamed from: p */
    public ConcurrentHashMap f33362p;

    public C5792O1(EnumC5789N1 enumC5789N1, Date date, Date date2, int i, String str, UUID uuid, Boolean bool, Long l, Double d, String str2, String str3, String str4, String str5, String str6) {
        this.f33353g = enumC5789N1;
        this.f33347a = date;
        this.f33348b = date2;
        this.f33349c = new AtomicInteger(i);
        this.f33350d = str;
        this.f33351e = uuid;
        this.f33352f = bool;
        this.f33354h = l;
        this.f33355i = d;
        this.f33356j = str2;
        this.f33357k = str3;
        this.f33358l = str4;
        this.f33359m = str5;
        this.f33360n = str6;
    }

    /* renamed from: a */
    public final C5792O1 clone() {
        return new C5792O1(this.f33353g, this.f33347a, this.f33348b, this.f33349c.get(), this.f33350d, this.f33351e, this.f33352f, this.f33354h, this.f33355i, this.f33356j, this.f33357k, this.f33358l, this.f33359m, this.f33360n);
    }

    /* renamed from: b */
    public final void m21454b(Date date) {
        synchronized (this.f33361o) {
            try {
                this.f33352f = null;
                if (this.f33353g == EnumC5789N1.Ok) {
                    this.f33353g = EnumC5789N1.Exited;
                }
                if (date != null) {
                    this.f33348b = date;
                } else {
                    this.f33348b = AbstractC6003a.m21752k();
                }
                if (this.f33348b != null) {
                    this.f33355i = Double.valueOf(Math.abs(r6.getTime() - this.f33347a.getTime()) / 1000.0d);
                    long time = this.f33348b.getTime();
                    if (time < 0) {
                        time = Math.abs(time);
                    }
                    this.f33354h = Long.valueOf(time);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* renamed from: c */
    public final boolean m21455c(EnumC5789N1 enumC5789N1, String str, boolean z, String str2) {
        boolean z2;
        boolean z3;
        synchronized (this.f33361o) {
            z2 = true;
            if (enumC5789N1 != null) {
                try {
                    this.f33353g = enumC5789N1;
                    z3 = true;
                } catch (Throwable th) {
                    throw th;
                }
            } else {
                z3 = false;
            }
            if (str != null) {
                this.f33357k = str;
                z3 = true;
            }
            if (z) {
                this.f33349c.addAndGet(1);
                z3 = true;
            }
            if (str2 != null) {
                this.f33360n = str2;
            } else {
                z2 = z3;
            }
            if (z2) {
                this.f33352f = null;
                Date dateM21752k = AbstractC6003a.m21752k();
                this.f33348b = dateM21752k;
                if (dateM21752k != null) {
                    long time = dateM21752k.getTime();
                    if (time < 0) {
                        time = Math.abs(time);
                    }
                    this.f33354h = Long.valueOf(time);
                }
            }
        }
        return z2;
    }

    @Override // io.sentry.InterfaceC6058l0
    public final void serialize(InterfaceC5749A0 interfaceC5749A0, ILogger iLogger) {
        interfaceC5749A0.mo13824q();
        UUID uuid = this.f33351e;
        if (uuid != null) {
            interfaceC5749A0.mo13828u("sid").mo13811d(uuid.toString());
        }
        String str = this.f33350d;
        if (str != null) {
            interfaceC5749A0.mo13828u("did").mo13811d(str);
        }
        if (this.f33352f != null) {
            interfaceC5749A0.mo13828u("init").mo13826s(this.f33352f);
        }
        interfaceC5749A0.mo13828u("started").mo13825r(iLogger, this.f33347a);
        interfaceC5749A0.mo13828u("status").mo13825r(iLogger, this.f33353g.name().toLowerCase(Locale.ROOT));
        if (this.f33354h != null) {
            interfaceC5749A0.mo13828u("seq").mo13820m(this.f33354h);
        }
        interfaceC5749A0.mo13828u("errors").mo13809b(this.f33349c.intValue());
        if (this.f33355i != null) {
            interfaceC5749A0.mo13828u("duration").mo13820m(this.f33355i);
        }
        if (this.f33348b != null) {
            interfaceC5749A0.mo13828u("timestamp").mo13825r(iLogger, this.f33348b);
        }
        if (this.f33360n != null) {
            interfaceC5749A0.mo13828u("abnormal_mechanism").mo13825r(iLogger, this.f33360n);
        }
        interfaceC5749A0.mo13828u("attrs");
        interfaceC5749A0.mo13824q();
        interfaceC5749A0.mo13828u("release").mo13825r(iLogger, this.f33359m);
        String str2 = this.f33358l;
        if (str2 != null) {
            interfaceC5749A0.mo13828u("environment").mo13825r(iLogger, str2);
        }
        String str3 = this.f33356j;
        if (str3 != null) {
            interfaceC5749A0.mo13828u("ip_address").mo13825r(iLogger, str3);
        }
        if (this.f33357k != null) {
            interfaceC5749A0.mo13828u("user_agent").mo13825r(iLogger, this.f33357k);
        }
        interfaceC5749A0.mo13817j();
        ConcurrentHashMap concurrentHashMap = this.f33362p;
        if (concurrentHashMap != null) {
            for (String str4 : concurrentHashMap.keySet()) {
                AbstractC6008d.m21773c(this.f33362p, str4, interfaceC5749A0, str4, iLogger);
            }
        }
        interfaceC5749A0.mo13817j();
    }
}
