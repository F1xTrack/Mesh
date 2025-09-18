package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes2.dex */
public final class RW0 {
    public static final RW0 a;
    public static final RW0 b;
    public static final RW0 c;
    public static final RW0 d;
    public static final /* synthetic */ RW0[] e;

    static {
        RW0 rw0 = new RW0("NONE", 0);
        a = rw0;
        RW0 rw02 = new RW0("WORDS", 1);
        b = rw02;
        RW0 rw03 = new RW0("SENTENCES", 2);
        c = rw03;
        RW0 rw04 = new RW0("CHARACTERS", 3);
        d = rw04;
        RW0[] rw0Arr = {rw0, rw02, rw03, rw04};
        e = rw0Arr;
        F02.c(rw0Arr);
    }

    public static RW0 valueOf(String str) {
        return (RW0) Enum.valueOf(RW0.class, str);
    }

    public static RW0[] values() {
        return (RW0[]) e.clone();
    }
}
