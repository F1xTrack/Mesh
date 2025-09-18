package p000;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes2.dex */
public final class RW0 {

    /* renamed from: a */
    public static final RW0 f10249a;

    /* renamed from: b */
    public static final RW0 f10250b;

    /* renamed from: c */
    public static final RW0 f10251c;

    /* renamed from: d */
    public static final RW0 f10252d;

    /* renamed from: e */
    public static final /* synthetic */ RW0[] f10253e;

    static {
        RW0 rw0 = new RW0("NONE", 0);
        f10249a = rw0;
        RW0 rw02 = new RW0("WORDS", 1);
        f10250b = rw02;
        RW0 rw03 = new RW0("SENTENCES", 2);
        f10251c = rw03;
        RW0 rw04 = new RW0("CHARACTERS", 3);
        f10252d = rw04;
        RW0[] rw0Arr = {rw0, rw02, rw03, rw04};
        f10253e = rw0Arr;
        F02.m2482c(rw0Arr);
    }

    public static RW0 valueOf(String str) {
        return (RW0) Enum.valueOf(RW0.class, str);
    }

    public static RW0[] values() {
        return (RW0[]) f10253e.clone();
    }
}
