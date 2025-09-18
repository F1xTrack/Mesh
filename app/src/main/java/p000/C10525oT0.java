package p000;

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
public final class C10525oT0 implements InterfaceC11091su0, InterfaceC7914Lo0, InterfaceC7346Aq0, K30, InterfaceC8119Pm1, InterfaceC10090l32, RemoteCall {

    /* renamed from: a */
    public Object f39025a;

    public /* synthetic */ C10525oT0(Object obj) {
        this.f39025a = obj;
    }

    /* renamed from: A */
    public void m23416A(int i, double d) {
        ((C9854jD1) this.f39025a).m21999h(i, Double.doubleToRawLongBits(d));
    }

    /* renamed from: B */
    public void m23417B(int i, int i2) {
        C9854jD1 c9854jD1 = (C9854jD1) this.f39025a;
        c9854jD1.m22003l(i << 3);
        if (i2 >= 0) {
            c9854jD1.m22003l(i2);
        } else {
            c9854jD1.m22005n(i2);
        }
    }

    /* renamed from: C */
    public void m23418C(int i, int i2) {
        ((C9854jD1) this.f39025a).m21997f(i, i2);
    }

    /* renamed from: D */
    public void m23419D(int i, long j) {
        ((C9854jD1) this.f39025a).m21999h(i, j);
    }

    /* renamed from: E */
    public void m23420E(float f, int i) {
        ((C9854jD1) this.f39025a).m21997f(i, Float.floatToRawIntBits(f));
    }

    /* renamed from: F */
    public void m23421F(int i, Object obj, PH1 ph1) {
        C9854jD1 c9854jD1 = (C9854jD1) this.f39025a;
        c9854jD1.m22002k(i, 3);
        ph1.mo6293h((DB1) obj, c9854jD1.f34985a);
        c9854jD1.m22002k(i, 4);
    }

    /* renamed from: G */
    public void m23422G(int i, int i2) {
        C9854jD1 c9854jD1 = (C9854jD1) this.f39025a;
        c9854jD1.m22003l(i << 3);
        if (i2 >= 0) {
            c9854jD1.m22003l(i2);
        } else {
            c9854jD1.m22005n(i2);
        }
    }

    /* renamed from: H */
    public void m23423H(int i, long j) {
        ((C9854jD1) this.f39025a).m22004m(i, j);
    }

    /* renamed from: I */
    public void m23424I(int i, Object obj, PH1 ph1) {
        DB1 db1 = (DB1) obj;
        C9854jD1 c9854jD1 = (C9854jD1) this.f39025a;
        c9854jD1.m22003l((i << 3) | 2);
        c9854jD1.m22003l(db1.mo1586a(ph1));
        ph1.mo6293h(db1, c9854jD1.f34985a);
    }

    /* renamed from: J */
    public void m23425J(int i, int i2) {
        ((C9854jD1) this.f39025a).m21997f(i, i2);
    }

    /* renamed from: K */
    public void m23426K(int i, long j) {
        ((C9854jD1) this.f39025a).m21999h(i, j);
    }

    @Override // p000.InterfaceC11091su0
    /* renamed from: N */
    public File mo1465N() {
        return (File) ((CC0) ((C8128Pr0) this.f39025a).f9303a).f1250b;
    }

    @Override // p000.InterfaceC11091su0
    /* renamed from: U */
    public File mo1466U() {
        return (File) ((C8128Pr0) this.f39025a).f9305c;
    }

    @Override // p000.InterfaceC7914Lo0
    /* renamed from: a */
    public void mo87a(Bundle bundle) {
        ((MediaCodec) this.f39025a).setParameters(bundle);
    }

    @Override // com.google.android.gms.common.api.internal.RemoteCall
    public void accept(Object obj, Object obj2) {
        Api.ClientKey clientKey = RB1.f10059a;
        ((C11900zE1) obj).m26339f((PendingIntent) this.f39025a, (S81) obj2);
    }

    @Override // p000.InterfaceC7914Lo0
    /* renamed from: b */
    public void mo88b(int i, C6536oB c6536oB, long j, int i2) throws MediaCodec.CryptoException {
        ((MediaCodec) this.f39025a).queueSecureInputBuffer(i, 0, c6536oB.f38861i, j, i2);
    }

    @Override // p000.InterfaceC11091su0
    /* renamed from: b0 */
    public File mo1469b0() {
        return (File) ((C8128Pr0) this.f39025a).f9304b;
    }

    @Override // p000.InterfaceC7914Lo0
    /* renamed from: c */
    public void mo89c(int i, int i2, int i3, long j) throws MediaCodec.CryptoException {
        ((MediaCodec) this.f39025a).queueInputBuffer(i, 0, i2, j, i3);
    }

    @Override // p000.InterfaceC11091su0
    /* renamed from: d */
    public File mo1470d() {
        return (File) ((C8128Pr0) this.f39025a).f9306d;
    }

    @Override // p000.InterfaceC11091su0
    /* renamed from: e */
    public File mo1471e() {
        return (File) ((C8128Pr0) this.f39025a).f9308f;
    }

