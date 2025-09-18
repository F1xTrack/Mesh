package p000;

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
public final class ServiceConnectionC10916rW1 implements ServiceConnection, BaseGmsClient.BaseConnectionCallbacks, BaseGmsClient.BaseOnConnectionFailedListener {

    /* renamed from: a */
    public volatile boolean f41717a;

    /* renamed from: b */
    public volatile LL1 f41718b;

    /* renamed from: c */
    public final /* synthetic */ C8989cV1 f41719c;

    public ServiceConnectionC10916rW1(C8989cV1 c8989cV1) {
        this.f41719c = c8989cV1;
    }

    /* renamed from: a */
    public final void m24397a(Intent intent) {
        this.f41719c.mo7681v1();
        Context context = ((C9110dP1) this.f41719c.f11615b).f26031a;
        ConnectionTracker connectionTracker = ConnectionTracker.getInstance();
        synchronized (this) {
            try {
                if (this.f41717a) {
                    this.f41719c.mo6070n().f8386o.m24555d("Connection attempt already in progress");
                    return;
                }
                this.f41719c.mo6070n().f8386o.m24555d("Using local app measurement service");
                this.f41717a = true;
                connectionTracker.bindService(context, intent, this.f41719c.f17573d, 129);
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
                Preconditions.checkNotNull(this.f41718b);
                this.f41719c.mo6071p0().m25412E1(new RunnableC11676xT1(this, 5, (MJ1) this.f41718b.getService()));
            } catch (DeadObjectException | IllegalStateException unused) {
                this.f41718b = null;
                this.f41717a = false;
            }
        }
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient.BaseOnConnectionFailedListener
    public final void onConnectionFailed(ConnectionResult connectionResult) {
        Preconditions.checkMainThread("MeasurementServiceConnection.onConnectionFailed");
        OL1 ol1 = ((C9110dP1) this.f41719c.f11615b).f26039i;
        if (ol1 == null || !ol1.f10765c) {
            ol1 = null;
        }
        if (ol1 != null) {
            ol1.f8381j.m24554c(connectionResult, "Service connection failed");
        }
        synchronized (this) {
            this.f41717a = false;
            this.f41718b = null;
        }
        this.f41719c.mo6071p0().m25412E1(new RunnableC11428vW1(this, 0));
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient.BaseConnectionCallbacks
    public final void onConnectionSuspended(int i) {
        Preconditions.checkMainThread("MeasurementServiceConnection.onConnectionSuspended");
        C8989cV1 c8989cV1 = this.f41719c;
        c8989cV1.mo6070n().f8385n.m24555d("Service connection suspended");
        c8989cV1.mo6071p0().m25412E1(new RunnableC11428vW1(this, 1));
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        Preconditions.checkMainThread("MeasurementServiceConnection.onServiceConnected");
        synchronized (this) {
            if (iBinder == null) {
                this.f41717a = false;
                this.f41719c.mo6070n().f8378g.m24555d("Service connected with null binder");
                return;
            }
            Object c8839bK1 = null;
            try {
                String interfaceDescriptor = iBinder.getInterfaceDescriptor();
                if ("com.google.android.gms.measurement.internal.IMeasurementService".equals(interfaceDescriptor)) {
                    IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.measurement.internal.IMeasurementService");
                    c8839bK1 = iInterfaceQueryLocalInterface instanceof MJ1 ? (MJ1) iInterfaceQueryLocalInterface : new C8839bK1(iBinder);
                    this.f41719c.mo6070n().f8386o.m24555d("Bound to IMeasurementService interface");
                } else {
                    this.f41719c.mo6070n().f8378g.m24554c(interfaceDescriptor, "Got binder with a wrong descriptor");
                }
            } catch (RemoteException unused) {
                this.f41719c.mo6070n().f8378g.m24555d("Service connect failed to get IMeasurementService");
            }
            if (c8839bK1 == null) {
                this.f41717a = false;
                try {
                    ConnectionTracker connectionTracker = ConnectionTracker.getInstance();
                    C8989cV1 c8989cV1 = this.f41719c;
                    connectionTracker.unbindService(((C9110dP1) c8989cV1.f11615b).f26031a, c8989cV1.f17573d);
                } catch (IllegalArgumentException unused2) {
                }
            } else {
                this.f41719c.mo6071p0().m25412E1(new RO1(this, c8839bK1, false, 7));
            }
        }
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        Preconditions.checkMainThread("MeasurementServiceConnection.onServiceDisconnected");
        C8989cV1 c8989cV1 = this.f41719c;
        c8989cV1.mo6070n().f8385n.m24555d("Service disconnected");
        c8989cV1.mo6071p0().m25412E1(new RO1(this, componentName, false, 8));
    }
}
