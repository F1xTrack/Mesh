package defpackage;

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
    public static final Object a = new Object();
    public static final Object b = new Object();
    public static boolean c;
    public static long d;
    public static C6363ox0 e;

    public static long a() throws Throwable {
        DatagramSocket datagramSocket;
        long j;
        synchronized (b) {
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
            byte b2 = bArr[0];
            int i = bArr[1] & 255;
            long jF = f(24, bArr);
            long jF2 = f(32, bArr);
            long jF3 = f(40, bArr);
            b((byte) ((b2 >> 6) & 3), (byte) (b2 & 7), i, jF3);
            long j7 = (j6 + (((jF3 - j6) + (jF2 - jF)) / 2)) - jElapsedRealtime2;
            datagramSocket.close();
            return j7;
        } catch (Throwable th4) {
            th = th4;
            datagramSocket = datagramSocket2;
        }
    }

    public static void b(byte b2, byte b3, int i, long j) throws IOException {
        if (b2 == 3) {
            throw new IOException("SNTP: Unsynchronized server");
        }
        if (b3 != 4 && b3 != 5) {
            throw new IOException(AbstractC7209tN0.u(b3, "SNTP: Untrusted mode: "));
        }
        if (i == 0 || i > 15) {
            throw new IOException(AbstractC7209tN0.u(i, "SNTP: Untrusted stratum: "));
        }
        if (j == 0) {
            throw new IOException("SNTP: Zero transmitTime");
        }
    }

    public static C6363ox0 c(ReactApplicationContext reactApplicationContext) {
        C6172nx0 c6172nx0D = d();
        c6172nx0D.k = new C1921Yk(new File(reactApplicationContext.getCacheDir(), "http-cache"), 10485760);
        return new C6363ox0(c6172nx0D);
    }

    public static C6172nx0 d() {
        C6172nx0 c6172nx0 = new C6172nx0();
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        c6172nx0.a(0L, timeUnit);
        c6172nx0.b(0L, timeUnit);
        c6172nx0.d(0L, timeUnit);
        TJ0 tj0 = new TJ0();
        tj0.a = null;
        c6172nx0.j = tj0;
        return c6172nx0;
    }

    public static long e(int i, byte[] bArr) {
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

    public static long f(int i, byte[] bArr) {
        long jE = e(i, bArr);
        long jE2 = e(i + 4, bArr);
        if (jE == 0 && jE2 == 0) {
            return 0L;
        }
        return ((jE2 * 1000) / 4294967296L) + ((jE - 2208988800L) * 1000);
    }
}
