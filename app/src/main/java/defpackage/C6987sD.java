package defpackage;

import android.graphics.Path;
import android.graphics.PathMeasure;
import android.os.Handler;
import android.os.Looper;
import io.sentry.util.f;
import java.nio.ByteBuffer;
import java.text.SimpleDateFormat;
import java.util.Locale;
import java.util.Random;

/* renamed from: sD, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C6987sD extends ThreadLocal {
    public final /* synthetic */ int a;

    @Override // java.lang.ThreadLocal
    public final Object initialValue() {
        switch (this.a) {
            case 0:
                SimpleDateFormat simpleDateFormat = new SimpleDateFormat("EEE, dd MMM yyyy HH:mm:ss 'GMT'", Locale.US);
                simpleDateFormat.setLenient(false);
                simpleDateFormat.setTimeZone(AbstractC0199Ch1.e);
                return simpleDateFormat;
            case 1:
                C6987sD c6987sD = KD.a;
                return ByteBuffer.allocate(16384);
            case 2:
                return new C6642qP();
            case 3:
                return new SimpleDateFormat("yyyy:MM:dd", Locale.US);
            case 4:
                return new SimpleDateFormat("HH:mm:ss", Locale.US);
            case 5:
                return new SimpleDateFormat("yyyy:MM:dd HH:mm:ss", Locale.US);
            case 6:
                return new Random();
            case 7:
                if (Looper.myLooper() == Looper.getMainLooper()) {
                    return QR1.h();
                }
                if (Looper.myLooper() != null) {
                    return new C20(new Handler(Looper.myLooper()));
                }
                return null;
            case 8:
                return new double[16];
            case 9:
                return new PathMeasure();
            case 10:
                return new Path();
            case 11:
                return new Path();
            case 12:
                return new float[4];
            case 13:
                return new f();
            default:
                return 0L;
        }
    }
}
