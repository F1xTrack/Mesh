package defpackage;

import android.content.Context;
import android.graphics.Bitmap;
import android.os.SystemClock;
import android.util.Log;
import com.bumptech.glide.a;
import com.bumptech.glide.load.ImageHeaderParser$ImageType;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;

/* renamed from: sk, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C7086sk implements InterfaceC6079nS0 {
    public static final C7532v32 f = new C7532v32(8);
    public static final C1016Mu0 g = new C1016Mu0(6);
    public final Context a;
    public final ArrayList b;
    public final C1016Mu0 c;
    public final C7532v32 d;
    public final C0999Mo1 e;

    public C7086sk(Context context, ArrayList arrayList, InterfaceC5935mi interfaceC5935mi, C8426zm0 c8426zm0) {
        C7532v32 c7532v32 = f;
        this.a = context.getApplicationContext();
        this.b = arrayList;
        this.d = c7532v32;
        this.e = new C0999Mo1(interfaceC5935mi, c8426zm0);
        this.c = g;
    }

    @Override // defpackage.InterfaceC6079nS0
    public final boolean a(Object obj, C0795Jy0 c0795Jy0) {
        return !((Boolean) c0795Jy0.c(AbstractC6186o10.b)).booleanValue() && AbstractC3316d22.c(this.b, (ByteBuffer) obj) == ImageHeaderParser$ImageType.GIF;
    }

    @Override // defpackage.InterfaceC6079nS0
    public final InterfaceC5506kS0 b(Object obj, int i, int i2, C0795Jy0 c0795Jy0) {
        C5995n10 c5995n10;
        ByteBuffer byteBuffer = (ByteBuffer) obj;
        C1016Mu0 c1016Mu0 = this.c;
        synchronized (c1016Mu0) {
            try {
                C5995n10 c5995n102 = (C5995n10) ((ArrayDeque) c1016Mu0.b).poll();
                if (c5995n102 == null) {
                    c5995n102 = new C5995n10();
                }
                c5995n10 = c5995n102;
                c5995n10.b = null;
                Arrays.fill(c5995n10.a, (byte) 0);
                c5995n10.c = new C5804m10();
                c5995n10.d = 0;
                ByteBuffer byteBufferAsReadOnlyBuffer = byteBuffer.asReadOnlyBuffer();
                c5995n10.b = byteBufferAsReadOnlyBuffer;
                byteBufferAsReadOnlyBuffer.position(0);
                c5995n10.b.order(ByteOrder.LITTLE_ENDIAN);
            } catch (Throwable th) {
                throw th;
            }
        }
        try {
            return c(byteBuffer, i, i2, c5995n10, c0795Jy0);
        } finally {
            this.c.J(c5995n10);
        }
    }

    public final C3691f10 c(ByteBuffer byteBuffer, int i, int i2, C5995n10 c5995n10, C0795Jy0 c0795Jy0) {
        int i3 = 1;
        int i4 = AbstractC6136nl0.a;
        SystemClock.elapsedRealtimeNanos();
        try {
            C5804m10 c5804m10B = c5995n10.b();
            if (c5804m10B.c > 0 && c5804m10B.b == 0) {
                Bitmap.Config config = c0795Jy0.c(AbstractC6186o10.a) == MD.b ? Bitmap.Config.RGB_565 : Bitmap.Config.ARGB_8888;
                int iMin = Math.min(c5804m10B.g / i2, c5804m10B.f / i);
                int iMax = Math.max(1, iMin == 0 ? 0 : Integer.highestOneBit(iMin));
                C7532v32 c7532v32 = this.d;
                C0999Mo1 c0999Mo1 = this.e;
                c7532v32.getClass();
                C6008n41 c6008n41 = new C6008n41(c0999Mo1, c5804m10B, byteBuffer, iMax);
                c6008n41.d(config);
                c6008n41.b();
                Bitmap bitmapA = c6008n41.a();
                if (bitmapA == null) {
                    if (Log.isLoggable("BufferGifDecoder", 2)) {
                        SystemClock.elapsedRealtimeNanos();
                    }
                    return null;
                }
                C3691f10 c3691f10 = new C3691f10(new C3500e10(new C2448c5(i3, new C5613l10(a.a(this.a), c6008n41, i, i2, bitmapA))), 0);
                if (Log.isLoggable("BufferGifDecoder", 2)) {
                    SystemClock.elapsedRealtimeNanos();
                }
                return c3691f10;
            }
            return null;
        } finally {
            if (Log.isLoggable("BufferGifDecoder", 2)) {
                SystemClock.elapsedRealtimeNanos();
            }
        }
    }
}
