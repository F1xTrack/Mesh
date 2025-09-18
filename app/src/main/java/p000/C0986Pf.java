package p000;

import android.content.Context;
import android.graphics.Bitmap;
import android.media.MediaCodecInfo;
import android.media.MediaCodecList;
import android.view.View;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import io.sentry.EnumC6069n1;
import io.sentry.ILogger;
import io.sentry.util.AbstractC6168a;
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
public class C0986Pf implements InterfaceC11800yS0, InterfaceC1639a2, InterfaceC9875jO0, InterfaceC7706Ho0, InterfaceC8538Xo0 {

    /* renamed from: a */
    public final /* synthetic */ int f9215a;

    /* renamed from: b */
    public int f9216b;

    /* renamed from: c */
    public Object f9217c;

    public /* synthetic */ C0986Pf(int i, Object obj) {
        this.f9215a = i;
        this.f9217c = obj;
        this.f9216b = 0;
    }

    @Override // p000.InterfaceC1639a2
    /* renamed from: a */
    public boolean mo2839a(View view) {
        ((BottomSheetBehavior) this.f9217c).m11197G(this.f9216b);
        return true;
    }

    /* renamed from: b */
    public Object m6393b() {
        int i = this.f9216b;
        if (i <= 0) {
            return null;
        }
        int i2 = i - 1;
        Object[] objArr = (Object[]) this.f9217c;
        Object obj = objArr[i2];
        objArr[i2] = null;
        this.f9216b = i - 1;
        return obj;
    }

    /* renamed from: c */
    public void m6394c(long j) {
        int i = this.f9216b;
        long[] jArr = (long[]) this.f9217c;
        if (i == jArr.length) {
            this.f9217c = Arrays.copyOf(jArr, i * 2);
        }
        long[] jArr2 = (long[]) this.f9217c;
        int i2 = this.f9216b;
        this.f9216b = i2 + 1;
        jArr2[i2] = j;
    }

    @Override // p000.InterfaceC8538Xo0
    /* renamed from: d */
    public MediaCodecInfo mo387d(int i) {
        if (((MediaCodecInfo[]) this.f9217c) == null) {
            this.f9217c = new MediaCodecList(this.f9216b).getCodecInfos();
        }
        return ((MediaCodecInfo[]) this.f9217c)[i];
    }

    @Override // p000.InterfaceC7706Ho0
    /* renamed from: e */
    public InterfaceC7758Io0 mo2829e(C7654Go0 c7654Go0) {
        int i;
        Context context;
        int i2 = AbstractC7485Dh1.f2166a;
        if (i2 < 23 || ((i = this.f9216b) != 1 && (i != 0 || (i2 < 31 && ((context = (Context) this.f9217c) == null || i2 < 28 || !context.getPackageManager().hasSystemFeature("com.amazon.hardware.tv_screen")))))) {
            return new C7616Fv0(21).mo2829e(c7654Go0);
        }
        int iM9165h = AbstractC8544Xr0.m9165h(c7654Go0.f3909c.f40974m);
        AbstractC10872rA1.m24174g("Creating an asynchronous MediaCodec adapter for track type " + AbstractC7485Dh1.m1792G(iM9165h));
        return new C4238iN(iM9165h).mo2829e(c7654Go0);
    }

