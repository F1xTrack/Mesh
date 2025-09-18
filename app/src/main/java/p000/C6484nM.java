package p000;

import android.graphics.Bitmap;

/* renamed from: nM */
/* loaded from: classes.dex */
public final class C6484nM implements InterfaceC6380li {
    @Override // p000.InterfaceC11673xS0
    /* renamed from: d */
    public final void mo2828d(Object obj) {
        Bitmap bitmap = (Bitmap) obj;
        O90.m5968f(bitmap, "value");
        bitmap.recycle();
    }

    @Override // p000.InterfaceC8950cC0
    public final Object get(int i) {
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(1, (int) Math.ceil(i / 2.0d), Bitmap.Config.RGB_565);
        O90.m5967e(bitmapCreateBitmap, "createBitmap(\n          …   Bitmap.Config.RGB_565)");
        return bitmapCreateBitmap;
    }
}
