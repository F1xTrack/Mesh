package p000;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: kg0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class EnumC10039kg0 {

    /* renamed from: b */
    public static final EnumC10039kg0 f36600b;

    /* renamed from: c */
    public static final EnumC10039kg0 f36601c;

    /* renamed from: d */
    public static final EnumC10039kg0 f36602d;

    /* renamed from: e */
    public static final EnumC10039kg0 f36603e;

    /* renamed from: f */
    public static final /* synthetic */ EnumC10039kg0[] f36604f;

    /* renamed from: a */
    public final String f36605a;

    static {
        EnumC10039kg0 enumC10039kg0 = new EnumC10039kg0("Move", 0, "topKeyboardMove");
        f36600b = enumC10039kg0;
        EnumC10039kg0 enumC10039kg02 = new EnumC10039kg0("Start", 1, "topKeyboardMoveStart");
        f36601c = enumC10039kg02;
        EnumC10039kg0 enumC10039kg03 = new EnumC10039kg0("End", 2, "topKeyboardMoveEnd");
        f36602d = enumC10039kg03;
        EnumC10039kg0 enumC10039kg04 = new EnumC10039kg0("Interactive", 3, "topKeyboardMoveInteractive");
        f36603e = enumC10039kg04;
        EnumC10039kg0[] enumC10039kg0Arr = {enumC10039kg0, enumC10039kg02, enumC10039kg03, enumC10039kg04};
        f36604f = enumC10039kg0Arr;
        F02.m2482c(enumC10039kg0Arr);
    }

    public EnumC10039kg0(String str, int i, String str2) {
        this.f36605a = str2;
    }

    public static EnumC10039kg0 valueOf(String str) {
        return (EnumC10039kg0) Enum.valueOf(EnumC10039kg0.class, str);
    }

    public static EnumC10039kg0[] values() {
        return (EnumC10039kg0[]) f36604f.clone();
    }
}
