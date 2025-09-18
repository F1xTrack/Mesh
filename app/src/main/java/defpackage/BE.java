package defpackage;

import android.media.AudioAttributes;
import android.media.AudioFormat;
import android.media.AudioManager;

/* loaded from: classes.dex */
public abstract class BE {
    public static C6102na a(AudioFormat audioFormat, AudioAttributes audioAttributes, boolean z) {
        int playbackOffloadSupport = AudioManager.getPlaybackOffloadSupport(audioFormat, audioAttributes);
        if (playbackOffloadSupport == 0) {
            return C6102na.d;
        }
        C5911ma c5911ma = new C5911ma();
        boolean z2 = AbstractC0277Dh1.a > 32 && playbackOffloadSupport == 2;
        c5911ma.a = true;
        c5911ma.b = z2;
        c5911ma.c = z;
        return c5911ma.a();
    }
}
