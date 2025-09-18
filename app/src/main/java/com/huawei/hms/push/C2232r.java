package com.huawei.hms.push;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Message;
import android.os.Messenger;
import android.os.RemoteException;
import com.huawei.hms.support.log.HMSLog;

/* renamed from: com.huawei.hms.push.r */
/* loaded from: classes.dex */
public class C2232r {

    /* renamed from: a */
    private ServiceConnection f19465a;

    /* renamed from: b */
    private Messenger f19466b = null;

    /* renamed from: com.huawei.hms.push.r$a */
    public class a implements ServiceConnection {

        /* renamed from: a */
        final /* synthetic */ Bundle f19467a;

        /* renamed from: b */
        final /* synthetic */ Context f19468b;

        public a(Bundle bundle, Context context) {
            this.f19467a = bundle;
            this.f19468b = context;
        }

        @Override // android.content.ServiceConnection
        public void onServiceConnected(ComponentName componentName, IBinder iBinder) throws RemoteException {
            HMSLog.m12622i("RemoteService", "remote service onConnected");
            C2232r.this.f19466b = new Messenger(iBinder);
            Message messageObtain = Message.obtain();
            messageObtain.setData(this.f19467a);
            try {
                C2232r.this.f19466b.send(messageObtain);
            } catch (RemoteException unused) {
                HMSLog.m12622i("RemoteService", "remote service message send failed");
            }
            HMSLog.m12622i("RemoteService", "remote service unbindservice");
            this.f19468b.unbindService(C2232r.this.f19465a);
        }

        @Override // android.content.ServiceConnection
        public void onServiceDisconnected(ComponentName componentName) {
            HMSLog.m12622i("RemoteService", "remote service onDisconnected");
            C2232r.this.f19466b = null;
        }
    }

    /* renamed from: a */
    public boolean m12519a(Context context, Bundle bundle, Intent intent) {
        Context applicationContext = context.getApplicationContext();
        this.f19465a = new a(bundle, applicationContext);
        HMSLog.m12622i("RemoteService", "remote service bind service start");
        return applicationContext.bindService(intent, this.f19465a, 1);
    }
}
