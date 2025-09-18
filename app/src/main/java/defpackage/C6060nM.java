package defpackage;

import android.graphics.Bitmap;

/* renamed from: nM, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C6060nM implements InterfaceC5744li {
    @Override // defpackage.InterfaceC7986xS0
    public final void d(Object obj) {
        Bitmap bitmap = (Bitmap) obj;
        O90.f(bitmap, "value");
        bitmap.recycle();
    }

    @Override // defpackage.InterfaceC2470cC0
    public final Object get(int i) {
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(1, (int) Math.ceil(i / 2.0d), Bitmap.Config.RGB_565);
        O90.e(bitmapCreateBitmap, "createBitmap(\n          …   Bitmap.Config.RGB_565)");
        return bitmapCreateBitmap;
    }
}
