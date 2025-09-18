package com.yandex.metrica.impl.ob;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* renamed from: com.yandex.metrica.impl.ob.oe, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public class C2978oe {
    private Context a;

    public C2978oe(Context context) {
        this.a = context;
    }

    public void a() {
        SharedPreferences sharedPreferencesA = C2814i.a(this.a, "_bidoptpreferences");
        if (sharedPreferencesA.getAll().size() > 0) {
            C3232ye c3232ye = C3182we.p;
            String string = sharedPreferencesA.getString(c3232ye.b(), null);
            C3182we c3182we = new C3182we(this.a, null);
            if (!TextUtils.isEmpty(string) && TextUtils.isEmpty(c3182we.b((String) null))) {
                c3182we.i(string).b();
                sharedPreferencesA.edit().remove(c3232ye.b()).apply();
            }
            Map<String, ?> all = sharedPreferencesA.getAll();
            if (all.size() > 0) {
                Iterator it = ((ArrayList) a(all, C3182we.q.b())).iterator();
                while (it.hasNext()) {
                    String str = (String) it.next();
                    String string2 = sharedPreferencesA.getString(new C3232ye(C3182we.q.b(), str).a(), null);
                    C3182we c3182we2 = new C3182we(this.a, str);
                    if (!TextUtils.isEmpty(string2) && TextUtils.isEmpty(c3182we2.h(null))) {
                        c3182we2.j(string2).b();
                    }
                }
            }
            sharedPreferencesA.edit().clear().apply();
        }
    }

    public void b() {
        InterfaceC3251z8 interfaceC3251z8P = Qa.a(this.a).p();
        SharedPreferences sharedPreferencesA = C2814i.a(this.a, "_startupserviceinfopreferences");
        J9 j9 = new J9(interfaceC3251z8P, null);
        C3232ye c3232ye = C3182we.p;
        String string = sharedPreferencesA.getString(c3232ye.b(), null);
        if (!TextUtils.isEmpty(string) && TextUtils.isEmpty(j9.f().b)) {
            j9.h(string).c();
            sharedPreferencesA.edit().remove(c3232ye.b()).apply();
        }
        J9 j92 = new J9(interfaceC3251z8P, this.a.getPackageName());
        boolean z = sharedPreferencesA.getBoolean(C3182we.y.b(), false);
        if (z) {
            j92.a(z).c();
        }
        a(interfaceC3251z8P, this.a.getPackageName());
        Iterator it = ((ArrayList) a(sharedPreferencesA.getAll(), C3182we.q.b())).iterator();
        while (it.hasNext()) {
            a(interfaceC3251z8P, (String) it.next());
        }
    }

    private List<String> a(Map<String, ?> map, String str) {
        ArrayList arrayList = new ArrayList();
        for (String str2 : map.keySet()) {
            if (str2.startsWith(str)) {
                arrayList.add(str2.replace(str, ""));
            }
        }
        return arrayList;
    }

    private void a(InterfaceC3251z8 interfaceC3251z8, String str) {
        J9 j9 = new J9(interfaceC3251z8, str);
        C3182we c3182we = new C3182we(this.a, str);
        String strH = c3182we.h(null);
        if (!TextUtils.isEmpty(strH)) {
            j9.n(strH);
        }
        String strC = c3182we.c(null);
        if (!TextUtils.isEmpty(strC)) {
            j9.i(strC);
        }
        String strD = c3182we.d(null);
        if (!TextUtils.isEmpty(strD)) {
            j9.j(strD);
        }
        String strF = c3182we.f(null);
        if (!TextUtils.isEmpty(strF)) {
            j9.l(strF);
        }
        String strE = c3182we.e(null);
        if (!TextUtils.isEmpty(strE)) {
            j9.k(strE);
        }
        long jA = c3182we.a(-1L);
        if (jA != -1) {
            j9.b(jA);
        }
        String strG = c3182we.g(null);
        if (!TextUtils.isEmpty(strG)) {
            j9.m(strG);
        }
        j9.c();
        c3182we.f();
    }
}
