package defpackage;

import android.media.AudioAttributes;
import android.media.AudioTrack;

/* loaded from: classes.dex */
public final class HE {
    public final C6666qX a;
    public final int b;
    public final int c;
    public final int d;
    public final int e;
    public final int f;
    public final int g;
    public final int h;
    public final C6484pa i;
    public final boolean j;
    public final boolean k;
    public final boolean l;

    public HE(C6666qX c6666qX, int i, int i2, int i3, int i4, int i5, int i6, int i7, C6484pa c6484pa, boolean z, boolean z2, boolean z3) {
        this.a = c6666qX;
        this.b = i;
        this.c = i2;
        this.d = i3;
        this.e = i4;
        this.f = i5;
        this.g = i6;
        this.h = i7;
        this.i = c6484pa;
        this.j = z;
        this.k = z2;
        this.l = z3;
    }

    public static AudioAttributes c(Q9 q9, boolean z) {
        return z ? new AudioAttributes.Builder().setContentType(3).setFlags(16).setUsage(1).build() : (AudioAttributes) q9.a().a;
    }

    public final AudioTrack a(Q9 q9, int i) throws C0176Ca {
        int i2 = this.c;
        try {
            AudioTrack audioTrackB = b(q9, i);
            int state = audioTrackB.getState();
            if (state == 1) {
                return audioTrackB;
            }
            try {
                audioTrackB.release();
            } catch (Exception unused) {
            }
            throw new C0176Ca(state, this.e, this.f, this.h, this.a, i2 == 1, null);
        } catch (IllegalArgumentException | UnsupportedOperationException e) {
            throw new C0176Ca(0, this.e, this.f, this.h, this.a, i2 == 1, e);
        }
    }

    public final AudioTrack b(Q9 q9, int i) {
        char c;
        int i2 = AbstractC0277Dh1.a;
        char c2 = 0;
        boolean z = this.l;
        int i3 = this.e;
        int i4 = this.g;
        int i5 = this.f;
        if (i2 >= 29) {
            return new AudioTrack.Builder().setAudioAttributes(c(q9, z)).setAudioFormat(AbstractC0277Dh1.q(i3, i5, i4)).setTransferMode(1).setBufferSizeInBytes(this.h).setSessionId(i).setOffloadedPlayback(this.c == 1).build();
        }
        if (i2 >= 21) {
            return new AudioTrack(c(q9, z), AbstractC0277Dh1.q(i3, i5, i4), this.h, 1, i);
        }
        int i6 = q9.b;
        if (i6 != 13) {
            switch (i6) {
                case 2:
                    break;
                case 3:
                    c = '\b';
                    break;
                case 4:
                    c = 4;
                    break;
                case 5:
                case 7:
                case 8:
                case 9:
                case 10:
                    c = 5;
                    break;
                case 6:
                    c = 2;
                    break;
                default:
                    c = 3;
                    break;
            }
            c2 = c;
        } else {
            c2 = 1;
        }
        if (i == 0) {
            return new AudioTrack(c2, this.e, this.f, this.g, this.h, 1);
        }
        return new AudioTrack(c2, this.e, this.f, this.g, this.h, 1, i);
    }
}
