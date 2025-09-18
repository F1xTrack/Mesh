package com.yandex.metrica.impl.ob;

import android.content.Context;
import android.content.pm.Signature;
import android.content.pm.SigningInfo;
import java.security.MessageDigest;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Locale;

/* loaded from: classes2.dex */
public class P {
    private final Context a;
    private final G9 b;
    private final String c;
    private final Wn d;

    public P(Context context, G9 g9) {
        this(context, g9, context.getPackageName(), new Wn());
    }

    public List<String> a() {
        Signature[] apkContentsSigners;
        String strReplaceAll;
        List<String> listG = this.b.g();
        boolean zIsEmpty = listG.isEmpty();
        List<String> list = listG;
        if (zIsEmpty) {
            ArrayList arrayList = new ArrayList();
            try {
                if (U2.a(28)) {
                    SigningInfo signingInfo = this.d.b(this.a, this.c, 134217728).signingInfo;
                    apkContentsSigners = signingInfo.hasMultipleSigners() ? signingInfo.getApkContentsSigners() : signingInfo.getSigningCertificateHistory();
                } else {
                    apkContentsSigners = this.d.b(this.a, this.c, 64).signatures;
                }
                if (apkContentsSigners != null) {
                    for (Signature signature : apkContentsSigners) {
                        try {
                            strReplaceAll = O2.a(MessageDigest.getInstance("SHA1").digest(signature.toByteArray())).toUpperCase(Locale.US).replaceAll("(.{2})(?=.+)", "$1:");
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
                this.b.a(arrayList).c();
                list = arrayList;
            }
        }
        return list;
    }

    public P(Context context, G9 g9, String str, Wn wn) {
        this.a = context;
        this.b = g9;
        this.c = str;
        this.d = wn;
    }
}
