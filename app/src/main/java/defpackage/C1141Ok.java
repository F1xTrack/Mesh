package defpackage;

import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import java.util.regex.Pattern;

/* renamed from: Ok, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1141Ok implements XN {
    public static final String c;
    public static final Set d;
    public static final C1141Ok e;
    public static final C1141Ok f;
    public final String a;
    public final String b;

    static {
        String strC = AbstractC3970gT1.c("hts/frbslgiggolai.o/0clgbthfra=snpoo", "tp:/ieaeogn.ogepscmvc/o/ac?omtjo_rt3");
        c = strC;
        String strC2 = AbstractC3970gT1.c("hts/frbslgigp.ogepscmv/ieo/eaybtho", "tp:/ieaeogn-agolai.o/1frlglgc/aclg");
        String strC3 = AbstractC3970gT1.c("AzSCki82AwsLzKd5O8zo", "IayckHiZRO1EFl1aGoK");
        d = Collections.unmodifiableSet(new HashSet(Arrays.asList(new C7973xO("proto"), new C7973xO("json"))));
        e = new C1141Ok(strC, null);
        f = new C1141Ok(strC2, strC3);
    }

    public C1141Ok(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    public static C1141Ok a(byte[] bArr) {
        String str = new String(bArr, Charset.forName("UTF-8"));
        if (!str.startsWith("1$")) {
            throw new IllegalArgumentException("Version marker missing from extras");
        }
        String[] strArrSplit = str.substring(2).split(Pattern.quote("\\"), 2);
        if (strArrSplit.length != 2) {
            throw new IllegalArgumentException("Extra is not a valid encoded LegacyFlgDestination");
        }
        String str2 = strArrSplit[0];
        if (str2.isEmpty()) {
            throw new IllegalArgumentException("Missing endpoint in CCTDestination extras");
        }
        String str3 = strArrSplit[1];
        if (str3.isEmpty()) {
            str3 = null;
        }
        return new C1141Ok(str2, str3);
    }
}
