package p000;

import android.content.ClipData;
import android.content.ContentResolver;
import android.content.Context;
import android.content.res.Resources;
import android.database.Cursor;
import android.hardware.camera2.CameraDevice;
import android.net.Uri;
import android.os.Build;
import android.os.Handler;
import android.provider.MediaStore;
import android.text.TextUtils;
import android.view.ContentInfo;
import android.view.MenuItem;
import android.view.View;
import android.webkit.WebView;
import androidx.appcompat.widget.ActionMenuView;
import androidx.appcompat.widget.Toolbar;
import androidx.camera.camera2.internal.compat.quirk.CaptureSessionOnClosedNotCalledQuirk;
import androidx.recyclerview.widget.RecyclerView;
import com.yandex.metrica.impl.interact.CellularNetworkInfo;
import com.yandex.metrica.impl.p022ob.C2487Ak;
import com.yandex.metrica.impl.p022ob.C3010Vj;
import com.yandex.metrica.impl.p022ob.InterfaceC2512Bk;
import java.io.EOFException;
import java.io.File;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Collections;
import java.util.EnumSet;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeoutException;
import org.chromium.support_lib_boundary.JsReplyProxyBoundaryInterface;
import org.chromium.support_lib_boundary.WebMessageBoundaryInterface;
import org.chromium.support_lib_boundary.WebMessageListenerBoundaryInterface;
import org.chromium.support_lib_boundary.WebMessagePortBoundaryInterface;

/* renamed from: Bm1 */
/* loaded from: classes.dex */
public class C7391Bm1 implements WebMessageListenerBoundaryInterface, InterfaceC9644ha1, InterfaceC7346Aq0, InterfaceC6597p7, InterfaceC9305ex0, InterfaceC11800yS0, InterfaceC2512Bk, InterfaceC8294Sw0, InterfaceC7297zy, InterfaceC10687pk0, InterfaceC0980PZ, InterfaceC10699pq0, InterfaceC6471n9, W21 {

    /* renamed from: c */
    public static final String[] f1020c = {"_data"};

    /* renamed from: a */
    public final /* synthetic */ int f1021a;

    /* renamed from: b */
    public Object f1022b;

    public /* synthetic */ C7391Bm1(int i, Object obj) {
        this.f1021a = i;
        this.f1022b = obj;
    }

    @Override // com.yandex.metrica.impl.p022ob.InterfaceC2512Bk
    /* renamed from: a */
    public void mo859a(C2487Ak c2487Ak) {
        C3010Vj c3010VjM13869b = c2487Ak.m13869b();
        if (c3010VjM13869b != null) {
            String strM15340m = c3010VjM13869b.m15340m();
            String strM15341n = c3010VjM13869b.m15341n();
            Integer numM15339l = c3010VjM13869b.m15339l();
            Integer numM15338k = c3010VjM13869b.m15338k();
            Integer numM15329b = c3010VjM13869b.m15329b();
            Integer numM15332e = c3010VjM13869b.m15332e();
            Integer numM15343p = c3010VjM13869b.m15343p();
            HashMap map = new HashMap();
            map.put("network_type", strM15340m);
            map.put("operator_name", strM15341n);
            map.put("country_code", numM15338k != null ? String.valueOf(numM15338k) : null);
            map.put("operator_id", numM15339l != null ? String.valueOf(numM15339l) : null);
            map.put("cell_id", numM15329b != null ? String.valueOf(numM15329b) : null);
            map.put("lac", numM15332e != null ? String.valueOf(numM15332e) : null);
            map.put("signal_strength", numM15343p != null ? String.valueOf(numM15343p) : null);
            StringBuilder sb = new StringBuilder();
            String str = "";
            for (Map.Entry entry : map.entrySet()) {
                String str2 = (String) entry.getValue();
                if (!TextUtils.isEmpty(str2)) {
                    sb.append(str);
                    sb.append((String) entry.getKey());
                    sb.append(ContainerUtils.KEY_VALUE_DELIMITER);
                    sb.append(str2);
                    str = ContainerUtils.FIELD_DELIMITER;
                }
            }
            ((CellularNetworkInfo) this.f1022b).f20820a = sb.toString();
        }
    }

    @Override // p000.InterfaceC6471n9
    public InterfaceFutureC7800Jj0 apply(Object obj) {
        return AbstractC8301Sz1.m7484g(((InterfaceC6894tZ) this.f1022b).apply(obj));
    }

    @Override // p000.InterfaceC7297zy
    /* renamed from: b */
    public ClipData mo860b() {
        return ((ContentInfo) this.f1022b).getClip();
    }

