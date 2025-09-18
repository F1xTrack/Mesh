package p000;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: uj */
/* loaded from: classes.dex */
public final class EnumC6967uj {

    /* renamed from: a */
    public static final EnumC6967uj f43809a;

    /* renamed from: b */
    public static final EnumC6967uj f43810b;

    /* renamed from: c */
    public static final /* synthetic */ EnumC6967uj[] f43811c;

    static {
        EnumC6967uj enumC6967uj = new EnumC6967uj("ACTIVE", 0);
        f43809a = enumC6967uj;
        EnumC6967uj enumC6967uj2 = new EnumC6967uj("INACTIVE", 1);
        f43810b = enumC6967uj2;
        f43811c = new EnumC6967uj[]{enumC6967uj, enumC6967uj2};
    }

    public static EnumC6967uj valueOf(String str) {
        return (EnumC6967uj) Enum.valueOf(EnumC6967uj.class, str);
    }

    public static EnumC6967uj[] values() {
        return (EnumC6967uj[]) f43811c.clone();
    }
}
