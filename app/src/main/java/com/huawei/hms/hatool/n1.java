package com.huawei.hms.hatool;

import android.util.Pair;
import defpackage.AbstractC1705Vq;
import defpackage.AbstractC8235ym;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.HashSet;
import java.util.Locale;
import java.util.Set;

/* loaded from: classes.dex */
public abstract class n1 {
    public static long a(String str, long j) {
        try {
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat(str, Locale.getDefault());
            return simpleDateFormat.parse(simpleDateFormat.format(Long.valueOf(j))).getTime();
        } catch (ParseException unused) {
            v.f("hmsSdk/stringUtil", "getMillisOfDate(): Time conversion Exception !");
            return 0L;
        }
    }

    public static Pair<String, String> a(String str) {
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

    public static String a(int i) {
        return i != 0 ? i != 1 ? i != 2 ? i != 3 ? "alltype" : "diffprivacy" : "preins" : "maint" : "oper";
    }

    public static String a(String str, String str2) {
        return "_default_config_tag".equals(str) ? str : AbstractC1705Vq.h(str, "-", str2);
    }

    public static String a(String str, String str2, String str3) {
        if ("_default_config_tag".equals(str)) {
            return AbstractC8235ym.v("_default_config_tag#", str3);
        }
        return str + "-" + str2 + "#" + str3;
    }

    public static Set<String> a(Set<String> set) {
        if (set == null || set.size() == 0) {
            return new HashSet();
        }
        HashSet hashSet = new HashSet();
        for (String str : set) {
            if ("_default_config_tag".equals(str)) {
                hashSet.add("_default_config_tag");
            } else {
                String strI = AbstractC8235ym.i(str, "-oper");
                String strI2 = AbstractC8235ym.i(str, "-maint");
                hashSet.add(strI);
                hashSet.add(strI2);
                hashSet.add(str + "-diffprivacy");
            }
        }
        return hashSet;
    }
}