    @Override // p000.InterfaceC8294Sw0
    /* renamed from: c */
    public Object mo386c() {
        Type type = (Type) this.f1022b;
        if (!(type instanceof ParameterizedType)) {
            throw new C10799qc0("Invalid EnumSet type: " + type.toString());
        }
        Type type2 = ((ParameterizedType) type).getActualTypeArguments()[0];
        if (type2 instanceof Class) {
            return EnumSet.noneOf((Class) type2);
        }
        throw new C10799qc0("Invalid EnumSet type: " + type.toString());
    }

    @Override // p000.InterfaceC10699pq0
    /* renamed from: d */
    public void mo861d(InterfaceC4199hl interfaceC4199hl) {
        ((C7512Dv0) this.f1022b).getClass();
    }

    @Override // p000.InterfaceC7297zy
    /* renamed from: e */
    public int mo862e() {
        return ((ContentInfo) this.f1022b).getSource();
    }

    @Override // p000.InterfaceC7346Aq0
    /* renamed from: g */
    public boolean mo346g(MenuC7450Cq0 menuC7450Cq0, MenuItem menuItem) {
        boolean zOnMenuItemSelected;
        InterfaceC6718r2 interfaceC6718r2 = ((ActionMenuView) this.f1022b).f15841A;
        if (interfaceC6718r2 == null) {
            return false;
        }
        Toolbar toolbar = (Toolbar) ((C10226m71) interfaceC6718r2).f37493b;
        if (toolbar.f15875G.m3607a(menuItem)) {
            zOnMenuItemSelected = true;
        } else {
            InterfaceC9001cb1 interfaceC9001cb1 = toolbar.f15877I;
            zOnMenuItemSelected = interfaceC9001cb1 != null ? ((C9262eb1) ((GQ0) interfaceC9001cb1).f3735b).f26764b.f563a.onMenuItemSelected(0, menuItem) : false;
        }
        return zOnMenuItemSelected;
    }

    @Override // org.chromium.support_lib_boundary.FeatureFlagHolderBoundaryInterface
    public String[] getSupportedFeatures() {
        return new String[]{"WEB_MESSAGE_LISTENER"};
    }

    @Override // p000.InterfaceC9644ha1
    /* renamed from: h */
    public Cursor mo864h(Uri uri) {
        String lastPathSegment = uri.getLastPathSegment();
        return ((ContentResolver) this.f1022b).query(MediaStore.Images.Thumbnails.EXTERNAL_CONTENT_URI, f1020c, "kind = 1 AND image_id = ?", new String[]{lastPathSegment}, null);
    }

    @Override // p000.InterfaceC7297zy
    /* renamed from: i */
    public int mo865i() {
        return ((ContentInfo) this.f1022b).getFlags();
    }

    @Override // p000.InterfaceC7297zy
    /* renamed from: j */
    public ContentInfo mo866j() {
        return (ContentInfo) this.f1022b;
    }

    @Override // p000.InterfaceC7346Aq0
    /* renamed from: k */
    public void mo347k(MenuC7450Cq0 menuC7450Cq0) {
        InterfaceC7346Aq0 interfaceC7346Aq0 = ((ActionMenuView) this.f1022b).f15848v;
        if (interfaceC7346Aq0 != null) {
            interfaceC7346Aq0.mo347k(menuC7450Cq0);
        }
    }

    @Override // p000.InterfaceC10699pq0
    /* renamed from: m */
    public void mo868m(InterfaceC4199hl interfaceC4199hl) {
        ((C7512Dv0) this.f1022b).getClass();
    }

    /* renamed from: o */
    public void m870o(int i, boolean z) {
        C0926Oi c0926Oi = (C0926Oi) this.f1022b;
        if (z) {
            c0926Oi.m6120e(i);
        } else {
            c0926Oi.getClass();
        }
    }

    @Override // p000.InterfaceC0980PZ
    public void onFailure(Throwable th) {
        boolean z = th instanceof TimeoutException;
        C0300El c0300El = (C0300El) this.f1022b;
        if (z) {
            c0300El.m2377d(th);
        } else {
            c0300El.m2375b(Collections.emptyList());
        }
    }

