package androidx.camera.extensions.internal.sessionprocessor;

import defpackage.AbstractC0759Jm0;
import defpackage.C3796fZ0;
import defpackage.InterfaceC3712f70;
import defpackage.InterfaceC5634l70;
import defpackage.VY;

/* loaded from: classes.dex */
public final class f implements InterfaceC3712f70 {
    public boolean a = true;
    public final /* synthetic */ h b;

    public f(h hVar, VY vy, int i) {
        this.b = hVar;
    }

    @Override // defpackage.InterfaceC3712f70
    public final void onNextImageAvailable(int i, long j, InterfaceC5634l70 interfaceC5634l70, String str) {
        AbstractC0759Jm0.f("BasicSessionProcessor");
        if (this.b.k != null) {
            this.b.k.notifyImage(interfaceC5634l70);
        } else {
            ((C3796fZ0) interfaceC5634l70).a();
        }
        if (this.a) {
            this.a = false;
        }
    }
}
