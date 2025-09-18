package com.yandex.metrica.impl.ob;

import android.app.Activity;
import android.content.Intent;
import android.text.TextUtils;
import com.yandex.metrica.impl.ob.C3217y;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes2.dex */
public class C implements C3217y.b {
    private final List<Y1<C3038r0>> a;
    private volatile C3038r0 b;
    private final C3217y c;
    private final InterfaceExecutorC3086sn d;

    public class a implements Y1<C3038r0> {
        final /* synthetic */ String a;

        public a(C c, String str) {
            this.a = str;
        }

        @Override // com.yandex.metrica.impl.ob.Y1
        public void b(C3038r0 c3038r0) {
            c3038r0.b(this.a);
        }
    }

    public C(InterfaceExecutorC3086sn interfaceExecutorC3086sn) {
        this(interfaceExecutorC3086sn, Y.g().b());
    }

    public void a() {
        this.c.a(this, C3217y.a.CREATED);
    }

    public C(InterfaceExecutorC3086sn interfaceExecutorC3086sn, C3217y c3217y) {
        this.a = new ArrayList();
        this.b = null;
        this.d = interfaceExecutorC3086sn;
        this.c = c3217y;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x001c A[LOOP:0: B:9:0x0016->B:11:0x001c, LOOP_END] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void a(com.yandex.metrica.impl.ob.C3038r0 r3) {
        /*
            r2 = this;
            monitor-enter(r2)
            r2.b = r3     // Catch: java.lang.Throwable -> L27
            monitor-enter(r2)     // Catch: java.lang.Throwable -> L27
            java.util.ArrayList r0 = new java.util.ArrayList     // Catch: java.lang.Throwable -> L29
            java.util.List<com.yandex.metrica.impl.ob.Y1<com.yandex.metrica.impl.ob.r0>> r1 = r2.a     // Catch: java.lang.Throwable -> L29
            r0.<init>(r1)     // Catch: java.lang.Throwable -> L29
            java.util.List<com.yandex.metrica.impl.ob.Y1<com.yandex.metrica.impl.ob.r0>> r1 = r2.a     // Catch: java.lang.Throwable -> L29
            r1.clear()     // Catch: java.lang.Throwable -> L29
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L27
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L27
            java.util.Iterator r0 = r0.iterator()
        L16:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L26
            java.lang.Object r1 = r0.next()
            com.yandex.metrica.impl.ob.Y1 r1 = (com.yandex.metrica.impl.ob.Y1) r1
            r1.b(r3)
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
        throw new UnsupportedOperationException("Method not decompiled: com.yandex.metrica.impl.ob.C.a(com.yandex.metrica.impl.ob.r0):void");
    }

    @Override // com.yandex.metrica.impl.ob.C3217y.b
    public void a(Activity activity, C3217y.a aVar) {
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
                C3038r0 c3038r0 = this.b;
                if (c3038r0 == null) {
                    this.a.add(aVar2);
                } else {
                    ((C3061rn) this.d).execute(new B(this, aVar2, c3038r0));
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
