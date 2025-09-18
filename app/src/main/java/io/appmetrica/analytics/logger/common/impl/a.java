package io.appmetrica.analytics.logger.common.impl;

import defpackage.AbstractC8235ym;
import defpackage.NX;
import java.util.Arrays;
import java.util.Locale;

/* loaded from: classes2.dex */
public final class a {
    public static String a(String str, String str2, Object... objArr) {
        StringBuilder sbK = NX.k(str, " ");
        if (str2 == null) {
            str2 = "";
        } else if (objArr != null && objArr.length != 0) {
            try {
                str2 = String.format(Locale.US, str2, objArr);
            } catch (Throwable unused) {
                StringBuilder sbQ = AbstractC8235ym.q("Attention!!! Invalid log format. See exception details above. Message: ", str2, "; arguments: ");
                sbQ.append(Arrays.toString(objArr));
                str2 = sbQ.toString();
            }
        }
        Locale locale = Locale.US;
        sbK.append("[" + Thread.currentThread().getId() + "-" + Thread.currentThread().getName() + "] " + str2);
        return sbK.toString();
    }
}
