package defpackage;

import android.media.AudioTrack;

/* renamed from: Qa, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1267Qa {
    public final C1189Pa a;
    public int b;
    public long c;
    public long d;
    public long e;
    public long f;

    public C1267Qa(AudioTrack audioTrack) {
        this.a = new C1189Pa(audioTrack);
        a();
    }

    public final void a() {
        if (this.a != null) {
            b(0);
        }
    }

    public final void b(int i) {
        this.b = i;
        if (i == 0) {
            this.e = 0L;
            this.f = -1L;
            this.c = System.nanoTime() / 1000;
            this.d = 10000L;
            return;
        }
        if (i == 1) {
            this.d = 10000L;
            return;
        }
        if (i == 2 || i == 3) {
            this.d = 10000000L;
        } else {
            if (i != 4) {
                throw new IllegalStateException();
            }
            this.d = 500000L;
        }
    }
}
