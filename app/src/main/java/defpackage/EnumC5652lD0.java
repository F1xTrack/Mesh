package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: lD0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class EnumC5652lD0 {
    public static final EnumC5652lD0 a;
    public static final EnumC5652lD0 b;
    public static final /* synthetic */ EnumC5652lD0[] c;

    static {
        EnumC5652lD0 enumC5652lD0 = new EnumC5652lD0("IDLE", 0);
        a = enumC5652lD0;
        EnumC5652lD0 enumC5652lD02 = new EnumC5652lD0("STREAMING", 1);
        b = enumC5652lD02;
        c = new EnumC5652lD0[]{enumC5652lD0, enumC5652lD02};
    }

    public static EnumC5652lD0 valueOf(String str) {
        return (EnumC5652lD0) Enum.valueOf(EnumC5652lD0.class, str);
    }

    public static EnumC5652lD0[] values() {
        return (EnumC5652lD0[]) c.clone();
    }
}
