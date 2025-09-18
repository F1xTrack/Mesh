package com.facebook.soloader;

import android.annotation.TargetApi;
import android.os.Trace;
import p000.AbstractC1374Vq;
import p000.AbstractC7222ym;
import p000.InterfaceC0902OK;

@InterfaceC0902OK
@TargetApi(18)
/* loaded from: classes.dex */
class Api18TraceUtils {
    /* renamed from: a */
    public static void m11066a(String str, String str2, String str3) {
        String strM8589h = AbstractC1374Vq.m8589h(str, str2, str3);
        if (strM8589h.length() > 127 && str2 != null) {
            int length = (127 - str.length()) - str3.length();
            StringBuilder sbM26238o = AbstractC7222ym.m26238o(str);
            sbM26238o.append(str2.substring(0, length));
            sbM26238o.append(str3);
            strM8589h = sbM26238o.toString();
        }
        Trace.beginSection(strM8589h);
    }
}
