package p000;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes2.dex */
public final class RA0 implements InterfaceC7782Ja0 {

    /* renamed from: b */
    public static final OL0 f10047b;

    /* renamed from: c */
    public static final RA0 f10048c;

    /* renamed from: d */
    public static final RA0 f10049d;

    /* renamed from: e */
    public static final RA0 f10050e;

    /* renamed from: f */
    public static final /* synthetic */ RA0[] f10051f;

    /* renamed from: a */
    public final String f10052a;

    static {
        RA0 ra0 = new RA0("DENIED", 0, "denied");
        f10048c = ra0;
        RA0 ra02 = new RA0("NOT_DETERMINED", 1, "not-determined");
        f10049d = ra02;
        RA0 ra03 = new RA0("GRANTED", 2, "granted");
        f10050e = ra03;
        RA0[] ra0Arr = {ra0, ra02, ra03};
        f10051f = ra0Arr;
        F02.m2482c(ra0Arr);
        f10047b = new OL0(18);
    }

    public RA0(String str, int i, String str2) {
        this.f10052a = str2;
    }

    public static RA0 valueOf(String str) {
        return (RA0) Enum.valueOf(RA0.class, str);
    }

    public static RA0[] values() {
        return (RA0[]) f10051f.clone();
    }

    @Override // p000.InterfaceC7782Ja0
    /* renamed from: a */
    public final String mo7a() {
        return this.f10052a;
    }
}
