package p000;

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
import com.yandex.metrica.impl.p022ob.InterfaceC3531q;
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
public final class C6479nH implements InterfaceC7430Cg0, InterfaceC4243iS, PurchaseHistoryResponseListener {

    /* renamed from: f */
    public static C6479nH f38226f;

    /* renamed from: a */
    public Object f38227a;

    /* renamed from: b */
    public Object f38228b;

    /* renamed from: c */
    public Object f38229c;

    /* renamed from: d */
    public Object f38230d;

    /* renamed from: e */
    public Object f38231e;

    public C6479nH() {
        this.f38227a = new Object();
        this.f38231e = new GR0(11, this);
        this.f38229c = new ArrayList();
        this.f38230d = new ArrayList();
        this.f38228b = new Handler(Looper.getMainLooper());
    }

    /* renamed from: d */
    public static void m23114d(Application application, Uri uri, AbstractC1174Sf abstractC1174Sf) {
        C10865r70 c10865r70M24160c = C10865r70.m24160c(uri);
        c10865r70M24160c.f41347j = EnumC11133tD0.f42955c;
        c10865r70M24160c.f41339b = EnumC10609p70.FULL_FETCH;
        C10737q70 c10737q70M24161a = c10865r70M24160c.m24161a();
        if (!AbstractC4061fZ.f27230b) {
            AbstractC4061fZ.m18253c(application, null);
        }
        C8940c70 c8940c70 = C8940c70.f17308t;
        ML1.m5337d(c8940c70, "ImagePipelineFactory was not initialized!");
        c8940c70.m10592e().m9486a(c10737q70M24161a, application, null, null, null).m3673l(abstractC1174Sf, C1685am.f15687a);
    }

    /* renamed from: a */
    public C6897tc m23115a() {
        String strM26232i = ((Range) this.f38227a) == null ? " bitrate" : "";
        if (((Integer) this.f38228b) == null) {
            strM26232i = strM26232i.concat(" sourceFormat");
        }
        if (((Integer) this.f38229c) == null) {
            strM26232i = AbstractC7222ym.m26232i(strM26232i, " source");
        }
        if (((Range) this.f38230d) == null) {
            strM26232i = AbstractC7222ym.m26232i(strM26232i, " sampleRate");
        }
        if (((Integer) this.f38231e) == null) {
            strM26232i = AbstractC7222ym.m26232i(strM26232i, " channelCount");
        }
        if (strM26232i.isEmpty()) {
            return new C6897tc((Range) this.f38227a, ((Integer) this.f38228b).intValue(), ((Integer) this.f38229c).intValue(), (Range) this.f38230d, ((Integer) this.f38231e).intValue());
        }
        throw new IllegalStateException("Missing required properties:".concat(strM26232i));
    }

    /* renamed from: b */
    public void m23116b(InterfaceC6416mH interfaceC6416mH) {
        synchronized (this.f38227a) {
            ((ArrayList) this.f38229c).remove(interfaceC6416mH);
        }
    }

    /* renamed from: c */
    public void m23117c(InterfaceC6972uo interfaceC6972uo, InterfaceC6972uo interfaceC6972uo2, R61 r61, R61 r612, Map.Entry entry) {
        R61 r613 = (R61) entry.getValue();
        C0671Ke c0671Ke = new C0671Ke(r61.f10008g.f3839a, ((C7024vd) entry.getKey()).f44449a.f17669d, r61.f10004c ? interfaceC6972uo : null, ((C7024vd) entry.getKey()).f44449a.f17671f, ((C7024vd) entry.getKey()).f44449a.f17672g);
        C0671Ke c0671Ke2 = new C0671Ke(r612.f10008g.f3839a, ((C7024vd) entry.getKey()).f44450b.f17669d, r612.f10004c ? interfaceC6972uo2 : null, ((C7024vd) entry.getKey()).f44450b.f17671f, ((C7024vd) entry.getKey()).f44450b.f17672g);
        C1860ce c1860ce = ((C7024vd) entry.getKey()).f44449a;
        r613.getClass();
        DV1.m1716a();
        r613.m6897b();
        AbstractC9104dM1.m17550i(!r613.f10011j, "Consumer can only be linked once.");
        r613.f10011j = true;
        Q61 q61 = r613.f10013l;
        AbstractC8301Sz1.m7478a(AbstractC8301Sz1.m7495r(q61.m18992c(), new P61(r613, q61, c1860ce.f17668c, c0671Ke, c0671Ke2), QR1.m6710h()), new C1339VH(this, 10, r613), QR1.m6710h());
    }

