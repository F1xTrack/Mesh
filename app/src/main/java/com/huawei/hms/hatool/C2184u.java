package com.huawei.hms.hatool;

import android.text.TextUtils;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

/* renamed from: com.huawei.hms.hatool.u */
/* loaded from: classes.dex */
public class C2184u {

    /* renamed from: a */
    private List<C2133b1> f19307a;

    /* renamed from: b */
    private String f19308b;

    /* renamed from: c */
    private String f19309c;

    /* renamed from: d */
    private String f19310d;

    public C2184u(List<C2133b1> list, String str, String str2, String str3) {
        this.f19307a = list;
        this.f19308b = str;
        this.f19309c = str2;
        this.f19310d = str3;
    }

    /* renamed from: a */
    public void m12258a() {
        if (!"_default_config_tag".equals(this.f19309c)) {
            m12257a(this.f19307a, this.f19309c, this.f19308b);
            return;
        }
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        ArrayList arrayList4 = new ArrayList();
        for (C2133b1 c2133b1 : this.f19307a) {
            String strM11935c = c2133b1.m11935c();
            if (TextUtils.isEmpty(strM11935c) || "oper".equals(strM11935c)) {
                arrayList4.add(c2133b1);
            } else if ("maint".equals(strM11935c)) {
                arrayList.add(c2133b1);
            } else if ("preins".equals(strM11935c)) {
                arrayList2.add(c2133b1);
            } else if ("diffprivacy".equals(strM11935c)) {
                arrayList3.add(c2133b1);
            }
        }
        m12257a(arrayList4, "oper", "_default_config_tag");
        m12257a(arrayList, "maint", "_default_config_tag");
        m12257a(arrayList2, "preins", "_default_config_tag");
        m12257a(arrayList3, "diffprivacy", "_default_config_tag");
    }

    /* renamed from: a */
    private void m12257a(List<C2133b1> list, String str, String str2) {
        if (list.isEmpty()) {
            return;
        }
        int size = (list.size() / 500) + 1;
        for (int i = 0; i < size; i++) {
            int i2 = i * 500;
            List<C2133b1> listSubList = list.subList(i2, Math.min(list.size(), i2 + 500));
            String strReplace = UUID.randomUUID().toString().replace("-", "");
            long jCurrentTimeMillis = System.currentTimeMillis();
            long jM11906b = AbstractC2130a1.m11906b(str2, str) * 86400000;
            ArrayList arrayList = new ArrayList();
            for (C2133b1 c2133b1 : listSubList) {
                if (!C2135c0.m11946a(c2133b1.m11933b(), jCurrentTimeMillis, jM11906b)) {
                    arrayList.add(c2133b1);
                }
            }
            if (arrayList.size() > 0) {
                new C2162l0(str2, str, this.f19310d, arrayList, strReplace).m12104a();
            } else {
                C2186v.m12275e("hmsSdk", "No data to report handler");
            }
        }
    }
}
