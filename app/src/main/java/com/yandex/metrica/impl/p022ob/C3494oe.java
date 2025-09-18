package com.yandex.metrica.impl.p022ob;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* renamed from: com.yandex.metrica.impl.ob.oe */
/* loaded from: classes2.dex */
public class C3494oe {

    /* renamed from: a */
    private Context f24377a;

    public C3494oe(Context context) {
        this.f24377a = context;
    }

    /* renamed from: a */
    public void m16541a() {
        SharedPreferences sharedPreferencesM16061a = C3323i.m16061a(this.f24377a, "_bidoptpreferences");
        if (sharedPreferencesM16061a.getAll().size() > 0) {
            C3754ye c3754ye = C3702we.f25180p;
            String string = sharedPreferencesM16061a.getString(c3754ye.m17236b(), null);
            C3702we c3702we = new C3702we(this.f24377a, null);
            if (!TextUtils.isEmpty(string) && TextUtils.isEmpty(c3702we.m17133b((String) null))) {
                c3702we.m17141i(string).m16690b();
                sharedPreferencesM16061a.edit().remove(c3754ye.m17236b()).apply();
            }
            Map<String, ?> all = sharedPreferencesM16061a.getAll();
            if (all.size() > 0) {
                Iterator it = ((ArrayList) m16539a(all, C3702we.f25181q.m17236b())).iterator();
                while (it.hasNext()) {
                    String str = (String) it.next();
                    String string2 = sharedPreferencesM16061a.getString(new C3754ye(C3702we.f25181q.m17236b(), str).m17234a(), null);
                    C3702we c3702we2 = new C3702we(this.f24377a, str);
                    if (!TextUtils.isEmpty(string2) && TextUtils.isEmpty(c3702we2.m17140h(null))) {
                        c3702we2.m17142j(string2).m16690b();
                    }
                }
            }
            sharedPreferencesM16061a.edit().clear().apply();
        }
    }

    /* renamed from: b */
    public void m16542b() {
        InterfaceC3774z8 interfaceC3774z8M14837p = C2877Qa.m14815a(this.f24377a).m14837p();
        SharedPreferences sharedPreferencesM16061a = C3323i.m16061a(this.f24377a, "_startupserviceinfopreferences");
        C2701J9 c2701j9 = new C2701J9(interfaceC3774z8M14837p, null);
        C3754ye c3754ye = C3702we.f25180p;
        String string = sharedPreferencesM16061a.getString(c3754ye.m17236b(), null);
        if (!TextUtils.isEmpty(string) && TextUtils.isEmpty(c2701j9.m14428f().f22208b)) {
            c2701j9.m14431h(string).m14258c();
            sharedPreferencesM16061a.edit().remove(c3754ye.m17236b()).apply();
        }
        C2701J9 c2701j92 = new C2701J9(interfaceC3774z8M14837p, this.f24377a.getPackageName());
        boolean z = sharedPreferencesM16061a.getBoolean(C3702we.f25189y.m17236b(), false);
        if (z) {
            c2701j92.m14424a(z).m14258c();
        }
        m16540a(interfaceC3774z8M14837p, this.f24377a.getPackageName());
        Iterator it = ((ArrayList) m16539a(sharedPreferencesM16061a.getAll(), C3702we.f25181q.m17236b())).iterator();
        while (it.hasNext()) {
            m16540a(interfaceC3774z8M14837p, (String) it.next());
        }
    }

    /* renamed from: a */
    private List<String> m16539a(Map<String, ?> map, String str) {
        ArrayList arrayList = new ArrayList();
        for (String str2 : map.keySet()) {
            if (str2.startsWith(str)) {
                arrayList.add(str2.replace(str, ""));
            }
        }
        return arrayList;
    }

    /* renamed from: a */
    private void m16540a(InterfaceC3774z8 interfaceC3774z8, String str) {
        C2701J9 c2701j9 = new C2701J9(interfaceC3774z8, str);
        C3702we c3702we = new C3702we(this.f24377a, str);
        String strM17140h = c3702we.m17140h(null);
        if (!TextUtils.isEmpty(strM17140h)) {
            c2701j9.m14437n(strM17140h);
        }
        String strM17134c = c3702we.m17134c(null);
        if (!TextUtils.isEmpty(strM17134c)) {
            c2701j9.m14432i(strM17134c);
        }
        String strM17135d = c3702we.m17135d(null);
        if (!TextUtils.isEmpty(strM17135d)) {
            c2701j9.m14433j(strM17135d);
        }
        String strM17137f = c3702we.m17137f(null);
        if (!TextUtils.isEmpty(strM17137f)) {
            c2701j9.m14435l(strM17137f);
        }
        String strM17136e = c3702we.m17136e(null);
        if (!TextUtils.isEmpty(strM17136e)) {
            c2701j9.m14434k(strM17136e);
        }
        long jM17132a = c3702we.m17132a(-1L);
        if (jM17132a != -1) {
            c2701j9.m14425b(jM17132a);
        }
        String strM17139g = c3702we.m17139g(null);
        if (!TextUtils.isEmpty(strM17139g)) {
            c2701j9.m14436m(strM17139g);
        }
        c2701j9.m14258c();
        c3702we.m17138f();
    }
}
