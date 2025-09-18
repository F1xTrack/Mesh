package p000;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: Oa0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class EnumC8042Oa0 {

    /* renamed from: a */
    public static final EnumC8042Oa0 f8497a;

    /* renamed from: b */
    public static final EnumC8042Oa0 f8498b;

    /* renamed from: c */
    public static final /* synthetic */ EnumC8042Oa0[] f8499c;

    /* JADX INFO: Fake field, exist only in values array */
    EnumC8042Oa0 EF3;

    static {
        EnumC8042Oa0 enumC8042Oa0 = new EnumC8042Oa0("UNSIGNED", 0);
        EnumC8042Oa0 enumC8042Oa02 = new EnumC8042Oa0("SIGNED", 1);
        f8497a = enumC8042Oa02;
        EnumC8042Oa0 enumC8042Oa03 = new EnumC8042Oa0("VERIFIED", 2);
        f8498b = enumC8042Oa03;
        f8499c = new EnumC8042Oa0[]{enumC8042Oa0, enumC8042Oa02, enumC8042Oa03};
    }

    public static EnumC8042Oa0 valueOf(String str) {
        return (EnumC8042Oa0) Enum.valueOf(EnumC8042Oa0.class, str);
    }

    public static EnumC8042Oa0[] values() {
        return (EnumC8042Oa0[]) f8499c.clone();
    }
}
