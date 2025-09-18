package p000;

import android.media.AudioAttributes;
import android.media.AudioFormat;
import android.media.AudioTrack;

/* renamed from: V9 */
/* loaded from: classes.dex */
public abstract class AbstractC1331V9 {
    /* renamed from: a */
    public static P70 m8318a(C1017Q9 c1017q9) {
        M70 m70M6233t = P70.m6233t();
        AbstractC10168lg1 it = C1520Y9.f14175e.keySet().iterator();
        while (it.hasNext()) {
            Integer num = (Integer) it.next();
            int iIntValue = num.intValue();
            if (AbstractC7485Dh1.f2166a >= AbstractC7485Dh1.m1831p(iIntValue) && AudioTrack.isDirectPlaybackSupported(new AudioFormat.Builder().setChannelMask(12).setEncoding(iIntValue).setSampleRate(48000).build(), (AudioAttributes) c1017q9.m6587a().f3494a)) {
                m70M6233t.m3755a(num);
            }
        }
        m70M6233t.m3755a(2);
        return m70M6233t.m5273h();
    }

    /* renamed from: b */
    public static int m8319b(int i, int i2, C1017Q9 c1017q9) {
        for (int i3 = 10; i3 > 0; i3--) {
            int iM1833r = AbstractC7485Dh1.m1833r(i3);
            if (iM1833r != 0 && AudioTrack.isDirectPlaybackSupported(new AudioFormat.Builder().setEncoding(i).setSampleRate(i2).setChannelMask(iM1833r).build(), (AudioAttributes) c1017q9.m6587a().f3494a)) {
                return i3;
            }
        }
        return 0;
    }
}
