package com.huawei.hms.hatool;

import android.util.Pair;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.HashSet;
import java.util.Locale;
import java.util.Set;
import p000.AbstractC1374Vq;
import p000.AbstractC7222ym;

/* renamed from: com.huawei.hms.hatool.n1 */
/* loaded from: classes.dex */
public abstract class AbstractC2169n1 {
    /* renamed from: a */
    public static long m12136a(String str, long j) {
        try {
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat(str, Locale.getDefault());
            return simpleDateFormat.parse(simpleDateFormat.format(Long.valueOf(j))).getTime();
        } catch (ParseException unused) {
            C2186v.m12276f("hmsSdk/stringUtil", "getMillisOfDate(): Time conversion Exception !");
            return 0L;
        }
    }

    /* renamed from: a */
    public static Pair<String, String> m12137a(String str) {
        String strSubstring;
        String str2;
        if ("_default_config_tag".equals(str)) {
            return new Pair<>(str, "");
        }
        String[] strArrSplit = str.split("-");
        if (strArrSplit.length > 2) {
            str2 = strArrSplit[strArrSplit.length - 1];
            strSubstring = str.substring(0, (str.length() - str2.length()) - 1);
        } else {
            strSubstring = strArrSplit[0];
            str2 = strArrSplit[1];
        }
        return new Pair<>(strSubstring, str2);
    }

    /* renamed from: a */
    public static String m12138a(int i) {
        return i != 0 ? i != 1 ? i != 2 ? i != 3 ? "alltype" : "diffprivacy" : "preins" : "maint" : "oper";
    }

    /* renamed from: a */
    public static String m12139a(String str, String str2) {
        return "_default_config_tag".equals(str) ? str : AbstractC1374Vq.m8589h(str, "-", str2);
    }

    /* renamed from: a */
    public static String m12140a(String str, String str2, String str3) {
        if ("_default_config_tag".equals(str)) {
            return AbstractC7222ym.m26245v("_default_config_tag#", str3);
        }
        return str + "-" + str2 + "#" + str3;
    }

    /* renamed from: a */
    public static Set<String> m12141a(Set<String> set) {
        if (set == null || set.size() == 0) {
            return new HashSet();
        }
        HashSet hashSet = new HashSet();
        for (String str : set) {
            if ("_default_config_tag".equals(str)) {
                hashSet.add("_default_config_tag");
            } else {
                String strM26232i = AbstractC7222ym.m26232i(str, "-oper");
                String strM26232i2 = AbstractC7222ym.m26232i(str, "-maint");
                hashSet.add(strM26232i);
                hashSet.add(strM26232i2);
                hashSet.add(str + "-diffprivacy");
            }
        }
        return hashSet;
    }
}
