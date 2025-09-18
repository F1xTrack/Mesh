package defpackage;

import android.app.PendingIntent;
import android.app.Service;
import android.graphics.Matrix;
import android.graphics.RectF;
import android.media.MediaCodec;
import android.os.Bundle;
import android.view.MenuItem;
import android.widget.TextView;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.internal.RemoteCall;
import com.google.android.gms.common.internal.Preconditions;
import com.yalantis.ucrop.UCropActivity;
import com.yalantis.ucrop.view.GestureCropImageView;
import java.io.File;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Objects;
import java.util.TreeMap;
import org.chromium.support_lib_boundary.WebViewProviderBoundaryInterface;
import org.chromium.support_lib_boundary.WebViewProviderFactoryBoundaryInterface;
import org.chromium.support_lib_boundary.WebkitToCompatConverterBoundaryInterface;

/* renamed from: oT0 */
/* loaded from: classes.dex */
public final class C6273oT0 implements InterfaceC7117su0, InterfaceC0921Lo0, InterfaceC0069Aq0, K30, InterfaceC1227Pm1, InterfaceC5623l32, RemoteCall {
    public Object a;

    public /* synthetic */ C6273oT0(Object obj) {
        this.a = obj;
    }

    public void A(int i, double d) {
        ((C5271jD1) this.a).h(i, Double.doubleToRawLongBits(d));
    }

    public void B(int i, int i2) {
        C5271jD1 c5271jD1 = (C5271jD1) this.a;
        c5271jD1.l(i << 3);
        if (i2 >= 0) {
            c5271jD1.l(i2);
        } else {
            c5271jD1.n(i2);
        }
    }

    public void C(int i, int i2) {
        ((C5271jD1) this.a).f(i, i2);
    }

    public void D(int i, long j) {
        ((C5271jD1) this.a).h(i, j);
    }

    public void E(float f, int i) {
        ((C5271jD1) this.a).f(i, Float.floatToRawIntBits(f));
    }

    public void F(int i, Object obj, PH1 ph1) {
        C5271jD1 c5271jD1 = (C5271jD1) this.a;
        c5271jD1.k(i, 3);
        ph1.h((DB1) obj, c5271jD1.a);
        c5271jD1.k(i, 4);
    }

    public void G(int i, int i2) {
        C5271jD1 c5271jD1 = (C5271jD1) this.a;
        c5271jD1.l(i << 3);
        if (i2 >= 0) {
            c5271jD1.l(i2);
        } else {
            c5271jD1.n(i2);
        }
    }

    public void H(int i, long j) {
        ((C5271jD1) this.a).m(i, j);
    }

    public void I(int i, Object obj, PH1 ph1) {
        DB1 db1 = (DB1) obj;
        C5271jD1 c5271jD1 = (C5271jD1) this.a;
        c5271jD1.l((i << 3) | 2);
        c5271jD1.l(db1.a(ph1));
        ph1.h(db1, c5271jD1.a);
    }

    public void J(int i, int i2) {
        ((C5271jD1) this.a).f(i, i2);
    }

    public void K(int i, long j) {
        ((C5271jD1) this.a).h(i, j);
    }

    @Override // defpackage.InterfaceC7117su0
    public File N() {
        return (File) ((CC0) ((C1241Pr0) this.a).a).b;
    }

    @Override // defpackage.InterfaceC7117su0
    public File U() {
        return (File) ((C1241Pr0) this.a).c;
    }

    @Override // defpackage.InterfaceC0921Lo0
    public void a(Bundle bundle) {
        ((MediaCodec) this.a).setParameters(bundle);
    }

    @Override // com.google.android.gms.common.api.internal.RemoteCall
    public void accept(Object obj, Object obj2) {
        Api.ClientKey clientKey = RB1.a;
        ((C8325zE1) obj).f((PendingIntent) this.a, (S81) obj2);
    }

    @Override // defpackage.InterfaceC0921Lo0
    public void b(int i, C6218oB c6218oB, long j, int i2) throws MediaCodec.CryptoException {
        ((MediaCodec) this.a).queueSecureInputBuffer(i, 0, c6218oB.i, j, i2);
    }

    @Override // defpackage.InterfaceC7117su0
    public File b0() {
        return (File) ((C1241Pr0) this.a).b;
    }

    @Override // defpackage.InterfaceC0921Lo0
    public void c(int i, int i2, int i3, long j) throws MediaCodec.CryptoException {
        ((MediaCodec) this.a).queueInputBuffer(i, 0, i2, j, i3);
    }

