package com.yandex.metrica.impl.p022ob;

import android.text.TextUtils;
import java.util.ArrayList;
import java.util.Iterator;
import org.json.JSONObject;
import p000.AbstractC7222ym;

/* renamed from: com.yandex.metrica.impl.ob.Xh */
/* loaded from: classes2.dex */
public class C3058Xh {

    /* renamed from: a */
    private final C2893R2 f22816a;

    /* renamed from: b */
    private final C3033Wh f22817b;

    public C3058Xh(C3033Wh c3033Wh) {
        this(c3033Wh, new C2893R2());
    }

    /* renamed from: a */
    public long m15425a(int i) {
        return m15424a().optLong(String.valueOf(i));
    }

    public C3058Xh(C3033Wh c3033Wh, C2893R2 c2893r2) {
        this.f22817b = c3033Wh;
        this.f22816a = c2893r2;
    }

    /* renamed from: a */
    public void m15426a(int i, long j) {
        JSONObject jSONObjectM15424a = m15424a();
        try {
            jSONObjectM15424a.put(String.valueOf(i), j);
        } catch (Throwable unused) {
        }
        this.f22817b.m15394a(jSONObjectM15424a.toString());
    }

    /* renamed from: a */
    public void m15427a(long j) {
        ArrayList arrayList = new ArrayList();
        JSONObject jSONObjectM15424a = m15424a();
        Iterator<String> itKeys = jSONObjectM15424a.keys();
        while (itKeys.hasNext()) {
            String next = itKeys.next();
            if (this.f22816a.m14970b(jSONObjectM15424a.optLong(next), j, AbstractC7222ym.m26245v("last socket open on ", next))) {
                arrayList.add(next);
            }
        }
        if (arrayList.isEmpty()) {
            return;
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            jSONObjectM15424a.remove((String) it.next());
        }
        this.f22817b.m15394a(jSONObjectM15424a.toString());
    }

    /* renamed from: a */
    private JSONObject m15424a() {
        JSONObject jSONObject = new JSONObject();
        String strM15393a = this.f22817b.m15393a();
        if (TextUtils.isEmpty(strM15393a)) {
            return jSONObject;
        }
        try {
            return new JSONObject(strM15393a);
        } catch (Throwable unused) {
            return jSONObject;
        }
    }
}
