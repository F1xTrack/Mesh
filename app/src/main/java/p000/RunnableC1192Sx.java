package p000;

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
public final class RunnableC1192Sx implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ int f11078a;

    /* renamed from: b */
    public Object f11079b;

    /* renamed from: c */
    public Object f11080c;

    /* renamed from: d */
    public Object f11081d;

    public /* synthetic */ RunnableC1192Sx(int i) {
        this.f11078a = i;
    }

    /* renamed from: a */
    private final void m7469a() {
        int i;
        C9450g32 c9450g32M957f;
        C0308Et c0308Et = (C0308Et) this.f11079b;
        Intent intent = c0308Et.f2938a;
        String stringExtra = intent.getStringExtra("google.message_id");
        if (stringExtra == null) {
            stringExtra = intent.getStringExtra("message_id");
        }
        if (TextUtils.isEmpty(stringExtra)) {
            c9450g32M957f = AbstractC9376fU1.m18244e(null);
        } else {
            Bundle bundle = new Bundle();
            Intent intent2 = c0308Et.f2938a;
            String stringExtra2 = intent2.getStringExtra("google.message_id");
            if (stringExtra2 == null) {
                stringExtra2 = intent2.getStringExtra("message_id");
            }
            bundle.putString("google.message_id", stringExtra2);
            Intent intent3 = c0308Et.f2938a;
            Integer numValueOf = intent3.hasExtra("google.product_id") ? Integer.valueOf(intent3.getIntExtra("google.product_id", 0)) : null;
            if (numValueOf != null) {
                bundle.putInt("google.product_id", numValueOf.intValue());
            }
            bundle.putBoolean("supports_message_handled", true);
            C22 c22M952e = C22.m952e((Context) this.f11080c);
            synchronized (c22M952e) {
                i = c22M952e.f1149a;
                c22M952e.f1149a = i + 1;
            }
            c9450g32M957f = c22M952e.m957f(new C10209m02(i, 2, bundle, 0));
        }
        c9450g32M957f.m18386m(ExecutorC1215TJ.f11319e, new C7106ww((CountDownLatch) this.f11081d));
    }

    /* JADX WARN: Removed duplicated region for block: B:115:0x0112  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x0123  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x01f4  */
    /* renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final void m7470b() throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 504
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.RunnableC1192Sx.m7470b():void");
    }

    /* JADX WARN: Removed duplicated region for block: B:60:0x002e  */
    /* renamed from: c */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final void m7471c() {
        /*
            Method dump skipped, instructions count: 218
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.RunnableC1192Sx.m7471c():void");
    }

    /* renamed from: d */
    private final void m7472d() {
        synchronized (((AtomicReference) this.f11079b)) {
            try {
                try {
                } catch (RemoteException e) {
                    ((C8989cV1) this.f11081d).mo6070n().f8378g.m24554c(e, "Failed to get app instance id");
                }
                if (!((C8989cV1) this.f11081d).m7851t1().m7995E1().m9048i(TQ1.ANALYTICS_STORAGE)) {
                    ((C8989cV1) this.f11081d).mo6070n().f8383l.m24555d("Analytics storage consent denied; will not get app instance id");
                    ((C8989cV1) this.f11081d).m7682w1().m2652W1(null);
                    ((C8989cV1) this.f11081d).m7851t1().f11748i.m8354t(null);
                    ((AtomicReference) this.f11079b).set(null);
                    return;
                }
                C8989cV1 c8989cV1 = (C8989cV1) this.f11081d;
                MJ1 mj1 = c8989cV1.f17574e;
                if (mj1 == null) {
                    c8989cV1.mo6070n().f8378g.m24555d("Failed to get app instance id");
                    return;
                }
                Preconditions.checkNotNull((EY1) this.f11080c);
                ((AtomicReference) this.f11079b).set(mj1.mo5325s((EY1) this.f11080c));
                String str = (String) ((AtomicReference) this.f11079b).get();
                if (str != null) {
                    ((C8989cV1) this.f11081d).m7682w1().m2652W1(str);
                    ((C8989cV1) this.f11081d).m7851t1().f11748i.m8354t(str);
                }
                ((C8989cV1) this.f11081d).m10751M1();
                ((AtomicReference) this.f11079b).notify();
            } finally {
                ((AtomicReference) this.f11079b).notify();
            }
        }
    }

    /* renamed from: e */
    private final void m7473e() {
        EY1 ey1 = (EY1) this.f11079b;
        InterfaceC11266uF1 interfaceC11266uF1 = (InterfaceC11266uF1) this.f11080c;
        C8989cV1 c8989cV1 = (C8989cV1) this.f11081d;
        try {
            if (!c8989cV1.m7851t1().m7995E1().m9048i(TQ1.ANALYTICS_STORAGE)) {
                c8989cV1.mo6070n().f8383l.m24555d("Analytics storage consent denied; will not get app instance id");
                c8989cV1.m7682w1().m2652W1(null);
                c8989cV1.m7851t1().f11748i.m8354t(null);
                return;
            }
            MJ1 mj1 = c8989cV1.f17574e;
            if (mj1 == null) {
                c8989cV1.mo6070n().f8378g.m24555d("Failed to get app instance id");
                return;
            }
            Preconditions.checkNotNull(ey1);
            String strMo5325s = mj1.mo5325s(ey1);
            if (strMo5325s != null) {
                c8989cV1.m7682w1().m2652W1(strMo5325s);
                c8989cV1.m7851t1().f11748i.m8354t(strMo5325s);
            }
            c8989cV1.m10751M1();
            c8989cV1.m7852u1().m22877R1(strMo5325s, interfaceC11266uF1);
        } catch (RemoteException e) {
            c8989cV1.mo6070n().f8378g.m24554c(e, "Failed to get app instance id");
        } finally {
            c8989cV1.m7852u1().m22877R1(null, interfaceC11266uF1);
        }
    }

    /* renamed from: f */
    private final void m7474f() {
        EY1 ey1 = (EY1) this.f11079b;
        C8989cV1 c8989cV1 = (C8989cV1) this.f11081d;
        MJ1 mj1 = c8989cV1.f17574e;
        if (mj1 == null) {
            c8989cV1.mo6070n().f8378g.m24555d("Failed to send default event parameters to service");
            return;
        }
        try {
            Preconditions.checkNotNull(ey1);
            mj1.mo5312a((Bundle) this.f11080c, ey1);
        } catch (RemoteException e) {
            c8989cV1.mo6070n().f8378g.m24554c(e, "Failed to send default event parameters to service");
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
        throw new UnsupportedOperationException("Method not decompiled: p000.RunnableC1192Sx.run():void");
    }

    public /* synthetic */ RunnableC1192Sx(Context context, C0308Et c0308Et, CountDownLatch countDownLatch) {
        this.f11078a = 18;
        this.f11080c = context;
        this.f11079b = c0308Et;
        this.f11081d = countDownLatch;
    }

    public /* synthetic */ RunnableC1192Sx(Object obj, Object obj2, Object obj3, int i) {
        this.f11078a = i;
        this.f11079b = obj;
        this.f11080c = obj2;
        this.f11081d = obj3;
    }

    public /* synthetic */ RunnableC1192Sx(Object obj, Object obj2, Object obj3, int i, boolean z) {
        this.f11078a = i;
        this.f11081d = obj;
        this.f11079b = obj2;
        this.f11080c = obj3;
    }

    public /* synthetic */ RunnableC1192Sx(C10274mV1 c10274mV1, C8389Ur1 c8389Ur1, String str) {
        this.f11078a = 24;
        this.f11079b = c10274mV1;
        this.f11080c = c8389Ur1;
        this.f11081d = str;
    }
}
