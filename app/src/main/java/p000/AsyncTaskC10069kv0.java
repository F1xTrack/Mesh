package p000;

import com.facebook.react.bridge.GuardedAsyncTask;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.modules.network.NetworkingModule;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* renamed from: kv0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class AsyncTaskC10069kv0 extends GuardedAsyncTask {

    /* renamed from: a */
    public final /* synthetic */ int f36760a;

    /* renamed from: b */
    public final /* synthetic */ NetworkingModule f36761b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AsyncTaskC10069kv0(NetworkingModule networkingModule, ReactApplicationContext reactApplicationContext, int i) {
        super(reactApplicationContext);
        this.f36761b = networkingModule;
        this.f36760a = i;
    }

    @Override // com.facebook.react.bridge.GuardedAsyncTask
    public final void doInBackgroundGuarded(Object[] objArr) {
        List listUnmodifiableList;
        C10585ox0 c10585ox0 = this.f36761b.mClient;
        Integer numValueOf = Integer.valueOf(this.f36760a);
        C10919rY0 c10919rY0 = c10585ox0.f39371a;
        synchronized (c10919rY0) {
            try {
                ArrayDeque arrayDeque = (ArrayDeque) c10919rY0.f41731e;
                ArrayList arrayList = new ArrayList(AbstractC7293zu.m26586k(arrayDeque));
                Iterator it = arrayDeque.iterator();
                while (it.hasNext()) {
                    arrayList.add(((AN0) it.next()).f179c);
                }
                listUnmodifiableList = Collections.unmodifiableList(arrayList);
                O90.m5967e(listUnmodifiableList, "unmodifiableList(readyAsyncCalls.map { it.call })");
            } catch (Throwable th) {
                throw th;
            }
        }
        Iterator it2 = listUnmodifiableList.iterator();
        while (it2.hasNext()) {
            DN0 dn0 = (DN0) ((InterfaceC6843sl) it2.next());
            if (numValueOf.equals(Object.class.cast(dn0.f1981b.f40874e.get(Object.class)))) {
                dn0.m1668e();
                return;
            }
        }
        Iterator it3 = c10585ox0.f39371a.m24407F().iterator();
        while (it3.hasNext()) {
            DN0 dn02 = (DN0) ((InterfaceC6843sl) it3.next());
            if (numValueOf.equals(Object.class.cast(dn02.f1981b.f40874e.get(Object.class)))) {
                dn02.m1668e();
                return;
            }
        }
    }
}
