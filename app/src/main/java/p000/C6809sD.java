package p000;

import android.graphics.Path;
import android.graphics.PathMeasure;
import android.os.Handler;
import android.os.Looper;
import io.sentry.util.C6173f;
import java.nio.ByteBuffer;
import java.text.SimpleDateFormat;
import java.util.Locale;
import java.util.Random;

/* renamed from: sD */
/* loaded from: classes2.dex */
public final class C6809sD extends ThreadLocal {

    /* renamed from: a */
    public final /* synthetic */ int f42303a;

    @Override // java.lang.ThreadLocal
    public final Object initialValue() {
        switch (this.f42303a) {
            case 0:
                SimpleDateFormat simpleDateFormat = new SimpleDateFormat("EEE, dd MMM yyyy HH:mm:ss 'GMT'", Locale.US);
                simpleDateFormat.setLenient(false);
                simpleDateFormat.setTimeZone(AbstractC7433Ch1.f1581e);
                return simpleDateFormat;
            case 1:
                C6809sD c6809sD = C0644KD.f5944a;
                return ByteBuffer.allocate(16384);
            case 2:
                return new C6678qP();
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
                    return QR1.m6710h();
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
                return new C6173f();
            default:
                return 0L;
        }
    }
}
