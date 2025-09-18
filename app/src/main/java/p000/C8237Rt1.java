package p000;

import android.os.Environment;
import android.os.StatFs;
import java.math.BigInteger;
import java.nio.ByteBuffer;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.UUID;

/* renamed from: Rt1, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C8237Rt1 extends AbstractC8418Vg0 implements InterfaceC6497nZ {

    /* renamed from: f */
    public static final C8237Rt1 f10470f = new C8237Rt1(1, 0);

    /* renamed from: g */
    public static final C8237Rt1 f10471g = new C8237Rt1(1, 1);

    /* renamed from: h */
    public static final C8237Rt1 f10472h = new C8237Rt1(1, 2);

    /* renamed from: i */
    public static final C8237Rt1 f10473i = new C8237Rt1(1, 3);

    /* renamed from: j */
    public static final C8237Rt1 f10474j = new C8237Rt1(1, 4);

    /* renamed from: k */
    public static final C8237Rt1 f10475k = new C8237Rt1(1, 5);

    /* renamed from: l */
    public static final C8237Rt1 f10476l = new C8237Rt1(1, 6);

    /* renamed from: m */
    public static final C8237Rt1 f10477m = new C8237Rt1(1, 7);

    /* renamed from: n */
    public static final C8237Rt1 f10478n = new C8237Rt1(1, 15);

    /* renamed from: o */
    public static final C8237Rt1 f10479o = new C8237Rt1(1, 16);

    /* renamed from: e */
    public final /* synthetic */ int f10480e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C8237Rt1(int i) {
        super(1);
        this.f10480e = i;
    }

    @Override // p000.InterfaceC6497nZ
    public final Object invoke(Object obj) throws NoSuchAlgorithmException, C6861t2 {
        C8313Tf1 c8313Tf1 = C8313Tf1.f11463a;
        switch (this.f10480e) {
            case 0:
                Exception exc = (Exception) obj;
                O90.m5968f(exc, "it");
                return new PS0(RQ1.m7015b(exc));
            case 1:
                C8595Yq1 c8595Yq1 = (C8595Yq1) obj;
                O90.m5968f(c8595Yq1, "actualConfig");
                return c8595Yq1.f14557a;
            case 2:
                Throwable th = (Throwable) obj;
                O90.m5968f(th, "error");
                return !(th instanceof CQ0) ? new C11542wQ0("Failed to receive remote configuration", th) : (CQ0) th;
            case 3:
                O90.m5968f((C8313Tf1) obj, "it");
                return c8313Tf1;
            case 4:
                O90.m5968f((C8313Tf1) obj, "it");
                return c8313Tf1;
            case 5:
                O90.m5968f((C8313Tf1) obj, "it");
                return c8313Tf1;
            case 6:
                Throwable th2 = (Throwable) obj;
                O90.m5968f(th2, "it");
                return !(th2 instanceof CQ0) ? new AQ0(th2) : (CQ0) th2;
            case 7:
                O90.m5968f((Throwable) obj, "it");
                return c8313Tf1;
            case 8:
                ((C8054Og0) obj).getClass();
                return null;
            case 9:
                O90.m5968f((Object[]) obj, "it");
                return System.getProperty("http.agent");
            case 10:
                Object[] objArr = (Object[]) obj;
                O90.m5968f(objArr, "<name for destructuring parameter 0>");
                Object obj2 = objArr[0];
                String str = (String) objArr[1];
                String str2 = (String) obj2;
                try {
                    UUID uuidFromString = UUID.fromString(str);
                    O90.m5965c(uuidFromString);
                    O90.m5968f(str2, "name");
                    MessageDigest messageDigest = MessageDigest.getInstance("SHA-1");
                    ByteBuffer byteBufferWrap = ByteBuffer.wrap(new byte[16]);
                    byteBufferWrap.putLong(uuidFromString.getMostSignificantBits());
                    byteBufferWrap.putLong(uuidFromString.getLeastSignificantBits());
                    byte[] bArrArray = byteBufferWrap.array();
                    O90.m5967e(bArrArray, "array(...)");
                    messageDigest.update(bArrArray);
                    byte[] bytes = str2.getBytes(AbstractC7038vr.f44561a);
                    O90.m5967e(bytes, "getBytes(...)");
                    messageDigest.update(bytes);
                    byte[] bArrDigest = messageDigest.digest();
                    bArrDigest[6] = (byte) ((bArrDigest[6] & 15) | 80);
                    bArrDigest[8] = (byte) ((bArrDigest[8] & 63) | 128);
                    ByteBuffer byteBufferWrap2 = ByteBuffer.wrap(bArrDigest);
                    return new UUID(byteBufferWrap2.getLong(), byteBufferWrap2.getLong()).toString();
                } catch (IllegalArgumentException unused) {
                    O90.m5968f(str, "namespace");
                    throw new C6861t2(AbstractC7222ym.m26234k("Namespace: `", str, "` is not a valid namespace. Namespace should be a valid UUID string"), (Throwable) null);
                }
            case 11:
                O90.m5968f((Object[]) obj, "it");
                return UUID.randomUUID().toString();
            case 12:
                O90.m5968f((Object[]) obj, "it");
                StatFs statFs = new StatFs(Environment.getDataDirectory().getAbsolutePath());
                double dDoubleValue = BigInteger.valueOf(statFs.getBlockCountLong()).multiply(BigInteger.valueOf(statFs.getBlockSizeLong())).doubleValue();
                double dPow = Math.pow(2.0d, 53.0d) - 1;
                if (dDoubleValue > dPow) {
                    dDoubleValue = dPow;
                }
                return Double.valueOf(dDoubleValue);
            case 13:
                O90.m5968f((Object[]) obj, "it");
                StatFs statFs2 = new StatFs(Environment.getDataDirectory().getAbsolutePath());
                double dDoubleValue2 = BigInteger.valueOf(statFs2.getAvailableBlocksLong()).multiply(BigInteger.valueOf(statFs2.getBlockSizeLong())).doubleValue();
                double dPow2 = Math.pow(2.0d, 53.0d) - 1;
                if (dDoubleValue2 > dPow2) {
                    dDoubleValue2 = dPow2;
                }
                return Double.valueOf(dDoubleValue2);
            case 14:
                G01 g01 = (G01) obj;
                O90.m5968f(g01, "$this$function");
                String strConcat = "java/util/".concat("Spliterator");
                C7472Db0 c7472Db0 = AbstractC11641xC0.f45475b;
                g01.m2878c(strConcat, c7472Db0, c7472Db0);
                return c8313Tf1;
            case 15:
                O90.m5968f((C8313Tf1) obj, "it");
                return c8313Tf1;
            default:
                O90.m5968f((Throwable) obj, "it");
                return c8313Tf1;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C8237Rt1(int i, int i2) {
        super(i);
        this.f10480e = i2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C8237Rt1(C1340VI c1340vi) {
        super(1);
        this.f10480e = 8;
    }
}
