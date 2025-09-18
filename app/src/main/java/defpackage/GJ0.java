package defpackage;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Build;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.ViewGroup;
import android.view.ViewParent;
import com.facebook.react.ReactRootView;
import com.facebook.react.config.ReactFeatureFlags;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.atomic.AtomicReference;
import ru.mes.dnevnik.MainActivity;
import ru.mes.dnevnik.R;

/* loaded from: classes2.dex */
public final class GJ0 extends CJ0 {
    public final MainActivity f;
    public CJ0 g;
    public final ArrayList h;
    public final ArrayList i;
    public final C7925x8 j;
    public final F71 k;
    public final F71 l;

    public GJ0(MainActivity mainActivity, C7378uG c7378uG) {
        super((AbstractActivityC8339zJ0) mainActivity, (String) null);
        this.f = mainActivity;
        this.g = c7378uG;
        F71 f71 = C6457pR.b;
        List listA = S02.a();
        ArrayList arrayList = new ArrayList();
        Iterator it = listA.iterator();
        while (it.hasNext()) {
            List listD = ((InterfaceC8275yz0) it.next()).d(this.f);
            O90.e(listD, "createReactActivityLifecycleListeners(...)");
            AbstractC0314Du.m(arrayList, listD);
        }
        this.h = arrayList;
        F71 f712 = C6457pR.b;
        List listA2 = S02.a();
        ArrayList arrayList2 = new ArrayList();
        Iterator it2 = listA2.iterator();
        while (it2.hasNext()) {
            List listF = ((InterfaceC8275yz0) it2.next()).f();
            O90.e(listF, "createReactActivityHandlers(...)");
            AbstractC0314Du.m(arrayList2, listF);
        }
        this.i = arrayList2;
        this.j = new C7925x8();
        this.k = LB.b(new DJ0(this, 1));
        this.l = LB.b(new DJ0(this, 0));
    }

    public final Object a(String str) throws NoSuchMethodException, SecurityException {
        C7925x8 c7925x8 = this.j;
        Method declaredMethod = (Method) c7925x8.getOrDefault(str, null);
        if (declaredMethod == null) {
            declaredMethod = CJ0.class.getDeclaredMethod(str, null);
            declaredMethod.setAccessible(true);
            c7925x8.put(str, declaredMethod);
        }
        return declaredMethod.invoke(this.g, null);
    }

