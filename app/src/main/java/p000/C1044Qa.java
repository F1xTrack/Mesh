package p000;

import android.media.AudioTrack;

/* renamed from: Qa */
/* loaded from: classes.dex */
public final class C1044Qa {

    /* renamed from: a */
    public final C0981Pa f9676a;

    /* renamed from: b */
    public int f9677b;

    /* renamed from: c */
    public long f9678c;

    /* renamed from: d */
    public long f9679d;

    /* renamed from: e */
    public long f9680e;

    /* renamed from: f */
    public long f9681f;

    public C1044Qa(AudioTrack audioTrack) {
        this.f9676a = new C0981Pa(audioTrack);
        m6730a();
    }

    /* renamed from: a */
    public final void m6730a() {
        if (this.f9676a != null) {
            m6731b(0);
        }
    }

    /* renamed from: b */
    public final void m6731b(int i) {
        this.f9677b = i;
        if (i == 0) {
            this.f9680e = 0L;
            this.f9681f = -1L;
            this.f9678c = System.nanoTime() / 1000;
            this.f9679d = 10000L;
            return;
        }
        if (i == 1) {
            this.f9679d = 10000L;
            return;
        }
        if (i == 2 || i == 3) {
            this.f9679d = 10000000L;
        } else {
            if (i != 4) {
                throw new IllegalStateException();
            }
            this.f9679d = 500000L;
        }
    }
}
