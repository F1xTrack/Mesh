package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: Pe0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class EnumC1202Pe0 {
    public static final EnumC1202Pe0 a;
    public static final EnumC1202Pe0 b;
    public static final EnumC1202Pe0 c;
    public static final /* synthetic */ EnumC1202Pe0[] d;

    static {
        EnumC1202Pe0 enumC1202Pe0 = new EnumC1202Pe0("INSTANCE", 0);
        a = enumC1202Pe0;
        EnumC1202Pe0 enumC1202Pe02 = new EnumC1202Pe0("EXTENSION_RECEIVER", 1);
        b = enumC1202Pe02;
        EnumC1202Pe0 enumC1202Pe03 = new EnumC1202Pe0("VALUE", 2);
        c = enumC1202Pe03;
        EnumC1202Pe0[] enumC1202Pe0Arr = {enumC1202Pe0, enumC1202Pe02, enumC1202Pe03};
        d = enumC1202Pe0Arr;
        F02.c(enumC1202Pe0Arr);
    }

    public static EnumC1202Pe0 valueOf(String str) {
        return (EnumC1202Pe0) Enum.valueOf(EnumC1202Pe0.class, str);
    }

    public static EnumC1202Pe0[] values() {
        return (EnumC1202Pe0[]) d.clone();
    }
}
