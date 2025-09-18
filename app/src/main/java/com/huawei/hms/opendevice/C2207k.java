package com.huawei.hms.opendevice;

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

/* renamed from: com.huawei.hms.opendevice.k */
/* loaded from: classes.dex */
public class C2207k {

    /* renamed from: a */
    private ServiceConnection f19340a;

    /* renamed from: b */
    private Messenger f19341b = null;

    /* renamed from: com.huawei.hms.opendevice.k$a */
    public class a implements ServiceConnection {

        /* renamed from: a */
        final /* synthetic */ Bundle f19342a;

        /* renamed from: b */
        final /* synthetic */ Context f19343b;

        public a(Bundle bundle, Context context) {
            this.f19342a = bundle;
            this.f19343b = context;
        }

        @Override // android.content.ServiceConnection
        public void onServiceConnected(ComponentName componentName, IBinder iBinder) throws RemoteException {
            HMSLog.m12622i("RemoteService", "remote service onConnected");
            C2207k.this.f19341b = new Messenger(iBinder);
            Message messageObtain = Message.obtain();
            messageObtain.setData(this.f19342a);
            try {
                C2207k.this.f19341b.send(messageObtain);
            } catch (RemoteException unused) {
                HMSLog.m12622i("RemoteService", "remote service message send failed");
            }
            HMSLog.m12622i("RemoteService", "remote service unbindservice");
            this.f19343b.unbindService(C2207k.this.f19340a);
        }

        @Override // android.content.ServiceConnection
        public void onServiceDisconnected(ComponentName componentName) {
            HMSLog.m12622i("RemoteService", "remote service onDisconnected");
            C2207k.this.f19341b = null;
        }
    }

    /* renamed from: a */
    public boolean m12366a(Context context, Bundle bundle, Intent intent) {
        Context applicationContext = context.getApplicationContext();
        this.f19340a = new a(bundle, applicationContext);
        HMSLog.m12622i("RemoteService", "remote service bind service start");
        return applicationContext.bindService(intent, this.f19340a, 1);
    }
}
