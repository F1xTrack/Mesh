package p000;

import android.media.AudioAttributes;
import android.media.AudioFormat;
import android.media.AudioManager;

/* renamed from: BE */
/* loaded from: classes.dex */
public abstract class AbstractC0078BE {
    /* renamed from: a */
    public static C6498na m561a(AudioFormat audioFormat, AudioAttributes audioAttributes, boolean z) {
        int playbackOffloadSupport = AudioManager.getPlaybackOffloadSupport(audioFormat, audioAttributes);
        if (playbackOffloadSupport == 0) {
            return C6498na.f38376d;
        }
        C6435ma c6435ma = new C6435ma();
        boolean z2 = AbstractC7485Dh1.f2166a > 32 && playbackOffloadSupport == 2;
        c6435ma.f37776a = true;
        c6435ma.f37777b = z2;
        c6435ma.f37778c = z;
        return c6435ma.m22900a();
    }
}
