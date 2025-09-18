package com.yandex.metrica.impl.ob;

import android.text.TextUtils;
import defpackage.AbstractC8235ym;
import java.util.ArrayList;
import java.util.Iterator;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public class Xh {
    private final R2 a;
    private final Wh b;

    public Xh(Wh wh) {
        this(wh, new R2());
    }

    public long a(int i) {
        return a().optLong(String.valueOf(i));
    }

    public Xh(Wh wh, R2 r2) {
        this.b = wh;
        this.a = r2;
    }

    public void a(int i, long j) {
        JSONObject jSONObjectA = a();
        try {
            jSONObjectA.put(String.valueOf(i), j);
        } catch (Throwable unused) {
        }
        this.b.a(jSONObjectA.toString());
    }

    public void a(long j) {
        ArrayList arrayList = new ArrayList();
        JSONObject jSONObjectA = a();
        Iterator<String> itKeys = jSONObjectA.keys();
        while (itKeys.hasNext()) {
            String next = itKeys.next();
            if (this.a.b(jSONObjectA.optLong(next), j, AbstractC8235ym.v("last socket open on ", next))) {
                arrayList.add(next);
            }
        }
        if (arrayList.isEmpty()) {
            return;
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            jSONObjectA.remove((String) it.next());
        }
        this.b.a(jSONObjectA.toString());
    }

    private JSONObject a() {
        JSONObject jSONObject = new JSONObject();
        String strA = this.b.a();
        if (TextUtils.isEmpty(strA)) {
            return jSONObject;
        }
        try {
            return new JSONObject(strA);
        } catch (Throwable unused) {
            return jSONObject;
        }
    }
}
