package defpackage;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.WindowManager;
import android.widget.AdapterView;
import androidx.appcompat.view.menu.ExpandedMenuView;

/* renamed from: Aj0 */
/* loaded from: classes.dex */
public final class C0048Aj0 implements InterfaceC1862Xq0, AdapterView.OnItemClickListener {
    public Context a;
    public LayoutInflater b;
    public MenuC0225Cq0 c;
    public ExpandedMenuView d;
    public InterfaceC1784Wq0 e;
    public C8417zj0 f;

    public C0048Aj0(Context context) {
        this.a = context;
        this.b = LayoutInflater.from(context);
    }

    @Override // defpackage.InterfaceC1862Xq0
    public final boolean c(I51 i51) {
        if (!i51.hasVisibleItems()) {
            return false;
        }
        DialogInterfaceOnKeyListenerC0303Dq0 dialogInterfaceOnKeyListenerC0303Dq0 = new DialogInterfaceOnKeyListenerC0303Dq0();
        dialogInterfaceOnKeyListenerC0303Dq0.a = i51;
        Context context = i51.a;
        I3 i3 = new I3(context);
        C0048Aj0 c0048Aj0 = new C0048Aj0(i3.getContext());
        dialogInterfaceOnKeyListenerC0303Dq0.c = c0048Aj0;
        c0048Aj0.e = dialogInterfaceOnKeyListenerC0303Dq0;
        i51.b(c0048Aj0, context);
        C0048Aj0 c0048Aj02 = dialogInterfaceOnKeyListenerC0303Dq0.c;
        if (c0048Aj02.f == null) {
            c0048Aj02.f = new C8417zj0(c0048Aj02);
        }
        C8417zj0 c8417zj0 = c0048Aj02.f;
        E3 e3 = i3.a;
        e3.p = c8417zj0;
        e3.q = dialogInterfaceOnKeyListenerC0303Dq0;
        View view = i51.o;
        if (view != null) {
            e3.e = view;
        } else {
            e3.c = i51.n;
            i3.setTitle(i51.m);
        }
        e3.n = dialogInterfaceOnKeyListenerC0303Dq0;
        J3 j3Create = i3.create();
        dialogInterfaceOnKeyListenerC0303Dq0.b = j3Create;
        j3Create.setOnDismissListener(dialogInterfaceOnKeyListenerC0303Dq0);
        WindowManager.LayoutParams attributes = dialogInterfaceOnKeyListenerC0303Dq0.b.getWindow().getAttributes();
        attributes.type = 1003;
        attributes.flags |= 131072;
        dialogInterfaceOnKeyListenerC0303Dq0.b.show();
        InterfaceC1784Wq0 interfaceC1784Wq0 = this.e;
        if (interfaceC1784Wq0 == null) {
            return true;
        }
        interfaceC1784Wq0.q0(i51);
        return true;
    }

    @Override // defpackage.InterfaceC1862Xq0
    public final boolean d() {
        return false;
    }

    @Override // defpackage.InterfaceC1862Xq0
    public final boolean e(C0849Kq0 c0849Kq0) {
        return false;
    }

    @Override // defpackage.InterfaceC1862Xq0
    public final void f(MenuC0225Cq0 menuC0225Cq0, boolean z) {
        InterfaceC1784Wq0 interfaceC1784Wq0 = this.e;
        if (interfaceC1784Wq0 != null) {
            interfaceC1784Wq0.f(menuC0225Cq0, z);
        }
    }

    @Override // defpackage.InterfaceC1862Xq0
    public final void g(InterfaceC1784Wq0 interfaceC1784Wq0) {
        throw null;
    }

    @Override // defpackage.InterfaceC1862Xq0
    public final boolean h(C0849Kq0 c0849Kq0) {
        return false;
    }

    @Override // defpackage.InterfaceC1862Xq0
    public final void i() {
        C8417zj0 c8417zj0 = this.f;
        if (c8417zj0 != null) {
            c8417zj0.notifyDataSetChanged();
        }
    }

    @Override // defpackage.InterfaceC1862Xq0
    public final void k(Context context, MenuC0225Cq0 menuC0225Cq0) {
        if (this.a != null) {
            this.a = context;
            if (this.b == null) {
                this.b = LayoutInflater.from(context);
            }
        }
        this.c = menuC0225Cq0;
        C8417zj0 c8417zj0 = this.f;
        if (c8417zj0 != null) {
            c8417zj0.notifyDataSetChanged();
        }
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public final void onItemClick(AdapterView adapterView, View view, int i, long j) {
        this.c.q(this.f.getItem(i), this, 0);
    }
}
