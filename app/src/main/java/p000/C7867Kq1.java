package p000;

import com.p019vk.push.common.token.OnNewPushTokenListener;
import com.p019vk.push.common.token.OnNewPushTokenListenerStore;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: Kq1, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C7867Kq1 implements OnNewPushTokenListenerStore, OnNewPushTokenListener {

    /* renamed from: a */
    public final ArrayList f6358a = new ArrayList();

    @Override // com.p019vk.push.common.token.OnNewPushTokenListenerStore
    public final void addOnNewPushTokenListener(OnNewPushTokenListener onNewPushTokenListener) {
        O90.m5968f(onNewPushTokenListener, "onNewPushTokenListener");
        synchronized (this) {
            this.f6358a.add(onNewPushTokenListener);
        }
    }

    @Override // com.p019vk.push.common.token.OnNewPushTokenListener
    public final void onNewPushToken(String str) {
        O90.m5968f(str, "token");
        synchronized (this) {
            Iterator it = this.f6358a.iterator();
            while (it.hasNext()) {
                ((OnNewPushTokenListener) it.next()).onNewPushToken(str);
            }
        }
    }

    @Override // com.p019vk.push.common.token.OnNewPushTokenListenerStore
    public final void removeOnNewPushTokenListener(OnNewPushTokenListener onNewPushTokenListener) {
        O90.m5968f(onNewPushTokenListener, "onNewPushTokenListener");
        synchronized (this) {
            this.f6358a.remove(onNewPushTokenListener);
        }
    }
}
