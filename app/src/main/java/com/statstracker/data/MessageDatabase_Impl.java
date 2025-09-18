package com.statstracker.data;

import android.content.Context;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import p000.AbstractC8388Ur0;
import p000.C10189lr0;
import p000.C10317mr0;
import p000.C6349lD;
import p000.C6404m5;
import p000.C8875bc1;
import p000.C8998ca0;
import p000.D61;
import p000.O90;

/* loaded from: classes2.dex */
public final class MessageDatabase_Impl extends MessageDatabase {

    /* renamed from: k */
    public volatile C10189lr0 f20248k;

    @Override // p000.AbstractC10653pT0
    /* renamed from: d */
    public final C8998ca0 mo10330d() {
        return new C8998ca0(this, new HashMap(0), new HashMap(0), "message_table");
    }

    @Override // p000.AbstractC10653pT0
    /* renamed from: e */
    public final D61 mo10331e(C6349lD c6349lD) {
        C8875bc1 c8875bc1 = new C8875bc1(c6349lD, new C10317mr0(this), "df9434dbcb891cb20fb585d58886ac87", "abb946b2236e034ed5ea45cd58cfe9ff");
        Context context = c6349lD.f36960a;
        O90.m5968f(context, "context");
        return c6349lD.f36962c.mo984n(new C6404m5(context, c6349lD.f36961b, c8875bc1, false, false));
    }

    @Override // p000.AbstractC10653pT0
    /* renamed from: f */
    public final List mo10332f(LinkedHashMap linkedHashMap) {
        return Arrays.asList(new AbstractC8388Ur0[0]);
    }

    @Override // p000.AbstractC10653pT0
    /* renamed from: h */
    public final Set mo10333h() {
        return new HashSet();
    }

    @Override // p000.AbstractC10653pT0
    /* renamed from: i */
    public final Map mo10334i() {
        HashMap map = new HashMap();
        map.put(C10189lr0.class, Collections.emptyList());
        return map;
    }

    @Override // com.statstracker.data.MessageDatabase
    /* renamed from: p */
    public final C10189lr0 mo13691p() {
        C10189lr0 c10189lr0;
        if (this.f20248k != null) {
            return this.f20248k;
        }
        synchronized (this) {
            try {
                if (this.f20248k == null) {
                    this.f20248k = new C10189lr0(this);
                }
                c10189lr0 = this.f20248k;
            } catch (Throwable th) {
                throw th;
            }
        }
        return c10189lr0;
    }
}
