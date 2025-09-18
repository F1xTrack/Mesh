package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreutils.internal.collection.CollectionUtils;
import java.util.Arrays;
import java.util.EnumSet;
import java.util.List;
import java.util.Set;

/* renamed from: io.appmetrica.analytics.impl.s9, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC4857s9 {
    public static final Set a;
    public static final EnumSet b;
    public static final EnumSet c;
    public static final EnumSet d;
    public static final EnumSet e;
    public static final EnumSet f;
    public static final EnumSet g;
    public static final EnumSet h;
    public static final List i;
    public static final List j;

    static {
        Wa wa = Wa.EVENT_TYPE_EXCEPTION_UNHANDLED_FROM_FILE;
        a = CollectionUtils.unmodifiableSetOf(5892, 5896, 5891, 5889, 5890, 5968);
        Wa wa2 = Wa.EVENT_TYPE_UNDEFINED;
        Wa wa3 = Wa.EVENT_TYPE_PURGE_BUFFER;
        Wa wa4 = Wa.EVENT_TYPE_SEND_REFERRER;
        Wa wa5 = Wa.EVENT_TYPE_APP_ENVIRONMENT_UPDATED;
        Wa wa6 = Wa.EVENT_TYPE_APP_ENVIRONMENT_CLEARED;
        Wa wa7 = Wa.EVENT_TYPE_PREV_SESSION_NATIVE_CRASH_PROTOBUF;
        Wa wa8 = Wa.EVENT_TYPE_SET_SESSION_EXTRA;
        b = EnumSet.of(wa2, wa3, wa4, wa5, wa6, Wa.EVENT_TYPE_ACTIVATION, wa7, wa8);
        c = EnumSet.of(Wa.EVENT_TYPE_UPDATE_FOREGROUND_TIME, wa);
        Wa wa9 = Wa.EVENT_TYPE_REGULAR;
        d = EnumSet.of(wa, Wa.EVENT_TYPE_EXCEPTION_UNHANDLED_FROM_INTENT, Wa.EVENT_TYPE_EXCEPTION_UNHANDLED_PROTOBUF, Wa.EVENT_TYPE_EXCEPTION_USER_PROTOBUF, Wa.EVENT_TYPE_EXCEPTION_USER_CUSTOM_PROTOBUF, Wa.EVENT_TYPE_CURRENT_SESSION_NATIVE_CRASH_PROTOBUF, wa7, wa9, Wa.EVENT_CLIENT_EXTERNAL_ATTRIBUTION, Wa.EVENT_TYPE_SEND_ECOMMERCE_EVENT, Wa.EVENT_TYPE_SEND_REVENUE_EVENT, Wa.EVENT_TYPE_SEND_AD_REVENUE_EVENT, wa3, Wa.EVENT_TYPE_INIT, Wa.EVENT_TYPE_SEND_USER_PROFILE, Wa.EVENT_TYPE_SET_USER_PROFILE_ID, wa4, wa5, wa6, Wa.EVENT_TYPE_FIRST_ACTIVATION, Wa.EVENT_TYPE_START, Wa.EVENT_TYPE_APP_OPEN, Wa.EVENT_TYPE_APP_UPDATE, Wa.EVENT_TYPE_ANR);
        e = EnumSet.of(wa9);
        f = EnumSet.of(wa9);
        g = EnumSet.of(wa7);
        h = EnumSet.of(Wa.EVENT_TYPE_ALIVE, wa3, wa8);
        i = Arrays.asList(0, 6145, 4097, 8224);
        j = Arrays.asList(12290);
    }
}
