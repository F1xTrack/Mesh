package p000;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: lD0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class EnumC10109lD0 {

    /* renamed from: a */
    public static final EnumC10109lD0 f36974a;

    /* renamed from: b */
    public static final EnumC10109lD0 f36975b;

    /* renamed from: c */
    public static final /* synthetic */ EnumC10109lD0[] f36976c;

    static {
        EnumC10109lD0 enumC10109lD0 = new EnumC10109lD0("IDLE", 0);
        f36974a = enumC10109lD0;
        EnumC10109lD0 enumC10109lD02 = new EnumC10109lD0("STREAMING", 1);
        f36975b = enumC10109lD02;
        f36976c = new EnumC10109lD0[]{enumC10109lD0, enumC10109lD02};
    }

    public static EnumC10109lD0 valueOf(String str) {
        return (EnumC10109lD0) Enum.valueOf(EnumC10109lD0.class, str);
    }

    public static EnumC10109lD0[] values() {
        return (EnumC10109lD0[]) f36976c.clone();
    }
}
