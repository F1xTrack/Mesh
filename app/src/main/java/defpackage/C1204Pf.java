package defpackage;

import android.content.Context;
import android.graphics.Bitmap;
import android.media.MediaCodecInfo;
import android.media.MediaCodecList;
import android.view.View;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import io.sentry.EnumC5148n1;
import io.sentry.ILogger;
import io.sentry.util.a;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.InputStream;
import java.io.OutputStream;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.net.InetAddress;
import java.net.URI;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Collection;
import java.util.Collections;
import java.util.Currency;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicIntegerArray;

/* renamed from: Pf */
/* loaded from: classes.dex */
public class C1204Pf implements InterfaceC8176yS0, InterfaceC2056a2, InterfaceC5303jO0, InterfaceC0609Ho0, InterfaceC1856Xo0 {
    public final /* synthetic */ int a;
    public int b;
    public Object c;

    public /* synthetic */ C1204Pf(int i, Object obj) {
        this.a = i;
        this.c = obj;
        this.b = 0;
    }

    @Override // defpackage.InterfaceC2056a2
    public boolean a(View view) {
        ((BottomSheetBehavior) this.c).G(this.b);
        return true;
    }

    public Object b() {
        int i = this.b;
        if (i <= 0) {
            return null;
        }
        int i2 = i - 1;
        Object[] objArr = (Object[]) this.c;
        Object obj = objArr[i2];
        objArr[i2] = null;
        this.b = i - 1;
        return obj;
    }

    public void c(long j) {
        int i = this.b;
        long[] jArr = (long[]) this.c;
        if (i == jArr.length) {
            this.c = Arrays.copyOf(jArr, i * 2);
        }
        long[] jArr2 = (long[]) this.c;
        int i2 = this.b;
        this.b = i2 + 1;
        jArr2[i2] = j;
    }

    @Override // defpackage.InterfaceC1856Xo0
    public MediaCodecInfo d(int i) {
        if (((MediaCodecInfo[]) this.c) == null) {
            this.c = new MediaCodecList(this.b).getCodecInfos();
        }
        return ((MediaCodecInfo[]) this.c)[i];
    }

    @Override // defpackage.InterfaceC0609Ho0
    public InterfaceC0687Io0 e(C0531Go0 c0531Go0) {
        int i;
        Context context;
        int i2 = AbstractC0277Dh1.a;
        if (i2 < 23 || ((i = this.b) != 1 && (i != 0 || (i2 < 31 && ((context = (Context) this.c) == null || i2 < 28 || !context.getPackageManager().hasSystemFeature("com.amazon.hardware.tv_screen")))))) {
            return new C0474Fv0(21).e(c0531Go0);
        }
        int iH = AbstractC1865Xr0.h(c0531Go0.c.m);
        AbstractC6789rA1.g("Creating an asynchronous MediaCodec adapter for track type " + AbstractC0277Dh1.G(iH));
        return new C4332iN(iH).e(c0531Go0);
    }

