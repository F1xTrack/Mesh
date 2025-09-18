package p000;

import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import java.util.regex.Pattern;

/* renamed from: Ok */
/* loaded from: classes.dex */
public final class C0928Ok implements InterfaceC1471XN {

    /* renamed from: c */
    public static final String f8585c;

    /* renamed from: d */
    public static final Set f8586d;

    /* renamed from: e */
    public static final C0928Ok f8587e;

    /* renamed from: f */
    public static final C0928Ok f8588f;

    /* renamed from: a */
    public final String f8589a;

    /* renamed from: b */
    public final String f8590b;

    static {
        String strM18573c = AbstractC9502gT1.m18573c("hts/frbslgiggolai.o/0clgbthfra=snpoo", "tp:/ieaeogn.ogepscmvc/o/ac?omtjo_rt3");
        f8585c = strM18573c;
        String strM18573c2 = AbstractC9502gT1.m18573c("hts/frbslgigp.ogepscmv/ieo/eaybtho", "tp:/ieaeogn-agolai.o/1frlglgc/aclg");
        String strM18573c3 = AbstractC9502gT1.m18573c("AzSCki82AwsLzKd5O8zo", "IayckHiZRO1EFl1aGoK");
        f8586d = Collections.unmodifiableSet(new HashSet(Arrays.asList(new C7135xO("proto"), new C7135xO("json"))));
        f8587e = new C0928Ok(strM18573c, null);
        f8588f = new C0928Ok(strM18573c2, strM18573c3);
    }

    public C0928Ok(String str, String str2) {
        this.f8589a = str;
        this.f8590b = str2;
    }

    /* renamed from: a */
    public static C0928Ok m6127a(byte[] bArr) {
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
        return new C0928Ok(str2, str3);
    }
}
