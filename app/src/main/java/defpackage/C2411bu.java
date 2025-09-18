package defpackage;

import android.content.SharedPreferences;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.NoSuchKeyException;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.WritableMap;
import io.appmetrica.analytics.coreutils.internal.StringUtils;

/* renamed from: bu, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2411bu {
    public SharedPreferences a;

    public static String c(ReadableMap readableMap) {
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
        return AbstractC1705Vq.h(string, StringUtils.PROCESS_POSTFIX_DELIMITER, string2);
    }

    public final void a() {
        this.a.edit().remove("CODE_PUSH_RETRY_DEPLOYMENT_REPORT").commit();
    }

    public final WritableMap b(String str) {
        String string = this.a.getString("CODE_PUSH_LAST_DEPLOYMENT_REPORT", null);
        if (string == null) {
            a();
            WritableMap writableMapCreateMap = Arguments.createMap();
            writableMapCreateMap.putString(AttributionReporter.APP_VERSION, str);
            return writableMapCreateMap;
        }
        if (string.equals(str)) {
            return null;
        }
        a();
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

    public final WritableMap d(WritableMap writableMap) {
        String strC = c(writableMap);
        String string = this.a.getString("CODE_PUSH_LAST_DEPLOYMENT_REPORT", null);
        if (strC == null) {
            return null;
        }
        if (string == null) {
            a();
            WritableMap writableMapCreateMap = Arguments.createMap();
            writableMapCreateMap.putMap("package", writableMap);
            writableMapCreateMap.putString("status", "DeploymentSucceeded");
            return writableMapCreateMap;
        }
        if (string.equals(strC)) {
            return null;
        }
        a();
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

    public final void e(ReadableMap readableMap) {
        if (readableMap.hasKey("status") && "DeploymentFailed".equals(readableMap.getString("status"))) {
            return;
        }
        if (readableMap.hasKey(AttributionReporter.APP_VERSION)) {
            this.a.edit().putString("CODE_PUSH_LAST_DEPLOYMENT_REPORT", readableMap.getString(AttributionReporter.APP_VERSION)).commit();
        } else if (readableMap.hasKey("package")) {
            this.a.edit().putString("CODE_PUSH_LAST_DEPLOYMENT_REPORT", c(readableMap.getMap("package"))).commit();
        }
    }
}
