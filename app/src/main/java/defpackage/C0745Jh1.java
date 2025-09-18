package defpackage;

import com.google.firebase.perf.network.FirebasePerfUrlConnection;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.URL;
import java.net.URLConnection;
import java.util.Map;
import javax.net.ssl.HttpsURLConnection;
import javax.net.ssl.SSLSocketFactory;
import org.json.JSONObject;

/* renamed from: Jh1 */
/* loaded from: classes2.dex */
public final class C0745Jh1 {
    public final C1241Pr0 a;

    public C0745Jh1(OL0 ol0, C1241Pr0 c1241Pr0) {
        this.a = c1241Pr0;
    }

    public final A12 a(C6140nm1 c6140nm1) throws Throwable {
        HttpsURLConnection httpsURLConnection = null;
        C7315tw1 c7315tw1 = c6140nm1 != null ? c6140nm1.b : null;
        String str = c6140nm1 != null ? c6140nm1.c : null;
        C1241Pr0 c1241Pr0 = this.a;
        F71 f71 = (F71) c1241Pr0.f;
        try {
            URLConnection uRLConnection = (URLConnection) FirebasePerfUrlConnection.instrument(((URL) f71.getValue()).openConnection());
            O90.d(uRLConnection, "null cannot be cast to non-null type javax.net.ssl.HttpsURLConnection");
            HttpsURLConnection httpsURLConnection2 = (HttpsURLConnection) uRLConnection;
            httpsURLConnection2.setHostnameVerifier(new C1002Mp1((URL) f71.getValue(), 0));
            httpsURLConnection2.setRequestMethod("POST");
            httpsURLConnection2.setRequestProperty("content-type", "application/json");
            httpsURLConnection2.setConnectTimeout(20000);
            httpsURLConnection2.setReadTimeout(20000);
            httpsURLConnection2.setSSLSocketFactory((SSLSocketFactory) c1241Pr0.e);
            httpsURLConnection2.setDoOutput(true);
            OutputStream outputStream = httpsURLConnection2.getOutputStream();
            try {
                byte[] bytes = c1241Pr0.d(c7315tw1, str).getBytes(AbstractC7680vr.a);
                O90.e(bytes, "this as java.lang.String).getBytes(charset)");
                outputStream.write(bytes);
                outputStream.flush();
                AbstractC2141aT1.a(outputStream, null);
                try {
                    URL url = httpsURLConnection2.getURL();
                    int responseCode = httpsURLConnection2.getResponseCode();
                    InputStreamReader inputStreamReader = new InputStreamReader(httpsURLConnection2.getInputStream());
                    try {
                        String strD = AbstractC7803wU1.d(inputStreamReader);
                        AbstractC2141aT1.a(inputStreamReader, null);
                        O90.e(url, "requestUrl");
                        httpsURLConnection2.disconnect();
                        if (responseCode != 200) {
                            if (responseCode == 304 && c6140nm1 != null) {
                                return new C4048gt1(c6140nm1);
                            }
                            throw new BQ0(responseCode, "response with error from " + url);
                        }
                        JSONObject jSONObject = new JSONObject(strD);
                        JSONObject jSONObject2 = jSONObject.getJSONObject("config");
                        O90.e(jSONObject2, "jsonObject.getJSONObject(CONFIG_KEY)");
                        Map mapA = AbstractC7592vN1.a(jSONObject2);
                        String strOptString = jSONObject.optString("short_segments");
                        if (strOptString == null) {
                            strOptString = "";
                        }
                        long j = jSONObject.getLong("config_v");
                        String string = jSONObject.getString("cond_s");
                        O90.e(string, "jsonObject.getString(HASH_KEY)");
                        return new C5206it1(new C6140nm1(mapA, new C7315tw1(j, string), strOptString));
                    } finally {
                    }
                } catch (Throwable th) {
                    th = th;
                    httpsURLConnection = httpsURLConnection2;
                    if (httpsURLConnection != null) {
                        httpsURLConnection.disconnect();
                    }
                    throw th;
                }
            } finally {
            }
        } catch (Throwable th2) {
            th = th2;
        }
    }
}
