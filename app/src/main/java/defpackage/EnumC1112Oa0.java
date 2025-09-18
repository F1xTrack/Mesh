package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: Oa0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class EnumC1112Oa0 {
    public static final EnumC1112Oa0 a;
    public static final EnumC1112Oa0 b;
    public static final /* synthetic */ EnumC1112Oa0[] c;

    /* JADX INFO: Fake field, exist only in values array */
    EnumC1112Oa0 EF3;

    static {
        EnumC1112Oa0 enumC1112Oa0 = new EnumC1112Oa0("UNSIGNED", 0);
        EnumC1112Oa0 enumC1112Oa02 = new EnumC1112Oa0("SIGNED", 1);
        a = enumC1112Oa02;
        EnumC1112Oa0 enumC1112Oa03 = new EnumC1112Oa0("VERIFIED", 2);
        b = enumC1112Oa03;
        c = new EnumC1112Oa0[]{enumC1112Oa0, enumC1112Oa02, enumC1112Oa03};
    }

    public static EnumC1112Oa0 valueOf(String str) {
        return (EnumC1112Oa0) Enum.valueOf(EnumC1112Oa0.class, str);
    }

    public static EnumC1112Oa0[] values() {
        return (EnumC1112Oa0[]) c.clone();
    }
}
