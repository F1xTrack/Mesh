package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: Ml0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class EnumC0989Ml0 {
    public static final EnumC0989Ml0 a;
    public static final EnumC0989Ml0 b;
    public static final EnumC0989Ml0 c;
    public static final EnumC0989Ml0 d;
    public static final EnumC0989Ml0 e;
    public static final EnumC0989Ml0 f;
    public static final /* synthetic */ EnumC0989Ml0[] g;

    static {
        EnumC0989Ml0 enumC0989Ml0 = new EnumC0989Ml0("SET_ANIMATION", 0);
        a = enumC0989Ml0;
        EnumC0989Ml0 enumC0989Ml02 = new EnumC0989Ml0("SET_PROGRESS", 1);
        b = enumC0989Ml02;
        EnumC0989Ml0 enumC0989Ml03 = new EnumC0989Ml0("SET_REPEAT_MODE", 2);
        c = enumC0989Ml03;
        EnumC0989Ml0 enumC0989Ml04 = new EnumC0989Ml0("SET_REPEAT_COUNT", 3);
        d = enumC0989Ml04;
        EnumC0989Ml0 enumC0989Ml05 = new EnumC0989Ml0("SET_IMAGE_ASSETS", 4);
        e = enumC0989Ml05;
        EnumC0989Ml0 enumC0989Ml06 = new EnumC0989Ml0("PLAY_OPTION", 5);
        f = enumC0989Ml06;
        g = new EnumC0989Ml0[]{enumC0989Ml0, enumC0989Ml02, enumC0989Ml03, enumC0989Ml04, enumC0989Ml05, enumC0989Ml06};
    }

    public static EnumC0989Ml0 valueOf(String str) {
        return (EnumC0989Ml0) Enum.valueOf(EnumC0989Ml0.class, str);
    }

    public static EnumC0989Ml0[] values() {
        return (EnumC0989Ml0[]) g.clone();
    }
}
