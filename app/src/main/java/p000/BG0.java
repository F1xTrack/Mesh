package p000;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes2.dex */
public final class BG0 {

    /* renamed from: a */
    public static final BG0 f694a;

    /* renamed from: b */
    public static final BG0 f695b;

    /* renamed from: c */
    public static final /* synthetic */ BG0[] f696c;

    static {
        BG0 bg0 = new BG0("MAIN", 0);
        f694a = bg0;
        BG0 bg02 = new BG0("DEFAULT", 1);
        f695b = bg02;
        BG0[] bg0Arr = {bg0, bg02};
        f696c = bg0Arr;
        F02.m2482c(bg0Arr);
    }

    public static BG0 valueOf(String str) {
        return (BG0) Enum.valueOf(BG0.class, str);
    }

    public static BG0[] values() {
        return (BG0[]) f696c.clone();
    }
}
