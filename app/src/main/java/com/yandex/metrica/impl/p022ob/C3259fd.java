package com.yandex.metrica.impl.p022ob;

import android.location.Location;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.TimeUnit;

/* renamed from: com.yandex.metrica.impl.ob.fd */
/* loaded from: classes2.dex */
class C3259fd extends AbstractC2844P2<Location> {

    /* renamed from: d */
    public static final long f23433d = TimeUnit.MINUTES.toMillis(2);

    /* renamed from: e */
    public static final List<String> f23434e = Arrays.asList("gps", "network");

    /* renamed from: c */
    private a f23435c;

    /* renamed from: com.yandex.metrica.impl.ob.fd$a */
    public static class a {

        /* renamed from: a */
        public final long f23436a;

        public a(long j, long j2, long j3) {
            this.f23436a = j;
        }
    }

    public C3259fd(C3524pi c3524pi) {
        this(new a(f23433d, 200L, 50L), c3524pi != null ? c3524pi.f24512c : C2816O.f21831e.f23982d, (c3524pi != null ? c3524pi.f24512c : C2816O.f21831e.f23982d) * 2);
    }

    @Override // com.yandex.metrica.impl.p022ob.AbstractC2867Q0
    /* renamed from: a */
    public boolean mo14804a(Object obj) {
        Location location = (Location) obj;
        return f23434e.contains(location.getProvider()) && (this.f21964a.m14681b() || this.f21964a.m14683d() || m15930a(location, (Location) this.f21964a.m14678a()));
    }

    @Override // com.yandex.metrica.impl.p022ob.AbstractC2867Q0
    /* renamed from: b */
    public long mo14805b(C3524pi c3524pi) {
        return c3524pi.f24512c;
    }

    @Override // com.yandex.metrica.impl.p022ob.AbstractC2867Q0
    /* renamed from: a */
    public long mo14802a(C3524pi c3524pi) {
        return c3524pi.f24512c * 2;
    }

    public C3259fd(a aVar, long j, long j2) {
        super(j, j2);
        this.f23435c = aVar;
    }

    /* renamed from: a */
    private boolean m15930a(Location location, Location location2) {
        boolean zEquals;
        long j = this.f23435c.f23436a;
        if (location2 == null) {
            return true;
        }
        long time = location.getTime() - location2.getTime();
        boolean z = time > j;
        boolean z2 = time < (-j);
        boolean z3 = time > 0;
        if (z) {
            return true;
        }
        if (!z2) {
            int accuracy = (int) (location.getAccuracy() - location2.getAccuracy());
            boolean z4 = accuracy > 0;
            boolean z5 = accuracy < 0;
            boolean z6 = ((long) accuracy) > 200;
            String provider = location.getProvider();
            String provider2 = location2.getProvider();
            if (provider == null) {
                zEquals = provider2 == null;
            } else {
                zEquals = provider.equals(provider2);
            }
            if (z5) {
                return true;
            }
            if (z3 && !z4) {
                return true;
            }
            if (z3 && !z6 && zEquals) {
                return true;
            }
        }
        return false;
    }
}
