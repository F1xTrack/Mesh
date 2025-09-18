package p000;

import android.content.Context;
import android.net.Uri;
import android.os.Parcel;
import android.os.RemoteException;
import android.view.View;
import android.view.WindowInsetsAnimationController;
import com.google.android.gms.common.api.internal.ListenerHolder;
import com.google.android.gms.common.api.internal.RemoteCall;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.location.LocationSettingsRequest;
import com.google.android.material.behavior.SwipeDismissBehavior;
import com.p019vk.push.core.analytics.AnalyticsBaseParamsConstantsKt;
import io.legere.pdfiumandroid.PdfDocument;
import io.legere.pdfiumandroid.PdfiumCore;
import java.io.IOException;
import java.io.InputStream;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.WeakHashMap;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: m71 */
/* loaded from: classes.dex */
public final class C10226m71 implements InterfaceC1639a2, InterfaceC6718r2, InterfaceC1279UK, InterfaceC0374Fw, OD1, RemoteCall, InterfaceC9435fy0 {

    /* renamed from: a */
    public final /* synthetic */ int f37492a;

    /* renamed from: b */
    public Object f37493b;

    public /* synthetic */ C10226m71(int i) {
        this.f37492a = i;
    }

    /* renamed from: f */
    public static void m22678f(String str, Object obj, JSONObject jSONObject) throws JSONException {
        if (str == null || obj == null || jSONObject == null) {
            return;
        }
        if (!(obj instanceof JSONObject)) {
            jSONObject.put(str, obj);
            return;
        }
        JSONObject jSONObject2 = (JSONObject) obj;
        Iterator<String> itKeys = jSONObject2.keys();
        while (itKeys.hasNext()) {
            String next = itKeys.next();
            m22678f(next, jSONObject2.get(next), jSONObject.getJSONObject(str));
        }
    }

    @Override // p000.InterfaceC1639a2
    /* renamed from: a */
    public boolean mo2839a(View view) {
        switch (this.f37492a) {
            case 0:
                SwipeDismissBehavior swipeDismissBehavior = (SwipeDismissBehavior) this.f37493b;
                if (!swipeDismissBehavior.mo11188s(view)) {
                    return false;
                }
                WeakHashMap weakHashMap = AbstractC10944rk1.f41842a;
                boolean z = view.getLayoutDirection() == 1;
                int i = swipeDismissBehavior.f18086d;
                view.offsetLeftAndRight((!(i == 0 && z) && (i != 1 || z)) ? view.getWidth() : -view.getWidth());
                view.setAlpha(0.0f);
                return true;
            default:
                int currentItem = ((C10050kl1) view).getCurrentItem() - 1;
                C10050kl1 c10050kl1 = (C10050kl1) ((C8071Oo1) this.f37493b).f8630d;
                if (c10050kl1.f36678r) {
                    c10050kl1.m22263c(currentItem, true);
                }
                return true;
        }
    }

    @Override // com.google.android.gms.common.api.internal.RemoteCall
    public void accept(Object obj, Object obj2) throws RemoteException {
        C11900zE1 c11900zE1 = (C11900zE1) obj;
        S81 s81 = (S81) obj2;
        LocationSettingsRequest locationSettingsRequest = (LocationSettingsRequest) this.f37493b;
        Preconditions.checkArgument(locationSettingsRequest != null, "locationSettingsRequest can't be null");
        InterfaceC9254eX1 interfaceC9254eX1 = (InterfaceC9254eX1) c11900zE1.getService();
        FD1 fd1 = new FD1(s81);
        C8863bW1 c8863bW1 = (C8863bW1) interfaceC9254eX1;
        Parcel parcelZza = c8863bW1.zza();
        LC1.m4925c(parcelZza, locationSettingsRequest);
        LC1.m4926d(parcelZza, fd1);
        parcelZza.writeString(null);
        c8863bW1.zzc(63, parcelZza);
    }

    @Override // p000.InterfaceC9435fy0
    /* renamed from: b */
    public void mo8196b() {
        ((S81) this.f37493b).f10598a.m18390q();
    }

