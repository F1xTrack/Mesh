package p000;

import android.view.View;
import android.view.Window;
import androidx.activity.C1690a;
import androidx.fragment.app.AbstractActivityC1730l;
import androidx.fragment.app.Fragment;

/* renamed from: WX */
/* loaded from: classes.dex */
public final class C1418WX extends AbstractC1607ZX implements InterfaceC8140Px0, InterfaceC9563gy0, InterfaceC8556Xx0, InterfaceC8608Yx0, InterfaceC8635Zk1, InterfaceC7880Kx0, InterfaceC1640a3, InterfaceC10401nV0, InterfaceC6433mY, InterfaceC7554Eq0 {

    /* renamed from: e */
    public final /* synthetic */ AbstractActivityC1730l f13247e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1418WX(AbstractActivityC1730l abstractActivityC1730l) {
        super(abstractActivityC1730l);
        this.f13247e = abstractActivityC1730l;
    }

    @Override // p000.InterfaceC7554Eq0
    public final void addMenuProvider(InterfaceC8594Yq0 interfaceC8594Yq0) {
        this.f13247e.addMenuProvider(interfaceC8594Yq0);
    }

    @Override // p000.InterfaceC8140Px0
    public final void addOnConfigurationChangedListener(InterfaceC6650py interfaceC6650py) {
        this.f13247e.addOnConfigurationChangedListener(interfaceC6650py);
    }

    @Override // p000.InterfaceC8556Xx0
    public final void addOnMultiWindowModeChangedListener(InterfaceC6650py interfaceC6650py) {
        this.f13247e.addOnMultiWindowModeChangedListener(interfaceC6650py);
    }

    @Override // p000.InterfaceC8608Yx0
    public final void addOnPictureInPictureModeChangedListener(InterfaceC6650py interfaceC6650py) {
        this.f13247e.addOnPictureInPictureModeChangedListener(interfaceC6650py);
    }

    @Override // p000.InterfaceC9563gy0
    public final void addOnTrimMemoryListener(InterfaceC6650py interfaceC6650py) {
        this.f13247e.addOnTrimMemoryListener(interfaceC6650py);
    }

    @Override // p000.AbstractC1544YX
    /* renamed from: b */
    public final View mo2122b(int i) {
        return this.f13247e.findViewById(i);
    }

    @Override // p000.AbstractC1544YX
    /* renamed from: c */
    public final boolean mo2123c() {
        Window window = this.f13247e.getWindow();
        return (window == null || window.peekDecorView() == null) ? false : true;
    }

    @Override // p000.InterfaceC1640a3
    public final AbstractC1576Z2 getActivityResultRegistry() {
        return this.f13247e.getActivityResultRegistry();
    }

    @Override // p000.InterfaceC7902Li0
    public final AbstractC7538Ei0 getLifecycle() {
        return this.f13247e.f16193b;
    }

    @Override // p000.InterfaceC7880Kx0
    public final C1690a getOnBackPressedDispatcher() {
        return this.f13247e.getOnBackPressedDispatcher();
    }

    @Override // p000.InterfaceC10401nV0
    public final C10145lV0 getSavedStateRegistry() {
        return this.f13247e.getSavedStateRegistry();
    }

    @Override // p000.InterfaceC8635Zk1
    public final C8583Yk1 getViewModelStore() {
        return this.f13247e.getViewModelStore();
    }

    @Override // p000.InterfaceC7554Eq0
    public final void removeMenuProvider(InterfaceC8594Yq0 interfaceC8594Yq0) {
        this.f13247e.removeMenuProvider(interfaceC8594Yq0);
    }

    @Override // p000.InterfaceC8140Px0
    public final void removeOnConfigurationChangedListener(InterfaceC6650py interfaceC6650py) {
        this.f13247e.removeOnConfigurationChangedListener(interfaceC6650py);
    }

    @Override // p000.InterfaceC8556Xx0
    public final void removeOnMultiWindowModeChangedListener(InterfaceC6650py interfaceC6650py) {
        this.f13247e.removeOnMultiWindowModeChangedListener(interfaceC6650py);
    }

    @Override // p000.InterfaceC8608Yx0
    public final void removeOnPictureInPictureModeChangedListener(InterfaceC6650py interfaceC6650py) {
        this.f13247e.removeOnPictureInPictureModeChangedListener(interfaceC6650py);
    }

    @Override // p000.InterfaceC9563gy0
    public final void removeOnTrimMemoryListener(InterfaceC6650py interfaceC6650py) {
        this.f13247e.removeOnTrimMemoryListener(interfaceC6650py);
    }

    @Override // p000.InterfaceC6433mY
    /* renamed from: a */
    public final void mo8804a(Fragment fragment) {
    }
}
