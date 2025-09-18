package com.yandex.metrica.impl.ob;

/* renamed from: com.yandex.metrica.impl.ob.wf, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public class C3183wf implements uo<String> {
    @Override // com.yandex.metrica.impl.ob.uo
    public so a(String str) {
        String str2 = str;
        return str2 == null ? so.a(this, "key is null") : str2.startsWith("appmetrica") ? so.a(this, "key starts with appmetrica") : str2.length() > 200 ? so.a(this, "key length more then 200 characters") : so.a(this);
    }
}
