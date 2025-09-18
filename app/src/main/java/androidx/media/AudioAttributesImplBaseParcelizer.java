package androidx.media;

import p000.AbstractC7487Di1;

/* loaded from: classes.dex */
public class AudioAttributesImplBaseParcelizer {
    public static AudioAttributesImplBase read(AbstractC7487Di1 abstractC7487Di1) {
        AudioAttributesImplBase audioAttributesImplBase = new AudioAttributesImplBase();
        audioAttributesImplBase.f16330a = abstractC7487Di1.m1850f(audioAttributesImplBase.f16330a, 1);
        audioAttributesImplBase.f16331b = abstractC7487Di1.m1850f(audioAttributesImplBase.f16331b, 2);
        audioAttributesImplBase.f16332c = abstractC7487Di1.m1850f(audioAttributesImplBase.f16332c, 3);
        audioAttributesImplBase.f16333d = abstractC7487Di1.m1850f(audioAttributesImplBase.f16333d, 4);
        return audioAttributesImplBase;
    }

    public static void write(AudioAttributesImplBase audioAttributesImplBase, AbstractC7487Di1 abstractC7487Di1) {
        abstractC7487Di1.getClass();
        abstractC7487Di1.m1854j(audioAttributesImplBase.f16330a, 1);
        abstractC7487Di1.m1854j(audioAttributesImplBase.f16331b, 2);
        abstractC7487Di1.m1854j(audioAttributesImplBase.f16332c, 3);
        abstractC7487Di1.m1854j(audioAttributesImplBase.f16333d, 4);
    }
}
