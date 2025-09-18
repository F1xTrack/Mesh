package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes2.dex */
public final class GU0 {
    public static final GU0 a;
    public static final GU0 b;
    public static final GU0 c;
    public static final /* synthetic */ GU0[] d;

    static {
        GU0 gu0 = new GU0("OFF", 0);
        a = gu0;
        GU0 gu02 = new GU0("ADDITIVE", 1);
        b = gu02;
        GU0 gu03 = new GU0("MAXIMUM", 2);
        c = gu03;
        GU0[] gu0Arr = {gu0, gu02, gu03};
        d = gu0Arr;
        F02.c(gu0Arr);
    }

    public static GU0 valueOf(String str) {
        return (GU0) Enum.valueOf(GU0.class, str);
    }

    public static GU0[] values() {
        return (GU0[]) d.clone();
    }
}
