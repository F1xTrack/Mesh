package defpackage;

import android.app.Dialog;
import android.content.DialogInterface;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.Window;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.UIManager;
import com.facebook.react.views.view.a;
import com.yandex.varioqub.config.model.ConfigValue;

/* renamed from: is0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C5203is0 implements InterfaceC7976xP {
    public final C3378dN a;
    public final S91 b;
    public final C1673Vf0 c;
    public final C2085aB d;
    public final UIManager e;
    public final InterfaceC7405uP f;

    public C5203is0(C3378dN c3378dN, S91 s91, C1673Vf0 c1673Vf0, C2085aB c2085aB) {
        O90.f(s91, "reactContext");
        this.a = c3378dN;
        this.b = s91;
        this.c = c1673Vf0;
        this.d = c2085aB;
        ReactApplicationContext reactApplicationContext = s91.a;
        this.e = OZ1.f(reactApplicationContext, 1, true);
        this.f = OZ1.a(reactApplicationContext, 1);
    }

    @Override // defpackage.InterfaceC7976xP
    public final void onEventDispatch(AbstractC6260oP abstractC6260oP) {
        View decorView;
        View viewResolveView;
        O90.f(abstractC6260oP, "event");
        if (O90.a(abstractC6260oP.getEventName(), "topShow")) {
            View rootView = null;
            try {
                UIManager uIManager = this.e;
                viewResolveView = uIManager != null ? uIManager.resolveView(abstractC6260oP.getViewTag()) : null;
            } catch (Exception unused) {
                boolean z = AbstractC5393js0.a;
                O90.f("Can not resolve view for Modal#" + abstractC6260oP.getViewTag(), "message");
            }
            C2497cL0 c2497cL0 = viewResolveView instanceof C2497cL0 ? (C2497cL0) viewResolveView : null;
            if (c2497cL0 == null) {
                return;
            }
            Dialog dialog = c2497cL0.getDialog();
            Window window = dialog != null ? dialog.getWindow() : null;
            if (window != null && (decorView = window.getDecorView()) != null) {
                rootView = decorView.getRootView();
            }
            ViewGroup viewGroup = (ViewGroup) rootView;
            if (viewGroup != null) {
                S91 s91 = this.b;
                final a aVar = new a(s91);
                aVar.setLayoutParams(new ViewGroup.LayoutParams(0, 0));
                final C1595Uf0 c1595Uf0 = new C1595Uf0(this.a, viewGroup, s91, this.c);
                viewGroup.addView(aVar);
                if (AbstractC5393js0.a) {
                    C1595Uf0 c1595Uf02 = (C1595Uf0) this.d.invoke();
                    if (c1595Uf02 != null) {
                        c1595Uf02.m = true;
                    }
                    AbstractC6897rk1.p(viewGroup, c1595Uf0);
                    AbstractC4021gk1.u(aVar, c1595Uf0);
                    c1595Uf0.e(Boolean.FALSE, Double.valueOf(ConfigValue.DOUBLE_DEFAULT_VALUE));
                }
                if (dialog != null) {
                    dialog.setOnDismissListener(new DialogInterface.OnDismissListener() { // from class: hs0
                        @Override // android.content.DialogInterface.OnDismissListener
                        public final void onDismiss(DialogInterface dialogInterface) {
                            C1595Uf0 c1595Uf03 = c1595Uf0;
                            a aVar2 = aVar;
                            C5203is0 c5203is0 = this;
                            O90.f(c5203is0, "this$0");
                            c1595Uf03.e(null, null);
                            c1595Uf03.b.getViewTreeObserver().removeOnGlobalFocusChangeListener(c1595Uf03.n);
                            NW nw = c1595Uf03.o;
                            if (nw != null) {
                                nw.a.getViewTreeObserver().removeOnGlobalFocusChangeListener(nw.l);
                            }
                            ViewParent parent = aVar2.getParent();
                            ViewGroup viewGroup2 = parent instanceof ViewGroup ? (ViewGroup) parent : null;
                            if (viewGroup2 != null) {
                                viewGroup2.removeView(aVar2);
                            }
                            C1595Uf0 c1595Uf04 = (C1595Uf0) c5203is0.d.invoke();
                            if (c1595Uf04 != null) {
                                c1595Uf04.m = false;
                            }
                        }
                    });
                }
                if (window != null) {
                    window.setSoftInputMode(48);
                }
            }
        }
    }
}
