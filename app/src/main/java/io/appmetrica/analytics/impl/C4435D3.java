package io.appmetrica.analytics.impl;

import android.content.Context;
import android.content.pm.Signature;
import android.content.pm.SigningInfo;
import io.appmetrica.analytics.coreutils.internal.AndroidUtils;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import io.appmetrica.analytics.coreutils.internal.services.SafePackageManager;
import java.security.MessageDigest;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* renamed from: io.appmetrica.analytics.impl.D3 */
/* loaded from: classes2.dex */
public final class C4435D3 {

    /* renamed from: a */
    public final Context f29989a;

    /* renamed from: b */
    public final C5323ne f29990b;

    /* renamed from: c */
    public final String f29991c;

    /* renamed from: d */
    public final SafePackageManager f29992d;

    public C4435D3(Context context, C5323ne c5323ne, String str, SafePackageManager safePackageManager) {
        this.f29989a = context;
        this.f29990b = c5323ne;
        this.f29991c = str;
        this.f29992d = safePackageManager;
    }

    /* renamed from: a */
    public final List m19306a() {
        Signature[] apkContentsSigners;
        String sha1;
        List<String> listM20827f = this.f29990b.m20827f();
        boolean zIsEmpty = listM20827f.isEmpty();
        List<String> list = listM20827f;
        if (zIsEmpty) {
            ArrayList arrayList = new ArrayList();
            try {
                if (AndroidUtils.isApiAchieved(28)) {
                    SigningInfo signingInfo = this.f29992d.getPackageInfo(this.f29989a, this.f29991c, 134217728).signingInfo;
                    apkContentsSigners = signingInfo.hasMultipleSigners() ? signingInfo.getApkContentsSigners() : signingInfo.getSigningCertificateHistory();
                } else {
                    apkContentsSigners = this.f29992d.getPackageInfo(this.f29989a, this.f29991c, 64).signatures;
                }
                if (apkContentsSigners != null) {
                    for (Signature signature : apkContentsSigners) {
                        try {
                            sha1 = StringUtils.formatSha1(MessageDigest.getInstance("SHA1").digest(signature.toByteArray()));
                        } catch (Throwable unused) {
                            sha1 = null;
                        }
                        if (sha1 != null) {
                            arrayList.add(sha1);
                        }
                    }
                }
            } catch (Throwable unused2) {
            }
            Collections.sort(arrayList);
            boolean zIsEmpty2 = arrayList.isEmpty();
            list = arrayList;
            if (!zIsEmpty2) {
                this.f29990b.m20821a(arrayList).m20875b();
                list = arrayList;
            }
        }
        return list;
    }
}
