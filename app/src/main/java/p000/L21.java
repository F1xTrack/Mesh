package p000;

import android.R;
import android.app.PendingIntent;
import android.content.Intent;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcel;
import android.os.RemoteException;
import android.text.TextUtils;
import android.util.SparseIntArray;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.internal.RemoteCall;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.location.LastLocationRequest;
import com.google.android.gms.tasks.Task;
import com.yandex.varioqub.config.model.ConfigValue;
import java.io.IOException;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class L21 implements InterfaceC9786ih1, InterfaceC9294er1, InterfaceC1319Uy, RemoteCall, InterfaceC9504gU1, InterfaceC10128lM1 {

    /* renamed from: a */
    public final /* synthetic */ int f6472a;

    /* renamed from: b */
    public Object f6473b;

    public /* synthetic */ L21(int i, Object obj) {
        this.f6472a = i;
        this.f6473b = obj;
    }

    @Override // p000.InterfaceC9550gr1
    /* renamed from: a */
    public /* bridge */ /* synthetic */ Object mo1468a() {
        return new C8553Xv1((C11734xw1) ((InterfaceC9550gr1) this.f6473b).mo1468a());
    }

    @Override // com.google.android.gms.common.api.internal.RemoteCall
    public void accept(Object obj, Object obj2) throws RemoteException {
        switch (this.f6472a) {
            case 7:
                Api.ClientKey clientKey = RB1.f10059a;
                ((C11900zE1) obj).m26343j((LastLocationRequest) this.f6473b, (S81) obj2);
                break;
            default:
                C9224eI1 c9224eI1 = (C9224eI1) obj;
                Api api = C11738xy1.f45917a;
                c9224eI1.getClass();
                PendingIntent pendingIntent = (PendingIntent) this.f6473b;
                Preconditions.checkNotNull(pendingIntent);
                C8863bW1 c8863bW1 = (C8863bW1) ((InterfaceC9254eX1) c9224eI1.getService());
                Parcel parcelZza = c8863bW1.zza();
                LC1.m4925c(parcelZza, pendingIntent);
                c8863bW1.zzc(6, parcelZza);
                ((S81) obj2).m7184b(null);
                break;
        }
    }

    @Override // p000.InterfaceC9504gU1
    /* renamed from: b */
    public void mo885b(int i, IOException iOException, byte[] bArr) {
        OL1 ol1;
        OL1 ol12;
        C9110dP1 c9110dP1 = (C9110dP1) this.f6473b;
        if ((i != 200 && i != 204 && i != 304) || iOException != null) {
            OL1 ol13 = c9110dP1.f26039i;
            C9110dP1.m17592e(ol13);
            ol13.f8381j.m24553b(Integer.valueOf(i), iOException, "Network Request for Deferred Deep Link failed. response, exception");
            return;
        }
        UM1 um1 = c9110dP1.f26038h;
        C10282mZ1 c10282mZ1 = c9110dP1.f26042l;
        C9110dP1.m17589b(um1);
        um1.f11761v.m17920a(true);
        OL1 ol14 = c9110dP1.f26039i;
        if (bArr == null || bArr.length == 0) {
            C9110dP1.m17592e(ol14);
            ol14.f8385n.m24555d("Deferred Deep Link response empty.");
            return;
        }
        try {
            JSONObject jSONObject = new JSONObject(new String(bArr));
            String strOptString = jSONObject.optString("deeplink", "");
            if (TextUtils.isEmpty(strOptString)) {
                C9110dP1.m17592e(ol14);
                ol14.f8385n.m24555d("Deferred Deep Link is empty.");
            } else {
                String strOptString2 = jSONObject.optString("gclid", "");
                String strOptString3 = jSONObject.optString("gbraid", "");
                String strOptString4 = jSONObject.optString("gad_source", "");
                double dOptDouble = jSONObject.optDouble("timestamp", ConfigValue.DOUBLE_DEFAULT_VALUE);
                Bundle bundle = new Bundle();
                C9110dP1.m17589b(c10282mZ1);
                C9110dP1 c9110dP12 = (C9110dP1) c10282mZ1.f11615b;
                if (TextUtils.isEmpty(strOptString)) {
                    ol12 = ol14;
                } else {
                    try {
                        ol12 = ol14;
                    } catch (JSONException e) {
                        e = e;
                        ol12 = ol14;
                    }
                    try {
                        ol14 = null;
                        List<ResolveInfo> listQueryIntentActivities = c9110dP12.f26031a.getPackageManager().queryIntentActivities(new Intent("android.intent.action.VIEW", Uri.parse(strOptString)), 0);
                        if (listQueryIntentActivities != null && !listQueryIntentActivities.isEmpty()) {
                            if (!TextUtils.isEmpty(strOptString3)) {
                                bundle.putString("gbraid", strOptString3);
                            }
                            if (!TextUtils.isEmpty(strOptString4)) {
                                bundle.putString("gad_source", strOptString4);
                            }
                            bundle.putString("gclid", strOptString2);
                            bundle.putString("_cis", "ddp");
                            c9110dP1.f26046p.m2653X1("auto", "_cmp", bundle);
                            if (!TextUtils.isEmpty(strOptString) && c10282mZ1.m22886f2(strOptString, dOptDouble)) {
                                c9110dP12.f26031a.sendBroadcast(new Intent("android.google.analytics.action.DEEPLINK_ACTION"));
                            }
                        }
                    } catch (JSONException e2) {
                        e = e2;
                        ol1 = ol12;
                        C9110dP1.m17592e(ol1);
                        ol1.f8378g.m24554c(e, "Failed to parse the Deferred Deep Link response. exception");
                    }
                }
                C9110dP1.m17592e(ol12);
                ol1 = ol12;
                try {
                    ol1.f8381j.m24556e("Deferred Deep Link validation failed. gclid, gbraid, deep link", strOptString2, strOptString3, strOptString);
                } catch (JSONException e3) {
                    e = e3;
                    C9110dP1.m17592e(ol1);
                    ol1.f8378g.m24554c(e, "Failed to parse the Deferred Deep Link response. exception");
                }
            }
        } catch (JSONException e4) {
            e = e4;
            ol1 = ol14;
        }
    }

    @Override // p000.InterfaceC7012vR
    /* renamed from: c */
    public C7612Ft0 mo4871c() {
        return (C7612Ft0) this.f6473b;
    }

    @Override // p000.InterfaceC9786ih1
    /* renamed from: d */
    public InterfaceC9914jh1 mo4872d() {
        return new C10094l51(C7882Ky0.m4786a((C7612Ft0) this.f6473b));
    }

    /* renamed from: e */
    public void mo4873e() {
        View view = (View) this.f6473b;
        if (view != null) {
            ((InputMethodManager) view.getContext().getSystemService("input_method")).hideSoftInputFromWindow(view.getWindowToken(), 0);
        }
    }

    /* renamed from: f */
    public void m4874f(Exception exc) {
        R81 r81 = (R81) this.f6473b;
        synchronized (r81.f10031a) {
            try {
                if (r81.f10032b) {
                    throw new IllegalStateException("Cannot set the error on a completed task.");
                }
                r81.f10032b = true;
                r81.f10035e = exc;
                r81.f10031a.notifyAll();
                r81.m6914g();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* renamed from: g */
    public void mo4875g() {
        View viewFindViewById;
        View view = (View) this.f6473b;
        if (view == null) {
            return;
        }
        if (view.isInEditMode() || view.onCheckIsTextEditor()) {
            view.requestFocus();
            viewFindViewById = view;
        } else {
            viewFindViewById = view.getRootView().findFocus();
        }
        if (viewFindViewById == null) {
            viewFindViewById = view.getRootView().findViewById(R.id.content);
        }
        if (viewFindViewById == null || !viewFindViewById.hasWindowFocus()) {
            return;
        }
        viewFindViewById.post(new K21(0, viewFindViewById));
    }

    /* renamed from: h */
    public void m4876h(int i, int i2) {
        ((WE1) this.f6473b).m8733o(i, (i2 >> 31) ^ (i2 + i2));
    }

    /* renamed from: i */
    public void m4877i(int i, long j) {
        ((WE1) this.f6473b).m8735q(i, (j >> 63) ^ (j + j));
    }

    /* renamed from: j */
    public void m4878j(int i, List list) {
        boolean z = list instanceof VH1;
        int i2 = 0;
        WE1 we1 = (WE1) this.f6473b;
        if (!z) {
            while (i2 < list.size()) {
                we1.m8731m(i, (String) list.get(i2));
                i2++;
            }
            return;
        }
        VH1 vh1 = (VH1) list;
        while (i2 < list.size()) {
            Object objZza = vh1.zza();
            if (objZza instanceof String) {
                we1.m8731m(i, (String) objZza);
            } else {
                we1.m8724f(i, (JE1) objZza);
            }
            i2++;
        }
    }

    /* renamed from: k */
    public void m4879k(int i, int i2) {
        ((WE1) this.f6473b).m8733o(i, i2);
    }

    /* renamed from: l */
    public void m4880l(int i, long j) {
        ((WE1) this.f6473b).m8735q(i, j);
    }

    /* renamed from: m */
    public void m4881m(int i, boolean z) {
        WE1 we1 = (WE1) this.f6473b;
        we1.m8734p(i << 3);
        we1.m8722d(z ? (byte) 1 : (byte) 0);
    }

    /* renamed from: n */
    public void m4882n(int i, JE1 je1) {
        ((WE1) this.f6473b).m8724f(i, je1);
    }

    /* renamed from: o */
    public void m4883o(int i, List list) {
        for (int i2 = 0; i2 < list.size(); i2++) {
            ((WE1) this.f6473b).m8724f(i, (JE1) list.get(i2));
        }
    }

    /* renamed from: p */
    public void m4884p(int i, double d) {
        ((WE1) this.f6473b).m8727i(i, Double.doubleToRawLongBits(d));
    }

    /* renamed from: q */
    public void m4885q(int i, int i2) {
        ((WE1) this.f6473b).m8729k(i, i2);
    }

    /* renamed from: r */
    public void m4886r(int i, int i2) {
        ((WE1) this.f6473b).m8725g(i, i2);
    }

    /* renamed from: s */
    public void m4887s(int i, long j) {
        ((WE1) this.f6473b).m8727i(i, j);
    }

    /* renamed from: t */
    public void m4888t(float f, int i) {
        ((WE1) this.f6473b).m8725g(i, Float.floatToRawIntBits(f));
    }

    @Override // p000.InterfaceC1319Uy
    public /* bridge */ /* synthetic */ Object then(Task task) {
        ArrayList arrayList = new ArrayList();
        arrayList.addAll((List) this.f6473b);
        return AbstractC9376fU1.m18244e(arrayList);
    }

    /* renamed from: u */
    public void m4889u(int i, Object obj, InterfaceC11785yK1 interfaceC11785yK1) {
        WE1 we1 = (WE1) this.f6473b;
        we1.m8732n(i, 3);
        interfaceC11785yK1.mo7668h((DD1) obj, we1.f13087a);
        we1.m8732n(i, 4);
    }

    /* renamed from: v */
    public void m4890v(int i, int i2) {
        ((WE1) this.f6473b).m8729k(i, i2);
    }

    /* renamed from: w */
    public void m4891w(int i, long j) {
        ((WE1) this.f6473b).m8735q(i, j);
    }

    /* renamed from: x */
    public void m4892x(int i, Object obj, InterfaceC11785yK1 interfaceC11785yK1) {
        DD1 dd1 = (DD1) obj;
        WE1 we1 = (WE1) this.f6473b;
        we1.m8734p((i << 3) | 2);
        we1.m8734p(dd1.mo1598b(interfaceC11785yK1));
        interfaceC11785yK1.mo7668h(dd1, we1.f13087a);
    }

    /* renamed from: y */
    public void m4893y(int i, int i2) {
        ((WE1) this.f6473b).m8725g(i, i2);
    }

    /* renamed from: z */
    public void m4894z(int i, long j) {
        ((WE1) this.f6473b).m8727i(i, j);
    }

    public /* synthetic */ L21(int i, boolean z) {
        this.f6472a = i;
    }

    public L21(List list) {
        this.f6472a = 6;
        this.f6473b = list;
    }

    @Override // p000.InterfaceC10128lM1
    /* renamed from: a */
    public void mo4870a(String str, int i, IOException iOException, byte[] bArr, Map map) {
        ((C10152lY1) this.f6473b).m22493k(str, i, iOException, bArr, map);
    }

    public L21(WE1 we1) {
        this.f6472a = 8;
        Charset charset = AbstractC11398vH1.f44320a;
        this.f6473b = we1;
        we1.f13087a = this;
    }

    public L21(int i) {
        this.f6472a = i;
        switch (i) {
            case 3:
                this.f6473b = new SparseIntArray();
                break;
            default:
                this.f6473b = new R81();
                break;
        }
    }

    public L21(C7612Ft0 c7612Ft0) {
        Object objMo4794w;
        this.f6472a = 1;
        this.f6473b = c7612Ft0;
        Object objMo4794w2 = null;
        try {
            objMo4794w = c7612Ft0.mo4794w(C81.f1226S0);
        } catch (IllegalArgumentException unused) {
            objMo4794w = null;
        }
        Class cls = (Class) objMo4794w;
        if (cls != null && !cls.equals(C9966k51.class)) {
            throw new IllegalArgumentException("Invalid target class configuration for " + this + ": " + cls);
        }
        ((C7612Ft0) this.f6473b).m2815e(InterfaceC9914jh1.f35332c1, EnumC10170lh1.f37255e);
        C0480Hc c0480Hc = C81.f1226S0;
        C7612Ft0 c7612Ft02 = (C7612Ft0) this.f6473b;
        c7612Ft02.m2815e(c0480Hc, C9966k51.class);
        try {
            objMo4794w2 = c7612Ft02.mo4794w(C81.f1225R0);
        } catch (IllegalArgumentException unused2) {
        }
        if (objMo4794w2 == null) {
            c7612Ft02.m2815e(C81.f1225R0, C9966k51.class.getCanonicalName() + "-" + UUID.randomUUID());
        }
    }
}
