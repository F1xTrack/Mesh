package io.appmetrica.analytics.impl;

import android.content.Context;
import defpackage.AbstractC7680vr;
import defpackage.D51;
import defpackage.O90;
import io.appmetrica.analytics.coreapi.internal.identifiers.AdTrackingInfo;
import io.appmetrica.analytics.coreapi.internal.identifiers.AdTrackingInfoResult;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Locale;
import java.util.UUID;
import ru.ok.tracer.base.deviceid.DeviceIdUtils;

/* loaded from: classes2.dex */
public final class K7 {
    public final Context a;
    public final S b;
    public final C4441b2 c;

    public K7(Context context, S s, C4441b2 c4441b2) {
        this.a = context;
        this.b = s;
        this.c = c4441b2;
    }

    public final String a() {
        byte[] bArrDigest;
        AdTrackingInfoResult yandex = this.b.a(this.a, new Fm(5, 500)).getYandex();
        if (!yandex.isValid()) {
            String id = this.c.getAppSetId().getId();
            if (id != null && id.length() != 0) {
                try {
                    UUID.fromString(id);
                    if (!id.equals(DeviceIdUtils.NULL_UUID)) {
                        return D51.m(id, "-", "");
                    }
                } catch (Throwable unused) {
                }
            }
            return D51.m(UUID.randomUUID().toString(), "-", "").toLowerCase(Locale.US);
        }
        AdTrackingInfo adTrackingInfo = yandex.mAdTrackingInfo;
        O90.c(adTrackingInfo);
        String str = adTrackingInfo.advId;
        O90.c(str);
        try {
            bArrDigest = MessageDigest.getInstance("MD5").digest(str.getBytes(AbstractC7680vr.a));
        } catch (NoSuchAlgorithmException unused2) {
            bArrDigest = new byte[0];
        }
        return StringUtils.toHexString(bArrDigest);
    }

    public K7(Context context) {
        this(context, C4667ka.h().v(), C4667ka.h().b());
    }
}
