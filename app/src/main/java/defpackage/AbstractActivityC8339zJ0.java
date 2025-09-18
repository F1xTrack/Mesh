package defpackage;

import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.res.Configuration;
import android.os.Bundle;
import android.view.KeyEvent;
import java.lang.reflect.InvocationTargetException;
import ru.mes.dnevnik.MainActivity;

/* renamed from: zJ0 */
/* loaded from: classes.dex */
public abstract class AbstractActivityC8339zJ0 extends AbstractActivityC4281i6 implements InterfaceC8136yF, PA0 {
    public final CJ0 g;

    public AbstractActivityC8339zJ0() {
        MainActivity mainActivity = (MainActivity) this;
        this.g = new GJ0(mainActivity, new C7378uG(mainActivity, "diary_native"));
    }

    @Override // defpackage.InterfaceC8136yF
    public final void a() {
        super.onBackPressed();
    }

    public final void k(String[] strArr, int i, QA0 qa0) {
        this.g.requestPermissions(strArr, i, qa0);
    }

    @Override // androidx.fragment.app.l, defpackage.AbstractActivityC0629Hv, android.app.Activity
    public final void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        this.g.onActivityResult(i, i2, intent);
    }

    @Override // defpackage.AbstractActivityC0629Hv, android.app.Activity
    public final void onBackPressed() {
        if (this.g.onBackPressed()) {
            return;
        }
        super.onBackPressed();
    }

    @Override // defpackage.AbstractActivityC4281i6, defpackage.AbstractActivityC0629Hv, android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) throws IllegalAccessException, NoSuchFieldException, NoSuchMethodException, PackageManager.NameNotFoundException, SecurityException, IllegalArgumentException, InvocationTargetException {
        super.onConfigurationChanged(configuration);
        this.g.onConfigurationChanged(configuration);
    }

    @Override // androidx.fragment.app.l, defpackage.AbstractActivityC0629Hv, defpackage.AbstractActivityC0551Gv, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.g.onCreate(bundle);
    }

    @Override // defpackage.AbstractActivityC4281i6, androidx.fragment.app.l, android.app.Activity
    public final void onDestroy() {
        super.onDestroy();
        this.g.onDestroy();
    }

    @Override // defpackage.AbstractActivityC4281i6, android.app.Activity, android.view.KeyEvent.Callback
    public final boolean onKeyDown(int i, KeyEvent keyEvent) {
        return this.g.onKeyDown(i, keyEvent) || super.onKeyDown(i, keyEvent);
    }

    @Override // android.app.Activity, android.view.KeyEvent.Callback
    public final boolean onKeyLongPress(int i, KeyEvent keyEvent) {
        return this.g.onKeyLongPress(i, keyEvent) || super.onKeyLongPress(i, keyEvent);
    }

    @Override // android.app.Activity, android.view.KeyEvent.Callback
    public final boolean onKeyUp(int i, KeyEvent keyEvent) {
        return this.g.onKeyUp(i, keyEvent) || super.onKeyUp(i, keyEvent);
    }

    @Override // defpackage.AbstractActivityC0629Hv, android.app.Activity
    public void onNewIntent(Intent intent) {
        if (this.g.onNewIntent(intent)) {
            return;
        }
        super.onNewIntent(intent);
    }

    @Override // androidx.fragment.app.l, android.app.Activity
    public final void onPause() {
        super.onPause();
        this.g.onPause();
    }

    @Override // androidx.fragment.app.l, defpackage.AbstractActivityC0629Hv, android.app.Activity
    public final void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        super.onRequestPermissionsResult(i, strArr, iArr);
        this.g.onRequestPermissionsResult(i, strArr, iArr);
    }

    @Override // androidx.fragment.app.l, android.app.Activity
    public final void onResume() {
        super.onResume();
        this.g.onResume();
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public final void onWindowFocusChanged(boolean z) {
        super.onWindowFocusChanged(z);
        this.g.onWindowFocusChanged(z);
    }
}
