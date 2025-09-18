package p000;

import android.media.AudioAttributes;

/* renamed from: ew0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC9303ew0 {
    /* renamed from: a */
    public static AudioAttributes m18077a(AudioAttributes.Builder builder) {
        return builder.build();
    }

    /* renamed from: b */
    public static AudioAttributes.Builder m18078b() {
        return new AudioAttributes.Builder();
    }

    /* renamed from: c */
    public static AudioAttributes.Builder m18079c(AudioAttributes.Builder builder, int i) {
        return builder.setContentType(i);
    }

    /* renamed from: d */
    public static AudioAttributes.Builder m18080d(AudioAttributes.Builder builder, int i) {
        return builder.setLegacyStreamType(i);
    }

    /* renamed from: e */
    public static AudioAttributes.Builder m18081e(AudioAttributes.Builder builder, int i) {
        return builder.setUsage(i);
    }
}
