package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes2.dex */
public final class QR {
    public static final QR a;
    public static final QR b;
    public static final QR c;
    public static final /* synthetic */ QR[] d;

    static {
        QR qr = new QR("CONFLICTS_ONLY", 0);
        a = qr;
        QR qr2 = new QR("SUCCESS_ONLY", 1);
        b = qr2;
        QR qr3 = new QR("BOTH", 2);
        c = qr3;
        d = new QR[]{qr, qr2, qr3};
    }

    public static QR valueOf(String str) {
        return (QR) Enum.valueOf(QR.class, str);
    }

    public static QR[] values() {
        return (QR[]) d.clone();
    }
}
