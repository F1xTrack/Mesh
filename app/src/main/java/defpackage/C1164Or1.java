package defpackage;

import com.vk.push.common.messaging.RemoteMessage;
import com.vk.push.common.messaging.interceptor.PushInterceptor;
import com.vk.push.common.messaging.interceptor.PushInterceptorStore;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: Or1, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1164Or1 implements PushInterceptorStore, PushInterceptor {
    public final ArrayList a = new ArrayList();

    @Override // com.vk.push.common.messaging.interceptor.PushInterceptorStore
    public final void addPushInterceptor(PushInterceptor pushInterceptor) {
        O90.f(pushInterceptor, "pushInterceptor");
        synchronized (this) {
            this.a.add(pushInterceptor);
        }
    }

    @Override // com.vk.push.common.messaging.interceptor.PushInterceptor
    public final boolean onIntercept(RemoteMessage remoteMessage) {
        Object obj;
        boolean zBooleanValue;
        O90.f(remoteMessage, "remoteMessage");
        synchronized (this) {
            try {
                ArrayList arrayList = this.a;
                ArrayList arrayList2 = new ArrayList(AbstractC8449zu.k(arrayList));
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    arrayList2.add(Boolean.valueOf(((PushInterceptor) it.next()).onIntercept(remoteMessage)));
                }
                Iterator it2 = arrayList2.iterator();
                if (it2.hasNext()) {
                    Object next = it2.next();
                    while (it2.hasNext()) {
                        next = Boolean.valueOf(((Boolean) next).booleanValue() | ((Boolean) it2.next()).booleanValue());
                    }
                    obj = next;
                } else {
                    obj = null;
                }
                Boolean bool = (Boolean) obj;
                zBooleanValue = bool != null ? bool.booleanValue() : false;
            } catch (Throwable th) {
                throw th;
            }
        }
        return zBooleanValue;
    }

    @Override // com.vk.push.common.messaging.interceptor.PushInterceptorStore
    public final void removePushInterceptor(PushInterceptor pushInterceptor) {
        O90.f(pushInterceptor, "pushInterceptor");
        synchronized (this) {
            this.a.remove(pushInterceptor);
        }
    }
}
