package io.sentry;

import io.appmetrica.analytics.coreutils.internal.StringUtils;
import io.sentry.config.AbstractC6003a;
import java.net.URI;

/* renamed from: io.sentry.r */
/* loaded from: classes2.dex */
public final class C6114r {

    /* renamed from: a */
    public final String f34508a;

    /* renamed from: b */
    public final String f34509b;

    /* renamed from: c */
    public final URI f34510c;

    public C6114r(String str) {
        try {
            AbstractC6003a.m21735D(str, "The DSN is required.");
            URI uriNormalize = new URI(str).normalize();
            String scheme = uriNormalize.getScheme();
            if (!"http".equalsIgnoreCase(scheme) && !"https".equalsIgnoreCase(scheme)) {
                throw new IllegalArgumentException("Invalid DSN scheme: " + scheme);
            }
            String userInfo = uriNormalize.getUserInfo();
            if (userInfo == null || userInfo.isEmpty()) {
                throw new IllegalArgumentException("Invalid DSN: No public key provided.");
            }
            String[] strArrSplit = userInfo.split(StringUtils.PROCESS_POSTFIX_DELIMITER, -1);
            String str2 = strArrSplit[0];
            this.f34509b = str2;
            if (str2 == null || str2.isEmpty()) {
                throw new IllegalArgumentException("Invalid DSN: No public key provided.");
            }
            this.f34508a = strArrSplit.length > 1 ? strArrSplit[1] : null;
            String path = uriNormalize.getPath();
            path = path.endsWith("/") ? path.substring(0, path.length() - 1) : path;
            int iLastIndexOf = path.lastIndexOf("/") + 1;
            String strSubstring = path.substring(0, iLastIndexOf);
            strSubstring = strSubstring.endsWith("/") ? strSubstring : strSubstring.concat("/");
            String strSubstring2 = path.substring(iLastIndexOf);
            if (strSubstring2.isEmpty()) {
                throw new IllegalArgumentException("Invalid DSN: A Project Id is required.");
            }
            this.f34510c = new URI(scheme, null, uriNormalize.getHost(), uriNormalize.getPort(), strSubstring + "api/" + strSubstring2, null, null);
        } catch (Throwable th) {
            throw new IllegalArgumentException(th);
        }
    }
}
