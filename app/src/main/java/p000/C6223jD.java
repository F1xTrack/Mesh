package p000;

/* renamed from: jD */
/* loaded from: classes.dex */
public final class C6223jD {

    /* renamed from: b */
    public static final C1395WA f34974b = new C1395WA();

    /* renamed from: c */
    public static final String f34975c = m21988a("hts/cahyiseot-agolai.o/1frlglgc/aclg", "tp:/rsltcrprsp.ogepscmv/ieo/eaybtho");

    /* renamed from: d */
    public static final String f34976d = m21988a("AzSBpY4F0rHiHFdinTvM", "IayrSTFL9eJ69YeSUO2");

    /* renamed from: e */
    public static final C4262il f34977e = new C4262il(23);

    /* renamed from: a */
    public final C10265mR0 f34978a;

    public C6223jD(C10265mR0 c10265mR0) {
        this.f34978a = c10265mR0;
    }

    /* renamed from: a */
    public static String m21988a(String str, String str2) {
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
