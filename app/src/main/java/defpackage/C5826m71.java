package defpackage;

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
import com.vk.push.core.analytics.AnalyticsBaseParamsConstantsKt;
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
public final class C5826m71 implements InterfaceC2056a2, InterfaceC6761r2, UK, InterfaceC0476Fw, OD1, RemoteCall, InterfaceC3871fy0 {
    public final /* synthetic */ int a;
    public Object b;

    public /* synthetic */ C5826m71(int i) {
        this.a = i;
    }

    public static void f(String str, Object obj, JSONObject jSONObject) throws JSONException {
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
            f(next, jSONObject2.get(next), jSONObject.getJSONObject(str));
        }
    }

    @Override // defpackage.InterfaceC2056a2
    public boolean a(View view) {
        switch (this.a) {
            case 0:
                SwipeDismissBehavior swipeDismissBehavior = (SwipeDismissBehavior) this.b;
                if (!swipeDismissBehavior.s(view)) {
                    return false;
                }
                WeakHashMap weakHashMap = AbstractC6897rk1.a;
                boolean z = view.getLayoutDirection() == 1;
                int i = swipeDismissBehavior.d;
                view.offsetLeftAndRight((!(i == 0 && z) && (i != 1 || z)) ? view.getWidth() : -view.getWidth());
                view.setAlpha(0.0f);
                return true;
            default:
                int currentItem = ((C5564kl1) view).getCurrentItem() - 1;
                C5564kl1 c5564kl1 = (C5564kl1) ((C1155Oo1) this.b).d;
                if (c5564kl1.r) {
                    c5564kl1.c(currentItem, true);
                }
                return true;
        }
    }

    @Override // com.google.android.gms.common.api.internal.RemoteCall
    public void accept(Object obj, Object obj2) throws RemoteException {
        C8325zE1 c8325zE1 = (C8325zE1) obj;
        S81 s81 = (S81) obj2;
        LocationSettingsRequest locationSettingsRequest = (LocationSettingsRequest) this.b;
        Preconditions.checkArgument(locationSettingsRequest != null, "locationSettingsRequest can't be null");
        InterfaceC3600eX1 interfaceC3600eX1 = (InterfaceC3600eX1) c8325zE1.getService();
        FD1 fd1 = new FD1(s81);
        C2341bW1 c2341bW1 = (C2341bW1) interfaceC3600eX1;
        Parcel parcelZza = c2341bW1.zza();
        LC1.c(parcelZza, locationSettingsRequest);
        LC1.d(parcelZza, fd1);
        parcelZza.writeString(null);
        c2341bW1.zzc(63, parcelZza);
    }

    @Override // defpackage.InterfaceC3871fy0
    public void b() {
        ((S81) this.b).a.q();
    }

    @Override // defpackage.OD1
    public synchronized void c(ListenerHolder listenerHolder) {
        ListenerHolder listenerHolder2 = (ListenerHolder) this.b;
        if (listenerHolder2 != listenerHolder) {
            listenerHolder2.clear();
            this.b = listenerHolder;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.Object d(com.vk.push.common.AppInfo r6, defpackage.AbstractC1963Yy r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof defpackage.C1869Xs1
            if (r0 == 0) goto L13
            r0 = r7
            Xs1 r0 = (defpackage.C1869Xs1) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            Xs1 r0 = new Xs1
            r0.<init>(r5, r7)
        L18:
            java.lang.Object r7 = r0.a
            Mz r1 = defpackage.EnumC1030Mz.a
            int r2 = r0.c
            r3 = 1
            if (r2 == 0) goto L33
            if (r2 != r3) goto L2b
            defpackage.RQ1.d(r7)
            PS0 r7 = (defpackage.PS0) r7
            java.lang.Object r6 = r7.a
            goto L59
        L2b:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L33:
            defpackage.RQ1.d(r7)
            java.lang.Object r7 = r5.b
            N8 r7 = (defpackage.N8) r7
            java.lang.String r2 = "host"
            defpackage.O90.f(r6, r2)
            Lq1 r2 = new Lq1
            java.util.List r6 = defpackage.AbstractC8259yu.e(r6)
            java.lang.Object r4 = r7.b
            android.content.Context r4 = (android.content.Context) r4
            java.lang.Object r7 = r7.c
            com.vk.push.common.Logger r7 = (com.vk.push.common.Logger) r7
            r2.<init>(r4, r6, r7)
            r0.c = r3
            java.lang.Object r6 = r2.a(r0)
            if (r6 != r1) goto L59
            return r1
        L59:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C5826m71.d(com.vk.push.common.AppInfo, Yy):java.lang.Object");
    }

    @Override // defpackage.UK
    public PdfDocument e(Context context, PdfiumCore pdfiumCore, String str) {
        return pdfiumCore.newDocument(context.getContentResolver().openFileDescriptor((Uri) this.b, "r"), str);
    }

    public void g(boolean z) {
        ((WindowInsetsAnimationController) ((C5996n11) this.b).b).finish(z);
    }

    @Override // defpackage.InterfaceC0476Fw
    public String getString(String str, String str2) throws JSONException {
        if (str.endsWith("/")) {
            return str2;
        }
        String[] strArrSplit = str.split("/");
        try {
            JSONObject jSONObject = (JSONObject) this.b;
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

    public AF0 h(int i) {
        return (AF0) ((List) this.b).get(i);
    }

    public J80 i() {
        return J80.c(((WindowInsetsAnimationController) ((C5996n11) this.b).b).getCurrentInsets());
    }

    public String toString() {
        switch (this.a) {
            case 7:
                return "InputStreamReader{config=" + ((JSONObject) this.b).toString().hashCode() + '}';
            default:
                return super.toString();
        }
    }

    @Override // defpackage.OD1
    public synchronized ListenerHolder zza() {
        return (ListenerHolder) this.b;
    }

    public /* synthetic */ C5826m71(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    public C5826m71(InputStream inputStream, String str) throws JSONException {
        JSONObject jSONObject;
        JSONObject jSONObject2;
        this.a = 7;
        if (inputStream != null) {
            try {
                jSONObject = new JSONObject(AbstractC6756r02.e(inputStream));
            } catch (IOException | JSONException unused) {
            }
        } else {
            jSONObject = new JSONObject();
        }
        this.b = jSONObject;
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
                        f(next, jSONObject2.get(next), jSONObject);
                    }
                }
            }
        } catch (JSONException unused3) {
        }
    }

    public C5826m71(GF0 gf0) {
        this.a = 2;
        O90.f(gf0, "typeTable");
        List list = gf0.c;
        if ((gf0.b & 1) == 1) {
            int i = gf0.d;
            O90.e(list, "getTypeList(...)");
            List list2 = list;
            ArrayList arrayList = new ArrayList(AbstractC8449zu.k(list2));
            int i2 = 0;
            for (Object obj : list2) {
                int i3 = i2 + 1;
                if (i2 < 0) {
                    AbstractC8259yu.j();
                    throw null;
                }
                AF0 af0L = (AF0) obj;
                if (i2 >= i) {
                    af0L.getClass();
                    C8327zF0 c8327zF0R = AF0.r(af0L);
                    c8327zF0R.d |= 2;
                    c8327zF0R.f = true;
                    af0L = c8327zF0R.l();
                    if (!af0L.e()) {
                        throw new C7074sg();
                    }
                }
                arrayList.add(af0L);
                i2 = i3;
            }
            list = arrayList;
        }
        O90.e(list, "run(...)");
        this.b = list;
    }

    @Override // defpackage.OD1
    public void zzb() {
    }

    public C5826m71(WindowInsetsAnimationController windowInsetsAnimationController) {
        this.a = 5;
        this.b = new C5996n11(7, windowInsetsAnimationController);
    }
}
