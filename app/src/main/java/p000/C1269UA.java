package p000;

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

/* renamed from: UA */
/* loaded from: classes.dex */
public final class C1269UA {

    /* renamed from: f */
    public static final HashMap f11664f;

    /* renamed from: g */
    public static final String f11665g;

    /* renamed from: a */
    public final Context f11666a;

    /* renamed from: b */
    public final Y50 f11667b;

    /* renamed from: c */
    public final C0197D7 f11668c;

    /* renamed from: d */
    public final ES1 f11669d;

    /* renamed from: e */
    public final C1361Vd f11670e;

    static {
        HashMap map = new HashMap();
        f11664f = map;
        AbstractC1374Vq.m8595n(5, map, "armeabi", 6, "armeabi-v7a");
        AbstractC1374Vq.m8595n(9, map, "arm64-v8a", 0, "x86");
        map.put("x86_64", 1);
        Locale locale = Locale.US;
        f11665g = "Crashlytics Android SDK/19.4.0";
    }

    public C1269UA(Context context, Y50 y50, C0197D7 c0197d7, ES1 es1, C1361Vd c1361Vd) {
        this.f11666a = context;
        this.f11667b = y50;
        this.f11668c = c0197d7;
        this.f11669d = es1;
        this.f11670e = c1361Vd;
    }

    /* renamed from: c */
    public static C1859cd m7921c(C10919rY0 c10919rY0, int i) {
        String str = (String) c10919rY0.f41729c;
        int i2 = 0;
        StackTraceElement[] stackTraceElementArr = (StackTraceElement[]) c10919rY0.f41730d;
        if (stackTraceElementArr == null) {
            stackTraceElementArr = new StackTraceElement[0];
        }
        C10919rY0 c10919rY02 = (C10919rY0) c10919rY0.f41731e;
        if (i >= 8) {
            for (C10919rY0 c10919rY03 = c10919rY02; c10919rY03 != null; c10919rY03 = (C10919rY0) c10919rY03.f41731e) {
                i2++;
            }
        }
        int i3 = i2;
        List listM7922d = m7922d(stackTraceElementArr, 4);
        if (listM7922d == null) {
            throw new NullPointerException("Null frames");
        }
        byte b = (byte) (0 | 1);
        C1859cd c1859cdM7921c = null;
        if (c10919rY02 != null && i3 == 0) {
            c1859cdM7921c = m7921c(c10919rY02, i + 1);
        }
        if (b == 1) {
            return new C1859cd(str, (String) c10919rY0.f41728b, listM7922d, c1859cdM7921c, i3);
        }
        StringBuilder sb = new StringBuilder();
        if ((b & 1) == 0) {
            sb.append(" overflowCount");
        }
        throw new IllegalStateException(AbstractC1374Vq.m8592k(sb, "Missing required properties:"));
    }

    /* renamed from: d */
    public static List m7922d(StackTraceElement[] stackTraceElementArr, int i) {
        ArrayList arrayList = new ArrayList();
        for (StackTraceElement stackTraceElement : stackTraceElementArr) {
            C4065fd c4065fd = new C4065fd();
            c4065fd.f27269e = i;
            c4065fd.f27270f = (byte) (c4065fd.f27270f | 4);
            long lineNumber = 0;
            long jMax = stackTraceElement.isNativeMethod() ? Math.max(stackTraceElement.getLineNumber(), 0L) : 0L;
            String str = stackTraceElement.getClassName() + "." + stackTraceElement.getMethodName();
            String fileName = stackTraceElement.getFileName();
            if (!stackTraceElement.isNativeMethod() && stackTraceElement.getLineNumber() > 0) {
                lineNumber = stackTraceElement.getLineNumber();
            }
            c4065fd.f27265a = jMax;
            byte b = (byte) (c4065fd.f27270f | 1);
            c4065fd.f27270f = b;
            if (str == null) {
                throw new NullPointerException("Null symbol");
            }
            c4065fd.f27266b = str;
            c4065fd.f27267c = fileName;
            c4065fd.f27268d = lineNumber;
            c4065fd.f27270f = (byte) (b | 2);
            arrayList.add(c4065fd.m18262a());
        }
        return Collections.unmodifiableList(arrayList);
    }

    /* renamed from: e */
    public static C3940dd m7923e() {
        byte b = (byte) 1;
        if (b == 1) {
            return new C3940dd("0", "0", 0L);
        }
        StringBuilder sb = new StringBuilder();
        if (b == 0) {
            sb.append(" address");
        }
        throw new IllegalStateException(AbstractC1374Vq.m8592k(sb, "Missing required properties:"));
    }

    /* renamed from: a */
    public final List m7924a() {
        byte b = (byte) (((byte) (0 | 1)) | 2);
        C0197D7 c0197d7 = this.f11668c;
        String str = (String) c0197d7.f1850e;
        if (str == null) {
            throw new NullPointerException("Null name");
        }
        if (b == 3) {
            return Collections.singletonList(new C1797bd(str, (String) c0197d7.f1848c, 0L, 0L));
        }
        StringBuilder sb = new StringBuilder();
        if ((b & 1) == 0) {
            sb.append(" baseAddress");
        }
        if ((b & 2) == 0) {
            sb.append(" size");
        }
        throw new IllegalStateException(AbstractC1374Vq.m8592k(sb, "Missing required properties:"));
    }

    /* renamed from: b */
    public final C6312kd m7925b(int i) {
        boolean z;
        Float fValueOf;
        Intent intentRegisterReceiver;
        int intExtra;
        int intExtra2;
        Context context = this.f11666a;
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
        if (!AbstractC1378Vu.m8627l() && ((SensorManager) context.getSystemService("sensor")).getDefaultSensor(8) != null) {
            z2 = true;
        }
        long jM8616a = AbstractC1378Vu.m8616a(context);
        ActivityManager.MemoryInfo memoryInfo = new ActivityManager.MemoryInfo();
        ((ActivityManager) context.getSystemService("activity")).getMemoryInfo(memoryInfo);
        long j = jM8616a - memoryInfo.availMem;
        if (j <= 0) {
            j = 0;
        }
        long blockSize = new StatFs(Environment.getDataDirectory().getPath()).getBlockSize();
        C6249jd c6249jd = new C6249jd();
        c6249jd.f35285a = dValueOf;
        c6249jd.f35286b = i2;
        byte b = (byte) (1 | c6249jd.f35291g);
        c6249jd.f35287c = z2;
        c6249jd.f35288d = i;
        c6249jd.f35289e = j;
        c6249jd.f35290f = (r7.getBlockCount() * blockSize) - (blockSize * r7.getAvailableBlocks());
        c6249jd.f35291g = (byte) (((byte) (((byte) (((byte) (b | 2)) | 4)) | 8)) | 16);
        return c6249jd.m22078a();
    }
}
