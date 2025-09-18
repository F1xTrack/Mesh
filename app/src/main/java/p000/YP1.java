package p000;

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
import com.bumptech.glide.ComponentCallbacks2C1874a;
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
    /* renamed from: a */
    public static C9239eQ0 m9294a(ComponentCallbacks2C1874a componentCallbacks2C1874a, List list, AbstractC0323F7 abstractC0323F7) {
        InterfaceC10395nS0 c6571ok;
        InterfaceC10395nS0 c1491Xh;
        int i;
        InterfaceC6443mi interfaceC6443mi;
        String str;
        InterfaceC6443mi interfaceC6443mi2 = componentCallbacks2C1874a.f17774b;
        C11617x10 c11617x10 = componentCallbacks2C1874a.f17776d;
        Context applicationContext = c11617x10.getApplicationContext();
        C7978Mu0 c7978Mu0 = c11617x10.f45268h;
        C9239eQ0 c9239eQ0 = new C9239eQ0();
        C0960PF c0960pf = new C0960PF();
        I60 i60 = c9239eQ0.f26703g;
        synchronized (i60) {
            i60.f4698a.add(c0960pf);
        }
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 27) {
            c9239eQ0.m17938l(new C7200yQ());
        }
        Resources resources = applicationContext.getResources();
        ArrayList arrayListM17932f = c9239eQ0.m17932f();
        C11967zm0 c11967zm0 = componentCallbacks2C1874a.f17777e;
        C6842sk c6842sk = new C6842sk(applicationContext, arrayListM17932f, interfaceC6443mi2, c11967zm0);
        InterfaceC10395nS0 c8579Yi1 = new C8579Yi1(interfaceC6443mi2, new C11370v32(22));
        C3984eL c3984eL = new C3984eL(c9239eQ0.m17932f(), resources.getDisplayMetrics(), interfaceC6443mi2, c11967zm0);
        if (i2 < 28 || !((Map) c7978Mu0.f7393b).containsKey(AbstractC10978s10.class)) {
            c6571ok = new C6571ok(c3984eL, 0);
            c1491Xh = new C1491Xh(c3984eL, 2, c11967zm0);
        } else {
            c1491Xh = new C6636pk(1);
            c6571ok = new C6636pk(0);
        }
        if (i2 >= 28) {
            i = i2;
            interfaceC6443mi = interfaceC6443mi2;
            c9239eQ0.m17930d("Animation", InputStream.class, Drawable.class, new C4094g5(new CC0(arrayListM17932f, 3, c11967zm0), 1));
            c9239eQ0.m17930d("Animation", ByteBuffer.class, Drawable.class, new C4094g5(new CC0(arrayListM17932f, 3, c11967zm0), 0));
        } else {
            i = i2;
            interfaceC6443mi = interfaceC6443mi2;
        }
        InterfaceC10395nS0 c10651pS0 = new C10651pS0(applicationContext);
        InterfaceC11343us0 c11163tS0 = new C11163tS0(resources, 2);
        InterfaceC11343us0 c11163tS02 = new C11163tS0(resources, 3);
        InterfaceC11343us0 c11163tS03 = new C11163tS0(resources, 1);
        InterfaceC11343us0 c11163tS04 = new C11163tS0(resources, 0);
        InterfaceC10907rS0 c1554Yh = new C1554Yh(c11967zm0);
        InterfaceC11800yS0 c0986Pf = new C0986Pf(1, (byte) 0);
        InterfaceC11800yS0 c10212m12 = new C10212m12(14);
        ContentResolver contentResolver = applicationContext.getContentResolver();
        c9239eQ0.m17927a(ByteBuffer.class, new C10212m12(8));
        c9239eQ0.m17927a(InputStream.class, new C10909rT0(c11967zm0));
        c9239eQ0.m17930d("Bitmap", ByteBuffer.class, Bitmap.class, c6571ok);
        c9239eQ0.m17930d("Bitmap", InputStream.class, Bitmap.class, c1491Xh);
        String str2 = Build.FINGERPRINT;
        if ("robolectric".equals(str2)) {
            str = "Animation";
        } else {
            str = "Animation";
            c9239eQ0.m17930d("Bitmap", ParcelFileDescriptor.class, Bitmap.class, new C6571ok(c3984eL, 1));
        }
        c9239eQ0.m17930d("Bitmap", ParcelFileDescriptor.class, Bitmap.class, c8579Yi1);
        InterfaceC6443mi interfaceC6443mi3 = interfaceC6443mi;
        c9239eQ0.m17930d("Bitmap", AssetFileDescriptor.class, Bitmap.class, new C8579Yi1(interfaceC6443mi3, new OJ1(22)));
        InterfaceC11343us0 interfaceC11343us0 = C8365Uf1.f11971b;
        c9239eQ0.m17929c(Bitmap.class, Bitmap.class, interfaceC11343us0);
        c9239eQ0.m17930d("Bitmap", Bitmap.class, Bitmap.class, new C7014vT(1));
        c9239eQ0.m17928b(Bitmap.class, c1554Yh);
        c9239eQ0.m17930d("BitmapDrawable", ByteBuffer.class, BitmapDrawable.class, new C1491Xh(resources, c6571ok));
        c9239eQ0.m17930d("BitmapDrawable", InputStream.class, BitmapDrawable.class, new C1491Xh(resources, c1491Xh));
        c9239eQ0.m17930d("BitmapDrawable", ParcelFileDescriptor.class, BitmapDrawable.class, new C1491Xh(resources, c8579Yi1));
        c9239eQ0.m17928b(BitmapDrawable.class, new C7967Mo1(interfaceC6443mi3, c1554Yh));
        InterfaceC10395nS0 c6440mf = new C6440mf(arrayListM17932f, c6842sk, c11967zm0);
        String str3 = str;
        c9239eQ0.m17930d(str3, InputStream.class, C9186e10.class, c6440mf);
        c9239eQ0.m17930d(str3, ByteBuffer.class, C9186e10.class, c6842sk);
        c9239eQ0.m17928b(C9186e10.class, new C11370v32(14));
        c9239eQ0.m17929c(InterfaceC9058d10.class, InterfaceC9058d10.class, interfaceC11343us0);
        c9239eQ0.m17930d("Bitmap", InterfaceC9058d10.class, Bitmap.class, new C1802bi(interfaceC6443mi3));
        c9239eQ0.m17930d("legacy_append", Uri.class, Drawable.class, c10651pS0);
        c9239eQ0.m17930d("legacy_append", Uri.class, Bitmap.class, new C1491Xh(c10651pS0, 1, interfaceC6443mi3));
        c9239eQ0.m17937k(new C6905tk(0));
        c9239eQ0.m17929c(File.class, ByteBuffer.class, new C8365Uf1(3));
        c9239eQ0.m17929c(File.class, InputStream.class, new C7203yT(new S20(14)));
        c9239eQ0.m17930d("legacy_append", File.class, File.class, new C7014vT(0));
        c9239eQ0.m17929c(File.class, ParcelFileDescriptor.class, new C7203yT(new C4049fN(14)));
        c9239eQ0.m17929c(File.class, File.class, interfaceC11343us0);
        c9239eQ0.m17937k(new G80(c11967zm0));
        if (!"robolectric".equals(str2)) {
            c9239eQ0.m17937k(new C6905tk(2));
        }
        Class cls = Integer.TYPE;
        c9239eQ0.m17929c(cls, InputStream.class, c11163tS0);
        c9239eQ0.m17929c(cls, ParcelFileDescriptor.class, c11163tS03);
        c9239eQ0.m17929c(Integer.class, InputStream.class, c11163tS0);
        c9239eQ0.m17929c(Integer.class, ParcelFileDescriptor.class, c11163tS03);
        c9239eQ0.m17929c(Integer.class, Uri.class, c11163tS02);
        c9239eQ0.m17929c(cls, AssetFileDescriptor.class, c11163tS04);
        c9239eQ0.m17929c(Integer.class, AssetFileDescriptor.class, c11163tS04);
        c9239eQ0.m17929c(cls, Uri.class, c11163tS02);
        c9239eQ0.m17929c(String.class, InputStream.class, new C11481vx0(1));
        c9239eQ0.m17929c(Uri.class, InputStream.class, new C11481vx0(1));
        c9239eQ0.m17929c(String.class, InputStream.class, new C8365Uf1(6));
        c9239eQ0.m17929c(String.class, ParcelFileDescriptor.class, new C8365Uf1(5));
        c9239eQ0.m17929c(String.class, AssetFileDescriptor.class, new C8365Uf1(4));
        c9239eQ0.m17929c(Uri.class, InputStream.class, new C4035f9(applicationContext.getAssets(), 1));
        c9239eQ0.m17929c(Uri.class, AssetFileDescriptor.class, new C4035f9(applicationContext.getAssets(), 0));
        c9239eQ0.m17929c(Uri.class, InputStream.class, new C8384Up0(applicationContext, 1));
        c9239eQ0.m17929c(Uri.class, InputStream.class, new C8384Up0(applicationContext, 2));
        if (i >= 29) {
            c9239eQ0.m17929c(Uri.class, InputStream.class, new C10371nG0(applicationContext, InputStream.class));
            c9239eQ0.m17929c(Uri.class, ParcelFileDescriptor.class, new C10371nG0(applicationContext, ParcelFileDescriptor.class));
        }
        c9239eQ0.m17929c(Uri.class, InputStream.class, new C8627Zg1(contentResolver, 2));
        c9239eQ0.m17929c(Uri.class, ParcelFileDescriptor.class, new C8627Zg1(contentResolver, 1));
        c9239eQ0.m17929c(Uri.class, AssetFileDescriptor.class, new C8627Zg1(contentResolver, 0));
        c9239eQ0.m17929c(Uri.class, InputStream.class, new C8365Uf1(8));
        c9239eQ0.m17929c(URL.class, InputStream.class, new C8365Uf1(7));
        c9239eQ0.m17929c(Uri.class, File.class, new C8384Up0(applicationContext, 0));
        c9239eQ0.m17929c(E10.class, InputStream.class, new C11481vx0(2));
        c9239eQ0.m17929c(byte[].class, ByteBuffer.class, new C8365Uf1(1));
        c9239eQ0.m17929c(byte[].class, InputStream.class, new C8365Uf1(2));
        c9239eQ0.m17929c(Uri.class, Uri.class, interfaceC11343us0);
        c9239eQ0.m17929c(Drawable.class, Drawable.class, interfaceC11343us0);
        c9239eQ0.m17930d("legacy_append", Drawable.class, Drawable.class, new C7014vT(2));
        c9239eQ0.m17939m(Bitmap.class, BitmapDrawable.class, new C7391Bm1(5, resources));
        c9239eQ0.m17939m(Bitmap.class, byte[].class, c0986Pf);
        c9239eQ0.m17939m(Drawable.class, byte[].class, new C8539Xo1(interfaceC6443mi3, c0986Pf, c10212m12, 11, false));
        c9239eQ0.m17939m(C9186e10.class, byte[].class, c10212m12);
        InterfaceC10395nS0 c8579Yi12 = new C8579Yi1(interfaceC6443mi3, new NV1(22));
        c9239eQ0.m17930d("legacy_append", ByteBuffer.class, Bitmap.class, c8579Yi12);
        c9239eQ0.m17930d("legacy_append", ByteBuffer.class, BitmapDrawable.class, new C1491Xh(resources, c8579Yi12));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            C10 c10 = (C10) it.next();
            try {
                c10.mo946a(applicationContext, componentCallbacks2C1874a, c9239eQ0);
            } catch (AbstractMethodError e) {
                throw new IllegalStateException("Attempting to register a Glide v3 module. If you see this, you or one of your dependencies may be including Glide v3 even though you're using Glide v4. You'll need to find and remove (or update) the offending dependency. The v3 module name is: ".concat(c10.getClass().getName()), e);
            }
        }
        if (abstractC0323F7 != null) {
            abstractC0323F7.registerComponents(applicationContext, componentCallbacks2C1874a, c9239eQ0);
        }
        return c9239eQ0;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0042  */
    /* renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static p000.C1684al m9295b(p000.K20 r25) {
        /*
            Method dump skipped, instructions count: 510
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.YP1.m9295b(K20):al");
    }
}
