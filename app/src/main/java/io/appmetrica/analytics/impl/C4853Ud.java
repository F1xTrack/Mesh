package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreutils.internal.AndroidUtils;

/* renamed from: io.appmetrica.analytics.impl.Ud */
/* loaded from: classes2.dex */
public final class C4853Ud extends C5346oc {
    public C4853Ud() {
        super(EnumC4925Xd.UNDEFINED);
        m20863a(1, EnumC4925Xd.WIFI);
        m20863a(0, EnumC4925Xd.CELL);
        m20863a(3, EnumC4925Xd.ETHERNET);
        m20863a(2, EnumC4925Xd.BLUETOOTH);
        m20863a(4, EnumC4925Xd.VPN);
        if (AndroidUtils.isApiAchieved(27)) {
            m20863a(6, EnumC4925Xd.LOWPAN);
        }
        if (AndroidUtils.isApiAchieved(26)) {
            m20863a(5, EnumC4925Xd.WIFI_AWARE);
        }
    }
}
