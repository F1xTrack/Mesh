package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes2.dex */
public final class MV0 {
    public static final MV0 a;
    public static final MV0 b;
    public static final /* synthetic */ MV0[] c;

    static {
        MV0 mv0 = new MV0("PUSH", 0);
        a = mv0;
        MV0 mv02 = new MV0("POP", 1);
        b = mv02;
        MV0[] mv0Arr = {mv0, mv02};
        c = mv0Arr;
        F02.c(mv0Arr);
    }

    public static MV0 valueOf(String str) {
        return (MV0) Enum.valueOf(MV0.class, str);
    }

    public static MV0[] values() {
        return (MV0[]) c.clone();
    }
}
