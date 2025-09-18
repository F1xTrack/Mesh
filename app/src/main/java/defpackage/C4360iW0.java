package defpackage;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.FrameLayout;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.l;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.bridge.UiThreadUtil;
import com.swmansion.rnscreens.bottomsheet.DimmingFragment;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0016\u0018\u00002\u00020\u00012\u00020\u0002:\u0002\u0005\u0006B\t\b\u0016¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0007"}, d2 = {"LiW0;", "Landroidx/fragment/app/Fragment;", "LjW0;", "<init>", "()V", "gW0", "hW0", "react-native-screens_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: iW0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public class C4360iW0 extends Fragment implements InterfaceC5327jW0 {
    public final RV0 a;
    public final ArrayList b;
    public boolean c;
    public float d;
    public boolean e;
    public boolean f;
    public boolean g;

    public C4360iW0() {
        this.b = new ArrayList();
        this.d = -1.0f;
        this.e = true;
        this.f = true;
        throw new IllegalStateException("Screen fragments should never be restored. Follow instructions from https://github.com/software-mansion/react-native-screens/issues/17#issuecomment-424704067 to properly configure your main activity.");
    }

    @Override // defpackage.InterfaceC5327jW0
    public final void a(EnumC3978gW0 enumC3978gW0) {
        int iOrdinal = enumC3978gW0.ordinal();
        if (iOrdinal == 0) {
            this.f = false;
            return;
        }
        if (iOrdinal == 1) {
            this.e = false;
        } else if (iOrdinal == 2) {
            this.f = true;
        } else {
            if (iOrdinal != 3) {
                return;
            }
            this.e = true;
        }
    }

    @Override // defpackage.InterfaceC5327jW0
    public final void b(SV0 sv0) {
        O90.f(sv0, "container");
        this.b.remove(sv0);
    }

    @Override // androidx.fragment.app.Fragment, defpackage.InterfaceC5327jW0
    public final Activity c() {
        Fragment fragment;
        l activity;
        l activity2 = getActivity();
        if (activity2 != null) {
            return activity2;
        }
        Context context = h().getContext();
        if (context instanceof ReactContext) {
            ReactContext reactContext = (ReactContext) context;
            if (reactContext.getCurrentActivity() != null) {
                return reactContext.getCurrentActivity();
            }
        }
        for (ViewParent container = h().getContainer(); container != null; container = container.getParent()) {
            if ((container instanceof RV0) && (fragment = ((RV0) container).getFragment()) != null && (activity = fragment.getActivity()) != null) {
                return activity;
            }
        }
        return null;
    }

    @Override // defpackage.InterfaceC5327jW0
    public final ReactContext e() {
        if (getContext() instanceof ReactContext) {
            Context context = getContext();
            O90.d(context, "null cannot be cast to non-null type com.facebook.react.bridge.ReactContext");
            return (ReactContext) context;
        }
        if (h().getContext() instanceof ReactContext) {
            Context context2 = h().getContext();
            O90.d(context2, "null cannot be cast to non-null type com.facebook.react.bridge.ReactContext");
            return (ReactContext) context2;
        }
        for (ViewParent container = h().getContainer(); container != null; container = container.getParent()) {
            if (container instanceof RV0) {
                RV0 rv0 = (RV0) container;
                if (rv0.getContext() instanceof ReactContext) {
                    Context context3 = rv0.getContext();
                    O90.d(context3, "null cannot be cast to non-null type com.facebook.react.bridge.ReactContext");
                    return (ReactContext) context3;
                }
            }
        }
        return null;
    }

    @Override // defpackage.InterfaceC5327jW0
    public final void g(EnumC3978gW0 enumC3978gW0) {
        InterfaceC5327jW0 fragmentWrapper;
        ArrayList arrayList = this.b;
        ArrayList arrayList2 = new ArrayList();
        for (Object obj : arrayList) {
            if (((SV0) obj).getScreenCount() > 0) {
                arrayList2.add(obj);
            }
        }
        Iterator it = arrayList2.iterator();
        while (it.hasNext()) {
            RV0 topScreen = ((SV0) it.next()).getTopScreen();
            if (topScreen != null && (fragmentWrapper = topScreen.getFragmentWrapper()) != null) {
                s(enumC3978gW0, fragmentWrapper);
            }
        }
    }

    @Override // defpackage.InterfaceC5327jW0
    public final RV0 h() {
        RV0 rv0 = this.a;
        if (rv0 != null) {
            return rv0;
        }
        O90.o("screen");
        throw null;
    }

    @Override // defpackage.InterfaceC5327jW0
    public final void i(SV0 sv0) {
        O90.f(sv0, "container");
        this.b.add(sv0);
    }

    @Override // defpackage.InterfaceC5327jW0
    /* renamed from: j */
    public final List getI() {
        return this.b;
    }

    @Override // defpackage.InterfaceC5327jW0
    public void l() {
        l activity = getActivity();
        if (activity == null) {
            this.c = true;
        } else {
            QB1.m(h(), activity, e());
        }
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        O90.f(layoutInflater, "inflater");
        h().setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        Context context = getContext();
        if (context == null) {
            return null;
        }
        C4169hW0 c4169hW0 = new C4169hW0(context);
        RV0 rv0H = h();
        G02.b(rv0H);
        c4169hW0.addView(rv0H);
        return c4169hW0;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onDestroy() {
        super.onDestroy();
        SV0 container = h().getContainer();
        if (container == null || !container.c(h().getFragmentWrapper())) {
            Context context = h().getContext();
            if (context instanceof ReactContext) {
                int iD = OZ1.d(context);
                InterfaceC7405uP interfaceC7405uPB = OZ1.b((ReactContext) context, h().getId());
                if (interfaceC7405uPB != null) {
                    interfaceC7405uPB.g(new C7098so(iD, h().getId(), 18));
                }
            }
        }
        this.b.clear();
    }

    @Override // androidx.fragment.app.Fragment
    public final void onResume() {
        super.onResume();
        if (this.c) {
            this.c = false;
            QB1.m(h(), c(), e());
        }
    }

    public final void r() {
        Context context = h().getContext();
        O90.d(context, "null cannot be cast to non-null type com.facebook.react.bridge.ReactContext");
        ReactContext reactContext = (ReactContext) context;
        int iD = OZ1.d(reactContext);
        InterfaceC7405uP interfaceC7405uPB = OZ1.b(reactContext, h().getId());
        if (interfaceC7405uPB != null) {
            interfaceC7405uPB.g(new C7098so(iD, h().getId(), 9));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void s(defpackage.EnumC3978gW0 r7, defpackage.InterfaceC5327jW0 r8) {
        /*
            r6 = this;
            java.lang.String r0 = "fragmentWrapper"
            defpackage.O90.f(r8, r0)
            androidx.fragment.app.Fragment r0 = r8.d()
            boolean r1 = r0 instanceof defpackage.C6473pW0
            if (r1 == 0) goto La6
            pW0 r0 = (defpackage.C6473pW0) r0
            int r1 = r7.ordinal()
            r2 = 3
            r3 = 2
            r4 = 1
            if (r1 == 0) goto L33
            if (r1 == r4) goto L30
            r5 = 0
            if (r1 == r3) goto L2b
            if (r1 != r2) goto L25
            boolean r1 = r0.e
            if (r1 != 0) goto L35
        L23:
            r5 = r4
            goto L35
        L25:
            sg r7 = new sg
            r7.<init>()
            throw r7
        L2b:
            boolean r1 = r0.f
            if (r1 != 0) goto L35
            goto L23
        L30:
            boolean r5 = r0.e
            goto L35
        L33:
            boolean r5 = r0.f
        L35:
            if (r5 == 0) goto La6
            RV0 r0 = r0.h()
            r8.a(r7)
            int r1 = defpackage.OZ1.e(r0)
            int r5 = r7.ordinal()
            if (r5 == 0) goto L78
            if (r5 == r4) goto L6c
            if (r5 == r3) goto L60
            if (r5 != r2) goto L5a
            so r2 = new so
            int r0 = r0.getId()
            r3 = 20
            r2.<init>(r1, r0, r3)
            goto L83
        L5a:
            sg r7 = new sg
            r7.<init>()
            throw r7
        L60:
            so r2 = new so
            int r0 = r0.getId()
            r3 = 17
            r2.<init>(r1, r0, r3)
            goto L83
        L6c:
            so r2 = new so
            int r0 = r0.getId()
            r3 = 19
            r2.<init>(r1, r0, r3)
            goto L83
        L78:
            so r2 = new so
            int r0 = r0.getId()
            r3 = 16
            r2.<init>(r1, r0, r3)
        L83:
            RV0 r0 = r6.h()
            android.content.Context r0 = r0.getContext()
            java.lang.String r1 = "null cannot be cast to non-null type com.facebook.react.bridge.ReactContext"
            defpackage.O90.d(r0, r1)
            com.facebook.react.bridge.ReactContext r0 = (com.facebook.react.bridge.ReactContext) r0
            RV0 r1 = r6.h()
            int r1 = r1.getId()
            uP r0 = defpackage.OZ1.b(r0, r1)
            if (r0 == 0) goto La3
            r0.g(r2)
        La3:
            r8.g(r7)
        La6:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C4360iW0.s(gW0, jW0):void");
    }

    public final void t(float f, boolean z) {
        if (!(this instanceof C6473pW0) || this.d == f) {
            return;
        }
        float fMax = Math.max(0.0f, Math.min(1.0f, f));
        this.d = fMax;
        short s = (short) (fMax == 0.0f ? 1 : fMax == 1.0f ? 2 : 3);
        SV0 container = h().getContainer();
        boolean goingForward = container instanceof C5900mW0 ? ((C5900mW0) container).getGoingForward() : false;
        Context context = h().getContext();
        O90.d(context, "null cannot be cast to non-null type com.facebook.react.bridge.ReactContext");
        ReactContext reactContext = (ReactContext) context;
        InterfaceC7405uP interfaceC7405uPB = OZ1.b(reactContext, h().getId());
        if (interfaceC7405uPB != null) {
            interfaceC7405uPB.g(new AW0(OZ1.d(reactContext), h().getId(), this.d, z, goingForward, s));
        }
    }

    public final void u(boolean z) {
        Fragment parentFragment;
        this.g = !z;
        if (getParentFragment() instanceof DimmingFragment) {
            Fragment parentFragment2 = getParentFragment();
            parentFragment = parentFragment2 != null ? parentFragment2.getParentFragment() : null;
        } else {
            parentFragment = getParentFragment();
        }
        if (parentFragment == null || ((parentFragment instanceof C4360iW0) && !((C4360iW0) parentFragment).g)) {
            if (isResumed()) {
                UiThreadUtil.runOnUiThread(new RunnableC8389za(z, this, 6));
            } else if (z) {
                s(EnumC3978gW0.c, this);
                t(1.0f, true);
            } else {
                s(EnumC3978gW0.d, this);
                t(0.0f, true);
            }
        }
    }

    public C4360iW0(RV0 rv0) {
        O90.f(rv0, "screenView");
        this.b = new ArrayList();
        this.d = -1.0f;
        this.e = true;
        this.f = true;
        this.a = rv0;
    }

    @Override // defpackage.InterfaceC5327jW0
    public final Fragment d() {
        return this;
    }
}
