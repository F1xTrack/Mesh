package p000;

import android.os.IInterface;
import android.os.RemoteCallbackList;
import androidx.room.MultiInstanceInvalidationService;

/* renamed from: mt0 */
/* loaded from: classes.dex */
public final class RemoteCallbackListC10321mt0 extends RemoteCallbackList {

    /* renamed from: a */
    public final /* synthetic */ MultiInstanceInvalidationService f37978a;

    public RemoteCallbackListC10321mt0(MultiInstanceInvalidationService multiInstanceInvalidationService) {
        this.f37978a = multiInstanceInvalidationService;
    }

    @Override // android.os.RemoteCallbackList
    public final void onCallbackDied(IInterface iInterface, Object obj) {
        O90.m5968f((Z40) iInterface, "callback");
        O90.m5968f(obj, "cookie");
        this.f37978a.f16558b.remove((Integer) obj);
    }
}
