package ru.ok.tracer.base.useragent;

import defpackage.O90;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\u001a \u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u0001H\u0000\u001a\u0018\u0010\u0005\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u0001H\u0000\u001a\n\u0010\u0006\u001a\u0004\u0018\u00010\u0001H\u0002¨\u0006\u0007"}, d2 = {"createTracerLiteUserAgentString", "", "applicationId", "libraryPackageName", "tracerSdkVersion", "createTracerUserAgentString", "getSystemUserAgentString", "tracer-base_release"}, k = 2, mv = {1, 7, 1}, xi = 48)
/* loaded from: classes2.dex */
public final class UserAgentUtils {
    public static final String createTracerLiteUserAgentString(String str, String str2, String str3) {
        O90.f(str, "applicationId");
        O90.f(str2, "libraryPackageName");
        O90.f(str3, "tracerSdkVersion");
        String str4 = "TracerSDK/" + str3 + " Lib/" + str2 + " App/" + str + " " + getSystemUserAgentString();
        O90.e(str4, "StringBuilder().apply(builderAction).toString()");
        return str4;
    }

    public static final String createTracerUserAgentString(String str, String str2) {
        O90.f(str, "applicationId");
        O90.f(str2, "tracerSdkVersion");
        String str3 = "TracerSDK/" + str2 + " App/" + str + " " + getSystemUserAgentString();
        O90.e(str3, "StringBuilder().apply(builderAction).toString()");
        return str3;
    }

    private static final String getSystemUserAgentString() {
        String property = System.getProperty("http.agent");
        return property != null ? property : "Dalvik/Unknown (Linux; U; Android Unknown; Device Unknown Build/Unknown)";
    }
}
