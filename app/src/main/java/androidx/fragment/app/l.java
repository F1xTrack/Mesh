package androidx.fragment.app;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.MenuItem;
import android.view.View;
import androidx.fragment.app.l;
import defpackage.AbstractActivityC0629Hv;
import defpackage.AbstractC6706qk0;
import defpackage.C3866fw1;
import defpackage.C5332jY;
import defpackage.C7692vv;
import defpackage.C7882wv;
import defpackage.D2;
import defpackage.EnumC0123Bi0;
import defpackage.EnumC0201Ci0;
import defpackage.InterfaceC6556py;
import defpackage.WX;
import java.io.FileDescriptor;
import java.io.PrintWriter;

/* loaded from: classes.dex */
public abstract class l extends AbstractActivityC0629Hv implements D2 {
    public boolean c;
    public boolean d;
    public final C3866fw1 a = new C3866fw1(16, new WX(this));
    public final androidx.lifecycle.a b = new androidx.lifecycle.a(this);
    public boolean e = true;

    public l() {
        getSavedStateRegistry().c("android:support:lifecycle", new C7692vv(1, this));
        final int i = 0;
        addOnConfigurationChangedListener(new InterfaceC6556py(this) { // from class: VX
            public final /* synthetic */ l b;

            {
                this.b = this;
            }

            @Override // defpackage.InterfaceC6556py
            public final void b(Object obj) {
                switch (i) {
                    case 0:
                        this.b.a.g();
                        break;
                    default:
                        this.b.a.g();
                        break;
                }
            }
        });
        final int i2 = 1;
        addOnNewIntentListener(new InterfaceC6556py(this) { // from class: VX
            public final /* synthetic */ l b;

            {
                this.b = this;
            }

            @Override // defpackage.InterfaceC6556py
            public final void b(Object obj) {
                switch (i2) {
                    case 0:
                        this.b.a.g();
                        break;
                    default:
                        this.b.a.g();
                        break;
                }
            }
        });
        addOnContextAvailableListener(new C7882wv(this, 1));
    }

