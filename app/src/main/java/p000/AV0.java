package p000;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class AV0 {

    /* renamed from: a */
    public static final AV0 f212a;

    /* renamed from: b */
    public static final AV0 f213b;

    /* renamed from: c */
    public static final AV0 f214c;

    /* renamed from: d */
    public static final /* synthetic */ AV0[] f215d;

    static {
        AV0 av0 = new AV0("NETWORK_UNMETERED", 0);
        f212a = av0;
        AV0 av02 = new AV0("DEVICE_IDLE", 1);
        f213b = av02;
        AV0 av03 = new AV0("DEVICE_CHARGING", 2);
        f214c = av03;
        f215d = new AV0[]{av0, av02, av03};
    }

    public static AV0 valueOf(String str) {
        return (AV0) Enum.valueOf(AV0.class, str);
    }

    public static AV0[] values() {
        return (AV0[]) f215d.clone();
    }
}
