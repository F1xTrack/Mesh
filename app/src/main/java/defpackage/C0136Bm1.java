package defpackage;

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
import com.yandex.metrica.impl.ob.Ak;
import com.yandex.metrica.impl.ob.Bk;
import com.yandex.metrica.impl.ob.Vj;
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
public class C0136Bm1 implements WebMessageListenerBoundaryInterface, InterfaceC4182ha1, InterfaceC0069Aq0, InterfaceC6397p7, InterfaceC3677ex0, InterfaceC8176yS0, Bk, InterfaceC1490Sw0, InterfaceC8461zy, InterfaceC6515pk0, PZ, InterfaceC6533pq0, InterfaceC6021n9, W21 {
    public static final String[] c = {"_data"};
    public final /* synthetic */ int a;
    public Object b;

    public /* synthetic */ C0136Bm1(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    @Override // com.yandex.metrica.impl.ob.Bk
    public void a(Ak ak) {
        Vj vjB = ak.b();
        if (vjB != null) {
            String strM = vjB.m();
            String strN = vjB.n();
            Integer numL = vjB.l();
            Integer numK = vjB.k();
            Integer numB = vjB.b();
            Integer numE = vjB.e();
            Integer numP = vjB.p();
            HashMap map = new HashMap();
            map.put("network_type", strM);
            map.put("operator_name", strN);
            map.put("country_code", numK != null ? String.valueOf(numK) : null);
            map.put("operator_id", numL != null ? String.valueOf(numL) : null);
            map.put("cell_id", numB != null ? String.valueOf(numB) : null);
            map.put("lac", numE != null ? String.valueOf(numE) : null);
            map.put("signal_strength", numP != null ? String.valueOf(numP) : null);
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
            ((CellularNetworkInfo) this.b).a = sb.toString();
        }
    }

    @Override // defpackage.InterfaceC6021n9
    public InterfaceFutureC0750Jj0 apply(Object obj) {
        return AbstractC1500Sz1.g(((InterfaceC7244tZ) this.b).apply(obj));
    }

    @Override // defpackage.InterfaceC8461zy
    public ClipData b() {
        return ((ContentInfo) this.b).getClip();
    }

    @Override // defpackage.InterfaceC1490Sw0
    public Object c() {
        Type type = (Type) this.b;
        if (!(type instanceof ParameterizedType)) {
            throw new C6682qc0("Invalid EnumSet type: " + type.toString());
        }
        Type type2 = ((ParameterizedType) type).getActualTypeArguments()[0];
        if (type2 instanceof Class) {
            return EnumSet.noneOf((Class) type2);
        }
        throw new C6682qc0("Invalid EnumSet type: " + type.toString());
    }

    @Override // defpackage.InterfaceC6533pq0
    public void d(InterfaceC4213hl interfaceC4213hl) {
        ((C0318Dv0) this.b).getClass();
    }

    @Override // defpackage.InterfaceC8461zy
    public int e() {
        return ((ContentInfo) this.b).getSource();
    }

    @Override // defpackage.InterfaceC0069Aq0
    public boolean g(MenuC0225Cq0 menuC0225Cq0, MenuItem menuItem) {
        boolean zOnMenuItemSelected;
        InterfaceC6761r2 interfaceC6761r2 = ((ActionMenuView) this.b).A;
        if (interfaceC6761r2 == null) {
            return false;
        }
        Toolbar toolbar = (Toolbar) ((C5826m71) interfaceC6761r2).b;
        if (toolbar.G.a(menuItem)) {
            zOnMenuItemSelected = true;
        } else {
            InterfaceC2546cb1 interfaceC2546cb1 = toolbar.I;
            zOnMenuItemSelected = interfaceC2546cb1 != null ? ((C3612eb1) ((GQ0) interfaceC2546cb1).b).b.a.onMenuItemSelected(0, menuItem) : false;
        }
        return zOnMenuItemSelected;
    }

    @Override // org.chromium.support_lib_boundary.FeatureFlagHolderBoundaryInterface
    public String[] getSupportedFeatures() {
        return new String[]{"WEB_MESSAGE_LISTENER"};
    }

    @Override // defpackage.InterfaceC4182ha1
    public Cursor h(Uri uri) {
        String lastPathSegment = uri.getLastPathSegment();
        return ((ContentResolver) this.b).query(MediaStore.Images.Thumbnails.EXTERNAL_CONTENT_URI, c, "kind = 1 AND image_id = ?", new String[]{lastPathSegment}, null);
    }

    @Override // defpackage.InterfaceC8461zy
    public int i() {
        return ((ContentInfo) this.b).getFlags();
    }

    @Override // defpackage.InterfaceC8461zy
    public ContentInfo j() {
        return (ContentInfo) this.b;
    }

    @Override // defpackage.InterfaceC0069Aq0
    public void k(MenuC0225Cq0 menuC0225Cq0) {
        InterfaceC0069Aq0 interfaceC0069Aq0 = ((ActionMenuView) this.b).v;
        if (interfaceC0069Aq0 != null) {
            interfaceC0069Aq0.k(menuC0225Cq0);
        }
    }

    @Override // defpackage.InterfaceC6533pq0
    public void m(InterfaceC4213hl interfaceC4213hl) {
        ((C0318Dv0) this.b).getClass();
    }

    public void o(int i, boolean z) {
        C1135Oi c1135Oi = (C1135Oi) this.b;
        if (z) {
            c1135Oi.e(i);
        } else {
            c1135Oi.getClass();
        }
    }

    @Override // defpackage.PZ
    public void onFailure(Throwable th) {
        boolean z = th instanceof TimeoutException;
        C0365El c0365El = (C0365El) this.b;
        if (z) {
            c0365El.d(th);
        } else {
            c0365El.b(Collections.emptyList());
        }
    }

    @Override // org.chromium.support_lib_boundary.WebMessageListenerBoundaryInterface
    public void onPostMessage(WebView webView, InvocationHandler invocationHandler, Uri uri, boolean z, InvocationHandler invocationHandler2) {
        WebMessageBoundaryInterface webMessageBoundaryInterface = (WebMessageBoundaryInterface) AbstractC1993Zi.b(WebMessageBoundaryInterface.class, invocationHandler);
        String data = webMessageBoundaryInterface.getData();
        InvocationHandler[] ports = webMessageBoundaryInterface.getPorts();
        GQ0[] gq0Arr = new GQ0[ports.length];
        for (int i = 0; i < ports.length; i++) {
            InvocationHandler invocationHandler3 = ports[i];
            GQ0 gq0 = new GQ0(7);
            gq0.b = (WebMessagePortBoundaryInterface) AbstractC1993Zi.b(WebMessagePortBoundaryInterface.class, invocationHandler3);
            gq0Arr[i] = gq0;
        }
        JsReplyProxyBoundaryInterface jsReplyProxyBoundaryInterface = (JsReplyProxyBoundaryInterface) AbstractC1993Zi.b(JsReplyProxyBoundaryInterface.class, invocationHandler2);
        C0136Bm1 c0136Bm1 = (C0136Bm1) this.b;
        c0136Bm1.getClass();
        ((C4315iH0) c0136Bm1.b).c(data, uri.toString());
    }

    @Override // defpackage.PZ
    public void onSuccess(Object obj) {
        List list = (List) obj;
        list.getClass();
        ((C0365El) this.b).b(new ArrayList(list));
    }

    public void p(C4080h3 c4080h3) {
        int i = c4080h3.a;
        RecyclerView recyclerView = (RecyclerView) this.b;
        if (i == 1) {
            recyclerView.n.Y(c4080h3.b, c4080h3.c);
            return;
        }
        if (i == 2) {
            recyclerView.n.b0(c4080h3.b, c4080h3.c);
        } else if (i == 4) {
            recyclerView.n.c0(c4080h3.b, c4080h3.c);
        } else {
            if (i != 8) {
                return;
            }
            recyclerView.n.a0(c4080h3.b, c4080h3.c);
        }
    }

    public OO0 q(int i) {
        RecyclerView recyclerView = (RecyclerView) this.b;
        int iT = recyclerView.f.T();
        int i2 = 0;
        OO0 oo0 = null;
        while (true) {
            if (i2 >= iT) {
                break;
            }
            OO0 oo0M = RecyclerView.M(recyclerView.f.S(i2));
            if (oo0M != null && !oo0M.i() && oo0M.c == i) {
                if (!((ArrayList) recyclerView.f.d).contains(oo0M.a)) {
                    oo0 = oo0M;
                    break;
                }
                oo0 = oo0M;
            }
            i2++;
        }
        if (oo0 == null) {
            return null;
        }
        if (!((ArrayList) recyclerView.f.d).contains(oo0.a)) {
            return oo0;
        }
        boolean z = RecyclerView.L1;
        return null;
    }

    public void r(OY0 oy0) {
        ((C1587Uc1) ((InterfaceC1509Tc1) ((InterfaceC3739fG0) this.b).get())).a("FIREBASE_APPQUALITY_SESSION", new C7973xO("json"), new EE(4, this)).a(new C0029Ad(oy0, EnumC7370uD0.a, null), new C0681Im0(29));
    }

    /* JADX WARN: Removed duplicated region for block: B:173:0x00c3  */
    /* JADX WARN: Removed duplicated region for block: B:204:0x012e  */
    @Override // defpackage.InterfaceC3677ex0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void r0(java.lang.Object r11) throws android.content.res.Resources.NotFoundException {
        /*
            Method dump skipped, instructions count: 396
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C0136Bm1.r0(java.lang.Object):void");
    }

    public void s(int i, int i2) {
        int i3;
        int i4;
        RecyclerView recyclerView = (RecyclerView) this.b;
        int iT = recyclerView.f.T();
        int i5 = i2 + i;
        for (int i6 = 0; i6 < iT; i6++) {
            View viewS = recyclerView.f.S(i6);
            OO0 oo0M = RecyclerView.M(viewS);
            if (oo0M != null && !oo0M.p() && (i4 = oo0M.c) >= i && i4 < i5) {
                oo0M.a(2);
                oo0M.a(1024);
                ((AO0) viewS.getLayoutParams()).c = true;
            }
        }
        FO0 fo0 = recyclerView.c;
        ArrayList arrayList = fo0.c;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            OO0 oo0 = (OO0) arrayList.get(size);
            if (oo0 != null && (i3 = oo0.c) >= i && i3 < i5) {
                oo0.a(2);
                fo0.g(size);
            }
        }
        recyclerView.w1 = true;
    }

    @Override // defpackage.InterfaceC8176yS0
    public InterfaceC5506kS0 t(InterfaceC5506kS0 interfaceC5506kS0, C0795Jy0 c0795Jy0) {
        if (interfaceC5506kS0 == null) {
            return null;
        }
        return new C6126ni((Resources) this.b, interfaceC5506kS0);
    }

    public String toString() {
        switch (this.a) {
            case 11:
                return "ContentInfoCompat{" + ((ContentInfo) this.b) + "}";
            case 23:
                StringBuilder sb = new StringBuilder();
                C0432Fh0 c0432Fh0 = (C0432Fh0) this.b;
                sb.append(c0432Fh0);
                sb.append(": ");
                sb.append(((Map) WS1.b(c0432Fh0.j, C0432Fh0.n[0])).keySet());
                return sb.toString();
            default:
                return super.toString();
        }
    }

    public void u(int i, int i2) {
        RecyclerView recyclerView = (RecyclerView) this.b;
        int iT = recyclerView.f.T();
        for (int i3 = 0; i3 < iT; i3++) {
            OO0 oo0M = RecyclerView.M(recyclerView.f.S(i3));
            if (oo0M != null && !oo0M.p() && oo0M.c >= i) {
                if (RecyclerView.M1) {
                    oo0M.toString();
                }
                oo0M.m(i2, false);
                recyclerView.s1.f = true;
            }
        }
        ArrayList arrayList = recyclerView.c.c;
        int size = arrayList.size();
        for (int i4 = 0; i4 < size; i4++) {
            OO0 oo0 = (OO0) arrayList.get(i4);
            if (oo0 != null && oo0.c >= i) {
                if (RecyclerView.M1) {
                    oo0.toString();
                }
                oo0.m(i2, false);
            }
        }
        recyclerView.requestLayout();
        recyclerView.v1 = true;
    }

    @Override // defpackage.InterfaceC6533pq0
    public void v(InterfaceC4213hl interfaceC4213hl) {
        ((C0318Dv0) this.b).getClass();
    }

    public void w(int i, int i2) {
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        RecyclerView recyclerView = (RecyclerView) this.b;
        int iT = recyclerView.f.T();
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
        for (int i11 = 0; i11 < iT; i11++) {
            OO0 oo0M = RecyclerView.M(recyclerView.f.S(i11));
            if (oo0M != null && (i9 = oo0M.c) >= i4 && i9 <= i3) {
                if (RecyclerView.M1) {
                    oo0M.toString();
                }
                if (oo0M.c == i) {
                    oo0M.m(i2 - i, false);
                } else {
                    oo0M.m(i5, false);
                }
                recyclerView.s1.f = true;
            }
        }
        FO0 fo0 = recyclerView.c;
        fo0.getClass();
        if (i < i2) {
            i7 = i;
            i6 = i2;
        } else {
            i6 = i;
            i7 = i2;
            i10 = 1;
        }
        ArrayList arrayList = fo0.c;
        int size = arrayList.size();
        for (int i12 = 0; i12 < size; i12++) {
            OO0 oo0 = (OO0) arrayList.get(i12);
            if (oo0 != null && (i8 = oo0.c) >= i7 && i8 <= i6) {
                if (i8 == i) {
                    oo0.m(i2 - i, false);
                } else {
                    oo0.m(i10, false);
                }
                if (RecyclerView.M1) {
                    oo0.toString();
                }
            }
        }
        recyclerView.requestLayout();
        recyclerView.v1 = true;
    }

    public C0540Gr0 x(C7566vF c7566vF, S50 s50) throws EOFException, InterruptedIOException {
        C4103hA0 c4103hA0 = (C4103hA0) this.b;
        C0540Gr0 c0540Gr0E = null;
        int i = 0;
        while (true) {
            try {
                c7566vF.f(c4103hA0.a, 0, 10, false);
                c4103hA0.G(0);
                if (c4103hA0.x() != 4801587) {
                    break;
                }
                c4103hA0.H(3);
                int iT = c4103hA0.t();
                int i2 = iT + 10;
                if (c0540Gr0E == null) {
                    byte[] bArr = new byte[i2];
                    System.arraycopy(c4103hA0.a, 0, bArr, 0, 10);
                    c7566vF.f(bArr, 10, iT, false);
                    c0540Gr0E = new U50(s50).e(i2, bArr);
                } else {
                    c7566vF.a(iT, false);
                }
                i += i2;
            } catch (EOFException unused) {
            }
        }
        c7566vF.f = 0;
        c7566vF.a(i, false);
        return c0540Gr0E;
    }

    public /* synthetic */ C0136Bm1(int i, boolean z) {
        this.a = i;
    }

    public C0136Bm1(C0432Fh0 c0432Fh0) {
        this.a = 23;
        O90.f(c0432Fh0, "packageFragment");
        this.b = c0432Fh0;
    }

    public C0136Bm1(Context context) {
        this.a = 22;
        this.b = new A90(context);
    }

    public C0136Bm1(HT ht) {
        this.a = 6;
        this.b = new File((File) ht.c, "com.crashlytics.settings.json");
    }

    public C0136Bm1(int i) {
        this.a = i;
        switch (i) {
            case 26:
                this.b = new C1135Oi(4);
                break;
            default:
                this.b = new C4103hA0(10);
                break;
        }
    }

    public C0136Bm1(C3513e41 c3513e41) {
        this.a = 19;
        this.b = (CaptureSessionOnClosedNotCalledQuirk) c3513e41.z0(CaptureSessionOnClosedNotCalledQuirk.class);
    }

    public C0136Bm1(CameraDevice cameraDevice, Handler handler) {
        this.a = 7;
        int i = Build.VERSION.SDK_INT;
        if (i >= 28) {
            cameraDevice.getClass();
            this.b = new C2583co(cameraDevice, null);
        } else if (i >= 24) {
            this.b = new C2393bo(cameraDevice, new C3866fw1(6, handler));
        } else {
            this.b = new C4332iN(cameraDevice, new C3866fw1(6, handler));
        }
    }

    public C0136Bm1(ContentInfo contentInfo) {
        this.a = 11;
        contentInfo.getClass();
        this.b = T9.n(contentInfo);
    }

    @Override // defpackage.InterfaceC6515pk0
    public void a() throws IOException {
        C7937xC c7937xC = (C7937xC) this.b;
        c7937xC.B.a();
        C6353ou c6353ou = c7937xC.D;
        if (c6353ou != null) {
            throw c6353ou;
        }
    }

    @Override // defpackage.InterfaceC6397p7
    public void f(int i) {
    }

    @Override // defpackage.InterfaceC6397p7
    public void l(int i) {
    }

    @Override // defpackage.InterfaceC6397p7
    public void n(int i, float f) {
    }
}
