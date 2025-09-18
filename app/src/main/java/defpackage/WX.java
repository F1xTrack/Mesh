package defpackage;

import android.view.View;
import android.view.Window;
import androidx.activity.a;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.l;

/* loaded from: classes.dex */
public final class WX extends ZX implements InterfaceC1259Px0, InterfaceC4062gy0, InterfaceC1883Xx0, InterfaceC1961Yx0, InterfaceC2001Zk1, InterfaceC0870Kx0, InterfaceC2060a3, InterfaceC6088nV0, InterfaceC5905mY, InterfaceC0381Eq0 {
    public final /* synthetic */ l e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WX(l lVar) {
        super(lVar);
        this.e = lVar;
    }

    @Override // defpackage.InterfaceC0381Eq0
    public final void addMenuProvider(InterfaceC1940Yq0 interfaceC1940Yq0) {
        this.e.addMenuProvider(interfaceC1940Yq0);
    }

    @Override // defpackage.InterfaceC1259Px0
    public final void addOnConfigurationChangedListener(InterfaceC6556py interfaceC6556py) {
        this.e.addOnConfigurationChangedListener(interfaceC6556py);
    }

    @Override // defpackage.InterfaceC1883Xx0
    public final void addOnMultiWindowModeChangedListener(InterfaceC6556py interfaceC6556py) {
        this.e.addOnMultiWindowModeChangedListener(interfaceC6556py);
    }

    @Override // defpackage.InterfaceC1961Yx0
    public final void addOnPictureInPictureModeChangedListener(InterfaceC6556py interfaceC6556py) {
        this.e.addOnPictureInPictureModeChangedListener(interfaceC6556py);
    }

    @Override // defpackage.InterfaceC4062gy0
    public final void addOnTrimMemoryListener(InterfaceC6556py interfaceC6556py) {
        this.e.addOnTrimMemoryListener(interfaceC6556py);
    }

    @Override // defpackage.YX
    public final View b(int i) {
        return this.e.findViewById(i);
    }

    @Override // defpackage.YX
    public final boolean c() {
        Window window = this.e.getWindow();
        return (window == null || window.peekDecorView() == null) ? false : true;
    }

    @Override // defpackage.InterfaceC2060a3
    public final Z2 getActivityResultRegistry() {
        return this.e.getActivityResultRegistry();
    }

    @Override // defpackage.InterfaceC0903Li0
    public final AbstractC0357Ei0 getLifecycle() {
        return this.e.b;
    }

    @Override // defpackage.InterfaceC0870Kx0
    public final a getOnBackPressedDispatcher() {
        return this.e.getOnBackPressedDispatcher();
    }

    @Override // defpackage.InterfaceC6088nV0
    public final C5706lV0 getSavedStateRegistry() {
        return this.e.getSavedStateRegistry();
    }

    @Override // defpackage.InterfaceC2001Zk1
    public final C1923Yk1 getViewModelStore() {
        return this.e.getViewModelStore();
    }

    @Override // defpackage.InterfaceC0381Eq0
    public final void removeMenuProvider(InterfaceC1940Yq0 interfaceC1940Yq0) {
        this.e.removeMenuProvider(interfaceC1940Yq0);
    }

    @Override // defpackage.InterfaceC1259Px0
    public final void removeOnConfigurationChangedListener(InterfaceC6556py interfaceC6556py) {
        this.e.removeOnConfigurationChangedListener(interfaceC6556py);
    }

    @Override // defpackage.InterfaceC1883Xx0
    public final void removeOnMultiWindowModeChangedListener(InterfaceC6556py interfaceC6556py) {
        this.e.removeOnMultiWindowModeChangedListener(interfaceC6556py);
    }

    @Override // defpackage.InterfaceC1961Yx0
    public final void removeOnPictureInPictureModeChangedListener(InterfaceC6556py interfaceC6556py) {
        this.e.removeOnPictureInPictureModeChangedListener(interfaceC6556py);
    }

    @Override // defpackage.InterfaceC4062gy0
    public final void removeOnTrimMemoryListener(InterfaceC6556py interfaceC6556py) {
        this.e.removeOnTrimMemoryListener(interfaceC6556py);
    }

    @Override // defpackage.InterfaceC5905mY
    public final void a(Fragment fragment) {
    }
}
