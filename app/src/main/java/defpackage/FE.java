package defpackage;

import android.media.AudioTrack;

/* loaded from: classes.dex */
public abstract class FE {
    public static void a(AudioTrack audioTrack, C3607ea c3607ea) {
        audioTrack.setPreferredDevice(c3607ea == null ? null : c3607ea.a);
    }
}
