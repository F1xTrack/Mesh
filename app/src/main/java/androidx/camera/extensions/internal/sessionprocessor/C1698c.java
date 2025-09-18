package androidx.camera.extensions.internal.sessionprocessor;

import p000.C9385fZ0;
import p000.InterfaceC10097l70;
import p000.InterfaceC9329f70;

/* renamed from: androidx.camera.extensions.internal.sessionprocessor.c */
/* loaded from: classes.dex */
public final class C1698c implements InterfaceC9329f70 {

    /* renamed from: a */
    public final /* synthetic */ C1703h f15980a;

    public C1698c(C1703h c1703h) {
        this.f15980a = c1703h;
    }

    @Override // p000.InterfaceC9329f70
    public final void onNextImageAvailable(int i, long j, InterfaceC10097l70 interfaceC10097l70, String str) {
        if (this.f15980a.f16002l != null) {
            this.f15980a.f16002l.notifyImage(interfaceC10097l70);
        } else {
            ((C9385fZ0) interfaceC10097l70).m18258a();
        }
    }
}
