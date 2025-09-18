package p000;

import android.content.Context;
import android.graphics.Bitmap;
import com.google.android.gms.common.internal.Preconditions;
import com.p019vk.push.common.AppInfo;
import com.p019vk.push.common.Logger;
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
public final class C7397Bp1 implements InterfaceC0048Al, InterfaceC8179Qq1, InterfaceC7114x3, InterfaceC4050fO, InterfaceC9504gU1 {

    /* renamed from: a */
    public Object f1051a;

    /* renamed from: b */
    public Object f1052b;

    /* renamed from: c */
    public Object f1053c;

    public /* synthetic */ C7397Bp1(Object obj, Serializable serializable, Object obj2) {
        this.f1052b = obj;
        this.f1051a = serializable;
        this.f1053c = obj2;
    }

    @Override // p000.InterfaceC4050fO
    /* renamed from: a */
    public /* bridge */ /* synthetic */ InterfaceC4050fO mo884a(Class cls, InterfaceC8502Ww0 interfaceC8502Ww0) {
        ((HashMap) this.f1052b).put(cls, interfaceC8502Ww0);
        ((HashMap) this.f1051a).remove(cls);
        return this;
    }

    @Override // p000.InterfaceC9504gU1
    /* renamed from: b */
    public void mo885b(int i, IOException iOException, byte[] bArr) {
        FR1 fr1 = (FR1) this.f1052b;
        AtomicReference atomicReference = (AtomicReference) this.f1051a;
        QX1 qx1 = (QX1) this.f1053c;
        fr1.mo7681v1();
        boolean z = (i == 200 || i == 204 || i == 304) && iOException == null;
        if (z) {
            fr1.mo6070n().f8386o.m24554c(Long.valueOf(qx1.f9659a), "[sgtm] Upload succeeded for row_id");
        } else {
            fr1.mo6070n().f8381j.m24556e("[sgtm] Upload failed for row_id. response, exception", Long.valueOf(qx1.f9659a), Integer.valueOf(i), iOException);
        }
        C8989cV1 c8989cV1M17601o = ((C9110dP1) fr1.f11615b).m17601o();
        C10588oy1 c10588oy1 = new C10588oy1(z ? 1 : 2, qx1.f9659a, qx1.f9664f);
        c8989cV1M17601o.mo7681v1();
        c8989cV1M17601o.m18793A1();
        EY1 ey1M10752N1 = c8989cV1M17601o.m10752N1(true);
        Preconditions.checkNotNull(ey1M10752N1);
        RunnableC1192Sx runnableC1192Sx = new RunnableC1192Sx(25);
        runnableC1192Sx.f11079b = c8989cV1M17601o;
        runnableC1192Sx.f11080c = ey1M10752N1;
        runnableC1192Sx.f11081d = c10588oy1;
        c8989cV1M17601o.m10744F1(runnableC1192Sx);
        fr1.mo6070n().f8386o.m24553b(Long.valueOf(qx1.f9659a), z ? "SUCCESS" : "FAILURE", "[sgtm] Updated status for row_id");
        synchronized (atomicReference) {
            atomicReference.set(Boolean.valueOf(z));
            atomicReference.notifyAll();
        }
    }

    @Override // p000.InterfaceC7114x3
    /* renamed from: c */
    public String mo886c(String str) {
        X11 x11 = (X11) this.f1053c;
        String str2 = (String) this.f1051a;
        Context context = (Context) this.f1052b;
        if (x11 == null) {
            this.f1053c = new X11(new C6790rv(E12.m1983a(context, str2, "agc_", "/AD91D45E3E72DB6989DDCB13287E75061FABCB933D886E6C6ABEF0939B577138"), E12.m1983a(context, str2, "agc_", "/B314B3BF013DF5AC4134E880AF3D2B7C9FFBE8F0305EAC1C898145E2BCF1F21C"), E12.m1983a(context, str2, "agc_", "/C767BD8FDF53E53D059BE95B09E2A71056F5F180AECC62836B287ACA5793421B"), E12.m1983a(context, str2, "agc_", "/DCB3E6D4C2CF80F30D89CDBC412C964DA8381BB84668769391FBCC3E329AD0FD"), "PBKDF2WithHmacSHA1", 5000));
        }
        return ((X11) this.f1053c).m8920o(E12.m1983a(context, str2, "agc_", str));
    }

