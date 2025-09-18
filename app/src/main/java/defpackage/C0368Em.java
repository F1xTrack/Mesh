package defpackage;

import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.params.StreamConfigurationMap;
import android.util.Pair;
import android.util.Range;
import android.util.Size;
import androidx.lifecycle.b;
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
public final class C0368Em implements InterfaceC6907ro {
    public final String a;
    public final C0527Gn b;
    public final G10 c;
    public C6329om e;
    public final C0290Dm h;
    public final C3513e41 j;
    public final WB k;
    public final C8051xo l;
    public final Object d = new Object();
    public C0290Dm f = null;
    public C0290Dm g = null;
    public ArrayList i = null;

    public C0368Em(C8051xo c8051xo, String str) {
        str.getClass();
        this.a = str;
        this.l = c8051xo;
        C0527Gn c0527GnB = c8051xo.b(str);
        this.b = c0527GnB;
        G10 g10 = new G10(6, false);
        g10.b = this;
        this.c = g10;
        C3513e41 c3513e41B = AbstractC5504kR1.b(c0527GnB);
        this.j = c3513e41B;
        this.k = new WB(str, c3513e41B);
        this.h = new C0290Dm(new C8395zc(5, null));
    }

    public final LinkedHashMap A() {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        C0527Gn c0527Gn = this.b;
        CameraCharacteristics cameraCharacteristics = (CameraCharacteristics) c0527Gn.b.a;
        String str = this.a;
        linkedHashMap.put(str, cameraCharacteristics);
        for (String str2 : c0527Gn.b.I()) {
            if (!Objects.equals(str2, str)) {
                try {
                    linkedHashMap.put(str2, (CameraCharacteristics) this.l.b(str2).b.a);
                } catch (C5950mn unused) {
                    AbstractC0759Jm0.f("Camera2CameraInfo");
                }
            }
        }
        return linkedHashMap;
    }

