package com.yandex.metrica.impl.p022ob;

import android.content.Context;
import android.content.pm.Signature;
import android.content.pm.SigningInfo;
import java.security.MessageDigest;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Locale;

/* renamed from: com.yandex.metrica.impl.ob.P */
/* loaded from: classes2.dex */
public class C2841P {

    /* renamed from: a */
    private final Context f21889a;

    /* renamed from: b */
    private final C2626G9 f21890b;

    /* renamed from: c */
    private final String f21891c;

    /* renamed from: d */
    private final C3039Wn f21892d;

    public C2841P(Context context, C2626G9 c2626g9) {
        this(context, c2626g9, context.getPackageName(), new C3039Wn());
    }

    /* renamed from: a */
    public List<String> m14725a() {
        Signature[] apkContentsSigners;
        String strReplaceAll;
        List<String> listM14175g = this.f21890b.m14175g();
        boolean zIsEmpty = listM14175g.isEmpty();
        List<String> list = listM14175g;
        if (zIsEmpty) {
            ArrayList arrayList = new ArrayList();
            try {
                if (C2968U2.m15243a(28)) {
                    SigningInfo signingInfo = this.f21892d.m15405b(this.f21889a, this.f21891c, 134217728).signingInfo;
                    apkContentsSigners = signingInfo.hasMultipleSigners() ? signingInfo.getApkContentsSigners() : signingInfo.getSigningCertificateHistory();
                } else {
                    apkContentsSigners = this.f21892d.m15405b(this.f21889a, this.f21891c, 64).signatures;
                }
                if (apkContentsSigners != null) {
                    for (Signature signature : apkContentsSigners) {
                        try {
                            strReplaceAll = C2819O2.m14687a(MessageDigest.getInstance("SHA1").digest(signature.toByteArray())).toUpperCase(Locale.US).replaceAll("(.{2})(?=.+)", "$1:");
                        } catch (Throwable unused) {
                            strReplaceAll = null;
                        }
                        if (strReplaceAll != null) {
                            arrayList.add(strReplaceAll);
                        }
                    }
                }
            } catch (Throwable unused2) {
            }
            Collections.sort(arrayList);
            boolean zIsEmpty2 = arrayList.isEmpty();
            list = arrayList;
            if (!zIsEmpty2) {
                this.f21890b.m14165a(arrayList).m14258c();
                list = arrayList;
            }
        }
        return list;
    }

    public C2841P(Context context, C2626G9 c2626g9, String str, C3039Wn c3039Wn) {
        this.f21889a = context;
        this.f21890b = c2626g9;
        this.f21891c = str;
        this.f21892d = c3039Wn;
    }
}
