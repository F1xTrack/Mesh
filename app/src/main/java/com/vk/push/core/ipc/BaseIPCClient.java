package com.vk.push.core.ipc;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import com.vk.push.common.AppInfo;
import com.vk.push.common.Logger;
import com.vk.push.core.base.DelayedAction;
import com.vk.push.core.utils.PackageExtenstionsKt;
import defpackage.C1518Tf1;
import defpackage.C1984Zf;
import defpackage.C2178ag;
import defpackage.C2369bg;
import defpackage.C4258i;
import defpackage.C5772lr0;
import defpackage.C7726w5;
import defpackage.D51;
import defpackage.F71;
import defpackage.InterfaceC1729Vy;
import defpackage.InterfaceC1906Yf;
import defpackage.InterfaceC5908mZ;
import defpackage.InterfaceC6099nZ;
import defpackage.LB;
import defpackage.O90;
import defpackage.OS0;
import defpackage.RQ1;
import defpackage.RunnableC6769r4;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Metadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(d1 = {"\u0000n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0017\b&\u0018\u0000 9*\b\b\u0000\u0010\u0002*\u00020\u00012\u00020\u0003:\u0003:;9B[\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\b\b\u0002\u0010\n\u001a\u00020\t\u0012\u001a\b\u0002\u0010\r\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0000\u0012\u0004\u0012\u00020\f0\u000b\u0012\u000e\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u000e\u0012\u0006\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b\u0012\u0010\u0013J\u0017\u0010\u0016\u001a\u00028\u00002\u0006\u0010\u0015\u001a\u00020\u0014H$¢\u0006\u0004\b\u0016\u0010\u0017Ji\u0010\"\u001a\u00028\u0001\"\u0004\b\u0001\u0010\u00182\u0018\u0010\u001a\u001a\u0014\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00028\u00010\u00192\u0006\u0010\u001c\u001a\u00020\u001b2\u0016\u0010\u001f\u001a\u0012\u0012\b\u0012\u00060\u001dj\u0002`\u001e\u0012\u0004\u0012\u00028\u00010\u000b2\u0014\u0010!\u001a\u0010\u0012\u0004\u0012\u00020\u001b\u0012\u0006\u0012\u0004\u0018\u00010 0\u000bH\u0084@ø\u0001\u0000¢\u0006\u0004\b\"\u0010#J\u0091\u0001\u0010(\u001a\u00028\u0001\"\u0004\b\u0001\u0010\u00182\u0018\u0010\u001a\u001a\u0014\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020$\u0012\u0004\u0012\u00020\f0\u00192\u0006\u0010\u001c\u001a\u00020\u001b2\u001c\u0010&\u001a\u0018\u0012\b\u0012\u0006\u0012\u0002\b\u00030%\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00028\u00010\u00192\u0016\u0010\u001f\u001a\u0012\u0012\b\u0012\u00060\u001dj\u0002`\u001e\u0012\u0004\u0012\u00028\u00010\u000b2\u0014\u0010!\u001a\u0010\u0012\u0004\u0012\u00020\u001b\u0012\u0006\u0012\u0004\u0018\u00010 0\u000b2\b\b\u0002\u0010'\u001a\u00020\tH\u0086@ø\u0001\u0000¢\u0006\u0004\b(\u0010)R\u001a\u0010\u0005\u001a\u00020\u00048\u0004X\u0084\u0004¢\u0006\f\n\u0004\b*\u0010+\u001a\u0004\b,\u0010-R \u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\u0004X\u0084\u0004¢\u0006\f\n\u0004\b.\u0010/\u001a\u0004\b0\u00101R\u001b\u0010\u0011\u001a\u00020\u00108DX\u0084\u0084\u0002¢\u0006\f\n\u0004\b2\u00103\u001a\u0004\b4\u00105R\u0014\u00108\u001a\u00020\u001b8$X¤\u0004¢\u0006\u0006\u001a\u0004\b6\u00107\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006<"}, d2 = {"Lcom/vk/push/core/ipc/BaseIPCClient;", "Landroid/os/IInterface;", "T", "", "Landroid/content/Context;", "context", "", "Lcom/vk/push/common/AppInfo;", "preferredHosts", "", "closeConnectionTimeoutMillis", "Lkotlin/Function1;", "LTf1;", "onCloseConnection", "Lkotlin/Function0;", "onNoHostsToBind", "Lcom/vk/push/common/Logger;", "logger", "<init>", "(Landroid/content/Context;Ljava/util/List;JLnZ;LmZ;Lcom/vk/push/common/Logger;)V", "Landroid/os/IBinder;", "service", "createInterface", "(Landroid/os/IBinder;)Landroid/os/IInterface;", "V", "Lkotlin/Function2;", "ipcCall", "", "ipcCallName", "Ljava/lang/Exception;", "Lkotlin/Exception;", "transformErrorResult", "Landroid/content/ComponentName;", "componentNameCreator", "makeSimpleRequest", "(Lkotlin/jvm/functions/Function2;Ljava/lang/String;LnZ;LnZ;LVy;)Ljava/lang/Object;", "Lcom/vk/push/core/base/AsyncCallback;", "Lcom/vk/push/core/base/AidlResult;", "transformSuccessResult", "timeoutInMillis", "makeAsyncRequest", "(Lkotlin/jvm/functions/Function2;Ljava/lang/String;Lkotlin/jvm/functions/Function2;LnZ;LnZ;JLVy;)Ljava/lang/Object;", "a", "Landroid/content/Context;", "getContext", "()Landroid/content/Context;", "b", "Ljava/util/List;", "getPreferredHosts", "()Ljava/util/List;", "f", "Lkotlin/Lazy;", "getLogger", "()Lcom/vk/push/common/Logger;", "getLogTag", "()Ljava/lang/String;", "logTag", "Companion", "Yf", "lr0", "core_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
/* loaded from: classes2.dex */
public abstract class BaseIPCClient<T extends IInterface> {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final long DEFAULT_CLOSE_CONNECTION_TIMEOUT_MILLIS = 10000;

    /* renamed from: a, reason: from kotlin metadata */
    public final Context context;

    /* renamed from: b, reason: from kotlin metadata */
    public final List preferredHosts;
    public final long c;
    public final InterfaceC6099nZ d;
    public final InterfaceC5908mZ e;
    public final F71 f;
    public final F71 g;
    public volatile C5772lr0 h;
    public final AtomicBoolean i;
    public final ExecutorService j;
    public final Set k;
    public final BaseIPCClient$connection$1 l;

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0005\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0004R\u0014\u0010\u0006\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0006\u0010\u0004R\u0014\u0010\u0007\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0004¨\u0006\b"}, d2 = {"Lcom/vk/push/core/ipc/BaseIPCClient$Companion;", "", "", "DEFAULT_CLOSE_CONNECTION_TIMEOUT_MILLIS", "J", "DEFAULT_REQUEST_TIMEOUT_IN_MINUTES", "RECONNECTION_TIMEOUT", "THREAD_POOL_KEEP_ALIVE", "core_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
    public static final class Companion {
        public Companion(DefaultConstructorMarker defaultConstructorMarker) {
        }
    }

    /* JADX WARN: Type inference failed for: r8v20, types: [com.vk.push.core.ipc.BaseIPCClient$connection$1] */
    public BaseIPCClient(Context context, List<AppInfo> list, long j, InterfaceC6099nZ interfaceC6099nZ, InterfaceC5908mZ interfaceC5908mZ, final Logger logger) {
        O90.f(context, "context");
        O90.f(list, "preferredHosts");
        O90.f(interfaceC6099nZ, "onCloseConnection");
        O90.f(logger, "logger");
        this.context = context;
        this.preferredHosts = list;
        this.c = j;
        this.d = interfaceC6099nZ;
        this.e = interfaceC5908mZ;
        if (list.isEmpty()) {
            throw new IllegalArgumentException("Preferred hosts must not be empty");
        }
        HashSet hashSet = new HashSet();
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (hashSet.add(((AppInfo) obj).getPackageName())) {
                arrayList.add(obj);
            }
        }
        if (arrayList.size() != this.preferredHosts.size()) {
            throw new IllegalArgumentException("Found duplicate package names in preferred hosts");
        }
        if (this.c < 0) {
            throw new IllegalArgumentException("closeConnectionTimeoutMillis must be >= 0");
        }
        this.f = LB.b(new C7726w5(logger, 1, this));
        this.g = LB.b(new C1984Zf(this, 1));
        this.i = new AtomicBoolean(false);
        ExecutorService executorServiceUnconfigurableExecutorService = Executors.unconfigurableExecutorService(new ThreadPoolExecutor(0, 1, 60L, TimeUnit.SECONDS, new LinkedBlockingQueue()));
        O90.e(executorServiceUnconfigurableExecutorService, "unconfigurableExecutorService(threadPool)");
        this.j = executorServiceUnconfigurableExecutorService;
        this.k = Collections.synchronizedSet(new LinkedHashSet());
        this.l = new ServiceConnection() { // from class: com.vk.push.core.ipc.BaseIPCClient$connection$1
            @Override // android.content.ServiceConnection
            public void onBindingDied(ComponentName name) {
                O90.f(name, "name");
                BaseIPCClient.access$handleOnBindingDied(this.a, name);
            }

            @Override // android.content.ServiceConnection
            public void onNullBinding(ComponentName name) {
                O90.f(name, "name");
                Logger.DefaultImpls.warn$default(logger, "Null binding from " + name.getPackageName(), null, 2, null);
            }

            @Override // android.content.ServiceConnection
            public void onServiceConnected(ComponentName name, IBinder service) {
                O90.f(name, "name");
                O90.f(service, "service");
                BaseIPCClient baseIPCClient = this.a;
                baseIPCClient.i.set(true);
                BaseIPCClient.access$handleOnServiceConnected(baseIPCClient, name, service);
            }

            @Override // android.content.ServiceConnection
            public void onServiceDisconnected(ComponentName name) {
                O90.f(name, "name");
                BaseIPCClient.access$handleOnServiceDisconnected(this.a, name);
            }
        };
    }

    public static final void access$executeWhenConnected(BaseIPCClient baseIPCClient, IpcRequest ipcRequest, InterfaceC6099nZ interfaceC6099nZ) {
        NoHostsToBindException unknownBindingException;
        ComponentName componentName;
        C5772lr0 c5772lr0 = baseIPCClient.h;
        IInterface iInterface = c5772lr0 != null ? (IInterface) c5772lr0.d : null;
        C5772lr0 c5772lr02 = baseIPCClient.h;
        AppInfo appInfo = c5772lr02 != null ? (AppInfo) c5772lr02.b : null;
        if (iInterface != null && appInfo != null) {
            try {
                baseIPCClient.k.add(ipcRequest);
                ipcRequest.execute(iInterface, appInfo, new C2178ag(baseIPCClient, 0));
                return;
            } catch (RemoteException e) {
                baseIPCClient.getLogger().warn("RemoteException while executing request", e);
                return;
            }
        }
        NoHostsToBindException noHostsToBindException = null;
        for (AppInfo appInfo2 : baseIPCClient.preferredHosts) {
            try {
                componentName = (ComponentName) interfaceC6099nZ.invoke(appInfo2.getPackageName());
            } catch (SecurityException e2) {
                baseIPCClient.getLogger().error("No permission to bind to " + appInfo2.getPackageName(), e2);
                noHostsToBindException = new SecurityBindingException();
            } catch (Exception e3) {
                baseIPCClient.getLogger().error("Unable to bind service", e3);
                unknownBindingException = new UnknownBindingException(e3);
            }
            if (componentName == null) {
                Logger.DefaultImpls.warn$default(baseIPCClient.getLogger(), "Component name from host " + appInfo2.getPackageName() + " is null", null, 2, null);
                unknownBindingException = new ComponentCreationFailedException();
                noHostsToBindException = unknownBindingException;
            } else {
                InterfaceC1906Yf interfaceC1906YfE = baseIPCClient.e(appInfo2, componentName, ipcRequest);
                if (O90.a(interfaceC1906YfE, BaseIPCClient$BindingResult$Ok.INSTANCE)) {
                    return;
                } else {
                    noHostsToBindException = h(interfaceC1906YfE);
                }
            }
        }
        Logger.DefaultImpls.error$default(baseIPCClient.getLogger(), "No available hosts found. Binding has failed, giving up.", null, 2, null);
        if (noHostsToBindException == null) {
            noHostsToBindException = new NoHostsToBindException();
        }
        ipcRequest.onError(noHostsToBindException);
        InterfaceC5908mZ interfaceC5908mZ = baseIPCClient.e;
        if (interfaceC5908mZ != null) {
            interfaceC5908mZ.invoke();
        }
    }

    public static final void access$handleOnBindingDied(BaseIPCClient baseIPCClient, ComponentName componentName) {
        Logger.DefaultImpls.warn$default(baseIPCClient.getLogger(), "Binding to " + componentName.getPackageName() + " has died", null, 2, null);
        baseIPCClient.i();
        C5772lr0 c5772lr0 = baseIPCClient.h;
        if (c5772lr0 != null) {
            baseIPCClient.j.submit(new RunnableC6769r4(baseIPCClient, 14, c5772lr0));
        }
    }

    public static final void access$handleOnServiceConnected(BaseIPCClient baseIPCClient, ComponentName componentName, IBinder iBinder) {
        Object next;
        Logger.DefaultImpls.info$default(baseIPCClient.getLogger(), "On service connected! Remote host package name = " + componentName.getPackageName(), null, 2, null);
        Iterator it = baseIPCClient.preferredHosts.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            } else {
                next = it.next();
                if (D51.j(((AppInfo) next).getPackageName(), componentName.getPackageName())) {
                    break;
                }
            }
        }
        AppInfo appInfo = (AppInfo) next;
        if (appInfo == null) {
            Logger.DefaultImpls.error$default(baseIPCClient.getLogger(), "onServiceConnected: host is null", null, 2, null);
            return;
        }
        IInterface iInterfaceCreateInterface = baseIPCClient.createInterface(iBinder);
        baseIPCClient.h = new C5772lr0(appInfo, componentName, iInterfaceCreateInterface);
        Logger.DefaultImpls.info$default(baseIPCClient.getLogger(), "Service connection to " + componentName.getPackageName() + " has been established", null, 2, null);
        C2369bg c2369bg = new C2369bg(baseIPCClient, iInterfaceCreateInterface, appInfo, 0);
        Set set = baseIPCClient.k;
        O90.e(set, "runningRequests");
        if (set.isEmpty()) {
            return;
        }
        baseIPCClient.j.submit(new RunnableC6769r4(baseIPCClient, c2369bg));
    }

    public static final void access$handleOnServiceDisconnected(BaseIPCClient baseIPCClient, ComponentName componentName) {
        Logger.DefaultImpls.info$default(baseIPCClient.getLogger(), "Service has been disconnected, host: " + componentName.getPackageName(), null, 2, null);
        C5772lr0 c5772lr0 = baseIPCClient.h;
        baseIPCClient.h = c5772lr0 != null ? new C5772lr0((AppInfo) c5772lr0.b, (ComponentName) c5772lr0.c, (IInterface) null) : null;
    }

    public static NoHostsToBindException h(InterfaceC1906Yf interfaceC1906Yf) {
        if (O90.a(interfaceC1906Yf, BaseIPCClient$BindingResult$InvalidSignature.INSTANCE)) {
            return new InvalidSignatureException();
        }
        if (O90.a(interfaceC1906Yf, BaseIPCClient$BindingResult$BindServiceFailed.INSTANCE)) {
            return new BindingFailedException();
        }
        return null;
    }

    public static /* synthetic */ Object makeAsyncRequest$default(BaseIPCClient baseIPCClient, Function2 function2, String str, Function2 function22, InterfaceC6099nZ interfaceC6099nZ, InterfaceC6099nZ interfaceC6099nZ2, long j, InterfaceC1729Vy interfaceC1729Vy, int i, Object obj) {
        if (obj == null) {
            return baseIPCClient.makeAsyncRequest(function2, str, function22, interfaceC6099nZ, interfaceC6099nZ2, (i & 32) != 0 ? TimeUnit.MINUTES.toMillis(3L) : j, interfaceC1729Vy);
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: makeAsyncRequest");
    }

    public List a() {
        return getPreferredHosts();
    }

    public abstract T createInterface(IBinder service);

    public final InterfaceC1906Yf d(AppInfo appInfo, ComponentName componentName) throws NoSuchAlgorithmException {
        boolean zValidateCallingPackage;
        String packageName = appInfo.getPackageName();
        Context context = this.context;
        if (O90.a(packageName, context.getPackageName())) {
            zValidateCallingPackage = true;
        } else {
            zValidateCallingPackage = PackageExtenstionsKt.validateCallingPackage(context, appInfo.getPubKey(), appInfo.getPackageName());
            if (!zValidateCallingPackage) {
                Logger.DefaultImpls.error$default(getLogger(), "Signature validation for " + appInfo.getPackageName() + " has failed", null, 2, null);
            }
        }
        if (!zValidateCallingPackage) {
            return BaseIPCClient$BindingResult$InvalidSignature.INSTANCE;
        }
        Intent intent = new Intent();
        intent.setComponent(componentName);
        return context.bindService(intent, this.l, 1) ? BaseIPCClient$BindingResult$Ok.INSTANCE : BaseIPCClient$BindingResult$BindServiceFailed.INSTANCE;
    }

    public final InterfaceC1906Yf e(AppInfo appInfo, ComponentName componentName, IpcRequest ipcRequest) throws NoSuchAlgorithmException {
        InterfaceC1906Yf interfaceC1906YfD = d(appInfo, componentName);
        if (O90.a(interfaceC1906YfD, BaseIPCClient$BindingResult$Ok.INSTANCE)) {
            Logger.DefaultImpls.info$default(getLogger(), "bindService to " + appInfo.getPackageName() + " via " + ipcRequest.getIpcCallName() + " function returns true, waiting for connection establishment", null, 2, null);
            this.k.add(ipcRequest);
            C5772lr0 c5772lr0 = this.h;
            IInterface iInterface = c5772lr0 != null ? (IInterface) c5772lr0.d : null;
            if (iInterface != null) {
                Logger.DefaultImpls.info$default(getLogger(), "bindService to " + appInfo.getPackageName() + " via " + ipcRequest.getIpcCallName() + ", remoteService already exists", null, 2, null);
                C2369bg c2369bg = new C2369bg(this, iInterface, appInfo, 0);
                Set set = this.k;
                O90.e(set, "runningRequests");
                if (!set.isEmpty()) {
                    this.j.submit(new RunnableC6769r4(this, c2369bg));
                }
            } else {
                this.h = new C5772lr0(appInfo, componentName, (IInterface) null);
            }
        } else {
            Logger.DefaultImpls.info$default(getLogger(), "Unable to bind to " + appInfo.getPackageName() + ", trying next host", null, 2, null);
        }
        return interfaceC1906YfD;
    }

    public final void f() {
        ((DelayedAction) this.g.getValue()).runWithDelay(this.c);
    }

    public final boolean g() {
        Object objI = i();
        C5772lr0 c5772lr0 = this.h;
        this.h = c5772lr0 != null ? new C5772lr0((AppInfo) c5772lr0.b, (ComponentName) c5772lr0.c, (IInterface) null) : null;
        Logger logger = getLogger();
        StringBuilder sb = new StringBuilder("Service connection is released success = ");
        boolean z = !(objI instanceof OS0);
        sb.append(z);
        Logger.DefaultImpls.info$default(logger, sb.toString(), null, 2, null);
        this.d.invoke(this);
        return z;
    }

    public final Context getContext() {
        return this.context;
    }

    public abstract String getLogTag();

    public final Logger getLogger() {
        return (Logger) this.f.getValue();
    }

    public final List<AppInfo> getPreferredHosts() {
        return this.preferredHosts;
    }

    public final Object i() {
        try {
            if (this.i.compareAndSet(true, false)) {
                Logger.DefaultImpls.info$default(getLogger(), "Unbind service", null, 2, null);
                this.context.unbindService(this.l);
            } else {
                Logger.DefaultImpls.info$default(getLogger(), "Unbind service skipped", null, 2, null);
            }
            return C1518Tf1.a;
        } catch (Throwable th) {
            return RQ1.b(th);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0017  */
    /* JADX WARN: Type inference failed for: r3v11, types: [com.vk.push.core.ipc.BaseIPCClient] */
    /* JADX WARN: Type inference failed for: r3v12 */
    /* JADX WARN: Type inference failed for: r3v14 */
    /* JADX WARN: Type inference failed for: r3v15 */
    /* JADX WARN: Type inference failed for: r3v16 */
    /* JADX WARN: Type inference failed for: r3v17 */
    /* JADX WARN: Type inference failed for: r3v2 */
    /* JADX WARN: Type inference failed for: r3v3, types: [com.vk.push.core.ipc.BaseIPCClient] */
    /* JADX WARN: Type inference failed for: r3v4 */
    /* JADX WARN: Type inference failed for: r3v8 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final <V> java.lang.Object makeAsyncRequest(kotlin.jvm.functions.Function2 r14, java.lang.String r15, kotlin.jvm.functions.Function2 r16, defpackage.InterfaceC6099nZ r17, defpackage.InterfaceC6099nZ r18, long r19, defpackage.InterfaceC1729Vy r21) throws java.lang.Throwable {
        /*
            r13 = this;
            r9 = r13
            r0 = r21
            boolean r1 = r0 instanceof defpackage.C2559cg
            if (r1 == 0) goto L17
            r1 = r0
            cg r1 = (defpackage.C2559cg) r1
            int r2 = r1.e
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r4 = r2 & r3
            if (r4 == 0) goto L17
            int r2 = r2 - r3
            r1.e = r2
        L15:
            r0 = r1
            goto L1d
        L17:
            cg r1 = new cg
            r1.<init>(r13, r0)
            goto L15
        L1d:
            java.lang.Object r1 = r0.c
            Mz r10 = defpackage.EnumC1030Mz.a
            int r2 = r0.e
            r11 = 1
            if (r2 == 0) goto L42
            if (r2 != r11) goto L3a
            nZ r2 = r0.b
            com.vk.push.core.ipc.BaseIPCClient r3 = r0.a
            defpackage.RQ1.d(r1)     // Catch: java.lang.Throwable -> L30 java.util.concurrent.CancellationException -> L33 defpackage.C0412Fa1 -> L36
            goto L67
        L30:
            r0 = move-exception
            goto L9f
        L33:
            r0 = move-exception
            r1 = r2
            goto L7f
        L36:
            r0 = move-exception
            r1 = r2
            goto L90
        L3a:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r1)
            throw r0
        L42:
            defpackage.RQ1.d(r1)
            dg r12 = new dg     // Catch: java.lang.Throwable -> L71 java.util.concurrent.CancellationException -> L77 defpackage.C0412Fa1 -> L7b
            r8 = 0
            r1 = r12
            r2 = r13
            r3 = r14
            r4 = r15
            r5 = r16
            r6 = r17
            r7 = r18
            r1.<init>(r2, r3, r4, r5, r6, r7, r8)     // Catch: java.lang.Throwable -> L71 java.util.concurrent.CancellationException -> L77 defpackage.C0412Fa1 -> L7b
            r0.a = r9     // Catch: java.lang.Throwable -> L71 java.util.concurrent.CancellationException -> L77 defpackage.C0412Fa1 -> L7b
            r1 = r17
            r0.b = r1     // Catch: java.lang.Throwable -> L71 java.util.concurrent.CancellationException -> L73 defpackage.C0412Fa1 -> L75
            r0.e = r11     // Catch: java.lang.Throwable -> L71 java.util.concurrent.CancellationException -> L73 defpackage.C0412Fa1 -> L75
            r2 = r19
            java.lang.Object r1 = defpackage.GY1.a(r2, r12, r0)     // Catch: java.lang.Throwable -> L71 java.util.concurrent.CancellationException -> L73 defpackage.C0412Fa1 -> L75
            if (r1 != r10) goto L66
            return r10
        L66:
            r3 = r9
        L67:
            r3.f()
            goto L9e
        L6b:
            r3 = r9
            goto L9f
        L6d:
            r3 = r9
            goto L7f
        L6f:
            r3 = r9
            goto L90
        L71:
            r0 = move-exception
            goto L6b
        L73:
            r0 = move-exception
            goto L6d
        L75:
            r0 = move-exception
            goto L6f
        L77:
            r0 = move-exception
            r1 = r17
            goto L6d
        L7b:
            r0 = move-exception
            r1 = r17
            goto L6f
        L7f:
            com.vk.push.common.Logger r2 = r3.getLogger()     // Catch: java.lang.Throwable -> L30
            java.lang.String r4 = "AIDL request was cancelled. Release connection immediately"
            r2.warn(r4, r0)     // Catch: java.lang.Throwable -> L30
            r3.g()     // Catch: java.lang.Throwable -> L30
            java.lang.Object r1 = r1.invoke(r0)     // Catch: java.lang.Throwable -> L30
            goto L67
        L90:
            com.vk.push.common.Logger r2 = r3.getLogger()     // Catch: java.lang.Throwable -> L30
            java.lang.String r4 = "Timeout exceeded while executing AIDL request"
            r2.warn(r4, r0)     // Catch: java.lang.Throwable -> L30
            java.lang.Object r1 = r1.invoke(r0)     // Catch: java.lang.Throwable -> L30
            goto L67
        L9e:
            return r1
        L9f:
            r3.f()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.vk.push.core.ipc.BaseIPCClient.makeAsyncRequest(kotlin.jvm.functions.Function2, java.lang.String, kotlin.jvm.functions.Function2, nZ, nZ, long, Vy):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0017  */
    /* JADX WARN: Type inference failed for: r3v11, types: [com.vk.push.core.ipc.BaseIPCClient] */
    /* JADX WARN: Type inference failed for: r3v12 */
    /* JADX WARN: Type inference failed for: r3v14 */
    /* JADX WARN: Type inference failed for: r3v15 */
    /* JADX WARN: Type inference failed for: r3v16 */
    /* JADX WARN: Type inference failed for: r3v17 */
    /* JADX WARN: Type inference failed for: r3v2 */
    /* JADX WARN: Type inference failed for: r3v3, types: [com.vk.push.core.ipc.BaseIPCClient] */
    /* JADX WARN: Type inference failed for: r3v4 */
    /* JADX WARN: Type inference failed for: r3v8 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final <V> java.lang.Object makeSimpleRequest(kotlin.jvm.functions.Function2 r15, java.lang.String r16, defpackage.InterfaceC6099nZ r17, defpackage.InterfaceC6099nZ r18, defpackage.InterfaceC1729Vy r19) throws java.lang.Throwable {
        /*
            r14 = this;
            r8 = r14
            r0 = r19
            boolean r1 = r0 instanceof defpackage.C3625eg
            if (r1 == 0) goto L17
            r1 = r0
            eg r1 = (defpackage.C3625eg) r1
            int r2 = r1.e
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r4 = r2 & r3
            if (r4 == 0) goto L17
            int r2 = r2 - r3
            r1.e = r2
        L15:
            r0 = r1
            goto L1d
        L17:
            eg r1 = new eg
            r1.<init>(r14, r0)
            goto L15
        L1d:
            java.lang.Object r1 = r0.c
            Mz r9 = defpackage.EnumC1030Mz.a
            int r2 = r0.e
            r10 = 1
            if (r2 == 0) goto L42
            if (r2 != r10) goto L3a
            nZ r2 = r0.b
            com.vk.push.core.ipc.BaseIPCClient r3 = r0.a
            defpackage.RQ1.d(r1)     // Catch: java.lang.Throwable -> L30 java.util.concurrent.CancellationException -> L33 defpackage.C0412Fa1 -> L36
            goto L6c
        L30:
            r0 = move-exception
            goto La4
        L33:
            r0 = move-exception
            r1 = r2
            goto L84
        L36:
            r0 = move-exception
            r1 = r2
            goto L95
        L3a:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r1)
            throw r0
        L42:
            defpackage.RQ1.d(r1)
            java.util.concurrent.TimeUnit r1 = java.util.concurrent.TimeUnit.MINUTES     // Catch: java.lang.Throwable -> L76 java.util.concurrent.CancellationException -> L7c defpackage.C0412Fa1 -> L80
            r2 = 3
            long r11 = r1.toMillis(r2)     // Catch: java.lang.Throwable -> L76 java.util.concurrent.CancellationException -> L7c defpackage.C0412Fa1 -> L80
            fg r13 = new fg     // Catch: java.lang.Throwable -> L76 java.util.concurrent.CancellationException -> L7c defpackage.C0412Fa1 -> L80
            r7 = 0
            r1 = r13
            r2 = r14
            r3 = r15
            r4 = r16
            r5 = r17
            r6 = r18
            r1.<init>(r2, r3, r4, r5, r6, r7)     // Catch: java.lang.Throwable -> L76 java.util.concurrent.CancellationException -> L7c defpackage.C0412Fa1 -> L80
            r0.a = r8     // Catch: java.lang.Throwable -> L76 java.util.concurrent.CancellationException -> L7c defpackage.C0412Fa1 -> L80
            r1 = r17
            r0.b = r1     // Catch: java.lang.Throwable -> L76 java.util.concurrent.CancellationException -> L78 defpackage.C0412Fa1 -> L7a
            r0.e = r10     // Catch: java.lang.Throwable -> L76 java.util.concurrent.CancellationException -> L78 defpackage.C0412Fa1 -> L7a
            java.lang.Object r1 = defpackage.GY1.a(r11, r13, r0)     // Catch: java.lang.Throwable -> L76 java.util.concurrent.CancellationException -> L78 defpackage.C0412Fa1 -> L7a
            if (r1 != r9) goto L6b
            return r9
        L6b:
            r3 = r8
        L6c:
            r3.f()
            goto La3
        L70:
            r3 = r8
            goto La4
        L72:
            r3 = r8
            goto L84
        L74:
            r3 = r8
            goto L95
        L76:
            r0 = move-exception
            goto L70
        L78:
            r0 = move-exception
            goto L72
        L7a:
            r0 = move-exception
            goto L74
        L7c:
            r0 = move-exception
            r1 = r17
            goto L72
        L80:
            r0 = move-exception
            r1 = r17
            goto L74
        L84:
            com.vk.push.common.Logger r2 = r3.getLogger()     // Catch: java.lang.Throwable -> L30
            java.lang.String r4 = "AIDL request was cancelled. Release connection immediately"
            r2.warn(r4, r0)     // Catch: java.lang.Throwable -> L30
            r3.g()     // Catch: java.lang.Throwable -> L30
            java.lang.Object r1 = r1.invoke(r0)     // Catch: java.lang.Throwable -> L30
            goto L6c
        L95:
            com.vk.push.common.Logger r2 = r3.getLogger()     // Catch: java.lang.Throwable -> L30
            java.lang.String r4 = "Timeout exceeded while executing AIDL request"
            r2.warn(r4, r0)     // Catch: java.lang.Throwable -> L30
            java.lang.Object r1 = r1.invoke(r0)     // Catch: java.lang.Throwable -> L30
            goto L6c
        La3:
            return r1
        La4:
            r3.f()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.vk.push.core.ipc.BaseIPCClient.makeSimpleRequest(kotlin.jvm.functions.Function2, java.lang.String, nZ, nZ, Vy):java.lang.Object");
    }

    public /* synthetic */ BaseIPCClient(Context context, List list, long j, InterfaceC6099nZ interfaceC6099nZ, InterfaceC5908mZ interfaceC5908mZ, Logger logger, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, list, (i & 4) != 0 ? 10000L : j, (i & 8) != 0 ? C4258i.l : interfaceC6099nZ, interfaceC5908mZ, logger);
    }
}