    /* renamed from: e */
    public void m23118e() {
        C4238iN c4238iN;
        synchronized (((AtomicInteger) this.f38227a)) {
            try {
                if (((AtomicInteger) this.f38227a).incrementAndGet() >= 3 && (c4238iN = (C4238iN) this.f38231e) != null) {
                    c4238iN.m19012l((Bitmap) this.f38228b, (Bitmap) this.f38229c, (Bitmap) this.f38230d);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* renamed from: f */
    public boolean m23119f(Uri uri) {
        if (uri.getScheme() == null || !uri.getScheme().equals("data")) {
            return false;
        }
        String strSubstring = uri.getSchemeSpecificPart().substring(0, uri.getSchemeSpecificPart().indexOf(";"));
        String str = (String) this.f38228b;
        if (str == null) {
            this.f38228b = strSubstring;
            return true;
        }
        if (!str.equalsIgnoreCase(strSubstring) && ((String) this.f38228b).split("/")[0].equalsIgnoreCase(strSubstring.split("/")[0])) {
            this.f38228b = ((String) this.f38228b).split("/")[0].concat("/*");
            return true;
        }
        if (((String) this.f38228b).equalsIgnoreCase(strSubstring)) {
            return true;
        }
        this.f38228b = "*/*";
        return true;
    }

    /* renamed from: g */
    public boolean m23120g(Uri uri) {
        if ((uri.getScheme() == null || !uri.getScheme().equals(RemoteMessageConst.Notification.CONTENT)) && !"file".equals(uri.getScheme())) {
            return false;
        }
        String fileExtensionFromUrl = MimeTypeMap.getFileExtensionFromUrl(uri.toString());
        String mimeTypeFromExtension = fileExtensionFromUrl != null ? MimeTypeMap.getSingleton().getMimeTypeFromExtension(fileExtensionFromUrl) : null;
        if (mimeTypeFromExtension == null) {
            String fileExtensionFromUrl2 = MimeTypeMap.getFileExtensionFromUrl(RI0.m6936c((ReactApplicationContext) this.f38227a, uri, (Boolean) this.f38231e));
            mimeTypeFromExtension = fileExtensionFromUrl2 != null ? MimeTypeMap.getSingleton().getMimeTypeFromExtension(fileExtensionFromUrl2) : null;
        }
        if (mimeTypeFromExtension == null) {
            mimeTypeFromExtension = "*/*";
        }
        String str = (String) this.f38228b;
        if (str == null) {
            this.f38228b = mimeTypeFromExtension;
            return true;
        }
        if (!str.equalsIgnoreCase(mimeTypeFromExtension) && ((String) this.f38228b).split("/")[0].equalsIgnoreCase(mimeTypeFromExtension.split("/")[0])) {
            this.f38228b = ((String) this.f38228b).split("/")[0].concat("/*");
            return true;
        }
        if (((String) this.f38228b).equalsIgnoreCase(mimeTypeFromExtension)) {
            return true;
        }
        this.f38228b = "*/*";
        return true;
    }

    @Override // javax.inject.Provider
    public Object get() {
        return new C7127xG((Executor) ((Provider) this.f38227a).get(), (C7712Hr0) ((Provider) this.f38228b).get(), (C8200Rb0) ((C8539Xo1) this.f38229c).get(), (InterfaceC0970PP) ((Provider) this.f38230d).get(), (A71) ((Provider) this.f38231e).get());
    }

    @Override // p000.InterfaceC7430Cg0
    /* renamed from: k */
    public void mo1263k() {
        ((C10030kb1) this.f38228b).mo1263k();
        C0384G5 c0384g5 = new C0384G5((InterfaceC7116x5) AbstractC7167xu.m25972R((ArrayList) this.f38229c));
        ((HashMap) ((C10030kb1) this.f38230d).f36562b).put((C8340Tt0) this.f38231e, c0384g5);
    }

    @Override // p000.InterfaceC7430Cg0
    /* renamed from: l */
    public void mo1264l(C8340Tt0 c8340Tt0, Object obj) {
        ((C10030kb1) this.f38227a).mo1264l(c8340Tt0, obj);
    }

    @Override // p000.InterfaceC7430Cg0
    /* renamed from: n */
    public void mo1265n(C8340Tt0 c8340Tt0, C0181Cs c0181Cs) {
        ((C10030kb1) this.f38227a).mo1265n(c8340Tt0, c0181Cs);
    }

    @Override // p000.InterfaceC7430Cg0
    /* renamed from: o */
    public InterfaceC7482Dg0 mo1266o(C8340Tt0 c8340Tt0) {
        return ((C10030kb1) this.f38227a).mo1266o(c8340Tt0);
    }

    @Override // com.android.billingclient.api.PurchaseHistoryResponseListener
    public void onPurchaseHistoryResponse(BillingResult billingResult, List list) {
        O90.m5968f(billingResult, "billingResult");
        ((InterfaceC3531q) this.f38229c).mo3440a().execute(new C6379lh(this, (Object) billingResult, (Object) list, 2));
    }

    @Override // p000.InterfaceC7430Cg0
    /* renamed from: p */
    public void mo1267p(C8340Tt0 c8340Tt0, C0055As c0055As, C8340Tt0 c8340Tt02) {
        ((C10030kb1) this.f38227a).mo1267p(c8340Tt0, c0055As, c8340Tt02);
    }

    @Override // p000.InterfaceC7430Cg0
    /* renamed from: r */
    public InterfaceC7430Cg0 mo1268r(C0055As c0055As, C8340Tt0 c8340Tt0) {
        return ((C10030kb1) this.f38227a).mo1268r(c0055As, c8340Tt0);
    }

    public C6479nH(ReadableArray readableArray, ArrayList arrayList, Boolean bool, ReactApplicationContext reactApplicationContext) {
        this.f38229c = new ArrayList();
        for (int i = 0; i < readableArray.size(); i++) {
            String string = readableArray.getString(i);
            if (string != null) {
                ((ArrayList) this.f38229c).add(Uri.parse(string));
            }
        }
        this.f38230d = arrayList;
        this.f38231e = bool;
        this.f38227a = reactApplicationContext;
    }

    public C6479nH(C9773ib0 c9773ib0, InterfaceC10548oe1 interfaceC10548oe1, Lazy lazy) {
        O90.m5968f(interfaceC10548oe1, "typeParameterResolver");
        this.f38228b = c9773ib0;
        this.f38229c = interfaceC10548oe1;
        this.f38227a = lazy;
        this.f38230d = lazy;
        this.f38231e = new C8539Xo1(this, interfaceC10548oe1);
    }
}
