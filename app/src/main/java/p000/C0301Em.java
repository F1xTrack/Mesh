package p000;

import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.params.StreamConfigurationMap;
import android.util.Pair;
import android.util.Range;
import android.util.Size;
import androidx.lifecycle.AbstractC1743b;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Objects;
import java.util.Set;
import java.util.concurrent.Executor;

/* renamed from: Em */
/* loaded from: classes.dex */
public final class C0301Em implements InterfaceC6766ro {

    /* renamed from: a */
    public final String f2885a;

    /* renamed from: b */
    public final C0428Gn f2886b;

    /* renamed from: c */
    public final G10 f2887c;

    /* renamed from: e */
    public C6573om f2889e;

    /* renamed from: h */
    public final C0238Dm f2892h;

    /* renamed from: j */
    public final C9196e41 f2894j;

    /* renamed from: k */
    public final C1396WB f2895k;

    /* renamed from: l */
    public final C7161xo f2896l;

    /* renamed from: d */
    public final Object f2888d = new Object();

    /* renamed from: f */
    public C0238Dm f2890f = null;

    /* renamed from: g */
    public C0238Dm f2891g = null;

    /* renamed from: i */
    public ArrayList f2893i = null;

    public C0301Em(C7161xo c7161xo, String str) {
        str.getClass();
        this.f2885a = str;
        this.f2896l = c7161xo;
        C0428Gn c0428GnM25939b = c7161xo.m25939b(str);
        this.f2886b = c0428GnM25939b;
        G10 g10 = new G10(6, false);
        g10.f3531b = this;
        this.f2887c = g10;
        C9196e41 c9196e41M22212b = AbstractC10010kR1.m22212b(c0428GnM25939b);
        this.f2894j = c9196e41M22212b;
        this.f2895k = new C1396WB(str, c9196e41M22212b);
        this.f2892h = new C0238Dm(new C7275zc(5, null));
    }

    /* renamed from: A */
    public final LinkedHashMap m2387A() {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        C0428Gn c0428Gn = this.f2886b;
        CameraCharacteristics cameraCharacteristics = (CameraCharacteristics) c0428Gn.f3890b.f9619a;
        String str = this.f2885a;
        linkedHashMap.put(str, cameraCharacteristics);
        for (String str2 : c0428Gn.f3890b.mo2777I()) {
            if (!Objects.equals(str2, str)) {
                try {
                    linkedHashMap.put(str2, (CameraCharacteristics) this.f2896l.m25939b(str2).f3890b.f9619a);
                } catch (C6448mn unused) {
                    AbstractC7806Jm0.m4412f("Camera2CameraInfo");
                }
            }
        }
        return linkedHashMap;
    }

