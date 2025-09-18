package p000;

import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.res.Configuration;
import android.os.Bundle;
import android.view.KeyEvent;
import java.lang.reflect.InvocationTargetException;
import ru.mes.dnevnik.MainActivity;

/* renamed from: zJ0 */
/* loaded from: classes.dex */
public abstract class AbstractActivityC11909zJ0 extends AbstractActivityC4221i6 implements InterfaceC7189yF, PA0 {

    /* renamed from: g */
    public final CJ0 f46786g;

    public AbstractActivityC11909zJ0() {
        MainActivity mainActivity = (MainActivity) this;
        this.f46786g = new GJ0(mainActivity, new C6938uG(mainActivity, "diary_native"));
    }

    @Override // p000.InterfaceC7189yF
    /* renamed from: a */
    public final void mo5330a() {
        super.onBackPressed();
    }

    /* renamed from: k */
    public final void m26369k(String[] strArr, int i, QA0 qa0) {
        this.f46786g.requestPermissions(strArr, i, qa0);
    }

    @Override // androidx.fragment.app.AbstractActivityC1730l, p000.AbstractActivityC0499Hv, android.app.Activity
    public final void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        this.f46786g.onActivityResult(i, i2, intent);
    }

    @Override // p000.AbstractActivityC0499Hv, android.app.Activity
    public final void onBackPressed() {
        if (this.f46786g.onBackPressed()) {
            return;
        }
        super.onBackPressed();
    }

    @Override // p000.AbstractActivityC4221i6, p000.AbstractActivityC0499Hv, android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) throws IllegalAccessException, NoSuchFieldException, NoSuchMethodException, PackageManager.NameNotFoundException, SecurityException, IllegalArgumentException, InvocationTargetException {
        super.onConfigurationChanged(configuration);
        this.f46786g.onConfigurationChanged(configuration);
    }

    @Override // androidx.fragment.app.AbstractActivityC1730l, p000.AbstractActivityC0499Hv, p000.AbstractActivityC0436Gv, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f46786g.onCreate(bundle);
    }

    @Override // p000.AbstractActivityC4221i6, androidx.fragment.app.AbstractActivityC1730l, android.app.Activity
    public final void onDestroy() {
        super.onDestroy();
        this.f46786g.onDestroy();
    }

    @Override // p000.AbstractActivityC4221i6, android.app.Activity, android.view.KeyEvent.Callback
    public final boolean onKeyDown(int i, KeyEvent keyEvent) {
        return this.f46786g.onKeyDown(i, keyEvent) || super.onKeyDown(i, keyEvent);
    }

    @Override // android.app.Activity, android.view.KeyEvent.Callback
    public final boolean onKeyLongPress(int i, KeyEvent keyEvent) {
        return this.f46786g.onKeyLongPress(i, keyEvent) || super.onKeyLongPress(i, keyEvent);
    }

    @Override // android.app.Activity, android.view.KeyEvent.Callback
    public final boolean onKeyUp(int i, KeyEvent keyEvent) {
        return this.f46786g.onKeyUp(i, keyEvent) || super.onKeyUp(i, keyEvent);
    }

    @Override // p000.AbstractActivityC0499Hv, android.app.Activity
    public void onNewIntent(Intent intent) {
        if (this.f46786g.onNewIntent(intent)) {
            return;
        }
        super.onNewIntent(intent);
    }

    @Override // androidx.fragment.app.AbstractActivityC1730l, android.app.Activity
    public final void onPause() {
        super.onPause();
        this.f46786g.onPause();
    }

    @Override // androidx.fragment.app.AbstractActivityC1730l, p000.AbstractActivityC0499Hv, android.app.Activity
    public final void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        super.onRequestPermissionsResult(i, strArr, iArr);
        this.f46786g.onRequestPermissionsResult(i, strArr, iArr);
    }

    @Override // androidx.fragment.app.AbstractActivityC1730l, android.app.Activity
    public final void onResume() {
        super.onResume();
        this.f46786g.onResume();
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public final void onWindowFocusChanged(boolean z) {
        super.onWindowFocusChanged(z);
        this.f46786g.onWindowFocusChanged(z);
    }
}
