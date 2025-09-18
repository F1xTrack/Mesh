package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class AV0 {
    public static final AV0 a;
    public static final AV0 b;
    public static final AV0 c;
    public static final /* synthetic */ AV0[] d;

    static {
        AV0 av0 = new AV0("NETWORK_UNMETERED", 0);
        a = av0;
        AV0 av02 = new AV0("DEVICE_IDLE", 1);
        b = av02;
        AV0 av03 = new AV0("DEVICE_CHARGING", 2);
        c = av03;
        d = new AV0[]{av0, av02, av03};
    }

    public static AV0 valueOf(String str) {
        return (AV0) Enum.valueOf(AV0.class, str);
    }

    public static AV0[] values() {
        return (AV0[]) d.clone();
    }
}
