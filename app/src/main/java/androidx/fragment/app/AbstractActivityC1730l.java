package androidx.fragment.app;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.MenuItem;
import android.view.View;
import androidx.fragment.app.AbstractActivityC1730l;
import androidx.lifecycle.C1742a;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import p000.AbstractActivityC0499Hv;
import p000.AbstractC10815qk0;
import p000.C1418WX;
import p000.C6244jY;
import p000.C7042vv;
import p000.C7105wv;
import p000.C9432fw1;
import p000.EnumC7382Bi0;
import p000.EnumC7434Ci0;
import p000.InterfaceC0192D2;
import p000.InterfaceC6650py;

/* renamed from: androidx.fragment.app.l */
/* loaded from: classes.dex */
public abstract class AbstractActivityC1730l extends AbstractActivityC0499Hv implements InterfaceC0192D2 {

    /* renamed from: c */
    public boolean f16194c;

    /* renamed from: d */
    public boolean f16195d;

    /* renamed from: a */
    public final C9432fw1 f16192a = new C9432fw1(16, new C1418WX(this));

    /* renamed from: b */
    public final C1742a f16193b = new C1742a(this);

    /* renamed from: e */
    public boolean f16196e = true;

    public AbstractActivityC1730l() {
        getSavedStateRegistry().m22443c("android:support:lifecycle", new C7042vv(1, this));
        final int i = 0;
        addOnConfigurationChangedListener(new InterfaceC6650py(this) { // from class: VX

            /* renamed from: b */
            public final /* synthetic */ AbstractActivityC1730l f12607b;

            {
                this.f12607b = this;
            }

            @Override // p000.InterfaceC6650py
            /* renamed from: b */
            public final void mo3020b(Object obj) {
                switch (i) {
                    case 0:
                        this.f12607b.f16192a.m18336g();
                        break;
                    default:
                        this.f12607b.f16192a.m18336g();
                        break;
                }
            }
        });
        final int i2 = 1;
        addOnNewIntentListener(new InterfaceC6650py(this) { // from class: VX

            /* renamed from: b */
            public final /* synthetic */ AbstractActivityC1730l f12607b;

            {
                this.f12607b = this;
            }

            @Override // p000.InterfaceC6650py
            /* renamed from: b */
            public final void mo3020b(Object obj) {
                switch (i2) {
                    case 0:
                        this.f12607b.f16192a.m18336g();
                        break;
                    default:
                        this.f12607b.f16192a.m18336g();
                        break;
                }
            }
        });
        addOnContextAvailableListener(new C7105wv(this, 1));
    }

    /* renamed from: f */
    public static boolean m10033f(AbstractC1733o abstractC1733o) {
        EnumC7434Ci0 enumC7434Ci0 = EnumC7434Ci0.f1588c;
        boolean zM10033f = false;
        for (Fragment fragment : abstractC1733o.f16215c.m10112f()) {
            if (fragment != null) {
                if (fragment.getHost() != null) {
                    zM10033f |= m10033f(fragment.getChildFragmentManager());
                }
                C1738t c1738t = fragment.mViewLifecycleOwner;
                EnumC7434Ci0 enumC7434Ci02 = EnumC7434Ci0.f1589d;
                if (c1738t != null) {
                    c1738t.m10117b();
                    if (c1738t.f16273e.f16309c.compareTo(enumC7434Ci02) >= 0) {
                        C1742a c1742a = fragment.mViewLifecycleOwner.f16273e;
                        c1742a.m10125d("setCurrentState");
                        c1742a.m10127f(enumC7434Ci0);
                        zM10033f = true;
                    }
                }
                if (fragment.mLifecycleRegistry.f16309c.compareTo(enumC7434Ci02) >= 0) {
                    C1742a c1742a2 = fragment.mLifecycleRegistry;
                    c1742a2.m10125d("setCurrentState");
                    c1742a2.m10127f(enumC7434Ci0);
                    zM10033f = true;
                }
            }
        }
        return zM10033f;
    }

    @Override // android.app.Activity
    public final void dump(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        super.dump(str, fileDescriptor, printWriter, strArr);
        if (shouldDumpInternalState(strArr)) {
            printWriter.print(str);
            printWriter.print("Local FragmentActivity ");
            printWriter.print(Integer.toHexString(System.identityHashCode(this)));
            printWriter.println(" State:");
            String str2 = str + "  ";
            printWriter.print(str2);
            printWriter.print("mCreated=");
            printWriter.print(this.f16194c);
            printWriter.print(" mResumed=");
            printWriter.print(this.f16195d);
            printWriter.print(" mStopped=");
            printWriter.print(this.f16196e);
            if (getApplication() != null) {
                AbstractC10815qk0.m24054a(this).m24976b(str2, fileDescriptor, printWriter, strArr);
            }
            ((C1418WX) this.f16192a.f27505b).f14959d.m10085u(str, fileDescriptor, printWriter, strArr);
        }
    }

