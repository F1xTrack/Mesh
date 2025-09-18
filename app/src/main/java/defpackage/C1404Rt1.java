package defpackage;

import android.os.Environment;
import android.os.StatFs;
import java.math.BigInteger;
import java.nio.ByteBuffer;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.UUID;

/* renamed from: Rt1, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1404Rt1 extends AbstractC1676Vg0 implements InterfaceC6099nZ {
    public static final C1404Rt1 f = new C1404Rt1(1, 0);
    public static final C1404Rt1 g = new C1404Rt1(1, 1);
    public static final C1404Rt1 h = new C1404Rt1(1, 2);
    public static final C1404Rt1 i = new C1404Rt1(1, 3);
    public static final C1404Rt1 j = new C1404Rt1(1, 4);
    public static final C1404Rt1 k = new C1404Rt1(1, 5);
    public static final C1404Rt1 l = new C1404Rt1(1, 6);
    public static final C1404Rt1 m = new C1404Rt1(1, 7);
    public static final C1404Rt1 n = new C1404Rt1(1, 15);
    public static final C1404Rt1 o = new C1404Rt1(1, 16);
    public final /* synthetic */ int e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C1404Rt1(int i2) {
        super(1);
        this.e = i2;
    }

    @Override // defpackage.InterfaceC6099nZ
    public final Object invoke(Object obj) throws NoSuchAlgorithmException, C7143t2 {
        C1518Tf1 c1518Tf1 = C1518Tf1.a;
        switch (this.e) {
            case 0:
                Exception exc = (Exception) obj;
                O90.f(exc, "it");
                return new PS0(RQ1.b(exc));
            case 1:
                C1941Yq1 c1941Yq1 = (C1941Yq1) obj;
                O90.f(c1941Yq1, "actualConfig");
                return c1941Yq1.a;
            case 2:
                Throwable th = (Throwable) obj;
                O90.f(th, "error");
                return !(th instanceof CQ0) ? new C7790wQ0("Failed to receive remote configuration", th) : (CQ0) th;
            case 3:
                O90.f((C1518Tf1) obj, "it");
                return c1518Tf1;
            case 4:
                O90.f((C1518Tf1) obj, "it");
                return c1518Tf1;
            case 5:
                O90.f((C1518Tf1) obj, "it");
                return c1518Tf1;
            case 6:
                Throwable th2 = (Throwable) obj;
                O90.f(th2, "it");
                return !(th2 instanceof CQ0) ? new AQ0(th2) : (CQ0) th2;
            case 7:
                O90.f((Throwable) obj, "it");
                return c1518Tf1;
            case 8:
                ((C1130Og0) obj).getClass();
                return null;
            case 9:
                O90.f((Object[]) obj, "it");
                return System.getProperty("http.agent");
            case 10:
                Object[] objArr = (Object[]) obj;
                O90.f(objArr, "<name for destructuring parameter 0>");
                Object obj2 = objArr[0];
                String str = (String) objArr[1];
                String str2 = (String) obj2;
                try {
                    UUID uuidFromString = UUID.fromString(str);
                    O90.c(uuidFromString);
                    O90.f(str2, "name");
                    MessageDigest messageDigest = MessageDigest.getInstance("SHA-1");
                    ByteBuffer byteBufferWrap = ByteBuffer.wrap(new byte[16]);
                    byteBufferWrap.putLong(uuidFromString.getMostSignificantBits());
                    byteBufferWrap.putLong(uuidFromString.getLeastSignificantBits());
                    byte[] bArrArray = byteBufferWrap.array();
                    O90.e(bArrArray, "array(...)");
                    messageDigest.update(bArrArray);
                    byte[] bytes = str2.getBytes(AbstractC7680vr.a);
                    O90.e(bytes, "getBytes(...)");
                    messageDigest.update(bytes);
                    byte[] bArrDigest = messageDigest.digest();
                    bArrDigest[6] = (byte) ((bArrDigest[6] & 15) | 80);
                    bArrDigest[8] = (byte) ((bArrDigest[8] & 63) | 128);
                    ByteBuffer byteBufferWrap2 = ByteBuffer.wrap(bArrDigest);
                    return new UUID(byteBufferWrap2.getLong(), byteBufferWrap2.getLong()).toString();
                } catch (IllegalArgumentException unused) {
                    O90.f(str, "namespace");
                    throw new C7143t2(AbstractC8235ym.k("Namespace: `", str, "` is not a valid namespace. Namespace should be a valid UUID string"), (Throwable) null);
                }
            case 11:
                O90.f((Object[]) obj, "it");
                return UUID.randomUUID().toString();
            case 12:
                O90.f((Object[]) obj, "it");
                StatFs statFs = new StatFs(Environment.getDataDirectory().getAbsolutePath());
                double dDoubleValue = BigInteger.valueOf(statFs.getBlockCountLong()).multiply(BigInteger.valueOf(statFs.getBlockSizeLong())).doubleValue();
                double dPow = Math.pow(2.0d, 53.0d) - 1;
                if (dDoubleValue > dPow) {
                    dDoubleValue = dPow;
                }
                return Double.valueOf(dDoubleValue);
            case 13:
                O90.f((Object[]) obj, "it");
                StatFs statFs2 = new StatFs(Environment.getDataDirectory().getAbsolutePath());
                double dDoubleValue2 = BigInteger.valueOf(statFs2.getAvailableBlocksLong()).multiply(BigInteger.valueOf(statFs2.getBlockSizeLong())).doubleValue();
                double dPow2 = Math.pow(2.0d, 53.0d) - 1;
                if (dDoubleValue2 > dPow2) {
                    dDoubleValue2 = dPow2;
                }
                return Double.valueOf(dDoubleValue2);
            case 14:
                G01 g01 = (G01) obj;
                O90.f(g01, "$this$function");
                String strConcat = "java/util/".concat("Spliterator");
                C0258Db0 c0258Db0 = AbstractC7938xC0.b;
                g01.c(strConcat, c0258Db0, c0258Db0);
                return c1518Tf1;
            case 15:
                O90.f((C1518Tf1) obj, "it");
                return c1518Tf1;
            default:
                O90.f((Throwable) obj, "it");
                return c1518Tf1;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C1404Rt1(int i2, int i3) {
        super(i2);
        this.e = i3;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1404Rt1(VI vi) {
        super(1);
        this.e = 8;
    }
}
