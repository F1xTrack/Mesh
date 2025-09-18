package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: pH0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class EnumC6428pH0 {
    public static final EnumC6428pH0 a;
    public static final EnumC6428pH0 b;
    public static final EnumC6428pH0 c;
    public static final /* synthetic */ EnumC6428pH0[] d;

    static {
        EnumC6428pH0 enumC6428pH0 = new EnumC6428pH0("UNDECIDED", 0);
        a = enumC6428pH0;
        EnumC6428pH0 enumC6428pH02 = new EnumC6428pH0("SHOULD_OVERRIDE", 1);
        b = enumC6428pH02;
        EnumC6428pH0 enumC6428pH03 = new EnumC6428pH0("DO_NOT_OVERRIDE", 2);
        c = enumC6428pH03;
        d = new EnumC6428pH0[]{enumC6428pH0, enumC6428pH02, enumC6428pH03};
    }

    public static EnumC6428pH0 valueOf(String str) {
        return (EnumC6428pH0) Enum.valueOf(EnumC6428pH0.class, str);
    }

    public static EnumC6428pH0[] values() {
        return (EnumC6428pH0[]) d.clone();
    }
}
