package p000;

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
import com.p019vk.push.common.clientid.ClientId;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Objects;
import java.util.UUID;

/* renamed from: Qj1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C8165Qj1 implements InterfaceC0048Al, InterfaceC11346ut1, InterfaceC8439Vq1, RemoteCall, AB1 {

    /* renamed from: a */
    public final Object f9756a;

    /* renamed from: b */
    public final Object f9757b;

    public C8165Qj1(Context context) {
        this.f9756a = context;
        this.f9757b = context.getPackageName();
    }

    /* renamed from: c */
    public static final void m6748c(Context context, InterfaceC6497nZ interfaceC6497nZ, ServiceConnection serviceConnection) {
        ComponentName componentName;
        Object zt0;
        if (WT1.m8783b(context, "ru.vk.store.qa") || WT1.m8783b(context, "ru.vk.store")) {
            Intent intent = new Intent("ru.vk.store.provider.review.RemoteReviewFlowProvider");
            List<ResolveInfo> listQueryIntentServices = context.getPackageManager().queryIntentServices(intent, 0);
            O90.m5967e(listQueryIntentServices, "packageManager.queryIntentServices(intent, 0)");
            List<ResolveInfo> list = listQueryIntentServices;
            int iM24983b = AbstractC11205tn0.m24983b(AbstractC7293zu.m26586k(list));
            if (iM24983b < 16) {
                iM24983b = 16;
            }
            LinkedHashMap linkedHashMap = new LinkedHashMap(iM24983b);
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
        interfaceC6497nZ.invoke(zt0);
    }

    @Override // p000.InterfaceC11346ut1
    /* renamed from: a */
    public void mo6749a(Context context, InterfaceC8777ar1 interfaceC8777ar1) {
        Task taskM5562n = new C0827N8(context, 1).m5562n();
        C8763ak1 c8763ak1 = new C8763ak1(this, 1, interfaceC8777ar1);
        synchronized (this.f9756a) {
            ((ArrayList) this.f9757b).add(c8763ak1);
        }
        taskM5562n.mo11135b(c8763ak1);
    }

    @Override // com.google.android.gms.common.api.internal.RemoteCall
    public void accept(Object obj, Object obj2) {
        Api.ClientKey clientKey = RB1.f10059a;
        ((C11900zE1) obj).m26344k((NB1) this.f9756a, (LocationRequest) this.f9757b, (S81) obj2);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // p000.InterfaceC8439Vq1
    /* renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.Object mo6148b(java.lang.String r4, p000.AbstractC1571Yy r5) {
        /*
            r3 = this;
            boolean r4 = r5 instanceof p000.C7977Mt1
            if (r4 == 0) goto L13
            r4 = r5
            Mt1 r4 = (p000.C7977Mt1) r4
            int r0 = r4.f7385c
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r2 = r0 & r1
            if (r2 == 0) goto L13
            int r0 = r0 - r1
            r4.f7385c = r0
            goto L18
        L13:
            Mt1 r4 = new Mt1
            r4.<init>(r3, r5)
        L18:
            java.lang.Object r5 = r4.f7383a
            Mz r0 = p000.EnumC0817Mz.f7418a
            int r1 = r4.f7385c
            r2 = 1
            if (r1 == 0) goto L2f
            if (r1 != r2) goto L27
            p000.RQ1.m7017d(r5)
            goto L3f
        L27:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L2f:
            p000.RQ1.m7017d(r5)
            r4.f7385c = r2
            java.lang.Object r5 = r3.f9756a
            Ir1 r5 = (p000.C7765Ir1) r5
            java.lang.Object r4 = r5.m4054e(r4)
            if (r4 != r0) goto L3f
            return r0
        L3f:
            Tf1 r4 = p000.C8313Tf1.f11463a
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.C8165Qj1.mo6148b(java.lang.String, Yy):java.lang.Object");
    }

    @Override // p000.AB1
    /* renamed from: d */
    public C10919rY0 mo103d(InterfaceC7885Kz1 interfaceC7885Kz1) {
        C10919rY0 c10919rY0M24410I = ((C10919rY0) this.f9756a).m24410I();
        c10919rY0M24410I.m24414M((String) this.f9757b, interfaceC7885Kz1);
        return c10919rY0M24410I;
    }

    @Override // p000.InterfaceC8439Vq1
    /* renamed from: e */
    public Object mo6149e(C10830qr1 c10830qr1) {
        Object objM4054e = ((C7765Ir1) this.f9756a).m4054e(c10830qr1);
        return objM4054e == EnumC0817Mz.f7418a ? objM4054e : C8313Tf1.f11463a;
    }

    /* renamed from: f */
    public void m6750f(C1398WD c1398wd) {
        synchronized (c1398wd) {
        }
        Handler handler = (Handler) this.f9756a;
        if (handler != null) {
            handler.post(new RunnableC8113Pj1(this, c1398wd, 1));
        }
    }

    /* renamed from: g */
    public void m6751g(C8321Tj1 c8321Tj1) {
        Handler handler = (Handler) this.f9756a;
        if (handler != null) {
            handler.post(new O91(this, 7, c8321Tj1));
        }
    }

    @Override // p000.InterfaceC8439Vq1
    /* renamed from: h */
    public Object mo6150h(String str, ClientId clientId, InterfaceC1382Vy interfaceC1382Vy) {
        return new C8491Wq1((String) this.f9757b);
    }

    @Override // p000.InterfaceC8439Vq1
    /* renamed from: i */
    public Object mo6151i(String str, C10700pq1 c10700pq1) {
        C7765Ir1 c7765Ir1 = (C7765Ir1) this.f9756a;
        c7765Ir1.getClass();
        return c7765Ir1.f5185a.write(new C10446nr1(str), c10700pq1);
    }

    @Override // p000.InterfaceC0048Al
    public void invoke(Object obj) {
        Bitmap bitmap = (Bitmap) obj;
        C7449Cp1 c7449Cp1 = (C7449Cp1) this.f9757b;
        if (O90.m5963a((String) this.f9756a, c7449Cp1.f1690b)) {
            c7449Cp1.f1692d = bitmap;
            c7449Cp1.m1401l();
        }
    }

    public /* synthetic */ C8165Qj1(Object obj, Object obj2) {
        this.f9756a = obj;
        this.f9757b = obj2;
    }

    public C8165Qj1() {
        this.f9756a = new Object();
        this.f9757b = new ArrayList();
    }

    public C8165Qj1(IBinder iBinder) throws RemoteException {
        String interfaceDescriptor = iBinder.getInterfaceDescriptor();
        if (Objects.equals(interfaceDescriptor, "android.os.IMessenger")) {
            this.f9756a = new Messenger(iBinder);
            this.f9757b = null;
        } else if (Objects.equals(interfaceDescriptor, "com.google.android.gms.iid.IMessengerCompat")) {
            this.f9757b = new C10880rE1(iBinder);
            this.f9756a = null;
        } else {
            "Invalid interface descriptor: ".concat(String.valueOf(interfaceDescriptor));
            throw new RemoteException();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // p000.InterfaceC8439Vq1
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.Object mo6147a(p000.AbstractC1571Yy r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof p000.C8081Ot1
            if (r0 == 0) goto L13
            r0 = r5
            Ot1 r0 = (p000.C8081Ot1) r0
            int r1 = r0.f8662c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f8662c = r1
            goto L18
        L13:
            Ot1 r0 = new Ot1
            r0.<init>(r4, r5)
        L18:
            java.lang.Object r5 = r0.f8660a
            Mz r1 = p000.EnumC0817Mz.f7418a
            int r2 = r0.f8662c
            r3 = 1
            if (r2 == 0) goto L33
            if (r2 != r3) goto L2b
            p000.RQ1.m7017d(r5)
            Wq1 r5 = (p000.C8491Wq1) r5
            java.lang.String r5 = r5.f13419a
            goto L43
        L2b:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r0)
            throw r5
        L33:
            p000.RQ1.m7017d(r5)
            r0.f8662c = r3
            java.lang.Object r5 = r4.f9756a
            Ir1 r5 = (p000.C7765Ir1) r5
            java.lang.Object r5 = r5.m4055f(r0)
            if (r5 != r1) goto L43
            return r1
        L43:
            java.lang.String r5 = (java.lang.String) r5
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.C8165Qj1.mo6147a(Yy):java.lang.Object");
    }

    public C8165Qj1(KO1 ko1) {
        this.f9756a = new Handler(Looper.getMainLooper());
        this.f9757b = ko1;
    }

    public C8165Qj1(C7765Ir1 c7765Ir1) {
        O90.m5968f(c7765Ir1, "storage");
        this.f9756a = c7765Ir1;
        String string = UUID.randomUUID().toString();
        O90.m5967e(string, "randomUUID().toString()");
        this.f9757b = string;
    }
}
