package androidx.media;

import android.media.AudioAttributes;
import p000.AbstractC7487Di1;

/* loaded from: classes.dex */
public class AudioAttributesImplApi26Parcelizer {
    public static AudioAttributesImplApi26 read(AbstractC7487Di1 abstractC7487Di1) {
        AudioAttributesImplApi26 audioAttributesImplApi26 = new AudioAttributesImplApi26();
        audioAttributesImplApi26.f16328a = (AudioAttributes) abstractC7487Di1.m1851g(audioAttributesImplApi26.f16328a, 1);
        audioAttributesImplApi26.f16329b = abstractC7487Di1.m1850f(audioAttributesImplApi26.f16329b, 2);
        return audioAttributesImplApi26;
    }

    public static void write(AudioAttributesImplApi26 audioAttributesImplApi26, AbstractC7487Di1 abstractC7487Di1) {
        abstractC7487Di1.getClass();
        abstractC7487Di1.m1855k(audioAttributesImplApi26.f16328a, 1);
        abstractC7487Di1.m1854j(audioAttributesImplApi26.f16329b, 2);
    }
}
