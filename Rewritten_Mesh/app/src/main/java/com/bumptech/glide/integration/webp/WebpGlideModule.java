package com.bumptech.glide.integration.webp;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.util.DisplayMetrics;
import com.bumptech.glide.ComponentCallbacks2C1874a;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import p000.C10;
import p000.C10478o51;
import p000.C11967zm0;
import p000.C1491Xh;
import p000.C3968e5;
import p000.C6508nk;
import p000.C6699qk;
import p000.C7094wk;
import p000.C7356Av0;
import p000.C8431Vm1;
import p000.C8483Wm1;
import p000.C9239eQ0;
import p000.InterfaceC10395nS0;
import p000.InterfaceC6443mi;

@Deprecated
/* loaded from: classes.dex */
public class WebpGlideModule implements C10 {
    @Override // p000.C10
    /* renamed from: a */
    public final void mo946a(Context context, ComponentCallbacks2C1874a componentCallbacks2C1874a, C9239eQ0 c9239eQ0) {
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
