package p000;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: Ci0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class EnumC7434Ci0 {

    /* renamed from: a */
    public static final EnumC7434Ci0 f1586a;

    /* renamed from: b */
    public static final EnumC7434Ci0 f1587b;

    /* renamed from: c */
    public static final EnumC7434Ci0 f1588c;

    /* renamed from: d */
    public static final EnumC7434Ci0 f1589d;

    /* renamed from: e */
    public static final EnumC7434Ci0 f1590e;

    /* renamed from: f */
    public static final /* synthetic */ EnumC7434Ci0[] f1591f;

    static {
        EnumC7434Ci0 enumC7434Ci0 = new EnumC7434Ci0("DESTROYED", 0);
        f1586a = enumC7434Ci0;
        EnumC7434Ci0 enumC7434Ci02 = new EnumC7434Ci0("INITIALIZED", 1);
        f1587b = enumC7434Ci02;
        EnumC7434Ci0 enumC7434Ci03 = new EnumC7434Ci0("CREATED", 2);
        f1588c = enumC7434Ci03;
        EnumC7434Ci0 enumC7434Ci04 = new EnumC7434Ci0("STARTED", 3);
        f1589d = enumC7434Ci04;
        EnumC7434Ci0 enumC7434Ci05 = new EnumC7434Ci0("RESUMED", 4);
        f1590e = enumC7434Ci05;
        f1591f = new EnumC7434Ci0[]{enumC7434Ci0, enumC7434Ci02, enumC7434Ci03, enumC7434Ci04, enumC7434Ci05};
    }

    public static EnumC7434Ci0 valueOf(String str) {
        return (EnumC7434Ci0) Enum.valueOf(EnumC7434Ci0.class, str);
    }

    public static EnumC7434Ci0[] values() {
        return (EnumC7434Ci0[]) f1591f.clone();
    }
}
