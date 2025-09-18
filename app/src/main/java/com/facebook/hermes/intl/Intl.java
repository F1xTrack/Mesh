package com.facebook.hermes.intl;

import android.icu.lang.UCharacter;
import android.os.Build;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Locale;
import p000.AbstractC11234u10;
import p000.AbstractC11362v10;
import p000.C0226Da;
import p000.InterfaceC0965PK;
import p000.L10;
import p000.Y40;

@InterfaceC0965PK
/* loaded from: classes.dex */
public class Intl {
    @InterfaceC0965PK
    public static List<String> getCanonicalLocales(List<String> list) throws C0226Da {
        if (list.size() == 0) {
            return Collections.emptyList();
        }
        ArrayList arrayList = new ArrayList();
        for (String str : list) {
            if (str == null) {
                throw new C0226Da("Incorrect locale information provided", 10);
            }
            if (str.isEmpty()) {
                throw new C0226Da("Incorrect locale information provided", 10);
            }
            String strMo5821b = AbstractC11362v10.m25305b(str).mo5821b();
            if (!strMo5821b.isEmpty() && !arrayList.contains(strMo5821b)) {
                arrayList.add(strMo5821b);
            }
        }
        return arrayList;
    }

    @InterfaceC0965PK
    public static String toLocaleLowerCase(List<String> list, String str) throws C0226Da {
        String[] strArr = new String[list.size()];
        return Build.VERSION.SDK_INT >= 24 ? UCharacter.toLowerCase(L10.m4845i(((Y40) AbstractC11234u10.m25073c((String[]) list.toArray(strArr)).f26012b).mo5826g()), str) : str.toLowerCase((Locale) ((Y40) AbstractC11234u10.m25076f((String[]) list.toArray(strArr)).f26012b).mo5826g());
    }

    @InterfaceC0965PK
    public static String toLocaleUpperCase(List<String> list, String str) throws C0226Da {
        String[] strArr = new String[list.size()];
        return Build.VERSION.SDK_INT >= 24 ? UCharacter.toUpperCase(L10.m4845i(((Y40) AbstractC11234u10.m25073c((String[]) list.toArray(strArr)).f26012b).mo5826g()), str) : str.toUpperCase((Locale) ((Y40) AbstractC11234u10.m25076f((String[]) list.toArray(strArr)).f26012b).mo5826g());
    }
}
