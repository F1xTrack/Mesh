package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreutils.internal.AndroidUtils;

/* loaded from: classes2.dex */
public final class Ud extends C4765oc {
    public Ud() {
        super(Xd.UNDEFINED);
        a(1, Xd.WIFI);
        a(0, Xd.CELL);
        a(3, Xd.ETHERNET);
        a(2, Xd.BLUETOOTH);
        a(4, Xd.VPN);
        if (AndroidUtils.isApiAchieved(27)) {
            a(6, Xd.LOWPAN);
        }
        if (AndroidUtils.isApiAchieved(26)) {
            a(5, Xd.WIFI_AWARE);
        }
    }
}
