package p000;

import android.icu.util.ULocale;
import android.os.Build;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Locale;

/* renamed from: u10, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC11234u10 {

    /* renamed from: a */
    public static final C4262il f43448a = new C4262il(11);

    /* renamed from: a */
    public static String m25071a(String str, String[] strArr) {
        while (Arrays.asList(strArr).indexOf(str) <= -1) {
            int iLastIndexOf = str.lastIndexOf("-");
            if (iLastIndexOf < 0) {
                return "";
            }
            if (iLastIndexOf >= 2 && str.charAt(iLastIndexOf - 2) == '-') {
                iLastIndexOf -= 2;
            }
            str = str.substring(0, iLastIndexOf);
        }
        return str;
    }

    /* renamed from: b */
    public static ULocale m25072b(Y40 y40) {
        ULocale[] availableLocales = ULocale.getAvailableLocales();
        ULocale[] uLocaleArr = {L10.m4845i(y40.mo5822c())};
        boolean[] zArr = new boolean[1];
        ULocale uLocaleAcceptLanguage = ULocale.acceptLanguage(uLocaleArr, availableLocales, zArr);
        if (zArr[0] || uLocaleAcceptLanguage == null) {
            return null;
        }
        return uLocaleAcceptLanguage;
    }

    /* renamed from: c */
    public static C9108dO1 m25073c(String[] strArr) throws C0226Da {
        C9108dO1 c9108dO1 = new C9108dO1(16);
        for (String str : strArr) {
            Y40 y40M25305b = AbstractC11362v10.m25305b(str);
            ULocale uLocaleM25072b = m25072b(y40M25305b);
            if (uLocaleM25072b != null) {
                c9108dO1.f26012b = new C8062Ok0(uLocaleM25072b);
                c9108dO1.f26013c = y40M25305b.mo5820a();
                return c9108dO1;
            }
        }
        c9108dO1.f26012b = new C8062Ok0(ULocale.getDefault(ULocale.Category.FORMAT));
        return c9108dO1;
    }

    /* renamed from: d */
    public static String[] m25074d(String[] strArr) {
        ArrayList arrayList = new ArrayList();
        for (String str : strArr) {
            if (m25072b(AbstractC11362v10.m25305b(str)) != null) {
                arrayList.add(str);
            }
        }
        return (String[]) arrayList.toArray(new String[arrayList.size()]);
    }

    /* renamed from: e */
    public static String[] m25075e() {
        ArrayList arrayList = new ArrayList();
        for (Locale locale : Locale.getAvailableLocales()) {
            arrayList.add(locale.toLanguageTag());
        }
        return (String[]) arrayList.toArray(new String[arrayList.size()]);
    }

    /* renamed from: f */
    public static C9108dO1 m25076f(String[] strArr) throws C0226Da {
        String[] strArrM25075e = m25075e();
        C9108dO1 c9108dO1 = new C9108dO1(16);
        int length = strArr.length;
        int i = 0;
        while (true) {
            if (i < length) {
                Y40 y40M25305b = AbstractC11362v10.m25305b(strArr[i]);
                String strM25071a = m25071a(y40M25305b.mo5824e(), strArrM25075e);
                if (!strM25071a.isEmpty()) {
                    c9108dO1.f26012b = AbstractC11362v10.m25305b(strM25071a);
                    c9108dO1.f26013c = y40M25305b.mo5820a();
                    break;
                }
                i++;
            } else {
                c9108dO1.f26012b = Build.VERSION.SDK_INT >= 24 ? new C8062Ok0(ULocale.getDefault(ULocale.Category.FORMAT)) : new C8010Nk0(Locale.getDefault());
            }
        }
        return c9108dO1;
    }

    /* renamed from: g */
    public static String[] m25077g(String[] strArr) {
        ArrayList arrayList = new ArrayList();
        String[] strArrM25075e = m25075e();
        for (String str : strArr) {
            String strM25071a = m25071a(AbstractC11362v10.m25305b(str).mo5824e(), strArrM25075e);
            if (strM25071a != null && !strM25071a.isEmpty()) {
                arrayList.add(str);
            }
        }
        return (String[]) arrayList.toArray(new String[arrayList.size()]);
    }
}
