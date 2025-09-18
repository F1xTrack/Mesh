package p000;

import android.hardware.camera2.CameraCharacteristics;
import android.media.ImageWriter;
import androidx.camera.camera2.internal.compat.quirk.ZslDisablerQuirk;

/* renamed from: Vp1 */
/* loaded from: classes.dex */
public final class C8437Vp1 {

    /* renamed from: a */
    public final C0428Gn f12790a;

    /* renamed from: b */
    public final C8489Wp1 f12791b;

    /* renamed from: c */
    public boolean f12792c = false;

    /* renamed from: d */
    public boolean f12793d = false;

    /* renamed from: e */
    public final boolean f12794e;

    /* renamed from: f */
    public final boolean f12795f;

    /* renamed from: g */
    public MU0 f12796g;

    /* renamed from: h */
    public C1625Zp f12797h;

    /* renamed from: i */
    public G70 f12798i;

    /* renamed from: j */
    public ImageWriter f12799j;

    public C8437Vp1(C0428Gn c0428Gn) {
        boolean z;
        this.f12794e = false;
        this.f12795f = false;
        this.f12790a = c0428Gn;
        int[] iArr = (int[]) c0428Gn.m3155a(CameraCharacteristics.REQUEST_AVAILABLE_CAPABILITIES);
        if (iArr != null) {
            for (int i : iArr) {
                if (i == 4) {
                    z = true;
                    break;
                }
            }
            z = false;
        } else {
            z = false;
        }
        this.f12794e = z;
        this.f12795f = AbstractC7067wJ.f44776a.m17864z0(ZslDisablerQuirk.class) != null;
        this.f12791b = new C8489Wp1(3, new C1686an());
    }
}
