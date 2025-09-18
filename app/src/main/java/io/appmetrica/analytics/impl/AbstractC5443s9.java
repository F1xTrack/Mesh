package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreutils.internal.collection.CollectionUtils;
import java.util.Arrays;
import java.util.EnumSet;
import java.util.List;
import java.util.Set;

/* renamed from: io.appmetrica.analytics.impl.s9 */
/* loaded from: classes2.dex */
public abstract class AbstractC5443s9 {

    /* renamed from: a */
    public static final Set f32553a;

    /* renamed from: b */
    public static final EnumSet f32554b;

    /* renamed from: c */
    public static final EnumSet f32555c;

    /* renamed from: d */
    public static final EnumSet f32556d;

    /* renamed from: e */
    public static final EnumSet f32557e;

    /* renamed from: f */
    public static final EnumSet f32558f;

    /* renamed from: g */
    public static final EnumSet f32559g;

    /* renamed from: h */
    public static final EnumSet f32560h;

    /* renamed from: i */
    public static final List f32561i;

    /* renamed from: j */
    public static final List f32562j;

    static {
        EnumC4898Wa enumC4898Wa = EnumC4898Wa.EVENT_TYPE_EXCEPTION_UNHANDLED_FROM_FILE;
        f32553a = CollectionUtils.unmodifiableSetOf(5892, 5896, 5891, 5889, 5890, 5968);
        EnumC4898Wa enumC4898Wa2 = EnumC4898Wa.EVENT_TYPE_UNDEFINED;
        EnumC4898Wa enumC4898Wa3 = EnumC4898Wa.EVENT_TYPE_PURGE_BUFFER;
        EnumC4898Wa enumC4898Wa4 = EnumC4898Wa.EVENT_TYPE_SEND_REFERRER;
        EnumC4898Wa enumC4898Wa5 = EnumC4898Wa.EVENT_TYPE_APP_ENVIRONMENT_UPDATED;
        EnumC4898Wa enumC4898Wa6 = EnumC4898Wa.EVENT_TYPE_APP_ENVIRONMENT_CLEARED;
        EnumC4898Wa enumC4898Wa7 = EnumC4898Wa.EVENT_TYPE_PREV_SESSION_NATIVE_CRASH_PROTOBUF;
        EnumC4898Wa enumC4898Wa8 = EnumC4898Wa.EVENT_TYPE_SET_SESSION_EXTRA;
        f32554b = EnumSet.of(enumC4898Wa2, enumC4898Wa3, enumC4898Wa4, enumC4898Wa5, enumC4898Wa6, EnumC4898Wa.EVENT_TYPE_ACTIVATION, enumC4898Wa7, enumC4898Wa8);
        f32555c = EnumSet.of(EnumC4898Wa.EVENT_TYPE_UPDATE_FOREGROUND_TIME, enumC4898Wa);
        EnumC4898Wa enumC4898Wa9 = EnumC4898Wa.EVENT_TYPE_REGULAR;
        f32556d = EnumSet.of(enumC4898Wa, EnumC4898Wa.EVENT_TYPE_EXCEPTION_UNHANDLED_FROM_INTENT, EnumC4898Wa.EVENT_TYPE_EXCEPTION_UNHANDLED_PROTOBUF, EnumC4898Wa.EVENT_TYPE_EXCEPTION_USER_PROTOBUF, EnumC4898Wa.EVENT_TYPE_EXCEPTION_USER_CUSTOM_PROTOBUF, EnumC4898Wa.EVENT_TYPE_CURRENT_SESSION_NATIVE_CRASH_PROTOBUF, enumC4898Wa7, enumC4898Wa9, EnumC4898Wa.EVENT_CLIENT_EXTERNAL_ATTRIBUTION, EnumC4898Wa.EVENT_TYPE_SEND_ECOMMERCE_EVENT, EnumC4898Wa.EVENT_TYPE_SEND_REVENUE_EVENT, EnumC4898Wa.EVENT_TYPE_SEND_AD_REVENUE_EVENT, enumC4898Wa3, EnumC4898Wa.EVENT_TYPE_INIT, EnumC4898Wa.EVENT_TYPE_SEND_USER_PROFILE, EnumC4898Wa.EVENT_TYPE_SET_USER_PROFILE_ID, enumC4898Wa4, enumC4898Wa5, enumC4898Wa6, EnumC4898Wa.EVENT_TYPE_FIRST_ACTIVATION, EnumC4898Wa.EVENT_TYPE_START, EnumC4898Wa.EVENT_TYPE_APP_OPEN, EnumC4898Wa.EVENT_TYPE_APP_UPDATE, EnumC4898Wa.EVENT_TYPE_ANR);
        f32557e = EnumSet.of(enumC4898Wa9);
        f32558f = EnumSet.of(enumC4898Wa9);
        f32559g = EnumSet.of(enumC4898Wa7);
        f32560h = EnumSet.of(EnumC4898Wa.EVENT_TYPE_ALIVE, enumC4898Wa3, enumC4898Wa8);
        f32561i = Arrays.asList(0, 6145, 4097, 8224);
        f32562j = Arrays.asList(12290);
    }
}
