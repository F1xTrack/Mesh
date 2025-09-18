package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes2.dex */
public final class II {
    public static final II a;
    public static final II b;
    public static final II c;
    public static final /* synthetic */ II[] d;

    static {
        II ii = new II("STABLE", 0);
        a = ii;
        II ii2 = new II("FIR_UNSTABLE", 1);
        b = ii2;
        II ii3 = new II("IR_UNSTABLE", 2);
        c = ii3;
        II[] iiArr = {ii, ii2, ii3};
        d = iiArr;
        F02.c(iiArr);
    }

    public static II valueOf(String str) {
        return (II) Enum.valueOf(II.class, str);
    }

    public static II[] values() {
        return (II[]) d.clone();
    }
}
