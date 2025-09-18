package io.appmetrica.analytics.impl;

import android.net.Uri;
import android.text.TextUtils;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import io.appmetrica.analytics.coreutils.internal.WrapUtils;
import io.appmetrica.analytics.networktasks.internal.AdvIdWithLimitedAppender;
import io.appmetrica.analytics.networktasks.internal.CommonUrlParts;
import io.appmetrica.analytics.networktasks.internal.IParamsAppender;
import io.appmetrica.analytics.networktasks.internal.NetworkTaskForSendingDataParamsAppender;
import io.appmetrica.analytics.networktasks.internal.RequestBodyEncrypter;

/* renamed from: io.appmetrica.analytics.impl.tg, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C4888tg implements IParamsAppender {
    public final AdvIdWithLimitedAppender a;
    public final NetworkTaskForSendingDataParamsAppender b;
    public C4712m7 c;
    public long d;

    public C4888tg(RequestBodyEncrypter requestBodyEncrypter) {
        this(new AdvIdWithLimitedAppender(), new NetworkTaskForSendingDataParamsAppender(requestBodyEncrypter));
    }

    public final void a(C4712m7 c4712m7) {
        this.c = c4712m7;
    }

    public C4888tg(AdvIdWithLimitedAppender advIdWithLimitedAppender, NetworkTaskForSendingDataParamsAppender networkTaskForSendingDataParamsAppender) {
        this.a = advIdWithLimitedAppender;
        this.b = networkTaskForSendingDataParamsAppender;
    }

    public final void a(long j) {
        this.d = j;
    }

    @Override // io.appmetrica.analytics.networktasks.internal.IParamsAppender
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final void appendParams(Uri.Builder builder, Eg eg) {
        builder.path("report");
        this.b.appendEncryptedData(builder);
        C4712m7 c4712m7 = this.c;
        if (c4712m7 != null) {
            builder.appendQueryParameter(CommonUrlParts.DEVICE_ID, StringUtils.ifIsEmptyToDef(c4712m7.a, eg.getDeviceId()));
            builder.appendQueryParameter(CommonUrlParts.UUID, StringUtils.ifIsEmptyToDef(this.c.b, eg.getUuid()));
            a(builder, CommonUrlParts.ANALYTICS_SDK_VERSION_NAME, this.c.c);
            builder.appendQueryParameter(CommonUrlParts.APP_VERSION, StringUtils.ifIsEmptyToDef(this.c.f, eg.getAppVersion()));
            builder.appendQueryParameter(CommonUrlParts.APP_VERSION_CODE, StringUtils.ifIsEmptyToDef(this.c.h, eg.getAppBuildNumber()));
            builder.appendQueryParameter("os_version", StringUtils.ifIsEmptyToDef(this.c.i, eg.getOsVersion()));
            a(builder, CommonUrlParts.OS_API_LEVEL, this.c.j);
            a(builder, CommonUrlParts.ANALYTICS_SDK_BUILD_NUMBER, this.c.d);
            a(builder, CommonUrlParts.ANALYTICS_SDK_BUILD_TYPE, this.c.e);
            a(builder, "app_debuggable", this.c.g);
            builder.appendQueryParameter(CommonUrlParts.LOCALE, StringUtils.ifIsEmptyToDef(this.c.k, eg.getLocale()));
            builder.appendQueryParameter(CommonUrlParts.ROOT_STATUS, StringUtils.ifIsEmptyToDef(this.c.l, eg.getDeviceRootStatus()));
            builder.appendQueryParameter(CommonUrlParts.APP_FRAMEWORK, StringUtils.ifIsEmptyToDef(this.c.m, eg.getAppFramework()));
            a(builder, "attribution_id", this.c.n);
        }
        builder.appendQueryParameter("api_key_128", eg.n);
        builder.appendQueryParameter("app_id", eg.getPackageName());
        builder.appendQueryParameter(CommonUrlParts.APP_PLATFORM, eg.getAppPlatform());
        builder.appendQueryParameter(CommonUrlParts.MODEL, eg.getModel());
        builder.appendQueryParameter("manufacturer", eg.getManufacturer());
        builder.appendQueryParameter(CommonUrlParts.SCREEN_WIDTH, String.valueOf(eg.getScreenWidth()));
        builder.appendQueryParameter(CommonUrlParts.SCREEN_HEIGHT, String.valueOf(eg.getScreenHeight()));
        builder.appendQueryParameter(CommonUrlParts.SCREEN_DPI, String.valueOf(eg.getScreenDpi()));
        builder.appendQueryParameter(CommonUrlParts.SCALE_FACTOR, String.valueOf(eg.getScaleFactor()));
        builder.appendQueryParameter(CommonUrlParts.DEVICE_TYPE, eg.getDeviceType());
        a(builder, "clids_set", (String) WrapUtils.getOrDefault(eg.q, ""));
        builder.appendQueryParameter(CommonUrlParts.APP_SET_ID, eg.getAppSetId());
        builder.appendQueryParameter(CommonUrlParts.APP_SET_ID_SCOPE, eg.getAppSetIdScope());
        this.a.appendParams(builder, eg.getAdvertisingIdsHolder());
        builder.appendQueryParameter(CommonUrlParts.REQUEST_ID, String.valueOf(this.d));
    }

    public static void a(Uri.Builder builder, String str, String str2) {
        if (TextUtils.isEmpty(str2)) {
            return;
        }
        builder.appendQueryParameter(str, str2);
    }
}
