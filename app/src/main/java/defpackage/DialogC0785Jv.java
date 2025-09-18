package defpackage;

import android.app.Dialog;
import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.window.OnBackInvokedDispatcher;
import androidx.lifecycle.a;

/* renamed from: Jv, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class DialogC0785Jv extends Dialog implements InterfaceC0903Li0, InterfaceC0870Kx0, InterfaceC6088nV0 {
    public a a;
    public final C5897mV0 b;
    public final androidx.activity.a c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DialogC0785Jv(Context context, int i) {
        super(context, i);
        O90.f(context, "context");
        this.b = new C5897mV0(this);
        this.c = new androidx.activity.a(new G4(24, this));
    }

    public static void a(DialogC0785Jv dialogC0785Jv) {
        O90.f(dialogC0785Jv, "this$0");
        super.onBackPressed();
    }

    @Override // android.app.Dialog
    public void addContentView(View view, ViewGroup.LayoutParams layoutParams) {
        O90.f(view, "view");
        c();
        super.addContentView(view, layoutParams);
    }

    public final a b() {
        a aVar = this.a;
        if (aVar != null) {
            return aVar;
        }
        a aVar2 = new a(this);
        this.a = aVar2;
        return aVar2;
    }

    public final void c() {
        Window window = getWindow();
        O90.c(window);
        View decorView = window.getDecorView();
        O90.e(decorView, "window!!.decorView");
        O02.b(decorView, this);
        Window window2 = getWindow();
        O90.c(window2);
        View decorView2 = window2.getDecorView();
        O90.e(decorView2, "window!!.decorView");
        P02.f(decorView2, this);
        Window window3 = getWindow();
        O90.c(window3);
        View decorView3 = window3.getDecorView();
        O90.e(decorView3, "window!!.decorView");
        Q02.b(decorView3, this);
    }

    @Override // defpackage.InterfaceC0903Li0
    public final AbstractC0357Ei0 getLifecycle() {
        return b();
    }

    @Override // defpackage.InterfaceC0870Kx0
    public final androidx.activity.a getOnBackPressedDispatcher() {
        return this.c;
    }

    @Override // defpackage.InterfaceC6088nV0
    public final C5706lV0 getSavedStateRegistry() {
        return this.b.b;
    }

    @Override // android.app.Dialog
    public final void onBackPressed() {
        this.c.c();
    }

    @Override // android.app.Dialog
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (Build.VERSION.SDK_INT >= 33) {
            OnBackInvokedDispatcher onBackInvokedDispatcher = getOnBackInvokedDispatcher();
            O90.e(onBackInvokedDispatcher, "onBackInvokedDispatcher");
            androidx.activity.a aVar = this.c;
            aVar.getClass();
            aVar.e = onBackInvokedDispatcher;
            aVar.d(aVar.g);
        }
        this.b.b(bundle);
        b().e(EnumC0123Bi0.ON_CREATE);
    }

    @Override // android.app.Dialog
    public final Bundle onSaveInstanceState() {
        Bundle bundleOnSaveInstanceState = super.onSaveInstanceState();
        O90.e(bundleOnSaveInstanceState, "super.onSaveInstanceState()");
        this.b.c(bundleOnSaveInstanceState);
        return bundleOnSaveInstanceState;
    }

    @Override // android.app.Dialog
    public final void onStart() {
        super.onStart();
        b().e(EnumC0123Bi0.ON_RESUME);
    }

    @Override // android.app.Dialog
    public void onStop() {
        b().e(EnumC0123Bi0.ON_DESTROY);
        this.a = null;
        super.onStop();
    }

    @Override // android.app.Dialog
    public void setContentView(int i) {
        c();
        super.setContentView(i);
    }

    @Override // android.app.Dialog
    public void setContentView(View view) {
        O90.f(view, "view");
        c();
        super.setContentView(view);
    }

    @Override // android.app.Dialog
    public void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        O90.f(view, "view");
        c();
        super.setContentView(view, layoutParams);
    }
}
