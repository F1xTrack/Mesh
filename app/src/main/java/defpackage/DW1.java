package defpackage;

import android.content.pm.PackageManager;
import android.util.Pair;
import com.google.android.gms.ads.identifier.AdvertisingIdClient;
import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.HashMap;
import java.util.Locale;
import ru.ok.tracer.base.deviceid.DeviceIdUtils;

/* loaded from: classes.dex */
public final class DW1 extends AbstractC3985gY1 {
    public final HashMap e;
    public final C4277i41 f;
    public final C4277i41 g;
    public final C4277i41 h;
    public final C4277i41 i;
    public final C4277i41 j;
    public final C4277i41 k;

    public DW1(C5716lY1 c5716lY1) {
        super(c5716lY1);
        this.e = new HashMap();
        this.f = new C4277i41(t1(), "last_delete_stale", 0L);
        this.g = new C4277i41(t1(), "last_delete_stale_batch", 0L);
        this.h = new C4277i41(t1(), "backoff", 0L);
        this.i = new C4277i41(t1(), "last_upload", 0L);
        this.j = new C4277i41(t1(), "last_upload_attempt", 0L);
        this.k = new C4277i41(t1(), "midnight_offset", 0L);
    }

    @Override // defpackage.AbstractC3985gY1
    public final boolean B1() {
        return false;
    }

    public final String C1(String str, boolean z) throws NoSuchAlgorithmException {
        v1();
        String str2 = z ? (String) D1(str).first : DeviceIdUtils.NULL_UUID;
        MessageDigest messageDigestI2 = C5910mZ1.I2();
        if (messageDigestI2 == null) {
            return null;
        }
        return String.format(Locale.US, "%032X", new BigInteger(1, messageDigestI2.digest(str2.getBytes())));
    }

    public final Pair D1(String str) {
        AW1 aw1;
        AdvertisingIdClient.Info advertisingIdInfo;
        v1();
        C3386dP1 c3386dP1 = (C3386dP1) this.b;
        long jElapsedRealtime = c3386dP1.n.elapsedRealtime();
        HashMap map = this.e;
        AW1 aw12 = (AW1) map.get(str);
        if (aw12 != null && jElapsedRealtime < aw12.c) {
            return new Pair(aw12.a, Boolean.valueOf(aw12.b));
        }
        AdvertisingIdClient.setShouldSkipGmsCoreVersionCheck(true);
        C1263Py1 c1263Py1 = c3386dP1.g;
        c1263Py1.getClass();
        long jA1 = c1263Py1.A1(str, IB1.b) + jElapsedRealtime;
        try {
            try {
                advertisingIdInfo = AdvertisingIdClient.getAdvertisingIdInfo(c3386dP1.a);
            } catch (PackageManager.NameNotFoundException unused) {
                if (aw12 != null && jElapsedRealtime < aw12.c + c1263Py1.A1(str, IB1.c)) {
                    return new Pair(aw12.a, Boolean.valueOf(aw12.b));
                }
                advertisingIdInfo = null;
            }
        } catch (Exception e) {
            n().n.c(e, "Unable to get advertising id");
            aw1 = new AW1(false, "", jA1);
        }
        if (advertisingIdInfo == null) {
            return new Pair(DeviceIdUtils.NULL_UUID, Boolean.FALSE);
        }
        String id = advertisingIdInfo.getId();
        aw1 = id != null ? new AW1(advertisingIdInfo.isLimitAdTrackingEnabled(), id, jA1) : new AW1(advertisingIdInfo.isLimitAdTrackingEnabled(), "", jA1);
        map.put(str, aw1);
        AdvertisingIdClient.setShouldSkipGmsCoreVersionCheck(false);
        return new Pair(aw1.a, Boolean.valueOf(aw1.b));
    }
}
