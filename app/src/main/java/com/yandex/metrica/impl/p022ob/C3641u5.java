package com.yandex.metrica.impl.p022ob;

import android.content.pm.FeatureInfo;
import android.content.pm.PackageInfo;
import android.text.TextUtils;
import com.yandex.metrica.impl.p022ob.AbstractC3077Yb;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: com.yandex.metrica.impl.ob.u5 */
/* loaded from: classes2.dex */
public class C3641u5 extends AbstractC3589s5 {

    /* renamed from: b */
    private final C3039Wn f24896b;

    public C3641u5(C3250f4 c3250f4) {
        this(c3250f4, new C3039Wn());
    }

    @Override // com.yandex.metrica.impl.p022ob.InterfaceC3459n5
    /* renamed from: a */
    public boolean mo13844a(C3376k0 c3376k0) {
        C3250f4 c3250f4M16718a = m16718a();
        if (c3250f4M16718a.m15923w().m14301m() && c3250f4M16718a.m15895B()) {
            C2626G9 c2626g9M15907f = c3250f4M16718a.m15907f();
            String strM14172f = m16718a().m15907f().m14172f();
            HashSet hashSet = null;
            if (!TextUtils.isEmpty(strM14172f)) {
                try {
                    HashSet hashSet2 = new HashSet();
                    JSONArray jSONArray = new JSONArray(strM14172f);
                    for (int i = 0; i < jSONArray.length(); i++) {
                        hashSet2.add(new C3102Zb(jSONArray.getJSONObject(i)));
                    }
                    hashSet = hashSet2;
                } catch (Throwable unused) {
                }
            }
            try {
                ArrayList<C3102Zb> arrayListM16900b = m16900b();
                if (C3323i.m16069a(hashSet, arrayListM16900b)) {
                    c3250f4M16718a.m15924x();
                } else {
                    JSONArray jSONArray2 = new JSONArray();
                    Iterator<C3102Zb> it = arrayListM16900b.iterator();
                    while (it.hasNext()) {
                        jSONArray2.put(it.next().m15539a());
                    }
                    c3250f4M16718a.m15919r().m16894c(C3376k0.m16214a(c3376k0, new JSONObject().put("features", jSONArray2).toString()));
                    c2626g9M15907f.m14174g(jSONArray2.toString());
                }
            } catch (Throwable unused2) {
            }
        }
        return false;
    }

    /* renamed from: b */
    public ArrayList<C3102Zb> m16900b() {
        FeatureInfo[] featureInfoArr;
        try {
            C3250f4 c3250f4M16718a = m16718a();
            PackageInfo packageInfoM15405b = this.f24896b.m15405b(c3250f4M16718a.m15908g(), c3250f4M16718a.m15908g().getPackageName(), 16384);
            ArrayList<C3102Zb> arrayList = new ArrayList<>();
            AbstractC3077Yb aVar = C2968U2.m15243a(24) ? new AbstractC3077Yb.a() : new AbstractC3077Yb.b();
            if (packageInfoM15405b != null && (featureInfoArr = packageInfoM15405b.reqFeatures) != null) {
                for (FeatureInfo featureInfo : featureInfoArr) {
                    arrayList.add(aVar.m15477a(featureInfo));
                }
            }
            return arrayList;
        } catch (Throwable unused) {
            return null;
        }
    }

    public C3641u5(C3250f4 c3250f4, C3039Wn c3039Wn) {
        super(c3250f4);
        this.f24896b = c3039Wn;
    }
}