    /* renamed from: B */
    public final void m2388B(C6573om c6573om) {
        synchronized (this.f2888d) {
            try {
                this.f2889e = c6573om;
                C0238Dm c0238Dm = this.f2891g;
                if (c0238Dm != null) {
                    c0238Dm.m1871l((C7560Et0) c6573om.f39236h.f16686f);
                }
                C0238Dm c0238Dm2 = this.f2890f;
                if (c0238Dm2 != null) {
                    c0238Dm2.m1871l(this.f2889e.f39237i.f43159b);
                }
                ArrayList arrayList = this.f2893i;
                if (arrayList != null) {
                    Iterator it = arrayList.iterator();
                    while (it.hasNext()) {
                        Pair pair = (Pair) it.next();
                        C6573om c6573om2 = this.f2889e;
                        Executor executor = (Executor) pair.second;
                        AbstractC6511nn abstractC6511nn = (AbstractC6511nn) pair.first;
                        c6573om2.getClass();
                        c6573om2.f39230b.execute(new RunnableC8339Ts1(c6573om2, executor, abstractC6511nn, 8));
                    }
                    this.f2893i = null;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        ((Integer) this.f2886b.m3155a(CameraCharacteristics.INFO_SUPPORTED_HARDWARE_LEVEL)).getClass();
        AbstractC7806Jm0.m4412f("Camera2CameraInfo");
    }

    @Override // p000.InterfaceC6766ro
    /* renamed from: a */
    public final AbstractC1743b mo2389a() {
        return this.f2892h;
    }

    @Override // p000.InterfaceC6766ro
    /* renamed from: b */
    public final Set mo2390b() {
        return ((InterfaceC0401GM) C8342Tu0.m7803q0(this.f2886b).f11590b).mo3042b();
    }

    @Override // p000.InterfaceC6766ro
    /* renamed from: c */
    public final int mo2391c() {
        return mo2404p(0);
    }

    @Override // p000.InterfaceC6766ro
    /* renamed from: d */
    public final boolean mo2392d() {
        int[] iArr = (int[]) this.f2886b.m3155a(CameraCharacteristics.CONTROL_AVAILABLE_VIDEO_STABILIZATION_MODES);
        if (iArr != null) {
            for (int i : iArr) {
                if (i == 1) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // p000.InterfaceC6766ro
    /* renamed from: e */
    public final String mo2393e() {
        return this.f2885a;
    }

    @Override // p000.InterfaceC6766ro
    /* renamed from: f */
    public final AbstractC1743b mo2394f() {
        synchronized (this.f2888d) {
            try {
                C6573om c6573om = this.f2889e;
                if (c6573om == null) {
                    if (this.f2890f == null) {
                        this.f2890f = new C0238Dm(0);
                    }
                    return this.f2890f;
                }
                C0238Dm c0238Dm = this.f2890f;
                if (c0238Dm != null) {
                    return c0238Dm;
                }
                return c6573om.f39237i.f43159b;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // p000.InterfaceC6766ro
    /* renamed from: g */
    public final InterfaceC6766ro mo2395g() {
        return this;
    }

    @Override // p000.InterfaceC6766ro
    /* renamed from: h */
    public final InterfaceC6949uR mo2396h() {
        synchronized (this.f2888d) {
            try {
                C6573om c6573om = this.f2889e;
                if (c6573om == null) {
                    return new C1356VY(this.f2886b);
                }
                return (C1356VY) c6573om.f39238j.f16684d;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // p000.InterfaceC6766ro
    /* renamed from: i */
    public final boolean mo2397i(C0974PT c0974pt) {
        synchronized (this.f2888d) {
            try {
                C6573om c6573om = this.f2889e;
                if (c6573om == null) {
                    return false;
                }
                return c6573om.f39235g.m3079e(c0974pt);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // p000.InterfaceC6766ro
    /* renamed from: j */
    public final int mo2398j() {
        Integer num = (Integer) this.f2886b.m3155a(CameraCharacteristics.LENS_FACING);
        AbstractC9104dM1.m17545d("Unable to get the lens facing of the camera.", num != null);
        int iIntValue = num.intValue();
        if (iIntValue == 0) {
            return 0;
        }
        if (iIntValue == 1) {
            return 1;
        }
        if (iIntValue == 2) {
            return 2;
        }
        throw new IllegalArgumentException(AbstractC7222ym.m26230g(iIntValue, "The given lens facing integer: ", " can not be recognized."));
    }

    @Override // p000.InterfaceC6766ro
    /* renamed from: k */
    public final Set mo2399k() {
        Range[] rangeArr = (Range[]) this.f2886b.m3155a(CameraCharacteristics.CONTROL_AE_AVAILABLE_TARGET_FPS_RANGES);
        return rangeArr != null ? new HashSet(Arrays.asList(rangeArr)) : Collections.emptySet();
    }

    @Override // p000.InterfaceC6766ro
    /* renamed from: l */
    public final EnumC11690xa1 mo2400l() {
        Integer num = (Integer) this.f2886b.m3155a(CameraCharacteristics.SENSOR_INFO_TIMESTAMP_SOURCE);
        num.getClass();
        return num.intValue() != 1 ? EnumC11690xa1.f45684a : EnumC11690xa1.f45685b;
    }

    @Override // p000.InterfaceC6766ro
    /* renamed from: m */
    public final C0555Io mo2401m() {
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        linkedHashSet.add(new C6703qo(0, this));
        linkedHashSet.add(new C11578wi0(mo2398j()));
        return new C0555Io(linkedHashSet);
    }

    @Override // p000.InterfaceC6766ro
    /* renamed from: n */
    public final String mo2402n() {
        Integer num = (Integer) this.f2886b.m3155a(CameraCharacteristics.INFO_SUPPORTED_HARDWARE_LEVEL);
        num.getClass();
        return num.intValue() == 2 ? "androidx.camera.camera2.legacy" : "androidx.camera.camera2";
    }

    @Override // p000.InterfaceC6766ro
    /* renamed from: o */
    public final List mo2403o(int i) {
        C8071Oo1 c8071Oo1M3156b = this.f2886b.m3156b();
        HashMap map = (HashMap) c8071Oo1M3156b.f8630d;
        Size[] sizeArr = null;
        if (!map.containsKey(Integer.valueOf(i))) {
            Size[] highResolutionOutputSizes = ((StreamConfigurationMap) ((C10525oT0) c8071Oo1M3156b.f8627a).f39025a).getHighResolutionOutputSizes(i);
            if (highResolutionOutputSizes != null && highResolutionOutputSizes.length > 0) {
                highResolutionOutputSizes = ((C1339VH) c8071Oo1M3156b.f8628b).m8365g(highResolutionOutputSizes, i);
            }
            map.put(Integer.valueOf(i), highResolutionOutputSizes);
            if (highResolutionOutputSizes != null) {
                sizeArr = (Size[]) highResolutionOutputSizes.clone();
            }
        } else if (((Size[]) map.get(Integer.valueOf(i))) != null) {
            sizeArr = (Size[]) ((Size[]) map.get(Integer.valueOf(i))).clone();
        }
        return sizeArr != null ? Arrays.asList(sizeArr) : Collections.emptyList();
    }

    @Override // p000.InterfaceC6766ro
    /* renamed from: p */
    public final int mo2404p(int i) {
        Integer num = (Integer) this.f2886b.m3155a(CameraCharacteristics.SENSOR_ORIENTATION);
        num.getClass();
        return AbstractC9754iR1.m19038b(AbstractC9754iR1.m19040d(i), num.intValue(), 1 == mo2398j());
    }

    @Override // p000.InterfaceC6766ro
    /* renamed from: q */
    public final Object mo2405q() {
        return (CameraCharacteristics) this.f2886b.f3890b.f9619a;
    }

    @Override // p000.InterfaceC6766ro
    /* renamed from: r */
    public final boolean mo2406r() {
        C0428Gn c0428Gn = this.f2886b;
        Objects.requireNonNull(c0428Gn);
        return AbstractC9444g12.m18382b(new C0071B7(5, c0428Gn));
    }

    @Override // p000.InterfaceC6766ro
    /* renamed from: s */
    public final void mo2407s(ExecutorC1215TJ executorC1215TJ, C6384lm c6384lm) {
        synchronized (this.f2888d) {
            try {
                C6573om c6573om = this.f2889e;
                if (c6573om != null) {
                    c6573om.f39230b.execute(new RunnableC8339Ts1(c6573om, executorC1215TJ, c6384lm, 8));
                } else {
                    if (this.f2893i == null) {
                        this.f2893i = new ArrayList();
                    }
                    this.f2893i.add(new Pair(c6384lm, executorC1215TJ));
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // p000.InterfaceC6766ro
    /* renamed from: t */
    public final InterfaceC6883tO mo2408t() {
        return this.f2895k;
    }

    @Override // p000.InterfaceC6766ro
    /* renamed from: u */
    public final Object mo2409u(String str) {
        try {
            if (this.f2886b.f3890b.mo2777I().contains(str)) {
                return (CameraCharacteristics) this.f2896l.m25939b(str).f3890b.f9619a;
            }
            return null;
        } catch (C6448mn unused) {
            AbstractC7806Jm0.m4412f("Camera2CameraInfo");
            return null;
        }
    }

    @Override // p000.InterfaceC6766ro
    /* renamed from: v */
    public final C9196e41 mo2410v() {
        return this.f2894j;
    }

    @Override // p000.InterfaceC6766ro
    /* renamed from: w */
    public final List mo2411w(int i) {
        Size[] sizeArrM6155v = this.f2886b.m3156b().m6155v(i);
        return sizeArrM6155v != null ? Arrays.asList(sizeArrM6155v) : Collections.emptyList();
    }

    @Override // p000.InterfaceC6766ro
    /* renamed from: x */
    public final AbstractC1743b mo2412x() {
        synchronized (this.f2888d) {
            try {
                C6573om c6573om = this.f2889e;
                if (c6573om != null) {
                    C0238Dm c0238Dm = this.f2891g;
                    if (c0238Dm != null) {
                        return c0238Dm;
                    }
                    return (C7560Et0) c6573om.f39236h.f16686f;
                }
                if (this.f2891g == null) {
                    InterfaceC8281Sp1 interfaceC8281Sp1M10383e = C1753aw.m10383e(this.f2886b);
                    C8385Up1 c8385Up1 = new C8385Up1(interfaceC8281Sp1M10383e.getMaxZoom(), interfaceC8281Sp1M10383e.getMinZoom());
                    c8385Up1.m8186d(1.0f);
                    this.f2891g = new C0238Dm(C0984Pd.m6387d(c8385Up1));
                }
                return this.f2891g;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // p000.InterfaceC6766ro
    /* renamed from: y */
    public final boolean mo2413y() {
        int[] iArr = (int[]) this.f2886b.m3155a(CameraCharacteristics.CONTROL_AVAILABLE_VIDEO_STABILIZATION_MODES);
        if (iArr != null) {
            for (int i : iArr) {
                if (i == 2) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // p000.InterfaceC6766ro
    /* renamed from: z */
    public final void mo2414z(AbstractC6511nn abstractC6511nn) {
        synchronized (this.f2888d) {
            try {
                C6573om c6573om = this.f2889e;
                if (c6573om != null) {
                    c6573om.f39230b.execute(new RunnableC6720r4(c6573om, 16, abstractC6511nn));
                    return;
                }
                ArrayList arrayList = this.f2893i;
                if (arrayList == null) {
                    return;
                }
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    if (((Pair) it.next()).first == abstractC6511nn) {
                        it.remove();
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
