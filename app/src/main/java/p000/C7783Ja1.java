package p000;

/* renamed from: Ja1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C7783Ja1 {

    /* renamed from: a */
    public long f5616a;

    /* renamed from: b */
    public long f5617b;

    /* renamed from: c */
    public long f5618c;

    /* renamed from: d */
    public final ThreadLocal f5619d = new ThreadLocal();

    public C7783Ja1(long j) {
        m4356g(j);
    }

    /* renamed from: a */
    public final synchronized long m4350a(long j) {
        if (j == -9223372036854775807L) {
            return -9223372036854775807L;
        }
        try {
            if (!m4355f()) {
                long jLongValue = this.f5616a;
                if (jLongValue == 9223372036854775806L) {
                    Long l = (Long) this.f5619d.get();
                    l.getClass();
                    jLongValue = l.longValue();
                }
                this.f5617b = jLongValue - j;
                notifyAll();
            }
            this.f5618c = j;
            return j + this.f5617b;
        } catch (Throwable th) {
            throw th;
        }
    }

    /* renamed from: b */
    public final synchronized long m4351b(long j) {
        if (j == -9223372036854775807L) {
            return -9223372036854775807L;
        }
        try {
            long j2 = this.f5618c;
            if (j2 != -9223372036854775807L) {
                long j3 = (j2 * 90000) / 1000000;
                long j4 = (4294967296L + j3) / 8589934592L;
                long j5 = ((j4 - 1) * 8589934592L) + j;
                long j6 = (j4 * 8589934592L) + j;
                j = Math.abs(j5 - j3) < Math.abs(j6 - j3) ? j5 : j6;
            }
            return m4350a((j * 1000000) / 90000);
        } catch (Throwable th) {
            throw th;
        }
    }

    /* renamed from: c */
    public final synchronized long m4352c(long j) {
        long j2;
        if (j == -9223372036854775807L) {
            return -9223372036854775807L;
        }
        long j3 = this.f5618c;
        if (j3 != -9223372036854775807L) {
            long j4 = (j3 * 90000) / 1000000;
            long j5 = j4 / 8589934592L;
            Long.signum(j5);
            long j6 = (j5 * 8589934592L) + j;
            j2 = ((j5 + 1) * 8589934592L) + j;
            if (j6 >= j4) {
                j2 = j6;
            }
        } else {
            j2 = j;
        }
        return m4350a((j2 * 1000000) / 90000);
    }

    /* renamed from: d */
    public final synchronized long m4353d() {
        long j;
        j = this.f5616a;
        if (j == Long.MAX_VALUE || j == 9223372036854775806L) {
            j = -9223372036854775807L;
        }
        return j;
    }

    /* renamed from: e */
    public final synchronized long m4354e() {
        return this.f5617b;
    }

    /* renamed from: f */
    public final synchronized boolean m4355f() {
        return this.f5617b != -9223372036854775807L;
    }

    /* renamed from: g */
    public final synchronized void m4356g(long j) {
        this.f5616a = j;
        this.f5617b = j == Long.MAX_VALUE ? 0L : -9223372036854775807L;
        this.f5618c = -9223372036854775807L;
    }

    /* renamed from: h */
    public final synchronized void m4357h(long j, boolean z) {
        try {
            YN1.m9281f(this.f5616a == 9223372036854775806L);
            if (m4355f()) {
                return;
            }
            if (z) {
                this.f5619d.set(Long.valueOf(j));
            } else {
                while (!m4355f()) {
                    wait();
                }
            }
        } catch (Throwable th) {
            throw th;
        }
    }
}
