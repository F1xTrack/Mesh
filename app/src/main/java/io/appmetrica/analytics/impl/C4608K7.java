package io.appmetrica.analytics.impl;

import android.content.Context;
import io.appmetrica.analytics.coreapi.internal.identifiers.AdTrackingInfo;
import io.appmetrica.analytics.coreapi.internal.identifiers.AdTrackingInfoResult;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Locale;
import java.util.UUID;
import p000.AbstractC7038vr;
import p000.D51;
import p000.O90;
import ru.p031ok.tracer.base.deviceid.DeviceIdUtils;

/* renamed from: io.appmetrica.analytics.impl.K7 */
/* loaded from: classes2.dex */
public final class C4608K7 {

    /* renamed from: a */
    public final Context f30388a;

    /* renamed from: b */
    public final C4791S f30389b;

    /* renamed from: c */
    public final C5011b2 f30390c;

    public C4608K7(Context context, C4791S c4791s, C5011b2 c5011b2) {
        this.f30388a = context;
        this.f30389b = c4791s;
        this.f30390c = c5011b2;
    }

    /* renamed from: a */
    public final String m19547a() {
        byte[] bArrDigest;
        AdTrackingInfoResult yandex = this.f30389b.mo19792a(this.f30388a, new C4503Fm(5, 500)).getYandex();
        if (!yandex.isValid()) {
            String id = this.f30390c.getAppSetId().getId();
            if (id != null && id.length() != 0) {
                try {
                    UUID.fromString(id);
                    if (!id.equals(DeviceIdUtils.NULL_UUID)) {
                        return D51.m1554m(id, "-", "");
                    }
                } catch (Throwable unused) {
                }
            }
            return D51.m1554m(UUID.randomUUID().toString(), "-", "").toLowerCase(Locale.US);
        }
        AdTrackingInfo adTrackingInfo = yandex.mAdTrackingInfo;
        O90.m5965c(adTrackingInfo);
        String str = adTrackingInfo.advId;
        O90.m5965c(str);
        try {
            bArrDigest = MessageDigest.getInstance("MD5").digest(str.getBytes(AbstractC7038vr.f44561a));
        } catch (NoSuchAlgorithmException unused2) {
            bArrDigest = new byte[0];
        }
        return StringUtils.toHexString(bArrDigest);
    }

    public C4608K7(Context context) {
        this(context, C5244ka.m20614h().m20637v(), C5244ka.m20614h().m20618b());
    }
}
