package defpackage;

import android.content.ContentResolver;
import android.content.Context;
import android.content.res.AssetFileDescriptor;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Build;
import android.os.ParcelFileDescriptor;
import com.bumptech.glide.a;
import java.io.File;
import java.io.InputStream;
import java.net.URL;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* loaded from: classes.dex */
public abstract class YP1 {
    public static C3578eQ0 a(a aVar, List list, F7 f7) {
        InterfaceC6079nS0 c6323ok;
        InterfaceC6079nS0 c1834Xh;
        int i;
        InterfaceC5935mi interfaceC5935mi;
        String str;
        InterfaceC5935mi interfaceC5935mi2 = aVar.b;
        C7903x10 c7903x10 = aVar.d;
        Context applicationContext = c7903x10.getApplicationContext();
        C1016Mu0 c1016Mu0 = c7903x10.h;
        C3578eQ0 c3578eQ0 = new C3578eQ0();
        PF pf = new PF();
        I60 i60 = c3578eQ0.g;
        synchronized (i60) {
            i60.a.add(pf);
        }
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 27) {
            c3578eQ0.l(new C8169yQ());
        }
        Resources resources = applicationContext.getResources();
        ArrayList arrayListF = c3578eQ0.f();
        C8426zm0 c8426zm0 = aVar.e;
        C7086sk c7086sk = new C7086sk(applicationContext, arrayListF, interfaceC5935mi2, c8426zm0);
        InterfaceC6079nS0 c1917Yi1 = new C1917Yi1(interfaceC5935mi2, new C7532v32(22));
        C3562eL c3562eL = new C3562eL(c3578eQ0.f(), resources.getDisplayMetrics(), interfaceC5935mi2, c8426zm0);
        if (i2 < 28 || !((Map) c1016Mu0.b).containsKey(AbstractC6949s10.class)) {
            c6323ok = new C6323ok(c3562eL, 0);
            c1834Xh = new C1834Xh(c3562eL, 2, c8426zm0);
        } else {
            c1834Xh = new C6514pk(1);
            c6323ok = new C6514pk(0);
        }
        if (i2 >= 28) {
            i = i2;
            interfaceC5935mi = interfaceC5935mi2;
            c3578eQ0.d("Animation", InputStream.class, Drawable.class, new C3896g5(new CC0(arrayListF, 3, c8426zm0), 1));
            c3578eQ0.d("Animation", ByteBuffer.class, Drawable.class, new C3896g5(new CC0(arrayListF, 3, c8426zm0), 0));
        } else {
            i = i2;
            interfaceC5935mi = interfaceC5935mi2;
        }
        InterfaceC6079nS0 c6461pS0 = new C6461pS0(applicationContext);
        InterfaceC7493us0 c7224tS0 = new C7224tS0(resources, 2);
        InterfaceC7493us0 c7224tS02 = new C7224tS0(resources, 3);
        InterfaceC7493us0 c7224tS03 = new C7224tS0(resources, 1);
        InterfaceC7493us0 c7224tS04 = new C7224tS0(resources, 0);
        InterfaceC6842rS0 c1912Yh = new C1912Yh(c8426zm0);
        InterfaceC8176yS0 c1204Pf = new C1204Pf(1, (byte) 0);
        InterfaceC8176yS0 c5806m12 = new C5806m12(14);
        ContentResolver contentResolver = applicationContext.getContentResolver();
        c3578eQ0.a(ByteBuffer.class, new C5806m12(8));
        c3578eQ0.a(InputStream.class, new C6845rT0(c8426zm0));
        c3578eQ0.d("Bitmap", ByteBuffer.class, Bitmap.class, c6323ok);
        c3578eQ0.d("Bitmap", InputStream.class, Bitmap.class, c1834Xh);
        String str2 = Build.FINGERPRINT;
        if ("robolectric".equals(str2)) {
            str = "Animation";
        } else {
            str = "Animation";
            c3578eQ0.d("Bitmap", ParcelFileDescriptor.class, Bitmap.class, new C6323ok(c3562eL, 1));
        }
        c3578eQ0.d("Bitmap", ParcelFileDescriptor.class, Bitmap.class, c1917Yi1);
        InterfaceC5935mi interfaceC5935mi3 = interfaceC5935mi;
        c3578eQ0.d("Bitmap", AssetFileDescriptor.class, Bitmap.class, new C1917Yi1(interfaceC5935mi3, new OJ1(22)));
        InterfaceC7493us0 interfaceC7493us0 = C1596Uf1.b;
        c3578eQ0.c(Bitmap.class, Bitmap.class, interfaceC7493us0);
        c3578eQ0.d("Bitmap", Bitmap.class, Bitmap.class, new C7608vT(1));
        c3578eQ0.b(Bitmap.class, c1912Yh);
        c3578eQ0.d("BitmapDrawable", ByteBuffer.class, BitmapDrawable.class, new C1834Xh(resources, c6323ok));
        c3578eQ0.d("BitmapDrawable", InputStream.class, BitmapDrawable.class, new C1834Xh(resources, c1834Xh));
        c3578eQ0.d("BitmapDrawable", ParcelFileDescriptor.class, BitmapDrawable.class, new C1834Xh(resources, c1917Yi1));
        c3578eQ0.b(BitmapDrawable.class, new C0999Mo1(interfaceC5935mi3, c1912Yh));
        InterfaceC6079nS0 c5926mf = new C5926mf(arrayListF, c7086sk, c8426zm0);
        String str3 = str;
        c3578eQ0.d(str3, InputStream.class, C3500e10.class, c5926mf);
        c3578eQ0.d(str3, ByteBuffer.class, C3500e10.class, c7086sk);
        c3578eQ0.b(C3500e10.class, new C7532v32(14));
        c3578eQ0.c(InterfaceC3310d10.class, InterfaceC3310d10.class, interfaceC7493us0);
        c3578eQ0.d("Bitmap", InterfaceC3310d10.class, Bitmap.class, new C2375bi(interfaceC5935mi3));
        c3578eQ0.d("legacy_append", Uri.class, Drawable.class, c6461pS0);
        c3578eQ0.d("legacy_append", Uri.class, Bitmap.class, new C1834Xh(c6461pS0, 1, interfaceC5935mi3));
        c3578eQ0.k(new C7277tk(0));
        c3578eQ0.c(File.class, ByteBuffer.class, new C1596Uf1(3));
        c3578eQ0.c(File.class, InputStream.class, new C8178yT(new S20(14)));
        c3578eQ0.d("legacy_append", File.class, File.class, new C7608vT(0));
        c3578eQ0.c(File.class, ParcelFileDescriptor.class, new C8178yT(new C3759fN(14)));
        c3578eQ0.c(File.class, File.class, interfaceC7493us0);
        c3578eQ0.k(new G80(c8426zm0));
        if (!"robolectric".equals(str2)) {
            c3578eQ0.k(new C7277tk(2));
        }
        Class cls = Integer.TYPE;
        c3578eQ0.c(cls, InputStream.class, c7224tS0);
        c3578eQ0.c(cls, ParcelFileDescriptor.class, c7224tS03);
        c3578eQ0.c(Integer.class, InputStream.class, c7224tS0);
        c3578eQ0.c(Integer.class, ParcelFileDescriptor.class, c7224tS03);
        c3578eQ0.c(Integer.class, Uri.class, c7224tS02);
        c3578eQ0.c(cls, AssetFileDescriptor.class, c7224tS04);
        c3578eQ0.c(Integer.class, AssetFileDescriptor.class, c7224tS04);
        c3578eQ0.c(cls, Uri.class, c7224tS02);
        c3578eQ0.c(String.class, InputStream.class, new C7699vx0(1));
        c3578eQ0.c(Uri.class, InputStream.class, new C7699vx0(1));
        c3578eQ0.c(String.class, InputStream.class, new C1596Uf1(6));
        c3578eQ0.c(String.class, ParcelFileDescriptor.class, new C1596Uf1(5));
        c3578eQ0.c(String.class, AssetFileDescriptor.class, new C1596Uf1(4));
        c3578eQ0.c(Uri.class, InputStream.class, new C3717f9(applicationContext.getAssets(), 1));
        c3578eQ0.c(Uri.class, AssetFileDescriptor.class, new C3717f9(applicationContext.getAssets(), 0));
        c3578eQ0.c(Uri.class, InputStream.class, new C1625Up0(applicationContext, 1));
        c3578eQ0.c(Uri.class, InputStream.class, new C1625Up0(applicationContext, 2));
        if (i >= 29) {
            c3578eQ0.c(Uri.class, InputStream.class, new C6043nG0(applicationContext, InputStream.class));
            c3578eQ0.c(Uri.class, ParcelFileDescriptor.class, new C6043nG0(applicationContext, ParcelFileDescriptor.class));
        }
        c3578eQ0.c(Uri.class, InputStream.class, new C1989Zg1(contentResolver, 2));
        c3578eQ0.c(Uri.class, ParcelFileDescriptor.class, new C1989Zg1(contentResolver, 1));
        c3578eQ0.c(Uri.class, AssetFileDescriptor.class, new C1989Zg1(contentResolver, 0));
        c3578eQ0.c(Uri.class, InputStream.class, new C1596Uf1(8));
        c3578eQ0.c(URL.class, InputStream.class, new C1596Uf1(7));
        c3578eQ0.c(Uri.class, File.class, new C1625Up0(applicationContext, 0));
        c3578eQ0.c(E10.class, InputStream.class, new C7699vx0(2));
        c3578eQ0.c(byte[].class, ByteBuffer.class, new C1596Uf1(1));
        c3578eQ0.c(byte[].class, InputStream.class, new C1596Uf1(2));
        c3578eQ0.c(Uri.class, Uri.class, interfaceC7493us0);
        c3578eQ0.c(Drawable.class, Drawable.class, interfaceC7493us0);
        c3578eQ0.d("legacy_append", Drawable.class, Drawable.class, new C7608vT(2));
        c3578eQ0.m(Bitmap.class, BitmapDrawable.class, new C0136Bm1(5, resources));
        c3578eQ0.m(Bitmap.class, byte[].class, c1204Pf);
        c3578eQ0.m(Drawable.class, byte[].class, new C1857Xo1(interfaceC5935mi3, c1204Pf, c5806m12, 11, false));
        c3578eQ0.m(C3500e10.class, byte[].class, c5806m12);
        InterfaceC6079nS0 c1917Yi12 = new C1917Yi1(interfaceC5935mi3, new NV1(22));
        c3578eQ0.d("legacy_append", ByteBuffer.class, Bitmap.class, c1917Yi12);
        c3578eQ0.d("legacy_append", ByteBuffer.class, BitmapDrawable.class, new C1834Xh(resources, c1917Yi12));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            C10 c10 = (C10) it.next();
            try {
                c10.a(applicationContext, aVar, c3578eQ0);
            } catch (AbstractMethodError e) {
                throw new IllegalStateException("Attempting to register a Glide v3 module. If you see this, you or one of your dependencies may be including Glide v3 even though you're using Glide v4. You'll need to find and remove (or update) the offending dependency. The v3 module name is: ".concat(c10.getClass().getName()), e);
            }
        }
        if (f7 != null) {
            f7.registerComponents(applicationContext, aVar, c3578eQ0);
        }
        return c3578eQ0;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0042  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static defpackage.C2193al b(defpackage.K20 r25) {
        /*
            Method dump skipped, instructions count: 510
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.YP1.b(K20):al");
    }
}
