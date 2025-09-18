package defpackage;

import android.content.Context;
import android.media.AudioAttributes;
import android.media.AudioFocusRequest;
import android.media.AudioManager;
import android.os.Handler;

/* renamed from: la */
/* loaded from: classes.dex */
public final class C5720la {
    public final AudioManager a;
    public final C5529ka b;
    public UQ c;
    public Q9 d;
    public int e;
    public int f;
    public float g = 1.0f;
    public AudioFocusRequest h;

    public C5720la(Context context, Handler handler, UQ uq) {
        AudioManager audioManager = (AudioManager) context.getApplicationContext().getSystemService("audio");
        audioManager.getClass();
        this.a = audioManager;
        this.c = uq;
        this.b = new C5529ka(this, handler);
        this.e = 0;
    }

    public final void a() {
        int i = this.e;
        if (i == 1 || i == 0) {
            return;
        }
        int i2 = AbstractC0277Dh1.a;
        AudioManager audioManager = this.a;
        if (i2 < 26) {
            audioManager.abandonAudioFocus(this.b);
            return;
        }
        AudioFocusRequest audioFocusRequest = this.h;
        if (audioFocusRequest != null) {
            audioManager.abandonAudioFocusRequest(audioFocusRequest);
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:29:0x000e  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void b(defpackage.Q9 r6) {
        /*
            r5 = this;
            Q9 r0 = r5.d
            boolean r0 = defpackage.AbstractC0277Dh1.a(r0, r6)
            if (r0 != 0) goto L39
            r5.d = r6
            r0 = 0
            r1 = 1
            if (r6 != 0) goto L10
        Le:
            r2 = r0
            goto L2d
        L10:
            r2 = 3
            r3 = 2
            int r4 = r6.b
            switch(r4) {
                case 0: goto L27;
                case 1: goto L25;
                case 2: goto L23;
                case 3: goto Le;
                case 4: goto L23;
                case 5: goto L2d;
                case 6: goto L2d;
                case 7: goto L2d;
                case 8: goto L2d;
                case 9: goto L2d;
                case 10: goto L2d;
                case 11: goto L1f;
                case 12: goto L2d;
                case 13: goto L2d;
                case 14: goto L25;
                case 15: goto L17;
                case 16: goto L1d;
                default: goto L17;
            }
        L17:
            java.lang.String r6 = "Unidentified audio usage: "
            defpackage.NX.p(r6, r4)
            goto Le
        L1d:
            r2 = 4
            goto L2d
        L1f:
            int r6 = r6.a
            if (r6 != r1) goto L2d
        L23:
            r2 = r3
            goto L2d
        L25:
            r2 = r1
            goto L2d
        L27:
            java.lang.String r6 = "Specify a proper usage in the audio attributes for audio focus handling. Using AUDIOFOCUS_GAIN by default."
            defpackage.AbstractC6789rA1.h(r6)
            goto L25
        L2d:
            r5.f = r2
            if (r2 == r1) goto L33
            if (r2 != 0) goto L34
        L33:
            r0 = r1
        L34:
            java.lang.String r6 = "Automatic handling of audio focus is only available for USAGE_MEDIA and USAGE_GAME."
            defpackage.YN1.b(r6, r0)
        L39:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C5720la.b(Q9):void");
    }

    public final void c(int i) {
        if (this.e == i) {
            return;
        }
        this.e = i;
        float f = i == 4 ? 0.2f : 1.0f;
        if (this.g == f) {
            return;
        }
        this.g = f;
        UQ uq = this.c;
        if (uq != null) {
            XQ xq = uq.a;
            xq.U1(1, 2, Float.valueOf(xq.b0 * xq.B.g));
        }
    }

    public final int d(int i, boolean z) {
        int iRequestAudioFocus;
        AudioFocusRequest.Builder builderO;
        int i2 = 0;
        z = false;
        boolean z2 = false;
        if (i == 1 || this.f != 1) {
            a();
            c(0);
            return 1;
        }
        if (!z) {
            int i3 = this.e;
            if (i3 != 1) {
                return i3 != 3 ? 1 : 0;
            }
            return -1;
        }
        if (this.e == 2) {
            return 1;
        }
        int i4 = AbstractC0277Dh1.a;
        AudioManager audioManager = this.a;
        C5529ka c5529ka = this.b;
        if (i4 >= 26) {
            AudioFocusRequest audioFocusRequest = this.h;
            if (audioFocusRequest == null) {
                if (audioFocusRequest == null) {
                    AbstractC3685f.t();
                    builderO = AbstractC3685f.k(this.f);
                } else {
                    AbstractC3685f.t();
                    builderO = AbstractC3685f.o(this.h);
                }
                Q9 q9 = this.d;
                if (q9 != null && q9.a == 1) {
                    z2 = true;
                }
                q9.getClass();
                this.h = builderO.setAudioAttributes((AudioAttributes) q9.a().a).setWillPauseWhenDucked(z2).setOnAudioFocusChangeListener(c5529ka).build();
            }
            iRequestAudioFocus = audioManager.requestAudioFocus(this.h);
        } else {
            Q9 q92 = this.d;
            q92.getClass();
            int i5 = q92.b;
            if (i5 != 13) {
                switch (i5) {
                    case 2:
                        break;
                    case 3:
                        i2 = 8;
                        break;
                    case 4:
                        i2 = 4;
                        break;
                    case 5:
                    case 7:
                    case 8:
                    case 9:
                    case 10:
                        i2 = 5;
                        break;
                    case 6:
                        i2 = 2;
                        break;
                    default:
                        i2 = 3;
                        break;
                }
            } else {
                i2 = 1;
            }
            iRequestAudioFocus = audioManager.requestAudioFocus(c5529ka, i2, this.f);
        }
        if (iRequestAudioFocus == 1) {
            c(2);
            return 1;
        }
        c(1);
        return -1;
    }
}
