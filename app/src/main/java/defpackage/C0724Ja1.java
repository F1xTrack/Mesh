package defpackage;

/* renamed from: Ja1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0724Ja1 {
    public long a;
    public long b;
    public long c;
    public final ThreadLocal d = new ThreadLocal();

    public C0724Ja1(long j) {
        g(j);
    }

    public final synchronized long a(long j) {
        if (j == -9223372036854775807L) {
            return -9223372036854775807L;
        }
        try {
            if (!f()) {
                long jLongValue = this.a;
                if (jLongValue == 9223372036854775806L) {
                    Long l = (Long) this.d.get();
                    l.getClass();
                    jLongValue = l.longValue();
                }
                this.b = jLongValue - j;
                notifyAll();
            }
            this.c = j;
            return j + this.b;
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized long b(long j) {
        if (j == -9223372036854775807L) {
            return -9223372036854775807L;
        }
        try {
            long j2 = this.c;
            if (j2 != -9223372036854775807L) {
                long j3 = (j2 * 90000) / 1000000;
                long j4 = (4294967296L + j3) / 8589934592L;
                long j5 = ((j4 - 1) * 8589934592L) + j;
                long j6 = (j4 * 8589934592L) + j;
                j = Math.abs(j5 - j3) < Math.abs(j6 - j3) ? j5 : j6;
            }
            return a((j * 1000000) / 90000);
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized long c(long j) {
        long j2;
        if (j == -9223372036854775807L) {
            return -9223372036854775807L;
        }
        long j3 = this.c;
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
        return a((j2 * 1000000) / 90000);
    }

    public final synchronized long d() {
        long j;
        j = this.a;
        if (j == Long.MAX_VALUE || j == 9223372036854775806L) {
            j = -9223372036854775807L;
        }
        return j;
    }

    public final synchronized long e() {
        return this.b;
    }

    public final synchronized boolean f() {
        return this.b != -9223372036854775807L;
    }

    public final synchronized void g(long j) {
        this.a = j;
        this.b = j == Long.MAX_VALUE ? 0L : -9223372036854775807L;
        this.c = -9223372036854775807L;
    }

    public final synchronized void h(long j, boolean z) {
        try {
            YN1.f(this.a == 9223372036854775806L);
            if (f()) {
                return;
            }
            if (z) {
                this.d.set(Long.valueOf(j));
            } else {
                while (!f()) {
                    wait();
                }
            }
        } catch (Throwable th) {
            throw th;
        }
    }
}
