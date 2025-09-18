package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: ol0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class EnumC6327ol0 {
    public static final C7304tt b;
    public static final EnumC6327ol0 c;
    public static final EnumC6327ol0 d;
    public static final EnumC6327ol0 e;
    public static final /* synthetic */ EnumC6327ol0[] f;
    public final String a;

    static {
        EnumC6327ol0 enumC6327ol0 = new EnumC6327ol0("Trace", 0, "trace");
        EnumC6327ol0 enumC6327ol02 = new EnumC6327ol0("Timer", 1, "timer");
        EnumC6327ol0 enumC6327ol03 = new EnumC6327ol0("Stacktrace", 2, "stacktrace");
        EnumC6327ol0 enumC6327ol04 = new EnumC6327ol0("Debug", 3, "debug");
        EnumC6327ol0 enumC6327ol05 = new EnumC6327ol0("Info", 4, "info");
        c = enumC6327ol05;
        EnumC6327ol0 enumC6327ol06 = new EnumC6327ol0("Warn", 5, "warn");
        d = enumC6327ol06;
        EnumC6327ol0 enumC6327ol07 = new EnumC6327ol0("Error", 6, "error");
        e = enumC6327ol07;
        EnumC6327ol0[] enumC6327ol0Arr = {enumC6327ol0, enumC6327ol02, enumC6327ol03, enumC6327ol04, enumC6327ol05, enumC6327ol06, enumC6327ol07, new EnumC6327ol0("Fatal", 7, "fatal")};
        f = enumC6327ol0Arr;
        F02.c(enumC6327ol0Arr);
        b = new C7304tt(17);
    }

    public EnumC6327ol0(String str, int i, String str2) {
        this.a = str2;
    }

    public static EnumC6327ol0 valueOf(String str) {
        return (EnumC6327ol0) Enum.valueOf(EnumC6327ol0.class, str);
    }

    public static EnumC6327ol0[] values() {
        return (EnumC6327ol0[]) f.clone();
    }
}
