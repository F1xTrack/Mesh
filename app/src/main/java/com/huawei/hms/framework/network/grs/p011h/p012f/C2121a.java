package com.huawei.hms.framework.network.grs.p011h.p012f;

import android.content.Context;
import android.text.TextUtils;
import com.google.firebase.perf.network.FirebasePerfUrlConnection;
import com.huawei.hms.framework.common.IoUtils;
import com.huawei.hms.framework.common.Logger;
import com.huawei.hms.framework.network.grs.p011h.C2116a;
import com.huawei.hms.framework.network.grs.p011h.p013g.C2122a;
import java.io.OutputStream;
import java.net.URL;
import java.net.URLConnection;
import javax.net.ssl.HttpsURLConnection;

/* renamed from: com.huawei.hms.framework.network.grs.h.f.a */
/* loaded from: classes.dex */
public class C2121a {
    /* renamed from: a */
    public static HttpsURLConnection m11872a(String str, Context context, String str2) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        URLConnection uRLConnection = (URLConnection) FirebasePerfUrlConnection.instrument(new URL(str).openConnection());
        if (!(uRLConnection instanceof HttpsURLConnection)) {
            Logger.m11689w("URLConnectionHelper", "urlConnection is not an instance of HttpsURLConnection");
            return null;
        }
        HttpsURLConnection httpsURLConnection = (HttpsURLConnection) uRLConnection;
        try {
            httpsURLConnection.setSSLSocketFactory(C2122a.m11875a(context));
            httpsURLConnection.setHostnameVerifier(C2122a.m11874a());
        } catch (IllegalArgumentException unused) {
            Logger.m11689w("URLConnectionHelper", "init https ssl socket failed.");
        }
        httpsURLConnection.setConnectTimeout(10000);
        httpsURLConnection.setReadTimeout(10000);
        httpsURLConnection.setDoOutput(true);
        httpsURLConnection.setUseCaches(false);
        String strM11861b = C2116a.m11861b(context, "NetworkKit-grs", str2);
        Logger.m11680d("URLConnectionHelper", "request to grs server with a User-Agent header is: " + strM11861b);
        httpsURLConnection.setRequestProperty("User-Agent", strM11861b);
        return httpsURLConnection;
    }

    /* renamed from: a */
    public static void m11873a(HttpsURLConnection httpsURLConnection, String str) throws Throwable {
        OutputStream outputStream;
        String str2;
        if (str == null) {
            str2 = "sendHttpBody: The Body Data is Null";
        } else {
            if (httpsURLConnection != null) {
                try {
                    outputStream = httpsURLConnection.getOutputStream();
                } catch (Throwable th) {
                    th = th;
                    outputStream = null;
                }
                try {
                    outputStream.write(str.getBytes("UTF-8"));
                    outputStream.flush();
                    IoUtils.closeSecure(outputStream);
                    return;
                } catch (Throwable th2) {
                    th = th2;
                    IoUtils.closeSecure(outputStream);
                    throw th;
                }
            }
            str2 = "sendHttpBody: HttpsURLConnection is Null";
        }
        Logger.m11685i("URLConnectionHelper", str2);
    }
}
