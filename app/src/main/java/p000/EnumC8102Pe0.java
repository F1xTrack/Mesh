package p000;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: Pe0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class EnumC8102Pe0 {

    /* renamed from: a */
    public static final EnumC8102Pe0 f9211a;

    /* renamed from: b */
    public static final EnumC8102Pe0 f9212b;

    /* renamed from: c */
    public static final EnumC8102Pe0 f9213c;

    /* renamed from: d */
    public static final /* synthetic */ EnumC8102Pe0[] f9214d;

    static {
        EnumC8102Pe0 enumC8102Pe0 = new EnumC8102Pe0("INSTANCE", 0);
        f9211a = enumC8102Pe0;
        EnumC8102Pe0 enumC8102Pe02 = new EnumC8102Pe0("EXTENSION_RECEIVER", 1);
        f9212b = enumC8102Pe02;
        EnumC8102Pe0 enumC8102Pe03 = new EnumC8102Pe0("VALUE", 2);
        f9213c = enumC8102Pe03;
        EnumC8102Pe0[] enumC8102Pe0Arr = {enumC8102Pe0, enumC8102Pe02, enumC8102Pe03};
        f9214d = enumC8102Pe0Arr;
        F02.m2482c(enumC8102Pe0Arr);
    }

    public static EnumC8102Pe0 valueOf(String str) {
        return (EnumC8102Pe0) Enum.valueOf(EnumC8102Pe0.class, str);
    }

    public static EnumC8102Pe0[] values() {
        return (EnumC8102Pe0[]) f9214d.clone();
    }
}
