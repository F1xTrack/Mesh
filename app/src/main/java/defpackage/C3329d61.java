package defpackage;

import android.os.SystemClock;

/* renamed from: d61, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C3329d61 {
    public static final C3329d61 c = new C3329d61(-9223372036854775807L, false);
    public boolean a;
    public long b;

    public C3329d61(long j, boolean z) {
        this.b = j;
        this.a = z;
    }

    public void a() throws InterruptedException {
        if (!this.a) {
            return;
        }
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        long j = this.b;
        while (true) {
            long j2 = jElapsedRealtime - j;
            if (j2 >= 100) {
                return;
            }
            long j3 = 100 - j2;
            try {
                AbstractC0759Jm0.f("OnEnableDisableSessionDurationCheck");
                Thread.sleep(j3);
                jElapsedRealtime = SystemClock.elapsedRealtime();
                j = this.b;
            } catch (InterruptedException unused) {
                AbstractC0759Jm0.f("OnEnableDisableSessionDurationCheck");
                return;
            }
        }
    }

    public void b() {
        if (this.a) {
            this.b = SystemClock.elapsedRealtime();
        }
    }
}
