package ru.ok.tracer.lite.upload;

import android.app.ActivityManager;
import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.os.Build;
import android.provider.Settings;
import android.text.TextUtils;
import com.huawei.hms.rn.push.constants.NotificationConstants;
import defpackage.AbstractC7538v51;
import defpackage.O90;
import io.appmetrica.analytics.networktasks.internal.CommonUrlParts;
import java.io.File;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import ru.ok.tracer.base.builduuid.BuildUuidUtils;
import ru.ok.tracer.base.compat.PackageInfoCompat;
import ru.ok.tracer.base.compat.PackageManagerCompat;
import ru.ok.tracer.base.datetime.DateTimeUtils;
import ru.ok.tracer.base.deviceid.DeviceIdUtils;
import ru.ok.tracer.base.sessionuuuid.SessionUuidUtils;
import ru.ok.tracer.lite.TracerLibraryInfo;

@Metadata(d1 = {"\u00006\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\u001a@\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t2\u0010\b\u0002\u0010\n\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\u000b\u001a\u0014\u0010\f\u001a\u0004\u0018\u00010\u00012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0002\u001a\u001c\u0010\r\u001a\u00020\u00012\b\u0010\u0006\u001a\u0004\u0018\u00010\u00072\b\u0010\b\u001a\u0004\u0018\u00010\tH\u0002\u001a\u001a\u0010\u000e\u001a\u0004\u0018\u00010\u000f2\u000e\u0010\n\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\u000bH\u0002\u001a\u0010\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0002\u001a\u00020\u0003H\u0002\u001a\b\u0010\u0012\u001a\u00020\u0011H\u0002\u001a\u0010\u0010\u0013\u001a\u00020\u00112\u0006\u0010\u0002\u001a\u00020\u0003H\u0002¨\u0006\u0014"}, d2 = {"composeLibUploadBean", "Lorg/json/JSONObject;", "context", "Landroid/content/Context;", "libraryInfo", "Lru/ok/tracer/lite/TracerLibraryInfo;", NotificationConstants.DATE, "Ljava/util/Date;", "issueKey", "", "tags", "", "composeLibraryInfoJsonObject", "composeProperties", "composeTags", "Lorg/json/JSONArray;", "isEmulator", "", "isInForeground", "isRooted", "tracer-lite-commons_release"}, k = 2, mv = {1, 7, 1}, xi = 48)
/* loaded from: classes2.dex */
public final class UploadBeanUtilsLite {
    public static final JSONObject composeLibUploadBean(Context context, TracerLibraryInfo tracerLibraryInfo, Date date, String str, List<String> list) throws JSONException, Resources.NotFoundException, PackageManager.NameNotFoundException {
        O90.f(context, "context");
        O90.f(tracerLibraryInfo, "libraryInfo");
        PackageManager packageManager = context.getPackageManager();
        O90.e(packageManager, "context.packageManager");
        String packageName = context.getPackageName();
        O90.e(packageName, "context.packageName");
        PackageInfo packageInfoCompat = PackageManagerCompat.getPackageInfoCompat(packageManager, packageName, 0);
        String hostBuildUuid = BuildUuidUtils.getHostBuildUuid(context);
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("packageName", packageInfoCompat.packageName);
        jSONObject.put("versionName", packageInfoCompat.versionName);
        jSONObject.put("versionCode", PackageInfoCompat.getLongVersionCodeCompat(packageInfoCompat));
        jSONObject.put("buildUuid", hostBuildUuid);
        jSONObject.put("sessionUuid", SessionUuidUtils.getCurrentSessionUuid());
        jSONObject.put("device", Build.MODEL);
        jSONObject.put("deviceId", DeviceIdUtils.getDeviceId(context));
        jSONObject.put("vendor", Build.MANUFACTURER);
        jSONObject.put("osVersion", String.valueOf(Build.VERSION.SDK_INT));
        jSONObject.put("inBackground", !isInForeground());
        jSONObject.put("isRooted", isRooted(context));
        jSONObject.put("properties", composeProperties(date, str));
        jSONObject.put("tags", composeTags(list));
        jSONObject.put("libraryInfo", composeLibraryInfoJsonObject(tracerLibraryInfo));
        return jSONObject;
    }

    public static /* synthetic */ JSONObject composeLibUploadBean$default(Context context, TracerLibraryInfo tracerLibraryInfo, Date date, String str, List list, int i, Object obj) {
        if ((i & 4) != 0) {
            date = null;
        }
        if ((i & 8) != 0) {
            str = null;
        }
        if ((i & 16) != 0) {
            list = null;
        }
        return composeLibUploadBean(context, tracerLibraryInfo, date, str, list);
    }

    private static final JSONObject composeLibraryInfoJsonObject(TracerLibraryInfo tracerLibraryInfo) throws JSONException {
        if (tracerLibraryInfo == null) {
            return null;
        }
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("packageName", tracerLibraryInfo.getPackageName());
        jSONObject.put("versionName", tracerLibraryInfo.getVersionName());
        jSONObject.put("buildUuid", tracerLibraryInfo.getBuildUuid());
        return jSONObject;
    }

    private static final JSONObject composeProperties(Date date, String str) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        if (date != null) {
            jSONObject.put(NotificationConstants.DATE, DateTimeUtils.formatISO8601(date));
        }
        jSONObject.put("board", Build.BOARD);
        jSONObject.put("brand", Build.BRAND);
        jSONObject.put("cpuABI", TextUtils.join(", ", Build.SUPPORTED_ABIS));
        jSONObject.put("device", Build.DEVICE);
        jSONObject.put("manufacturer", Build.MANUFACTURER);
        jSONObject.put(CommonUrlParts.MODEL, Build.MODEL);
        jSONObject.put("cpuCount", String.valueOf(Runtime.getRuntime().availableProcessors()));
        jSONObject.put("osVersionSdkInt", String.valueOf(Build.VERSION.SDK_INT));
        jSONObject.put("osVersionRelease", Build.VERSION.RELEASE);
        if (str != null) {
            jSONObject.put("issueKey", str);
        }
        return jSONObject;
    }

    private static final JSONArray composeTags(List<String> list) {
        if (list == null) {
            return null;
        }
        JSONArray jSONArray = new JSONArray();
        Iterator<String> it = list.iterator();
        while (it.hasNext()) {
            jSONArray.put(it.next());
        }
        return jSONArray;
    }

    private static final boolean isEmulator(Context context) {
        String string = Settings.Secure.getString(context.getContentResolver(), "android_id");
        String str = Build.PRODUCT;
        return "sdk".equals(str) || "google_sdk".equals(str) || string == null;
    }

    private static final boolean isInForeground() {
        ActivityManager.RunningAppProcessInfo runningAppProcessInfo = new ActivityManager.RunningAppProcessInfo();
        ActivityManager.getMyMemoryState(runningAppProcessInfo);
        int i = runningAppProcessInfo.importance;
        return i == 100 || i == 200;
    }

    private static final boolean isRooted(Context context) {
        boolean zIsEmulator = isEmulator(context);
        String str = Build.TAGS;
        if ((zIsEmulator || str == null || !AbstractC7538v51.p(str, "test-keys", false)) && !new File("/system/app/Superuser.apk").exists()) {
            File file = new File("/system/xbin/su");
            if (zIsEmulator || !file.exists()) {
                return false;
            }
        }
        return true;
    }
}