    @Override // p000.K30
    /* renamed from: f */
    public void mo4538f() {
        ((UCropActivity) this.f39025a).f20631s.setImageToWrapCropBounds(true);
    }

    @Override // p000.InterfaceC7346Aq0
    /* renamed from: g */
    public boolean mo346g(MenuC7450Cq0 menuC7450Cq0, MenuItem menuItem) {
        return false;
    }

    @Override // p000.InterfaceC8119Pm1
    public WebkitToCompatConverterBoundaryInterface getWebkitToCompatConverter() {
        return (WebkitToCompatConverterBoundaryInterface) AbstractC1618Zi.m9579b(WebkitToCompatConverterBoundaryInterface.class, ((WebViewProviderFactoryBoundaryInterface) this.f39025a).getWebkitToCompatConverter());
    }

    @Override // p000.K30
    /* renamed from: h */
    public void mo4539h(float f) {
        GestureCropImageView gestureCropImageView = ((UCropActivity) this.f39025a).f20631s;
        float f2 = f / 42.0f;
        RectF rectF = gestureCropImageView.f36338s;
        float fCenterX = rectF.centerX();
        float fCenterY = rectF.centerY();
        if (f2 != 0.0f) {
            Matrix matrix = gestureCropImageView.f41760g;
            matrix.postRotate(f2, fCenterX, fCenterY);
            gestureCropImageView.setImageMatrix(matrix);
            InterfaceC10800qc1 interfaceC10800qc1 = gestureCropImageView.f41763j;
            if (interfaceC10800qc1 != null) {
                float[] fArr = gestureCropImageView.f41759f;
                matrix.getValues(fArr);
                double d = fArr[1];
                matrix.getValues(fArr);
                float f3 = (float) (-(Math.atan2(d, fArr[0]) * 57.29577951308232d));
                TextView textView = ((UCropActivity) ((GQ0) interfaceC10800qc1).f3735b).f20610B;
                if (textView != null) {
                    textView.setText(String.format(Locale.getDefault(), "%.1f°", Float.valueOf(f3)));
                }
            }
        }
    }

    @Override // p000.K30
    /* renamed from: j */
    public void mo4540j() {
        ((UCropActivity) this.f39025a).f20631s.m22161f();
    }

    @Override // p000.InterfaceC7346Aq0
    /* renamed from: k */
    public void mo347k(MenuC7450Cq0 menuC7450Cq0) {
        C9262eb1 c9262eb1 = (C9262eb1) this.f39025a;
        boolean zM9864p = c9262eb1.f26763a.f27862a.m9864p();
        WindowCallbackC0070B6 windowCallbackC0070B6 = c9262eb1.f26764b;
        if (zM9864p) {
            windowCallbackC0070B6.onPanelClosed(108, menuC7450Cq0);
        } else if (windowCallbackC0070B6.onPreparePanel(0, null, menuC7450Cq0)) {
            windowCallbackC0070B6.onMenuOpened(108, menuC7450Cq0);
        }
    }

    @Override // p000.InterfaceC11091su0
    /* renamed from: l */
    public File mo1473l() {
        return (File) ((C8128Pr0) this.f39025a).f9307e;
    }

    /* renamed from: m */
    public void m23427m(AbstractC8388Ur0... abstractC8388Ur0Arr) {
        O90.m5968f(abstractC8388Ur0Arr, "migrations");
        for (AbstractC8388Ur0 abstractC8388Ur0 : abstractC8388Ur0Arr) {
            int i = abstractC8388Ur0.f12174a;
            LinkedHashMap linkedHashMap = (LinkedHashMap) this.f39025a;
            Integer numValueOf = Integer.valueOf(i);
            Object treeMap = linkedHashMap.get(numValueOf);
            if (treeMap == null) {
                treeMap = new TreeMap();
                linkedHashMap.put(numValueOf, treeMap);
            }
            TreeMap treeMap2 = (TreeMap) treeMap;
            int i2 = abstractC8388Ur0.f12175b;
            if (treeMap2.containsKey(Integer.valueOf(i2))) {
                Objects.toString(treeMap2.get(Integer.valueOf(i2)));
                abstractC8388Ur0.toString();
            }
            treeMap2.put(Integer.valueOf(i2), abstractC8388Ur0);
        }
    }

    /* renamed from: n */
    public void m23428n(int i, int i2) {
        int i3 = (i2 >> 31) ^ (i2 + i2);
        C9854jD1 c9854jD1 = (C9854jD1) this.f39025a;
        c9854jD1.m22003l(i << 3);
        c9854jD1.m22003l(i3);
    }

    @Override // p000.InterfaceC11091su0
    /* renamed from: o */
    public AbstractC6995vA mo1474o() {
        CC0 cc0 = (CC0) ((C8128Pr0) this.f39025a).f9303a;
        if (cc0 != null) {
            return (C0794Mc) cc0.f1251c;
        }
        return null;
    }

