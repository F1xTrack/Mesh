package p000;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: tD0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class EnumC11133tD0 {

    /* renamed from: a */
    public static final EnumC11133tD0 f42953a;

    /* renamed from: b */
    public static final EnumC11133tD0 f42954b;

    /* renamed from: c */
    public static final EnumC11133tD0 f42955c;

    /* renamed from: d */
    public static final /* synthetic */ EnumC11133tD0[] f42956d;

    static {
        EnumC11133tD0 enumC11133tD0 = new EnumC11133tD0("LOW", 0);
        f42953a = enumC11133tD0;
        EnumC11133tD0 enumC11133tD02 = new EnumC11133tD0("MEDIUM", 1);
        f42954b = enumC11133tD02;
        EnumC11133tD0 enumC11133tD03 = new EnumC11133tD0("HIGH", 2);
        f42955c = enumC11133tD03;
        f42956d = new EnumC11133tD0[]{enumC11133tD0, enumC11133tD02, enumC11133tD03};
    }

    public static EnumC11133tD0 valueOf(String str) {
        return (EnumC11133tD0) Enum.valueOf(EnumC11133tD0.class, str);
    }

    public static EnumC11133tD0[] values() {
        return (EnumC11133tD0[]) f42956d.clone();
    }
}