    @Override // p000.InterfaceC8179Qq1
    /* renamed from: d */
    public C8127Pq1 mo887d(AppInfo appInfo, S51 s51) {
        List listM26274e = AbstractC7230yu.m26274e(appInfo);
        C8337Tr1 c8337Tr1 = new C8337Tr1(s51, 0);
        Context context = (Context) this.f1052b;
        Logger logger = (Logger) this.f1053c;
        O90.m5968f(logger, "logger");
        return new C8127Pq1(new C8025Nr1(context, listM26274e, logger, c8337Tr1), new C8597Yr1((String) this.f1051a, context, listM26274e, logger, new C8337Tr1(s51, 1)), null);
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0013  */
    /* renamed from: e */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.Object m888e(java.lang.String r5, java.lang.String r6, p000.AbstractC1571Yy r7) {
        /*
            r4 = this;
            boolean r0 = r7 instanceof p000.C10712pw1
            if (r0 == 0) goto L13
            r0 = r7
            pw1 r0 = (p000.C10712pw1) r0
            int r1 = r0.f40444c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f40444c = r1
            goto L18
        L13:
            pw1 r0 = new pw1
            r0.<init>(r4, r7)
        L18:
            java.lang.Object r7 = r0.f40442a
            Mz r1 = p000.EnumC0817Mz.f7418a
            int r2 = r0.f40444c
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            p000.RQ1.m7017d(r7)
            goto L45
        L27:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L2f:
            p000.RQ1.m7017d(r7)
            qw1 r7 = new qw1
            r2 = 0
            r7.<init>(r5, r6, r4, r2)
            r0.f40444c = r3
            java.lang.Object r5 = r4.f1053c
            QF r5 = (p000.ExecutorC1023QF) r5
            java.lang.Object r7 = p000.AbstractC9366fP1.m18233e(r5, r7, r0)
            if (r7 != r1) goto L45
            return r1
        L45:
            PS0 r7 = (p000.PS0) r7
            java.lang.Object r5 = r7.f9075a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.C7397Bp1.m888e(java.lang.String, java.lang.String, Yy):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0013  */
    /* renamed from: f */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.Object m889f(java.lang.String r5, java.lang.String r6, p000.AbstractC1571Yy r7) {
        /*
            r4 = this;
            boolean r0 = r7 instanceof p000.C10968rw1
            if (r0 == 0) goto L13
            r0 = r7
            rw1 r0 = (p000.C10968rw1) r0
            int r1 = r0.f42169c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f42169c = r1
            goto L18
        L13:
            rw1 r0 = new rw1
            r0.<init>(r4, r7)
        L18:
            java.lang.Object r7 = r0.f42167a
            Mz r1 = p000.EnumC0817Mz.f7418a
            int r2 = r0.f42169c
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            p000.RQ1.m7017d(r7)
            goto L45
        L27:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L2f:
            p000.RQ1.m7017d(r7)
            sw1 r7 = new sw1
            r2 = 0
            r7.<init>(r5, r6, r4, r2)
            r0.f42169c = r3
            java.lang.Object r5 = r4.f1053c
            QF r5 = (p000.ExecutorC1023QF) r5
            java.lang.Object r7 = p000.AbstractC9366fP1.m18233e(r5, r7, r0)
            if (r7 != r1) goto L45
            return r1
        L45:
            PS0 r7 = (p000.PS0) r7
            java.lang.Object r5 = r7.f9075a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.C7397Bp1.m889f(java.lang.String, java.lang.String, Yy):java.lang.Object");
    }

    /* renamed from: g */
    public byte[] m890g(C10721q02 c10721q02) {
        C11272uI1 c11272uI1;
        InterfaceC8502Ww0 interfaceC8502Ww0;
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            HashMap map = (HashMap) this.f1052b;
            c11272uI1 = new C11272uI1(byteArrayOutputStream, map, (HashMap) this.f1051a, (C8455Vy1) this.f1053c);
            interfaceC8502Ww0 = (InterfaceC8502Ww0) map.get(C10721q02.class);
        } catch (IOException unused) {
        }
        if (interfaceC8502Ww0 == null) {
            throw new C7198yO("No encoder for ".concat(String.valueOf(C10721q02.class)));
        }
        interfaceC8502Ww0.mo104a(c10721q02, c11272uI1);
        return byteArrayOutputStream.toByteArray();
    }

    @Override // p000.InterfaceC0048Al
    public void invoke(Object obj) {
        Bitmap bitmap = (Bitmap) obj;
        PlacemarkMapObject placemarkMapObject = (PlacemarkMapObject) this.f1052b;
        try {
            ImageProvider imageProviderFromBitmap = ImageProvider.fromBitmap(bitmap);
            C7449Cp1.f1688k.put((String) this.f1051a, imageProviderFromBitmap);
            placemarkMapObject.setIcon(imageProviderFromBitmap);
            placemarkMapObject.setIconStyle((IconStyle) this.f1053c);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
