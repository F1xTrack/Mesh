package com.yandex.metrica.impl.p022ob;

import android.annotation.TargetApi;
import android.content.Context;
import android.content.pm.PackageInfo;
import java.util.ArrayList;
import java.util.List;

@TargetApi(16)
/* renamed from: com.yandex.metrica.impl.ob.ke */
/* loaded from: classes2.dex */
class C3390ke implements InterfaceC3312he {

    /* renamed from: a */
    private final Context f23921a;

    /* renamed from: b */
    private final C3039Wn f23922b;

    public C3390ke(Context context, C3039Wn c3039Wn) {
        this.f23921a = context;
        this.f23922b = c3039Wn;
    }

    @Override // com.yandex.metrica.impl.p022ob.InterfaceC3312he
    /* renamed from: a */
    public List<C3338ie> mo16044a() {
        ArrayList arrayList = new ArrayList();
        C3039Wn c3039Wn = this.f23922b;
        Context context = this.f23921a;
        PackageInfo packageInfoM15405b = c3039Wn.m15405b(context, context.getPackageName(), 4096);
        if (packageInfoM15405b == null) {
            return arrayList;
        }
        String[] strArr = packageInfoM15405b.requestedPermissions;
        int[] iArr = packageInfoM15405b.requestedPermissionsFlags;
        if (strArr == null) {
            return arrayList;
        }
        for (int i = 0; i < strArr.length; i++) {
            String str = strArr[i];
            if (iArr == null || iArr.length <= i || (iArr[i] & 2) == 0) {
                arrayList.add(new C3338ie(str, false));
            } else {
                arrayList.add(new C3338ie(str, true));
            }
        }
        return arrayList;
    }
}
