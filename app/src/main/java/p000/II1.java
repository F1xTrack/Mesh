package p000;

import android.os.SystemClock;
import com.facebook.react.bridge.ReactApplicationContext;
import java.io.File;
import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.util.Arrays;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public abstract class II1 {

    /* renamed from: a */
    public static final Object f4884a = new Object();

    /* renamed from: b */
    public static final Object f4885b = new Object();

    /* renamed from: c */
    public static boolean f4886c;

    /* renamed from: d */
    public static long f4887d;

    /* renamed from: e */
    public static C10585ox0 f4888e;

    /* renamed from: a */
    public static long m3807a() throws Throwable {
        DatagramSocket datagramSocket;
        long j;
        synchronized (f4885b) {
        }
        InetAddress byName = InetAddress.getByName("time.android.com");
        DatagramSocket datagramSocket2 = new DatagramSocket();
        try {
            datagramSocket2.setSoTimeout(10000);
            byte[] bArr = new byte[48];
            DatagramPacket datagramPacket = new DatagramPacket(bArr, 48, byName, 123);
            bArr[0] = 27;
            long jCurrentTimeMillis = System.currentTimeMillis();
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            if (jCurrentTimeMillis == 0) {
                Arrays.fill(bArr, 40, 48, (byte) 0);
                j = jCurrentTimeMillis;
                datagramSocket = datagramSocket2;
            } else {
                long j2 = jCurrentTimeMillis / 1000;
                Long.signum(j2);
                long j3 = jCurrentTimeMillis - (j2 * 1000);
                long j4 = j2 + 2208988800L;
                j = jCurrentTimeMillis;
                bArr[40] = (byte) (j4 >> 24);
                bArr[41] = (byte) (j4 >> 16);
                datagramSocket = datagramSocket2;
                try {
                    bArr[42] = (byte) (j4 >> 8);
                    bArr[43] = (byte) j4;
                    long j5 = (j3 * 4294967296L) / 1000;
                    bArr[44] = (byte) (j5 >> 24);
                    bArr[45] = (byte) (j5 >> 16);
                    bArr[46] = (byte) (j5 >> 8);
                    bArr[47] = (byte) (Math.random() * 255.0d);
                } catch (Throwable th) {
                    th = th;
                    Throwable th2 = th;
                    try {
                        datagramSocket.close();
                        throw th2;
                    } catch (Throwable th3) {
                        th2.addSuppressed(th3);
                        throw th2;
                    }
                }
            }
            datagramSocket.send(datagramPacket);
            datagramSocket.receive(new DatagramPacket(bArr, 48));
            long jElapsedRealtime2 = SystemClock.elapsedRealtime();
            long j6 = (jElapsedRealtime2 - jElapsedRealtime) + j;
            byte b = bArr[0];
            int i = bArr[1] & 255;
            long jM3812f = m3812f(24, bArr);
            long jM3812f2 = m3812f(32, bArr);
            long jM3812f3 = m3812f(40, bArr);
            m3808b((byte) ((b >> 6) & 3), (byte) (b & 7), i, jM3812f3);
            long j7 = (j6 + (((jM3812f3 - j6) + (jM3812f2 - jM3812f)) / 2)) - jElapsedRealtime2;
            datagramSocket.close();
            return j7;
        } catch (Throwable th4) {
            th = th4;
            datagramSocket = datagramSocket2;
        }
    }

    /* renamed from: b */
    public static void m3808b(byte b, byte b2, int i, long j) throws IOException {
        if (b == 3) {
            throw new IOException("SNTP: Unsynchronized server");
        }
        if (b2 != 4 && b2 != 5) {
            throw new IOException(AbstractC11153tN0.m24909u(b2, "SNTP: Untrusted mode: "));
        }
        if (i == 0 || i > 15) {
            throw new IOException(AbstractC11153tN0.m24909u(i, "SNTP: Untrusted stratum: "));
        }
        if (j == 0) {
            throw new IOException("SNTP: Zero transmitTime");
        }
    }

    /* renamed from: c */
    public static C10585ox0 m3809c(ReactApplicationContext reactApplicationContext) {
        C10457nx0 c10457nx0M3810d = m3810d();
        c10457nx0M3810d.f38632k = new C1557Yk(new File(reactApplicationContext.getCacheDir(), "http-cache"), 10485760);
        return new C10585ox0(c10457nx0M3810d);
    }

    /* renamed from: d */
    public static C10457nx0 m3810d() {
        C10457nx0 c10457nx0 = new C10457nx0();
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        c10457nx0.m23286a(0L, timeUnit);
        c10457nx0.m23287b(0L, timeUnit);
        c10457nx0.m23289d(0L, timeUnit);
        TJ0 tj0 = new TJ0();
        tj0.f11322a = null;
        c10457nx0.f38631j = tj0;
        return c10457nx0;
    }

    /* renamed from: e */
    public static long m3811e(int i, byte[] bArr) {
        int i2 = bArr[i];
        int i3 = bArr[i + 1];
        int i4 = bArr[i + 2];
        int i5 = bArr[i + 3];
        if ((i2 & 128) == 128) {
            i2 = (i2 & 127) + 128;
        }
        if ((i3 & 128) == 128) {
            i3 = (i3 & 127) + 128;
        }
        if ((i4 & 128) == 128) {
            i4 = (i4 & 127) + 128;
        }
        if ((i5 & 128) == 128) {
            i5 = (i5 & 127) + 128;
        }
        return (i2 << 24) + (i3 << 16) + (i4 << 8) + i5;
    }

    /* renamed from: f */
    public static long m3812f(int i, byte[] bArr) {
        long jM3811e = m3811e(i, bArr);
        long jM3811e2 = m3811e(i + 4, bArr);
        if (jM3811e == 0 && jM3811e2 == 0) {
            return 0L;
        }
        return ((jM3811e2 * 1000) / 4294967296L) + ((jM3811e - 2208988800L) * 1000);
    }
}
