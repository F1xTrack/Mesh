package p000;

import android.media.AudioAttributes;
import android.media.AudioTrack;

/* renamed from: HE */
/* loaded from: classes.dex */
public final class C0456HE {

    /* renamed from: a */
    public final C6686qX f4179a;

    /* renamed from: b */
    public final int f4180b;

    /* renamed from: c */
    public final int f4181c;

    /* renamed from: d */
    public final int f4182d;

    /* renamed from: e */
    public final int f4183e;

    /* renamed from: f */
    public final int f4184f;

    /* renamed from: g */
    public final int f4185g;

    /* renamed from: h */
    public final int f4186h;

    /* renamed from: i */
    public final C6626pa f4187i;

    /* renamed from: j */
    public final boolean f4188j;

    /* renamed from: k */
    public final boolean f4189k;

    /* renamed from: l */
    public final boolean f4190l;

    public C0456HE(C6686qX c6686qX, int i, int i2, int i3, int i4, int i5, int i6, int i7, C6626pa c6626pa, boolean z, boolean z2, boolean z3) {
        this.f4179a = c6686qX;
        this.f4180b = i;
        this.f4181c = i2;
        this.f4182d = i3;
        this.f4183e = i4;
        this.f4184f = i5;
        this.f4185g = i6;
        this.f4186h = i7;
        this.f4187i = c6626pa;
        this.f4188j = z;
        this.f4189k = z2;
        this.f4190l = z3;
    }

    /* renamed from: c */
    public static AudioAttributes m3332c(C1017Q9 c1017q9, boolean z) {
        return z ? new AudioAttributes.Builder().setContentType(3).setFlags(16).setUsage(1).build() : (AudioAttributes) c1017q9.m6587a().f3494a;
    }

    /* renamed from: a */
    public final AudioTrack m3333a(C1017Q9 c1017q9, int i) throws C0163Ca {
        int i2 = this.f4181c;
        try {
            AudioTrack audioTrackM3334b = m3334b(c1017q9, i);
            int state = audioTrackM3334b.getState();
            if (state == 1) {
                return audioTrackM3334b;
            }
            try {
                audioTrackM3334b.release();
            } catch (Exception unused) {
            }
            throw new C0163Ca(state, this.f4183e, this.f4184f, this.f4186h, this.f4179a, i2 == 1, null);
        } catch (IllegalArgumentException | UnsupportedOperationException e) {
            throw new C0163Ca(0, this.f4183e, this.f4184f, this.f4186h, this.f4179a, i2 == 1, e);
        }
    }

    /* renamed from: b */
    public final AudioTrack m3334b(C1017Q9 c1017q9, int i) {
        char c;
        int i2 = AbstractC7485Dh1.f2166a;
        char c2 = 0;
        boolean z = this.f4190l;
        int i3 = this.f4183e;
        int i4 = this.f4185g;
        int i5 = this.f4184f;
        if (i2 >= 29) {
            return new AudioTrack.Builder().setAudioAttributes(m3332c(c1017q9, z)).setAudioFormat(AbstractC7485Dh1.m1832q(i3, i5, i4)).setTransferMode(1).setBufferSizeInBytes(this.f4186h).setSessionId(i).setOffloadedPlayback(this.f4181c == 1).build();
        }
        if (i2 >= 21) {
            return new AudioTrack(m3332c(c1017q9, z), AbstractC7485Dh1.m1832q(i3, i5, i4), this.f4186h, 1, i);
        }
        int i6 = c1017q9.f9499b;
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
            return new AudioTrack(c2, this.f4183e, this.f4184f, this.f4185g, this.f4186h, 1);
        }
        return new AudioTrack(c2, this.f4183e, this.f4184f, this.f4185g, this.f4186h, 1, i);
    }
}
