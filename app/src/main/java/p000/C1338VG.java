package p000;

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
import com.bumptech.glide.ComponentCallbacks2C1874a;
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

/* renamed from: VG */
/* loaded from: classes.dex */
public final class C1338VG implements InterfaceC7955Mi1, D10, U11 {

    /* renamed from: a */
    public final /* synthetic */ int f12473a;

    /* renamed from: b */
    public boolean f12474b;

    /* renamed from: c */
    public final Object f12475c;

    /* renamed from: d */
    public Object f12476d;

    /* renamed from: e */
    public Object f12477e;

    public C1338VG(UM1 um1, String str) {
        this.f12473a = 10;
        this.f12477e = um1;
        Preconditions.checkNotEmpty(str);
        this.f12475c = str;
    }

    /* renamed from: f */
    public static void m8339f(float[] fArr, float[] fArr2) {
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

    @Override // p000.U11
    /* renamed from: a */
    public boolean mo7863a() {
        C0214DO c0214do = (C0214DO) this.f12476d;
        this.f12474b = ((ConnectivityManager) c0214do.get()).getActiveNetwork() != null;
        try {
            ((ConnectivityManager) c0214do.get()).registerDefaultNetworkCallback((C8030Nu0) this.f12477e);
            return true;
        } catch (RuntimeException unused) {
            return false;
        }
    }

    @Override // p000.InterfaceC7955Mi1
    /* renamed from: b */
    public C1614Ze mo2827b(Size size, C0149CM c0149cm) {
        Object value;
        C1121Rp c1121RpM8344h = m8344h(c0149cm);
        if (c1121RpM8344h == null) {
            return null;
        }
        TreeMap treeMap = c1121RpM8344h.f10437b;
        Size size2 = AbstractC9318f21.f27016a;
        Map.Entry entryCeilingEntry = treeMap.ceilingEntry(size);
        if (entryCeilingEntry != null) {
            value = entryCeilingEntry.getValue();
        } else {
            Map.Entry entryFloorEntry = treeMap.floorEntry(size);
            value = entryFloorEntry != null ? entryFloorEntry.getValue() : null;
        }
        C6630pe c6630pe = (C6630pe) value;
        if (c6630pe == null) {
            c6630pe = C6630pe.f40254j;
        }
        Objects.toString(c6630pe);
        Objects.toString(size);
        AbstractC7806Jm0.m4412f("CapabilitiesByQuality");
        if (c6630pe == C6630pe.f40254j) {
            return null;
        }
        C1614Ze c1614ZeM7119a = c1121RpM8344h.m7119a(c6630pe);
        if (c1614ZeM7119a != null) {
            return c1614ZeM7119a;
        }
        throw new AssertionError("Camera advertised available quality but did not produce EncoderProfiles for advertised quality.");
    }

    /* renamed from: c */
    public void m8340c() {
        switch (this.f12473a) {
            case 1:
                C6673qK c6673qK = (C6673qK) this.f12477e;
                synchronized (c6673qK) {
                    try {
                        if (this.f12474b) {
                            throw new IllegalStateException("Check failed.");
                        }
                        if (O90.m5963a(((C6419mK) this.f12475c).f37633g, this)) {
                            c6673qK.m23974n(this, false);
                        }
                        this.f12474b = true;
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                return;
            default:
                C6736rK.m24275a((C6736rK) this.f12477e, this, false);
                return;
        }
    }

    /* renamed from: d */
    public boolean m8341d(C1017Q9 c1017q9, C6686qX c6686qX) throws IllegalArgumentException {
        boolean zEquals = "audio/eac3-joc".equals(c6686qX.f40974m);
        int i = c6686qX.f40951A;
        if (zEquals && i == 16) {
            i = 12;
        }
        int iM1833r = AbstractC7485Dh1.m1833r(i);
        if (iM1833r == 0) {
            return false;
        }
        AudioFormat.Builder channelMask = new AudioFormat.Builder().setEncoding(2).setChannelMask(iM1833r);
        int i2 = c6686qX.f40952B;
        if (i2 != -1) {
            channelMask.setSampleRate(i2);
        }
        return ((Spatializer) this.f12475c).canBeSpatialized((AudioAttributes) c1017q9.m6587a().f3494a, channelMask.build());
    }

    /* renamed from: e */
    public void m8342e() {
        C6673qK c6673qK = (C6673qK) this.f12477e;
        synchronized (c6673qK) {
            try {
                if (this.f12474b) {
                    throw new IllegalStateException("Check failed.");
                }
                if (O90.m5963a(((C6419mK) this.f12475c).f37633g, this)) {
                    c6673qK.m23974n(this, true);
                }
                this.f12474b = true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* renamed from: g */
    public void m8343g() {
        C6419mK c6419mK = (C6419mK) this.f12475c;
        if (O90.m5963a(c6419mK.f37633g, this)) {
            C6673qK c6673qK = (C6673qK) this.f12477e;
            if (c6673qK.f40786k) {
                c6673qK.m23974n(this, false);
            } else {
                c6419mK.f37632f = true;
            }
        }
    }

    @Override // p000.D10
    public Object get() {
        if (this.f12474b) {
            throw new IllegalStateException("Recursive Registry initialization! In your AppGlideModule and LibraryGlideModules, Make sure you're using the provided Registry rather calling glide.getRegistry()!");
        }
        this.f12474b = true;
        Trace.beginSection(OY1.m6088f("Glide registry"));
        try {
            return YP1.m9294a((ComponentCallbacks2C1874a) this.f12475c, (List) this.f12476d, (AbstractC0323F7) this.f12477e);
        } finally {
            Trace.endSection();
        }
    }

    /* renamed from: h */
    public C1121Rp m8344h(C0149CM c0149cm) {
        Object next;
        boolean zContains;
        boolean zM1147b = c0149cm.m1147b();
        HashMap map = (HashMap) this.f12476d;
        if (zM1147b) {
            return (C1121Rp) map.get(c0149cm);
        }
        HashMap map2 = (HashMap) this.f12477e;
        if (map2.containsKey(c0149cm)) {
            return (C1121Rp) map2.get(c0149cm);
        }
        Set setKeySet = map.keySet();
        O90.m5968f(setKeySet, "fullySpecifiedDynamicRanges");
        if (c0149cm.m1147b()) {
            zContains = setKeySet.contains(c0149cm);
        } else {
            Iterator it = setKeySet.iterator();
            while (true) {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
                C0149CM c0149cm2 = (C0149CM) next;
                AbstractC9104dM1.m17550i(c0149cm2.m1147b(), "Fully specified range is not actually fully specified.");
                int i = c0149cm.f1337b;
                if (i == 0 || i == c0149cm2.f1337b) {
                    AbstractC9104dM1.m17550i(c0149cm2.m1147b(), "Fully specified range is not actually fully specified.");
                    int i2 = c0149cm.f1336a;
                    if (i2 != 0) {
                        int i3 = c0149cm2.f1336a;
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
        C1121Rp c1121Rp = zContains ? new C1121Rp(new C10910rT1((C11522wG0) this.f12475c, c0149cm)) : null;
        map2.put(c0149cm, c1121Rp);
        return c1121Rp;
    }

    /* renamed from: i */
    public File m8345i() {
        File file;
        synchronized (((C6736rK) this.f12477e)) {
            try {
                C6482nK c6482nK = (C6482nK) this.f12475c;
                if (c6482nK.f38276f != this) {
                    throw new IllegalStateException();
                }
                if (!c6482nK.f38275e) {
                    ((boolean[]) this.f12476d)[0] = true;
                }
                file = c6482nK.f38274d[0];
                ((C6736rK) this.f12477e).f41514a.mkdirs();
            } catch (Throwable th) {
                throw th;
            }
        }
        return file;
    }

    /* renamed from: j */
    public int[] m8346j() {
        synchronized (this) {
            try {
                if (!this.f12474b) {
                    return null;
                }
                long[] jArr = (long[]) this.f12475c;
                int length = jArr.length;
                int i = 0;
                int i2 = 0;
                while (i < length) {
                    int i3 = i2 + 1;
                    int i4 = 1;
                    boolean z = jArr[i] > 0;
                    boolean[] zArr = (boolean[]) this.f12476d;
                    if (z != zArr[i2]) {
                        int[] iArr = (int[]) this.f12477e;
                        if (!z) {
                            i4 = 2;
                        }
                        iArr[i2] = i4;
                    } else {
                        ((int[]) this.f12477e)[i2] = 0;
                    }
                    zArr[i2] = z;
                    i++;
                    i2 = i3;
                }
                this.f12474b = false;
                return (int[]) ((int[]) this.f12477e).clone();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* renamed from: k */
    public Z11 m8347k(int i) {
        C6868t9 c6868t9M4278f;
        C6673qK c6673qK = (C6673qK) this.f12477e;
        synchronized (c6673qK) {
            try {
                if (this.f12474b) {
                    throw new IllegalStateException("Check failed.");
                }
                if (!O90.m5963a(((C6419mK) this.f12475c).f37633g, this)) {
                    return new C6903ti();
                }
                if (!((C6419mK) this.f12475c).f37631e) {
                    boolean[] zArr = (boolean[]) this.f12476d;
                    O90.m5965c(zArr);
                    zArr[i] = true;
                }
                File file = (File) ((C6419mK) this.f12475c).f37630d.get(i);
                try {
                    O90.m5968f(file, "file");
                    try {
                        c6868t9M4278f = JI1.m4278f(file);
                    } catch (FileNotFoundException unused) {
                        file.getParentFile().mkdirs();
                        c6868t9M4278f = JI1.m4278f(file);
                    }
                    return new C0407GS(c6868t9M4278f, new C4027f1(c6673qK, 8, this));
                } catch (FileNotFoundException unused2) {
                    return new C6903ti();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // p000.InterfaceC7955Mi1
    /* renamed from: l */
    public C1614Ze mo2831l(C6630pe c6630pe, C0149CM c0149cm) {
        C1121Rp c1121RpM8344h = m8344h(c0149cm);
        if (c1121RpM8344h == null) {
            return null;
        }
        return c1121RpM8344h.m7119a(c6630pe);
    }

    /* renamed from: m */
    public boolean m8348m(String str, String str2) {
        synchronized (this) {
            try {
                if (!((C11447vg0) ((AtomicMarkableReference) this.f12475c).getReference()).m25475c(str, str2)) {
                    return false;
                }
                AtomicMarkableReference atomicMarkableReference = (AtomicMarkableReference) this.f12475c;
                atomicMarkableReference.set((C11447vg0) atomicMarkableReference.getReference(), true);
                N61 n61 = new N61(8, this);
                AtomicReference atomicReference = (AtomicReference) this.f12476d;
                while (true) {
                    if (atomicReference.compareAndSet(null, n61)) {
                        ((ExecutorC1584ZA) ((C10910rT1) ((C10030kb1) this.f12477e).f36562b).f41679c).m9502a(n61);
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

    /* renamed from: n */
    public void m8349n(Runnable runnable, Executor executor) {
        synchronized (this.f12475c) {
            try {
                if (this.f12474b) {
                    ((ArrayDeque) this.f12476d).add(new A22(runnable, executor));
                } else {
                    this.f12474b = true;
                    m8356v(runnable, executor);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* renamed from: o */
    public String m8350o() {
        if (!this.f12474b) {
            this.f12474b = true;
            this.f12476d = ((UM1) this.f12477e).m7993C1().getString((String) this.f12475c, null);
        }
        return (String) this.f12476d;
    }

    @Override // p000.InterfaceC7955Mi1
    /* renamed from: p */
    public ArrayList mo2833p(C0149CM c0149cm) {
        C1121Rp c1121RpM8344h = m8344h(c0149cm);
        return c1121RpM8344h == null ? new ArrayList() : new ArrayList(c1121RpM8344h.f10436a.keySet());
    }

    /* renamed from: q */
    public WO1 m8351q(long j, String str) {
        Long lValueOf = Long.valueOf(j);
        Object obj = WO1.f13159g;
        return new WO1(this, str, lValueOf, 1);
    }

    /* renamed from: r */
    public WO1 m8352r(String str, String str2) {
        Object obj = WO1.f13159g;
        return new WO1(this, str, str2, 2);
    }

    /* renamed from: s */
    public WO1 m8353s(String str, boolean z) {
        Boolean boolValueOf = Boolean.valueOf(z);
        Object obj = WO1.f13159g;
        return new WO1(this, str, boolValueOf, 0);
    }

    /* renamed from: t */
    public void m8354t(String str) {
        SharedPreferences.Editor editorEdit = ((UM1) this.f12477e).m7993C1().edit();
        editorEdit.putString((String) this.f12475c, str);
        editorEdit.apply();
        this.f12476d = str;
    }

    /* renamed from: u */
    public void m8355u() {
        synchronized (this.f12475c) {
            try {
                if (((ArrayDeque) this.f12476d).isEmpty()) {
                    this.f12474b = false;
                    return;
                }
                A22 a22 = (A22) ((ArrayDeque) this.f12476d).remove();
                m8356v(a22.f29b, a22.f28a);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // p000.U11
    public void unregister() {
        ((ConnectivityManager) ((C0214DO) this.f12476d).get()).unregisterNetworkCallback((C8030Nu0) this.f12477e);
    }

    /* renamed from: v */
    public void m8356v(Runnable runnable, Executor executor) {
        try {
            executor.execute(new RunnableC11676xT1(this, runnable, false, 8));
        } catch (RejectedExecutionException unused) {
            m8355u();
        }
    }

    public C1338VG(Uri uri, String str, String str2, boolean z, boolean z2) {
        this.f12473a = 11;
        this.f12475c = uri;
        this.f12476d = str;
        this.f12477e = str2;
        this.f12474b = z;
    }

    public C1338VG(int i, byte b) {
        this.f12473a = i;
        switch (i) {
            case 8:
                this.f12475c = new Object();
                this.f12476d = new ArrayDeque();
                this.f12477e = new AtomicReference();
                break;
            default:
                this.f12475c = new float[16];
                this.f12476d = new float[16];
                this.f12477e = new C0577J9();
                break;
        }
    }

    public C1338VG(ComponentCallbacks2C1874a componentCallbacks2C1874a, List list, AbstractC0323F7 abstractC0323F7) {
        this.f12473a = 6;
        this.f12475c = componentCallbacks2C1874a;
        this.f12476d = list;
        this.f12477e = abstractC0323F7;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r8v0 */
    /* JADX WARN: Type inference failed for: r8v1, types: [java.util.Map] */
    /* JADX WARN: Type inference failed for: r8v10 */
    /* JADX WARN: Type inference failed for: r8v11 */
    /* JADX WARN: Type inference failed for: r8v2, types: [java.util.Map] */
    /* JADX WARN: Type inference failed for: r8v8, types: [java.util.HashMap] */
    public C1338VG(InterfaceC6766ro interfaceC6766ro) {
        Range rangeMo10493G;
        this.f12473a = 5;
        this.f12476d = new HashMap();
        this.f12477e = new HashMap();
        InterfaceC6883tO interfaceC6883tOMo2408t = interfaceC6766ro.mo2408t();
        C9196e41 c9196e41 = AbstractC6941uJ.f43644a;
        C7967Mo1 c7967Mo1 = new C7967Mo1();
        c7967Mo1.f7362a = interfaceC6883tOMo2408t;
        ArrayList arrayListM17838B0 = c9196e41.m17838B0(ExtraSupportedQualityQuirk.class);
        if (!arrayListM17838B0.isEmpty()) {
            ?? EmptyMap = 0;
            InterfaceC8889bj1 interfaceC8889bj1M17731a = null;
            EmptyMap = 0;
            EmptyMap = 0;
            AbstractC9104dM1.m17550i(arrayListM17838B0.size() == 1, null);
            ((ExtraSupportedQualityQuirk) arrayListM17838B0.get(0)).getClass();
            if ("motorola".equalsIgnoreCase(Build.BRAND) && "moto c".equalsIgnoreCase(Build.MODEL)) {
                if ("1".equals(interfaceC6766ro.mo2393e()) && !interfaceC6883tOMo2408t.mo5443h(4)) {
                    InterfaceC6946uO interfaceC6946uOMo5444i = interfaceC6883tOMo2408t.mo5444i(1);
                    C7276zd c7276zd = (interfaceC6946uOMo5444i == null || interfaceC6946uOMo5444i.mo9564d().isEmpty()) ? null : (C7276zd) interfaceC6946uOMo5444i.mo9564d().get(0);
                    if (c7276zd != null) {
                        try {
                            interfaceC8889bj1M17731a = C9150dj1.m17731a(C9017cj1.m10852w1(AbstractC8371Ui1.m8128d(c7276zd)), null);
                        } catch (U90 unused) {
                            AbstractC7806Jm0.m4412f("VideoEncoderInfoImpl");
                        }
                        if (interfaceC8889bj1M17731a != null) {
                            rangeMo10493G = interfaceC8889bj1M17731a.mo10493G();
                        } else {
                            rangeMo10493G = C1551Ye.f14407f;
                        }
                        Range range = rangeMo10493G;
                        Size size = AbstractC9318f21.f27019d;
                        int i = c7276zd.f46901c;
                        int width = size.getWidth();
                        int height = size.getHeight();
                        int i2 = c7276zd.f46906h;
                        int i3 = c7276zd.f46902d;
                        C7213yd c7213ydM26204e = C7213yd.m26204e(interfaceC6946uOMo5444i.mo9561a(), interfaceC6946uOMo5444i.mo9562b(), interfaceC6946uOMo5444i.mo9563c(), Collections.singletonList(new C7276zd(c7276zd.f46899a, c7276zd.f46900b, AbstractC8371Ui1.m8127c(i, i2, i2, i3, i3, width, c7276zd.f46903e, height, c7276zd.f46904f, range), c7276zd.f46902d, size.getWidth(), size.getHeight(), c7276zd.f46905g, c7276zd.f46906h, c7276zd.f46907i, c7276zd.f46908j)));
                        EmptyMap = new HashMap();
                        EmptyMap.put(4, c7213ydM26204e);
                        Size size2 = new Size(c7276zd.f46903e, c7276zd.f46904f);
                        if (size.getHeight() * size.getWidth() > size2.getHeight() * size2.getWidth()) {
                            EmptyMap.put(1, c7213ydM26204e);
                        }
                    }
                }
            } else {
                EmptyMap = Collections.emptyMap();
            }
            if (EmptyMap != 0) {
                c7967Mo1.f7363b = new HashMap((Map) EmptyMap);
            }
        }
        C10910rT1 c10910rT1 = new C10910rT1(c7967Mo1, c9196e41);
        Iterator it = interfaceC6766ro.mo2390b().iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            C0149CM c0149cm = (C0149CM) it.next();
            if (Integer.valueOf(c0149cm.f1336a).equals(3) && c0149cm.f1337b == 10) {
                c10910rT1 = new C10910rT1(c10910rT1);
                break;
            }
        }
        this.f12475c = new C11522wG0(c10910rT1, interfaceC6766ro, c9196e41);
        for (C0149CM c0149cm2 : interfaceC6766ro.mo2390b()) {
            C1121Rp c1121Rp = new C1121Rp(new C10910rT1((C11522wG0) this.f12475c, c0149cm2));
            if (!new ArrayList(c1121Rp.f10436a.keySet()).isEmpty()) {
                ((HashMap) this.f12476d).put(c0149cm2, c1121Rp);
            }
        }
        this.f12474b = interfaceC6766ro.mo2392d();
    }

    public C1338VG(C0214DO c0214do, T11 t11) {
        this.f12473a = 7;
        this.f12477e = new C8030Nu0(2, this);
        this.f12476d = c0214do;
        this.f12475c = t11;
    }

    public C1338VG(C10030kb1 c10030kb1, boolean z) {
        this.f12473a = 9;
        this.f12477e = c10030kb1;
        this.f12476d = new AtomicReference(null);
        this.f12474b = z;
        this.f12475c = new AtomicMarkableReference(new C11447vg0(z ? 8192 : 1024), false);
    }

    public C1338VG(int i) {
        this.f12473a = 4;
        this.f12475c = new long[i];
        this.f12476d = new boolean[i];
        this.f12477e = new int[i];
    }

    public C1338VG(C6736rK c6736rK, C6482nK c6482nK) {
        this.f12473a = 2;
        this.f12477e = c6736rK;
        this.f12475c = c6482nK;
        this.f12476d = c6482nK.f38275e ? null : new boolean[c6736rK.f41520g];
    }

    public C1338VG(C6673qK c6673qK, C6419mK c6419mK) {
        boolean[] zArr;
        this.f12473a = 1;
        this.f12477e = c6673qK;
        this.f12475c = c6419mK;
        if (c6419mK.f37631e) {
            zArr = null;
        } else {
            c6673qK.getClass();
            zArr = new boolean[2];
        }
        this.f12476d = zArr;
    }

    public C1338VG(Spatializer spatializer) {
        this.f12473a = 0;
        this.f12475c = spatializer;
        this.f12474b = spatializer.getImmersiveAudioLevel() != 0;
    }
}
