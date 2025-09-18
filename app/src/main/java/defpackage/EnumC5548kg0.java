package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: kg0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class EnumC5548kg0 {
    public static final EnumC5548kg0 b;
    public static final EnumC5548kg0 c;
    public static final EnumC5548kg0 d;
    public static final EnumC5548kg0 e;
    public static final /* synthetic */ EnumC5548kg0[] f;
    public final String a;

    static {
        EnumC5548kg0 enumC5548kg0 = new EnumC5548kg0("Move", 0, "topKeyboardMove");
        b = enumC5548kg0;
        EnumC5548kg0 enumC5548kg02 = new EnumC5548kg0("Start", 1, "topKeyboardMoveStart");
        c = enumC5548kg02;
        EnumC5548kg0 enumC5548kg03 = new EnumC5548kg0("End", 2, "topKeyboardMoveEnd");
        d = enumC5548kg03;
        EnumC5548kg0 enumC5548kg04 = new EnumC5548kg0("Interactive", 3, "topKeyboardMoveInteractive");
        e = enumC5548kg04;
        EnumC5548kg0[] enumC5548kg0Arr = {enumC5548kg0, enumC5548kg02, enumC5548kg03, enumC5548kg04};
        f = enumC5548kg0Arr;
        F02.c(enumC5548kg0Arr);
    }

    public EnumC5548kg0(String str, int i, String str2) {
        this.a = str2;
    }

    public static EnumC5548kg0 valueOf(String str) {
        return (EnumC5548kg0) Enum.valueOf(EnumC5548kg0.class, str);
    }

    public static EnumC5548kg0[] values() {
        return (EnumC5548kg0[]) f.clone();
    }
}
