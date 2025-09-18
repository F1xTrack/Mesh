package defpackage;

import android.app.Application;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.util.Range;
import android.webkit.MimeTypeMap;
import com.android.billingclient.api.BillingResult;
import com.android.billingclient.api.PurchaseHistoryResponseListener;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReadableArray;
import com.yandex.metrica.impl.ob.InterfaceC3013q;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicInteger;
import javax.inject.Provider;
import kotlin.Lazy;

/* renamed from: nH */
/* loaded from: classes.dex */
public final class C6045nH implements InterfaceC0195Cg0, InterfaceC4347iS, PurchaseHistoryResponseListener {
    public static C6045nH f;
    public Object a;
    public Object b;
    public Object c;
    public Object d;
    public Object e;

    public C6045nH() {
        this.a = new Object();
        this.e = new GR0(11, this);
        this.c = new ArrayList();
        this.d = new ArrayList();
        this.b = new Handler(Looper.getMainLooper());
    }

    public static void d(Application application, Uri uri, AbstractC1438Sf abstractC1438Sf) {
        C6779r70 c6779r70C = C6779r70.c(uri);
        c6779r70C.j = EnumC7179tD0.c;
        c6779r70C.b = EnumC6398p70.FULL_FETCH;
        C6589q70 c6589q70A = c6779r70C.a();
        if (!AbstractC3795fZ.b) {
            AbstractC3795fZ.c(application, null);
        }
        C2455c70 c2455c70 = C2455c70.t;
        ML1.d(c2455c70, "ImagePipelineFactory was not initialized!");
        c2455c70.e().a(c6589q70A, application, null, null, null).l(abstractC1438Sf, C2196am.a);
    }

    public C7253tc a() {
        String strI = ((Range) this.a) == null ? " bitrate" : "";
        if (((Integer) this.b) == null) {
            strI = strI.concat(" sourceFormat");
        }
        if (((Integer) this.c) == null) {
            strI = AbstractC8235ym.i(strI, " source");
        }
        if (((Range) this.d) == null) {
            strI = AbstractC8235ym.i(strI, " sampleRate");
        }
        if (((Integer) this.e) == null) {
            strI = AbstractC8235ym.i(strI, " channelCount");
        }
        if (strI.isEmpty()) {
            return new C7253tc((Range) this.a, ((Integer) this.b).intValue(), ((Integer) this.c).intValue(), (Range) this.d, ((Integer) this.e).intValue());
        }
        throw new IllegalStateException("Missing required properties:".concat(strI));
    }

    public void b(InterfaceC5854mH interfaceC5854mH) {
        synchronized (this.a) {
            ((ArrayList) this.c).remove(interfaceC5854mH);
        }
    }

    public void c(InterfaceC7480uo interfaceC7480uo, InterfaceC7480uo interfaceC7480uo2, R61 r61, R61 r612, Map.Entry entry) {
        R61 r613 = (R61) entry.getValue();
        C0812Ke c0812Ke = new C0812Ke(r61.g.a, ((C7638vd) entry.getKey()).a.d, r61.c ? interfaceC7480uo : null, ((C7638vd) entry.getKey()).a.f, ((C7638vd) entry.getKey()).a.g);
        C0812Ke c0812Ke2 = new C0812Ke(r612.g.a, ((C7638vd) entry.getKey()).b.d, r612.c ? interfaceC7480uo2 : null, ((C7638vd) entry.getKey()).b.f, ((C7638vd) entry.getKey()).b.g);
        C2553ce c2553ce = ((C7638vd) entry.getKey()).a;
        r613.getClass();
        DV1.a();
        r613.b();
        AbstractC3377dM1.i(!r613.j, "Consumer can only be linked once.");
        r613.j = true;
        Q61 q61 = r613.l;
        AbstractC1500Sz1.a(AbstractC1500Sz1.r(q61.c(), new P61(r613, q61, c2553ce.c, c0812Ke, c0812Ke2), QR1.h()), new VH(this, 10, r613), QR1.h());
    }

