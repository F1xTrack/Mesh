package p000;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.util.DisplayMetrics;
import com.bumptech.glide.ComponentCallbacks2C1874a;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.ArrayList;

/* renamed from: dn1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C9158dn1 extends AbstractC11705xi0 {
    @Override // p000.AbstractC11705xi0
    public final void registerComponents(Context context, ComponentCallbacks2C1874a componentCallbacks2C1874a, C9239eQ0 c9239eQ0) {
        Resources resources = context.getResources();
        InterfaceC6443mi interfaceC6443mi = componentCallbacks2C1874a.f17774b;
        ArrayList arrayListM17932f = c9239eQ0.m17932f();
        DisplayMetrics displayMetrics = resources.getDisplayMetrics();
        C11967zm0 c11967zm0 = componentCallbacks2C1874a.f17777e;
        C8431Vm1 c8431Vm1 = new C8431Vm1(arrayListM17932f, displayMetrics, interfaceC6443mi, c11967zm0);
        C3968e5 c3968e5 = new C3968e5(c11967zm0, interfaceC6443mi);
        InterfaceC10395nS0 c6699qk = new C6699qk(c8431Vm1, 0);
        InterfaceC10395nS0 c6699qk2 = new C6699qk(c8431Vm1, 1);
        C7094wk c7094wk = new C7094wk(context, c11967zm0, interfaceC6443mi);
        c9239eQ0.m17936j("Bitmap", ByteBuffer.class, Bitmap.class, c6699qk);
        c9239eQ0.m17936j("Bitmap", InputStream.class, Bitmap.class, c6699qk2);
        c9239eQ0.m17936j("BitmapDrawable", ByteBuffer.class, BitmapDrawable.class, new C1491Xh(resources, c6699qk));
        c9239eQ0.m17936j("BitmapDrawable", InputStream.class, BitmapDrawable.class, new C1491Xh(resources, c6699qk2));
        c9239eQ0.m17936j("Bitmap", ByteBuffer.class, Bitmap.class, new C6508nk(c3968e5, 0));
        c9239eQ0.m17936j("Bitmap", InputStream.class, Bitmap.class, new C6508nk(c3968e5, 1));
        c9239eQ0.m17936j("legacy_prepend_all", ByteBuffer.class, C8483Wm1.class, c7094wk);
        c9239eQ0.m17936j("legacy_prepend_all", InputStream.class, C8483Wm1.class, new C10478o51(c7094wk, c11967zm0));
        c9239eQ0.m17935i(new C7356Av0(23));
    }
}
