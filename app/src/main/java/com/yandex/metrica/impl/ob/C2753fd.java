package com.yandex.metrica.impl.ob;

import android.location.Location;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.TimeUnit;

/* renamed from: com.yandex.metrica.impl.ob.fd, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
class C2753fd extends P2<Location> {
    public static final long d = TimeUnit.MINUTES.toMillis(2);
    public static final List<String> e = Arrays.asList("gps", "network");
    private a c;

    /* renamed from: com.yandex.metrica.impl.ob.fd$a */
    public static class a {
        public final long a;

        public a(long j, long j2, long j3) {
            this.a = j;
        }
    }

    public C2753fd(C3007pi c3007pi) {
        this(new a(d, 200L, 50L), c3007pi != null ? c3007pi.c : O.e.d, (c3007pi != null ? c3007pi.c : O.e.d) * 2);
    }

    @Override // com.yandex.metrica.impl.ob.Q0
    public boolean a(Object obj) {
        Location location = (Location) obj;
        return e.contains(location.getProvider()) && (this.a.b() || this.a.d() || a(location, (Location) this.a.a()));
    }

    @Override // com.yandex.metrica.impl.ob.Q0
    public long b(C3007pi c3007pi) {
        return c3007pi.c;
    }

    @Override // com.yandex.metrica.impl.ob.Q0
    public long a(C3007pi c3007pi) {
        return c3007pi.c * 2;
    }

    public C2753fd(a aVar, long j, long j2) {
        super(j, j2);
        this.c = aVar;
    }

    private boolean a(Location location, Location location2) {
        boolean zEquals;
        long j = this.c.a;
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
