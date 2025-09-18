package p000;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.FrameLayout;
import androidx.fragment.app.AbstractActivityC1730l;
import androidx.fragment.app.Fragment;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.bridge.UiThreadUtil;
import com.swmansion.rnscreens.bottomsheet.DimmingFragment;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;

@Metadata(m22266d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0016\u0018\u00002\u00020\u00012\u00020\u0002:\u0002\u0005\u0006B\t\b\u0016¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0007"}, m22267d2 = {"LiW0;", "Landroidx/fragment/app/Fragment;", "LjW0;", "<init>", "()V", "gW0", "hW0", "react-native-screens_release"}, m22268k = 1, m22269mv = {1, 9, 0}, m22271xi = 48)
/* renamed from: iW0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public class C9763iW0 extends Fragment implements InterfaceC9891jW0 {

    /* renamed from: a */
    public final RV0 f29290a;

    /* renamed from: b */
    public final ArrayList f29291b;

    /* renamed from: c */
    public boolean f29292c;

    /* renamed from: d */
    public float f29293d;

    /* renamed from: e */
    public boolean f29294e;

    /* renamed from: f */
    public boolean f29295f;

    /* renamed from: g */
    public boolean f29296g;

    public C9763iW0() {
        this.f29291b = new ArrayList();
        this.f29293d = -1.0f;
        this.f29294e = true;
        this.f29295f = true;
        throw new IllegalStateException("Screen fragments should never be restored. Follow instructions from https://github.com/software-mansion/react-native-screens/issues/17#issuecomment-424704067 to properly configure your main activity.");
    }

    @Override // p000.InterfaceC9891jW0
    /* renamed from: a */
    public final void mo13722a(EnumC9507gW0 enumC9507gW0) {
        int iOrdinal = enumC9507gW0.ordinal();
        if (iOrdinal == 0) {
            this.f29295f = false;
            return;
        }
        if (iOrdinal == 1) {
            this.f29294e = false;
        } else if (iOrdinal == 2) {
            this.f29295f = true;
        } else {
            if (iOrdinal != 3) {
                return;
            }
            this.f29294e = true;
        }
    }

    @Override // p000.InterfaceC9891jW0
    /* renamed from: b */
    public final void mo13723b(SV0 sv0) {
        O90.m5968f(sv0, "container");
        this.f29291b.remove(sv0);
    }

    @Override // androidx.fragment.app.Fragment, p000.InterfaceC9891jW0
    /* renamed from: c */
    public final Activity mo10005c() {
        Fragment fragment;
        AbstractActivityC1730l activity;
        AbstractActivityC1730l activity2 = getActivity();
        if (activity2 != null) {
            return activity2;
        }
        Context context = mo13727h().getContext();
        if (context instanceof ReactContext) {
            ReactContext reactContext = (ReactContext) context;
            if (reactContext.getCurrentActivity() != null) {
                return reactContext.getCurrentActivity();
            }
        }
        for (ViewParent container = mo13727h().getContainer(); container != null; container = container.getParent()) {
            if ((container instanceof RV0) && (fragment = ((RV0) container).getFragment()) != null && (activity = fragment.getActivity()) != null) {
                return activity;
            }
        }
        return null;
    }

    @Override // p000.InterfaceC9891jW0
    /* renamed from: e */
    public final ReactContext mo13725e() {
        if (getContext() instanceof ReactContext) {
            Context context = getContext();
            O90.m5966d(context, "null cannot be cast to non-null type com.facebook.react.bridge.ReactContext");
            return (ReactContext) context;
        }
        if (mo13727h().getContext() instanceof ReactContext) {
            Context context2 = mo13727h().getContext();
            O90.m5966d(context2, "null cannot be cast to non-null type com.facebook.react.bridge.ReactContext");
            return (ReactContext) context2;
        }
        for (ViewParent container = mo13727h().getContainer(); container != null; container = container.getParent()) {
            if (container instanceof RV0) {
                RV0 rv0 = (RV0) container;
                if (rv0.getContext() instanceof ReactContext) {
                    Context context3 = rv0.getContext();
                    O90.m5966d(context3, "null cannot be cast to non-null type com.facebook.react.bridge.ReactContext");
                    return (ReactContext) context3;
                }
            }
        }
        return null;
    }

    @Override // p000.InterfaceC9891jW0
    /* renamed from: g */
    public final void mo13726g(EnumC9507gW0 enumC9507gW0) {
        InterfaceC9891jW0 fragmentWrapper;
        ArrayList arrayList = this.f29291b;
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
                m19055s(enumC9507gW0, fragmentWrapper);
            }
        }
    }

    @Override // p000.InterfaceC9891jW0
    /* renamed from: h */
    public final RV0 mo13727h() {
        RV0 rv0 = this.f29290a;
        if (rv0 != null) {
            return rv0;
        }
        O90.m5977o("screen");
        throw null;
    }

    @Override // p000.InterfaceC9891jW0
    /* renamed from: i */
    public final void mo13728i(SV0 sv0) {
        O90.m5968f(sv0, "container");
        this.f29291b.add(sv0);
    }

    @Override // p000.InterfaceC9891jW0
    /* renamed from: j */
    public final List getF20260i() {
        return this.f29291b;
    }

    @Override // p000.InterfaceC9891jW0
    /* renamed from: l */
    public void mo13730l() {
        AbstractActivityC1730l activity = getActivity();
        if (activity == null) {
            this.f29292c = true;
        } else {
            QB1.m6610m(mo13727h(), activity, mo13725e());
        }
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        O90.m5968f(layoutInflater, "inflater");
        mo13727h().setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        Context context = getContext();
        if (context == null) {
            return null;
        }
        C9635hW0 c9635hW0 = new C9635hW0(context);
        RV0 rv0Mo13727h = mo13727h();
        G02.m2880b(rv0Mo13727h);
        c9635hW0.addView(rv0Mo13727h);
        return c9635hW0;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onDestroy() {
        super.onDestroy();
        SV0 container = mo13727h().getContainer();
        if (container == null || !container.mo7377c(mo13727h().getFragmentWrapper())) {
            Context context = mo13727h().getContext();
            if (context instanceof ReactContext) {
                int iM6093d = OZ1.m6093d(context);
                InterfaceC6947uP interfaceC6947uPM6091b = OZ1.m6091b((ReactContext) context, mo13727h().getId());
                if (interfaceC6947uPM6091b != null) {
                    interfaceC6947uPM6091b.mo11046g(new C6846so(iM6093d, mo13727h().getId(), 18));
                }
            }
        }
        this.f29291b.clear();
    }

    @Override // androidx.fragment.app.Fragment
    public final void onResume() {
        super.onResume();
        if (this.f29292c) {
            this.f29292c = false;
            QB1.m6610m(mo13727h(), mo10005c(), mo13725e());
        }
    }

    /* renamed from: r */
    public final void m19054r() {
        Context context = mo13727h().getContext();
        O90.m5966d(context, "null cannot be cast to non-null type com.facebook.react.bridge.ReactContext");
        ReactContext reactContext = (ReactContext) context;
        int iM6093d = OZ1.m6093d(reactContext);
        InterfaceC6947uP interfaceC6947uPM6091b = OZ1.m6091b(reactContext, mo13727h().getId());
        if (interfaceC6947uPM6091b != null) {
            interfaceC6947uPM6091b.mo11046g(new C6846so(iM6093d, mo13727h().getId(), 9));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0023  */
    /* renamed from: s */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void m19055s(p000.EnumC9507gW0 r7, p000.InterfaceC9891jW0 r8) {
        /*
            r6 = this;
            java.lang.String r0 = "fragmentWrapper"
            p000.O90.m5968f(r8, r0)
            androidx.fragment.app.Fragment r0 = r8.mo13724d()
            boolean r1 = r0 instanceof p000.C10659pW0
            if (r1 == 0) goto La6
            pW0 r0 = (p000.C10659pW0) r0
            int r1 = r7.ordinal()
            r2 = 3
            r3 = 2
            r4 = 1
            if (r1 == 0) goto L33
            if (r1 == r4) goto L30
            r5 = 0
            if (r1 == r3) goto L2b
            if (r1 != r2) goto L25
            boolean r1 = r0.f29294e
            if (r1 != 0) goto L35
        L23:
            r5 = r4
            goto L35
        L25:
            sg r7 = new sg
            r7.<init>()
            throw r7
        L2b:
            boolean r1 = r0.f29295f
            if (r1 != 0) goto L35
            goto L23
        L30:
            boolean r5 = r0.f29294e
            goto L35
        L33:
            boolean r5 = r0.f29295f
        L35:
            if (r5 == 0) goto La6
            RV0 r0 = r0.mo13727h()
            r8.mo13722a(r7)
            int r1 = p000.OZ1.m6094e(r0)
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
            RV0 r0 = r6.mo13727h()
            android.content.Context r0 = r0.getContext()
            java.lang.String r1 = "null cannot be cast to non-null type com.facebook.react.bridge.ReactContext"
            p000.O90.m5966d(r0, r1)
            com.facebook.react.bridge.ReactContext r0 = (com.facebook.react.bridge.ReactContext) r0
            RV0 r1 = r6.mo13727h()
            int r1 = r1.getId()
            uP r0 = p000.OZ1.m6091b(r0, r1)
            if (r0 == 0) goto La3
            r0.mo11046g(r2)
        La3:
            r8.mo13726g(r7)
        La6:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.C9763iW0.m19055s(gW0, jW0):void");
    }

    /* renamed from: t */
    public final void m19056t(float f, boolean z) {
        if (!(this instanceof C10659pW0) || this.f29293d == f) {
            return;
        }
        float fMax = Math.max(0.0f, Math.min(1.0f, f));
        this.f29293d = fMax;
        short s = (short) (fMax == 0.0f ? 1 : fMax == 1.0f ? 2 : 3);
        SV0 container = mo13727h().getContainer();
        boolean goingForward = container instanceof C10275mW0 ? ((C10275mW0) container).getGoingForward() : false;
        Context context = mo13727h().getContext();
        O90.m5966d(context, "null cannot be cast to non-null type com.facebook.react.bridge.ReactContext");
        ReactContext reactContext = (ReactContext) context;
        InterfaceC6947uP interfaceC6947uPM6091b = OZ1.m6091b(reactContext, mo13727h().getId());
        if (interfaceC6947uPM6091b != null) {
            interfaceC6947uPM6091b.mo11046g(new AW0(OZ1.m6093d(reactContext), mo13727h().getId(), this.f29293d, z, goingForward, s));
        }
    }

    /* renamed from: u */
    public final void m19057u(boolean z) {
        Fragment parentFragment;
        this.f29296g = !z;
        if (getParentFragment() instanceof DimmingFragment) {
            Fragment parentFragment2 = getParentFragment();
            parentFragment = parentFragment2 != null ? parentFragment2.getParentFragment() : null;
        } else {
            parentFragment = getParentFragment();
        }
        if (parentFragment == null || ((parentFragment instanceof C9763iW0) && !((C9763iW0) parentFragment).f29296g)) {
            if (isResumed()) {
                UiThreadUtil.runOnUiThread(new RunnableC7273za(z, this, 6));
            } else if (z) {
                m19055s(EnumC9507gW0.f27824c, this);
                m19056t(1.0f, true);
            } else {
                m19055s(EnumC9507gW0.f27825d, this);
                m19056t(0.0f, true);
            }
        }
    }

    public C9763iW0(RV0 rv0) {
        O90.m5968f(rv0, "screenView");
        this.f29291b = new ArrayList();
        this.f29293d = -1.0f;
        this.f29294e = true;
        this.f29295f = true;
        this.f29290a = rv0;
    }

    @Override // p000.InterfaceC9891jW0
    /* renamed from: d */
    public final Fragment mo13724d() {
        return this;
    }
}
