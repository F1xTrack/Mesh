package ru.p031ok.tracer.base.http;

import android.content.Context;
import kotlin.Metadata;
import p000.O90;
import ru.p031ok.tracer.base.useragent.UserAgentUtils;

@Metadata(m22266d1 = {"\u0000\u001c\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\u001a\u0018\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0001\u001a \u0010\u0007\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\u0006\u001a\u00020\u0001\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0086T¢\u0006\u0002\n\u0000¨\u0006\n"}, m22267d2 = {"NO_TRAFFIC_STATS_TAG", "", "createTracerHttpClient", "Lru/ok/tracer/base/http/HttpClient;", "context", "Landroid/content/Context;", "trafficStatsTag", "createTracerLiteHttpClient", "libraryPackageName", "", "tracer-base_release"}, m22268k = 2, m22269mv = {1, 7, 1}, m22271xi = 48)
/* loaded from: classes2.dex */
public final class TracerHttpClientKt {
    public static final int NO_TRAFFIC_STATS_TAG = -1;

    public static final HttpClient createTracerHttpClient(Context context, int i) {
        O90.m5968f(context, "context");
        String packageName = context.getPackageName();
        O90.m5967e(packageName, "context.packageName");
        return new HttpUrlConnectionHttpClient(context, UserAgentUtils.createTracerUserAgentString(packageName, "1.0.2"), i, 0, 0, 24, null);
    }

    public static /* synthetic */ HttpClient createTracerHttpClient$default(Context context, int i, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            i = -1;
        }
        return createTracerHttpClient(context, i);
    }

    public static final HttpClient createTracerLiteHttpClient(Context context, String str, int i) {
        O90.m5968f(context, "context");
        O90.m5968f(str, "libraryPackageName");
        String packageName = context.getPackageName();
        O90.m5967e(packageName, "context.packageName");
        return new HttpUrlConnectionHttpClient(context, UserAgentUtils.createTracerLiteUserAgentString(packageName, str, "1.0.2"), i, 0, 0, 24, null);
    }

    public static /* synthetic */ HttpClient createTracerLiteHttpClient$default(Context context, String str, int i, int i2, Object obj) {
        if ((i2 & 4) != 0) {
            i = -1;
        }
        return createTracerLiteHttpClient(context, str, i);
    }
}
