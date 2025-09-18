package p000;

import android.content.SharedPreferences;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.NoSuchKeyException;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.WritableMap;
import com.huawei.hms.push.AttributionReporter;
import io.appmetrica.analytics.coreutils.internal.StringUtils;

/* renamed from: bu */
/* loaded from: classes2.dex */
public final class C1814bu {

    /* renamed from: a */
    public SharedPreferences f17214a;

    /* renamed from: c */
    public static String m10538c(ReadableMap readableMap) {
        String string;
        String string2;
        try {
            string = readableMap.getString("deploymentKey");
        } catch (NoSuchKeyException unused) {
            string = null;
        }
        try {
            string2 = readableMap.getString("label");
        } catch (NoSuchKeyException unused2) {
            string2 = null;
        }
        if (string == null || string2 == null) {
            return null;
        }
        return AbstractC1374Vq.m8589h(string, StringUtils.PROCESS_POSTFIX_DELIMITER, string2);
    }

    /* renamed from: a */
    public final void m10539a() {
        this.f17214a.edit().remove("CODE_PUSH_RETRY_DEPLOYMENT_REPORT").commit();
    }

    /* renamed from: b */
    public final WritableMap m10540b(String str) {
        String string = this.f17214a.getString("CODE_PUSH_LAST_DEPLOYMENT_REPORT", null);
        if (string == null) {
            m10539a();
            WritableMap writableMapCreateMap = Arguments.createMap();
            writableMapCreateMap.putString(AttributionReporter.APP_VERSION, str);
            return writableMapCreateMap;
        }
        if (string.equals(str)) {
            return null;
        }
        m10539a();
        WritableMap writableMapCreateMap2 = Arguments.createMap();
        if (string.contains(StringUtils.PROCESS_POSTFIX_DELIMITER)) {
            String[] strArrSplit = string.split(StringUtils.PROCESS_POSTFIX_DELIMITER);
            String str2 = strArrSplit.length > 0 ? strArrSplit[0] : null;
            String[] strArrSplit2 = string.split(StringUtils.PROCESS_POSTFIX_DELIMITER);
            String str3 = strArrSplit2.length > 1 ? strArrSplit2[1] : null;
            writableMapCreateMap2.putString(AttributionReporter.APP_VERSION, str);
            writableMapCreateMap2.putString("previousDeploymentKey", str2);
            writableMapCreateMap2.putString("previousLabelOrAppVersion", str3);
        } else {
            writableMapCreateMap2.putString(AttributionReporter.APP_VERSION, str);
            writableMapCreateMap2.putString("previousLabelOrAppVersion", string);
        }
        return writableMapCreateMap2;
    }

    /* renamed from: d */
    public final WritableMap m10541d(WritableMap writableMap) {
        String strM10538c = m10538c(writableMap);
        String string = this.f17214a.getString("CODE_PUSH_LAST_DEPLOYMENT_REPORT", null);
        if (strM10538c == null) {
            return null;
        }
        if (string == null) {
            m10539a();
            WritableMap writableMapCreateMap = Arguments.createMap();
            writableMapCreateMap.putMap("package", writableMap);
            writableMapCreateMap.putString("status", "DeploymentSucceeded");
            return writableMapCreateMap;
        }
        if (string.equals(strM10538c)) {
            return null;
        }
        m10539a();
        WritableMap writableMapCreateMap2 = Arguments.createMap();
        if (string.contains(StringUtils.PROCESS_POSTFIX_DELIMITER)) {
            String[] strArrSplit = string.split(StringUtils.PROCESS_POSTFIX_DELIMITER);
            String str = strArrSplit.length > 0 ? strArrSplit[0] : null;
            String[] strArrSplit2 = string.split(StringUtils.PROCESS_POSTFIX_DELIMITER);
            String str2 = strArrSplit2.length > 1 ? strArrSplit2[1] : null;
            writableMapCreateMap2.putMap("package", writableMap);
            writableMapCreateMap2.putString("status", "DeploymentSucceeded");
            writableMapCreateMap2.putString("previousDeploymentKey", str);
            writableMapCreateMap2.putString("previousLabelOrAppVersion", str2);
        } else {
            writableMapCreateMap2.putMap("package", writableMap);
            writableMapCreateMap2.putString("status", "DeploymentSucceeded");
            writableMapCreateMap2.putString("previousLabelOrAppVersion", string);
        }
        return writableMapCreateMap2;
    }

    /* renamed from: e */
    public final void m10542e(ReadableMap readableMap) {
        if (readableMap.hasKey("status") && "DeploymentFailed".equals(readableMap.getString("status"))) {
            return;
        }
        if (readableMap.hasKey(AttributionReporter.APP_VERSION)) {
            this.f17214a.edit().putString("CODE_PUSH_LAST_DEPLOYMENT_REPORT", readableMap.getString(AttributionReporter.APP_VERSION)).commit();
        } else if (readableMap.hasKey("package")) {
            this.f17214a.edit().putString("CODE_PUSH_LAST_DEPLOYMENT_REPORT", m10538c(readableMap.getMap("package"))).commit();
        }
    }
}
