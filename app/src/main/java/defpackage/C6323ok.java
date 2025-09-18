package defpackage;

import android.os.Build;
import android.os.ParcelFileDescriptor;

/* renamed from: ok, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C6323ok implements InterfaceC6079nS0 {
    public final /* synthetic */ int a;
    public final C3562eL b;

    public /* synthetic */ C6323ok(C3562eL c3562eL, int i) {
        this.a = i;
        this.b = c3562eL;
    }

    @Override // defpackage.InterfaceC6079nS0
    public final boolean a(Object obj, C0795Jy0 c0795Jy0) {
        switch (this.a) {
            case 0:
                this.b.getClass();
                return true;
            default:
                ParcelFileDescriptor parcelFileDescriptor = (ParcelFileDescriptor) obj;
                String str = Build.MANUFACTURER;
                return (!(SystemUtils.PRODUCT_HUAWEI.equalsIgnoreCase(str) || SystemUtils.PRODUCT_HONOR.equalsIgnoreCase(str)) || parcelFileDescriptor.getStatSize() <= 536870912) && !"robolectric".equals(Build.FINGERPRINT);
        }
    }

    @Override // defpackage.InterfaceC6079nS0
    public final InterfaceC5506kS0 b(Object obj, int i, int i2, C0795Jy0 c0795Jy0) {
        switch (this.a) {
            case 0:
                C3562eL c3562eL = this.b;
                return c3562eL.a(new C5772lr0(obj, (Object) c3562eL.d, (Object) c3562eL.c, 15), i, i2, c0795Jy0, C3562eL.l);
            default:
                C3562eL c3562eL2 = this.b;
                return c3562eL2.a(new C6846rT1((ParcelFileDescriptor) obj, c3562eL2.d, c3562eL2.c), i, i2, c0795Jy0, C3562eL.l);
        }
    }
}
