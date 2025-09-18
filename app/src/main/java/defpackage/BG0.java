package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes2.dex */
public final class BG0 {
    public static final BG0 a;
    public static final BG0 b;
    public static final /* synthetic */ BG0[] c;

    static {
        BG0 bg0 = new BG0("MAIN", 0);
        a = bg0;
        BG0 bg02 = new BG0("DEFAULT", 1);
        b = bg02;
        BG0[] bg0Arr = {bg0, bg02};
        c = bg0Arr;
        F02.c(bg0Arr);
    }

    public static BG0 valueOf(String str) {
        return (BG0) Enum.valueOf(BG0.class, str);
    }

    public static BG0[] values() {
        return (BG0[]) c.clone();
    }
}
