package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: vi, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class EnumC7653vi {
    public static final EnumC7653vi a;
    public static final EnumC7653vi b;
    public static final EnumC7653vi c;
    public static final EnumC7653vi d;
    public static final EnumC7653vi e;
    public static final EnumC7653vi f;
    public static final /* synthetic */ EnumC7653vi[] g;

    /* JADX INFO: Fake field, exist only in values array */
    EnumC7653vi EF6;

    static {
        EnumC7653vi enumC7653vi = new EnumC7653vi("CLEAR", 0);
        EnumC7653vi enumC7653vi2 = new EnumC7653vi("SRC", 1);
        EnumC7653vi enumC7653vi3 = new EnumC7653vi("DST", 2);
        EnumC7653vi enumC7653vi4 = new EnumC7653vi("SRC_OVER", 3);
        EnumC7653vi enumC7653vi5 = new EnumC7653vi("DST_OVER", 4);
        EnumC7653vi enumC7653vi6 = new EnumC7653vi("SRC_IN", 5);
        EnumC7653vi enumC7653vi7 = new EnumC7653vi("DST_IN", 6);
        EnumC7653vi enumC7653vi8 = new EnumC7653vi("SRC_OUT", 7);
        EnumC7653vi enumC7653vi9 = new EnumC7653vi("DST_OUT", 8);
        EnumC7653vi enumC7653vi10 = new EnumC7653vi("SRC_ATOP", 9);
        EnumC7653vi enumC7653vi11 = new EnumC7653vi("DST_ATOP", 10);
        EnumC7653vi enumC7653vi12 = new EnumC7653vi("XOR", 11);
        EnumC7653vi enumC7653vi13 = new EnumC7653vi("PLUS", 12);
        a = enumC7653vi13;
        EnumC7653vi enumC7653vi14 = new EnumC7653vi("MODULATE", 13);
        b = enumC7653vi14;
        EnumC7653vi enumC7653vi15 = new EnumC7653vi("SCREEN", 14);
        c = enumC7653vi15;
        EnumC7653vi enumC7653vi16 = new EnumC7653vi("OVERLAY", 15);
        d = enumC7653vi16;
        EnumC7653vi enumC7653vi17 = new EnumC7653vi("DARKEN", 16);
        e = enumC7653vi17;
        EnumC7653vi enumC7653vi18 = new EnumC7653vi("LIGHTEN", 17);
        f = enumC7653vi18;
        g = new EnumC7653vi[]{enumC7653vi, enumC7653vi2, enumC7653vi3, enumC7653vi4, enumC7653vi5, enumC7653vi6, enumC7653vi7, enumC7653vi8, enumC7653vi9, enumC7653vi10, enumC7653vi11, enumC7653vi12, enumC7653vi13, enumC7653vi14, enumC7653vi15, enumC7653vi16, enumC7653vi17, enumC7653vi18, new EnumC7653vi("COLOR_DODGE", 18), new EnumC7653vi("COLOR_BURN", 19), new EnumC7653vi("HARD_LIGHT", 20), new EnumC7653vi("SOFT_LIGHT", 21), new EnumC7653vi("DIFFERENCE", 22), new EnumC7653vi("EXCLUSION", 23), new EnumC7653vi("MULTIPLY", 24), new EnumC7653vi("HUE", 25), new EnumC7653vi("SATURATION", 26), new EnumC7653vi("COLOR", 27), new EnumC7653vi("LUMINOSITY", 28)};
    }

    public static EnumC7653vi valueOf(String str) {
        return (EnumC7653vi) Enum.valueOf(EnumC7653vi.class, str);
    }

    public static EnumC7653vi[] values() {
        return (EnumC7653vi[]) g.clone();
    }
}
