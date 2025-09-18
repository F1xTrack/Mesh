package p000;

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

    /* renamed from: f */
    public final MainActivity f3681f;

    /* renamed from: g */
    public CJ0 f3682g;

    /* renamed from: h */
    public final ArrayList f3683h;

    /* renamed from: i */
    public final ArrayList f3684i;

    /* renamed from: j */
    public final C7119x8 f3685j;

    /* renamed from: k */
    public final F71 f3686k;

    /* renamed from: l */
    public final F71 f3687l;

    public GJ0(MainActivity mainActivity, C6938uG c6938uG) {
        super((AbstractActivityC11909zJ0) mainActivity, (String) null);
        this.f3681f = mainActivity;
        this.f3682g = c6938uG;
        F71 f71 = C6617pR.f40074b;
        List listM7145a = S02.m7145a();
        ArrayList arrayList = new ArrayList();
        Iterator it = listM7145a.iterator();
        while (it.hasNext()) {
            List listMo18086d = ((InterfaceC11866yz0) it.next()).mo18086d(this.f3681f);
            O90.m5967e(listMo18086d, "createReactActivityLifecycleListeners(...)");
            AbstractC0246Du.m1920m(arrayList, listMo18086d);
        }
        this.f3683h = arrayList;
        F71 f712 = C6617pR.f40074b;
        List listM7145a2 = S02.m7145a();
        ArrayList arrayList2 = new ArrayList();
        Iterator it2 = listM7145a2.iterator();
        while (it2.hasNext()) {
            List listMo18087f = ((InterfaceC11866yz0) it2.next()).mo18087f();
            O90.m5967e(listMo18087f, "createReactActivityHandlers(...)");
            AbstractC0246Du.m1920m(arrayList2, listMo18087f);
        }
        this.f3684i = arrayList2;
        this.f3685j = new C7119x8();
        this.f3686k = AbstractC0705LB.m4915b(new DJ0(this, 1));
        this.f3687l = AbstractC0705LB.m4915b(new DJ0(this, 0));
    }

    /* renamed from: a */
    public final Object m3026a(String str) throws NoSuchMethodException, SecurityException {
        C7119x8 c7119x8 = this.f3685j;
        Method declaredMethod = (Method) c7119x8.getOrDefault(str, null);
        if (declaredMethod == null) {
            declaredMethod = CJ0.class.getDeclaredMethod(str, null);
            declaredMethod.setAccessible(true);
            c7119x8.put(str, declaredMethod);
        }
        return declaredMethod.invoke(this.f3682g, null);
    }

    /* renamed from: b */
    public final void m3027b(String str, Class[] clsArr, Object[] objArr) throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        C7119x8 c7119x8 = this.f3685j;
        Method declaredMethod = (Method) c7119x8.getOrDefault(str, null);
        if (declaredMethod == null) {
            declaredMethod = CJ0.class.getDeclaredMethod(str, (Class[]) Arrays.copyOf(clsArr, clsArr.length));
            declaredMethod.setAccessible(true);
            c7119x8.put(str, declaredMethod);
        }
        declaredMethod.invoke(this.f3682g, Arrays.copyOf(objArr, objArr.length));
    }

    @Override // p000.CJ0
    public final Bundle composeLaunchOptions() {
        return (Bundle) m3026a("composeLaunchOptions");
    }

    @Override // p000.CJ0
    public final ReactRootView createRootView() {
        return (ReactRootView) m3026a("createRootView");
    }

    @Override // p000.CJ0
    public final Context getContext() {
        return (Context) m3026a("getContext");
    }

    @Override // p000.CJ0
    public final Bundle getLaunchOptions() {
        return (Bundle) m3026a("getLaunchOptions");
    }

    @Override // p000.CJ0
    public final String getMainComponentName() {
        return this.f3682g.getMainComponentName();
    }

    @Override // p000.CJ0
    public final Activity getPlainActivity() {
        return (Activity) m3026a("getPlainActivity");
    }

    @Override // p000.CJ0
    public final VJ0 getReactDelegate() {
        return (VJ0) m3026a("getReactDelegate");
    }

    @Override // p000.CJ0
    public final CK0 getReactHost() {
        return (CK0) this.f3687l.getValue();
    }

    @Override // p000.CJ0
    public final QK0 getReactInstanceManager() {
        QK0 reactInstanceManager = this.f3682g.getReactInstanceManager();
        O90.m5967e(reactInstanceManager, "getReactInstanceManager(...)");
        return reactInstanceManager;
    }

    @Override // p000.CJ0
    public final PL0 getReactNativeHost() {
        return (PL0) this.f3686k.getValue();
    }

    @Override // p000.CJ0
    public final boolean isFabricEnabled() {
        return ((Boolean) m3026a("isFabricEnabled")).booleanValue();
    }

    @Override // p000.CJ0
    public final void loadApp(String str) throws IllegalAccessException, NoSuchFieldException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        ArrayList arrayList = this.f3684i;
        ViewGroup viewGroup = (ViewGroup) AbstractC9639hY0.m18829h(AbstractC9639hY0.m18834m(AbstractC7167xu.m25992t(arrayList), new EJ0(this, 1)));
        ArrayList arrayList2 = this.f3683h;
        if (viewGroup == null) {
            if (AbstractC9639hY0.m18829h(AbstractC9639hY0.m18834m(AbstractC7167xu.m25992t(arrayList), new EJ0(this, 0))) != null) {
                throw new ClassCastException();
            }
            m3027b("loadApp", new Class[]{String.class}, new String[]{str});
            Iterator it = arrayList2.iterator();
            while (it.hasNext()) {
                ((C9716i81) it.next()).getClass();
            }
            return;
        }
        Field declaredField = CJ0.class.getDeclaredField("e");
        declaredField.setAccessible(true);
        Object obj = declaredField.get(this.f3682g);
        O90.m5966d(obj, "null cannot be cast to non-null type com.facebook.react.ReactDelegate");
        VJ0 vj0 = (VJ0) obj;
        vj0.m8395c(str);
        ReactRootView reactRootView = ReactFeatureFlags.enableBridgelessArchitecture ? (ReactRootView) ((ViewGroup) ((AtomicReference) vj0.f12518g.f11173a).get()) : vj0.f12513b;
        ViewParent parent = reactRootView != null ? reactRootView.getParent() : null;
        ViewGroup viewGroup2 = parent instanceof ViewGroup ? (ViewGroup) parent : null;
        if (viewGroup2 != null) {
            viewGroup2.removeView(reactRootView);
        }
        viewGroup.addView(reactRootView, -1);
        this.f3681f.setContentView(viewGroup);
        Iterator it2 = arrayList2.iterator();
        while (it2.hasNext()) {
            ((C9716i81) it2.next()).getClass();
        }
    }

    @Override // p000.CJ0
    public final void onActivityResult(int i, int i2, Intent intent) {
        if (ReactFeatureFlags.enableBridgelessArchitecture || this.f3682g.getReactInstanceManager().m6636f() != null) {
            this.f3682g.onActivityResult(i, i2, intent);
        } else {
            this.f3682g.getReactInstanceManager().m6632a(new FJ0(this, i, i2, intent));
        }
    }

    @Override // p000.CJ0
    public final boolean onBackPressed() {
        boolean z;
        ArrayList arrayList = this.f3683h;
        ArrayList arrayList2 = new ArrayList(AbstractC7293zu.m26586k(arrayList));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ((C9716i81) it.next()).getClass();
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
        return z || this.f3682g.onBackPressed();
    }

    @Override // p000.CJ0
    public final void onConfigurationChanged(Configuration configuration) {
        this.f3682g.onConfigurationChanged(configuration);
    }

    @Override // p000.CJ0
    public final void onCreate(Bundle bundle) throws IllegalAccessException, NoSuchFieldException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        VJ0 bj0;
        int i;
        CJ0 cj0 = (CJ0) AbstractC9639hY0.m18829h(AbstractC9639hY0.m18834m(AbstractC7167xu.m25992t(this.f3684i), new EJ0(this, 2)));
        MainActivity mainActivity = this.f3681f;
        if (cj0 == null || cj0.equals(this)) {
            Bundle bundleComposeLaunchOptions = composeLaunchOptions();
            if (ReactFeatureFlags.enableBridgelessArchitecture) {
                Activity plainActivity = getPlainActivity();
                CK0 reactHost = getReactHost();
                this.f3682g.getMainComponentName();
                bj0 = new VJ0(plainActivity, reactHost, bundleComposeLaunchOptions);
            } else {
                Activity plainActivity2 = getPlainActivity();
                PL0 reactNativeHost = getReactNativeHost();
                this.f3682g.getMainComponentName();
                bj0 = new BJ0(bundleComposeLaunchOptions, this, plainActivity2, reactNativeHost);
            }
            Field declaredField = CJ0.class.getDeclaredField("e");
            declaredField.setAccessible(true);
            declaredField.set(this.f3682g, bj0);
            if (this.f3682g.getMainComponentName() != null) {
                loadApp(this.f3682g.getMainComponentName());
            }
        } else {
            Field declaredField2 = AbstractActivityC11909zJ0.class.getDeclaredField("g");
            declaredField2.setAccessible(true);
            Field declaredField3 = Field.class.getDeclaredField("accessFlags");
            declaredField3.setAccessible(true);
            declaredField3.setInt(declaredField2, declaredField2.getModifiers() & (-17));
            declaredField2.set(mainActivity, cj0);
            this.f3682g = cj0;
            m3027b("onCreate", new Class[]{Bundle.class}, new Bundle[]{bundle});
        }
        Iterator it = this.f3683h.iterator();
        while (it.hasNext()) {
            ((C9716i81) it.next()).getClass();
            O90.m5968f(mainActivity, "activity");
            String string = mainActivity.getString(R.string.expo_system_ui_user_interface_style);
            O90.m5967e(string, "getString(...)");
            String lowerCase = string.toLowerCase(Locale.ROOT);
            O90.m5967e(lowerCase, "toLowerCase(...)");
            int iHashCode = lowerCase.hashCode();
            if (iHashCode != 0) {
                if (iHashCode != 3075958) {
                    if (iHashCode != 102970646) {
                        if (iHashCode == 1673671211 && lowerCase.equals("automatic")) {
                            i = Build.VERSION.SDK_INT < 28 ? 3 : -1;
                            AbstractC6928u6.m25108l(i);
                        }
                    } else if (lowerCase.equals("light")) {
                        i = 1;
                        AbstractC6928u6.m25108l(i);
                    }
                    O90.m5968f("Invalid user interface style: \"" + lowerCase + "\"", "m");
                } else if (lowerCase.equals("dark")) {
                    i = 2;
                    AbstractC6928u6.m25108l(i);
                } else {
                    O90.m5968f("Invalid user interface style: \"" + lowerCase + "\"", "m");
                }
            } else if (lowerCase.equals("")) {
                i = 1;
                AbstractC6928u6.m25108l(i);
            } else {
                O90.m5968f("Invalid user interface style: \"" + lowerCase + "\"", "m");
            }
        }
    }

    @Override // p000.CJ0
    public final void onDestroy() throws NoSuchMethodException, SecurityException {
        Iterator it = this.f3683h.iterator();
        while (it.hasNext()) {
            ((C9716i81) it.next()).getClass();
        }
        m3026a("onDestroy");
    }

    @Override // p000.CJ0
    public final boolean onKeyDown(int i, KeyEvent keyEvent) {
        boolean z;
        ArrayList arrayList = this.f3684i;
        ArrayList arrayList2 = new ArrayList(AbstractC7293zu.m26586k(arrayList));
        Iterator it = arrayList.iterator();
        if (it.hasNext()) {
            throw AbstractC7222ym.m26227d(it);
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
        return z || this.f3682g.onKeyDown(i, keyEvent);
    }

    @Override // p000.CJ0
    public final boolean onKeyLongPress(int i, KeyEvent keyEvent) {
        boolean z;
        ArrayList arrayList = this.f3684i;
        ArrayList arrayList2 = new ArrayList(AbstractC7293zu.m26586k(arrayList));
        Iterator it = arrayList.iterator();
        if (it.hasNext()) {
            throw AbstractC7222ym.m26227d(it);
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
        return z || this.f3682g.onKeyLongPress(i, keyEvent);
    }

    @Override // p000.CJ0
    public final boolean onKeyUp(int i, KeyEvent keyEvent) {
        boolean z;
        ArrayList arrayList = this.f3684i;
        ArrayList arrayList2 = new ArrayList(AbstractC7293zu.m26586k(arrayList));
        Iterator it = arrayList.iterator();
        if (it.hasNext()) {
            throw AbstractC7222ym.m26227d(it);
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
        return z || this.f3682g.onKeyUp(i, keyEvent);
    }

    @Override // p000.CJ0
    public final boolean onNewIntent(Intent intent) {
        boolean z;
        ArrayList arrayList = this.f3683h;
        ArrayList arrayList2 = new ArrayList(AbstractC7293zu.m26586k(arrayList));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ((C9716i81) it.next()).getClass();
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
        return z || this.f3682g.onNewIntent(intent);
    }

    @Override // p000.CJ0
    public final void onPause() throws NoSuchMethodException, SecurityException {
        Iterator it = this.f3683h.iterator();
        while (it.hasNext()) {
            ((C9716i81) it.next()).getClass();
        }
        m3026a("onPause");
    }

    @Override // p000.CJ0
    public final void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        this.f3682g.onRequestPermissionsResult(i, strArr, iArr);
    }

    @Override // p000.CJ0
    public final void onResume() throws NoSuchMethodException, SecurityException {
        m3026a("onResume");
        Iterator it = this.f3683h.iterator();
        while (it.hasNext()) {
            ((C9716i81) it.next()).getClass();
        }
    }

    @Override // p000.CJ0
    public final void onWindowFocusChanged(boolean z) {
        this.f3682g.onWindowFocusChanged(z);
    }

    @Override // p000.CJ0
    public final void requestPermissions(String[] strArr, int i, QA0 qa0) {
        this.f3682g.requestPermissions(strArr, i, qa0);
    }
}
