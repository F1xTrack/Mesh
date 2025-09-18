package defpackage;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.RemoteException;
import android.text.TextUtils;
import com.google.android.gms.common.internal.Preconditions;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: Sx */
/* loaded from: classes.dex */
public final class RunnableC1492Sx implements Runnable {
    public final /* synthetic */ int a;
    public Object b;
    public Object c;
    public Object d;

    public /* synthetic */ RunnableC1492Sx(int i) {
        this.a = i;
    }

    private final void a() {
        int i;
        C3892g32 c3892g32F;
        C0389Et c0389Et = (C0389Et) this.b;
        Intent intent = c0389Et.a;
        String stringExtra = intent.getStringExtra("google.message_id");
        if (stringExtra == null) {
            stringExtra = intent.getStringExtra("message_id");
        }
        if (TextUtils.isEmpty(stringExtra)) {
            c3892g32F = AbstractC3782fU1.e(null);
        } else {
            Bundle bundle = new Bundle();
            Intent intent2 = c0389Et.a;
            String stringExtra2 = intent2.getStringExtra("google.message_id");
            if (stringExtra2 == null) {
                stringExtra2 = intent2.getStringExtra("message_id");
            }
            bundle.putString("google.message_id", stringExtra2);
            Intent intent3 = c0389Et.a;
            Integer numValueOf = intent3.hasExtra("google.product_id") ? Integer.valueOf(intent3.getIntExtra("google.product_id", 0)) : null;
            if (numValueOf != null) {
                bundle.putInt("google.product_id", numValueOf.intValue());
            }
            bundle.putBoolean("supports_message_handled", true);
            C22 c22E = C22.e((Context) this.c);
            synchronized (c22E) {
                i = c22E.a;
                c22E.a = i + 1;
            }
            c3892g32F = c22E.f(new C5802m02(i, 2, bundle, 0));
        }
        c3892g32F.m(TJ.e, new C7885ww((CountDownLatch) this.d));
    }

    /* JADX WARN: Removed duplicated region for block: B:115:0x0112  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x0123  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x01f4  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final void b() throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 504
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.RunnableC1492Sx.b():void");
    }

    /* JADX WARN: Removed duplicated region for block: B:60:0x002e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final void c() {
        /*
            Method dump skipped, instructions count: 218
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.RunnableC1492Sx.c():void");
    }

    private final void d() {
        synchronized (((AtomicReference) this.b)) {
            try {
                try {
                } catch (RemoteException e) {
                    ((C2528cV1) this.d).n().g.c(e, "Failed to get app instance id");
                }
                if (!((C2528cV1) this.d).t1().E1().i(TQ1.ANALYTICS_STORAGE)) {
                    ((C2528cV1) this.d).n().l.d("Analytics storage consent denied; will not get app instance id");
                    ((C2528cV1) this.d).w1().W1(null);
                    ((C2528cV1) this.d).t1().i.t(null);
                    ((AtomicReference) this.b).set(null);
                    return;
                }
                C2528cV1 c2528cV1 = (C2528cV1) this.d;
                MJ1 mj1 = c2528cV1.e;
                if (mj1 == null) {
                    c2528cV1.n().g.d("Failed to get app instance id");
                    return;
                }
                Preconditions.checkNotNull((EY1) this.c);
                ((AtomicReference) this.b).set(mj1.s((EY1) this.c));
                String str = (String) ((AtomicReference) this.b).get();
                if (str != null) {
                    ((C2528cV1) this.d).w1().W1(str);
                    ((C2528cV1) this.d).t1().i.t(str);
                }
                ((C2528cV1) this.d).M1();
                ((AtomicReference) this.b).notify();
            } finally {
                ((AtomicReference) this.b).notify();
            }
        }
    }

    private final void e() {
        EY1 ey1 = (EY1) this.b;
        InterfaceC7377uF1 interfaceC7377uF1 = (InterfaceC7377uF1) this.c;
        C2528cV1 c2528cV1 = (C2528cV1) this.d;
        try {
            if (!c2528cV1.t1().E1().i(TQ1.ANALYTICS_STORAGE)) {
                c2528cV1.n().l.d("Analytics storage consent denied; will not get app instance id");
                c2528cV1.w1().W1(null);
                c2528cV1.t1().i.t(null);
                return;
            }
            MJ1 mj1 = c2528cV1.e;
            if (mj1 == null) {
                c2528cV1.n().g.d("Failed to get app instance id");
                return;
            }
            Preconditions.checkNotNull(ey1);
            String strS = mj1.s(ey1);
            if (strS != null) {
                c2528cV1.w1().W1(strS);
                c2528cV1.t1().i.t(strS);
            }
            c2528cV1.M1();
            c2528cV1.u1().R1(strS, interfaceC7377uF1);
        } catch (RemoteException e) {
            c2528cV1.n().g.c(e, "Failed to get app instance id");
        } finally {
            c2528cV1.u1().R1(null, interfaceC7377uF1);
        }
    }

    private final void f() {
        EY1 ey1 = (EY1) this.b;
        C2528cV1 c2528cV1 = (C2528cV1) this.d;
        MJ1 mj1 = c2528cV1.e;
        if (mj1 == null) {
            c2528cV1.n().g.d("Failed to send default event parameters to service");
            return;
        }
        try {
            Preconditions.checkNotNull(ey1);
            mj1.mo1a((Bundle) this.c, ey1);
        } catch (RemoteException e) {
            c2528cV1.n().g.c(e, "Failed to send default event parameters to service");
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:595:0x045d  */
    /* JADX WARN: Removed duplicated region for block: B:596:0x0465  */
    /* JADX WARN: Removed duplicated region for block: B:604:0x0476 A[Catch: Exception -> 0x0472, TRY_LEAVE, TryCatch #10 {Exception -> 0x0472, blocks: (B:600:0x046e, B:604:0x0476), top: B:746:0x046e }] */
    /* JADX WARN: Removed duplicated region for block: B:688:0x06c2  */
    /* JADX WARN: Removed duplicated region for block: B:746:0x046e A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:756:0x06bd A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:820:? A[SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r1v0, types: [java.io.InputStream, java.net.HttpURLConnection] */
    /* JADX WARN: Type inference failed for: r1v118 */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void run() throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 2036
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.RunnableC1492Sx.run():void");
    }

    public /* synthetic */ RunnableC1492Sx(Context context, C0389Et c0389Et, CountDownLatch countDownLatch) {
        this.a = 18;
        this.c = context;
        this.b = c0389Et;
        this.d = countDownLatch;
    }

    public /* synthetic */ RunnableC1492Sx(Object obj, Object obj2, Object obj3, int i) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
    }

    public /* synthetic */ RunnableC1492Sx(Object obj, Object obj2, Object obj3, int i, boolean z) {
        this.a = i;
        this.d = obj;
        this.b = obj2;
        this.c = obj3;
    }

    public /* synthetic */ RunnableC1492Sx(C5898mV1 c5898mV1, C1632Ur1 c1632Ur1, String str) {
        this.a = 24;
        this.b = c5898mV1;
        this.c = c1632Ur1;
        this.d = str;
    }
}
