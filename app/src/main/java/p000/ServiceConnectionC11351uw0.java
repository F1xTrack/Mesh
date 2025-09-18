package p000;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.content.pm.ResolveInfo;
import android.content.pm.ServiceInfo;
import android.os.DeadObjectException;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Message;
import android.os.RemoteException;
import android.provider.Settings;
import android.util.Log;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.util.ArrayDeque;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;

/* renamed from: uw0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class ServiceConnectionC11351uw0 implements Handler.Callback, ServiceConnection {

    /* renamed from: a */
    public final Context f44026a;

    /* renamed from: b */
    public final Handler f44027b;

    /* renamed from: c */
    public final HashMap f44028c = new HashMap();

    /* renamed from: d */
    public HashSet f44029d = new HashSet();

    public ServiceConnectionC11351uw0(Context context) {
        this.f44026a = context;
        HandlerThread handlerThread = new HandlerThread("NotificationManagerCompat");
        handlerThread.start();
        this.f44027b = new Handler(handlerThread.getLooper(), this);
    }

    /* renamed from: a */
    public final void m25286a(C11223tw0 c11223tw0) {
        boolean z;
        ArrayDeque arrayDeque;
        boolean zIsLoggable = Log.isLoggable("NotifManCompat", 3);
        ComponentName componentName = c11223tw0.f43422a;
        if (zIsLoggable) {
            Objects.toString(componentName);
            c11223tw0.f43425d.size();
        }
        if (c11223tw0.f43425d.isEmpty()) {
            return;
        }
        if (c11223tw0.f43423b) {
            z = true;
        } else {
            Intent component = new Intent("android.support.BIND_NOTIFICATION_SIDE_CHANNEL").setComponent(componentName);
            Context context = this.f44026a;
            boolean zBindService = context.bindService(component, this, 33);
            c11223tw0.f43423b = zBindService;
            if (zBindService) {
                c11223tw0.f43426e = 0;
            } else {
                Objects.toString(componentName);
                context.unbindService(this);
            }
            z = c11223tw0.f43423b;
        }
        if (!z || c11223tw0.f43424c == null) {
            m25287b(c11223tw0);
            return;
        }
        while (true) {
            arrayDeque = c11223tw0.f43425d;
            C10967rw0 c10967rw0 = (C10967rw0) arrayDeque.peek();
            if (c10967rw0 == null) {
                break;
            }
            try {
                if (Log.isLoggable("NotifManCompat", 3)) {
                    c10967rw0.toString();
                }
                c10967rw0.m24551a(c11223tw0.f43424c);
                arrayDeque.remove();
            } catch (DeadObjectException unused) {
                if (Log.isLoggable("NotifManCompat", 3)) {
                    Objects.toString(componentName);
                }
            } catch (RemoteException unused2) {
                Objects.toString(componentName);
            }
        }
        if (arrayDeque.isEmpty()) {
            return;
        }
        m25287b(c11223tw0);
    }

    /* renamed from: b */
    public final void m25287b(C11223tw0 c11223tw0) {
        Handler handler = this.f44027b;
        ComponentName componentName = c11223tw0.f43422a;
        if (handler.hasMessages(3, componentName)) {
            return;
        }
        int i = c11223tw0.f43426e + 1;
        c11223tw0.f43426e = i;
        if (i <= 6) {
            handler.sendMessageDelayed(handler.obtainMessage(3, componentName), (1 << r3) * 1000);
            return;
        }
        ArrayDeque arrayDeque = c11223tw0.f43425d;
        arrayDeque.size();
        Objects.toString(componentName);
        arrayDeque.clear();
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        HashSet hashSet;
        int i = message.what;
        InterfaceC8936c50 interfaceC8936c50 = null;
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        return false;
                    }
                    C11223tw0 c11223tw0 = (C11223tw0) this.f44028c.get((ComponentName) message.obj);
                    if (c11223tw0 != null) {
                        m25286a(c11223tw0);
                    }
                    return true;
                }
                C11223tw0 c11223tw02 = (C11223tw0) this.f44028c.get((ComponentName) message.obj);
                if (c11223tw02 != null) {
                    if (c11223tw02.f43423b) {
                        this.f44026a.unbindService(this);
                        c11223tw02.f43423b = false;
                    }
                    c11223tw02.f43424c = null;
                }
                return true;
            }
            C11095sw0 c11095sw0 = (C11095sw0) message.obj;
            ComponentName componentName = c11095sw0.f42732a;
            IBinder iBinder = c11095sw0.f42733b;
            C11223tw0 c11223tw03 = (C11223tw0) this.f44028c.get(componentName);
            if (c11223tw03 != null) {
                int i2 = AbstractBinderC8808b50.f16741a;
                if (iBinder != null) {
                    IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface(InterfaceC8936c50.f17294e);
                    if (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof InterfaceC8936c50)) {
                        C8680a50 c8680a50 = new C8680a50();
                        c8680a50.f15305a = iBinder;
                        interfaceC8936c50 = c8680a50;
                    } else {
                        interfaceC8936c50 = (InterfaceC8936c50) iInterfaceQueryLocalInterface;
                    }
                }
                c11223tw03.f43424c = interfaceC8936c50;
                c11223tw03.f43426e = 0;
                m25286a(c11223tw03);
            }
            return true;
        }
        C10967rw0 c10967rw0 = (C10967rw0) message.obj;
        String string = Settings.Secure.getString(this.f44026a.getContentResolver(), "enabled_notification_listeners");
        synchronized (C11479vw0.f44607c) {
            if (string != null) {
                try {
                    if (!string.equals(C11479vw0.f44608d)) {
                        String[] strArrSplit = string.split(StringUtils.PROCESS_POSTFIX_DELIMITER, -1);
                        HashSet hashSet2 = new HashSet(strArrSplit.length);
                        for (String str : strArrSplit) {
                            ComponentName componentNameUnflattenFromString = ComponentName.unflattenFromString(str);
                            if (componentNameUnflattenFromString != null) {
                                hashSet2.add(componentNameUnflattenFromString.getPackageName());
                            }
                        }
                        C11479vw0.f44609e = hashSet2;
                        C11479vw0.f44608d = string;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            hashSet = C11479vw0.f44609e;
        }
        if (!hashSet.equals(this.f44029d)) {
            this.f44029d = hashSet;
            List<ResolveInfo> listQueryIntentServices = this.f44026a.getPackageManager().queryIntentServices(new Intent().setAction("android.support.BIND_NOTIFICATION_SIDE_CHANNEL"), 0);
            HashSet hashSet3 = new HashSet();
            for (ResolveInfo resolveInfo : listQueryIntentServices) {
                if (hashSet.contains(resolveInfo.serviceInfo.packageName)) {
                    ServiceInfo serviceInfo = resolveInfo.serviceInfo;
                    ComponentName componentName2 = new ComponentName(serviceInfo.packageName, serviceInfo.name);
                    if (resolveInfo.serviceInfo.permission != null) {
                        componentName2.toString();
                    } else {
                        hashSet3.add(componentName2);
                    }
                }
            }
            Iterator it = hashSet3.iterator();
            while (it.hasNext()) {
                ComponentName componentName3 = (ComponentName) it.next();
                if (!this.f44028c.containsKey(componentName3)) {
                    if (Log.isLoggable("NotifManCompat", 3)) {
                        Objects.toString(componentName3);
                    }
                    this.f44028c.put(componentName3, new C11223tw0(componentName3));
                }
            }
            Iterator it2 = this.f44028c.entrySet().iterator();
            while (it2.hasNext()) {
                Map.Entry entry = (Map.Entry) it2.next();
                if (!hashSet3.contains(entry.getKey())) {
                    if (Log.isLoggable("NotifManCompat", 3)) {
                        Objects.toString(entry.getKey());
                    }
                    C11223tw0 c11223tw04 = (C11223tw0) entry.getValue();
                    if (c11223tw04.f43423b) {
                        this.f44026a.unbindService(this);
                        c11223tw04.f43423b = false;
                    }
                    c11223tw04.f43424c = null;
                    it2.remove();
                }
            }
        }
        for (C11223tw0 c11223tw05 : this.f44028c.values()) {
            c11223tw05.f43425d.add(c10967rw0);
            m25286a(c11223tw05);
        }
        return true;
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        if (Log.isLoggable("NotifManCompat", 3)) {
            Objects.toString(componentName);
        }
        this.f44027b.obtainMessage(1, new C11095sw0(componentName, iBinder)).sendToTarget();
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        if (Log.isLoggable("NotifManCompat", 3)) {
            Objects.toString(componentName);
        }
        this.f44027b.obtainMessage(2, componentName).sendToTarget();
    }
}
