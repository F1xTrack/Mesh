package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: Vc0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class EnumC1664Vc0 {
    public static final EnumC1664Vc0 a;
    public static final EnumC1664Vc0 b;
    public static final EnumC1664Vc0 c;
    public static final EnumC1664Vc0 d;
    public static final EnumC1664Vc0 e;
    public static final /* synthetic */ EnumC1664Vc0[] f;

    static {
        EnumC1664Vc0 enumC1664Vc0 = new EnumC1664Vc0("HIDDEN", 0);
        a = enumC1664Vc0;
        EnumC1664Vc0 enumC1664Vc02 = new EnumC1664Vc0("VISIBLE", 1);
        b = enumC1664Vc02;
        EnumC1664Vc0 enumC1664Vc03 = new EnumC1664Vc0("DEPRECATED_LIST_METHODS", 2);
        c = enumC1664Vc03;
        EnumC1664Vc0 enumC1664Vc04 = new EnumC1664Vc0("NOT_CONSIDERED", 3);
        d = enumC1664Vc04;
        EnumC1664Vc0 enumC1664Vc05 = new EnumC1664Vc0("DROP", 4);
        e = enumC1664Vc05;
        EnumC1664Vc0[] enumC1664Vc0Arr = {enumC1664Vc0, enumC1664Vc02, enumC1664Vc03, enumC1664Vc04, enumC1664Vc05};
        f = enumC1664Vc0Arr;
        F02.c(enumC1664Vc0Arr);
    }

    public static EnumC1664Vc0 valueOf(String str) {
        return (EnumC1664Vc0) Enum.valueOf(EnumC1664Vc0.class, str);
    }

    public static EnumC1664Vc0[] values() {
        return (EnumC1664Vc0[]) f.clone();
    }
}