    @Override // org.chromium.support_lib_boundary.WebMessageListenerBoundaryInterface
    public void onPostMessage(WebView webView, InvocationHandler invocationHandler, Uri uri, boolean z, InvocationHandler invocationHandler2) {
        WebMessageBoundaryInterface webMessageBoundaryInterface = (WebMessageBoundaryInterface) AbstractC1618Zi.m9579b(WebMessageBoundaryInterface.class, invocationHandler);
        String data = webMessageBoundaryInterface.getData();
        InvocationHandler[] ports = webMessageBoundaryInterface.getPorts();
        GQ0[] gq0Arr = new GQ0[ports.length];
        for (int i = 0; i < ports.length; i++) {
            InvocationHandler invocationHandler3 = ports[i];
            GQ0 gq0 = new GQ0(7);
            gq0.f3735b = (WebMessagePortBoundaryInterface) AbstractC1618Zi.m9579b(WebMessagePortBoundaryInterface.class, invocationHandler3);
            gq0Arr[i] = gq0;
        }
        JsReplyProxyBoundaryInterface jsReplyProxyBoundaryInterface = (JsReplyProxyBoundaryInterface) AbstractC1618Zi.m9579b(JsReplyProxyBoundaryInterface.class, invocationHandler2);
        C7391Bm1 c7391Bm1 = (C7391Bm1) this.f1022b;
        c7391Bm1.getClass();
        ((C9733iH0) c7391Bm1.f1022b).m18997c(data, uri.toString());
    }

    @Override // p000.InterfaceC0980PZ
    public void onSuccess(Object obj) {
        List list = (List) obj;
        list.getClass();
        ((C0300El) this.f1022b).m2375b(new ArrayList(list));
    }

    /* renamed from: p */
    public void m871p(C4155h3 c4155h3) {
        int i = c4155h3.f28181a;
        RecyclerView recyclerView = (RecyclerView) this.f1022b;
        if (i == 1) {
            recyclerView.f16512n.mo10155Y(c4155h3.f28182b, c4155h3.f28183c);
            return;
        }
        if (i == 2) {
            recyclerView.f16512n.mo10159b0(c4155h3.f28182b, c4155h3.f28183c);
        } else if (i == 4) {
            recyclerView.f16512n.mo10160c0(c4155h3.f28182b, c4155h3.f28183c);
        } else {
            if (i != 8) {
                return;
            }
            recyclerView.f16512n.mo10158a0(c4155h3.f28182b, c4155h3.f28183c);
        }
    }

    /* renamed from: q */
    public OO0 m872q(int i) {
        RecyclerView recyclerView = (RecyclerView) this.f1022b;
        int iM22561T = recyclerView.f16504f.m22561T();
        int i2 = 0;
        OO0 oo0 = null;
        while (true) {
            if (i2 >= iM22561T) {
                break;
            }
            OO0 oo0M10226M = RecyclerView.m10226M(recyclerView.f16504f.m22560S(i2));
            if (oo0M10226M != null && !oo0M10226M.m6052i() && oo0M10226M.f8410c == i) {
                if (!((ArrayList) recyclerView.f16504f.f37325d).contains(oo0M10226M.f8408a)) {
                    oo0 = oo0M10226M;
                    break;
                }
                oo0 = oo0M10226M;
            }
            i2++;
        }
        if (oo0 == null) {
            return null;
        }
        if (!((ArrayList) recyclerView.f16504f.f37325d).contains(oo0.f8408a)) {
            return oo0;
        }
        boolean z = RecyclerView.f16450L1;
        return null;
    }

    /* renamed from: r */
    public void m873r(OY0 oy0) {
        ((C8359Uc1) ((InterfaceC8307Tc1) ((InterfaceC9347fG0) this.f1022b).get())).m8089a("FIREBASE_APPQUALITY_SESSION", new C7135xO("json"), new C0267EE(4, this)).m8514a(new C0040Ad(oy0, EnumC11261uD0.f43594a, null), new C7754Im0(29));
    }

