package ru.p031ok.tracer.base.builduuid;

import android.content.Context;
import android.content.res.Resources;
import kotlin.Metadata;
import p000.O90;
import ru.p031ok.tracer.base.apptoken.AppTokenUtils;
import ru.p031ok.tracer.base.deviceid.DeviceIdUtils;
import ru.p031ok.tracer.base.manifest.TracerManifestUtils;
import ru.p031ok.tracer.manifest.TracerManifest;

@Metadata(m22266d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u0012\u0010\u0002\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u0003\u001a\u00020\u0004H\u0007\u001a\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u0003\u001a\u00020\u0004\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0006"}, m22267d2 = {"RESOURCE_NAME_MAPPING_UUID", "", "getBuildUuid", "context", "Landroid/content/Context;", "getHostBuildUuid", "tracer-base_release"}, m22268k = 2, m22269mv = {1, 7, 1}, m22271xi = 48)
/* loaded from: classes2.dex */
public final class BuildUuidUtils {
    private static final String RESOURCE_NAME_MAPPING_UUID = "tracer_mapping_uuid";

    public static final String getBuildUuid(Context context) throws Resources.NotFoundException {
        O90.m5968f(context, "context");
        String stringOrNull$default = AppTokenUtils.getStringOrNull$default(context, RESOURCE_NAME_MAPPING_UUID, null, 2, null);
        if (stringOrNull$default == null) {
            throw new IllegalStateException("Could not find build UUID. Is Tracer plugin configured properly?");
        }
        if (stringOrNull$default.equals(DeviceIdUtils.NULL_UUID)) {
            return null;
        }
        return stringOrNull$default;
    }

    public static final String getHostBuildUuid(Context context) throws Resources.NotFoundException {
        O90.m5968f(context, "context");
        String packageName = context.getPackageName();
        O90.m5967e(packageName, "context.packageName");
        TracerManifest tracerManifestFindTracerManifest = TracerManifestUtils.findTracerManifest(packageName);
        if (tracerManifestFindTracerManifest != null) {
            return tracerManifestFindTracerManifest.buildUuid();
        }
        String stringOrNull$default = AppTokenUtils.getStringOrNull$default(context, RESOURCE_NAME_MAPPING_UUID, null, 2, null);
        if (stringOrNull$default == null || stringOrNull$default.equals(DeviceIdUtils.NULL_UUID)) {
            return null;
        }
        return stringOrNull$default;
    }
}
