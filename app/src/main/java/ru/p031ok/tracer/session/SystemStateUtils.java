package ru.p031ok.tracer.session;

import android.app.ActivityManager;
import android.content.Context;
import android.os.Build;
import android.provider.Settings;
import java.io.File;
import java.util.ArrayList;
import java.util.Set;
import kotlin.Metadata;
import p000.AbstractC11374v51;
import p000.AbstractC7167xu;
import p000.AbstractC7293zu;
import p000.O90;
import ru.p031ok.tracer.HostedTracerLibraryInfo;
import ru.p031ok.tracer.SystemState;
import ru.p031ok.tracer.Tracer;
import ru.p031ok.tracer.base.deviceid.DeviceIdUtils;
import ru.p031ok.tracer.base.manifest.TracerLiteManifestUtils;
import ru.p031ok.tracer.base.sessionuuuid.SessionUuidUtils;
import ru.p031ok.tracer.manifest.TracerLiteManifest;
import ru.p031ok.tracer.upload.SystemInfoKt;

@Metadata(m22266d1 = {"\u0000 \n\u0000\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\u001a\u000e\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001H\u0002\u001a\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0000\u001a\u0010\u0010\u0007\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u0006H\u0002\u001a\b\u0010\t\u001a\u00020\bH\u0002\u001a\u0010\u0010\n\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u0006H\u0002¨\u0006\u000b"}, m22267d2 = {"collectLibrariesInfo", "", "Lru/ok/tracer/HostedTracerLibraryInfo;", "createSystemState", "Lru/ok/tracer/SystemState;", "context", "Landroid/content/Context;", "isEmulator", "", "isInForeground", "isRooted", "tracer-commons_release"}, m22268k = 2, m22269mv = {1, 7, 1}, m22271xi = 48)
/* loaded from: classes2.dex */
public final class SystemStateUtils {
    private static final Set<HostedTracerLibraryInfo> collectLibrariesInfo() {
        Set<TracerLiteManifest> setFindTracerLiteManifests = TracerLiteManifestUtils.findTracerLiteManifests();
        ArrayList arrayList = new ArrayList(AbstractC7293zu.m26586k(setFindTracerLiteManifests));
        for (TracerLiteManifest tracerLiteManifest : setFindTracerLiteManifests) {
            String strNamespace = tracerLiteManifest.namespace();
            O90.m5967e(strNamespace, "manifest.namespace()");
            String strVersionName = tracerLiteManifest.versionName();
            O90.m5967e(strVersionName, "manifest.versionName()");
            arrayList.add(new HostedTracerLibraryInfo(strNamespace, strVersionName, tracerLiteManifest.buildUuid()));
        }
        return AbstractC7167xu.m25987g0(arrayList);
    }

    public static final SystemState createSystemState(Context context) {
        O90.m5968f(context, "context");
        Tracer tracer = Tracer.INSTANCE;
        String versionName = tracer.getApplicationInfo().getVersionName();
        long longVersionCode = tracer.getApplicationInfo().getLongVersionCode();
        String packageName = tracer.getApplicationInfo().getPackageName();
        String buildUuid = tracer.getApplicationInfo().getBuildUuid();
        String currentSessionUuid = SessionUuidUtils.getCurrentSessionUuid();
        String str = Build.MODEL;
        O90.m5967e(str, "MODEL");
        String deviceId = DeviceIdUtils.getDeviceId(context);
        String str2 = Build.MANUFACTURER;
        O90.m5967e(str2, "MANUFACTURER");
        return new SystemState(versionName, longVersionCode, packageName, buildUuid, currentSessionUuid, str, deviceId, str2, String.valueOf(Build.VERSION.SDK_INT), !isInForeground(), isRooted(context), SystemInfoKt.getSystemProperties(context), collectLibrariesInfo());
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
        if ((zIsEmulator || str == null || !AbstractC11374v51.m25351p(str, "test-keys", false)) && !new File("/system/app/Superuser.apk").exists()) {
            File file = new File("/system/xbin/su");
            if (zIsEmulator || !file.exists()) {
                return false;
            }
        }
        return true;
    }
}
