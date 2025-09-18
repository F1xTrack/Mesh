package p000;

import android.app.Dialog;
import android.content.DialogInterface;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.Window;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.UIManager;
import com.facebook.react.views.view.C1932a;
import com.yandex.varioqub.config.model.ConfigValue;

/* renamed from: is0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C9807is0 implements InterfaceC7136xP {

    /* renamed from: a */
    public final C3924dN f34784a;

    /* renamed from: b */
    public final S91 f34785b;

    /* renamed from: c */
    public final C8416Vf0 f34786c;

    /* renamed from: d */
    public final C1648aB f34787d;

    /* renamed from: e */
    public final UIManager f34788e;

    /* renamed from: f */
    public final InterfaceC6947uP f34789f;

    public C9807is0(C3924dN c3924dN, S91 s91, C8416Vf0 c8416Vf0, C1648aB c1648aB) {
        O90.m5968f(s91, "reactContext");
        this.f34784a = c3924dN;
        this.f34785b = s91;
        this.f34786c = c8416Vf0;
        this.f34787d = c1648aB;
        ReactApplicationContext reactApplicationContext = s91.f10602a;
        this.f34788e = OZ1.m6095f(reactApplicationContext, 1, true);
        this.f34789f = OZ1.m6090a(reactApplicationContext, 1);
    }

    @Override // p000.InterfaceC7136xP
    public final void onEventDispatch(AbstractC6550oP abstractC6550oP) {
        View decorView;
        View viewResolveView;
        O90.m5968f(abstractC6550oP, "event");
        if (O90.m5963a(abstractC6550oP.getEventName(), "topShow")) {
            View rootView = null;
            try {
                UIManager uIManager = this.f34788e;
                viewResolveView = uIManager != null ? uIManager.resolveView(abstractC6550oP.getViewTag()) : null;
            } catch (Exception unused) {
                boolean z = AbstractC9935js0.f35431a;
                O90.m5968f("Can not resolve view for Modal#" + abstractC6550oP.getViewTag(), "message");
            }
            C8968cL0 c8968cL0 = viewResolveView instanceof C8968cL0 ? (C8968cL0) viewResolveView : null;
            if (c8968cL0 == null) {
                return;
            }
            Dialog dialog = c8968cL0.getDialog();
            Window window = dialog != null ? dialog.getWindow() : null;
            if (window != null && (decorView = window.getDecorView()) != null) {
                rootView = decorView.getRootView();
            }
            ViewGroup viewGroup = (ViewGroup) rootView;
            if (viewGroup != null) {
                S91 s91 = this.f34785b;
                final C1932a c1932a = new C1932a(s91);
                c1932a.setLayoutParams(new ViewGroup.LayoutParams(0, 0));
                final C8364Uf0 c8364Uf0 = new C8364Uf0(this.f34784a, viewGroup, s91, this.f34786c);
                viewGroup.addView(c1932a);
                if (AbstractC9935js0.f35431a) {
                    C8364Uf0 c8364Uf02 = (C8364Uf0) this.f34787d.invoke();
                    if (c8364Uf02 != null) {
                        c8364Uf02.f11968m = true;
                    }
                    AbstractC10944rk1.m24484p(viewGroup, c8364Uf0);
                    AbstractC9536gk1.m18626u(c1932a, c8364Uf0);
                    c8364Uf0.m8113e(Boolean.FALSE, Double.valueOf(ConfigValue.DOUBLE_DEFAULT_VALUE));
                }
                if (dialog != null) {
                    dialog.setOnDismissListener(new DialogInterface.OnDismissListener() { // from class: hs0
                        @Override // android.content.DialogInterface.OnDismissListener
                        public final void onDismiss(DialogInterface dialogInterface) {
                            C8364Uf0 c8364Uf03 = c8364Uf0;
                            C1932a c1932a2 = c1932a;
                            C9807is0 c9807is0 = this;
                            O90.m5968f(c9807is0, "this$0");
                            c8364Uf03.m8113e(null, null);
                            c8364Uf03.f11957b.getViewTreeObserver().removeOnGlobalFocusChangeListener(c8364Uf03.f11969n);
                            C0851NW c0851nw = c8364Uf03.f11970o;
                            if (c0851nw != null) {
                                c0851nw.f7843a.getViewTreeObserver().removeOnGlobalFocusChangeListener(c0851nw.f7854l);
                            }
                            ViewParent parent = c1932a2.getParent();
                            ViewGroup viewGroup2 = parent instanceof ViewGroup ? (ViewGroup) parent : null;
                            if (viewGroup2 != null) {
                                viewGroup2.removeView(c1932a2);
                            }
                            C8364Uf0 c8364Uf04 = (C8364Uf0) c9807is0.f34787d.invoke();
                            if (c8364Uf04 != null) {
                                c8364Uf04.f11968m = false;
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
