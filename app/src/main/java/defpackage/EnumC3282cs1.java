package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: cs1, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class EnumC3282cs1 {
    public static final EnumC3282cs1 a;
    public static final EnumC3282cs1 b;
    public static final EnumC3282cs1 c;
    public static final /* synthetic */ EnumC3282cs1[] d;

    static {
        EnumC3282cs1 enumC3282cs1 = new EnumC3282cs1("LIBRARY_V3", 0);
        a = enumC3282cs1;
        EnumC3282cs1 enumC3282cs12 = new EnumC3282cs1("LIBRARY_V4", 1);
        b = enumC3282cs12;
        EnumC3282cs1 enumC3282cs13 = new EnumC3282cs1("NONE", 2);
        c = enumC3282cs13;
        d = new EnumC3282cs1[]{enumC3282cs1, enumC3282cs12, enumC3282cs13};
    }

    public static EnumC3282cs1 valueOf(String str) {
        return (EnumC3282cs1) Enum.valueOf(EnumC3282cs1.class, str);
    }

    public static EnumC3282cs1[] values() {
        return (EnumC3282cs1[]) d.clone();
    }
}
