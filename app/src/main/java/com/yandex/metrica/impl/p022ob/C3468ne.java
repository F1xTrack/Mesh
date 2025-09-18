package com.yandex.metrica.impl.p022ob;

import android.content.Context;
import android.content.pm.PackageInfo;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.yandex.metrica.impl.ob.ne */
/* loaded from: classes2.dex */
public class C3468ne implements InterfaceC3312he {

    /* renamed from: a */
    private final Context f24313a;

    /* renamed from: b */
    private final String f24314b;

    /* renamed from: c */
    private final C3039Wn f24315c;

    public C3468ne(Context context, String str, C3039Wn c3039Wn) {
        this.f24313a = context;
        this.f24314b = str;
        this.f24315c = c3039Wn;
    }

    @Override // com.yandex.metrica.impl.p022ob.InterfaceC3312he
    /* renamed from: a */
    public List<C3338ie> mo16044a() {
        ArrayList arrayList = new ArrayList();
        PackageInfo packageInfoM15405b = this.f24315c.m15405b(this.f24313a, this.f24314b, 4096);
        if (packageInfoM15405b != null) {
            for (String str : packageInfoM15405b.requestedPermissions) {
                arrayList.add(new C3338ie(str, true));
            }
        }
        return arrayList;
    }
}