    public void f(InputStream inputStream, OutputStream outputStream) {
        E00 e00 = (E00) this.c;
        int i = this.b;
        byte[] bArr = (byte[]) e00.get(i);
        while (true) {
            try {
                int i2 = inputStream.read(bArr, 0, i);
                if (i2 == -1) {
                    return;
                } else {
                    outputStream.write(bArr, 0, i2);
                }
            } finally {
                e00.d(bArr);
            }
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:119:0x005d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public defpackage.InterfaceC5540kd1 g(int r6, defpackage.C22 r7) {
        /*
            Method dump skipped, instructions count: 400
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C1204Pf.g(int, C22):kd1");
    }

    public long h(int i) {
        if (i >= 0 && i < this.b) {
            return ((long[]) this.c)[i];
        }
        StringBuilder sbN = AbstractC8235ym.n(i, "Invalid index ", ", size is ");
        sbN.append(this.b);
        throw new IndexOutOfBoundsException(sbN.toString());
    }

    public List i(C22 c22) {
        String str;
        int i;
        boolean zL = l(32);
        List list = (List) this.c;
        if (zL) {
            return list;
        }
        C4103hA0 c4103hA0 = new C4103hA0((byte[]) c22.d);
        while (c4103hA0.a() > 0) {
            int iU = c4103hA0.u();
            int iU2 = c4103hA0.b + c4103hA0.u();
            if (iU == 134) {
                ArrayList arrayList = new ArrayList();
                int iU3 = c4103hA0.u() & 31;
                for (int i2 = 0; i2 < iU3; i2++) {
                    String strS = c4103hA0.s(3, AbstractC8250yr.c);
                    int iU4 = c4103hA0.u();
                    boolean z = (iU4 & 128) != 0;
                    if (z) {
                        i = iU4 & 63;
                        str = "application/cea-708";
                    } else {
                        str = "application/cea-608";
                        i = 1;
                    }
                    byte bU = (byte) c4103hA0.u();
                    c4103hA0.H(1);
                    List listSingletonList = z ? Collections.singletonList((bU & 64) != 0 ? new byte[]{1} : new byte[]{0}) : null;
                    C6475pX c6475pX = new C6475pX();
                    c6475pX.l = AbstractC1865Xr0.n(str);
                    c6475pX.d = strS;
                    c6475pX.E = i;
                    c6475pX.o = listSingletonList;
                    arrayList.add(new C6666qX(c6475pX));
                }
                list = arrayList;
            }
            c4103hA0.G(iU2);
        }
        return list;
    }

    public boolean j() {
        C7295tq c7295tq = (C7295tq) this.c;
        AbstractC6080nS1 abstractC6080nS1 = c7295tq.c;
        if (abstractC6080nS1 instanceof C6913rq) {
            if (this.b >= c7295tq.b) {
                return false;
            }
        } else {
            if (!(abstractC6080nS1 instanceof C7104sq)) {
                throw new C7074sg();
            }
            int i = this.b;
            int i2 = c7295tq.b;
            if (i > i2 && (i != 0 || i2 != 0)) {
                return false;
            }
        }
        return true;
    }

    @Override // defpackage.InterfaceC1856Xo0
    public boolean k(String str, String str2, MediaCodecInfo.CodecCapabilities codecCapabilities) {
        return codecCapabilities.isFeatureSupported(str);
    }

    public boolean l(int i) {
        return (i & this.b) != 0;
    }

    @Override // defpackage.InterfaceC1856Xo0
    public boolean m(String str, MediaCodecInfo.CodecCapabilities codecCapabilities) {
        return codecCapabilities.isFeatureRequired(str);
    }

    public HashMap n(ILogger iLogger, Map map) {
        HashMap map2 = new HashMap();
        for (Object obj : map.keySet()) {
            Object obj2 = map.get(obj);
            if (obj2 != null) {
                map2.put(obj.toString(), x(iLogger, obj2));
            } else {
                map2.put(obj.toString(), null);
            }
        }
        return map2;
    }

    public Character o() {
        int i = this.b;
        C7295tq c7295tq = (C7295tq) this.c;
        if (i >= c7295tq.a.length()) {
            return null;
        }
        String str = c7295tq.a;
        if (str == null) {
            throw new C0811Kd1("null cannot be cast to non-null type java.lang.String");
        }
        char[] charArray = str.toCharArray();
        O90.b(charArray, "(this as java.lang.String).toCharArray()");
        int i2 = this.b;
        char c = charArray[i2];
        this.b = i2 + 1;
        return Character.valueOf(c);
    }

    @Override // defpackage.InterfaceC1856Xo0
    public int p() {
        if (((MediaCodecInfo[]) this.c) == null) {
            this.c = new MediaCodecList(this.b).getCodecInfos();
        }
        return ((MediaCodecInfo[]) this.c).length;
    }

    public long q(C7566vF c7566vF) {
        C4103hA0 c4103hA0 = (C4103hA0) this.c;
        int i = 0;
        c7566vF.f(c4103hA0.a, 0, 1, false);
        int i2 = c4103hA0.a[0] & 255;
        if (i2 == 0) {
            return Long.MIN_VALUE;
        }
        int i3 = 128;
        int i4 = 0;
        while ((i2 & i3) == 0) {
            i3 >>= 1;
            i4++;
        }
        int i5 = i2 & (~i3);
        c7566vF.f(c4103hA0.a, 1, i4, false);
        while (i < i4) {
            i++;
            i5 = (c4103hA0.a[i] & 255) + (i5 << 8);
        }
        this.b = i4 + 1 + this.b;
        return i5;
    }

    public synchronized boolean r(String str) {
        for (String str2 : (String[]) this.c) {
            if (str.equals(str2)) {
                return false;
            }
        }
        StringBuilder sb = new StringBuilder("Recording new base apk path: ");
        sb.append(str);
        sb.append("\n");
        u(sb);
        String[] strArr = (String[]) this.c;
        int i = this.b;
        strArr[i % strArr.length] = str;
        this.b = i + 1;
        return true;
    }

    public void s(B8 b8) {
        int i = this.b;
        Object[] objArr = (Object[]) this.c;
        if (i < objArr.length) {
            objArr[i] = b8;
            this.b = i + 1;
        }
    }

    @Override // defpackage.InterfaceC8176yS0
    public InterfaceC5506kS0 t(InterfaceC5506kS0 interfaceC5506kS0, C0795Jy0 c0795Jy0) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        ((Bitmap) interfaceC5506kS0.get()).compress((Bitmap.CompressFormat) this.c, this.b, byteArrayOutputStream);
        interfaceC5506kS0.recycle();
        return new C3705f5(byteArrayOutputStream.toByteArray());
    }

    public synchronized void u(StringBuilder sb) {
        try {
            sb.append("Previously recorded ");
            sb.append(this.b);
            sb.append(" base apk paths.");
            if (this.b > 0) {
                sb.append(" Most recent ones:");
            }
            int i = 0;
            while (true) {
                String[] strArr = (String[]) this.c;
                if (i < strArr.length) {
                    int i2 = (this.b - i) - 1;
                    if (i2 >= 0) {
                        String str = strArr[i2 % strArr.length];
                        sb.append("\n");
                        sb.append(str);
                        sb.append(" (");
                        sb.append(new File(str).exists() ? "exists" : "does not exist");
                        sb.append(")");
                    }
                    i++;
                }
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // defpackage.InterfaceC5303jO0
    public boolean v(UnsatisfiedLinkError unsatisfiedLinkError, H21[] h21Arr) {
        int i;
        InterfaceC5303jO0[] interfaceC5303jO0Arr;
        do {
            i = this.b;
            interfaceC5303jO0Arr = (InterfaceC5303jO0[]) this.c;
            if (i >= 6) {
                return false;
            }
            this.b = i + 1;
        } while (!interfaceC5303jO0Arr[i].v(unsatisfiedLinkError, h21Arr));
        return true;
    }

    @Override // defpackage.InterfaceC1856Xo0
    public boolean w() {
        return true;
    }

    public Object x(ILogger iLogger, Object obj) {
        Object string;
        Object obj2 = null;
        if (obj == null) {
            return null;
        }
        if (obj instanceof Character) {
            return obj.toString();
        }
        if ((obj instanceof Number) || (obj instanceof Boolean) || (obj instanceof String)) {
            return obj;
        }
        if (obj instanceof Locale) {
            return obj.toString();
        }
        if (obj instanceof AtomicIntegerArray) {
            return a.a((AtomicIntegerArray) obj);
        }
        if (obj instanceof AtomicBoolean) {
            return Boolean.valueOf(((AtomicBoolean) obj).get());
        }
        if (obj instanceof URI) {
            return obj.toString();
        }
        if (obj instanceof InetAddress) {
            return obj.toString();
        }
        if (obj instanceof UUID) {
            return obj.toString();
        }
        if (obj instanceof Currency) {
            return obj.toString();
        }
        if (obj instanceof Calendar) {
            return a.c((Calendar) obj);
        }
        if (obj.getClass().isEnum()) {
            return obj.toString();
        }
        HashSet hashSet = (HashSet) this.c;
        if (hashSet.contains(obj)) {
            iLogger.k(EnumC5148n1.INFO, "Cyclic reference detected. Calling toString() on object.", new Object[0]);
            return obj.toString();
        }
        hashSet.add(obj);
        try {
            if (hashSet.size() > this.b) {
                hashSet.remove(obj);
                iLogger.k(EnumC5148n1.INFO, "Max depth exceeded. Calling toString() on object.", new Object[0]);
                return obj.toString();
            }
            try {
                if (obj.getClass().isArray()) {
                    ArrayList arrayList = new ArrayList();
                    for (Object obj3 : (Object[]) obj) {
                        arrayList.add(x(iLogger, obj3));
                    }
                    obj2 = arrayList;
                } else if (obj instanceof Collection) {
                    ArrayList arrayList2 = new ArrayList();
                    Iterator it = ((Collection) obj).iterator();
                    while (it.hasNext()) {
                        arrayList2.add(x(iLogger, it.next()));
                    }
                    obj2 = arrayList2;
                } else {
                    if (obj instanceof Map) {
                        string = n(iLogger, (Map) obj);
                    } else {
                        HashMap mapY = y(iLogger, obj);
                        if (mapY.isEmpty()) {
                            string = obj.toString();
                        } else {
                            obj2 = mapY;
                        }
                    }
                    obj2 = string;
                }
            } catch (Exception e) {
                iLogger.d(EnumC5148n1.INFO, "Not serializing object due to throwing sub-path.", e);
            }
            return obj2;
        } finally {
            hashSet.remove(obj);
        }
    }

    public HashMap y(ILogger iLogger, Object obj) throws SecurityException {
        Field[] declaredFields = obj.getClass().getDeclaredFields();
        HashMap map = new HashMap();
        for (Field field : declaredFields) {
            if (!Modifier.isTransient(field.getModifiers()) && !Modifier.isStatic(field.getModifiers())) {
                String name = field.getName();
                try {
                    field.setAccessible(true);
                    map.put(name, x(iLogger, field.get(obj)));
                    field.setAccessible(false);
                } catch (Exception unused) {
                    iLogger.k(EnumC5148n1.INFO, AbstractC8235ym.k("Cannot access field ", name, "."), new Object[0]);
                }
            }
        }
        return map;
    }

    public /* synthetic */ C1204Pf(int i, Object obj, int i2) {
        this.a = i2;
        this.b = i;
        this.c = obj;
    }

    public /* synthetic */ C1204Pf(Object obj, int i, int i2) {
        this.a = i2;
        this.c = obj;
        this.b = i;
    }

    public C1204Pf(int i, byte b) {
        this.a = i;
        switch (i) {
            case 1:
                this.c = Bitmap.CompressFormat.JPEG;
                this.b = 100;
                break;
            case 10:
                this.c = new long[32];
                break;
            case 16:
                this.c = new Object[256];
                break;
            case 18:
                this.c = new C4103hA0(8);
                break;
            default:
                this.c = new String[5];
                this.b = 0;
                break;
        }
    }

    public C1204Pf(E00 e00) {
        this.a = 15;
        ML1.a(true);
        this.b = 16384;
        this.c = e00;
    }

    public C1204Pf(int i) {
        this.a = 19;
        this.c = new HashSet();
        this.b = i;
    }

    public C1204Pf(boolean z, boolean z2) {
        this.a = 11;
        this.b = (z || z2) ? 1 : 0;
    }
}
