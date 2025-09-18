package p000;

import android.media.AudioAttributes;
import android.media.AudioFormat;
import android.media.AudioManager;

/* renamed from: AE */
/* loaded from: classes.dex */
public abstract class AbstractC0015AE {
    /* renamed from: a */
    public static C6498na m105a(AudioFormat audioFormat, AudioAttributes audioAttributes, boolean z) {
        if (!AudioManager.isOffloadedPlaybackSupported(audioFormat, audioAttributes)) {
            return C6498na.f38376d;
        }
        C6435ma c6435ma = new C6435ma();
        c6435ma.f37776a = true;
        c6435ma.f37778c = z;
        return c6435ma.m22900a();
    }
}
