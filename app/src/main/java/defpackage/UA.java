package defpackage;

import android.app.ActivityManager;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.hardware.SensorManager;
import android.os.Environment;
import android.os.StatFs;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;

/* loaded from: classes.dex */
public final class UA {
    public static final HashMap f;
    public static final String g;
    public final Context a;
    public final Y50 b;
    public final D7 c;
    public final ES1 d;
    public final C1666Vd e;

    static {
        HashMap map = new HashMap();
        f = map;
        AbstractC1705Vq.n(5, map, "armeabi", 6, "armeabi-v7a");
        AbstractC1705Vq.n(9, map, "arm64-v8a", 0, "x86");
        map.put("x86_64", 1);
        Locale locale = Locale.US;
        g = "Crashlytics Android SDK/19.4.0";
    }

    public UA(Context context, Y50 y50, D7 d7, ES1 es1, C1666Vd c1666Vd) {
        this.a = context;
        this.b = y50;
        this.c = d7;
        this.d = es1;
        this.e = c1666Vd;
    }

    public static C2550cd c(C6860rY0 c6860rY0, int i) {
        String str = (String) c6860rY0.c;
        int i2 = 0;
        StackTraceElement[] stackTraceElementArr = (StackTraceElement[]) c6860rY0.d;
        if (stackTraceElementArr == null) {
            stackTraceElementArr = new StackTraceElement[0];
        }
        C6860rY0 c6860rY02 = (C6860rY0) c6860rY0.e;
        if (i >= 8) {
            for (C6860rY0 c6860rY03 = c6860rY02; c6860rY03 != null; c6860rY03 = (C6860rY0) c6860rY03.e) {
                i2++;
            }
        }
        int i3 = i2;
        List listD = d(stackTraceElementArr, 4);
        if (listD == null) {
            throw new NullPointerException("Null frames");
        }
        byte b = (byte) (0 | 1);
        C2550cd c2550cdC = null;
        if (c6860rY02 != null && i3 == 0) {
            c2550cdC = c(c6860rY02, i + 1);
        }
        if (b == 1) {
            return new C2550cd(str, (String) c6860rY0.b, listD, c2550cdC, i3);
        }
        StringBuilder sb = new StringBuilder();
        if ((b & 1) == 0) {
            sb.append(" overflowCount");
        }
        throw new IllegalStateException(AbstractC1705Vq.k(sb, "Missing required properties:"));
    }

    public static List d(StackTraceElement[] stackTraceElementArr, int i) {
        ArrayList arrayList = new ArrayList();
        for (StackTraceElement stackTraceElement : stackTraceElementArr) {
            C3807fd c3807fd = new C3807fd();
            c3807fd.e = i;
            c3807fd.f = (byte) (c3807fd.f | 4);
            long lineNumber = 0;
            long jMax = stackTraceElement.isNativeMethod() ? Math.max(stackTraceElement.getLineNumber(), 0L) : 0L;
            String str = stackTraceElement.getClassName() + "." + stackTraceElement.getMethodName();
            String fileName = stackTraceElement.getFileName();
            if (!stackTraceElement.isNativeMethod() && stackTraceElement.getLineNumber() > 0) {
                lineNumber = stackTraceElement.getLineNumber();
            }
            c3807fd.a = jMax;
            byte b = (byte) (c3807fd.f | 1);
            c3807fd.f = b;
            if (str == null) {
                throw new NullPointerException("Null symbol");
            }
            c3807fd.b = str;
            c3807fd.c = fileName;
            c3807fd.d = lineNumber;
            c3807fd.f = (byte) (b | 2);
            arrayList.add(c3807fd.a());
        }
        return Collections.unmodifiableList(arrayList);
    }

    public static C3426dd e() {
        byte b = (byte) 1;
        if (b == 1) {
            return new C3426dd("0", "0", 0L);
        }
        StringBuilder sb = new StringBuilder();
        if (b == 0) {
            sb.append(" address");
        }
        throw new IllegalStateException(AbstractC1705Vq.k(sb, "Missing required properties:"));
    }

    public final List a() {
        byte b = (byte) (((byte) (0 | 1)) | 2);
        D7 d7 = this.c;
        String str = (String) d7.e;
        if (str == null) {
            throw new NullPointerException("Null name");
        }
        if (b == 3) {
            return Collections.singletonList(new C2360bd(str, (String) d7.c, 0L, 0L));
        }
        StringBuilder sb = new StringBuilder();
        if ((b & 1) == 0) {
            sb.append(" baseAddress");
        }
        if ((b & 2) == 0) {
            sb.append(" size");
        }
        throw new IllegalStateException(AbstractC1705Vq.k(sb, "Missing required properties:"));
    }

    public final C5538kd b(int i) {
        boolean z;
        Float fValueOf;
        Intent intentRegisterReceiver;
        int intExtra;
        int intExtra2;
        Context context = this.a;
        boolean z2 = false;
        try {
            intentRegisterReceiver = context.registerReceiver(null, new IntentFilter("android.intent.action.BATTERY_CHANGED"));
        } catch (IllegalStateException unused) {
            z = false;
        }
        if (intentRegisterReceiver != null) {
            int intExtra3 = intentRegisterReceiver.getIntExtra("status", -1);
            z = intExtra3 != -1 && (intExtra3 == 2 || intExtra3 == 5);
            try {
                intExtra = intentRegisterReceiver.getIntExtra("level", -1);
                intExtra2 = intentRegisterReceiver.getIntExtra("scale", -1);
            } catch (IllegalStateException unused2) {
            }
            fValueOf = (intExtra == -1 || intExtra2 == -1) ? null : Float.valueOf(intExtra / intExtra2);
        } else {
            fValueOf = null;
            z = false;
        }
        Double dValueOf = fValueOf != null ? Double.valueOf(fValueOf.doubleValue()) : null;
        int i2 = (!z || fValueOf == null) ? 1 : ((double) fValueOf.floatValue()) < 0.99d ? 2 : 3;
        if (!AbstractC1717Vu.l() && ((SensorManager) context.getSystemService("sensor")).getDefaultSensor(8) != null) {
            z2 = true;
        }
        long jA = AbstractC1717Vu.a(context);
        ActivityManager.MemoryInfo memoryInfo = new ActivityManager.MemoryInfo();
        ((ActivityManager) context.getSystemService("activity")).getMemoryInfo(memoryInfo);
        long j = jA - memoryInfo.availMem;
        if (j <= 0) {
            j = 0;
        }
        long blockSize = new StatFs(Environment.getDataDirectory().getPath()).getBlockSize();
        C5347jd c5347jd = new C5347jd();
        c5347jd.a = dValueOf;
        c5347jd.b = i2;
        byte b = (byte) (1 | c5347jd.g);
        c5347jd.c = z2;
        c5347jd.d = i;
        c5347jd.e = j;
        c5347jd.f = (r7.getBlockCount() * blockSize) - (blockSize * r7.getAvailableBlocks());
        c5347jd.g = (byte) (((byte) (((byte) (((byte) (b | 2)) | 4)) | 8)) | 16);
        return c5347jd.a();
    }
}
