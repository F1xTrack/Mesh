package androidx.camera.extensions.internal.sessionprocessor;

import p000.AbstractC7806Jm0;
import p000.C1356VY;
import p000.C9385fZ0;
import p000.InterfaceC10097l70;
import p000.InterfaceC9329f70;

/* renamed from: androidx.camera.extensions.internal.sessionprocessor.f */
/* loaded from: classes.dex */
public final class C1701f implements InterfaceC9329f70 {

    /* renamed from: a */
    public boolean f15990a = true;

    /* renamed from: b */
    public final /* synthetic */ C1703h f15991b;

    public C1701f(C1703h c1703h, C1356VY c1356vy, int i) {
        this.f15991b = c1703h;
    }

    @Override // p000.InterfaceC9329f70
    public final void onNextImageAvailable(int i, long j, InterfaceC10097l70 interfaceC10097l70, String str) {
        AbstractC7806Jm0.m4412f("BasicSessionProcessor");
        if (this.f15991b.f16001k != null) {
            this.f15991b.f16001k.notifyImage(interfaceC10097l70);
        } else {
            ((C9385fZ0) interfaceC10097l70).m18258a();
        }
        if (this.f15990a) {
            this.f15990a = false;
        }
    }
}
