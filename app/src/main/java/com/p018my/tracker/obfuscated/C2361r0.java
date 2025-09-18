package com.p018my.tracker.obfuscated;

import android.net.TrafficStats;
import com.google.firebase.perf.network.FirebasePerfUrlConnection;
import com.p018my.tracker.obfuscated.AbstractC2369t0;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;

/* renamed from: com.my.tracker.obfuscated.r0 */
/* loaded from: classes2.dex */
public final class C2361r0 extends AbstractC2369t0 {
    @Override // com.p018my.tracker.obfuscated.AbstractC2369t0
    /* renamed from: a */
    public AbstractC2369t0.b mo13274a(String str) {
        HttpURLConnection httpURLConnection;
        AbstractC2369t0.b bVarM13499d = AbstractC2369t0.b.m13499d();
        HttpURLConnection httpURLConnection2 = null;
        byte b = 0;
        try {
            AbstractC2391y2.m13568a("HttpGetRequest: send request to " + str);
            TrafficStats.setThreadStatsTag(27498374);
            httpURLConnection = (HttpURLConnection) ((URLConnection) FirebasePerfUrlConnection.instrument(new URL(str).openConnection()));
            try {
                httpURLConnection.setConnectTimeout(3000);
                httpURLConnection.setReadTimeout(3000);
                httpURLConnection.setRequestMethod("GET");
                int responseCode = httpURLConnection.getResponseCode();
                AbstractC2391y2.m13568a("HttpGetRequest: response received with response code: " + responseCode);
                bVarM13499d.f20123a = responseCode == 200;
            } catch (Throwable th) {
                th = th;
                httpURLConnection2 = httpURLConnection;
                try {
                    AbstractC2391y2.m13569a("HttpGetRequest: error", th);
                    bVarM13499d.f20123a = false;
                    bVarM13499d.f20125c = "HttpGetRequest: error while sending data";
                    return bVarM13499d;
                } finally {
                    if (httpURLConnection2 != null) {
                        httpURLConnection2.disconnect();
                    }
                }
            }
        } catch (Throwable th2) {
            th = th2;
        }
        try {
            AbstractC2391y2.m13568a("HttpGetRequest: processing server response");
            BufferedReader bufferedReader = bVarM13499d.f20123a ? new BufferedReader(new InputStreamReader(httpURLConnection.getInputStream())) : new BufferedReader(new InputStreamReader(httpURLConnection.getErrorStream()));
            StringBuilder sb = new StringBuilder();
            while (true) {
                String line = bufferedReader.readLine();
                if (line == null) {
                    break;
                }
                sb.append(line);
            }
            if (sb.length() > 0) {
                bVarM13499d.f20124b = sb.toString();
            } else {
                AbstractC2391y2.m13568a("HttpGetRequest: response data is empty");
            }
            bufferedReader.close();
            httpURLConnection.disconnect();
            return bVarM13499d;
        } catch (Throwable th3) {
            if (0 != 0) {
                (b == true ? 1 : 0).close();
            }
            throw th3;
        }
    }
}
