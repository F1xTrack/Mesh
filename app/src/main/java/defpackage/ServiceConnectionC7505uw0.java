package defpackage;

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
public final class ServiceConnectionC7505uw0 implements Handler.Callback, ServiceConnection {
    public final Context a;
    public final Handler b;
    public final HashMap c = new HashMap();
    public HashSet d = new HashSet();

    public ServiceConnectionC7505uw0(Context context) {
        this.a = context;
        HandlerThread handlerThread = new HandlerThread("NotificationManagerCompat");
        handlerThread.start();
        this.b = new Handler(handlerThread.getLooper(), this);
    }

    public final void a(C7314tw0 c7314tw0) {
        boolean z;
        ArrayDeque arrayDeque;
        boolean zIsLoggable = Log.isLoggable("NotifManCompat", 3);
        ComponentName componentName = c7314tw0.a;
        if (zIsLoggable) {
            Objects.toString(componentName);
            c7314tw0.d.size();
        }
        if (c7314tw0.d.isEmpty()) {
            return;
        }
        if (c7314tw0.b) {
            z = true;
        } else {
            Intent component = new Intent("android.support.BIND_NOTIFICATION_SIDE_CHANNEL").setComponent(componentName);
            Context context = this.a;
            boolean zBindService = context.bindService(component, this, 33);
            c7314tw0.b = zBindService;
            if (zBindService) {
                c7314tw0.e = 0;
            } else {
                Objects.toString(componentName);
                context.unbindService(this);
            }
            z = c7314tw0.b;
        }
        if (!z || c7314tw0.c == null) {
            b(c7314tw0);
            return;
        }
        while (true) {
            arrayDeque = c7314tw0.d;
            C6932rw0 c6932rw0 = (C6932rw0) arrayDeque.peek();
            if (c6932rw0 == null) {
                break;
            }
            try {
                if (Log.isLoggable("NotifManCompat", 3)) {
                    c6932rw0.toString();
                }
                c6932rw0.a(c7314tw0.c);
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
        b(c7314tw0);
    }

    public final void b(C7314tw0 c7314tw0) {
        Handler handler = this.b;
        ComponentName componentName = c7314tw0.a;
        if (handler.hasMessages(3, componentName)) {
            return;
        }
        int i = c7314tw0.e + 1;
        c7314tw0.e = i;
        if (i <= 6) {
            handler.sendMessageDelayed(handler.obtainMessage(3, componentName), (1 << r3) * 1000);
            return;
        }
        ArrayDeque arrayDeque = c7314tw0.d;
        arrayDeque.size();
        Objects.toString(componentName);
        arrayDeque.clear();
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        HashSet hashSet;
        int i = message.what;
        InterfaceC2449c50 interfaceC2449c50 = null;
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        return false;
                    }
                    C7314tw0 c7314tw0 = (C7314tw0) this.c.get((ComponentName) message.obj);
                    if (c7314tw0 != null) {
                        a(c7314tw0);
                    }
                    return true;
                }
                C7314tw0 c7314tw02 = (C7314tw0) this.c.get((ComponentName) message.obj);
                if (c7314tw02 != null) {
                    if (c7314tw02.b) {
                        this.a.unbindService(this);
                        c7314tw02.b = false;
                    }
                    c7314tw02.c = null;
                }
                return true;
            }
            C7123sw0 c7123sw0 = (C7123sw0) message.obj;
            ComponentName componentName = c7123sw0.a;
            IBinder iBinder = c7123sw0.b;
            C7314tw0 c7314tw03 = (C7314tw0) this.c.get(componentName);
            if (c7314tw03 != null) {
                int i2 = AbstractBinderC2259b50.a;
                if (iBinder != null) {
                    IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface(InterfaceC2449c50.e);
                    if (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof InterfaceC2449c50)) {
                        C2068a50 c2068a50 = new C2068a50();
                        c2068a50.a = iBinder;
                        interfaceC2449c50 = c2068a50;
                    } else {
                        interfaceC2449c50 = (InterfaceC2449c50) iInterfaceQueryLocalInterface;
                    }
                }
                c7314tw03.c = interfaceC2449c50;
                c7314tw03.e = 0;
                a(c7314tw03);
            }
            return true;
        }
        C6932rw0 c6932rw0 = (C6932rw0) message.obj;
        String string = Settings.Secure.getString(this.a.getContentResolver(), "enabled_notification_listeners");
        synchronized (C7696vw0.c) {
            if (string != null) {
                try {
                    if (!string.equals(C7696vw0.d)) {
                        String[] strArrSplit = string.split(StringUtils.PROCESS_POSTFIX_DELIMITER, -1);
                        HashSet hashSet2 = new HashSet(strArrSplit.length);
                        for (String str : strArrSplit) {
                            ComponentName componentNameUnflattenFromString = ComponentName.unflattenFromString(str);
                            if (componentNameUnflattenFromString != null) {
                                hashSet2.add(componentNameUnflattenFromString.getPackageName());
                            }
                        }
                        C7696vw0.e = hashSet2;
                        C7696vw0.d = string;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            hashSet = C7696vw0.e;
        }
        if (!hashSet.equals(this.d)) {
            this.d = hashSet;
            List<ResolveInfo> listQueryIntentServices = this.a.getPackageManager().queryIntentServices(new Intent().setAction("android.support.BIND_NOTIFICATION_SIDE_CHANNEL"), 0);
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
                if (!this.c.containsKey(componentName3)) {
                    if (Log.isLoggable("NotifManCompat", 3)) {
                        Objects.toString(componentName3);
                    }
                    this.c.put(componentName3, new C7314tw0(componentName3));
                }
            }
            Iterator it2 = this.c.entrySet().iterator();
            while (it2.hasNext()) {
                Map.Entry entry = (Map.Entry) it2.next();
                if (!hashSet3.contains(entry.getKey())) {
                    if (Log.isLoggable("NotifManCompat", 3)) {
                        Objects.toString(entry.getKey());
                    }
                    C7314tw0 c7314tw04 = (C7314tw0) entry.getValue();
                    if (c7314tw04.b) {
                        this.a.unbindService(this);
                        c7314tw04.b = false;
                    }
                    c7314tw04.c = null;
                    it2.remove();
                }
            }
        }
        for (C7314tw0 c7314tw05 : this.c.values()) {
            c7314tw05.d.add(c6932rw0);
            a(c7314tw05);
        }
        return true;
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        if (Log.isLoggable("NotifManCompat", 3)) {
            Objects.toString(componentName);
        }
        this.b.obtainMessage(1, new C7123sw0(componentName, iBinder)).sendToTarget();
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        if (Log.isLoggable("NotifManCompat", 3)) {
            Objects.toString(componentName);
        }
        this.b.obtainMessage(2, componentName).sendToTarget();
    }
}
