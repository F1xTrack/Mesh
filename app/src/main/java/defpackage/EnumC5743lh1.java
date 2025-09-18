package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: lh1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class EnumC5743lh1 {
    public static final EnumC5743lh1 a;
    public static final EnumC5743lh1 b;
    public static final EnumC5743lh1 c;
    public static final EnumC5743lh1 d;
    public static final EnumC5743lh1 e;
    public static final EnumC5743lh1 f;
    public static final /* synthetic */ EnumC5743lh1[] g;

    static {
        EnumC5743lh1 enumC5743lh1 = new EnumC5743lh1("IMAGE_CAPTURE", 0);
        a = enumC5743lh1;
        EnumC5743lh1 enumC5743lh12 = new EnumC5743lh1("PREVIEW", 1);
        b = enumC5743lh12;
        EnumC5743lh1 enumC5743lh13 = new EnumC5743lh1("IMAGE_ANALYSIS", 2);
        c = enumC5743lh13;
        EnumC5743lh1 enumC5743lh14 = new EnumC5743lh1("VIDEO_CAPTURE", 3);
        d = enumC5743lh14;
        EnumC5743lh1 enumC5743lh15 = new EnumC5743lh1("STREAM_SHARING", 4);
        e = enumC5743lh15;
        EnumC5743lh1 enumC5743lh16 = new EnumC5743lh1("METERING_REPEATING", 5);
        f = enumC5743lh16;
        g = new EnumC5743lh1[]{enumC5743lh1, enumC5743lh12, enumC5743lh13, enumC5743lh14, enumC5743lh15, enumC5743lh16};
    }

    public static EnumC5743lh1 valueOf(String str) {
        return (EnumC5743lh1) Enum.valueOf(EnumC5743lh1.class, str);
    }

    public static EnumC5743lh1[] values() {
        return (EnumC5743lh1[]) g.clone();
    }
}
