package com.yandex.metrica.impl.ob;

import android.annotation.TargetApi;
import android.content.Context;
import android.content.pm.PackageInfo;
import java.util.ArrayList;
import java.util.List;

@TargetApi(16)
/* renamed from: com.yandex.metrica.impl.ob.ke, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
class C2878ke implements InterfaceC2804he {
    private final Context a;
    private final Wn b;

    public C2878ke(Context context, Wn wn) {
        this.a = context;
        this.b = wn;
    }

    @Override // com.yandex.metrica.impl.ob.InterfaceC2804he
    public List<C2829ie> a() {
        ArrayList arrayList = new ArrayList();
        Wn wn = this.b;
        Context context = this.a;
        PackageInfo packageInfoB = wn.b(context, context.getPackageName(), 4096);
        if (packageInfoB == null) {
            return arrayList;
        }
        String[] strArr = packageInfoB.requestedPermissions;
        int[] iArr = packageInfoB.requestedPermissionsFlags;
        if (strArr == null) {
            return arrayList;
        }
        for (int i = 0; i < strArr.length; i++) {
            String str = strArr[i];
            if (iArr == null || iArr.length <= i || (iArr[i] & 2) == 0) {
                arrayList.add(new C2829ie(str, false));
            } else {
                arrayList.add(new C2829ie(str, true));
            }
        }
        return arrayList;
    }
}