    public static boolean f(o oVar) {
        EnumC0201Ci0 enumC0201Ci0 = EnumC0201Ci0.c;
        boolean zF = false;
        for (Fragment fragment : oVar.c.f()) {
            if (fragment != null) {
                if (fragment.getHost() != null) {
                    zF |= f(fragment.getChildFragmentManager());
                }
                t tVar = fragment.mViewLifecycleOwner;
                EnumC0201Ci0 enumC0201Ci02 = EnumC0201Ci0.d;
                if (tVar != null) {
                    tVar.b();
                    if (tVar.e.c.compareTo(enumC0201Ci02) >= 0) {
                        androidx.lifecycle.a aVar = fragment.mViewLifecycleOwner.e;
                        aVar.d("setCurrentState");
                        aVar.f(enumC0201Ci0);
                        zF = true;
                    }
                }
                if (fragment.mLifecycleRegistry.c.compareTo(enumC0201Ci02) >= 0) {
                    androidx.lifecycle.a aVar2 = fragment.mLifecycleRegistry;
                    aVar2.d("setCurrentState");
                    aVar2.f(enumC0201Ci0);
                    zF = true;
                }
            }
        }
        return zF;
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
            printWriter.print(this.c);
            printWriter.print(" mResumed=");
            printWriter.print(this.d);
            printWriter.print(" mStopped=");
            printWriter.print(this.e);
            if (getApplication() != null) {
                AbstractC6706qk0.a(this).b(str2, fileDescriptor, printWriter, strArr);
            }
            ((WX) this.a.b).d.u(str, fileDescriptor, printWriter, strArr);
        }
    }

    public final C5332jY e() {
        return ((WX) this.a.b).d;
    }

    @Override // defpackage.AbstractActivityC0629Hv, android.app.Activity
    public void onActivityResult(int i, int i2, Intent intent) {
        this.a.g();
        super.onActivityResult(i, i2, intent);
    }

    @Override // defpackage.AbstractActivityC0629Hv, defpackage.AbstractActivityC0551Gv, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.b.e(EnumC0123Bi0.ON_CREATE);
        C5332jY c5332jY = ((WX) this.a.b).d;
        c5332jY.E = false;
        c5332jY.F = false;
        c5332jY.L.i = false;
        c5332jY.t(1);
    }

    @Override // android.app.Activity, android.view.LayoutInflater.Factory2
    public final View onCreateView(View view, String str, Context context, AttributeSet attributeSet) {
        View viewOnCreateView = ((WX) this.a.b).d.f.onCreateView(view, str, context, attributeSet);
        return viewOnCreateView == null ? super.onCreateView(view, str, context, attributeSet) : viewOnCreateView;
    }

    @Override // android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        ((WX) this.a.b).d.k();
        this.b.e(EnumC0123Bi0.ON_DESTROY);
    }

    @Override // defpackage.AbstractActivityC0629Hv, android.app.Activity, android.view.Window.Callback
    public boolean onMenuItemSelected(int i, MenuItem menuItem) {
        if (super.onMenuItemSelected(i, menuItem)) {
            return true;
        }
        if (i == 6) {
            return ((WX) this.a.b).d.i(menuItem);
        }
        return false;
    }

    @Override // android.app.Activity
    public void onPause() {
        super.onPause();
        this.d = false;
        ((WX) this.a.b).d.t(5);
        this.b.e(EnumC0123Bi0.ON_PAUSE);
    }

    @Override // android.app.Activity
    public void onPostResume() {
        super.onPostResume();
        this.b.e(EnumC0123Bi0.ON_RESUME);
        C5332jY c5332jY = ((WX) this.a.b).d;
        c5332jY.E = false;
        c5332jY.F = false;
        c5332jY.L.i = false;
        c5332jY.t(7);
    }

    @Override // defpackage.AbstractActivityC0629Hv, android.app.Activity
    public void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        this.a.g();
        super.onRequestPermissionsResult(i, strArr, iArr);
    }

    @Override // android.app.Activity
    public void onResume() {
        C3866fw1 c3866fw1 = this.a;
        c3866fw1.g();
        super.onResume();
        this.d = true;
        ((WX) c3866fw1.b).d.x(true);
    }

    @Override // android.app.Activity
    public void onStart() {
        C3866fw1 c3866fw1 = this.a;
        c3866fw1.g();
        super.onStart();
        this.e = false;
        boolean z = this.c;
        WX wx = (WX) c3866fw1.b;
        if (!z) {
            this.c = true;
            C5332jY c5332jY = wx.d;
            c5332jY.E = false;
            c5332jY.F = false;
            c5332jY.L.i = false;
            c5332jY.t(4);
        }
        wx.d.x(true);
        this.b.e(EnumC0123Bi0.ON_START);
        C5332jY c5332jY2 = wx.d;
        c5332jY2.E = false;
        c5332jY2.F = false;
        c5332jY2.L.i = false;
        c5332jY2.t(5);
    }

    @Override // android.app.Activity
    public final void onStateNotSaved() {
        this.a.g();
    }

    @Override // android.app.Activity
    public void onStop() {
        super.onStop();
        this.e = true;
        while (f(e())) {
        }
        C5332jY c5332jY = ((WX) this.a.b).d;
        c5332jY.F = true;
        c5332jY.L.i = true;
        c5332jY.t(4);
        this.b.e(EnumC0123Bi0.ON_STOP);
    }

    @Override // android.app.Activity, android.view.LayoutInflater.Factory
    public final View onCreateView(String str, Context context, AttributeSet attributeSet) {
        View viewOnCreateView = ((WX) this.a.b).d.f.onCreateView(null, str, context, attributeSet);
        return viewOnCreateView == null ? super.onCreateView(str, context, attributeSet) : viewOnCreateView;
    }
}
