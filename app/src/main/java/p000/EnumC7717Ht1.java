package p000;


/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: Ht1, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class EnumC7717Ht1 {

    /* renamed from: a */
    public static final EnumC7717Ht1 f4566a;

    /* renamed from: b */
    public static final EnumC7717Ht1 f4567b;

    /* renamed from: c */
    public static final EnumC7717Ht1 f4568c;

    /* renamed from: d */
    public static final /* synthetic */ EnumC7717Ht1[] f4569d;

    static {
        EnumC7717Ht1 enumC7717Ht1 = new EnumC7717Ht1("INAPP", 0);
        f4566a = enumC7717Ht1;
        EnumC7717Ht1 enumC7717Ht12 = new EnumC7717Ht1("SUBS", 1);
        f4567b = enumC7717Ht12;
        EnumC7717Ht1 enumC7717Ht13 = new EnumC7717Ht1(GrsBaseInfo.CountryCodeSource.UNKNOWN, 2);
        f4568c = enumC7717Ht13;
        f4569d = new EnumC7717Ht1[]{enumC7717Ht1, enumC7717Ht12, enumC7717Ht13};
    }

    public static EnumC7717Ht1 valueOf(String str) {
        return (EnumC7717Ht1) Enum.valueOf(EnumC7717Ht1.class, str);
    }

    public static EnumC7717Ht1[] values() {
        return (EnumC7717Ht1[]) f4569d.clone();
    }
}