    /* JADX WARN: Removed duplicated region for block: B:173:0x00c3  */
    /* JADX WARN: Removed duplicated region for block: B:204:0x012e  */
    @Override // p000.InterfaceC9305ex0
    /* renamed from: r0 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void mo505r0(java.lang.Object r11) throws android.content.res.Resources.NotFoundException {
        /*
            Method dump skipped, instructions count: 396
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.C7391Bm1.mo505r0(java.lang.Object):void");
    }

    /* renamed from: s */
    public void m874s(int i, int i2) {
        int i3;
        int i4;
        RecyclerView recyclerView = (RecyclerView) this.f1022b;
        int iM22561T = recyclerView.f16504f.m22561T();
        int i5 = i2 + i;
        for (int i6 = 0; i6 < iM22561T; i6++) {
            View viewM22560S = recyclerView.f16504f.m22560S(i6);
            OO0 oo0M10226M = RecyclerView.m10226M(viewM22560S);
            if (oo0M10226M != null && !oo0M10226M.m6059p() && (i4 = oo0M10226M.f8410c) >= i && i4 < i5) {
                oo0M10226M.m6044a(2);
                oo0M10226M.m6044a(1024);
                ((AO0) viewM22560S.getLayoutParams()).f184c = true;
            }
        }
        FO0 fo0 = recyclerView.f16498c;
        ArrayList arrayList = fo0.f3194c;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            OO0 oo0 = (OO0) arrayList.get(size);
            if (oo0 != null && (i3 = oo0.f8410c) >= i && i3 < i5) {
                oo0.m6044a(2);
                fo0.m2624g(size);
            }
        }
        recyclerView.f16528w1 = true;
    }

    @Override // p000.InterfaceC11800yS0
    /* renamed from: t */
    public InterfaceC10011kS0 mo875t(InterfaceC10011kS0 interfaceC10011kS0, C7830Jy0 c7830Jy0) {
        if (interfaceC10011kS0 == null) {
            return null;
        }
        return new C6506ni((Resources) this.f1022b, interfaceC10011kS0);
    }

    public String toString() {
        switch (this.f1021a) {
            case 11:
                return "ContentInfoCompat{" + ((ContentInfo) this.f1022b) + "}";
            case 23:
                StringBuilder sb = new StringBuilder();
                C7588Fh0 c7588Fh0 = (C7588Fh0) this.f1022b;
                sb.append(c7588Fh0);
                sb.append(": ");
                sb.append(((Map) WS1.m8763b(c7588Fh0.f3393j, C7588Fh0.f3390n[0])).keySet());
                return sb.toString();
            default:
                return super.toString();
        }
    }

    /* renamed from: u */
    public void m876u(int i, int i2) {
        RecyclerView recyclerView = (RecyclerView) this.f1022b;
        int iM22561T = recyclerView.f16504f.m22561T();
        for (int i3 = 0; i3 < iM22561T; i3++) {
            OO0 oo0M10226M = RecyclerView.m10226M(recyclerView.f16504f.m22560S(i3));
            if (oo0M10226M != null && !oo0M10226M.m6059p() && oo0M10226M.f8410c >= i) {
                if (RecyclerView.f16451M1) {
                    oo0M10226M.toString();
                }
                oo0M10226M.m6056m(i2, false);
                recyclerView.f16520s1.f6050f = true;
            }
        }
        ArrayList arrayList = recyclerView.f16498c.f3194c;
        int size = arrayList.size();
        for (int i4 = 0; i4 < size; i4++) {
            OO0 oo0 = (OO0) arrayList.get(i4);
            if (oo0 != null && oo0.f8410c >= i) {
                if (RecyclerView.f16451M1) {
                    oo0.toString();
                }
                oo0.m6056m(i2, false);
            }
        }
        recyclerView.requestLayout();
        recyclerView.f16526v1 = true;
    }

    @Override // p000.InterfaceC10699pq0
    /* renamed from: v */
    public void mo877v(InterfaceC4199hl interfaceC4199hl) {
        ((C7512Dv0) this.f1022b).getClass();
    }

    /* renamed from: w */
    public void m878w(int i, int i2) {
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        RecyclerView recyclerView = (RecyclerView) this.f1022b;
        int iM22561T = recyclerView.f16504f.m22561T();
        int i10 = -1;
        if (i < i2) {
            i4 = i;
            i3 = i2;
            i5 = -1;
        } else {
            i3 = i;
            i4 = i2;
            i5 = 1;
        }
        for (int i11 = 0; i11 < iM22561T; i11++) {
            OO0 oo0M10226M = RecyclerView.m10226M(recyclerView.f16504f.m22560S(i11));
            if (oo0M10226M != null && (i9 = oo0M10226M.f8410c) >= i4 && i9 <= i3) {
                if (RecyclerView.f16451M1) {
                    oo0M10226M.toString();
                }
                if (oo0M10226M.f8410c == i) {
                    oo0M10226M.m6056m(i2 - i, false);
                } else {
                    oo0M10226M.m6056m(i5, false);
                }
                recyclerView.f16520s1.f6050f = true;
            }
        }
        FO0 fo0 = recyclerView.f16498c;
        fo0.getClass();
        if (i < i2) {
            i7 = i;
            i6 = i2;
        } else {
            i6 = i;
            i7 = i2;
            i10 = 1;
        }
        ArrayList arrayList = fo0.f3194c;
        int size = arrayList.size();
        for (int i12 = 0; i12 < size; i12++) {
            OO0 oo0 = (OO0) arrayList.get(i12);
            if (oo0 != null && (i8 = oo0.f8410c) >= i7 && i8 <= i6) {
                if (i8 == i) {
                    oo0.m6056m(i2 - i, false);
                } else {
                    oo0.m6056m(i10, false);
                }
                if (RecyclerView.f16451M1) {
                    oo0.toString();
                }
            }
        }
        recyclerView.requestLayout();
        recyclerView.f16526v1 = true;
    }

    /* renamed from: x */
    public C7660Gr0 m879x(C7000vF c7000vF, S50 s50) throws EOFException, InterruptedIOException {
        C9591hA0 c9591hA0 = (C9591hA0) this.f1022b;
        C7660Gr0 c7660Gr0M7917e = null;
        int i = 0;
        while (true) {
            try {
                c7000vF.mo3620f(c9591hA0.f28293a, 0, 10, false);
                c9591hA0.m18741G(0);
                if (c9591hA0.m18766x() != 4801587) {
                    break;
                }
                c9591hA0.m18742H(3);
                int iM18762t = c9591hA0.m18762t();
                int i2 = iM18762t + 10;
                if (c7660Gr0M7917e == null) {
                    byte[] bArr = new byte[i2];
                    System.arraycopy(c9591hA0.f28293a, 0, bArr, 0, 10);
                    c7000vF.mo3620f(bArr, 10, iM18762t, false);
                    c7660Gr0M7917e = new U50(s50).m7917e(i2, bArr);
                } else {
                    c7000vF.m25375a(iM18762t, false);
                }
                i += i2;
            } catch (EOFException unused) {
            }
        }
        c7000vF.f44297f = 0;
        c7000vF.m25375a(i, false);
        return c7660Gr0M7917e;
    }

    public /* synthetic */ C7391Bm1(int i, boolean z) {
        this.f1021a = i;
    }

    public C7391Bm1(C7588Fh0 c7588Fh0) {
        this.f1021a = 23;
        O90.m5968f(c7588Fh0, "packageFragment");
        this.f1022b = c7588Fh0;
    }

    public C7391Bm1(Context context) {
        this.f1021a = 22;
        this.f1022b = new A90(context);
    }

    public C7391Bm1(C0471HT c0471ht) {
        this.f1021a = 6;
        this.f1022b = new File((File) c0471ht.f4311c, "com.crashlytics.settings.json");
    }

    public C7391Bm1(int i) {
        this.f1021a = i;
        switch (i) {
            case 26:
                this.f1022b = new C0926Oi(4);
                break;
            default:
                this.f1022b = new C9591hA0(10);
                break;
        }
    }

    public C7391Bm1(C9196e41 c9196e41) {
        this.f1021a = 19;
        this.f1022b = (CaptureSessionOnClosedNotCalledQuirk) c9196e41.m17864z0(CaptureSessionOnClosedNotCalledQuirk.class);
    }

    public C7391Bm1(CameraDevice cameraDevice, Handler handler) {
        this.f1021a = 7;
        int i = Build.VERSION.SDK_INT;
        if (i >= 28) {
            cameraDevice.getClass();
            this.f1022b = new C1870co(cameraDevice, null);
        } else if (i >= 24) {
            this.f1022b = new C1808bo(cameraDevice, new C9432fw1(6, handler));
        } else {
            this.f1022b = new C4238iN(cameraDevice, new C9432fw1(6, handler));
        }
    }

    public C7391Bm1(ContentInfo contentInfo) {
        this.f1021a = 11;
        contentInfo.getClass();
        this.f1022b = AbstractC1205T9.m7595n(contentInfo);
    }

    @Override // p000.InterfaceC10687pk0
    /* renamed from: a */
    public void mo858a() throws IOException {
        C7123xC c7123xC = (C7123xC) this.f1022b;
        c7123xC.f45439B.mo858a();
        C6583ou c6583ou = c7123xC.f45441D;
        if (c6583ou != null) {
            throw c6583ou;
        }
    }

    @Override // p000.InterfaceC6597p7
    /* renamed from: f */
    public void mo863f(int i) {
    }

    @Override // p000.InterfaceC6597p7
    /* renamed from: l */
    public void mo867l(int i) {
    }

    @Override // p000.InterfaceC6597p7
    /* renamed from: n */
    public void mo869n(int i, float f) {
    }
}
