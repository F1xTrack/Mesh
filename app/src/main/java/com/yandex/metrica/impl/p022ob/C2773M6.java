package com.yandex.metrica.impl.p022ob;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.content.pm.ResolveInfo;
import android.content.pm.ServiceInfo;
import android.os.IBinder;
import android.text.TextUtils;

/* renamed from: com.yandex.metrica.impl.ob.M6 */
/* loaded from: classes2.dex */
public class C2773M6 {

    /* renamed from: a */
    private Context f21705a;

    /* renamed from: b */
    private ServiceConnection f21706b;

    /* renamed from: com.yandex.metrica.impl.ob.M6$a */
    public class a implements ServiceConnection {
        @Override // android.content.ServiceConnection
        public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        }

        @Override // android.content.ServiceConnection
        public void onServiceDisconnected(ComponentName componentName) {
        }
    }

    public C2773M6(Context context) {
        this(context, new a());
    }

    /* renamed from: a */
    public void m14603a(String str) {
        Intent action;
        ResolveInfo resolveInfoResolveService;
        if (TextUtils.isEmpty(str)) {
            return;
        }
        Context context = this.f21705a;
        try {
            resolveInfoResolveService = context.getPackageManager().resolveService(C2644H2.m14216a(context).setPackage(str), 0);
        } catch (Throwable unused) {
        }
        if (resolveInfoResolveService != null) {
            Intent intent = new Intent();
            ServiceInfo serviceInfo = resolveInfoResolveService.serviceInfo;
            action = intent.setClassName(serviceInfo.packageName, serviceInfo.name).setAction("com.yandex.metrica.ACTION_C_BG_L");
        } else {
            action = null;
        }
        if (action != null) {
            this.f21705a.bindService(action, this.f21706b, 1);
        }
    }

    public C2773M6(Context context, ServiceConnection serviceConnection) {
        this.f21705a = context;
        this.f21706b = serviceConnection;
    }

    /* renamed from: a */
    public void m14602a() {
        this.f21705a.unbindService(this.f21706b);
    }
}