    @Override // p000.OD1
    /* renamed from: c */
    public synchronized void mo5581c(ListenerHolder listenerHolder) {
        ListenerHolder listenerHolder2 = (ListenerHolder) this.f37493b;
        if (listenerHolder2 != listenerHolder) {
            listenerHolder2.clear();
            this.f37493b = listenerHolder;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0013  */
    /* renamed from: d */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.Object m22679d(com.p019vk.push.common.AppInfo r6, p000.AbstractC1571Yy r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof p000.C8547Xs1
            if (r0 == 0) goto L13
            r0 = r7
            Xs1 r0 = (p000.C8547Xs1) r0
            int r1 = r0.f14032c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f14032c = r1
            goto L18
        L13:
            Xs1 r0 = new Xs1
            r0.<init>(r5, r7)
        L18:
            java.lang.Object r7 = r0.f14030a
            Mz r1 = p000.EnumC0817Mz.f7418a
            int r2 = r0.f14032c
            r3 = 1
            if (r2 == 0) goto L33
            if (r2 != r3) goto L2b
            p000.RQ1.m7017d(r7)
            PS0 r7 = (p000.PS0) r7
            java.lang.Object r6 = r7.f9075a
            goto L59
        L2b:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L33:
            p000.RQ1.m7017d(r7)
            java.lang.Object r7 = r5.f37493b
            N8 r7 = (p000.C0827N8) r7
            java.lang.String r2 = "host"
            p000.O90.m5968f(r6, r2)
            Lq1 r2 = new Lq1
            java.util.List r6 = p000.AbstractC7230yu.m26274e(r6)
            java.lang.Object r4 = r7.f7523b
            android.content.Context r4 = (android.content.Context) r4
            java.lang.Object r7 = r7.f7524c
            com.vk.push.common.Logger r7 = (com.p019vk.push.common.Logger) r7
            r2.<init>(r4, r6, r7)
            r0.f14032c = r3
            java.lang.Object r6 = r2.m5117a(r0)
            if (r6 != r1) goto L59
            return r1
        L59:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.C10226m71.m22679d(com.vk.push.common.AppInfo, Yy):java.lang.Object");
    }

    @Override // p000.InterfaceC1279UK
    /* renamed from: e */
    public PdfDocument mo6000e(Context context, PdfiumCore pdfiumCore, String str) {
        return pdfiumCore.newDocument(context.getContentResolver().openFileDescriptor((Uri) this.f37493b, "r"), str);
    }

    /* renamed from: g */
    public void m22680g(boolean z) {
        ((WindowInsetsAnimationController) ((C10339n11) this.f37493b).f38046b).finish(z);
    }

    @Override // p000.InterfaceC0374Fw
    public String getString(String str, String str2) throws JSONException {
        if (str.endsWith("/")) {
            return str2;
        }
        String[] strArrSplit = str.split("/");
        try {
            JSONObject jSONObject = (JSONObject) this.f37493b;
            for (int i = 1; i < strArrSplit.length; i++) {
                if (i == strArrSplit.length - 1) {
                    return jSONObject.get(strArrSplit[i]).toString();
                }
                jSONObject = jSONObject.getJSONObject(strArrSplit[i]);
            }
        } catch (JSONException unused) {
        }
        return str2;
    }

    /* renamed from: h */
    public AF0 m22681h(int i) {
        return (AF0) ((List) this.f37493b).get(i);
    }

    /* renamed from: i */
    public J80 m22682i() {
        return J80.m4202c(((WindowInsetsAnimationController) ((C10339n11) this.f37493b).f38046b).getCurrentInsets());
    }

    public String toString() {
        switch (this.f37492a) {
            case 7:
                return "InputStreamReader{config=" + ((JSONObject) this.f37493b).toString().hashCode() + '}';
            default:
                return super.toString();
        }
    }

    @Override // p000.OD1
    public synchronized ListenerHolder zza() {
        return (ListenerHolder) this.f37493b;
    }

    public /* synthetic */ C10226m71(int i, Object obj) {
        this.f37492a = i;
        this.f37493b = obj;
    }

    public C10226m71(InputStream inputStream, String str) throws JSONException {
        JSONObject jSONObject;
        JSONObject jSONObject2;
        this.f37492a = 7;
        if (inputStream != null) {
            try {
                jSONObject = new JSONObject(AbstractC10849r02.m24147e(inputStream));
            } catch (IOException | JSONException unused) {
            }
        } else {
            jSONObject = new JSONObject();
        }
        this.f37493b = jSONObject;
        try {
            JSONArray jSONArray = jSONObject.getJSONArray("appInfos");
            int i = 0;
            while (true) {
                if (i >= jSONArray.length()) {
                    jSONObject2 = null;
                    break;
                }
                jSONObject2 = jSONArray.getJSONObject(i);
                if (jSONObject2.getString(AnalyticsBaseParamsConstantsKt.PACKAGE_NAME).equals(str)) {
                    break;
                } else {
                    i++;
                }
            }
            if (jSONObject2 == null) {
                return;
            }
            String string = getString("/configuration_version", "");
            BigDecimal bigDecimal = new BigDecimal("0.0");
            try {
                bigDecimal = BigDecimal.valueOf(Double.parseDouble(string));
            } catch (NumberFormatException unused2) {
            }
            if (bigDecimal.compareTo(new BigDecimal("2.0")) == 0) {
                jSONObject.getJSONObject("client").put("app_id", jSONObject2.getString("app_id"));
                return;
            }
            if (bigDecimal.compareTo(new BigDecimal("3.0")) >= 0) {
                Iterator<String> itKeys = jSONObject2.keys();
                while (itKeys.hasNext()) {
                    String next = itKeys.next();
                    if (!AnalyticsBaseParamsConstantsKt.PACKAGE_NAME.equals(next)) {
                        m22678f(next, jSONObject2.get(next), jSONObject);
                    }
                }
            }
        } catch (JSONException unused3) {
        }
    }

    public C10226m71(GF0 gf0) {
        this.f37492a = 2;
        O90.m5968f(gf0, "typeTable");
        List list = gf0.f3652c;
        if ((gf0.f3651b & 1) == 1) {
            int i = gf0.f3653d;
            O90.m5967e(list, "getTypeList(...)");
            List list2 = list;
            ArrayList arrayList = new ArrayList(AbstractC7293zu.m26586k(list2));
            int i2 = 0;
            for (Object obj : list2) {
                int i3 = i2 + 1;
                if (i2 < 0) {
                    AbstractC7230yu.m26279j();
                    throw null;
                }
                AF0 af0M26351l = (AF0) obj;
                if (i2 >= i) {
                    af0M26351l.getClass();
                    C11901zF0 c11901zF0M126r = AF0.m126r(af0M26351l);
                    c11901zF0M126r.f46745d |= 2;
                    c11901zF0M126r.f46747f = true;
                    af0M26351l = c11901zF0M126r.m26351l();
                    if (!af0M26351l.mo131e()) {
                        throw new C6838sg();
                    }
                }
                arrayList.add(af0M26351l);
                i2 = i3;
            }
            list = arrayList;
        }
        O90.m5967e(list, "run(...)");
        this.f37493b = list;
    }

    @Override // p000.OD1
    public void zzb() {
    }

    public C10226m71(WindowInsetsAnimationController windowInsetsAnimationController) {
        this.f37492a = 5;
        this.f37493b = new C10339n11(7, windowInsetsAnimationController);
    }
}
