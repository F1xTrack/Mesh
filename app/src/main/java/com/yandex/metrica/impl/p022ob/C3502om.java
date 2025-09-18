package com.yandex.metrica.impl.p022ob;

import android.os.Build;
import java.util.Set;

/* renamed from: com.yandex.metrica.impl.ob.om */
/* loaded from: classes2.dex */
public class C3502om {

    /* renamed from: a */
    private final Set<String> f24396a;

    public C3502om(Set<String> set) {
        this.f24396a = set;
    }

    /* renamed from: a */
    public String m16547a() {
        if (!C2968U2.m15243a(21)) {
            return m16546a(new String[]{Build.CPU_ABI, Build.CPU_ABI2});
        }
        String strM16546a = m16546a(Build.SUPPORTED_64_BIT_ABIS);
        return strM16546a != null ? strM16546a : m16546a(Build.SUPPORTED_32_BIT_ABIS);
    }

    /* renamed from: a */
    private String m16546a(String[] strArr) {
        for (String str : strArr) {
            if (this.f24396a.contains(str)) {
                return str;
            }
        }
        return null;
    }
}
