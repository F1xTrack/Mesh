package com.yandex.metrica.impl.ob;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.content.pm.ResolveInfo;
import android.content.pm.ServiceInfo;
import android.os.IBinder;
import android.text.TextUtils;

/* loaded from: classes2.dex */
public class M6 {
    private Context a;
    private ServiceConnection b;

    public class a implements ServiceConnection {
        @Override // android.content.ServiceConnection
        public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        }

        @Override // android.content.ServiceConnection
        public void onServiceDisconnected(ComponentName componentName) {
        }
    }

    public M6(Context context) {
        this(context, new a());
    }

    public void a(String str) {
        Intent action;
        ResolveInfo resolveInfoResolveService;
        if (TextUtils.isEmpty(str)) {
            return;
        }
        Context context = this.a;
        try {
            resolveInfoResolveService = context.getPackageManager().resolveService(H2.a(context).setPackage(str), 0);
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
            this.a.bindService(action, this.b, 1);
        }
    }

    public M6(Context context, ServiceConnection serviceConnection) {
        this.a = context;
        this.b = serviceConnection;
    }

    public void a() {
        this.a.unbindService(this.b);
    }
}
