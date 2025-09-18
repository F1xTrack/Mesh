package androidx.media;

import android.media.AudioAttributes;
import p000.AbstractC7487Di1;

/* loaded from: classes.dex */
public class AudioAttributesImplApi21Parcelizer {
    public static AudioAttributesImplApi21 read(AbstractC7487Di1 abstractC7487Di1) {
        AudioAttributesImplApi21 audioAttributesImplApi21 = new AudioAttributesImplApi21();
        audioAttributesImplApi21.f16328a = (AudioAttributes) abstractC7487Di1.m1851g(audioAttributesImplApi21.f16328a, 1);
        audioAttributesImplApi21.f16329b = abstractC7487Di1.m1850f(audioAttributesImplApi21.f16329b, 2);
        return audioAttributesImplApi21;
    }

    public static void write(AudioAttributesImplApi21 audioAttributesImplApi21, AbstractC7487Di1 abstractC7487Di1) {
        abstractC7487Di1.getClass();
        abstractC7487Di1.m1855k(audioAttributesImplApi21.f16328a, 1);
        abstractC7487Di1.m1854j(audioAttributesImplApi21.f16329b, 2);
    }
}
