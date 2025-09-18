package defpackage;

/* renamed from: jD, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C5269jD {
    public static final WA b = new WA();
    public static final String c = a("hts/cahyiseot-agolai.o/1frlglgc/aclg", "tp:/rsltcrprsp.ogepscmv/ieo/eaybtho");
    public static final String d = a("AzSBpY4F0rHiHFdinTvM", "IayrSTFL9eJ69YeSUO2");
    public static final C4403il e = new C4403il(23);
    public final C5885mR0 a;

    public C5269jD(C5885mR0 c5885mR0) {
        this.a = c5885mR0;
    }

    public static String a(String str, String str2) {
        int length = str.length() - str2.length();
        if (length < 0 || length > 1) {
            throw new IllegalArgumentException("Invalid input received");
        }
        StringBuilder sb = new StringBuilder(str2.length() + str.length());
        for (int i = 0; i < str.length(); i++) {
            sb.append(str.charAt(i));
            if (str2.length() > i) {
                sb.append(str2.charAt(i));
            }
        }
        return sb.toString();
    }
}