    public void e() {
        C4332iN c4332iN;
        synchronized (((AtomicInteger) this.a)) {
            try {
                if (((AtomicInteger) this.a).incrementAndGet() >= 3 && (c4332iN = (C4332iN) this.e) != null) {
                    c4332iN.l((Bitmap) this.b, (Bitmap) this.c, (Bitmap) this.d);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public boolean f(Uri uri) {
        if (uri.getScheme() == null || !uri.getScheme().equals("data")) {
            return false;
        }
        String strSubstring = uri.getSchemeSpecificPart().substring(0, uri.getSchemeSpecificPart().indexOf(";"));
        String str = (String) this.b;
        if (str == null) {
            this.b = strSubstring;
            return true;
        }
        if (!str.equalsIgnoreCase(strSubstring) && ((String) this.b).split("/")[0].equalsIgnoreCase(strSubstring.split("/")[0])) {
            this.b = ((String) this.b).split("/")[0].concat("/*");
            return true;
        }
        if (((String) this.b).equalsIgnoreCase(strSubstring)) {
            return true;
        }
        this.b = "*/*";
        return true;
    }

    public boolean g(Uri uri) {
        if ((uri.getScheme() == null || !uri.getScheme().equals(RemoteMessageConst.Notification.CONTENT)) && !"file".equals(uri.getScheme())) {
            return false;
        }
        String fileExtensionFromUrl = MimeTypeMap.getFileExtensionFromUrl(uri.toString());
        String mimeTypeFromExtension = fileExtensionFromUrl != null ? MimeTypeMap.getSingleton().getMimeTypeFromExtension(fileExtensionFromUrl) : null;
        if (mimeTypeFromExtension == null) {
            String fileExtensionFromUrl2 = MimeTypeMap.getFileExtensionFromUrl(RI0.c((ReactApplicationContext) this.a, uri, (Boolean) this.e));
            mimeTypeFromExtension = fileExtensionFromUrl2 != null ? MimeTypeMap.getSingleton().getMimeTypeFromExtension(fileExtensionFromUrl2) : null;
        }
        if (mimeTypeFromExtension == null) {
            mimeTypeFromExtension = "*/*";
        }
        String str = (String) this.b;
        if (str == null) {
            this.b = mimeTypeFromExtension;
            return true;
        }
        if (!str.equalsIgnoreCase(mimeTypeFromExtension) && ((String) this.b).split("/")[0].equalsIgnoreCase(mimeTypeFromExtension.split("/")[0])) {
            this.b = ((String) this.b).split("/")[0].concat("/*");
            return true;
        }
        if (((String) this.b).equalsIgnoreCase(mimeTypeFromExtension)) {
            return true;
        }
        this.b = "*/*";
        return true;
    }

    @Override // javax.inject.Provider
    public Object get() {
        return new C7949xG((Executor) ((Provider) this.a).get(), (C0618Hr0) ((Provider) this.b).get(), (C1349Rb0) ((C1857Xo1) this.c).get(), (PP) ((Provider) this.d).get(), (A71) ((Provider) this.e).get());
    }

    @Override // defpackage.InterfaceC0195Cg0
    public void k() {
        ((C5534kb1) this.b).k();
        G5 g5 = new G5((InterfaceC7916x5) AbstractC8069xu.R((ArrayList) this.c));
        ((HashMap) ((C5534kb1) this.d).b).put((C1559Tt0) this.e, g5);
    }

    @Override // defpackage.InterfaceC0195Cg0
    public void l(C1559Tt0 c1559Tt0, Object obj) {
        ((C5534kb1) this.a).l(c1559Tt0, obj);
    }

    @Override // defpackage.InterfaceC0195Cg0
    public void n(C1559Tt0 c1559Tt0, C0230Cs c0230Cs) {
        ((C5534kb1) this.a).n(c1559Tt0, c0230Cs);
    }

    @Override // defpackage.InterfaceC0195Cg0
    public InterfaceC0273Dg0 o(C1559Tt0 c1559Tt0) {
        return ((C5534kb1) this.a).o(c1559Tt0);
    }

    @Override // com.android.billingclient.api.PurchaseHistoryResponseListener
    public void onPurchaseHistoryResponse(BillingResult billingResult, List list) {
        O90.f(billingResult, "billingResult");
        ((InterfaceC3013q) this.c).a().execute(new C5741lh(this, (Object) billingResult, (Object) list, 2));
    }

    @Override // defpackage.InterfaceC0195Cg0
    public void p(C1559Tt0 c1559Tt0, C0074As c0074As, C1559Tt0 c1559Tt02) {
        ((C5534kb1) this.a).p(c1559Tt0, c0074As, c1559Tt02);
    }

    @Override // defpackage.InterfaceC0195Cg0
    public InterfaceC0195Cg0 r(C0074As c0074As, C1559Tt0 c1559Tt0) {
        return ((C5534kb1) this.a).r(c0074As, c1559Tt0);
    }

    public C6045nH(ReadableArray readableArray, ArrayList arrayList, Boolean bool, ReactApplicationContext reactApplicationContext) {
        this.c = new ArrayList();
        for (int i = 0; i < readableArray.size(); i++) {
            String string = readableArray.getString(i);
            if (string != null) {
                ((ArrayList) this.c).add(Uri.parse(string));
            }
        }
        this.d = arrayList;
        this.e = bool;
        this.a = reactApplicationContext;
    }

    public C6045nH(C4375ib0 c4375ib0, InterfaceC6307oe1 interfaceC6307oe1, Lazy lazy) {
        O90.f(interfaceC6307oe1, "typeParameterResolver");
        this.b = c4375ib0;
        this.c = interfaceC6307oe1;
        this.a = lazy;
        this.d = lazy;
        this.e = new C1857Xo1(this, interfaceC6307oe1);
    }
}