    public final void b(String str, Class[] clsArr, Object[] objArr) throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        C7925x8 c7925x8 = this.j;
        Method declaredMethod = (Method) c7925x8.getOrDefault(str, null);
        if (declaredMethod == null) {
            declaredMethod = CJ0.class.getDeclaredMethod(str, (Class[]) Arrays.copyOf(clsArr, clsArr.length));
            declaredMethod.setAccessible(true);
            c7925x8.put(str, declaredMethod);
        }
        declaredMethod.invoke(this.g, Arrays.copyOf(objArr, objArr.length));
    }

    @Override // defpackage.CJ0
    public final Bundle composeLaunchOptions() {
        return (Bundle) a("composeLaunchOptions");
    }

    @Override // defpackage.CJ0
    public final ReactRootView createRootView() {
        return (ReactRootView) a("createRootView");
    }

    @Override // defpackage.CJ0
    public final Context getContext() {
        return (Context) a("getContext");
    }

    @Override // defpackage.CJ0
    public final Bundle getLaunchOptions() {
        return (Bundle) a("getLaunchOptions");
    }

    @Override // defpackage.CJ0
    public final String getMainComponentName() {
        return this.g.getMainComponentName();
    }

    @Override // defpackage.CJ0
    public final Activity getPlainActivity() {
        return (Activity) a("getPlainActivity");
    }

    @Override // defpackage.CJ0
    public final VJ0 getReactDelegate() {
        return (VJ0) a("getReactDelegate");
    }

    @Override // defpackage.CJ0
    public final CK0 getReactHost() {
        return (CK0) this.l.getValue();
    }

    @Override // defpackage.CJ0
    public final QK0 getReactInstanceManager() {
        QK0 reactInstanceManager = this.g.getReactInstanceManager();
        O90.e(reactInstanceManager, "getReactInstanceManager(...)");
        return reactInstanceManager;
    }

    @Override // defpackage.CJ0
    public final PL0 getReactNativeHost() {
        return (PL0) this.k.getValue();
    }

    @Override // defpackage.CJ0
    public final boolean isFabricEnabled() {
        return ((Boolean) a("isFabricEnabled")).booleanValue();
    }

    @Override // defpackage.CJ0
    public final void loadApp(String str) throws IllegalAccessException, NoSuchFieldException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        ArrayList arrayList = this.i;
        ViewGroup viewGroup = (ViewGroup) AbstractC4175hY0.h(AbstractC4175hY0.m(AbstractC8069xu.t(arrayList), new EJ0(this, 1)));
        ArrayList arrayList2 = this.h;
        if (viewGroup == null) {
            if (AbstractC4175hY0.h(AbstractC4175hY0.m(AbstractC8069xu.t(arrayList), new EJ0(this, 0))) != null) {
                throw new ClassCastException();
            }
            b("loadApp", new Class[]{String.class}, new String[]{str});
            Iterator it = arrayList2.iterator();
            while (it.hasNext()) {
                ((C4289i81) it.next()).getClass();
            }
            return;
        }
        Field declaredField = CJ0.class.getDeclaredField("e");
        declaredField.setAccessible(true);
        Object obj = declaredField.get(this.g);
        O90.d(obj, "null cannot be cast to non-null type com.facebook.react.ReactDelegate");
        VJ0 vj0 = (VJ0) obj;
        vj0.c(str);
        ReactRootView reactRootView = ReactFeatureFlags.enableBridgelessArchitecture ? (ReactRootView) ((ViewGroup) ((AtomicReference) vj0.g.a).get()) : vj0.b;
        ViewParent parent = reactRootView != null ? reactRootView.getParent() : null;
        ViewGroup viewGroup2 = parent instanceof ViewGroup ? (ViewGroup) parent : null;
        if (viewGroup2 != null) {
            viewGroup2.removeView(reactRootView);
        }
        viewGroup.addView(reactRootView, -1);
        this.f.setContentView(viewGroup);
        Iterator it2 = arrayList2.iterator();
        while (it2.hasNext()) {
            ((C4289i81) it2.next()).getClass();
        }
    }

    @Override // defpackage.CJ0
    public final void onActivityResult(int i, int i2, Intent intent) {
        if (ReactFeatureFlags.enableBridgelessArchitecture || this.g.getReactInstanceManager().f() != null) {
            this.g.onActivityResult(i, i2, intent);
        } else {
            this.g.getReactInstanceManager().a(new FJ0(this, i, i2, intent));
        }
    }

    @Override // defpackage.CJ0
    public final boolean onBackPressed() {
        boolean z;
        ArrayList arrayList = this.h;
        ArrayList arrayList2 = new ArrayList(AbstractC8449zu.k(arrayList));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ((C4289i81) it.next()).getClass();
            arrayList2.add(Boolean.FALSE);
        }
        Iterator it2 = arrayList2.iterator();
        loop1: while (true) {
            z = false;
            while (it2.hasNext()) {
                boolean zBooleanValue = ((Boolean) it2.next()).booleanValue();
                if (z || zBooleanValue) {
                    z = true;
                }
            }
        }
        return z || this.g.onBackPressed();
    }

    @Override // defpackage.CJ0
    public final void onConfigurationChanged(Configuration configuration) {
        this.g.onConfigurationChanged(configuration);
    }

    @Override // defpackage.CJ0
    public final void onCreate(Bundle bundle) throws IllegalAccessException, NoSuchFieldException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        VJ0 bj0;
        int i;
        CJ0 cj0 = (CJ0) AbstractC4175hY0.h(AbstractC4175hY0.m(AbstractC8069xu.t(this.i), new EJ0(this, 2)));
        MainActivity mainActivity = this.f;
        if (cj0 == null || cj0.equals(this)) {
            Bundle bundleComposeLaunchOptions = composeLaunchOptions();
            if (ReactFeatureFlags.enableBridgelessArchitecture) {
                Activity plainActivity = getPlainActivity();
                CK0 reactHost = getReactHost();
                this.g.getMainComponentName();
                bj0 = new VJ0(plainActivity, reactHost, bundleComposeLaunchOptions);
            } else {
                Activity plainActivity2 = getPlainActivity();
                PL0 reactNativeHost = getReactNativeHost();
                this.g.getMainComponentName();
                bj0 = new BJ0(bundleComposeLaunchOptions, this, plainActivity2, reactNativeHost);
            }
            Field declaredField = CJ0.class.getDeclaredField("e");
            declaredField.setAccessible(true);
            declaredField.set(this.g, bj0);
            if (this.g.getMainComponentName() != null) {
                loadApp(this.g.getMainComponentName());
            }
        } else {
            Field declaredField2 = AbstractActivityC8339zJ0.class.getDeclaredField("g");
            declaredField2.setAccessible(true);
            Field declaredField3 = Field.class.getDeclaredField("accessFlags");
            declaredField3.setAccessible(true);
            declaredField3.setInt(declaredField2, declaredField2.getModifiers() & (-17));
            declaredField2.set(mainActivity, cj0);
            this.g = cj0;
            b("onCreate", new Class[]{Bundle.class}, new Bundle[]{bundle});
        }
        Iterator it = this.h.iterator();
        while (it.hasNext()) {
            ((C4289i81) it.next()).getClass();
            O90.f(mainActivity, "activity");
            String string = mainActivity.getString(R.string.expo_system_ui_user_interface_style);
            O90.e(string, "getString(...)");
            String lowerCase = string.toLowerCase(Locale.ROOT);
            O90.e(lowerCase, "toLowerCase(...)");
            int iHashCode = lowerCase.hashCode();
            if (iHashCode != 0) {
                if (iHashCode != 3075958) {
                    if (iHashCode != 102970646) {
                        if (iHashCode == 1673671211 && lowerCase.equals("automatic")) {
                            i = Build.VERSION.SDK_INT < 28 ? 3 : -1;
                            AbstractC7348u6.l(i);
                        }
                    } else if (lowerCase.equals("light")) {
                        i = 1;
                        AbstractC7348u6.l(i);
                    }
                    O90.f("Invalid user interface style: \"" + lowerCase + "\"", "m");
                } else if (lowerCase.equals("dark")) {
                    i = 2;
                    AbstractC7348u6.l(i);
                } else {
                    O90.f("Invalid user interface style: \"" + lowerCase + "\"", "m");
                }
            } else if (lowerCase.equals("")) {
                i = 1;
                AbstractC7348u6.l(i);
            } else {
                O90.f("Invalid user interface style: \"" + lowerCase + "\"", "m");
            }
        }
    }

    @Override // defpackage.CJ0
    public final void onDestroy() throws NoSuchMethodException, SecurityException {
        Iterator it = this.h.iterator();
        while (it.hasNext()) {
            ((C4289i81) it.next()).getClass();
        }
        a("onDestroy");
    }

    @Override // defpackage.CJ0
    public final boolean onKeyDown(int i, KeyEvent keyEvent) {
        boolean z;
        ArrayList arrayList = this.i;
        ArrayList arrayList2 = new ArrayList(AbstractC8449zu.k(arrayList));
        Iterator it = arrayList.iterator();
        if (it.hasNext()) {
            throw AbstractC8235ym.d(it);
        }
        Iterator it2 = arrayList2.iterator();
        loop0: while (true) {
            z = false;
            while (it2.hasNext()) {
                boolean zBooleanValue = ((Boolean) it2.next()).booleanValue();
                if (z || zBooleanValue) {
                    z = true;
                }
            }
        }
        return z || this.g.onKeyDown(i, keyEvent);
    }

    @Override // defpackage.CJ0
    public final boolean onKeyLongPress(int i, KeyEvent keyEvent) {
        boolean z;
        ArrayList arrayList = this.i;
        ArrayList arrayList2 = new ArrayList(AbstractC8449zu.k(arrayList));
        Iterator it = arrayList.iterator();
        if (it.hasNext()) {
            throw AbstractC8235ym.d(it);
        }
        Iterator it2 = arrayList2.iterator();
        loop0: while (true) {
            z = false;
            while (it2.hasNext()) {
                boolean zBooleanValue = ((Boolean) it2.next()).booleanValue();
                if (z || zBooleanValue) {
                    z = true;
                }
            }
        }
        return z || this.g.onKeyLongPress(i, keyEvent);
    }

    @Override // defpackage.CJ0
    public final boolean onKeyUp(int i, KeyEvent keyEvent) {
        boolean z;
        ArrayList arrayList = this.i;
        ArrayList arrayList2 = new ArrayList(AbstractC8449zu.k(arrayList));
        Iterator it = arrayList.iterator();
        if (it.hasNext()) {
            throw AbstractC8235ym.d(it);
        }
        Iterator it2 = arrayList2.iterator();
        loop0: while (true) {
            z = false;
            while (it2.hasNext()) {
                boolean zBooleanValue = ((Boolean) it2.next()).booleanValue();
                if (z || zBooleanValue) {
                    z = true;
                }
            }
        }
        return z || this.g.onKeyUp(i, keyEvent);
    }

    @Override // defpackage.CJ0
    public final boolean onNewIntent(Intent intent) {
        boolean z;
        ArrayList arrayList = this.h;
        ArrayList arrayList2 = new ArrayList(AbstractC8449zu.k(arrayList));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ((C4289i81) it.next()).getClass();
            arrayList2.add(Boolean.FALSE);
        }
        Iterator it2 = arrayList2.iterator();
        loop1: while (true) {
            z = false;
            while (it2.hasNext()) {
                boolean zBooleanValue = ((Boolean) it2.next()).booleanValue();
                if (z || zBooleanValue) {
                    z = true;
                }
            }
        }
        return z || this.g.onNewIntent(intent);
    }

    @Override // defpackage.CJ0
    public final void onPause() throws NoSuchMethodException, SecurityException {
        Iterator it = this.h.iterator();
        while (it.hasNext()) {
            ((C4289i81) it.next()).getClass();
        }
        a("onPause");
    }

    @Override // defpackage.CJ0
    public final void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        this.g.onRequestPermissionsResult(i, strArr, iArr);
    }

    @Override // defpackage.CJ0
    public final void onResume() throws NoSuchMethodException, SecurityException {
        a("onResume");
        Iterator it = this.h.iterator();
        while (it.hasNext()) {
            ((C4289i81) it.next()).getClass();
        }
    }

    @Override // defpackage.CJ0
    public final void onWindowFocusChanged(boolean z) {
        this.g.onWindowFocusChanged(z);
    }

    @Override // defpackage.CJ0
    public final void requestPermissions(String[] strArr, int i, QA0 qa0) {
        this.g.requestPermissions(strArr, i, qa0);
    }
}
