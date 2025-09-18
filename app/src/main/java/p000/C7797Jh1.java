package p000;

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
public final class C7797Jh1 {

    /* renamed from: a */
    public final C8128Pr0 f5674a;

    public C7797Jh1(OL0 ol0, C8128Pr0 c8128Pr0) {
        this.f5674a = c8128Pr0;
    }

    /* renamed from: a */
    public final A12 m4390a(C10436nm1 c10436nm1) throws Throwable {
        HttpsURLConnection httpsURLConnection = null;
        C11224tw1 c11224tw1 = c10436nm1 != null ? c10436nm1.f38504b : null;
        String str = c10436nm1 != null ? c10436nm1.f38505c : null;
        C8128Pr0 c8128Pr0 = this.f5674a;
        F71 f71 = (F71) c8128Pr0.f9308f;
        try {
            URLConnection uRLConnection = (URLConnection) FirebasePerfUrlConnection.instrument(((URL) f71.getValue()).openConnection());
            O90.m5966d(uRLConnection, "null cannot be cast to non-null type javax.net.ssl.HttpsURLConnection");
            HttpsURLConnection httpsURLConnection2 = (HttpsURLConnection) uRLConnection;
            httpsURLConnection2.setHostnameVerifier(new C7969Mp1((URL) f71.getValue(), 0));
            httpsURLConnection2.setRequestMethod("POST");
            httpsURLConnection2.setRequestProperty("content-type", "application/json");
            httpsURLConnection2.setConnectTimeout(20000);
            httpsURLConnection2.setReadTimeout(20000);
            httpsURLConnection2.setSSLSocketFactory((SSLSocketFactory) c8128Pr0.f9307e);
            httpsURLConnection2.setDoOutput(true);
            OutputStream outputStream = httpsURLConnection2.getOutputStream();
            try {
                byte[] bytes = c8128Pr0.m6448d(c11224tw1, str).getBytes(AbstractC7038vr.f44561a);
                O90.m5967e(bytes, "this as java.lang.String).getBytes(charset)");
                outputStream.write(bytes);
                outputStream.flush();
                AbstractC8729aT1.m9749a(outputStream, null);
                try {
                    URL url = httpsURLConnection2.getURL();
                    int responseCode = httpsURLConnection2.getResponseCode();
                    InputStreamReader inputStreamReader = new InputStreamReader(httpsURLConnection2.getInputStream());
                    try {
                        String strM25640d = AbstractC11551wU1.m25640d(inputStreamReader);
                        AbstractC8729aT1.m9749a(inputStreamReader, null);
                        O90.m5967e(url, "requestUrl");
                        httpsURLConnection2.disconnect();
                        if (responseCode != 200) {
                            if (responseCode == 304 && c10436nm1 != null) {
                                return new C9554gt1(c10436nm1);
                            }
                            throw new BQ0(responseCode, "response with error from " + url);
                        }
                        JSONObject jSONObject = new JSONObject(strM25640d);
                        JSONObject jSONObject2 = jSONObject.getJSONObject("config");
                        O90.m5967e(jSONObject2, "jsonObject.getJSONObject(CONFIG_KEY)");
                        Map mapM25406a = AbstractC11410vN1.m25406a(jSONObject2);
                        String strOptString = jSONObject.optString("short_segments");
                        if (strOptString == null) {
                            strOptString = "";
                        }
                        long j = jSONObject.getLong("config_v");
                        String string = jSONObject.getString("cond_s");
                        O90.m5967e(string, "jsonObject.getString(HASH_KEY)");
                        return new C9810it1(new C10436nm1(mapM25406a, new C11224tw1(j, string), strOptString));
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
