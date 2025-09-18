package defpackage;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.content.pm.ResolveInfo;
import android.content.pm.ServiceInfo;
import android.graphics.Bitmap;
import android.os.Handler;
import android.os.IBinder;
import android.os.Looper;
import android.os.Messenger;
import android.os.RemoteException;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.internal.RemoteCall;
import com.google.android.gms.location.LocationRequest;
import com.google.android.gms.tasks.Task;
import com.vk.push.common.clientid.ClientId;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Objects;
import java.util.UUID;

/* renamed from: Qj1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1296Qj1 implements InterfaceC0053Al, InterfaceC7497ut1, InterfaceC1707Vq1, RemoteCall, AB1 {
    public final Object a;
    public final Object b;

    public C1296Qj1(Context context) {
        this.a = context;
        this.b = context.getPackageName();
    }

    public static final void c(Context context, InterfaceC6099nZ interfaceC6099nZ, ServiceConnection serviceConnection) {
        ComponentName componentName;
        Object zt0;
        if (WT1.b(context, "ru.vk.store.qa") || WT1.b(context, "ru.vk.store")) {
            Intent intent = new Intent("ru.vk.store.provider.review.RemoteReviewFlowProvider");
            List<ResolveInfo> listQueryIntentServices = context.getPackageManager().queryIntentServices(intent, 0);
            O90.e(listQueryIntentServices, "packageManager.queryIntentServices(intent, 0)");
            List<ResolveInfo> list = listQueryIntentServices;
            int iB = AbstractC7287tn0.b(AbstractC8449zu.k(list));
            if (iB < 16) {
                iB = 16;
            }
            LinkedHashMap linkedHashMap = new LinkedHashMap(iB);
            for (ResolveInfo resolveInfo : list) {
                linkedHashMap.put(resolveInfo.serviceInfo.packageName, resolveInfo);
            }
            ResolveInfo resolveInfo2 = (ResolveInfo) linkedHashMap.get("ru.vk.store.qa");
            if (resolveInfo2 == null) {
                resolveInfo2 = (ResolveInfo) linkedHashMap.get("ru.vk.store");
            }
            if (resolveInfo2 != null) {
                ServiceInfo serviceInfo = resolveInfo2.serviceInfo;
                componentName = new ComponentName(serviceInfo.packageName, serviceInfo.name);
            } else {
                componentName = null;
            }
            if (componentName != null) {
                intent.setComponent(componentName);
                context.bindService(intent, serviceConnection, 1);
                return;
            }
            zt0 = new ZT0("RuStore outdated");
        } else {
            zt0 = new YT0("RuStore not installed");
        }
        interfaceC6099nZ.invoke(zt0);
    }

    @Override // defpackage.InterfaceC7497ut1
    public void a(Context context, InterfaceC2213ar1 interfaceC2213ar1) {
        Task taskN = new N8(context, 1).n();
        C2192ak1 c2192ak1 = new C2192ak1(this, 1, interfaceC2213ar1);
        synchronized (this.a) {
            ((ArrayList) this.b).add(c2192ak1);
        }
        taskN.b(c2192ak1);
    }

    @Override // com.google.android.gms.common.api.internal.RemoteCall
    public void accept(Object obj, Object obj2) {
        Api.ClientKey clientKey = RB1.a;
        ((C8325zE1) obj).k((NB1) this.a, (LocationRequest) this.b, (S81) obj2);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // defpackage.InterfaceC1707Vq1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.Object b(java.lang.String r4, defpackage.AbstractC1963Yy r5) {
        /*
            r3 = this;
            boolean r4 = r5 instanceof defpackage.C1014Mt1
            if (r4 == 0) goto L13
            r4 = r5
            Mt1 r4 = (defpackage.C1014Mt1) r4
            int r0 = r4.c
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r2 = r0 & r1
            if (r2 == 0) goto L13
            int r0 = r0 - r1
            r4.c = r0
            goto L18
        L13:
            Mt1 r4 = new Mt1
            r4.<init>(r3, r5)
        L18:
            java.lang.Object r5 = r4.a
            Mz r0 = defpackage.EnumC1030Mz.a
            int r1 = r4.c
            r2 = 1
            if (r1 == 0) goto L2f
            if (r1 != r2) goto L27
            defpackage.RQ1.d(r5)
            goto L3f
        L27:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L2f:
            defpackage.RQ1.d(r5)
            r4.c = r2
            java.lang.Object r5 = r3.a
            Ir1 r5 = (defpackage.C0697Ir1) r5
            java.lang.Object r4 = r5.e(r4)
            if (r4 != r0) goto L3f
            return r0
        L3f:
            Tf1 r4 = defpackage.C1518Tf1.a
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C1296Qj1.b(java.lang.String, Yy):java.lang.Object");
    }

    @Override // defpackage.AB1
    public C6860rY0 d(InterfaceC0877Kz1 interfaceC0877Kz1) {
        C6860rY0 c6860rY0I = ((C6860rY0) this.a).I();
        c6860rY0I.M((String) this.b, interfaceC0877Kz1);
        return c6860rY0I;
    }

    @Override // defpackage.InterfaceC1707Vq1
    public Object e(C6728qr1 c6728qr1) {
        Object objE = ((C0697Ir1) this.a).e(c6728qr1);
        return objE == EnumC1030Mz.a ? objE : C1518Tf1.a;
    }

    public void f(WD wd) {
        synchronized (wd) {
        }
        Handler handler = (Handler) this.a;
        if (handler != null) {
            handler.post(new RunnableC1218Pj1(this, wd, 1));
        }
    }

    public void g(C1530Tj1 c1530Tj1) {
        Handler handler = (Handler) this.a;
        if (handler != null) {
            handler.post(new O91(this, 7, c1530Tj1));
        }
    }

    @Override // defpackage.InterfaceC1707Vq1
    public Object h(String str, ClientId clientId, InterfaceC1729Vy interfaceC1729Vy) {
        return new C1785Wq1((String) this.b);
    }

    @Override // defpackage.InterfaceC1707Vq1
    public Object i(String str, C6534pq1 c6534pq1) {
        C0697Ir1 c0697Ir1 = (C0697Ir1) this.a;
        c0697Ir1.getClass();
        return c0697Ir1.a.write(new C6155nr1(str), c6534pq1);
    }

    @Override // defpackage.InterfaceC0053Al
    public void invoke(Object obj) {
        Bitmap bitmap = (Bitmap) obj;
        C0223Cp1 c0223Cp1 = (C0223Cp1) this.b;
        if (O90.a((String) this.a, c0223Cp1.b)) {
            c0223Cp1.d = bitmap;
            c0223Cp1.l();
        }
    }

    public /* synthetic */ C1296Qj1(Object obj, Object obj2) {
        this.a = obj;
        this.b = obj2;
    }

    public C1296Qj1() {
        this.a = new Object();
        this.b = new ArrayList();
    }

    public C1296Qj1(IBinder iBinder) throws RemoteException {
        String interfaceDescriptor = iBinder.getInterfaceDescriptor();
        if (Objects.equals(interfaceDescriptor, "android.os.IMessenger")) {
            this.a = new Messenger(iBinder);
            this.b = null;
        } else if (Objects.equals(interfaceDescriptor, "com.google.android.gms.iid.IMessengerCompat")) {
            this.b = new C6801rE1(iBinder);
            this.a = null;
        } else {
            "Invalid interface descriptor: ".concat(String.valueOf(interfaceDescriptor));
            throw new RemoteException();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // defpackage.InterfaceC1707Vq1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.Object a(defpackage.AbstractC1963Yy r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof defpackage.C1170Ot1
            if (r0 == 0) goto L13
            r0 = r5
            Ot1 r0 = (defpackage.C1170Ot1) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            Ot1 r0 = new Ot1
            r0.<init>(r4, r5)
        L18:
            java.lang.Object r5 = r0.a
            Mz r1 = defpackage.EnumC1030Mz.a
            int r2 = r0.c
            r3 = 1
            if (r2 == 0) goto L33
            if (r2 != r3) goto L2b
            defpackage.RQ1.d(r5)
            Wq1 r5 = (defpackage.C1785Wq1) r5
            java.lang.String r5 = r5.a
            goto L43
        L2b:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r0)
            throw r5
        L33:
            defpackage.RQ1.d(r5)
            r0.c = r3
            java.lang.Object r5 = r4.a
            Ir1 r5 = (defpackage.C0697Ir1) r5
            java.lang.Object r5 = r5.f(r0)
            if (r5 != r1) goto L43
            return r1
        L43:
            java.lang.String r5 = (java.lang.String) r5
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C1296Qj1.a(Yy):java.lang.Object");
    }

    public C1296Qj1(KO1 ko1) {
        this.a = new Handler(Looper.getMainLooper());
        this.b = ko1;
    }

    public C1296Qj1(C0697Ir1 c0697Ir1) {
        O90.f(c0697Ir1, "storage");
        this.a = c0697Ir1;
        String string = UUID.randomUUID().toString();
        O90.e(string, "randomUUID().toString()");
        this.b = string;
    }
}
