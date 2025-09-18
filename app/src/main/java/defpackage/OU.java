package defpackage;

import android.content.Context;
import android.media.UnsupportedSchemeException;
import android.os.Build;
import com.facebook.react.views.drawer.ReactDrawerLayoutManager;
import com.facebook.react.views.image.ReactImageManager;
import com.facebook.react.views.modal.ReactModalHostManager;
import com.facebook.react.views.scroll.ReactScrollViewManager;
import com.facebook.react.views.swiperefresh.SwipeRefreshLayoutManager;
import com.facebook.react.views.switchview.ReactSwitchManager;
import com.facebook.react.views.text.ReactRawTextManager;
import com.facebook.react.views.text.ReactTextViewManager;
import com.facebook.react.views.text.frescosupport.FrescoBasedReactTextInlineImageViewManager;
import com.facebook.react.views.textinput.ReactTextInputManager;
import com.facebook.react.views.view.ReactViewManager;
import com.google.android.gms.tasks.Task;
import com.google.firebase.FirebaseCommonRegistrar;
import com.google.firebase.installations.FirebaseInstallationsRegistrar;
import com.google.firebase.perf.FirebasePerfRegistrar;
import com.google.firebase.sessions.FirebaseSessionsRegistrar;
import com.huawei.hms.adapter.internal.AvailableCode;
import java.io.IOException;
import java.util.UUID;
import javax.inject.Provider;

/* loaded from: classes.dex */
public final /* synthetic */ class OU implements InterfaceC8224yi0, InterfaceC1571Tx0, InterfaceC0940Lv, InterfaceC5441k61, InterfaceC8207yc1, FQ, InterfaceC6290oZ, S50, Provider {
    public final /* synthetic */ int a;

    public /* synthetic */ OU(int i) {
        this.a = i;
    }

    @Override // defpackage.InterfaceC8224yi0
    public String a(Context context) {
        switch (this.a) {
            case 0:
                return context.getPackageManager().hasSystemFeature("android.hardware.type.television") ? "tv" : context.getPackageManager().hasSystemFeature("android.hardware.type.watch") ? "watch" : context.getPackageManager().hasSystemFeature("android.hardware.type.automotive") ? "auto" : (Build.VERSION.SDK_INT < 26 || !context.getPackageManager().hasSystemFeature("android.hardware.type.embedded")) ? "" : "embedded";
            default:
                String installerPackageName = context.getPackageManager().getInstallerPackageName(context.getPackageName());
                return installerPackageName != null ? FirebaseCommonRegistrar.a(installerPackageName) : "";
        }
    }

    @Override // defpackage.InterfaceC8207yc1
    public Object apply(Object obj) {
        switch (this.a) {
            case 14:
                EA0 ea0 = (EA0) obj;
                ea0.getClass();
                try {
                    int iC = ea0.c(null);
                    byte[] bArr = new byte[iC];
                    C6162nu c6162nu = new C6162nu(bArr, iC);
                    ea0.d(c6162nu);
                    if (iC - c6162nu.d == 0) {
                        return bArr;
                    }
                    throw new IllegalStateException("Did not write as much data as expected.");
                } catch (IOException e) {
                    throw new RuntimeException("Serializing " + EA0.class.getName() + " to a byte array threw an IOException (should never happen).", e);
                }
            default:
                E30 e30 = (E30) obj;
                e30.f();
                return P70.u(AbstractC6949s10.b(e30.I.b, new C0681Im0(23)));
        }
    }

    @Override // defpackage.S50
    public boolean c(int i, int i2, int i3, int i4, int i5) {
        return false;
    }

    @Override // defpackage.InterfaceC0940Lv
    public Object g(C1241Pr0 c1241Pr0) {
        switch (this.a) {
            case 3:
                return FirebaseInstallationsRegistrar.lambda$getComponents$0(c1241Pr0);
            case 4:
                return FirebasePerfRegistrar.providesFirebasePerformance(c1241Pr0);
            case 5:
            case 6:
            case 7:
            default:
                return FirebaseSessionsRegistrar.getComponents$lambda$5(c1241Pr0);
            case 8:
                return FirebaseSessionsRegistrar.getComponents$lambda$0(c1241Pr0);
            case 9:
                return FirebaseSessionsRegistrar.getComponents$lambda$1(c1241Pr0);
            case 10:
                return FirebaseSessionsRegistrar.getComponents$lambda$2(c1241Pr0);
            case 11:
                return FirebaseSessionsRegistrar.getComponents$lambda$3(c1241Pr0);
            case 12:
                return FirebaseSessionsRegistrar.getComponents$lambda$4(c1241Pr0);
        }
    }

    @Override // javax.inject.Provider
    public Object get() {
        switch (this.a) {
            case 19:
                return new ReactDrawerLayoutManager();
            case 20:
                return new ReactScrollViewManager();
            case 21:
                return new ReactSwitchManager();
            case 22:
                return new SwipeRefreshLayoutManager();
            case 23:
                return new FrescoBasedReactTextInlineImageViewManager();
            case 24:
                return new ReactImageManager();
            case 25:
                return new ReactModalHostManager();
            case 26:
                return new ReactRawTextManager();
            case 27:
                return new ReactTextInputManager();
            case AvailableCode.APP_IS_BACKGROUND_OR_LOCKED /* 28 */:
                return new ReactTextViewManager();
            default:
                return new ReactViewManager();
        }
    }

    @Override // defpackage.FQ
    public HQ k(UUID uuid) throws C1443Sg1 {
        try {
            try {
                return new VY(uuid);
            } catch (UnsupportedSchemeException e) {
                throw new C1443Sg1(1, e);
            } catch (Exception e2) {
                throw new C1443Sg1(2, e2);
            }
        } catch (C1443Sg1 unused) {
            AbstractC6789rA1.d("Failed to instantiate a FrameworkMediaDrm for uuid: " + uuid + ".");
            return new TE(13);
        }
    }

    @Override // defpackage.InterfaceC1571Tx0
    public void onFailure(Exception exc) {
    }

    @Override // defpackage.InterfaceC5441k61
    public Task then(Object obj) {
        switch (this.a) {
            case 5:
                break;
            case 6:
                break;
            default:
                break;
        }
        return AbstractC3782fU1.e(null);
    }
}
