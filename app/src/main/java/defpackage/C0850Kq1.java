package defpackage;

import com.vk.push.common.token.OnNewPushTokenListener;
import com.vk.push.common.token.OnNewPushTokenListenerStore;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: Kq1, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C0850Kq1 implements OnNewPushTokenListenerStore, OnNewPushTokenListener {
    public final ArrayList a = new ArrayList();

    @Override // com.vk.push.common.token.OnNewPushTokenListenerStore
    public final void addOnNewPushTokenListener(OnNewPushTokenListener onNewPushTokenListener) {
        O90.f(onNewPushTokenListener, "onNewPushTokenListener");
        synchronized (this) {
            this.a.add(onNewPushTokenListener);
        }
    }

    @Override // com.vk.push.common.token.OnNewPushTokenListener
    public final void onNewPushToken(String str) {
        O90.f(str, "token");
        synchronized (this) {
            Iterator it = this.a.iterator();
            while (it.hasNext()) {
                ((OnNewPushTokenListener) it.next()).onNewPushToken(str);
            }
        }
    }

    @Override // com.vk.push.common.token.OnNewPushTokenListenerStore
    public final void removeOnNewPushTokenListener(OnNewPushTokenListener onNewPushTokenListener) {
        O90.f(onNewPushTokenListener, "onNewPushTokenListener");
        synchronized (this) {
            this.a.remove(onNewPushTokenListener);
        }
    }
}