    public final void B(C6329om c6329om) {
        synchronized (this.d) {
            try {
                this.e = c6329om;
                C0290Dm c0290Dm = this.g;
                if (c0290Dm != null) {
                    c0290Dm.l((C0390Et0) c6329om.h.f);
                }
                C0290Dm c0290Dm2 = this.f;
                if (c0290Dm2 != null) {
                    c0290Dm2.l(this.e.i.b);
                }
                ArrayList arrayList = this.i;
                if (arrayList != null) {
                    Iterator it = arrayList.iterator();
                    while (it.hasNext()) {
                        Pair pair = (Pair) it.next();
                        C6329om c6329om2 = this.e;
                        Executor executor = (Executor) pair.second;
                        AbstractC6141nn abstractC6141nn = (AbstractC6141nn) pair.first;
                        c6329om2.getClass();
                        c6329om2.b.execute(new RunnableC1557Ts1(c6329om2, executor, abstractC6141nn, 8));
                    }
                    this.i = null;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        ((Integer) this.b.a(CameraCharacteristics.INFO_SUPPORTED_HARDWARE_LEVEL)).getClass();
        AbstractC0759Jm0.f("Camera2CameraInfo");
    }

    @Override // defpackage.InterfaceC6907ro
    public final b a() {
        return this.h;
    }

    @Override // defpackage.InterfaceC6907ro
    public final Set b() {
        return ((GM) C1562Tu0.q0(this.b).b).b();
    }

    @Override // defpackage.InterfaceC6907ro
    public final int c() {
        return p(0);
    }

    @Override // defpackage.InterfaceC6907ro
    public final boolean d() {
        int[] iArr = (int[]) this.b.a(CameraCharacteristics.CONTROL_AVAILABLE_VIDEO_STABILIZATION_MODES);
        if (iArr != null) {
            for (int i : iArr) {
                if (i == 1) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // defpackage.InterfaceC6907ro
    public final String e() {
        return this.a;
    }

    @Override // defpackage.InterfaceC6907ro
    public final b f() {
        synchronized (this.d) {
            try {
                C6329om c6329om = this.e;
                if (c6329om == null) {
                    if (this.f == null) {
                        this.f = new C0290Dm(0);
                    }
                    return this.f;
                }
                C0290Dm c0290Dm = this.f;
                if (c0290Dm != null) {
                    return c0290Dm;
                }
                return c6329om.i.b;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // defpackage.InterfaceC6907ro
    public final InterfaceC6907ro g() {
        return this;
    }

    @Override // defpackage.InterfaceC6907ro
    public final InterfaceC7411uR h() {
        synchronized (this.d) {
            try {
                C6329om c6329om = this.e;
                if (c6329om == null) {
                    return new VY(this.b);
                }
                return (VY) c6329om.j.d;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // defpackage.InterfaceC6907ro
    public final boolean i(PT pt) {
        synchronized (this.d) {
            try {
                C6329om c6329om = this.e;
                if (c6329om == null) {
                    return false;
                }
                return c6329om.g.e(pt);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // defpackage.InterfaceC6907ro
    public final int j() {
        Integer num = (Integer) this.b.a(CameraCharacteristics.LENS_FACING);
        AbstractC3377dM1.d("Unable to get the lens facing of the camera.", num != null);
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
        throw new IllegalArgumentException(AbstractC8235ym.g(iIntValue, "The given lens facing integer: ", " can not be recognized."));
    }

    @Override // defpackage.InterfaceC6907ro
    public final Set k() {
        Range[] rangeArr = (Range[]) this.b.a(CameraCharacteristics.CONTROL_AE_AVAILABLE_TARGET_FPS_RANGES);
        return rangeArr != null ? new HashSet(Arrays.asList(rangeArr)) : Collections.emptySet();
    }

    @Override // defpackage.InterfaceC6907ro
    public final EnumC8011xa1 l() {
        Integer num = (Integer) this.b.a(CameraCharacteristics.SENSOR_INFO_TIMESTAMP_SOURCE);
        num.getClass();
        return num.intValue() != 1 ? EnumC8011xa1.a : EnumC8011xa1.b;
    }

    @Override // defpackage.InterfaceC6907ro
    public final C0686Io m() {
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        linkedHashSet.add(new C6717qo(0, this));
        linkedHashSet.add(new C7844wi0(j()));
        return new C0686Io(linkedHashSet);
    }

    @Override // defpackage.InterfaceC6907ro
    public final String n() {
        Integer num = (Integer) this.b.a(CameraCharacteristics.INFO_SUPPORTED_HARDWARE_LEVEL);
        num.getClass();
        return num.intValue() == 2 ? "androidx.camera.camera2.legacy" : "androidx.camera.camera2";
    }

    @Override // defpackage.InterfaceC6907ro
    public final List o(int i) {
        C1155Oo1 c1155Oo1B = this.b.b();
        HashMap map = (HashMap) c1155Oo1B.d;
        Size[] sizeArr = null;
        if (!map.containsKey(Integer.valueOf(i))) {
            Size[] highResolutionOutputSizes = ((StreamConfigurationMap) ((C6273oT0) c1155Oo1B.a).a).getHighResolutionOutputSizes(i);
            if (highResolutionOutputSizes != null && highResolutionOutputSizes.length > 0) {
                highResolutionOutputSizes = ((VH) c1155Oo1B.b).g(highResolutionOutputSizes, i);
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

    @Override // defpackage.InterfaceC6907ro
    public final int p(int i) {
        Integer num = (Integer) this.b.a(CameraCharacteristics.SENSOR_ORIENTATION);
        num.getClass();
        return AbstractC4346iR1.b(AbstractC4346iR1.d(i), num.intValue(), 1 == j());
    }

    @Override // defpackage.InterfaceC6907ro
    public final Object q() {
        return (CameraCharacteristics) this.b.b.a;
    }

    @Override // defpackage.InterfaceC6907ro
    public final boolean r() {
        C0527Gn c0527Gn = this.b;
        Objects.requireNonNull(c0527Gn);
        return AbstractC3884g12.b(new B7(5, c0527Gn));
    }

    @Override // defpackage.InterfaceC6907ro
    public final void s(TJ tj, C5756lm c5756lm) {
        synchronized (this.d) {
            try {
                C6329om c6329om = this.e;
                if (c6329om != null) {
                    c6329om.b.execute(new RunnableC1557Ts1(c6329om, tj, c5756lm, 8));
                } else {
                    if (this.i == null) {
                        this.i = new ArrayList();
                    }
                    this.i.add(new Pair(c5756lm, tj));
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // defpackage.InterfaceC6907ro
    public final InterfaceC7211tO t() {
        return this.k;
    }

    @Override // defpackage.InterfaceC6907ro
    public final Object u(String str) {
        try {
            if (this.b.b.I().contains(str)) {
                return (CameraCharacteristics) this.l.b(str).b.a;
            }
            return null;
        } catch (C5950mn unused) {
            AbstractC0759Jm0.f("Camera2CameraInfo");
            return null;
        }
    }

    @Override // defpackage.InterfaceC6907ro
    public final C3513e41 v() {
        return this.j;
    }

    @Override // defpackage.InterfaceC6907ro
    public final List w(int i) {
        Size[] sizeArrV = this.b.b().v(i);
        return sizeArrV != null ? Arrays.asList(sizeArrV) : Collections.emptyList();
    }

    @Override // defpackage.InterfaceC6907ro
    public final b x() {
        synchronized (this.d) {
            try {
                C6329om c6329om = this.e;
                if (c6329om != null) {
                    C0290Dm c0290Dm = this.g;
                    if (c0290Dm != null) {
                        return c0290Dm;
                    }
                    return (C0390Et0) c6329om.h.f;
                }
                if (this.g == null) {
                    InterfaceC1470Sp1 interfaceC1470Sp1E = C2226aw.e(this.b);
                    C1626Up1 c1626Up1 = new C1626Up1(interfaceC1470Sp1E.getMaxZoom(), interfaceC1470Sp1E.getMinZoom());
                    c1626Up1.d(1.0f);
                    this.g = new C0290Dm(C1198Pd.d(c1626Up1));
                }
                return this.g;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // defpackage.InterfaceC6907ro
    public final boolean y() {
        int[] iArr = (int[]) this.b.a(CameraCharacteristics.CONTROL_AVAILABLE_VIDEO_STABILIZATION_MODES);
        if (iArr != null) {
            for (int i : iArr) {
                if (i == 2) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // defpackage.InterfaceC6907ro
    public final void z(AbstractC6141nn abstractC6141nn) {
        synchronized (this.d) {
            try {
                C6329om c6329om = this.e;
                if (c6329om != null) {
                    c6329om.b.execute(new RunnableC6769r4(c6329om, 16, abstractC6141nn));
                    return;
                }
                ArrayList arrayList = this.i;
                if (arrayList == null) {
                    return;
                }
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    if (((Pair) it.next()).first == abstractC6141nn) {
                        it.remove();
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
