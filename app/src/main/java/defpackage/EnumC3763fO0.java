package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: fO0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class EnumC3763fO0 {
    public static final EnumC3763fO0 a;
    public static final EnumC3763fO0 b;
    public static final EnumC3763fO0 c;
    public static final EnumC3763fO0 d;
    public static final EnumC3763fO0 e;
    public static final EnumC3763fO0 f;
    public static final EnumC3763fO0 g;
    public static final EnumC3763fO0 h;
    public static final EnumC3763fO0 i;
    public static final /* synthetic */ EnumC3763fO0[] j;

    static {
        EnumC3763fO0 enumC3763fO0 = new EnumC3763fO0("CONFIGURING", 0);
        a = enumC3763fO0;
        EnumC3763fO0 enumC3763fO02 = new EnumC3763fO0("PENDING_RECORDING", 1);
        b = enumC3763fO02;
        EnumC3763fO0 enumC3763fO03 = new EnumC3763fO0("PENDING_PAUSED", 2);
        c = enumC3763fO03;
        EnumC3763fO0 enumC3763fO04 = new EnumC3763fO0("IDLING", 3);
        d = enumC3763fO04;
        EnumC3763fO0 enumC3763fO05 = new EnumC3763fO0("RECORDING", 4);
        e = enumC3763fO05;
        EnumC3763fO0 enumC3763fO06 = new EnumC3763fO0("PAUSED", 5);
        f = enumC3763fO06;
        EnumC3763fO0 enumC3763fO07 = new EnumC3763fO0("STOPPING", 6);
        g = enumC3763fO07;
        EnumC3763fO0 enumC3763fO08 = new EnumC3763fO0("RESETTING", 7);
        h = enumC3763fO08;
        EnumC3763fO0 enumC3763fO09 = new EnumC3763fO0("ERROR", 8);
        i = enumC3763fO09;
        j = new EnumC3763fO0[]{enumC3763fO0, enumC3763fO02, enumC3763fO03, enumC3763fO04, enumC3763fO05, enumC3763fO06, enumC3763fO07, enumC3763fO08, enumC3763fO09};
    }

    public static EnumC3763fO0 valueOf(String str) {
        return (EnumC3763fO0) Enum.valueOf(EnumC3763fO0.class, str);
    }

    public static EnumC3763fO0[] values() {
        return (EnumC3763fO0[]) j.clone();
    }
}
