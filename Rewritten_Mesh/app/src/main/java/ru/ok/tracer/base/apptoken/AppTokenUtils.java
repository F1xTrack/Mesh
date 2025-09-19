package ru.ok.tracer.base.apptoken;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.Resources;
import defpackage.O90;
import java.lang.reflect.InvocationTargetException;
import kotlin.Metadata;
import ru.ok.tracer.Tracer;
import ru.ok.tracer.base.manifest.TracerManifestUtils;
import ru.ok.tracer.manifest.TracerManifest;

@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u0004\u001a\u00020\u0005\u001a\u0010\u0010\u0006\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u0004\u001a\u00020\u0005\u001a \u0010\u0007\u001a\u0004\u0018\u00010\u0001*\u00020\u00052\u0006\u0010\b\u001a\u00020\u00012\b\b\u0002\u0010\t\u001a\u00020\u0001H\u0001\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0002\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000¨\u0006\n"}, d2 = {"NO_APP_TOKEN", "", "RESOURCE_NAME_APP_TOKEN", "getAppToken", "context", "Landroid/content/Context;", "getHostAppToken", "getStringOrNull", "name", "defPackage", "tracer-base_release"}, k = 2, mv = {1, 7, 1}, xi = 48)
/* loaded from: classes2.dex */
public final class AppTokenUtils {
    private static final String NO_APP_TOKEN = "0000000000000000000000000000000000000000000";
    private static final String RESOURCE_NAME_APP_TOKEN = "tracer_app_token";

    public static final String getAppToken(Context context) throws Resources.NotFoundException {
        O90.f(context, "context");
        String stringOrNull$default = getStringOrNull$default(context, RESOURCE_NAME_APP_TOKEN, null, 2, null);
        if (stringOrNull$default == null) {
            throw new IllegalStateException("Could not find Tracer's appToken. Is Tracer plugin configured properly?");
        }
        if (stringOrNull$default.equals(NO_APP_TOKEN)) {
            return null;
        }
        return stringOrNull$default;
    }

    public static final String getHostAppToken(Context context) throws IllegalAccessException, NoSuchFieldException, Resources.NotFoundException, IllegalArgumentException, InvocationTargetException {
        O90.f(context, "context");
        try {
            Tracer tracer = Tracer.INSTANCE;
            Object objInvoke = Tracer.class.getMethod("getAppToken", null).invoke(Tracer.class.getField("INSTANCE").get(null), null);
            O90.d(objInvoke, "null cannot be cast to non-null type kotlin.String");
            return (String) objInvoke;
        } catch (Exception unused) {
            String packageName = context.getPackageName();
            O90.e(packageName, "context.packageName");
            TracerManifest tracerManifestFindTracerManifest = TracerManifestUtils.findTracerManifest(packageName);
            if (tracerManifestFindTracerManifest != null) {
                return tracerManifestFindTracerManifest.appToken();
            }
            String stringOrNull$default = getStringOrNull$default(context, RESOURCE_NAME_APP_TOKEN, null, 2, null);
            if (stringOrNull$default == null || stringOrNull$default.equals(NO_APP_TOKEN)) {
                return null;
            }
            return stringOrNull$default;
        }
    }

    @SuppressLint({"DiscouragedApi"})
    public static final String getStringOrNull(Context context, String str, String str2) throws Resources.NotFoundException {
        O90.f(context, "<this>");
        O90.f(str, "name");
        O90.f(str2, "defPackage");
        Resources resources = context.getResources();
        int identifier = resources.getIdentifier(str, "string", str2);
        if (identifier == 0) {
            return null;
        }
        return resources.getString(identifier);
    }

    public static /* synthetic */ String getStringOrNull$default(Context context, String str, String str2, int i, Object obj) throws Resources.NotFoundException {
        if ((i & 2) != 0) {
            str2 = context.getPackageName();
            O90.e(str2, "packageName");
        }
        return getStringOrNull(context, str, str2);
    }
}
