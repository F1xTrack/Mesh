package defpackage;

import android.content.SharedPreferences;
import android.media.AudioAttributes;
import android.media.AudioFormat;
import android.media.Spatializer;
import android.net.ConnectivityManager;
import android.net.Uri;
import android.opengl.Matrix;
import android.os.Build;
import android.os.Trace;
import android.util.Range;
import android.util.Size;
import androidx.camera.video.internal.compat.quirk.ExtraSupportedQualityQuirk;
import com.bumptech.glide.a;
import com.google.android.gms.common.internal.Preconditions;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.TreeMap;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.atomic.AtomicMarkableReference;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes.dex */
public final class VG implements InterfaceC0981Mi1, D10, U11 {
    public final /* synthetic */ int a;
    public boolean b;
    public final Object c;
    public Object d;
    public Object e;

    public VG(UM1 um1, String str) {
        this.a = 10;
        this.e = um1;
        Preconditions.checkNotEmpty(str);
        this.c = str;
    }

    public static void f(float[] fArr, float[] fArr2) {
        Matrix.setIdentityM(fArr, 0);
        float f = fArr2[10];
        float f2 = fArr2[8];
        float fSqrt = (float) Math.sqrt((f2 * f2) + (f * f));
        float f3 = fArr2[10] / fSqrt;
        fArr[0] = f3;
        float f4 = fArr2[8];
        fArr[2] = f4 / fSqrt;
        fArr[8] = (-f4) / fSqrt;
        fArr[10] = f3;
    }

    @Override // defpackage.U11
    public boolean a() {
        DO r0 = (DO) this.d;
        this.b = ((ConnectivityManager) r0.get()).getActiveNetwork() != null;
        try {
            ((ConnectivityManager) r0.get()).registerDefaultNetworkCallback((C1094Nu0) this.e);
            return true;
        } catch (RuntimeException unused) {
            return false;
        }
    }

    @Override // defpackage.InterfaceC0981Mi1
    public C1981Ze b(Size size, CM cm) {
        Object value;
        C1390Rp c1390RpH = h(cm);
        if (c1390RpH == null) {
            return null;
        }
        TreeMap treeMap = c1390RpH.b;
        Size size2 = AbstractC3696f21.a;
        Map.Entry entryCeilingEntry = treeMap.ceilingEntry(size);
        if (entryCeilingEntry != null) {
            value = entryCeilingEntry.getValue();
        } else {
            Map.Entry entryFloorEntry = treeMap.floorEntry(size);
            value = entryFloorEntry != null ? entryFloorEntry.getValue() : null;
        }
        C6496pe c6496pe = (C6496pe) value;
        if (c6496pe == null) {
            c6496pe = C6496pe.j;
        }
        Objects.toString(c6496pe);
        Objects.toString(size);
        AbstractC0759Jm0.f("CapabilitiesByQuality");
        if (c6496pe == C6496pe.j) {
            return null;
        }
        C1981Ze c1981ZeA = c1390RpH.a(c6496pe);
        if (c1981ZeA != null) {
            return c1981ZeA;
        }
        throw new AssertionError("Camera advertised available quality but did not produce EncoderProfiles for advertised quality.");
    }