    @Override // defpackage.InterfaceC7117su0
    public File d() {
        return (File) ((C1241Pr0) this.a).d;
    }

    @Override // defpackage.InterfaceC7117su0
    public File e() {
        return (File) ((C1241Pr0) this.a).f;
    }

    @Override // defpackage.K30
    public void f() {
        ((UCropActivity) this.a).s.setImageToWrapCropBounds(true);
    }

    @Override // defpackage.InterfaceC0069Aq0
    public boolean g(MenuC0225Cq0 menuC0225Cq0, MenuItem menuItem) {
        return false;
    }

    @Override // defpackage.InterfaceC1227Pm1
    public WebkitToCompatConverterBoundaryInterface getWebkitToCompatConverter() {
        return (WebkitToCompatConverterBoundaryInterface) AbstractC1993Zi.b(WebkitToCompatConverterBoundaryInterface.class, ((WebViewProviderFactoryBoundaryInterface) this.a).getWebkitToCompatConverter());
    }

    @Override // defpackage.K30
    public void h(float f) {
        GestureCropImageView gestureCropImageView = ((UCropActivity) this.a).s;
        float f2 = f / 42.0f;
        RectF rectF = gestureCropImageView.s;
        float fCenterX = rectF.centerX();
        float fCenterY = rectF.centerY();
        if (f2 != 0.0f) {
            Matrix matrix = gestureCropImageView.g;
            matrix.postRotate(f2, fCenterX, fCenterY);
            gestureCropImageView.setImageMatrix(matrix);
            InterfaceC6683qc1 interfaceC6683qc1 = gestureCropImageView.j;
            if (interfaceC6683qc1 != null) {
                float[] fArr = gestureCropImageView.f;
                matrix.getValues(fArr);
                double d = fArr[1];
                matrix.getValues(fArr);
                float f3 = (float) (-(Math.atan2(d, fArr[0]) * 57.29577951308232d));
                TextView textView = ((UCropActivity) ((GQ0) interfaceC6683qc1).b).B;
                if (textView != null) {
                    textView.setText(String.format(Locale.getDefault(), "%.1f°", Float.valueOf(f3)));
                }
            }
        }
    }

    @Override // defpackage.K30
    public void j() {
        ((UCropActivity) this.a).s.f();
    }

    @Override // defpackage.InterfaceC0069Aq0
    public void k(MenuC0225Cq0 menuC0225Cq0) {
        C3612eb1 c3612eb1 = (C3612eb1) this.a;
        boolean zP = c3612eb1.a.a.p();
        B6 b6 = c3612eb1.b;
        if (zP) {
            b6.onPanelClosed(108, menuC0225Cq0);
        } else if (b6.onPreparePanel(0, null, menuC0225Cq0)) {
            b6.onMenuOpened(108, menuC0225Cq0);
        }
    }

    @Override // defpackage.InterfaceC7117su0
    public File l() {
        return (File) ((C1241Pr0) this.a).e;
    }

    public void m(AbstractC1631Ur0... abstractC1631Ur0Arr) {
        O90.f(abstractC1631Ur0Arr, "migrations");
        for (AbstractC1631Ur0 abstractC1631Ur0 : abstractC1631Ur0Arr) {
            int i = abstractC1631Ur0.a;
            LinkedHashMap linkedHashMap = (LinkedHashMap) this.a;
            Integer numValueOf = Integer.valueOf(i);
            Object treeMap = linkedHashMap.get(numValueOf);
            if (treeMap == null) {
                treeMap = new TreeMap();
                linkedHashMap.put(numValueOf, treeMap);
            }
            TreeMap treeMap2 = (TreeMap) treeMap;
            int i2 = abstractC1631Ur0.b;
            if (treeMap2.containsKey(Integer.valueOf(i2))) {
                Objects.toString(treeMap2.get(Integer.valueOf(i2)));
                abstractC1631Ur0.toString();
            }
            treeMap2.put(Integer.valueOf(i2), abstractC1631Ur0);
        }
    }

    public void n(int i, int i2) {
        int i3 = (i2 >> 31) ^ (i2 + i2);
        C5271jD1 c5271jD1 = (C5271jD1) this.a;
        c5271jD1.l(i << 3);
        c5271jD1.l(i3);
    }

