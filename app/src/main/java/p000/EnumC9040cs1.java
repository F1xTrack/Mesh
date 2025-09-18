package p000;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: cs1, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class EnumC9040cs1 {

    /* renamed from: a */
    public static final EnumC9040cs1 f25690a;

    /* renamed from: b */
    public static final EnumC9040cs1 f25691b;

    /* renamed from: c */
    public static final EnumC9040cs1 f25692c;

    /* renamed from: d */
    public static final /* synthetic */ EnumC9040cs1[] f25693d;

    static {
        EnumC9040cs1 enumC9040cs1 = new EnumC9040cs1("LIBRARY_V3", 0);
        f25690a = enumC9040cs1;
        EnumC9040cs1 enumC9040cs12 = new EnumC9040cs1("LIBRARY_V4", 1);
        f25691b = enumC9040cs12;
        EnumC9040cs1 enumC9040cs13 = new EnumC9040cs1("NONE", 2);
        f25692c = enumC9040cs13;
        f25693d = new EnumC9040cs1[]{enumC9040cs1, enumC9040cs12, enumC9040cs13};
    }

    public static EnumC9040cs1 valueOf(String str) {
        return (EnumC9040cs1) Enum.valueOf(EnumC9040cs1.class, str);
    }

    public static EnumC9040cs1[] values() {
        return (EnumC9040cs1[]) f25693d.clone();
    }
}