    /* renamed from: f */
    public void m6395f(InputStream inputStream, OutputStream outputStream) {
        E00 e00 = (E00) this.f9217c;
        int i = this.f9216b;
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
                e00.mo2828d(bArr);
            }
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:119:0x005d  */
    /* renamed from: g */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public p000.InterfaceC10034kd1 m6396g(int r6, p000.C22 r7) {
        /*
            Method dump skipped, instructions count: 400
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.C0986Pf.m6396g(int, C22):kd1");
    }

    /* renamed from: h */
    public long m6397h(int i) {
        if (i >= 0 && i < this.f9216b) {
            return ((long[]) this.f9217c)[i];
        }
        StringBuilder sbM26237n = AbstractC7222ym.m26237n(i, "Invalid index ", ", size is ");
        sbM26237n.append(this.f9216b);
        throw new IndexOutOfBoundsException(sbM26237n.toString());
    }

    /* renamed from: i */
    public List m6398i(C22 c22) {
        String str;
        int i;
        boolean zM6400l = m6400l(32);
        List list = (List) this.f9217c;
        if (zM6400l) {
            return list;
        }
        C9591hA0 c9591hA0 = new C9591hA0((byte[]) c22.f1152d);
        while (c9591hA0.m18743a() > 0) {
            int iM18763u = c9591hA0.m18763u();
            int iM18763u2 = c9591hA0.f28294b + c9591hA0.m18763u();
            if (iM18763u == 134) {
                ArrayList arrayList = new ArrayList();
                int iM18763u3 = c9591hA0.m18763u() & 31;
                for (int i2 = 0; i2 < iM18763u3; i2++) {
                    String strM18761s = c9591hA0.m18761s(3, AbstractC7227yr.f46511c);
                    int iM18763u4 = c9591hA0.m18763u();
                    boolean z = (iM18763u4 & 128) != 0;
                    if (z) {
                        i = iM18763u4 & 63;
                        str = "application/cea-708";
                    } else {
                        str = "application/cea-608";
                        i = 1;
                    }
                    byte bM18763u = (byte) c9591hA0.m18763u();
                    c9591hA0.m18742H(1);
                    List listSingletonList = z ? Collections.singletonList((bM18763u & 64) != 0 ? new byte[]{1} : new byte[]{0}) : null;
                    C6623pX c6623pX = new C6623pX();
                    c6623pX.f40161l = AbstractC8544Xr0.m9171n(str);
                    c6623pX.f40153d = strM18761s;
                    c6623pX.f40145E = i;
                    c6623pX.f40164o = listSingletonList;
                    arrayList.add(new C6686qX(c6623pX));
                }
                list = arrayList;
            }
            c9591hA0.m18741G(iM18763u2);
        }
        return list;
    }

    /* renamed from: j */
    public boolean mo6399j() {
        C6911tq c6911tq = (C6911tq) this.f9217c;
        AbstractC10396nS1 abstractC10396nS1 = c6911tq.f43355c;
        if (abstractC10396nS1 instanceof C6768rq) {
            if (this.f9216b >= c6911tq.f43354b) {
                return false;
            }
        } else {
            if (!(abstractC10396nS1 instanceof C6848sq)) {
                throw new C6838sg();
            }
            int i = this.f9216b;
            int i2 = c6911tq.f43354b;
            if (i > i2 && (i != 0 || i2 != 0)) {
                return false;
            }
        }
        return true;
    }

    @Override // p000.InterfaceC8538Xo0
    /* renamed from: k */
    public boolean mo394k(String str, String str2, MediaCodecInfo.CodecCapabilities codecCapabilities) {
        return codecCapabilities.isFeatureSupported(str);
    }

    /* renamed from: l */
    public boolean m6400l(int i) {
        return (i & this.f9216b) != 0;
    }

    @Override // p000.InterfaceC8538Xo0
    /* renamed from: m */
    public boolean mo396m(String str, MediaCodecInfo.CodecCapabilities codecCapabilities) {
        return codecCapabilities.isFeatureRequired(str);
    }

    /* renamed from: n */
    public HashMap m6401n(ILogger iLogger, Map map) {
        HashMap map2 = new HashMap();
        for (Object obj : map.keySet()) {
            Object obj2 = map.get(obj);
            if (obj2 != null) {
                map2.put(obj.toString(), m6407x(iLogger, obj2));
            } else {
                map2.put(obj.toString(), null);
            }
        }
        return map2;
    }

    /* renamed from: o */
    public Character m6402o() {
        int i = this.f9216b;
        C6911tq c6911tq = (C6911tq) this.f9217c;
        if (i >= c6911tq.f43353a.length()) {
            return null;
        }
        String str = c6911tq.f43353a;
        if (str == null) {
            throw new C7841Kd1("null cannot be cast to non-null type java.lang.String");
        }
        char[] charArray = str.toCharArray();
        O90.m5964b(charArray, "(this as java.lang.String).toCharArray()");
        int i2 = this.f9216b;
        char c = charArray[i2];
        this.f9216b = i2 + 1;
        return Character.valueOf(c);
    }

    @Override // p000.InterfaceC8538Xo0
    /* renamed from: p */
    public int mo399p() {
        if (((MediaCodecInfo[]) this.f9217c) == null) {
            this.f9217c = new MediaCodecList(this.f9216b).getCodecInfos();
        }
        return ((MediaCodecInfo[]) this.f9217c).length;
    }

    /* renamed from: q */
    public long m6403q(C7000vF c7000vF) {
        C9591hA0 c9591hA0 = (C9591hA0) this.f9217c;
        int i = 0;
        c7000vF.mo3620f(c9591hA0.f28293a, 0, 1, false);
        int i2 = c9591hA0.f28293a[0] & 255;
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
        c7000vF.mo3620f(c9591hA0.f28293a, 1, i4, false);
        while (i < i4) {
            i++;
            i5 = (c9591hA0.f28293a[i] & 255) + (i5 << 8);
        }
        this.f9216b = i4 + 1 + this.f9216b;
        return i5;
    }

    /* renamed from: r */
    public synchronized boolean m6404r(String str) {
        for (String str2 : (String[]) this.f9217c) {
            if (str.equals(str2)) {
                return false;
            }
        }
        StringBuilder sb = new StringBuilder("Recording new base apk path: ");
        sb.append(str);
        sb.append("\n");
        m6406u(sb);
        String[] strArr = (String[]) this.f9217c;
        int i = this.f9216b;
        strArr[i % strArr.length] = str;
        this.f9216b = i + 1;
        return true;
    }

    /* renamed from: s */
    public void m6405s(C0072B8 c0072b8) {
        int i = this.f9216b;
        Object[] objArr = (Object[]) this.f9217c;
        if (i < objArr.length) {
            objArr[i] = c0072b8;
            this.f9216b = i + 1;
        }
    }

    @Override // p000.InterfaceC11800yS0
    /* renamed from: t */
    public InterfaceC10011kS0 mo875t(InterfaceC10011kS0 interfaceC10011kS0, C7830Jy0 c7830Jy0) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        ((Bitmap) interfaceC10011kS0.get()).compress((Bitmap.CompressFormat) this.f9217c, this.f9216b, byteArrayOutputStream);
        interfaceC10011kS0.recycle();
        return new C4031f5(byteArrayOutputStream.toByteArray());
    }

