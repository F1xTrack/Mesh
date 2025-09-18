package p000;

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
import java.io.IOException;
import java.util.UUID;
import javax.inject.Provider;

/* renamed from: OU */
/* loaded from: classes.dex */
public final /* synthetic */ class C0912OU implements InterfaceC11832yi0, InterfaceC8348Tx0, InterfaceC0750Lv, InterfaceC9968k61, InterfaceC11821yc1, InterfaceC0342FQ, InterfaceC6560oZ, S50, Provider {

    /* renamed from: a */
    public final /* synthetic */ int f8457a;

    public /* synthetic */ C0912OU(int i) {
        this.f8457a = i;
    }

    @Override // p000.InterfaceC11832yi0
    /* renamed from: a */
    public String mo6077a(Context context) {
        switch (this.f8457a) {
            case 0:
                return context.getPackageManager().hasSystemFeature("android.hardware.type.television") ? "tv" : context.getPackageManager().hasSystemFeature("android.hardware.type.watch") ? "watch" : context.getPackageManager().hasSystemFeature("android.hardware.type.automotive") ? "auto" : (Build.VERSION.SDK_INT < 26 || !context.getPackageManager().hasSystemFeature("android.hardware.type.embedded")) ? "" : "embedded";
            default:
                String installerPackageName = context.getPackageManager().getInstallerPackageName(context.getPackageName());
                return installerPackageName != null ? FirebaseCommonRegistrar.m11294a(installerPackageName) : "";
        }
    }

    @Override // p000.InterfaceC11821yc1
    public Object apply(Object obj) {
        switch (this.f8457a) {
            case 14:
                EA0 ea0 = (EA0) obj;
                ea0.getClass();
                try {
                    int iMo4101c = ea0.mo4101c(null);
                    byte[] bArr = new byte[iMo4101c];
                    C6518nu c6518nu = new C6518nu(bArr, iMo4101c);
                    ea0.mo4102d(c6518nu);
                    if (iMo4101c - c6518nu.f38602d == 0) {
                        return bArr;
                    }
                    throw new IllegalStateException("Did not write as much data as expected.");
                } catch (IOException e) {
                    throw new RuntimeException("Serializing " + EA0.class.getName() + " to a byte array threw an IOException (should never happen).", e);
                }
            default:
                E30 e30 = (E30) obj;
                e30.m1999f();
                return P70.m6234u(AbstractC10978s10.m24577b(e30.f2401I.f10322b, new C7754Im0(23)));
        }
    }

    @Override // p000.S50
    /* renamed from: c */
    public boolean mo4001c(int i, int i2, int i3, int i4, int i5) {
        return false;
    }

    @Override // p000.InterfaceC0750Lv
    /* renamed from: g */
    public Object mo390g(C8128Pr0 c8128Pr0) {
        switch (this.f8457a) {
            case 3:
                return FirebaseInstallationsRegistrar.lambda$getComponents$0(c8128Pr0);
            case 4:
                return FirebasePerfRegistrar.providesFirebasePerformance(c8128Pr0);
            case 5:
            case 6:
            case 7:
            default:
                return FirebaseSessionsRegistrar.getComponents$lambda$5(c8128Pr0);
            case 8:
                return FirebaseSessionsRegistrar.getComponents$lambda$0(c8128Pr0);
            case 9:
                return FirebaseSessionsRegistrar.getComponents$lambda$1(c8128Pr0);
            case 10:
                return FirebaseSessionsRegistrar.getComponents$lambda$2(c8128Pr0);
            case 11:
                return FirebaseSessionsRegistrar.getComponents$lambda$3(c8128Pr0);
            case 12:
                return FirebaseSessionsRegistrar.getComponents$lambda$4(c8128Pr0);
        }
    }

    @Override // javax.inject.Provider
    public Object get() {
        switch (this.f8457a) {
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

    @Override // p000.InterfaceC0342FQ
    /* renamed from: k */
    public InterfaceC0468HQ mo2631k(UUID uuid) throws C8263Sg1 {
        try {
            try {
                return new C1356VY(uuid);
            } catch (UnsupportedSchemeException e) {
                throw new C8263Sg1(1, e);
            } catch (Exception e2) {
                throw new C8263Sg1(2, e2);
            }
        } catch (C8263Sg1 unused) {
            AbstractC10872rA1.m24171d("Failed to instantiate a FrameworkMediaDrm for uuid: " + uuid + ".");
            return new C1210TE(13);
        }
    }

    @Override // p000.InterfaceC8348Tx0
    public void onFailure(Exception exc) {
    }

    @Override // p000.InterfaceC9968k61
    public Task then(Object obj) {
        switch (this.f8457a) {
            case 5:
                break;
            case 6:
                break;
            default:
                break;
        }
        return AbstractC9376fU1.m18244e(null);
    }
}
