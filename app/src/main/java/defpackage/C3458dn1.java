package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.util.DisplayMetrics;
import com.bumptech.glide.a;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.ArrayList;

/* renamed from: dn1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C3458dn1 extends AbstractC8034xi0 {
    @Override // defpackage.AbstractC8034xi0
    public final void registerComponents(Context context, a aVar, C3578eQ0 c3578eQ0) {
        Resources resources = context.getResources();
        InterfaceC5935mi interfaceC5935mi = aVar.b;
        ArrayList arrayListF = c3578eQ0.f();
        DisplayMetrics displayMetrics = resources.getDisplayMetrics();
        C8426zm0 c8426zm0 = aVar.e;
        C1695Vm1 c1695Vm1 = new C1695Vm1(arrayListF, displayMetrics, interfaceC5935mi, c8426zm0);
        C3514e5 c3514e5 = new C3514e5(c8426zm0, interfaceC5935mi);
        InterfaceC6079nS0 c6705qk = new C6705qk(c1695Vm1, 0);
        InterfaceC6079nS0 c6705qk2 = new C6705qk(c1695Vm1, 1);
        C7849wk c7849wk = new C7849wk(context, c8426zm0, interfaceC5935mi);
        c3578eQ0.j("Bitmap", ByteBuffer.class, Bitmap.class, c6705qk);
        c3578eQ0.j("Bitmap", InputStream.class, Bitmap.class, c6705qk2);
        c3578eQ0.j("BitmapDrawable", ByteBuffer.class, BitmapDrawable.class, new C1834Xh(resources, c6705qk));
        c3578eQ0.j("BitmapDrawable", InputStream.class, BitmapDrawable.class, new C1834Xh(resources, c6705qk2));
        c3578eQ0.j("Bitmap", ByteBuffer.class, Bitmap.class, new C6132nk(c3514e5, 0));
        c3578eQ0.j("Bitmap", InputStream.class, Bitmap.class, new C6132nk(c3514e5, 1));
        c3578eQ0.j("legacy_prepend_all", ByteBuffer.class, C1773Wm1.class, c7849wk);
        c3578eQ0.j("legacy_prepend_all", InputStream.class, C1773Wm1.class, new C6202o51(c7849wk, c8426zm0));
        c3578eQ0.i(new C0084Av0(23));
    }
}
