package p000;

import android.content.pm.PackageManager;
import android.util.Pair;
import com.google.android.gms.ads.identifier.AdvertisingIdClient;
import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.HashMap;
import java.util.Locale;
import ru.p031ok.tracer.base.deviceid.DeviceIdUtils;

/* loaded from: classes.dex */
public final class DW1 extends AbstractC9512gY1 {

    /* renamed from: e */
    public final HashMap f2031e;

    /* renamed from: f */
    public final C9708i41 f2032f;

    /* renamed from: g */
    public final C9708i41 f2033g;

    /* renamed from: h */
    public final C9708i41 f2034h;

    /* renamed from: i */
    public final C9708i41 f2035i;

    /* renamed from: j */
    public final C9708i41 f2036j;

    /* renamed from: k */
    public final C9708i41 f2037k;

    public DW1(C10152lY1 c10152lY1) {
        super(c10152lY1);
        this.f2031e = new HashMap();
        this.f2032f = new C9708i41(m7851t1(), "last_delete_stale", 0L);
        this.f2033g = new C9708i41(m7851t1(), "last_delete_stale_batch", 0L);
        this.f2034h = new C9708i41(m7851t1(), "backoff", 0L);
        this.f2035i = new C9708i41(m7851t1(), "last_upload", 0L);
        this.f2036j = new C9708i41(m7851t1(), "last_upload_attempt", 0L);
        this.f2037k = new C9708i41(m7851t1(), "midnight_offset", 0L);
    }

    @Override // p000.AbstractC9512gY1
    /* renamed from: B1 */
    public final boolean mo1721B1() {
        return false;
    }

    /* renamed from: C1 */
    public final String m1722C1(String str, boolean z) throws NoSuchAlgorithmException {
        mo7681v1();
        String str2 = z ? (String) m1723D1(str).first : DeviceIdUtils.NULL_UUID;
        MessageDigest messageDigestM22843I2 = C10282mZ1.m22843I2();
        if (messageDigestM22843I2 == null) {
            return null;
        }
        return String.format(Locale.US, "%032X", new BigInteger(1, messageDigestM22843I2.digest(str2.getBytes())));
    }

    /* renamed from: D1 */
    public final Pair m1723D1(String str) {
        AW1 aw1;
        AdvertisingIdClient.Info advertisingIdInfo;
        mo7681v1();
        C9110dP1 c9110dP1 = (C9110dP1) this.f11615b;
        long jElapsedRealtime = c9110dP1.f26044n.elapsedRealtime();
        HashMap map = this.f2031e;
        AW1 aw12 = (AW1) map.get(str);
        if (aw12 != null && jElapsedRealtime < aw12.f227c) {
            return new Pair(aw12.f225a, Boolean.valueOf(aw12.f226b));
        }
        AdvertisingIdClient.setShouldSkipGmsCoreVersionCheck(true);
        C8143Py1 c8143Py1 = c9110dP1.f26037g;
        c8143Py1.getClass();
        long jM6507A1 = c8143Py1.m6507A1(str, IB1.f4783b) + jElapsedRealtime;
        try {
            try {
                advertisingIdInfo = AdvertisingIdClient.getAdvertisingIdInfo(c9110dP1.f26031a);
            } catch (PackageManager.NameNotFoundException unused) {
                if (aw12 != null && jElapsedRealtime < aw12.f227c + c8143Py1.m6507A1(str, IB1.f4786c)) {
                    return new Pair(aw12.f225a, Boolean.valueOf(aw12.f226b));
                }
                advertisingIdInfo = null;
            }
        } catch (Exception e) {
            mo6070n().f8385n.m24554c(e, "Unable to get advertising id");
            aw1 = new AW1(false, "", jM6507A1);
        }
        if (advertisingIdInfo == null) {
            return new Pair(DeviceIdUtils.NULL_UUID, Boolean.FALSE);
        }
        String id = advertisingIdInfo.getId();
        aw1 = id != null ? new AW1(advertisingIdInfo.isLimitAdTrackingEnabled(), id, jM6507A1) : new AW1(advertisingIdInfo.isLimitAdTrackingEnabled(), "", jM6507A1);
        map.put(str, aw1);
        AdvertisingIdClient.setShouldSkipGmsCoreVersionCheck(false);
        return new Pair(aw1.f225a, Boolean.valueOf(aw1.f226b));
    }
}
