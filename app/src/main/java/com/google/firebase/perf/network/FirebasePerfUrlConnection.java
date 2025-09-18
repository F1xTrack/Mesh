package com.google.firebase.perf.network;

import androidx.annotation.Keep;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import javax.net.ssl.HttpsURLConnection;
import p000.AbstractC8784av0;
import p000.C7731Ia1;
import p000.C8619Zc1;
import p000.C8654Zu0;
import p000.U80;
import p000.V80;

/* loaded from: classes.dex */
public class FirebasePerfUrlConnection {
    @Keep
    public static Object getContent(URL url) throws IOException {
        C8619Zc1 c8619Zc1 = C8619Zc1.f15028s;
        C7731Ia1 c7731Ia1 = new C7731Ia1();
        c7731Ia1.m3949d();
        long j = c7731Ia1.f5021a;
        C8654Zu0 c8654Zu0 = new C8654Zu0(c8619Zc1);
        try {
            URLConnection uRLConnectionOpenConnection = url.openConnection();
            return uRLConnectionOpenConnection instanceof HttpsURLConnection ? new V80((HttpsURLConnection) uRLConnectionOpenConnection, c7731Ia1, c8654Zu0).f12387a.m8676b() : uRLConnectionOpenConnection instanceof HttpURLConnection ? new U80((HttpURLConnection) uRLConnectionOpenConnection, c7731Ia1, c8654Zu0).f11662a.m8676b() : uRLConnectionOpenConnection.getContent();
        } catch (IOException e) {
            c8654Zu0.m9632g(j);
            c8654Zu0.m9635j(c7731Ia1.m3946a());
            c8654Zu0.m9636k(url.toString());
            AbstractC8784av0.m10381c(c8654Zu0);
            throw e;
        }
    }

    @Keep
    public static Object instrument(Object obj) throws IOException {
        return obj instanceof HttpsURLConnection ? new V80((HttpsURLConnection) obj, new C7731Ia1(), new C8654Zu0(C8619Zc1.f15028s)) : obj instanceof HttpURLConnection ? new U80((HttpURLConnection) obj, new C7731Ia1(), new C8654Zu0(C8619Zc1.f15028s)) : obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v10 */
    /* JADX WARN: Type inference failed for: r6v11 */
    /* JADX WARN: Type inference failed for: r6v5, types: [java.io.InputStream] */
    /* JADX WARN: Type inference failed for: r6v9 */
    @Keep
    public static InputStream openStream(URL url) throws IOException {
        C8619Zc1 c8619Zc1 = C8619Zc1.f15028s;
        C7731Ia1 c7731Ia1 = new C7731Ia1();
        if (!c8619Zc1.f15031c.get()) {
            return url.openConnection().getInputStream();
        }
        c7731Ia1.m3949d();
        long j = c7731Ia1.f5021a;
        C8654Zu0 c8654Zu0 = new C8654Zu0(c8619Zc1);
        try {
            URLConnection uRLConnectionOpenConnection = url.openConnection();
            url = uRLConnectionOpenConnection instanceof HttpsURLConnection ? new V80((HttpsURLConnection) uRLConnectionOpenConnection, c7731Ia1, c8654Zu0).f12387a.m8679e() : uRLConnectionOpenConnection instanceof HttpURLConnection ? new U80((HttpURLConnection) uRLConnectionOpenConnection, c7731Ia1, c8654Zu0).f11662a.m8679e() : uRLConnectionOpenConnection.getInputStream();
            return url;
        } catch (IOException e) {
            c8654Zu0.m9632g(j);
            c8654Zu0.m9635j(c7731Ia1.m3946a());
            c8654Zu0.m9636k(url.toString());
            AbstractC8784av0.m10381c(c8654Zu0);
            throw e;
        }
    }

    @Keep
    public static Object getContent(URL url, Class[] clsArr) throws IOException {
        C8619Zc1 c8619Zc1 = C8619Zc1.f15028s;
        C7731Ia1 c7731Ia1 = new C7731Ia1();
        c7731Ia1.m3949d();
        long j = c7731Ia1.f5021a;
        C8654Zu0 c8654Zu0 = new C8654Zu0(c8619Zc1);
        try {
            URLConnection uRLConnectionOpenConnection = url.openConnection();
            if (uRLConnectionOpenConnection instanceof HttpsURLConnection) {
                return new V80((HttpsURLConnection) uRLConnectionOpenConnection, c7731Ia1, c8654Zu0).f12387a.m8677c(clsArr);
            }
            if (uRLConnectionOpenConnection instanceof HttpURLConnection) {
                return new U80((HttpURLConnection) uRLConnectionOpenConnection, c7731Ia1, c8654Zu0).f11662a.m8677c(clsArr);
            }
            return uRLConnectionOpenConnection.getContent(clsArr);
        } catch (IOException e) {
            c8654Zu0.m9632g(j);
            c8654Zu0.m9635j(c7731Ia1.m3946a());
            c8654Zu0.m9636k(url.toString());
            AbstractC8784av0.m10381c(c8654Zu0);
            throw e;
        }
    }
}
