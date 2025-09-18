package p000;

import android.os.Process;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.Date;
import java.util.Locale;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicLong;

/* renamed from: Pk */
/* loaded from: classes.dex */
public final class C0991Pk {

    /* renamed from: b */
    public static final String f9268b = AbstractC1378Vu.m8630o(UUID.randomUUID().toString() + System.currentTimeMillis());

    /* renamed from: c */
    public static final AtomicLong f9269c = new AtomicLong(0);

    /* renamed from: a */
    public final String f9270a;

    public C0991Pk() {
        long time = new Date().getTime();
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(4);
        byteBufferAllocate.putInt((int) (time / 1000));
        byteBufferAllocate.order(ByteOrder.BIG_ENDIAN);
        byteBufferAllocate.position(0);
        byte[] bArrArray = byteBufferAllocate.array();
        byte b = bArrArray[0];
        byte b2 = bArrArray[1];
        byte b3 = bArrArray[2];
        byte b4 = bArrArray[3];
        byte[] bArrM6420a = m6420a(time % 1000);
        byte b5 = bArrM6420a[0];
        byte b6 = bArrM6420a[1];
        byte[] bArrM6420a2 = m6420a(f9269c.incrementAndGet());
        byte b7 = bArrM6420a2[0];
        byte b8 = bArrM6420a2[1];
        byte[] bArrM6420a3 = m6420a(Integer.valueOf(Process.myPid()).shortValue());
        String strM8626k = AbstractC1378Vu.m8626k(new byte[]{b, b2, b3, b4, b5, b6, b7, b8, bArrM6420a3[0], bArrM6420a3[1]});
        Locale locale = Locale.US;
        this.f9270a = String.format(locale, "%s%s%s%s", strM8626k.substring(0, 12), strM8626k.substring(12, 16), strM8626k.subSequence(16, 20), f9268b.substring(0, 12)).toUpperCase(locale);
    }

    /* renamed from: a */
    public static byte[] m6420a(long j) {
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(2);
        byteBufferAllocate.putShort((short) j);
        byteBufferAllocate.order(ByteOrder.BIG_ENDIAN);
        byteBufferAllocate.position(0);
        return byteBufferAllocate.array();
    }

    public final String toString() {
        return this.f9270a;
    }
}
