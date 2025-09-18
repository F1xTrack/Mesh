package io.appmetrica.analytics.logger.common.impl;

import java.util.Arrays;
import java.util.Locale;
import p000.AbstractC0852NX;
import p000.AbstractC7222ym;

/* renamed from: io.appmetrica.analytics.logger.common.impl.a */
/* loaded from: classes2.dex */
public final class C5662a {
    /* renamed from: a */
    public static String m21285a(String str, String str2, Object... objArr) {
        StringBuilder sbM5762k = AbstractC0852NX.m5762k(str, " ");
        if (str2 == null) {
            str2 = "";
        } else if (objArr != null && objArr.length != 0) {
            try {
                str2 = String.format(Locale.US, str2, objArr);
            } catch (Throwable unused) {
                StringBuilder sbM26240q = AbstractC7222ym.m26240q("Attention!!! Invalid log format. See exception details above. Message: ", str2, "; arguments: ");
                sbM26240q.append(Arrays.toString(objArr));
                str2 = sbM26240q.toString();
            }
        }
        Locale locale = Locale.US;
        sbM5762k.append("[" + Thread.currentThread().getId() + "-" + Thread.currentThread().getName() + "] " + str2);
        return sbM5762k.toString();
    }
}