    /* renamed from: e */
    public final C6244jY m10034e() {
        return ((C1418WX) this.f16192a.f27505b).f14959d;
    }

    @Override // p000.AbstractActivityC0499Hv, android.app.Activity
    public void onActivityResult(int i, int i2, Intent intent) {
        this.f16192a.m18336g();
        super.onActivityResult(i, i2, intent);
    }

    @Override // p000.AbstractActivityC0499Hv, p000.AbstractActivityC0436Gv, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f16193b.m10126e(EnumC7382Bi0.ON_CREATE);
        C6244jY c6244jY = ((C1418WX) this.f16192a.f27505b).f14959d;
        c6244jY.f16204E = false;
        c6244jY.f16205F = false;
        c6244jY.f16211L.f16245i = false;
        c6244jY.m10084t(1);
    }

    @Override // android.app.Activity, android.view.LayoutInflater.Factory2
    public final View onCreateView(View view, String str, Context context, AttributeSet attributeSet) {
        View viewOnCreateView = ((C1418WX) this.f16192a.f27505b).f14959d.f16218f.onCreateView(view, str, context, attributeSet);
        return viewOnCreateView == null ? super.onCreateView(view, str, context, attributeSet) : viewOnCreateView;
    }

    @Override // android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        ((C1418WX) this.f16192a.f27505b).f14959d.m10075k();
        this.f16193b.m10126e(EnumC7382Bi0.ON_DESTROY);
    }

    @Override // p000.AbstractActivityC0499Hv, android.app.Activity, android.view.Window.Callback
    public boolean onMenuItemSelected(int i, MenuItem menuItem) {
        if (super.onMenuItemSelected(i, menuItem)) {
            return true;
        }
        if (i == 6) {
            return ((C1418WX) this.f16192a.f27505b).f14959d.m10073i(menuItem);
        }
        return false;
    }

    @Override // android.app.Activity
    public void onPause() {
        super.onPause();
        this.f16195d = false;
        ((C1418WX) this.f16192a.f27505b).f14959d.m10084t(5);
        this.f16193b.m10126e(EnumC7382Bi0.ON_PAUSE);
    }

    @Override // android.app.Activity
    public void onPostResume() {
        super.onPostResume();
        this.f16193b.m10126e(EnumC7382Bi0.ON_RESUME);
        C6244jY c6244jY = ((C1418WX) this.f16192a.f27505b).f14959d;
        c6244jY.f16204E = false;
        c6244jY.f16205F = false;
        c6244jY.f16211L.f16245i = false;
        c6244jY.m10084t(7);
    }

    @Override // p000.AbstractActivityC0499Hv, android.app.Activity
    public void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        this.f16192a.m18336g();
        super.onRequestPermissionsResult(i, strArr, iArr);
    }

    @Override // android.app.Activity
    public void onResume() {
        C9432fw1 c9432fw1 = this.f16192a;
        c9432fw1.m18336g();
        super.onResume();
        this.f16195d = true;
        ((C1418WX) c9432fw1.f27505b).f14959d.m10088x(true);
    }

    @Override // android.app.Activity
    public void onStart() {
        C9432fw1 c9432fw1 = this.f16192a;
        c9432fw1.m18336g();
        super.onStart();
        this.f16196e = false;
        boolean z = this.f16194c;
        C1418WX c1418wx = (C1418WX) c9432fw1.f27505b;
        if (!z) {
            this.f16194c = true;
            C6244jY c6244jY = c1418wx.f14959d;
            c6244jY.f16204E = false;
            c6244jY.f16205F = false;
            c6244jY.f16211L.f16245i = false;
            c6244jY.m10084t(4);
        }
        c1418wx.f14959d.m10088x(true);
        this.f16193b.m10126e(EnumC7382Bi0.ON_START);
        C6244jY c6244jY2 = c1418wx.f14959d;
        c6244jY2.f16204E = false;
        c6244jY2.f16205F = false;
        c6244jY2.f16211L.f16245i = false;
        c6244jY2.m10084t(5);
    }

    @Override // android.app.Activity
    public final void onStateNotSaved() {
        this.f16192a.m18336g();
    }

    @Override // android.app.Activity
    public void onStop() {
        super.onStop();
        this.f16196e = true;
        while (m10033f(m10034e())) {
        }
        C6244jY c6244jY = ((C1418WX) this.f16192a.f27505b).f14959d;
        c6244jY.f16205F = true;
        c6244jY.f16211L.f16245i = true;
        c6244jY.m10084t(4);
        this.f16193b.m10126e(EnumC7382Bi0.ON_STOP);
    }

    @Override // android.app.Activity, android.view.LayoutInflater.Factory
    public final View onCreateView(String str, Context context, AttributeSet attributeSet) {
        View viewOnCreateView = ((C1418WX) this.f16192a.f27505b).f14959d.f16218f.onCreateView(null, str, context, attributeSet);
        return viewOnCreateView == null ? super.onCreateView(str, context, attributeSet) : viewOnCreateView;
    }
}
