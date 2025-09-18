package androidx.media;

import java.lang.reflect.InvocationTargetException;
import p000.AbstractC7487Di1;
import p000.InterfaceC7591Fi1;

/* loaded from: classes.dex */
public class AudioAttributesCompatParcelizer {
    public static AudioAttributesCompat read(AbstractC7487Di1 abstractC7487Di1) {
        AudioAttributesCompat audioAttributesCompat = new AudioAttributesCompat();
        InterfaceC7591Fi1 interfaceC7591Fi1M1852h = audioAttributesCompat.f16327a;
        if (abstractC7487Di1.mo1849e(1)) {
            interfaceC7591Fi1M1852h = abstractC7487Di1.m1852h();
        }
        audioAttributesCompat.f16327a = (AudioAttributesImpl) interfaceC7591Fi1M1852h;
        return audioAttributesCompat;
    }

    public static void write(AudioAttributesCompat audioAttributesCompat, AbstractC7487Di1 abstractC7487Di1) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        abstractC7487Di1.getClass();
        AudioAttributesImpl audioAttributesImpl = audioAttributesCompat.f16327a;
        abstractC7487Di1.mo1853i(1);
        abstractC7487Di1.m1856l(audioAttributesImpl);
    }
}
