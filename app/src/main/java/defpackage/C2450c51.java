package defpackage;

import android.text.TextUtils;
import com.huawei.hms.push.AttributionReporter;
import java.util.concurrent.TimeUnit;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: c51, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2450c51 {
    public static final long d = TimeUnit.DAYS.toMillis(7);
    public static final /* synthetic */ int e = 0;
    public final String a;
    public final String b;
    public final long c;

    public C2450c51(String str, String str2, long j) {
        this.a = str;
        this.b = str2;
        this.c = j;
    }

    public static C2450c51 a(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        if (!str.startsWith("{")) {
            return new C2450c51(str, null, 0L);
        }
        try {
            JSONObject jSONObject = new JSONObject(str);
            return new C2450c51(jSONObject.getString("token"), jSONObject.getString(AttributionReporter.APP_VERSION), jSONObject.getLong("timestamp"));
        } catch (JSONException e2) {
            e2.toString();
            return null;
        }
    }
}
