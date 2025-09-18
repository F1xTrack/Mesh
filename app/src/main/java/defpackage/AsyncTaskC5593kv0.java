package defpackage;

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
public final class AsyncTaskC5593kv0 extends GuardedAsyncTask {
    public final /* synthetic */ int a;
    public final /* synthetic */ NetworkingModule b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AsyncTaskC5593kv0(NetworkingModule networkingModule, ReactApplicationContext reactApplicationContext, int i) {
        super(reactApplicationContext);
        this.b = networkingModule;
        this.a = i;
    }

    @Override // com.facebook.react.bridge.GuardedAsyncTask
    public final void doInBackgroundGuarded(Object[] objArr) {
        List listUnmodifiableList;
        C6363ox0 c6363ox0 = this.b.mClient;
        Integer numValueOf = Integer.valueOf(this.a);
        C6860rY0 c6860rY0 = c6363ox0.a;
        synchronized (c6860rY0) {
            try {
                ArrayDeque arrayDeque = (ArrayDeque) c6860rY0.e;
                ArrayList arrayList = new ArrayList(AbstractC8449zu.k(arrayDeque));
                Iterator it = arrayDeque.iterator();
                while (it.hasNext()) {
                    arrayList.add(((AN0) it.next()).c);
                }
                listUnmodifiableList = Collections.unmodifiableList(arrayList);
                O90.e(listUnmodifiableList, "unmodifiableList(readyAsyncCalls.map { it.call })");
            } catch (Throwable th) {
                throw th;
            }
        }
        Iterator it2 = listUnmodifiableList.iterator();
        while (it2.hasNext()) {
            DN0 dn0 = (DN0) ((InterfaceC7089sl) it2.next());
            if (numValueOf.equals(Object.class.cast(dn0.b.e.get(Object.class)))) {
                dn0.e();
                return;
            }
        }
        Iterator it3 = c6363ox0.a.F().iterator();
        while (it3.hasNext()) {
            DN0 dn02 = (DN0) ((InterfaceC7089sl) it3.next());
            if (numValueOf.equals(Object.class.cast(dn02.b.e.get(Object.class)))) {
                dn02.e();
                return;
            }
        }
    }
}
