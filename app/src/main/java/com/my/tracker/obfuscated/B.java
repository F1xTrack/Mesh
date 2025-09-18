package com.my.tracker.obfuscated;

import com.my.tracker.obfuscated.d;
import com.my.tracker.obfuscated.o0;
import java.util.Map;

/* loaded from: classes2.dex */
public final /* synthetic */ class B implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ B(Object obj, int i, Object obj2) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
    }

    private final void a() {
        ((d.c) this.b).a((OwnedPurchasesResult) this.c);
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                ((d.c) this.b).a((String) this.c);
                break;
            case 1:
                a();
                break;
            default:
                ((o0.a) this.b).a((Map) this.c);
                break;
        }
    }
}
