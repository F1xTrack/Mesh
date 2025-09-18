package defpackage;

import android.hardware.camera2.CameraCharacteristics;
import android.media.ImageWriter;
import androidx.camera.camera2.internal.compat.quirk.ZslDisablerQuirk;

/* renamed from: Vp1 */
/* loaded from: classes.dex */
public final class C1704Vp1 {
    public final C0527Gn a;
    public final C1782Wp1 b;
    public boolean c = false;
    public boolean d = false;
    public final boolean e;
    public final boolean f;
    public MU0 g;
    public C2014Zp h;
    public G70 i;
    public ImageWriter j;

    public C1704Vp1(C0527Gn c0527Gn) {
        boolean z;
        this.e = false;
        this.f = false;
        this.a = c0527Gn;
        int[] iArr = (int[]) c0527Gn.a(CameraCharacteristics.REQUEST_AVAILABLE_CAPABILITIES);
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
        this.e = z;
        this.f = AbstractC7768wJ.a.z0(ZslDisablerQuirk.class) != null;
        this.b = new C1782Wp1(3, new C2199an());
    }
}
