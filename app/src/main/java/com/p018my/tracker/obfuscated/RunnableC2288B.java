package com.p018my.tracker.obfuscated;

import com.huawei.hms.iap.entity.OwnedPurchasesResult;
import com.p018my.tracker.obfuscated.C2304d;
import com.p018my.tracker.obfuscated.C2349o0;
import java.util.Map;

/* renamed from: com.my.tracker.obfuscated.B */
/* loaded from: classes2.dex */
public final /* synthetic */ class RunnableC2288B implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ int f19710a;

    /* renamed from: b */
    public final /* synthetic */ Object f19711b;

    /* renamed from: c */
    public final /* synthetic */ Object f19712c;

    public /* synthetic */ RunnableC2288B(Object obj, int i, Object obj2) {
        this.f19710a = i;
        this.f19711b = obj;
        this.f19712c = obj2;
    }

    /* renamed from: a */
    private final void m12757a() {
        ((C2304d.c) this.f19711b).m12837a((OwnedPurchasesResult) this.f19712c);
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f19710a) {
            case 0:
                ((C2304d.c) this.f19711b).m12840a((String) this.f19712c);
                break;
            case 1:
                m12757a();
                break;
            default:
                ((C2349o0.a) this.f19711b).m13365a((Map) this.f19712c);
                break;
        }
    }
}