    @Override // defpackage.InterfaceC7117su0
    public AbstractC7551vA o() {
        CC0 cc0 = (CC0) ((C1241Pr0) this.a).a;
        if (cc0 != null) {
            return (C0961Mc) cc0.c;
        }
        return null;
    }

    public void p(int i, long j) {
        ((C5271jD1) this.a).m(i, (j >> 63) ^ (j + j));
    }

    @Override // defpackage.InterfaceC1227Pm1
    public String[] q() {
        return ((WebViewProviderFactoryBoundaryInterface) this.a).getSupportedFeatures();
    }

    public void r(int i, List list) {
        boolean z = list instanceof FF1;
        int i2 = 0;
        C5271jD1 c5271jD1 = (C5271jD1) this.a;
        if (!z) {
            while (i2 < list.size()) {
                c5271jD1.j(i, (String) list.get(i2));
                i2++;
            }
            return;
        }
        FF1 ff1 = (FF1) list;
        while (i2 < list.size()) {
            Object objL = ff1.l(i2);
            if (objL instanceof String) {
                c5271jD1.j(i, (String) objL);
            } else {
                c5271jD1.e(i, (C8129yC1) objL);
            }
            i2++;
        }
    }

    public void s(int i, int i2) {
        C5271jD1 c5271jD1 = (C5271jD1) this.a;
        c5271jD1.l(i << 3);
        c5271jD1.l(i2);
    }

    public void t(int i, long j) {
        ((C5271jD1) this.a).m(i, j);
    }

    @Override // defpackage.InterfaceC1227Pm1
    public WebViewProviderBoundaryInterface u(C4315iH0 c4315iH0) {
        return (WebViewProviderBoundaryInterface) AbstractC1993Zi.b(WebViewProviderBoundaryInterface.class, ((WebViewProviderFactoryBoundaryInterface) this.a).createWebView(c4315iH0));
    }

    public void v(int i, String str, List list, boolean z, boolean z2) {
        int i2 = AbstractC6450pO1.a[AbstractC8235ym.x(i)];
        NN1 nn1 = (NN1) this.a;
        C6934rx c6934rx = i2 != 1 ? i2 != 2 ? i2 != 3 ? i2 != 4 ? nn1.n().m : nn1.n().o : z ? nn1.n().k : !z2 ? nn1.n().l : nn1.n().j : z ? nn1.n().h : !z2 ? nn1.n().i : nn1.n().g : nn1.n().n;
        int size = list.size();
        if (size == 1) {
            c6934rx.c(list.get(0), str);
            return;
        }
        if (size == 2) {
            c6934rx.b(list.get(0), list.get(1), str);
        } else if (size != 3) {
            c6934rx.d(str);
        } else {
            c6934rx.e(str, list.get(0), list.get(1), list.get(2));
        }
    }

    public void w(int i, boolean z) {
        C5271jD1 c5271jD1 = (C5271jD1) this.a;
        c5271jD1.l(i << 3);
        c5271jD1.c(z ? (byte) 1 : (byte) 0);
    }

    public OL1 x() {
        OL1 ol1 = C3386dP1.a((Service) this.a, null, null).i;
        C3386dP1.e(ol1);
        return ol1;
    }

    public void y(int i, C8129yC1 c8129yC1) {
        ((C5271jD1) this.a).e(i, c8129yC1);
    }

    public void z(int i, List list) {
        for (int i2 = 0; i2 < list.size(); i2++) {
            ((C5271jD1) this.a).e(i, (C8129yC1) list.get(i2));
        }
    }

    @Override // defpackage.InterfaceC5623l32
    public VY zza() {
        U41 u41 = new U41();
        u41.c = IA1.c() ? EnumC5993n02.TYPE_THICK : EnumC5993n02.TYPE_THIN;
        C5996n11 c5996n11 = new C5996n11(15, false);
        c5996n11.b = (EnumC6184o02) this.a;
        u41.e = new C02(c5996n11);
        return new VY(u41, 0);
    }

    public C6273oT0(Service service) {
        Preconditions.checkNotNull(service);
        this.a = service;
    }

    @Override // defpackage.InterfaceC0921Lo0
    public void flush() {
    }

    @Override // defpackage.InterfaceC0921Lo0
    public void i() {
    }

    @Override // defpackage.InterfaceC0921Lo0
    public void shutdown() {
    }

    @Override // defpackage.InterfaceC0921Lo0
    public void start() {
    }
}
