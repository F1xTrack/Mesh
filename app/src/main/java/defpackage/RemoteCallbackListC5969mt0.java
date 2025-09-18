package defpackage;

import android.os.IInterface;
import android.os.RemoteCallbackList;
import androidx.room.MultiInstanceInvalidationService;

/* renamed from: mt0 */
/* loaded from: classes.dex */
public final class RemoteCallbackListC5969mt0 extends RemoteCallbackList {
    public final /* synthetic */ MultiInstanceInvalidationService a;

    public RemoteCallbackListC5969mt0(MultiInstanceInvalidationService multiInstanceInvalidationService) {
        this.a = multiInstanceInvalidationService;
    }

    @Override // android.os.RemoteCallbackList
    public final void onCallbackDied(IInterface iInterface, Object obj) {
        O90.f((Z40) iInterface, "callback");
        O90.f(obj, "cookie");
        this.a.b.remove((Integer) obj);
    }
}
