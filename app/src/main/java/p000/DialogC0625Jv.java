package p000;

import android.app.Dialog;
import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.window.OnBackInvokedDispatcher;
import androidx.activity.C1690a;
import androidx.lifecycle.C1742a;

/* renamed from: Jv */
/* loaded from: classes.dex */
public class DialogC0625Jv extends Dialog implements InterfaceC7902Li0, InterfaceC7880Kx0, InterfaceC10401nV0 {

    /* renamed from: a */
    public C1742a f5797a;

    /* renamed from: b */
    public final C10273mV0 f5798b;

    /* renamed from: c */
    public final C1690a f5799c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DialogC0625Jv(Context context, int i) {
        super(context, i);
        O90.m5968f(context, "context");
        this.f5798b = new C10273mV0(this);
        this.f5799c = new C1690a(new RunnableC0383G4(24, this));
    }

    /* renamed from: a */
    public static void m4466a(DialogC0625Jv dialogC0625Jv) {
        O90.m5968f(dialogC0625Jv, "this$0");
        super.onBackPressed();
    }

    @Override // android.app.Dialog
    public void addContentView(View view, ViewGroup.LayoutParams layoutParams) {
        O90.m5968f(view, "view");
        m4468c();
        super.addContentView(view, layoutParams);
    }

    /* renamed from: b */
    public final C1742a m4467b() {
        C1742a c1742a = this.f5797a;
        if (c1742a != null) {
            return c1742a;
        }
        C1742a c1742a2 = new C1742a(this);
        this.f5797a = c1742a2;
        return c1742a2;
    }

    /* renamed from: c */
    public final void m4468c() {
        Window window = getWindow();
        O90.m5965c(window);
        View decorView = window.getDecorView();
        O90.m5967e(decorView, "window!!.decorView");
        O02.m5927b(decorView, this);
        Window window2 = getWindow();
        O90.m5965c(window2);
        View decorView2 = window2.getDecorView();
        O90.m5967e(decorView2, "window!!.decorView");
        P02.m6201f(decorView2, this);
        Window window3 = getWindow();
        O90.m5965c(window3);
        View decorView3 = window3.getDecorView();
        O90.m5967e(decorView3, "window!!.decorView");
        Q02.m6528b(decorView3, this);
    }

    @Override // p000.InterfaceC7902Li0
    public final AbstractC7538Ei0 getLifecycle() {
        return m4467b();
    }

    @Override // p000.InterfaceC7880Kx0
    public final C1690a getOnBackPressedDispatcher() {
        return this.f5799c;
    }

    @Override // p000.InterfaceC10401nV0
    public final C10145lV0 getSavedStateRegistry() {
        return this.f5798b.f37730b;
    }

    @Override // android.app.Dialog
    public final void onBackPressed() {
        this.f5799c.m9821c();
    }

    @Override // android.app.Dialog
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (Build.VERSION.SDK_INT >= 33) {
            OnBackInvokedDispatcher onBackInvokedDispatcher = getOnBackInvokedDispatcher();
            O90.m5967e(onBackInvokedDispatcher, "onBackInvokedDispatcher");
            C1690a c1690a = this.f5799c;
            c1690a.getClass();
            c1690a.f15746e = onBackInvokedDispatcher;
            c1690a.m9822d(c1690a.f15748g);
        }
        this.f5798b.m22831b(bundle);
        m4467b().m10126e(EnumC7382Bi0.ON_CREATE);
    }

    @Override // android.app.Dialog
    public final Bundle onSaveInstanceState() {
        Bundle bundleOnSaveInstanceState = super.onSaveInstanceState();
        O90.m5967e(bundleOnSaveInstanceState, "super.onSaveInstanceState()");
        this.f5798b.m22832c(bundleOnSaveInstanceState);
        return bundleOnSaveInstanceState;
    }

    @Override // android.app.Dialog
    public final void onStart() {
        super.onStart();
        m4467b().m10126e(EnumC7382Bi0.ON_RESUME);
    }

    @Override // android.app.Dialog
    public void onStop() {
        m4467b().m10126e(EnumC7382Bi0.ON_DESTROY);
        this.f5797a = null;
        super.onStop();
    }

    @Override // android.app.Dialog
    public void setContentView(int i) {
        m4468c();
        super.setContentView(i);
    }

    @Override // android.app.Dialog
    public void setContentView(View view) {
        O90.m5968f(view, "view");
        m4468c();
        super.setContentView(view);
    }

    @Override // android.app.Dialog
    public void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        O90.m5968f(view, "view");
        m4468c();
        super.setContentView(view, layoutParams);
    }
}
