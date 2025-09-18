package io.sentry.rrweb;

import com.swmansion.reanimated.layoutReanimation.Snapshot;
import io.sentry.AbstractC6008d;
import io.sentry.ILogger;
import io.sentry.InterfaceC5749A0;
import io.sentry.InterfaceC6058l0;
import io.sentry.config.AbstractC6003a;
import java.util.Arrays;
import java.util.HashMap;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: io.sentry.rrweb.m */
/* loaded from: classes2.dex */
public final class C6142m extends AbstractC6131b implements InterfaceC6058l0 {

    /* renamed from: c */
    public String f34595c;

    /* renamed from: d */
    public int f34596d;

    /* renamed from: e */
    public long f34597e;

    /* renamed from: f */
    public long f34598f;

    /* renamed from: g */
    public String f34599g;

    /* renamed from: h */
    public String f34600h;

    /* renamed from: i */
    public int f34601i;

    /* renamed from: j */
    public int f34602j;

    /* renamed from: k */
    public int f34603k;

    /* renamed from: l */
    public String f34604l;

    /* renamed from: m */
    public int f34605m;

    /* renamed from: n */
    public int f34606n;

    /* renamed from: o */
    public int f34607o;

    /* renamed from: p */
    public HashMap f34608p;

    /* renamed from: q */
    public ConcurrentHashMap f34609q;

    /* renamed from: r */
    public ConcurrentHashMap f34610r;

    public C6142m() {
        super(EnumC6132c.Custom);
        this.f34599g = "h264";
        this.f34600h = "mp4";
        this.f34604l = "constant";
        this.f34595c = "video";
    }

    @Override // io.sentry.rrweb.AbstractC6131b
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C6142m.class != obj.getClass() || !super.equals(obj)) {
            return false;
        }
        C6142m c6142m = (C6142m) obj;
        return this.f34596d == c6142m.f34596d && this.f34597e == c6142m.f34597e && this.f34598f == c6142m.f34598f && this.f34601i == c6142m.f34601i && this.f34602j == c6142m.f34602j && this.f34603k == c6142m.f34603k && this.f34605m == c6142m.f34605m && this.f34606n == c6142m.f34606n && this.f34607o == c6142m.f34607o && AbstractC6003a.m21747f(this.f34595c, c6142m.f34595c) && AbstractC6003a.m21747f(this.f34599g, c6142m.f34599g) && AbstractC6003a.m21747f(this.f34600h, c6142m.f34600h) && AbstractC6003a.m21747f(this.f34604l, c6142m.f34604l);
    }

    @Override // io.sentry.rrweb.AbstractC6131b
    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(super.hashCode()), this.f34595c, Integer.valueOf(this.f34596d), Long.valueOf(this.f34597e), Long.valueOf(this.f34598f), this.f34599g, this.f34600h, Integer.valueOf(this.f34601i), Integer.valueOf(this.f34602j), Integer.valueOf(this.f34603k), this.f34604l, Integer.valueOf(this.f34605m), Integer.valueOf(this.f34606n), Integer.valueOf(this.f34607o)});
    }

    @Override // io.sentry.InterfaceC6058l0
    public final void serialize(InterfaceC5749A0 interfaceC5749A0, ILogger iLogger) {
        interfaceC5749A0.mo13824q();
        interfaceC5749A0.mo13828u("type").mo13825r(iLogger, this.f34560a);
        interfaceC5749A0.mo13828u("timestamp").mo13809b(this.f34561b);
        interfaceC5749A0.mo13828u("data");
        interfaceC5749A0.mo13824q();
        interfaceC5749A0.mo13828u("tag").mo13811d(this.f34595c);
        interfaceC5749A0.mo13828u("payload");
        interfaceC5749A0.mo13824q();
        interfaceC5749A0.mo13828u("segmentId").mo13809b(this.f34596d);
        interfaceC5749A0.mo13828u("size").mo13809b(this.f34597e);
        interfaceC5749A0.mo13828u("duration").mo13809b(this.f34598f);
        interfaceC5749A0.mo13828u("encoding").mo13811d(this.f34599g);
        interfaceC5749A0.mo13828u("container").mo13811d(this.f34600h);
        interfaceC5749A0.mo13828u(Snapshot.HEIGHT).mo13809b(this.f34601i);
        interfaceC5749A0.mo13828u(Snapshot.WIDTH).mo13809b(this.f34602j);
        interfaceC5749A0.mo13828u("frameCount").mo13809b(this.f34603k);
        interfaceC5749A0.mo13828u("frameRate").mo13809b(this.f34605m);
        interfaceC5749A0.mo13828u("frameRateType").mo13811d(this.f34604l);
        interfaceC5749A0.mo13828u("left").mo13809b(this.f34606n);
        interfaceC5749A0.mo13828u("top").mo13809b(this.f34607o);
        ConcurrentHashMap concurrentHashMap = this.f34609q;
        if (concurrentHashMap != null) {
            for (String str : concurrentHashMap.keySet()) {
                AbstractC6008d.m21773c(this.f34609q, str, interfaceC5749A0, str, iLogger);
            }
        }
        interfaceC5749A0.mo13817j();
        ConcurrentHashMap concurrentHashMap2 = this.f34610r;
        if (concurrentHashMap2 != null) {
            for (String str2 : concurrentHashMap2.keySet()) {
                AbstractC6008d.m21773c(this.f34610r, str2, interfaceC5749A0, str2, iLogger);
            }
        }
        interfaceC5749A0.mo13817j();
        HashMap map = this.f34608p;
        if (map != null) {
            for (String str3 : map.keySet()) {
                Object obj = this.f34608p.get(str3);
                interfaceC5749A0.mo13828u(str3);
                interfaceC5749A0.mo13825r(iLogger, obj);
            }
        }
        interfaceC5749A0.mo13817j();
    }
}
