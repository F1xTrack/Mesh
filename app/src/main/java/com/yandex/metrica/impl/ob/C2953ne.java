package com.yandex.metrica.impl.ob;

import android.content.Context;
import android.content.pm.PackageInfo;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.yandex.metrica.impl.ob.ne, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public class C2953ne implements InterfaceC2804he {
    private final Context a;
    private final String b;
    private final Wn c;

    public C2953ne(Context context, String str, Wn wn) {
        this.a = context;
        this.b = str;
        this.c = wn;
    }

    @Override // com.yandex.metrica.impl.ob.InterfaceC2804he
    public List<C2829ie> a() {
        ArrayList arrayList = new ArrayList();
        PackageInfo packageInfoB = this.c.b(this.a, this.b, 4096);
        if (packageInfoB != null) {
            for (String str : packageInfoB.requestedPermissions) {
                arrayList.add(new C2829ie(str, true));
            }
        }
        return arrayList;
    }
}
