package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: Ci0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class EnumC0201Ci0 {
    public static final EnumC0201Ci0 a;
    public static final EnumC0201Ci0 b;
    public static final EnumC0201Ci0 c;
    public static final EnumC0201Ci0 d;
    public static final EnumC0201Ci0 e;
    public static final /* synthetic */ EnumC0201Ci0[] f;

    static {
        EnumC0201Ci0 enumC0201Ci0 = new EnumC0201Ci0("DESTROYED", 0);
        a = enumC0201Ci0;
        EnumC0201Ci0 enumC0201Ci02 = new EnumC0201Ci0("INITIALIZED", 1);
        b = enumC0201Ci02;
        EnumC0201Ci0 enumC0201Ci03 = new EnumC0201Ci0("CREATED", 2);
        c = enumC0201Ci03;
        EnumC0201Ci0 enumC0201Ci04 = new EnumC0201Ci0("STARTED", 3);
        d = enumC0201Ci04;
        EnumC0201Ci0 enumC0201Ci05 = new EnumC0201Ci0("RESUMED", 4);
        e = enumC0201Ci05;
        f = new EnumC0201Ci0[]{enumC0201Ci0, enumC0201Ci02, enumC0201Ci03, enumC0201Ci04, enumC0201Ci05};
    }

    public static EnumC0201Ci0 valueOf(String str) {
        return (EnumC0201Ci0) Enum.valueOf(EnumC0201Ci0.class, str);
    }

    public static EnumC0201Ci0[] values() {
        return (EnumC0201Ci0[]) f.clone();
    }
}
