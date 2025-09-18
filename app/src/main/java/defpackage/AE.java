package defpackage;

import android.media.AudioAttributes;
import android.media.AudioFormat;
import android.media.AudioManager;

/* loaded from: classes.dex */
public abstract class AE {
    public static C6102na a(AudioFormat audioFormat, AudioAttributes audioAttributes, boolean z) {
        if (!AudioManager.isOffloadedPlaybackSupported(audioFormat, audioAttributes)) {
            return C6102na.d;
        }
        C5911ma c5911ma = new C5911ma();
        c5911ma.a = true;
        c5911ma.c = z;
        return c5911ma.a();
    }
}
