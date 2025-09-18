package p000;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes2.dex */
public final class MV0 {

    /* renamed from: a */
    public static final MV0 f7197a;

    /* renamed from: b */
    public static final MV0 f7198b;

    /* renamed from: c */
    public static final /* synthetic */ MV0[] f7199c;

    static {
        MV0 mv0 = new MV0("PUSH", 0);
        f7197a = mv0;
        MV0 mv02 = new MV0("POP", 1);
        f7198b = mv02;
        MV0[] mv0Arr = {mv0, mv02};
        f7199c = mv0Arr;
        F02.m2482c(mv0Arr);
    }

    public static MV0 valueOf(String str) {
        return (MV0) Enum.valueOf(MV0.class, str);
    }

    public static MV0[] values() {
        return (MV0[]) f7199c.clone();
    }
}
