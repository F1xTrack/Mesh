package io.appmetrica.analytics.coreutils.internal.network;

import android.os.Build;
import io.appmetrica.analytics.coreutils.internal.StringExtensionsKt;
import kotlin.Metadata;
import p000.D51;
import p000.F91;

@Metadata(m22266d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\bÆ\u0002\u0018\u00002\u00020\u0001J \u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0002H\u0007¨\u0006\u0007"}, m22267d2 = {"Lio/appmetrica/analytics/coreutils/internal/network/UserAgent;", "", "", "sdkName", "versionName", "buildNumber", "getFor", "core-utils_release"}, m22268k = 1, m22269mv = {1, 6, 0})
/* loaded from: classes2.dex */
public final class UserAgent {
    public static final UserAgent INSTANCE = new UserAgent();

    private UserAgent() {
    }

    public static final String getFor(String sdkName, String versionName, String buildNumber) {
        StringBuilder sb = new StringBuilder();
        sb.append(sdkName);
        sb.append('/');
        sb.append(versionName);
        sb.append('.');
        sb.append(buildNumber);
        sb.append(" (");
        INSTANCE.getClass();
        String str = Build.MODEL;
        String str2 = Build.MANUFACTURER;
        if (!D51.m1556o(str, str2, false)) {
            str = str2 + ' ' + str;
        }
        sb.append(StringExtensionsKt.replaceFirstCharWithTitleCase(str));
        sb.append("; Android ");
        return F91.m2539v(sb, Build.VERSION.RELEASE, ')');
    }
}
