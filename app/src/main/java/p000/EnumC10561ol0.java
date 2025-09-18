package p000;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: ol0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class EnumC10561ol0 {

    /* renamed from: b */
    public static final C6914tt f39223b;

    /* renamed from: c */
    public static final EnumC10561ol0 f39224c;

    /* renamed from: d */
    public static final EnumC10561ol0 f39225d;

    /* renamed from: e */
    public static final EnumC10561ol0 f39226e;

    /* renamed from: f */
    public static final /* synthetic */ EnumC10561ol0[] f39227f;

    /* renamed from: a */
    public final String f39228a;

    static {
        EnumC10561ol0 enumC10561ol0 = new EnumC10561ol0("Trace", 0, "trace");
        EnumC10561ol0 enumC10561ol02 = new EnumC10561ol0("Timer", 1, "timer");
        EnumC10561ol0 enumC10561ol03 = new EnumC10561ol0("Stacktrace", 2, "stacktrace");
        EnumC10561ol0 enumC10561ol04 = new EnumC10561ol0("Debug", 3, "debug");
        EnumC10561ol0 enumC10561ol05 = new EnumC10561ol0("Info", 4, "info");
        f39224c = enumC10561ol05;
        EnumC10561ol0 enumC10561ol06 = new EnumC10561ol0("Warn", 5, "warn");
        f39225d = enumC10561ol06;
        EnumC10561ol0 enumC10561ol07 = new EnumC10561ol0("Error", 6, "error");
        f39226e = enumC10561ol07;
        EnumC10561ol0[] enumC10561ol0Arr = {enumC10561ol0, enumC10561ol02, enumC10561ol03, enumC10561ol04, enumC10561ol05, enumC10561ol06, enumC10561ol07, new EnumC10561ol0("Fatal", 7, "fatal")};
        f39227f = enumC10561ol0Arr;
        F02.m2482c(enumC10561ol0Arr);
        f39223b = new C6914tt(17);
    }

    public EnumC10561ol0(String str, int i, String str2) {
        this.f39228a = str2;
    }

    public static EnumC10561ol0 valueOf(String str) {
        return (EnumC10561ol0) Enum.valueOf(EnumC10561ol0.class, str);
    }

    public static EnumC10561ol0[] values() {
        return (EnumC10561ol0[]) f39227f.clone();
    }
}
