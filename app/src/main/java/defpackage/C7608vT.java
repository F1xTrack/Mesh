package defpackage;

import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import java.io.File;

/* renamed from: vT, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C7608vT implements InterfaceC6079nS0 {
    public final /* synthetic */ int a;

    @Override // defpackage.InterfaceC6079nS0
    public final /* bridge */ /* synthetic */ boolean a(Object obj, C0795Jy0 c0795Jy0) {
        switch (this.a) {
            case 0:
                break;
            case 1:
                break;
            default:
                break;
        }
        return true;
    }

    @Override // defpackage.InterfaceC6079nS0
    public final InterfaceC5506kS0 b(Object obj, int i, int i2, C0795Jy0 c0795Jy0) {
        switch (this.a) {
            case 0:
                return new C3705f5((File) obj);
            case 1:
                return new C3705f5(3, (Bitmap) obj);
            default:
                Drawable drawable = (Drawable) obj;
                if (drawable != null) {
                    return new C3691f10(drawable, 1);
                }
                return null;
        }
    }
}
