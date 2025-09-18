package com.google.firebase.remoteconfig.internal;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Build;
import com.huawei.hms.push.AttributionReporter;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.text.SimpleDateFormat;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.Objects;
import java.util.TimeZone;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.json.JSONObject;
import p000.AbstractC7572Ez0;
import p000.C6684qV;
import p000.C6747rV;

/* loaded from: classes.dex */
public class ConfigFetchHttpClient {

    /* renamed from: h */
    public static final Pattern f18520h = Pattern.compile("^[^:]+:([0-9]+):(android|ios|web):([0-9a-f]+)");

    /* renamed from: a */
    public final Context f18521a;

    /* renamed from: b */
    public final String f18522b;

    /* renamed from: c */
    public final String f18523c;

    /* renamed from: d */
    public final String f18524d;

    /* renamed from: e */
    public final String f18525e;

    /* renamed from: f */
    public final long f18526f;

    /* renamed from: g */
    public final long f18527g;

    public ConfigFetchHttpClient(Context context, String str, String str2, String str3, long j, long j2) {
        this.f18521a = context;
        this.f18522b = str;
        this.f18523c = str2;
        Matcher matcher = f18520h.matcher(str);
        this.f18524d = matcher.matches() ? matcher.group(1) : null;
        this.f18525e = str3;
        this.f18526f = j;
        this.f18527g = j2;
    }

    /* renamed from: c */
    public static JSONObject m11344c(HttpURLConnection httpURLConnection) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(httpURLConnection.getInputStream(), "utf-8"));
        StringBuilder sb = new StringBuilder();
        while (true) {
            int i = bufferedReader.read();
            if (i == -1) {
                return new JSONObject(sb.toString());
            }
            sb.append((char) i);
        }
    }

    /* renamed from: d */
    public static void m11345d(HttpURLConnection httpURLConnection, byte[] bArr) throws IOException {
        httpURLConnection.setFixedLengthStreamingMode(bArr.length);
        BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(httpURLConnection.getOutputStream());
        bufferedOutputStream.write(bArr);
        bufferedOutputStream.flush();
        bufferedOutputStream.close();
    }

    /* renamed from: a */
    public final JSONObject m11346a(String str, String str2, Map map, Long l, Map map2) throws C6684qV, PackageManager.NameNotFoundException {
        HashMap map3 = new HashMap();
        if (str == null) {
            throw new C6684qV("Fetch failed: Firebase installation id is null.");
        }
        map3.put("appInstanceId", str);
        map3.put("appInstanceIdToken", str2);
        map3.put("appId", this.f18522b);
        Context context = this.f18521a;
        Locale locale = context.getResources().getConfiguration().locale;
        map3.put("countryCode", locale.getCountry());
        int i = Build.VERSION.SDK_INT;
        map3.put("languageCode", locale.toLanguageTag());
        map3.put("platformVersion", Integer.toString(i));
        map3.put("timeZone", TimeZone.getDefault().getID());
        try {
            PackageInfo packageInfo = context.getPackageManager().getPackageInfo(context.getPackageName(), 0);
            if (packageInfo != null) {
                map3.put(AttributionReporter.APP_VERSION, packageInfo.versionName);
                map3.put("appBuild", Long.toString(i >= 28 ? AbstractC7572Ez0.m2462b(packageInfo) : packageInfo.versionCode));
            }
        } catch (PackageManager.NameNotFoundException unused) {
        }
        map3.put("packageName", context.getPackageName());
        map3.put("sdkVersion", "22.1.0");
        map3.put("analyticsUserProperties", new JSONObject(map));
        if (!map2.isEmpty()) {
            map3.put("customSignals", new JSONObject(map2));
            Objects.toString(map2.keySet());
        }
        if (l != null) {
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSS'Z'", Locale.US);
            simpleDateFormat.setTimeZone(TimeZone.getTimeZone("UTC"));
            map3.put("firstOpenTime", simpleDateFormat.format(l));
        }
        return new JSONObject(map3);
    }

    /* renamed from: b */
    public final HttpURLConnection m11347b() {
        try {
            return (HttpURLConnection) new URL("https://firebaseremoteconfig.googleapis.com/v1/projects/" + this.f18524d + "/namespaces/" + this.f18525e + ":fetch").openConnection();
        } catch (IOException e) {
            throw new C6747rV(e.getMessage());
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x007b A[LOOP:0: B:11:0x0075->B:13:0x007b, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:17:0x00b5 A[Catch: all -> 0x0166, IOException | JSONException -> 0x0168, IOException -> 0x016a, TRY_LEAVE, TryCatch #1 {all -> 0x0166, blocks: (B:15:0x0099, B:17:0x00b5, B:67:0x016c, B:68:0x0175, B:69:0x0176, B:70:0x017d), top: B:82:0x0099 }] */
    /* JADX WARN: Removed duplicated region for block: B:67:0x016c A[Catch: all -> 0x0166, IOException | JSONException -> 0x0168, IOException -> 0x016a, TRY_ENTER, TryCatch #1 {all -> 0x0166, blocks: (B:15:0x0099, B:17:0x00b5, B:67:0x016c, B:68:0x0175, B:69:0x0176, B:70:0x017d), top: B:82:0x0099 }] */
    @androidx.annotation.Keep
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public p000.C0185Cw fetch(java.net.HttpURLConnection r12, java.lang.String r13, java.lang.String r14, java.util.Map<java.lang.String, java.lang.String> r15, java.lang.String r16, java.util.Map<java.lang.String, java.lang.String> r17, java.lang.Long r18, java.util.Date r19, java.util.Map<java.lang.String, java.lang.String> r20) throws p000.C6747rV {
        /*
            Method dump skipped, instructions count: 393
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.remoteconfig.internal.ConfigFetchHttpClient.fetch(java.net.HttpURLConnection, java.lang.String, java.lang.String, java.util.Map, java.lang.String, java.util.Map, java.lang.Long, java.util.Date, java.util.Map):Cw");
    }
}
