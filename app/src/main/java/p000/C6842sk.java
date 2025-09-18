package p000;

import android.content.Context;
import android.graphics.Bitmap;
import android.os.SystemClock;
import android.util.Log;
import com.bumptech.glide.ComponentCallbacks2C1874a;
import com.bumptech.glide.load.ImageHeaderParser$ImageType;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;

/* renamed from: sk */
/* loaded from: classes.dex */
public final class C6842sk implements InterfaceC10395nS0 {

    /* renamed from: f */
    public static final C11370v32 f42574f = new C11370v32(8);

    /* renamed from: g */
    public static final C7978Mu0 f42575g = new C7978Mu0(6);

    /* renamed from: a */
    public final Context f42576a;

    /* renamed from: b */
    public final ArrayList f42577b;

    /* renamed from: c */
    public final C7978Mu0 f42578c;

    /* renamed from: d */
    public final C11370v32 f42579d;

    /* renamed from: e */
    public final C7967Mo1 f42580e;

    public C6842sk(Context context, ArrayList arrayList, InterfaceC6443mi interfaceC6443mi, C11967zm0 c11967zm0) {
        C11370v32 c11370v32 = f42574f;
        this.f42576a = context.getApplicationContext();
        this.f42577b = arrayList;
        this.f42579d = c11370v32;
        this.f42580e = new C7967Mo1(interfaceC6443mi, c11967zm0);
        this.f42578c = f42575g;
    }

    @Override // p000.InterfaceC10395nS0
    /* renamed from: a */
    public final boolean mo9107a(Object obj, C7830Jy0 c7830Jy0) {
        return !((Boolean) c7830Jy0.m4482c(AbstractC10466o10.f38688b)).booleanValue() && AbstractC9063d22.m17479c(this.f42577b, (ByteBuffer) obj) == ImageHeaderParser$ImageType.GIF;
    }

    @Override // p000.InterfaceC10395nS0
    /* renamed from: b */
    public final InterfaceC10011kS0 mo9108b(Object obj, int i, int i2, C7830Jy0 c7830Jy0) {
        C10338n10 c10338n10;
        ByteBuffer byteBuffer = (ByteBuffer) obj;
        C7978Mu0 c7978Mu0 = this.f42578c;
        synchronized (c7978Mu0) {
            try {
                C10338n10 c10338n102 = (C10338n10) ((ArrayDeque) c7978Mu0.f7393b).poll();
                if (c10338n102 == null) {
                    c10338n102 = new C10338n10();
                }
                c10338n10 = c10338n102;
                c10338n10.f38042b = null;
                Arrays.fill(c10338n10.f38041a, (byte) 0);
                c10338n10.f38043c = new C10210m10();
                c10338n10.f38044d = 0;
                ByteBuffer byteBufferAsReadOnlyBuffer = byteBuffer.asReadOnlyBuffer();
                c10338n10.f38042b = byteBufferAsReadOnlyBuffer;
                byteBufferAsReadOnlyBuffer.position(0);
                c10338n10.f38042b.order(ByteOrder.LITTLE_ENDIAN);
            } catch (Throwable th) {
                throw th;
            }
        }
        try {
            return m24774c(byteBuffer, i, i2, c10338n10, c7830Jy0);
        } finally {
            this.f42578c.m5467J(c10338n10);
        }
    }

    /* renamed from: c */
    public final C9314f10 m24774c(ByteBuffer byteBuffer, int i, int i2, C10338n10 c10338n10, C7830Jy0 c7830Jy0) {
        int i3 = 1;
        int i4 = AbstractC10433nl0.f38500a;
        SystemClock.elapsedRealtimeNanos();
        try {
            C10210m10 c10210m10M23037b = c10338n10.m23037b();
            if (c10210m10M23037b.f37398c > 0 && c10210m10M23037b.f37397b == 0) {
                Bitmap.Config config = c7830Jy0.m4482c(AbstractC10466o10.f38687a) == EnumC0769MD.f7035b ? Bitmap.Config.RGB_565 : Bitmap.Config.ARGB_8888;
                int iMin = Math.min(c10210m10M23037b.f37402g / i2, c10210m10M23037b.f37401f / i);
                int iMax = Math.max(1, iMin == 0 ? 0 : Integer.highestOneBit(iMin));
                C11370v32 c11370v32 = this.f42579d;
                C7967Mo1 c7967Mo1 = this.f42580e;
                c11370v32.getClass();
                C10348n41 c10348n41 = new C10348n41(c7967Mo1, c10210m10M23037b, byteBuffer, iMax);
                c10348n41.m23071d(config);
                c10348n41.m23069b();
                Bitmap bitmapMo8139a = c10348n41.mo8139a();
                if (bitmapMo8139a == null) {
                    if (Log.isLoggable("BufferGifDecoder", 2)) {
                        SystemClock.elapsedRealtimeNanos();
                    }
                    return null;
                }
                C9314f10 c9314f10 = new C9314f10(new C9186e10(new C1825c5(i3, new C10082l10(ComponentCallbacks2C1874a.m10883a(this.f42576a), c10348n41, i, i2, bitmapMo8139a))), 0);
                if (Log.isLoggable("BufferGifDecoder", 2)) {
                    SystemClock.elapsedRealtimeNanos();
                }
                return c9314f10;
            }
            return null;
        } finally {
            if (Log.isLoggable("BufferGifDecoder", 2)) {
                SystemClock.elapsedRealtimeNanos();
            }
        }
    }
}