    /* renamed from: p */
    public void m23429p(int i, long j) {
        ((C9854jD1) this.f39025a).m22004m(i, (j >> 63) ^ (j + j));
    }

    @Override // p000.InterfaceC8119Pm1
    /* renamed from: q */
    public String[] mo6426q() {
        return ((WebViewProviderFactoryBoundaryInterface) this.f39025a).getSupportedFeatures();
    }

    /* renamed from: r */
    public void m23430r(int i, List list) {
        boolean z = list instanceof FF1;
        int i2 = 0;
        C9854jD1 c9854jD1 = (C9854jD1) this.f39025a;
        if (!z) {
            while (i2 < list.size()) {
                c9854jD1.m22001j(i, (String) list.get(i2));
                i2++;
            }
            return;
        }
        FF1 ff1 = (FF1) list;
        while (i2 < list.size()) {
            Object objMo139l = ff1.mo139l(i2);
            if (objMo139l instanceof String) {
                c9854jD1.m22001j(i, (String) objMo139l);
            } else {
                c9854jD1.m21996e(i, (C11769yC1) objMo139l);
            }
            i2++;
        }
    }

    /* renamed from: s */
    public void m23431s(int i, int i2) {
        C9854jD1 c9854jD1 = (C9854jD1) this.f39025a;
        c9854jD1.m22003l(i << 3);
        c9854jD1.m22003l(i2);
    }

    /* renamed from: t */
    public void m23432t(int i, long j) {
        ((C9854jD1) this.f39025a).m22004m(i, j);
    }

    @Override // p000.InterfaceC8119Pm1
    /* renamed from: u */
    public WebViewProviderBoundaryInterface mo6427u(C9733iH0 c9733iH0) {
        return (WebViewProviderBoundaryInterface) AbstractC1618Zi.m9579b(WebViewProviderBoundaryInterface.class, ((WebViewProviderFactoryBoundaryInterface) this.f39025a).createWebView(c9733iH0));
    }

    /* renamed from: v */
    public void m23433v(int i, String str, List list, boolean z, boolean z2) {
        int i2 = AbstractC10644pO1.f40047a[AbstractC7222ym.m26247x(i)];
        NN1 nn1 = (NN1) this.f39025a;
        C6792rx c6792rx = i2 != 1 ? i2 != 2 ? i2 != 3 ? i2 != 4 ? nn1.mo6070n().f8384m : nn1.mo6070n().f8386o : z ? nn1.mo6070n().f8382k : !z2 ? nn1.mo6070n().f8383l : nn1.mo6070n().f8381j : z ? nn1.mo6070n().f8379h : !z2 ? nn1.mo6070n().f8380i : nn1.mo6070n().f8378g : nn1.mo6070n().f8385n;
        int size = list.size();
        if (size == 1) {
            c6792rx.m24554c(list.get(0), str);
            return;
        }
        if (size == 2) {
            c6792rx.m24553b(list.get(0), list.get(1), str);
        } else if (size != 3) {
            c6792rx.m24555d(str);
        } else {
            c6792rx.m24556e(str, list.get(0), list.get(1), list.get(2));
        }
    }

    /* renamed from: w */
    public void m23434w(int i, boolean z) {
        C9854jD1 c9854jD1 = (C9854jD1) this.f39025a;
        c9854jD1.m22003l(i << 3);
        c9854jD1.m21994c(z ? (byte) 1 : (byte) 0);
    }

    /* renamed from: x */
    public OL1 m23435x() {
        OL1 ol1 = C9110dP1.m17588a((Service) this.f39025a, null, null).f26039i;
        C9110dP1.m17592e(ol1);
        return ol1;
    }

    /* renamed from: y */
    public void m23436y(int i, C11769yC1 c11769yC1) {
        ((C9854jD1) this.f39025a).m21996e(i, c11769yC1);
    }

    /* renamed from: z */
    public void m23437z(int i, List list) {
        for (int i2 = 0; i2 < list.size(); i2++) {
            ((C9854jD1) this.f39025a).m21996e(i, (C11769yC1) list.get(i2));
        }
    }

    @Override // p000.InterfaceC10090l32
    public C1356VY zza() {
        U41 u41 = new U41();
        u41.f11646c = IA1.m3779c() ? EnumC10337n02.TYPE_THICK : EnumC10337n02.TYPE_THIN;
        C10339n11 c10339n11 = new C10339n11(15, false);
        c10339n11.f38046b = (EnumC10465o02) this.f39025a;
        u41.f11648e = new C02(c10339n11);
        return new C1356VY(u41, 0);
    }

    public C10525oT0(Service service) {
        Preconditions.checkNotNull(service);
        this.f39025a = service;
    }

    @Override // p000.InterfaceC7914Lo0
    public void flush() {
    }

    @Override // p000.InterfaceC7914Lo0
    /* renamed from: i */
    public void mo90i() {
    }

    @Override // p000.InterfaceC7914Lo0
    public void shutdown() {
    }

    @Override // p000.InterfaceC7914Lo0
    public void start() {
    }
}
