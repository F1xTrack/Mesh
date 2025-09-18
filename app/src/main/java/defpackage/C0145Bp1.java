package defpackage;

import android.content.Context;
import android.graphics.Bitmap;
import com.google.android.gms.common.internal.Preconditions;
import com.vk.push.common.AppInfo;
import com.vk.push.common.Logger;
import com.yandex.mapkit.map.IconStyle;
import com.yandex.mapkit.map.PlacemarkMapObject;
import com.yandex.runtime.image.ImageProvider;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.Serializable;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: Bp1 */
/* loaded from: classes2.dex */
public final class C0145Bp1 implements InterfaceC0053Al, InterfaceC1317Qq1, InterfaceC7910x3, InterfaceC3762fO, InterfaceC3973gU1 {
    public Object a;
    public Object b;
    public Object c;

    public /* synthetic */ C0145Bp1(Object obj, Serializable serializable, Object obj2) {
        this.b = obj;
        this.a = serializable;
        this.c = obj2;
    }

    @Override // defpackage.InterfaceC3762fO
    public /* bridge */ /* synthetic */ InterfaceC3762fO a(Class cls, InterfaceC1802Ww0 interfaceC1802Ww0) {
        ((HashMap) this.b).put(cls, interfaceC1802Ww0);
        ((HashMap) this.a).remove(cls);
        return this;
    }

    @Override // defpackage.InterfaceC3973gU1
    public void b(int i, IOException iOException, byte[] bArr) {
        FR1 fr1 = (FR1) this.b;
        AtomicReference atomicReference = (AtomicReference) this.a;
        QX1 qx1 = (QX1) this.c;
        fr1.v1();
        boolean z = (i == 200 || i == 204 || i == 304) && iOException == null;
        if (z) {
            fr1.n().o.c(Long.valueOf(qx1.a), "[sgtm] Upload succeeded for row_id");
        } else {
            fr1.n().j.e("[sgtm] Upload failed for row_id. response, exception", Long.valueOf(qx1.a), Integer.valueOf(i), iOException);
        }
        C2528cV1 c2528cV1O = ((C3386dP1) fr1.b).o();
        C6367oy1 c6367oy1 = new C6367oy1(z ? 1 : 2, qx1.a, qx1.f);
        c2528cV1O.v1();
        c2528cV1O.A1();
        EY1 ey1N1 = c2528cV1O.N1(true);
        Preconditions.checkNotNull(ey1N1);
        RunnableC1492Sx runnableC1492Sx = new RunnableC1492Sx(25);
        runnableC1492Sx.b = c2528cV1O;
        runnableC1492Sx.c = ey1N1;
        runnableC1492Sx.d = c6367oy1;
        c2528cV1O.F1(runnableC1492Sx);
        fr1.n().o.b(Long.valueOf(qx1.a), z ? "SUCCESS" : "FAILURE", "[sgtm] Updated status for row_id");
        synchronized (atomicReference) {
            atomicReference.set(Boolean.valueOf(z));
            atomicReference.notifyAll();
        }
    }

    @Override // defpackage.InterfaceC7910x3
    public String c(String str) {
        X11 x11 = (X11) this.c;
        String str2 = (String) this.a;
        Context context = (Context) this.b;
        if (x11 == null) {
            this.c = new X11(new C6928rv(E12.a(context, str2, "agc_", "/AD91D45E3E72DB6989DDCB13287E75061FABCB933D886E6C6ABEF0939B577138"), E12.a(context, str2, "agc_", "/B314B3BF013DF5AC4134E880AF3D2B7C9FFBE8F0305EAC1C898145E2BCF1F21C"), E12.a(context, str2, "agc_", "/C767BD8FDF53E53D059BE95B09E2A71056F5F180AECC62836B287ACA5793421B"), E12.a(context, str2, "agc_", "/DCB3E6D4C2CF80F30D89CDBC412C964DA8381BB84668769391FBCC3E329AD0FD"), "PBKDF2WithHmacSHA1", 5000));
        }
        return ((X11) this.c).o(E12.a(context, str2, "agc_", str));
    }

