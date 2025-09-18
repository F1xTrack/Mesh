package p000;

import android.content.Context;
import android.media.AudioAttributes;
import android.media.AudioFocusRequest;
import android.media.AudioManager;
import android.os.Handler;

/* renamed from: la */
/* loaded from: classes.dex */
public final class C6372la {

    /* renamed from: a */
    public final AudioManager f37155a;

    /* renamed from: b */
    public final C6309ka f37156b;

    /* renamed from: c */
    public SurfaceHolderCallbackC1285UQ f37157c;

    /* renamed from: d */
    public C1017Q9 f37158d;

    /* renamed from: e */
    public int f37159e;

    /* renamed from: f */
    public int f37160f;

    /* renamed from: g */
    public float f37161g = 1.0f;

    /* renamed from: h */
    public AudioFocusRequest f37162h;

    public C6372la(Context context, Handler handler, SurfaceHolderCallbackC1285UQ surfaceHolderCallbackC1285UQ) {
        AudioManager audioManager = (AudioManager) context.getApplicationContext().getSystemService("audio");
        audioManager.getClass();
        this.f37155a = audioManager;
        this.f37157c = surfaceHolderCallbackC1285UQ;
        this.f37156b = new C6309ka(this, handler);
        this.f37159e = 0;
    }

    /* renamed from: a */
    public final void m22506a() {
        int i = this.f37159e;
        if (i == 1 || i == 0) {
            return;
        }
        int i2 = AbstractC7485Dh1.f2166a;
        AudioManager audioManager = this.f37155a;
        if (i2 < 26) {
            audioManager.abandonAudioFocus(this.f37156b);
            return;
        }
        AudioFocusRequest audioFocusRequest = this.f37162h;
        if (audioFocusRequest != null) {
            audioManager.abandonAudioFocusRequest(audioFocusRequest);
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:29:0x000e  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0023  */
    /* renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void m22507b(p000.C1017Q9 r6) {
        /*
            r5 = this;
            Q9 r0 = r5.f37158d
            boolean r0 = p000.AbstractC7485Dh1.m1812a(r0, r6)
            if (r0 != 0) goto L39
            r5.f37158d = r6
            r0 = 0
            r1 = 1
            if (r6 != 0) goto L10
        Le:
            r2 = r0
            goto L2d
        L10:
            r2 = 3
            r3 = 2
            int r4 = r6.f9499b
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
            p000.AbstractC0852NX.m5767p(r6, r4)
            goto Le
        L1d:
            r2 = 4
            goto L2d
        L1f:
            int r6 = r6.f9498a
            if (r6 != r1) goto L2d
        L23:
            r2 = r3
            goto L2d
        L25:
            r2 = r1
            goto L2d
        L27:
            java.lang.String r6 = "Specify a proper usage in the audio attributes for audio focus handling. Using AUDIOFOCUS_GAIN by default."
            p000.AbstractC10872rA1.m24175h(r6)
            goto L25
        L2d:
            r5.f37160f = r2
            if (r2 == r1) goto L33
            if (r2 != 0) goto L34
        L33:
            r0 = r1
        L34:
            java.lang.String r6 = "Automatic handling of audio focus is only available for USAGE_MEDIA and USAGE_GAME."
            p000.YN1.m9277b(r6, r0)
        L39:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.C6372la.m22507b(Q9):void");
    }

    /* renamed from: c */
    public final void m22508c(int i) {
        if (this.f37159e == i) {
            return;
        }
        this.f37159e = i;
        float f = i == 4 ? 0.2f : 1.0f;
        if (this.f37161g == f) {
            return;
        }
        this.f37161g = f;
        SurfaceHolderCallbackC1285UQ surfaceHolderCallbackC1285UQ = this.f37157c;
        if (surfaceHolderCallbackC1285UQ != null) {
            C1474XQ c1474xq = surfaceHolderCallbackC1285UQ.f11780a;
            c1474xq.m9023U1(1, 2, Float.valueOf(c1474xq.f13716b0 * c1474xq.f13690B.f37161g));
        }
    }

    /* renamed from: d */
    public final int m22509d(int i, boolean z) {
        int iRequestAudioFocus;
        AudioFocusRequest.Builder builderM18132o;
        int i2 = 0;
        z = false;
        boolean z2 = false;
        if (i == 1 || this.f37160f != 1) {
            m22506a();
            m22508c(0);
            return 1;
        }
        if (!z) {
            int i3 = this.f37159e;
            if (i3 != 1) {
                return i3 != 3 ? 1 : 0;
            }
            return -1;
        }
        if (this.f37159e == 2) {
            return 1;
        }
        int i4 = AbstractC7485Dh1.f2166a;
        AudioManager audioManager = this.f37155a;
        C6309ka c6309ka = this.f37156b;
        if (i4 >= 26) {
            AudioFocusRequest audioFocusRequest = this.f37162h;
            if (audioFocusRequest == null) {
                if (audioFocusRequest == null) {
                    AbstractC4025f.m18137t();
                    builderM18132o = AbstractC4025f.m18128k(this.f37160f);
                } else {
                    AbstractC4025f.m18137t();
                    builderM18132o = AbstractC4025f.m18132o(this.f37162h);
                }
                C1017Q9 c1017q9 = this.f37158d;
                if (c1017q9 != null && c1017q9.f9498a == 1) {
                    z2 = true;
                }
                c1017q9.getClass();
                this.f37162h = builderM18132o.setAudioAttributes((AudioAttributes) c1017q9.m6587a().f3494a).setWillPauseWhenDucked(z2).setOnAudioFocusChangeListener(c6309ka).build();
            }
            iRequestAudioFocus = audioManager.requestAudioFocus(this.f37162h);
        } else {
            C1017Q9 c1017q92 = this.f37158d;
            c1017q92.getClass();
            int i5 = c1017q92.f9499b;
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
            iRequestAudioFocus = audioManager.requestAudioFocus(c6309ka, i2, this.f37160f);
        }
        if (iRequestAudioFocus == 1) {
            m22508c(2);
            return 1;
        }
        m22508c(1);
        return -1;
    }
}
