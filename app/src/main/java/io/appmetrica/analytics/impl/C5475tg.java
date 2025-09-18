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

/* renamed from: io.appmetrica.analytics.impl.tg */
/* loaded from: classes2.dex */
public final class C5475tg implements IParamsAppender {

    /* renamed from: a */
    public final AdvIdWithLimitedAppender f32640a;

    /* renamed from: b */
    public final NetworkTaskForSendingDataParamsAppender f32641b;

    /* renamed from: c */
    public C5291m7 f32642c;

    /* renamed from: d */
    public long f32643d;

    public C5475tg(RequestBodyEncrypter requestBodyEncrypter) {
        this(new AdvIdWithLimitedAppender(), new NetworkTaskForSendingDataParamsAppender(requestBodyEncrypter));
    }

    /* renamed from: a */
    public final void m21086a(C5291m7 c5291m7) {
        this.f32642c = c5291m7;
    }

    public C5475tg(AdvIdWithLimitedAppender advIdWithLimitedAppender, NetworkTaskForSendingDataParamsAppender networkTaskForSendingDataParamsAppender) {
        this.f32640a = advIdWithLimitedAppender;
        this.f32641b = networkTaskForSendingDataParamsAppender;
    }

    /* renamed from: a */
    public final void m21084a(long j) {
        this.f32643d = j;
    }

    @Override // io.appmetrica.analytics.networktasks.internal.IParamsAppender
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final void appendParams(Uri.Builder builder, C4473Eg c4473Eg) {
        builder.path("report");
        this.f32641b.appendEncryptedData(builder);
        C5291m7 c5291m7 = this.f32642c;
        if (c5291m7 != null) {
            builder.appendQueryParameter(CommonUrlParts.DEVICE_ID, StringUtils.ifIsEmptyToDef(c5291m7.f32173a, c4473Eg.getDeviceId()));
            builder.appendQueryParameter(CommonUrlParts.UUID, StringUtils.ifIsEmptyToDef(this.f32642c.f32174b, c4473Eg.getUuid()));
            m21083a(builder, CommonUrlParts.ANALYTICS_SDK_VERSION_NAME, this.f32642c.f32175c);
            builder.appendQueryParameter(CommonUrlParts.APP_VERSION, StringUtils.ifIsEmptyToDef(this.f32642c.f32178f, c4473Eg.getAppVersion()));
            builder.appendQueryParameter(CommonUrlParts.APP_VERSION_CODE, StringUtils.ifIsEmptyToDef(this.f32642c.f32180h, c4473Eg.getAppBuildNumber()));
            builder.appendQueryParameter("os_version", StringUtils.ifIsEmptyToDef(this.f32642c.f32181i, c4473Eg.getOsVersion()));
            m21083a(builder, CommonUrlParts.OS_API_LEVEL, this.f32642c.f32182j);
            m21083a(builder, CommonUrlParts.ANALYTICS_SDK_BUILD_NUMBER, this.f32642c.f32176d);
            m21083a(builder, CommonUrlParts.ANALYTICS_SDK_BUILD_TYPE, this.f32642c.f32177e);
            m21083a(builder, "app_debuggable", this.f32642c.f32179g);
            builder.appendQueryParameter(CommonUrlParts.LOCALE, StringUtils.ifIsEmptyToDef(this.f32642c.f32183k, c4473Eg.getLocale()));
            builder.appendQueryParameter(CommonUrlParts.ROOT_STATUS, StringUtils.ifIsEmptyToDef(this.f32642c.f32184l, c4473Eg.getDeviceRootStatus()));
            builder.appendQueryParameter(CommonUrlParts.APP_FRAMEWORK, StringUtils.ifIsEmptyToDef(this.f32642c.f32185m, c4473Eg.getAppFramework()));
            m21083a(builder, "attribution_id", this.f32642c.f32186n);
        }
        builder.appendQueryParameter("api_key_128", c4473Eg.f30090n);
        builder.appendQueryParameter("app_id", c4473Eg.getPackageName());
        builder.appendQueryParameter(CommonUrlParts.APP_PLATFORM, c4473Eg.getAppPlatform());
        builder.appendQueryParameter(CommonUrlParts.MODEL, c4473Eg.getModel());
        builder.appendQueryParameter("manufacturer", c4473Eg.getManufacturer());
        builder.appendQueryParameter(CommonUrlParts.SCREEN_WIDTH, String.valueOf(c4473Eg.getScreenWidth()));
        builder.appendQueryParameter(CommonUrlParts.SCREEN_HEIGHT, String.valueOf(c4473Eg.getScreenHeight()));
        builder.appendQueryParameter(CommonUrlParts.SCREEN_DPI, String.valueOf(c4473Eg.getScreenDpi()));
        builder.appendQueryParameter(CommonUrlParts.SCALE_FACTOR, String.valueOf(c4473Eg.getScaleFactor()));
        builder.appendQueryParameter(CommonUrlParts.DEVICE_TYPE, c4473Eg.getDeviceType());
        m21083a(builder, "clids_set", (String) WrapUtils.getOrDefault(c4473Eg.f30093q, ""));
        builder.appendQueryParameter(CommonUrlParts.APP_SET_ID, c4473Eg.getAppSetId());
        builder.appendQueryParameter(CommonUrlParts.APP_SET_ID_SCOPE, c4473Eg.getAppSetIdScope());
        this.f32640a.appendParams(builder, c4473Eg.getAdvertisingIdsHolder());
        builder.appendQueryParameter(CommonUrlParts.REQUEST_ID, String.valueOf(this.f32643d));
    }

    /* renamed from: a */
    public static void m21083a(Uri.Builder builder, String str, String str2) {
        if (TextUtils.isEmpty(str2)) {
            return;
        }
        builder.appendQueryParameter(str, str2);
    }
}