    @Override // defpackage.InterfaceC1317Qq1
    public C1239Pq1 d(AppInfo appInfo, S51 s51) {
        List listE = AbstractC8259yu.e(appInfo);
        C1554Tr1 c1554Tr1 = new C1554Tr1(s51, 0);
        Context context = (Context) this.b;
        Logger logger = (Logger) this.c;
        O90.f(logger, "logger");
        return new C1239Pq1(new C1086Nr1(context, listE, logger, c1554Tr1), new C1944Yr1((String) this.a, context, listE, logger, new C1554Tr1(s51, 1)), null);
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.Object e(java.lang.String r5, java.lang.String r6, defpackage.AbstractC1963Yy r7) {
        /*
            r4 = this;
            boolean r0 = r7 instanceof defpackage.C6552pw1
            if (r0 == 0) goto L13
            r0 = r7
            pw1 r0 = (defpackage.C6552pw1) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            pw1 r0 = new pw1
            r0.<init>(r4, r7)
        L18:
            java.lang.Object r7 = r0.a
            Mz r1 = defpackage.EnumC1030Mz.a
            int r2 = r0.c
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            defpackage.RQ1.d(r7)
            goto L45
        L27:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L2f:
            defpackage.RQ1.d(r7)
            qw1 r7 = new qw1
            r2 = 0
            r7.<init>(r5, r6, r4, r2)
            r0.c = r3
            java.lang.Object r5 = r4.c
            QF r5 = (defpackage.QF) r5
            java.lang.Object r7 = defpackage.AbstractC3767fP1.e(r5, r7, r0)
            if (r7 != r1) goto L45
            return r1
        L45:
            PS0 r7 = (defpackage.PS0) r7
            java.lang.Object r5 = r7.a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C0145Bp1.e(java.lang.String, java.lang.String, Yy):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.Object f(java.lang.String r5, java.lang.String r6, defpackage.AbstractC1963Yy r7) {
        /*
            r4 = this;
            boolean r0 = r7 instanceof defpackage.C6933rw1
            if (r0 == 0) goto L13
            r0 = r7
            rw1 r0 = (defpackage.C6933rw1) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            rw1 r0 = new rw1
            r0.<init>(r4, r7)
        L18:
            java.lang.Object r7 = r0.a
            Mz r1 = defpackage.EnumC1030Mz.a
            int r2 = r0.c
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            defpackage.RQ1.d(r7)
            goto L45
        L27:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L2f:
            defpackage.RQ1.d(r7)
            sw1 r7 = new sw1
            r2 = 0
            r7.<init>(r5, r6, r4, r2)
            r0.c = r3
            java.lang.Object r5 = r4.c
            QF r5 = (defpackage.QF) r5
            java.lang.Object r7 = defpackage.AbstractC3767fP1.e(r5, r7, r0)
            if (r7 != r1) goto L45
            return r1
        L45:
            PS0 r7 = (defpackage.PS0) r7
            java.lang.Object r5 = r7.a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C0145Bp1.f(java.lang.String, java.lang.String, Yy):java.lang.Object");
    }

    public byte[] g(C6566q02 c6566q02) {
        C7386uI1 c7386uI1;
        InterfaceC1802Ww0 interfaceC1802Ww0;
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            HashMap map = (HashMap) this.b;
            c7386uI1 = new C7386uI1(byteArrayOutputStream, map, (HashMap) this.a, (C1731Vy1) this.c);
            interfaceC1802Ww0 = (InterfaceC1802Ww0) map.get(C6566q02.class);
        } catch (IOException unused) {
        }
        if (interfaceC1802Ww0 == null) {
            throw new C8163yO("No encoder for ".concat(String.valueOf(C6566q02.class)));
        }
        interfaceC1802Ww0.a(c6566q02, c7386uI1);
        return byteArrayOutputStream.toByteArray();
    }

    @Override // defpackage.InterfaceC0053Al
    public void invoke(Object obj) {
        Bitmap bitmap = (Bitmap) obj;
        PlacemarkMapObject placemarkMapObject = (PlacemarkMapObject) this.b;
        try {
            ImageProvider imageProviderFromBitmap = ImageProvider.fromBitmap(bitmap);
            C0223Cp1.k.put((String) this.a, imageProviderFromBitmap);
            placemarkMapObject.setIcon(imageProviderFromBitmap);
            placemarkMapObject.setIconStyle((IconStyle) this.c);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
