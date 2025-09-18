package p000;

import android.content.Context;
import java.util.HashSet;

/* renamed from: XE */
/* loaded from: classes.dex */
public final class C1462XE implements InterfaceC6918tx {

    /* renamed from: a */
    public final Context f13624a;

    /* renamed from: b */
    public final IR0 f13625b;

    public C1462XE(Context context, IR0 ir0) {
        this.f13624a = context.getApplicationContext();
        this.f13625b = ir0;
    }

    @Override // p000.InterfaceC7798Ji0
    public final void onStart() {
        X11 x11M8915q = X11.m8915q(this.f13624a);
        IR0 ir0 = this.f13625b;
        synchronized (x11M8915q) {
            ((HashSet) x11M8915q.f13489d).add(ir0);
            if (!x11M8915q.f13487b && !((HashSet) x11M8915q.f13489d).isEmpty()) {
                x11M8915q.f13487b = ((U11) x11M8915q.f13488c).mo7863a();
            }
        }
    }

    @Override // p000.InterfaceC7798Ji0
    public final void onStop() {
        X11 x11M8915q = X11.m8915q(this.f13624a);
        IR0 ir0 = this.f13625b;
        synchronized (x11M8915q) {
            ((HashSet) x11M8915q.f13489d).remove(ir0);
            if (x11M8915q.f13487b && ((HashSet) x11M8915q.f13489d).isEmpty()) {
                ((U11) x11M8915q.f13488c).unregister();
                x11M8915q.f13487b = false;
            }
        }
    }

    @Override // p000.InterfaceC7798Ji0
    public final void onDestroy() {
    }
}
