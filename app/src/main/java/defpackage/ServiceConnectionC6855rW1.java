package defpackage;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Bundle;
import android.os.DeadObjectException;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.internal.BaseGmsClient;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.stats.ConnectionTracker;

/* renamed from: rW1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class ServiceConnectionC6855rW1 implements ServiceConnection, BaseGmsClient.BaseConnectionCallbacks, BaseGmsClient.BaseOnConnectionFailedListener {
    public volatile boolean a;
    public volatile LL1 b;
    public final /* synthetic */ C2528cV1 c;

    public ServiceConnectionC6855rW1(C2528cV1 c2528cV1) {
        this.c = c2528cV1;
    }

    public final void a(Intent intent) {
        this.c.v1();
        Context context = ((C3386dP1) this.c.b).a;
        ConnectionTracker connectionTracker = ConnectionTracker.getInstance();
        synchronized (this) {
            try {
                if (this.a) {
                    this.c.n().o.d("Connection attempt already in progress");
                    return;
                }
                this.c.n().o.d("Using local app measurement service");
                this.a = true;
                connectionTracker.bindService(context, intent, this.c.d, 129);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient.BaseConnectionCallbacks
    public final void onConnected(Bundle bundle) {
        Preconditions.checkMainThread("MeasurementServiceConnection.onConnected");
        synchronized (this) {
            try {
                Preconditions.checkNotNull(this.b);
                this.c.p0().E1(new RunnableC7990xT1(this, 5, (MJ1) this.b.getService()));
            } catch (DeadObjectException | IllegalStateException unused) {
                this.b = null;
                this.a = false;
            }
        }
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient.BaseOnConnectionFailedListener
    public final void onConnectionFailed(ConnectionResult connectionResult) {
        Preconditions.checkMainThread("MeasurementServiceConnection.onConnectionFailed");
        OL1 ol1 = ((C3386dP1) this.c.b).i;
        if (ol1 == null || !ol1.c) {
            ol1 = null;
        }
        if (ol1 != null) {
            ol1.j.c(connectionResult, "Service connection failed");
        }
        synchronized (this) {
            this.a = false;
            this.b = null;
        }
        this.c.p0().E1(new RunnableC7619vW1(this, 0));
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient.BaseConnectionCallbacks
    public final void onConnectionSuspended(int i) {
        Preconditions.checkMainThread("MeasurementServiceConnection.onConnectionSuspended");
        C2528cV1 c2528cV1 = this.c;
        c2528cV1.n().n.d("Service connection suspended");
        c2528cV1.p0().E1(new RunnableC7619vW1(this, 1));
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        Preconditions.checkMainThread("MeasurementServiceConnection.onServiceConnected");
        synchronized (this) {
            if (iBinder == null) {
                this.a = false;
                this.c.n().g.d("Service connected with null binder");
                return;
            }
            Object c2305bK1 = null;
            try {
                String interfaceDescriptor = iBinder.getInterfaceDescriptor();
                if ("com.google.android.gms.measurement.internal.IMeasurementService".equals(interfaceDescriptor)) {
                    IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.measurement.internal.IMeasurementService");
                    c2305bK1 = iInterfaceQueryLocalInterface instanceof MJ1 ? (MJ1) iInterfaceQueryLocalInterface : new C2305bK1(iBinder);
                    this.c.n().o.d("Bound to IMeasurementService interface");
                } else {
                    this.c.n().g.c(interfaceDescriptor, "Got binder with a wrong descriptor");
                }
            } catch (RemoteException unused) {
                this.c.n().g.d("Service connect failed to get IMeasurementService");
            }
            if (c2305bK1 == null) {
                this.a = false;
                try {
                    ConnectionTracker connectionTracker = ConnectionTracker.getInstance();
                    C2528cV1 c2528cV1 = this.c;
                    connectionTracker.unbindService(((C3386dP1) c2528cV1.b).a, c2528cV1.d);
                } catch (IllegalArgumentException unused2) {
                }
            } else {
                this.c.p0().E1(new RO1(this, c2305bK1, false, 7));
            }
        }
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        Preconditions.checkMainThread("MeasurementServiceConnection.onServiceDisconnected");
        C2528cV1 c2528cV1 = this.c;
        c2528cV1.n().n.d("Service disconnected");
        c2528cV1.p0().E1(new RO1(this, componentName, false, 8));
    }
}
