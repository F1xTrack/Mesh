package p000;

import android.text.TextUtils;
import com.huawei.hms.push.AttributionReporter;
import java.util.concurrent.TimeUnit;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: c51, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C8937c51 {

    /* renamed from: d */
    public static final long f17295d = TimeUnit.DAYS.toMillis(7);

    /* renamed from: e */
    public static final /* synthetic */ int f17296e = 0;

    /* renamed from: a */
    public final String f17297a;

    /* renamed from: b */
    public final String f17298b;

    /* renamed from: c */
    public final long f17299c;

    public C8937c51(String str, String str2, long j) {
        this.f17297a = str;
        this.f17298b = str2;
        this.f17299c = j;
    }

    /* renamed from: a */
    public static C8937c51 m10585a(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        if (!str.startsWith("{")) {
            return new C8937c51(str, null, 0L);
        }
        try {
            JSONObject jSONObject = new JSONObject(str);
            return new C8937c51(jSONObject.getString("token"), jSONObject.getString(AttributionReporter.APP_VERSION), jSONObject.getLong("timestamp"));
        } catch (JSONException e) {
            e.toString();
            return null;
        }
    }
}
