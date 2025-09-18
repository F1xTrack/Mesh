package p000;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.WindowManager;
import android.widget.AdapterView;
import androidx.appcompat.view.menu.ExpandedMenuView;

/* renamed from: Aj0 */
/* loaded from: classes.dex */
public final class C7332Aj0 implements InterfaceC8542Xq0, AdapterView.OnItemClickListener {

    /* renamed from: a */
    public Context f338a;

    /* renamed from: b */
    public LayoutInflater f339b;

    /* renamed from: c */
    public MenuC7450Cq0 f340c;

    /* renamed from: d */
    public ExpandedMenuView f341d;

    /* renamed from: e */
    public InterfaceC8490Wq0 f342e;

    /* renamed from: f */
    public C11961zj0 f343f;

    public C7332Aj0(Context context) {
        this.f338a = context;
        this.f339b = LayoutInflater.from(context);
    }

    @Override // p000.InterfaceC8542Xq0
    /* renamed from: c */
    public final boolean mo301c(I51 i51) {
        if (!i51.hasVisibleItems()) {
            return false;
        }
        DialogInterfaceOnKeyListenerC7502Dq0 dialogInterfaceOnKeyListenerC7502Dq0 = new DialogInterfaceOnKeyListenerC7502Dq0();
        dialogInterfaceOnKeyListenerC7502Dq0.f2268a = i51;
        Context context = i51.f1702a;
        C0508I3 c0508i3 = new C0508I3(context);
        C7332Aj0 c7332Aj0 = new C7332Aj0(c0508i3.getContext());
        dialogInterfaceOnKeyListenerC7502Dq0.f2270c = c7332Aj0;
        c7332Aj0.f342e = dialogInterfaceOnKeyListenerC7502Dq0;
        i51.m1403b(c7332Aj0, context);
        C7332Aj0 c7332Aj02 = dialogInterfaceOnKeyListenerC7502Dq0.f2270c;
        if (c7332Aj02.f343f == null) {
            c7332Aj02.f343f = new C11961zj0(c7332Aj02);
        }
        C11961zj0 c11961zj0 = c7332Aj02.f343f;
        C0256E3 c0256e3 = c0508i3.f4670a;
        c0256e3.f2387p = c11961zj0;
        c0256e3.f2388q = dialogInterfaceOnKeyListenerC7502Dq0;
        View view = i51.f1716o;
        if (view != null) {
            c0256e3.f2376e = view;
        } else {
            c0256e3.f2374c = i51.f1715n;
            c0508i3.setTitle(i51.f1714m);
        }
        c0256e3.f2385n = dialogInterfaceOnKeyListenerC7502Dq0;
        DialogInterfaceC0571J3 dialogInterfaceC0571J3Create = c0508i3.create();
        dialogInterfaceOnKeyListenerC7502Dq0.f2269b = dialogInterfaceC0571J3Create;
        dialogInterfaceC0571J3Create.setOnDismissListener(dialogInterfaceOnKeyListenerC7502Dq0);
        WindowManager.LayoutParams attributes = dialogInterfaceOnKeyListenerC7502Dq0.f2269b.getWindow().getAttributes();
        attributes.type = 1003;
        attributes.flags |= 131072;
        dialogInterfaceOnKeyListenerC7502Dq0.f2269b.show();
        InterfaceC8490Wq0 interfaceC8490Wq0 = this.f342e;
        if (interfaceC8490Wq0 == null) {
            return true;
        }
        interfaceC8490Wq0.mo1907q0(i51);
        return true;
    }

    @Override // p000.InterfaceC8542Xq0
    /* renamed from: d */
    public final boolean mo302d() {
        return false;
    }

    @Override // p000.InterfaceC8542Xq0
    /* renamed from: e */
    public final boolean mo303e(C7866Kq0 c7866Kq0) {
        return false;
    }

    @Override // p000.InterfaceC8542Xq0
    /* renamed from: f */
    public final void mo304f(MenuC7450Cq0 menuC7450Cq0, boolean z) {
        InterfaceC8490Wq0 interfaceC8490Wq0 = this.f342e;
        if (interfaceC8490Wq0 != null) {
            interfaceC8490Wq0.mo1906f(menuC7450Cq0, z);
        }
    }

    @Override // p000.InterfaceC8542Xq0
    /* renamed from: g */
    public final void mo305g(InterfaceC8490Wq0 interfaceC8490Wq0) {
        throw null;
    }

    @Override // p000.InterfaceC8542Xq0
    /* renamed from: h */
    public final boolean mo306h(C7866Kq0 c7866Kq0) {
        return false;
    }

    @Override // p000.InterfaceC8542Xq0
    /* renamed from: i */
    public final void mo307i() {
        C11961zj0 c11961zj0 = this.f343f;
        if (c11961zj0 != null) {
            c11961zj0.notifyDataSetChanged();
        }
    }

    @Override // p000.InterfaceC8542Xq0
    /* renamed from: k */
    public final void mo308k(Context context, MenuC7450Cq0 menuC7450Cq0) {
        if (this.f338a != null) {
            this.f338a = context;
            if (this.f339b == null) {
                this.f339b = LayoutInflater.from(context);
            }
        }
        this.f340c = menuC7450Cq0;
        C11961zj0 c11961zj0 = this.f343f;
        if (c11961zj0 != null) {
            c11961zj0.notifyDataSetChanged();
        }
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public final void onItemClick(AdapterView adapterView, View view, int i, long j) {
        this.f340c.m1418q(this.f343f.getItem(i), this, 0);
    }
}
