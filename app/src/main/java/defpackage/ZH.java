package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes2.dex */
public final class ZH {
    public static final ZH a;
    public static final /* synthetic */ ZH[] b;

    static {
        ZH zh = new ZH("WARNING", 0);
        ZH zh2 = new ZH("ERROR", 1);
        a = zh2;
        ZH[] zhArr = {zh, zh2, new ZH("HIDDEN", 2)};
        b = zhArr;
        F02.c(zhArr);
    }

    public static ZH valueOf(String str) {
        return (ZH) Enum.valueOf(ZH.class, str);
    }

    public static ZH[] values() {
        return (ZH[]) b.clone();
    }
}
