package com.yandex.metrica.impl.p022ob;

import android.app.Activity;
import android.content.Intent;
import android.text.TextUtils;
import com.yandex.metrica.impl.p022ob.C3739y;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.yandex.metrica.impl.ob.C */
/* loaded from: classes2.dex */
public class C2516C implements C3739y.b {

    /* renamed from: a */
    private final List<InterfaceC3067Y1<C3558r0>> f20953a;

    /* renamed from: b */
    private volatile C3558r0 f20954b;

    /* renamed from: c */
    private final C3739y f20955c;

    /* renamed from: d */
    private final InterfaceExecutorC3607sn f20956d;

    /* renamed from: com.yandex.metrica.impl.ob.C$a */
    public class a implements InterfaceC3067Y1<C3558r0> {

        /* renamed from: a */
        final /* synthetic */ String f20957a;

        public a(C2516C c2516c, String str) {
            this.f20957a = str;
        }

        @Override // com.yandex.metrica.impl.p022ob.InterfaceC3067Y1
        /* renamed from: b */
        public void mo13945b(C3558r0 c3558r0) {
            c3558r0.m16644b(this.f20957a);
        }
    }

    public C2516C(InterfaceExecutorC3607sn interfaceExecutorC3607sn) {
        this(interfaceExecutorC3607sn, C3065Y.m15442g().m15444b());
    }

    /* renamed from: a */
    public void m13942a() {
        this.f20955c.m17203a(this, C3739y.a.CREATED);
    }

    public C2516C(InterfaceExecutorC3607sn interfaceExecutorC3607sn, C3739y c3739y) {
        this.f20953a = new ArrayList();
        this.f20954b = null;
        this.f20956d = interfaceExecutorC3607sn;
        this.f20955c = c3739y;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x001c A[LOOP:0: B:9:0x0016->B:11:0x001c, LOOP_END] */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void m13944a(com.yandex.metrica.impl.p022ob.C3558r0 r3) {
        /*
            r2 = this;
            monitor-enter(r2)
            r2.f20954b = r3     // Catch: java.lang.Throwable -> L27
            monitor-enter(r2)     // Catch: java.lang.Throwable -> L27
            java.util.ArrayList r0 = new java.util.ArrayList     // Catch: java.lang.Throwable -> L29
            java.util.List<com.yandex.metrica.impl.ob.Y1<com.yandex.metrica.impl.ob.r0>> r1 = r2.f20953a     // Catch: java.lang.Throwable -> L29
            r0.<init>(r1)     // Catch: java.lang.Throwable -> L29
            java.util.List<com.yandex.metrica.impl.ob.Y1<com.yandex.metrica.impl.ob.r0>> r1 = r2.f20953a     // Catch: java.lang.Throwable -> L29
            r1.clear()     // Catch: java.lang.Throwable -> L29
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L27
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L27
            java.util.Iterator r0 = r0.iterator()
        L16:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L26
            java.lang.Object r1 = r0.next()
            com.yandex.metrica.impl.ob.Y1 r1 = (com.yandex.metrica.impl.p022ob.InterfaceC3067Y1) r1
            r1.mo13945b(r3)
            goto L16
        L26:
            return
        L27:
            r3 = move-exception
            goto L2c
        L29:
            r3 = move-exception
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L27
            throw r3     // Catch: java.lang.Throwable -> L27
        L2c:
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L27
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yandex.metrica.impl.p022ob.C2516C.m13944a(com.yandex.metrica.impl.ob.r0):void");
    }

    @Override // com.yandex.metrica.impl.p022ob.C3739y.b
    /* renamed from: a */
    public void mo13943a(Activity activity, C3739y.a aVar) {
        Intent intent;
        if (activity != null) {
            try {
                intent = activity.getIntent();
            } catch (Throwable unused) {
            }
        } else {
            intent = null;
        }
        String dataString = intent != null ? intent.getDataString() : null;
        if (TextUtils.isEmpty(dataString)) {
            return;
        }
        a aVar2 = new a(this, dataString);
        synchronized (this) {
            try {
                C3558r0 c3558r0 = this.f20954b;
                if (c3558r0 == null) {
                    this.f20953a.add(aVar2);
                } else {
                    ((C3581rn) this.f20956d).execute(new RunnableC2491B(this, aVar2, c3558r0));
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
