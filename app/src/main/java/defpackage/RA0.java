package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes2.dex */
public final class RA0 implements InterfaceC0723Ja0 {
    public static final OL0 b;
    public static final RA0 c;
    public static final RA0 d;
    public static final RA0 e;
    public static final /* synthetic */ RA0[] f;
    public final String a;

    static {
        RA0 ra0 = new RA0("DENIED", 0, "denied");
        c = ra0;
        RA0 ra02 = new RA0("NOT_DETERMINED", 1, "not-determined");
        d = ra02;
        RA0 ra03 = new RA0("GRANTED", 2, "granted");
        e = ra03;
        RA0[] ra0Arr = {ra0, ra02, ra03};
        f = ra0Arr;
        F02.c(ra0Arr);
        b = new OL0(18);
    }

    public RA0(String str, int i, String str2) {
        this.a = str2;
    }

    public static RA0 valueOf(String str) {
        return (RA0) Enum.valueOf(RA0.class, str);
    }

    public static RA0[] values() {
        return (RA0[]) f.clone();
    }

    @Override // defpackage.InterfaceC0723Ja0
    public final String a() {
        return this.a;
    }
}
