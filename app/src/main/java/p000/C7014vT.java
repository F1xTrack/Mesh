package p000;

import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import java.io.File;

/* renamed from: vT */
/* loaded from: classes.dex */
public final class C7014vT implements InterfaceC10395nS0 {

    /* renamed from: a */
    public final /* synthetic */ int f44386a;

    @Override // p000.InterfaceC10395nS0
    /* renamed from: a */
    public final /* bridge */ /* synthetic */ boolean mo9107a(Object obj, C7830Jy0 c7830Jy0) {
        switch (this.f44386a) {
            case 0:
                break;
            case 1:
                break;
            default:
                break;
        }
        return true;
    }

    @Override // p000.InterfaceC10395nS0
    /* renamed from: b */
    public final InterfaceC10011kS0 mo9108b(Object obj, int i, int i2, C7830Jy0 c7830Jy0) {
        switch (this.f44386a) {
            case 0:
                return new C4031f5((File) obj);
            case 1:
                return new C4031f5(3, (Bitmap) obj);
            default:
                Drawable drawable = (Drawable) obj;
                if (drawable != null) {
                    return new C9314f10(drawable, 1);
                }
                return null;
        }
    }
}