    public void c() {
        switch (this.a) {
            case 1:
                C6627qK c6627qK = (C6627qK) this.e;
                synchronized (c6627qK) {
                    try {
                        if (this.b) {
                            throw new IllegalStateException("Check failed.");
                        }
                        if (O90.a(((C5863mK) this.c).g, this)) {
                            c6627qK.n(this, false);
                        }
                        this.b = true;
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                return;
            default:
                C6817rK.a((C6817rK) this.e, this, false);
                return;
        }
    }

    public boolean d(Q9 q9, C6666qX c6666qX) throws IllegalArgumentException {
        boolean zEquals = "audio/eac3-joc".equals(c6666qX.m);
        int i = c6666qX.A;
        if (zEquals && i == 16) {
            i = 12;
        }
        int iR = AbstractC0277Dh1.r(i);
        if (iR == 0) {
            return false;
        }
        AudioFormat.Builder channelMask = new AudioFormat.Builder().setEncoding(2).setChannelMask(iR);
        int i2 = c6666qX.B;
        if (i2 != -1) {
            channelMask.setSampleRate(i2);
        }
        return ((Spatializer) this.c).canBeSpatialized((AudioAttributes) q9.a().a, channelMask.build());
    }

    public void e() {
        C6627qK c6627qK = (C6627qK) this.e;
        synchronized (c6627qK) {
            try {
                if (this.b) {
                    throw new IllegalStateException("Check failed.");
                }
                if (O90.a(((C5863mK) this.c).g, this)) {
                    c6627qK.n(this, true);
                }
                this.b = true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void g() {
        C5863mK c5863mK = (C5863mK) this.c;
        if (O90.a(c5863mK.g, this)) {
            C6627qK c6627qK = (C6627qK) this.e;
            if (c6627qK.k) {
                c6627qK.n(this, false);
            } else {
                c5863mK.f = true;
            }
        }
    }

    @Override // defpackage.D10
    public Object get() {
        if (this.b) {
            throw new IllegalStateException("Recursive Registry initialization! In your AppGlideModule and LibraryGlideModules, Make sure you're using the provided Registry rather calling glide.getRegistry()!");
        }
        this.b = true;
        Trace.beginSection(OY1.f("Glide registry"));
        try {
            return YP1.a((a) this.c, (List) this.d, (F7) this.e);
        } finally {
            Trace.endSection();
        }
    }

    public C1390Rp h(CM cm) {
        Object next;
        boolean zContains;
        boolean zB = cm.b();
        HashMap map = (HashMap) this.d;
        if (zB) {
            return (C1390Rp) map.get(cm);
        }
        HashMap map2 = (HashMap) this.e;
        if (map2.containsKey(cm)) {
            return (C1390Rp) map2.get(cm);
        }
        Set setKeySet = map.keySet();
        O90.f(setKeySet, "fullySpecifiedDynamicRanges");
        if (cm.b()) {
            zContains = setKeySet.contains(cm);
        } else {
            Iterator it = setKeySet.iterator();
            while (true) {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
                CM cm2 = (CM) next;
                AbstractC3377dM1.i(cm2.b(), "Fully specified range is not actually fully specified.");
                int i = cm.b;
                if (i == 0 || i == cm2.b) {
                    AbstractC3377dM1.i(cm2.b(), "Fully specified range is not actually fully specified.");
                    int i2 = cm.a;
                    if (i2 != 0) {
                        int i3 = cm2.a;
                        if ((i2 == 2 && i3 != 1) || i2 == i3) {
                            break;
                        }
                    } else {
                        break;
                    }
                }
            }
            zContains = next != null;
        }
        C1390Rp c1390Rp = zContains ? new C1390Rp(new C6846rT1((C7760wG0) this.c, cm)) : null;
        map2.put(cm, c1390Rp);
        return c1390Rp;
    }

    public File i() {
        File file;
        synchronized (((C6817rK) this.e)) {
            try {
                C6054nK c6054nK = (C6054nK) this.c;
                if (c6054nK.f != this) {
                    throw new IllegalStateException();
                }
                if (!c6054nK.e) {
                    ((boolean[]) this.d)[0] = true;
                }
                file = c6054nK.d[0];
                ((C6817rK) this.e).a.mkdirs();
            } catch (Throwable th) {
                throw th;
            }
        }
        return file;
    }

    public int[] j() {
        synchronized (this) {
            try {
                if (!this.b) {
                    return null;
                }
                long[] jArr = (long[]) this.c;
                int length = jArr.length;
                int i = 0;
                int i2 = 0;
                while (i < length) {
                    int i3 = i2 + 1;
                    int i4 = 1;
                    boolean z = jArr[i] > 0;
                    boolean[] zArr = (boolean[]) this.d;
                    if (z != zArr[i2]) {
                        int[] iArr = (int[]) this.e;
                        if (!z) {
                            i4 = 2;
                        }
                        iArr[i2] = i4;
                    } else {
                        ((int[]) this.e)[i2] = 0;
                    }
                    zArr[i2] = z;
                    i++;
                    i2 = i3;
                }
                this.b = false;
                return (int[]) ((int[]) this.e).clone();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public Z11 k(int i) {
        C7166t9 c7166t9F;
        C6627qK c6627qK = (C6627qK) this.e;
        synchronized (c6627qK) {
            try {
                if (this.b) {
                    throw new IllegalStateException("Check failed.");
                }
                if (!O90.a(((C5863mK) this.c).g, this)) {
                    return new C7271ti();
                }
                if (!((C5863mK) this.c).e) {
                    boolean[] zArr = (boolean[]) this.d;
                    O90.c(zArr);
                    zArr[i] = true;
                }
                File file = (File) ((C5863mK) this.c).d.get(i);
                try {
                    O90.f(file, "file");
                    try {
                        c7166t9F = JI1.f(file);
                    } catch (FileNotFoundException unused) {
                        file.getParentFile().mkdirs();
                        c7166t9F = JI1.f(file);
                    }
                    return new GS(c7166t9F, new C3690f1(c6627qK, 8, this));
                } catch (FileNotFoundException unused2) {
                    return new C7271ti();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // defpackage.InterfaceC0981Mi1
    public C1981Ze l(C6496pe c6496pe, CM cm) {
        C1390Rp c1390RpH = h(cm);
        if (c1390RpH == null) {
            return null;
        }
        return c1390RpH.a(c6496pe);
    }

    public boolean m(String str, String str2) {
        synchronized (this) {
            try {
                if (!((C7648vg0) ((AtomicMarkableReference) this.c).getReference()).c(str, str2)) {
                    return false;
                }
                AtomicMarkableReference atomicMarkableReference = (AtomicMarkableReference) this.c;
                atomicMarkableReference.set((C7648vg0) atomicMarkableReference.getReference(), true);
                N61 n61 = new N61(8, this);
                AtomicReference atomicReference = (AtomicReference) this.d;
                while (true) {
                    if (atomicReference.compareAndSet(null, n61)) {
                        ((ZA) ((C6846rT1) ((C5534kb1) this.e).b).c).a(n61);
                        break;
                    }
                    if (atomicReference.get() != null) {
                        break;
                    }
                }
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void n(Runnable runnable, Executor executor) {
        synchronized (this.c) {
            try {
                if (this.b) {
                    ((ArrayDeque) this.d).add(new A22(runnable, executor));
                } else {
                    this.b = true;
                    v(runnable, executor);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public String o() {
        if (!this.b) {
            this.b = true;
            this.d = ((UM1) this.e).C1().getString((String) this.c, null);
        }
        return (String) this.d;
    }

    @Override // defpackage.InterfaceC0981Mi1
    public ArrayList p(CM cm) {
        C1390Rp c1390RpH = h(cm);
        return c1390RpH == null ? new ArrayList() : new ArrayList(c1390RpH.a.keySet());
    }

    public WO1 q(long j, String str) {
        Long lValueOf = Long.valueOf(j);
        Object obj = WO1.g;
        return new WO1(this, str, lValueOf, 1);
    }

    public WO1 r(String str, String str2) {
        Object obj = WO1.g;
        return new WO1(this, str, str2, 2);
    }

    public WO1 s(String str, boolean z) {
        Boolean boolValueOf = Boolean.valueOf(z);
        Object obj = WO1.g;
        return new WO1(this, str, boolValueOf, 0);
    }

    public void t(String str) {
        SharedPreferences.Editor editorEdit = ((UM1) this.e).C1().edit();
        editorEdit.putString((String) this.c, str);
        editorEdit.apply();
        this.d = str;
    }

    public void u() {
        synchronized (this.c) {
            try {
                if (((ArrayDeque) this.d).isEmpty()) {
                    this.b = false;
                    return;
                }
                A22 a22 = (A22) ((ArrayDeque) this.d).remove();
                v(a22.b, a22.a);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // defpackage.U11
    public void unregister() {
        ((ConnectivityManager) ((DO) this.d).get()).unregisterNetworkCallback((C1094Nu0) this.e);
    }

    public void v(Runnable runnable, Executor executor) {
        try {
            executor.execute(new RunnableC7990xT1(this, runnable, false, 8));
        } catch (RejectedExecutionException unused) {
            u();
        }
    }

    public VG(Uri uri, String str, String str2, boolean z, boolean z2) {
        this.a = 11;
        this.c = uri;
        this.d = str;
        this.e = str2;
        this.b = z;
    }

    public VG(int i, byte b) {
        this.a = i;
        switch (i) {
            case 8:
                this.c = new Object();
                this.d = new ArrayDeque();
                this.e = new AtomicReference();
                break;
            default:
                this.c = new float[16];
                this.d = new float[16];
                this.e = new J9();
                break;
        }
    }

    public VG(a aVar, List list, F7 f7) {
        this.a = 6;
        this.c = aVar;
        this.d = list;
        this.e = f7;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r8v0 */
    /* JADX WARN: Type inference failed for: r8v1, types: [java.util.Map] */
    /* JADX WARN: Type inference failed for: r8v10 */
    /* JADX WARN: Type inference failed for: r8v11 */
    /* JADX WARN: Type inference failed for: r8v2, types: [java.util.Map] */
    /* JADX WARN: Type inference failed for: r8v8, types: [java.util.HashMap] */
    public VG(InterfaceC6907ro interfaceC6907ro) {
        Range rangeG;
        this.a = 5;
        this.d = new HashMap();
        this.e = new HashMap();
        InterfaceC7211tO interfaceC7211tOT = interfaceC6907ro.t();
        C3513e41 c3513e41 = AbstractC7387uJ.a;
        C0999Mo1 c0999Mo1 = new C0999Mo1();
        c0999Mo1.a = interfaceC7211tOT;
        ArrayList arrayListB0 = c3513e41.B0(ExtraSupportedQualityQuirk.class);
        if (!arrayListB0.isEmpty()) {
            ?? EmptyMap = 0;
            InterfaceC2380bj1 interfaceC2380bj1A = null;
            EmptyMap = 0;
            EmptyMap = 0;
            AbstractC3377dM1.i(arrayListB0.size() == 1, null);
            ((ExtraSupportedQualityQuirk) arrayListB0.get(0)).getClass();
            if ("motorola".equalsIgnoreCase(Build.BRAND) && "moto c".equalsIgnoreCase(Build.MODEL)) {
                if ("1".equals(interfaceC6907ro.e()) && !interfaceC7211tOT.h(4)) {
                    InterfaceC7402uO interfaceC7402uOI = interfaceC7211tOT.i(1);
                    C8398zd c8398zd = (interfaceC7402uOI == null || interfaceC7402uOI.d().isEmpty()) ? null : (C8398zd) interfaceC7402uOI.d().get(0);
                    if (c8398zd != null) {
                        try {
                            interfaceC2380bj1A = C3446dj1.a(C2570cj1.w1(AbstractC1605Ui1.d(c8398zd)), null);
                        } catch (U90 unused) {
                            AbstractC0759Jm0.f("VideoEncoderInfoImpl");
                        }
                        if (interfaceC2380bj1A != null) {
                            rangeG = interfaceC2380bj1A.G();
                        } else {
                            rangeG = C1903Ye.f;
                        }
                        Range range = rangeG;
                        Size size = AbstractC3696f21.d;
                        int i = c8398zd.c;
                        int width = size.getWidth();
                        int height = size.getHeight();
                        int i2 = c8398zd.h;
                        int i3 = c8398zd.d;
                        C8208yd c8208ydE = C8208yd.e(interfaceC7402uOI.a(), interfaceC7402uOI.b(), interfaceC7402uOI.c(), Collections.singletonList(new C8398zd(c8398zd.a, c8398zd.b, AbstractC1605Ui1.c(i, i2, i2, i3, i3, width, c8398zd.e, height, c8398zd.f, range), c8398zd.d, size.getWidth(), size.getHeight(), c8398zd.g, c8398zd.h, c8398zd.i, c8398zd.j)));
                        EmptyMap = new HashMap();
                        EmptyMap.put(4, c8208ydE);
                        Size size2 = new Size(c8398zd.e, c8398zd.f);
                        if (size.getHeight() * size.getWidth() > size2.getHeight() * size2.getWidth()) {
                            EmptyMap.put(1, c8208ydE);
                        }
                    }
                }
            } else {
                EmptyMap = Collections.emptyMap();
            }
            if (EmptyMap != 0) {
                c0999Mo1.b = new HashMap((Map) EmptyMap);
            }
        }
        C6846rT1 c6846rT1 = new C6846rT1(c0999Mo1, c3513e41);
        Iterator it = interfaceC6907ro.b().iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            CM cm = (CM) it.next();
            if (Integer.valueOf(cm.a).equals(3) && cm.b == 10) {
                c6846rT1 = new C6846rT1(c6846rT1);
                break;
            }
        }
        this.c = new C7760wG0(c6846rT1, interfaceC6907ro, c3513e41);
        for (CM cm2 : interfaceC6907ro.b()) {
            C1390Rp c1390Rp = new C1390Rp(new C6846rT1((C7760wG0) this.c, cm2));
            if (!new ArrayList(c1390Rp.a.keySet()).isEmpty()) {
                ((HashMap) this.d).put(cm2, c1390Rp);
            }
        }
        this.b = interfaceC6907ro.d();
    }

    public VG(DO r3, T11 t11) {
        this.a = 7;
        this.e = new C1094Nu0(2, this);
        this.d = r3;
        this.c = t11;
    }

    public VG(C5534kb1 c5534kb1, boolean z) {
        this.a = 9;
        this.e = c5534kb1;
        this.d = new AtomicReference(null);
        this.b = z;
        this.c = new AtomicMarkableReference(new C7648vg0(z ? 8192 : 1024), false);
    }

    public VG(int i) {
        this.a = 4;
        this.c = new long[i];
        this.d = new boolean[i];
        this.e = new int[i];
    }

    public VG(C6817rK c6817rK, C6054nK c6054nK) {
        this.a = 2;
        this.e = c6817rK;
        this.c = c6054nK;
        this.d = c6054nK.e ? null : new boolean[c6817rK.g];
    }

    public VG(C6627qK c6627qK, C5863mK c5863mK) {
        boolean[] zArr;
        this.a = 1;
        this.e = c6627qK;
        this.c = c5863mK;
        if (c5863mK.e) {
            zArr = null;
        } else {
            c6627qK.getClass();
            zArr = new boolean[2];
        }
        this.d = zArr;
    }

    public VG(Spatializer spatializer) {
        this.a = 0;
        this.c = spatializer;
        this.b = spatializer.getImmersiveAudioLevel() != 0;
    }
}
