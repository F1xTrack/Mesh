package p000;

import android.os.SystemClock;

/* renamed from: d61, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C9072d61 {

    /* renamed from: c */
    public static final C9072d61 f25815c = new C9072d61(-9223372036854775807L, false);

    /* renamed from: a */
    public boolean f25816a;

    /* renamed from: b */
    public long f25817b;

    public C9072d61(long j, boolean z) {
        this.f25817b = j;
        this.f25816a = z;
    }

    /* renamed from: a */
    public void m17493a() throws InterruptedException {
        if (!this.f25816a) {
            return;
        }
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        long j = this.f25817b;
        while (true) {
            long j2 = jElapsedRealtime - j;
            if (j2 >= 100) {
                return;
            }
            long j3 = 100 - j2;
            try {
                AbstractC7806Jm0.m4412f("OnEnableDisableSessionDurationCheck");
                Thread.sleep(j3);
                jElapsedRealtime = SystemClock.elapsedRealtime();
                j = this.f25817b;
            } catch (InterruptedException unused) {
                AbstractC7806Jm0.m4412f("OnEnableDisableSessionDurationCheck");
                return;
            }
        }
    }

    /* renamed from: b */
    public void m17494b() {
        if (this.f25816a) {
            this.f25817b = SystemClock.elapsedRealtime();
        }
    }
}
