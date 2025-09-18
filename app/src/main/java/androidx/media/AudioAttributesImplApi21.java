package androidx.media;

import android.media.AudioAttributes;

/* loaded from: classes.dex */
public class AudioAttributesImplApi21 implements AudioAttributesImpl {

    /* renamed from: a */
    public AudioAttributes f16328a;

    /* renamed from: b */
    public int f16329b = -1;

    public final boolean equals(Object obj) {
        if (obj instanceof AudioAttributesImplApi21) {
            return this.f16328a.equals(((AudioAttributesImplApi21) obj).f16328a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f16328a.hashCode();
    }

    public final String toString() {
        return "AudioAttributesCompat: audioattributes=" + this.f16328a;
    }
}
