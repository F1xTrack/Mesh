package defpackage;

import android.media.AudioAttributes;
import android.media.AudioFormat;
import android.media.AudioTrack;

/* loaded from: classes.dex */
public abstract class V9 {
    public static P70 a(Q9 q9) {
        M70 m70T = P70.t();
        AbstractC5740lg1 it = Y9.e.keySet().iterator();
        while (it.hasNext()) {
            Integer num = (Integer) it.next();
            int iIntValue = num.intValue();
            if (AbstractC0277Dh1.a >= AbstractC0277Dh1.p(iIntValue) && AudioTrack.isDirectPlaybackSupported(new AudioFormat.Builder().setChannelMask(12).setEncoding(iIntValue).setSampleRate(48000).build(), (AudioAttributes) q9.a().a)) {
                m70T.a(num);
            }
        }
        m70T.a(2);
        return m70T.h();
    }

    public static int b(int i, int i2, Q9 q9) {
        for (int i3 = 10; i3 > 0; i3--) {
            int iR = AbstractC0277Dh1.r(i3);
            if (iR != 0 && AudioTrack.isDirectPlaybackSupported(new AudioFormat.Builder().setEncoding(i).setSampleRate(i2).setChannelMask(iR).build(), (AudioAttributes) q9.a().a)) {
                return i3;
            }
        }
        return 0;
    }
}
