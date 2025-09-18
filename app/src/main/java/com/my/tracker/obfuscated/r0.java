package com.my.tracker.obfuscated;

import android.net.TrafficStats;
import com.google.firebase.perf.network.FirebasePerfUrlConnection;
import com.my.tracker.obfuscated.t0;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;

/* loaded from: classes2.dex */
public final class r0 extends t0 {
    @Override // com.my.tracker.obfuscated.t0
    public t0.b a(String str) {
        HttpURLConnection httpURLConnection;
        t0.b bVarD = t0.b.d();
        HttpURLConnection httpURLConnection2 = null;
        byte b = 0;
        try {
            y2.a("HttpGetRequest: send request to " + str);
            TrafficStats.setThreadStatsTag(27498374);
            httpURLConnection = (HttpURLConnection) ((URLConnection) FirebasePerfUrlConnection.instrument(new URL(str).openConnection()));
            try {
                httpURLConnection.setConnectTimeout(3000);
                httpURLConnection.setReadTimeout(3000);
                httpURLConnection.setRequestMethod("GET");
                int responseCode = httpURLConnection.getResponseCode();
                y2.a("HttpGetRequest: response received with response code: " + responseCode);
                bVarD.a = responseCode == 200;
            } catch (Throwable th) {
                th = th;
                httpURLConnection2 = httpURLConnection;
                try {
                    y2.a("HttpGetRequest: error", th);
                    bVarD.a = false;
                    bVarD.c = "HttpGetRequest: error while sending data";
                    return bVarD;
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
            y2.a("HttpGetRequest: processing server response");
            BufferedReader bufferedReader = bVarD.a ? new BufferedReader(new InputStreamReader(httpURLConnection.getInputStream())) : new BufferedReader(new InputStreamReader(httpURLConnection.getErrorStream()));
            StringBuilder sb = new StringBuilder();
            while (true) {
                String line = bufferedReader.readLine();
                if (line == null) {
                    break;
                }
                sb.append(line);
            }
            if (sb.length() > 0) {
                bVarD.b = sb.toString();
            } else {
                y2.a("HttpGetRequest: response data is empty");
            }
            bufferedReader.close();
            httpURLConnection.disconnect();
            return bVarD;
        } catch (Throwable th3) {
            if (0 != 0) {
                (b == true ? 1 : 0).close();
            }
            throw th3;
        }
    }
}
