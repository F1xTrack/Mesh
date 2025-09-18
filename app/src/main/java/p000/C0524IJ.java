package p000;

import com.facebook.react.modules.dialog.DialogModule;

/* renamed from: IJ */
/* loaded from: classes.dex */
public final class C0524IJ {

    /* renamed from: a */
    public final C6244jY f4889a;

    /* renamed from: b */
    public DialogInterfaceOnClickListenerC0634K3 f4890b;

    /* renamed from: c */
    public final /* synthetic */ DialogModule f4891c;

    public C0524IJ(DialogModule dialogModule, C6244jY c6244jY) {
        this.f4891c = dialogModule;
        this.f4889a = c6244jY;
    }

    /* renamed from: a */
    public final void m3813a() {
        DialogInterfaceOnClickListenerC0634K3 dialogInterfaceOnClickListenerC0634K3;
        if (this.f4891c.mIsInForeground && (dialogInterfaceOnClickListenerC0634K3 = (DialogInterfaceOnClickListenerC0634K3) this.f4889a.m10039B("com.facebook.catalyst.react.dialog.DialogModule")) != null && dialogInterfaceOnClickListenerC0634K3.isResumed()) {
            dialogInterfaceOnClickListenerC0634K3.dismiss();
        }
    }
}
