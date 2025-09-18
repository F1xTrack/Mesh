package com.yandex.metrica.impl.ob;

import android.content.pm.FeatureInfo;
import android.content.pm.PackageInfo;
import android.text.TextUtils;
import com.yandex.metrica.impl.ob.Yb;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: com.yandex.metrica.impl.ob.u5 */
/* loaded from: classes2.dex */
public class C3118u5 extends AbstractC3068s5 {
    private final Wn b;

    public C3118u5(C2744f4 c2744f4) {
        this(c2744f4, new Wn());
    }

    @Override // com.yandex.metrica.impl.ob.InterfaceC2944n5
    public boolean a(C2864k0 c2864k0) {
        C2744f4 c2744f4A = a();
        if (c2744f4A.w().m() && c2744f4A.B()) {
            G9 g9F = c2744f4A.f();
            String strF = a().f().f();
            HashSet hashSet = null;
            if (!TextUtils.isEmpty(strF)) {
                try {
                    HashSet hashSet2 = new HashSet();
                    JSONArray jSONArray = new JSONArray(strF);
                    for (int i = 0; i < jSONArray.length(); i++) {
                        hashSet2.add(new Zb(jSONArray.getJSONObject(i)));
                    }
                    hashSet = hashSet2;
                } catch (Throwable unused) {
                }
            }
            try {
                ArrayList<Zb> arrayListB = b();
                if (C2814i.a(hashSet, arrayListB)) {
                    c2744f4A.x();
                } else {
                    JSONArray jSONArray2 = new JSONArray();
                    Iterator<Zb> it = arrayListB.iterator();
                    while (it.hasNext()) {
                        jSONArray2.put(it.next().a());
                    }
                    c2744f4A.r().c(C2864k0.a(c2864k0, new JSONObject().put("features", jSONArray2).toString()));
                    g9F.g(jSONArray2.toString());
                }
            } catch (Throwable unused2) {
            }
        }
        return false;
    }

    public ArrayList<Zb> b() {
        FeatureInfo[] featureInfoArr;
        try {
            C2744f4 c2744f4A = a();
            PackageInfo packageInfoB = this.b.b(c2744f4A.g(), c2744f4A.g().getPackageName(), 16384);
            ArrayList<Zb> arrayList = new ArrayList<>();
            Yb aVar = U2.a(24) ? new Yb.a() : new Yb.b();
            if (packageInfoB != null && (featureInfoArr = packageInfoB.reqFeatures) != null) {
                for (FeatureInfo featureInfo : featureInfoArr) {
                    arrayList.add(aVar.a(featureInfo));
                }
            }
            return arrayList;
        } catch (Throwable unused) {
            return null;
        }
    }

    public C3118u5(C2744f4 c2744f4, Wn wn) {
        super(c2744f4);
        this.b = wn;
    }
}
