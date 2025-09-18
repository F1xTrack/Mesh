package p000;

import android.os.Build;
import android.os.ParcelFileDescriptor;

/* renamed from: ok */
/* loaded from: classes.dex */
public final class C6571ok implements InterfaceC10395nS0 {

    /* renamed from: a */
    public final /* synthetic */ int f39208a;

    /* renamed from: b */
    public final C3984eL f39209b;

    public /* synthetic */ C6571ok(C3984eL c3984eL, int i) {
        this.f39208a = i;
        this.f39209b = c3984eL;
    }

    @Override // p000.InterfaceC10395nS0
    /* renamed from: a */
    public final boolean mo9107a(Object obj, C7830Jy0 c7830Jy0) {
        switch (this.f39208a) {
            case 0:
                this.f39209b.getClass();
                return true;
            default:
                ParcelFileDescriptor parcelFileDescriptor = (ParcelFileDescriptor) obj;
                String str = Build.MANUFACTURER;
                return (!(SystemUtils.PRODUCT_HUAWEI.equalsIgnoreCase(str) || SystemUtils.PRODUCT_HONOR.equalsIgnoreCase(str)) || parcelFileDescriptor.getStatSize() <= 536870912) && !"robolectric".equals(Build.FINGERPRINT);
        }
    }

    @Override // p000.InterfaceC10395nS0
    /* renamed from: b */
    public final InterfaceC10011kS0 mo9108b(Object obj, int i, int i2, C7830Jy0 c7830Jy0) {
        switch (this.f39208a) {
            case 0:
                C3984eL c3984eL = this.f39209b;
                return c3984eL.m17918a(new C10189lr0(obj, (Object) c3984eL.f26674d, (Object) c3984eL.f26673c, 15), i, i2, c7830Jy0, C3984eL.f26669l);
            default:
                C3984eL c3984eL2 = this.f39209b;
                return c3984eL2.m17918a(new C10910rT1((ParcelFileDescriptor) obj, c3984eL2.f26674d, c3984eL2.f26673c), i, i2, c7830Jy0, C3984eL.f26669l);
        }
    }
}
