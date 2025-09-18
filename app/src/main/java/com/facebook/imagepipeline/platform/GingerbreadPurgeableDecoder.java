package com.facebook.imagepipeline.platform;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.MemoryFile;
import com.facebook.imagepipeline.nativecode.DalvikPurgeableDecoder;
import java.io.OutputStream;
import java.lang.reflect.Method;
import p000.AbstractC0119Bt;
import p000.AbstractC11176tY1;
import p000.AbstractC1374Vq;
import p000.AbstractC7292zt;
import p000.AbstractC9414fn1;
import p000.C11339uq0;
import p000.C8318Ti0;
import p000.C9723iC0;
import p000.InterfaceC1090RK;

@InterfaceC1090RK
/* loaded from: classes.dex */
public class GingerbreadPurgeableDecoder extends DalvikPurgeableDecoder {

    /* renamed from: c */
    public static Method f17859c;

    @InterfaceC1090RK
    public GingerbreadPurgeableDecoder() {
        if (AbstractC9414fn1.f27381a) {
            return;
        }
        try {
            AbstractC1374Vq.m8597p(Class.forName("com.facebook.webpsupport.WebpBitmapFactoryImpl").newInstance());
        } catch (Throwable unused) {
        }
        AbstractC9414fn1.f27381a = true;
    }

    /* renamed from: g */
    public static MemoryFile m10910g(AbstractC7292zt abstractC7292zt, int i, byte[] bArr) throws Throwable {
        OutputStream outputStream;
        C8318Ti0 c8318Ti0;
        C9723iC0 c9723iC0 = null;
        OutputStream outputStream2 = null;
        MemoryFile memoryFile = new MemoryFile(null, (bArr == null ? 0 : bArr.length) + i);
        memoryFile.allowPurging(false);
        try {
            C9723iC0 c9723iC02 = new C9723iC0((C11339uq0) abstractC7292zt.m26572w());
            try {
                c8318Ti0 = new C8318Ti0(c9723iC02, i);
            } catch (Throwable th) {
                th = th;
                outputStream = null;
                c8318Ti0 = null;
            }
            try {
                outputStream2 = memoryFile.getOutputStream();
                outputStream2.getClass();
                byte[] bArr2 = new byte[4096];
                while (true) {
                    int i2 = c8318Ti0.read(bArr2);
                    if (i2 == -1) {
                        break;
                    }
                    outputStream2.write(bArr2, 0, i2);
                }
                if (bArr != null) {
                    memoryFile.writeBytes(bArr, 0, i, bArr.length);
                }
                AbstractC7292zt.m26569p(abstractC7292zt);
                AbstractC0119Bt.m900b(c9723iC02);
                AbstractC0119Bt.m900b(c8318Ti0);
                AbstractC0119Bt.m899a(outputStream2);
                return memoryFile;
            } catch (Throwable th2) {
                th = th2;
                outputStream = outputStream2;
                c9723iC0 = c9723iC02;
                AbstractC7292zt.m26569p(abstractC7292zt);
                AbstractC0119Bt.m900b(c9723iC0);
                AbstractC0119Bt.m900b(c8318Ti0);
                AbstractC0119Bt.m899a(outputStream);
                throw th;
            }
        } catch (Throwable th3) {
            th = th3;
            outputStream = null;
            c8318Ti0 = null;
        }
    }

    @Override // com.facebook.imagepipeline.nativecode.DalvikPurgeableDecoder
    /* renamed from: c */
    public final Bitmap mo10904c(AbstractC7292zt abstractC7292zt, BitmapFactory.Options options) throws Throwable {
        m10911h(abstractC7292zt, ((C11339uq0) abstractC7292zt.m26572w()).m25253p(), null);
        throw null;
    }

    @Override // com.facebook.imagepipeline.nativecode.DalvikPurgeableDecoder
    /* renamed from: d */
    public final Bitmap mo10905d(AbstractC7292zt abstractC7292zt, int i, BitmapFactory.Options options) throws Throwable {
        m10911h(abstractC7292zt, i, DalvikPurgeableDecoder.m10903e(abstractC7292zt, i) ? null : DalvikPurgeableDecoder.f17851b);
        throw null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:17:0x001f  */
    /* renamed from: h */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void m10911h(p000.AbstractC7292zt r2, int r3, byte[] r4) throws java.lang.Throwable {
        /*
            r1 = this;
            r0 = 0
            android.os.MemoryFile r2 = m10910g(r2, r3, r4)     // Catch: java.lang.Throwable -> L15 java.io.IOException -> L17
            r1.m10912i(r2)     // Catch: java.lang.Throwable -> L10 java.io.IOException -> L13
            java.lang.IllegalStateException r3 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> L10 java.io.IOException -> L13
            java.lang.String r4 = "WebpBitmapFactory is null"
            r3.<init>(r4)     // Catch: java.lang.Throwable -> L10 java.io.IOException -> L13
            throw r3     // Catch: java.lang.Throwable -> L10 java.io.IOException -> L13
        L10:
            r3 = move-exception
            r0 = r2
            goto L1d
        L13:
            r3 = move-exception
            goto L19
        L15:
            r3 = move-exception
            goto L1d
        L17:
            r3 = move-exception
            r2 = r0
        L19:
            p000.AbstractC11176tY1.m24943b(r3)     // Catch: java.lang.Throwable -> L10
            throw r0     // Catch: java.lang.Throwable -> L10
        L1d:
            if (r0 == 0) goto L22
            r0.close()
        L22:
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.imagepipeline.platform.GingerbreadPurgeableDecoder.m10911h(zt, int, byte[]):void");
    }

    /* renamed from: i */
    public final void m10912i(MemoryFile memoryFile) throws Throwable {
        Method method;
        try {
            synchronized (this) {
                if (f17859c == null) {
                    try {
                        f17859c = MemoryFile.class.getDeclaredMethod("getFileDescriptor", null);
                    } catch (Exception e) {
                        AbstractC11176tY1.m24943b(e);
                        throw null;
                    }
                }
                method = f17859c;
            }
            Object objInvoke = method.invoke(memoryFile, null);
            objInvoke.getClass();
        } catch (Exception e2) {
            AbstractC11176tY1.m24943b(e2);
            throw null;
        }
    }
}
