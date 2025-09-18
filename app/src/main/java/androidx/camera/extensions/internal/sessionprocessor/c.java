package androidx.camera.extensions.internal.sessionprocessor;

import defpackage.C3796fZ0;
import defpackage.InterfaceC3712f70;
import defpackage.InterfaceC5634l70;

/* loaded from: classes.dex */
public final class c implements InterfaceC3712f70 {
    public final /* synthetic */ h a;

    public c(h hVar) {
        this.a = hVar;
    }

    @Override // defpackage.InterfaceC3712f70
    public final void onNextImageAvailable(int i, long j, InterfaceC5634l70 interfaceC5634l70, String str) {
        if (this.a.l != null) {
            this.a.l.notifyImage(interfaceC5634l70);
        } else {
            ((C3796fZ0) interfaceC5634l70).a();
        }
    }
}