    /* renamed from: u */
    public synchronized void m6406u(StringBuilder sb) {
        try {
            sb.append("Previously recorded ");
            sb.append(this.f9216b);
            sb.append(" base apk paths.");
            if (this.f9216b > 0) {
                sb.append(" Most recent ones:");
            }
            int i = 0;
            while (true) {
                String[] strArr = (String[]) this.f9217c;
                if (i < strArr.length) {
                    int i2 = (this.f9216b - i) - 1;
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

    @Override // p000.InterfaceC9875jO0
    /* renamed from: v */
    public boolean mo1475v(UnsatisfiedLinkError unsatisfiedLinkError, H21[] h21Arr) {
        int i;
        InterfaceC9875jO0[] interfaceC9875jO0Arr;
        do {
            i = this.f9216b;
            interfaceC9875jO0Arr = (InterfaceC9875jO0[]) this.f9217c;
            if (i >= 6) {
                return false;
            }
            this.f9216b = i + 1;
        } while (!interfaceC9875jO0Arr[i].mo1475v(unsatisfiedLinkError, h21Arr));
        return true;
    }

    @Override // p000.InterfaceC8538Xo0
    /* renamed from: w */
    public boolean mo405w() {
        return true;
    }

    /* renamed from: x */
    public Object m6407x(ILogger iLogger, Object obj) {
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
            return AbstractC6168a.m21877a((AtomicIntegerArray) obj);
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
            return AbstractC6168a.m21879c((Calendar) obj);
        }
        if (obj.getClass().isEnum()) {
            return obj.toString();
        }
        HashSet hashSet = (HashSet) this.f9217c;
        if (hashSet.contains(obj)) {
            iLogger.mo21407k(EnumC6069n1.INFO, "Cyclic reference detected. Calling toString() on object.", new Object[0]);
            return obj.toString();
        }
        hashSet.add(obj);
        try {
            if (hashSet.size() > this.f9216b) {
                hashSet.remove(obj);
                iLogger.mo21407k(EnumC6069n1.INFO, "Max depth exceeded. Calling toString() on object.", new Object[0]);
                return obj.toString();
            }
            try {
                if (obj.getClass().isArray()) {
                    ArrayList arrayList = new ArrayList();
                    for (Object obj3 : (Object[]) obj) {
                        arrayList.add(m6407x(iLogger, obj3));
                    }
                    obj2 = arrayList;
                } else if (obj instanceof Collection) {
                    ArrayList arrayList2 = new ArrayList();
                    Iterator it = ((Collection) obj).iterator();
                    while (it.hasNext()) {
                        arrayList2.add(m6407x(iLogger, it.next()));
                    }
                    obj2 = arrayList2;
                } else {
                    if (obj instanceof Map) {
                        string = m6401n(iLogger, (Map) obj);
                    } else {
                        HashMap mapM6408y = m6408y(iLogger, obj);
                        if (mapM6408y.isEmpty()) {
                            string = obj.toString();
                        } else {
                            obj2 = mapM6408y;
                        }
                    }
                    obj2 = string;
                }
            } catch (Exception e) {
                iLogger.mo21406d(EnumC6069n1.INFO, "Not serializing object due to throwing sub-path.", e);
            }
            return obj2;
        } finally {
            hashSet.remove(obj);
        }
    }

    /* renamed from: y */
    public HashMap m6408y(ILogger iLogger, Object obj) throws SecurityException {
        Field[] declaredFields = obj.getClass().getDeclaredFields();
        HashMap map = new HashMap();
        for (Field field : declaredFields) {
            if (!Modifier.isTransient(field.getModifiers()) && !Modifier.isStatic(field.getModifiers())) {
                String name = field.getName();
                try {
                    field.setAccessible(true);
                    map.put(name, m6407x(iLogger, field.get(obj)));
                    field.setAccessible(false);
                } catch (Exception unused) {
                    iLogger.mo21407k(EnumC6069n1.INFO, AbstractC7222ym.m26234k("Cannot access field ", name, "."), new Object[0]);
                }
            }
        }
        return map;
    }

    public /* synthetic */ C0986Pf(int i, Object obj, int i2) {
        this.f9215a = i2;
        this.f9216b = i;
        this.f9217c = obj;
    }

    public /* synthetic */ C0986Pf(Object obj, int i, int i2) {
        this.f9215a = i2;
        this.f9217c = obj;
        this.f9216b = i;
    }

    public C0986Pf(int i, byte b) {
        this.f9215a = i;
        switch (i) {
            case 1:
                this.f9217c = Bitmap.CompressFormat.JPEG;
                this.f9216b = 100;
                break;
            case 10:
                this.f9217c = new long[32];
                break;
            case 16:
                this.f9217c = new Object[256];
                break;
            case 18:
                this.f9217c = new C9591hA0(8);
                break;
            default:
                this.f9217c = new String[5];
                this.f9216b = 0;
                break;
        }
    }

    public C0986Pf(E00 e00) {
        this.f9215a = 15;
        ML1.m5334a(true);
        this.f9216b = 16384;
        this.f9217c = e00;
    }

    public C0986Pf(int i) {
        this.f9215a = 19;
        this.f9217c = new HashSet();
        this.f9216b = i;
    }

    public C0986Pf(boolean z, boolean z2) {
        this.f9215a = 11;
        this.f9216b = (z || z2) ? 1 : 0;
    }
}
