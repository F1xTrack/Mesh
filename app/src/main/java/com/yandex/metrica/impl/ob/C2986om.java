package com.yandex.metrica.impl.ob;

import android.os.Build;
import java.util.Set;

/* renamed from: com.yandex.metrica.impl.ob.om, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public class C2986om {
    private final Set<String> a;

    public C2986om(Set<String> set) {
        this.a = set;
    }

    public String a() {
        if (!U2.a(21)) {
            return a(new String[]{Build.CPU_ABI, Build.CPU_ABI2});
        }
        String strA = a(Build.SUPPORTED_64_BIT_ABIS);
        return strA != null ? strA : a(Build.SUPPORTED_32_BIT_ABIS);
    }

    private String a(String[] strArr) {
        for (String str : strArr) {
            if (this.a.contains(str)) {
                return str;
            }
        }
        return null;
    }
}
